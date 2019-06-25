/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.gt.dao.danhmuc.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException;
import vn.gt.dao.danhmuc.model.DmGoodsType;
import vn.gt.dao.danhmuc.model.impl.DmGoodsTypeImpl;
import vn.gt.dao.danhmuc.model.impl.DmGoodsTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm goods type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGoodsTypePersistence
 * @see DmGoodsTypeUtil
 * @generated
 */
public class DmGoodsTypePersistenceImpl extends BasePersistenceImpl<DmGoodsType>
	implements DmGoodsTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGoodsTypeUtil} to access the dm goods type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGoodsTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSTYPECODE =
		new FinderPath(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeModelImpl.FINDER_CACHE_ENABLED, DmGoodsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGoodsTypeCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE =
		new FinderPath(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeModelImpl.FINDER_CACHE_ENABLED, DmGoodsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGoodsTypeCode",
			new String[] { String.class.getName() },
			DmGoodsTypeModelImpl.GOODSTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSTYPECODE = new FinderPath(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGoodsTypeCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeModelImpl.FINDER_CACHE_ENABLED, DmGoodsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeModelImpl.FINDER_CACHE_ENABLED, DmGoodsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm goods type in the entity cache if it is enabled.
	 *
	 * @param dmGoodsType the dm goods type
	 */
	public void cacheResult(DmGoodsType dmGoodsType) {
		EntityCacheUtil.putResult(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeImpl.class, dmGoodsType.getPrimaryKey(), dmGoodsType);

		dmGoodsType.resetOriginalValues();
	}

	/**
	 * Caches the dm goods types in the entity cache if it is enabled.
	 *
	 * @param dmGoodsTypes the dm goods types
	 */
	public void cacheResult(List<DmGoodsType> dmGoodsTypes) {
		for (DmGoodsType dmGoodsType : dmGoodsTypes) {
			if (EntityCacheUtil.getResult(
						DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmGoodsTypeImpl.class, dmGoodsType.getPrimaryKey()) == null) {
				cacheResult(dmGoodsType);
			}
			else {
				dmGoodsType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm goods types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGoodsTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGoodsTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm goods type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGoodsType dmGoodsType) {
		EntityCacheUtil.removeResult(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeImpl.class, dmGoodsType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmGoodsType> dmGoodsTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGoodsType dmGoodsType : dmGoodsTypes) {
			EntityCacheUtil.removeResult(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmGoodsTypeImpl.class, dmGoodsType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm goods type with the primary key. Does not add the dm goods type to the database.
	 *
	 * @param id the primary key for the new dm goods type
	 * @return the new dm goods type
	 */
	public DmGoodsType create(int id) {
		DmGoodsType dmGoodsType = new DmGoodsTypeImpl();

		dmGoodsType.setNew(true);
		dmGoodsType.setPrimaryKey(id);

		return dmGoodsType;
	}

	/**
	 * Removes the dm goods type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm goods type
	 * @return the dm goods type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoodsType remove(int id)
		throws NoSuchDmGoodsTypeException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm goods type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm goods type
	 * @return the dm goods type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoodsType remove(Serializable primaryKey)
		throws NoSuchDmGoodsTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGoodsType dmGoodsType = (DmGoodsType)session.get(DmGoodsTypeImpl.class,
					primaryKey);

			if (dmGoodsType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGoodsTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGoodsType);
		}
		catch (NoSuchDmGoodsTypeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DmGoodsType removeImpl(DmGoodsType dmGoodsType)
		throws SystemException {
		dmGoodsType = toUnwrappedModel(dmGoodsType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGoodsType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmGoodsType);

		return dmGoodsType;
	}

	@Override
	public DmGoodsType updateImpl(
		vn.gt.dao.danhmuc.model.DmGoodsType dmGoodsType, boolean merge)
		throws SystemException {
		dmGoodsType = toUnwrappedModel(dmGoodsType);

		boolean isNew = dmGoodsType.isNew();

		DmGoodsTypeModelImpl dmGoodsTypeModelImpl = (DmGoodsTypeModelImpl)dmGoodsType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGoodsType, merge);

			dmGoodsType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGoodsTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmGoodsTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGoodsTypeModelImpl.getOriginalGoodsTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE,
					args);

				args = new Object[] { dmGoodsTypeModelImpl.getGoodsTypeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsTypeImpl.class, dmGoodsType.getPrimaryKey(), dmGoodsType);

		return dmGoodsType;
	}

	protected DmGoodsType toUnwrappedModel(DmGoodsType dmGoodsType) {
		if (dmGoodsType instanceof DmGoodsTypeImpl) {
			return dmGoodsType;
		}

		DmGoodsTypeImpl dmGoodsTypeImpl = new DmGoodsTypeImpl();

		dmGoodsTypeImpl.setNew(dmGoodsType.isNew());
		dmGoodsTypeImpl.setPrimaryKey(dmGoodsType.getPrimaryKey());

		dmGoodsTypeImpl.setId(dmGoodsType.getId());
		dmGoodsTypeImpl.setGoodsTypeCode(dmGoodsType.getGoodsTypeCode());
		dmGoodsTypeImpl.setGoodsTypeName(dmGoodsType.getGoodsTypeName());
		dmGoodsTypeImpl.setGoodsTypeNameVN(dmGoodsType.getGoodsTypeNameVN());
		dmGoodsTypeImpl.setGoodsTypeOrder(dmGoodsType.getGoodsTypeOrder());
		dmGoodsTypeImpl.setIsDelete(dmGoodsType.getIsDelete());
		dmGoodsTypeImpl.setMarkedAsDelete(dmGoodsType.getMarkedAsDelete());
		dmGoodsTypeImpl.setModifiedDate(dmGoodsType.getModifiedDate());
		dmGoodsTypeImpl.setRequestedDate(dmGoodsType.getRequestedDate());
		dmGoodsTypeImpl.setSyncVersion(dmGoodsType.getSyncVersion());

		return dmGoodsTypeImpl;
	}

	/**
	 * Returns the dm goods type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm goods type
	 * @return the dm goods type
	 * @throws com.liferay.portal.NoSuchModelException if a dm goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoodsType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm goods type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm goods type
	 * @return the dm goods type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoodsType findByPrimaryKey(int id)
		throws NoSuchDmGoodsTypeException, SystemException {
		DmGoodsType dmGoodsType = fetchByPrimaryKey(id);

		if (dmGoodsType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGoodsTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGoodsType;
	}

	/**
	 * Returns the dm goods type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm goods type
	 * @return the dm goods type, or <code>null</code> if a dm goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoodsType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm goods type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm goods type
	 * @return the dm goods type, or <code>null</code> if a dm goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoodsType fetchByPrimaryKey(int id) throws SystemException {
		DmGoodsType dmGoodsType = (DmGoodsType)EntityCacheUtil.getResult(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmGoodsTypeImpl.class, id);

		if (dmGoodsType == _nullDmGoodsType) {
			return null;
		}

		if (dmGoodsType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGoodsType = (DmGoodsType)session.get(DmGoodsTypeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGoodsType != null) {
					cacheResult(dmGoodsType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmGoodsTypeImpl.class, id, _nullDmGoodsType);
				}

				closeSession(session);
			}
		}

		return dmGoodsType;
	}

	/**
	 * Returns all the dm goods types where goodsTypeCode = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @return the matching dm goods types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoodsType> findByGoodsTypeCode(String goodsTypeCode)
		throws SystemException {
		return findByGoodsTypeCode(goodsTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm goods types where goodsTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsTypeCode the goods type code
	 * @param start the lower bound of the range of dm goods types
	 * @param end the upper bound of the range of dm goods types (not inclusive)
	 * @return the range of matching dm goods types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoodsType> findByGoodsTypeCode(String goodsTypeCode,
		int start, int end) throws SystemException {
		return findByGoodsTypeCode(goodsTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm goods types where goodsTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsTypeCode the goods type code
	 * @param start the lower bound of the range of dm goods types
	 * @param end the upper bound of the range of dm goods types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm goods types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoodsType> findByGoodsTypeCode(String goodsTypeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE;
			finderArgs = new Object[] { goodsTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSTYPECODE;
			finderArgs = new Object[] {
					goodsTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<DmGoodsType> list = (List<DmGoodsType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DMGOODSTYPE_WHERE);

			if (goodsTypeCode == null) {
				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_1);
			}
			else {
				if (goodsTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmGoodsTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (goodsTypeCode != null) {
					qPos.add(goodsTypeCode);
				}

				list = (List<DmGoodsType>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first dm goods type in the ordered set where goodsTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsTypeCode the goods type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm goods type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a matching dm goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoodsType findByGoodsTypeCode_First(String goodsTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmGoodsTypeException, SystemException {
		List<DmGoodsType> list = findByGoodsTypeCode(goodsTypeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsTypeCode=");
			msg.append(goodsTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGoodsTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm goods type in the ordered set where goodsTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsTypeCode the goods type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm goods type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a matching dm goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoodsType findByGoodsTypeCode_Last(String goodsTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmGoodsTypeException, SystemException {
		int count = countByGoodsTypeCode(goodsTypeCode);

		List<DmGoodsType> list = findByGoodsTypeCode(goodsTypeCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsTypeCode=");
			msg.append(goodsTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGoodsTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm goods types before and after the current dm goods type in the ordered set where goodsTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm goods type
	 * @param goodsTypeCode the goods type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm goods type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoodsType[] findByGoodsTypeCode_PrevAndNext(int id,
		String goodsTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmGoodsTypeException, SystemException {
		DmGoodsType dmGoodsType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGoodsType[] array = new DmGoodsTypeImpl[3];

			array[0] = getByGoodsTypeCode_PrevAndNext(session, dmGoodsType,
					goodsTypeCode, orderByComparator, true);

			array[1] = dmGoodsType;

			array[2] = getByGoodsTypeCode_PrevAndNext(session, dmGoodsType,
					goodsTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGoodsType getByGoodsTypeCode_PrevAndNext(Session session,
		DmGoodsType dmGoodsType, String goodsTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGOODSTYPE_WHERE);

		if (goodsTypeCode == null) {
			query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_1);
		}
		else {
			if (goodsTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(DmGoodsTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (goodsTypeCode != null) {
			qPos.add(goodsTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGoodsType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGoodsType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm goods types.
	 *
	 * @return the dm goods types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoodsType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm goods types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm goods types
	 * @param end the upper bound of the range of dm goods types (not inclusive)
	 * @return the range of dm goods types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoodsType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm goods types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm goods types
	 * @param end the upper bound of the range of dm goods types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm goods types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoodsType> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<DmGoodsType> list = (List<DmGoodsType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGOODSTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGOODSTYPE.concat(DmGoodsTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGoodsType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGoodsType>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the dm goods types where goodsTypeCode = &#63; from the database.
	 *
	 * @param goodsTypeCode the goods type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGoodsTypeCode(String goodsTypeCode)
		throws SystemException {
		for (DmGoodsType dmGoodsType : findByGoodsTypeCode(goodsTypeCode)) {
			remove(dmGoodsType);
		}
	}

	/**
	 * Removes all the dm goods types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGoodsType dmGoodsType : findAll()) {
			remove(dmGoodsType);
		}
	}

	/**
	 * Returns the number of dm goods types where goodsTypeCode = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @return the number of matching dm goods types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGoodsTypeCode(String goodsTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { goodsTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GOODSTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGOODSTYPE_WHERE);

			if (goodsTypeCode == null) {
				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_1);
			}
			else {
				if (goodsTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (goodsTypeCode != null) {
					qPos.add(goodsTypeCode);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODSTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm goods types.
	 *
	 * @return the number of dm goods types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGOODSTYPE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the dm goods type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmGoodsType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGoodsType>> listenersList = new ArrayList<ModelListener<DmGoodsType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGoodsType>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DmGoodsTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DmArrivalPurposePersistence.class)
	protected DmArrivalPurposePersistence dmArrivalPurposePersistence;
	@BeanReference(type = DmDataItemPersistence.class)
	protected DmDataItemPersistence dmDataItemPersistence;
	@BeanReference(type = DmDocTypePersistence.class)
	protected DmDocTypePersistence dmDocTypePersistence;
	@BeanReference(type = DmEnterrisePersistence.class)
	protected DmEnterrisePersistence dmEnterrisePersistence;
	@BeanReference(type = DmGoodsPersistence.class)
	protected DmGoodsPersistence dmGoodsPersistence;
	@BeanReference(type = DmGoodsTypePersistence.class)
	protected DmGoodsTypePersistence dmGoodsTypePersistence;
	@BeanReference(type = DmHistoryArrivalPurposePersistence.class)
	protected DmHistoryArrivalPurposePersistence dmHistoryArrivalPurposePersistence;
	@BeanReference(type = DmHistoryDocTypePersistence.class)
	protected DmHistoryDocTypePersistence dmHistoryDocTypePersistence;
	@BeanReference(type = DmHistoryEnterrisePersistence.class)
	protected DmHistoryEnterrisePersistence dmHistoryEnterrisePersistence;
	@BeanReference(type = DmHistoryGoodsPersistence.class)
	protected DmHistoryGoodsPersistence dmHistoryGoodsPersistence;
	@BeanReference(type = DmHistoryGoodsTypePersistence.class)
	protected DmHistoryGoodsTypePersistence dmHistoryGoodsTypePersistence;
	@BeanReference(type = DmHistoryMaritimePersistence.class)
	protected DmHistoryMaritimePersistence dmHistoryMaritimePersistence;
	@BeanReference(type = DmHistoryPackagePersistence.class)
	protected DmHistoryPackagePersistence dmHistoryPackagePersistence;
	@BeanReference(type = DmHistoryPassportTypePersistence.class)
	protected DmHistoryPassportTypePersistence dmHistoryPassportTypePersistence;
	@BeanReference(type = DmHistoryPortPersistence.class)
	protected DmHistoryPortPersistence dmHistoryPortPersistence;
	@BeanReference(type = DmHistoryPortHarbourPersistence.class)
	protected DmHistoryPortHarbourPersistence dmHistoryPortHarbourPersistence;
	@BeanReference(type = DmHistoryPortRegionPersistence.class)
	protected DmHistoryPortRegionPersistence dmHistoryPortRegionPersistence;
	@BeanReference(type = DmHistoryPortWharfPersistence.class)
	protected DmHistoryPortWharfPersistence dmHistoryPortWharfPersistence;
	@BeanReference(type = DmHistoryRankRatingPersistence.class)
	protected DmHistoryRankRatingPersistence dmHistoryRankRatingPersistence;
	@BeanReference(type = DmHistoryRepresentativePersistence.class)
	protected DmHistoryRepresentativePersistence dmHistoryRepresentativePersistence;
	@BeanReference(type = DmHistorySecurityLevelPersistence.class)
	protected DmHistorySecurityLevelPersistence dmHistorySecurityLevelPersistence;
	@BeanReference(type = DmHistoryShipAgencyPersistence.class)
	protected DmHistoryShipAgencyPersistence dmHistoryShipAgencyPersistence;
	@BeanReference(type = DmHistoryShipTypePersistence.class)
	protected DmHistoryShipTypePersistence dmHistoryShipTypePersistence;
	@BeanReference(type = DmHistoryStatePersistence.class)
	protected DmHistoryStatePersistence dmHistoryStatePersistence;
	@BeanReference(type = DmHistoryUnitGeneralPersistence.class)
	protected DmHistoryUnitGeneralPersistence dmHistoryUnitGeneralPersistence;
	@BeanReference(type = DmMaritimePersistence.class)
	protected DmMaritimePersistence dmMaritimePersistence;
	@BeanReference(type = DmPackagePersistence.class)
	protected DmPackagePersistence dmPackagePersistence;
	@BeanReference(type = DmPassportTypePersistence.class)
	protected DmPassportTypePersistence dmPassportTypePersistence;
	@BeanReference(type = DmPortPersistence.class)
	protected DmPortPersistence dmPortPersistence;
	@BeanReference(type = DmPortHarbourPersistence.class)
	protected DmPortHarbourPersistence dmPortHarbourPersistence;
	@BeanReference(type = DmPortRegionPersistence.class)
	protected DmPortRegionPersistence dmPortRegionPersistence;
	@BeanReference(type = DmPortWharfPersistence.class)
	protected DmPortWharfPersistence dmPortWharfPersistence;
	@BeanReference(type = DmRankRatingPersistence.class)
	protected DmRankRatingPersistence dmRankRatingPersistence;
	@BeanReference(type = DmRepresentativePersistence.class)
	protected DmRepresentativePersistence dmRepresentativePersistence;
	@BeanReference(type = DmSecurityLevelPersistence.class)
	protected DmSecurityLevelPersistence dmSecurityLevelPersistence;
	@BeanReference(type = DmShipAgencyPersistence.class)
	protected DmShipAgencyPersistence dmShipAgencyPersistence;
	@BeanReference(type = DmShipTypePersistence.class)
	protected DmShipTypePersistence dmShipTypePersistence;
	@BeanReference(type = DmStatePersistence.class)
	protected DmStatePersistence dmStatePersistence;
	@BeanReference(type = DmSyncCategoryPersistence.class)
	protected DmSyncCategoryPersistence dmSyncCategoryPersistence;
	@BeanReference(type = DmTestN01RequestPersistence.class)
	protected DmTestN01RequestPersistence dmTestN01RequestPersistence;
	@BeanReference(type = DmUnitGeneralPersistence.class)
	protected DmUnitGeneralPersistence dmUnitGeneralPersistence;
	@BeanReference(type = HistoryRmdcShipPersistence.class)
	protected HistoryRmdcShipPersistence historyRmdcShipPersistence;
	@BeanReference(type = HistorySyncVersionPersistence.class)
	protected HistorySyncVersionPersistence historySyncVersionPersistence;
	@BeanReference(type = RmdcShipPersistence.class)
	protected RmdcShipPersistence rmdcShipPersistence;
	@BeanReference(type = ThamSoHeThongPersistence.class)
	protected ThamSoHeThongPersistence thamSoHeThongPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DMGOODSTYPE = "SELECT dmGoodsType FROM DmGoodsType dmGoodsType";
	private static final String _SQL_SELECT_DMGOODSTYPE_WHERE = "SELECT dmGoodsType FROM DmGoodsType dmGoodsType WHERE ";
	private static final String _SQL_COUNT_DMGOODSTYPE = "SELECT COUNT(dmGoodsType) FROM DmGoodsType dmGoodsType";
	private static final String _SQL_COUNT_DMGOODSTYPE_WHERE = "SELECT COUNT(dmGoodsType) FROM DmGoodsType dmGoodsType WHERE ";
	private static final String _FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_1 = "dmGoodsType.goodsTypeCode IS NULL";
	private static final String _FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_2 = "dmGoodsType.goodsTypeCode = ?";
	private static final String _FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_3 = "(dmGoodsType.goodsTypeCode IS NULL OR dmGoodsType.goodsTypeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGoodsType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGoodsType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGoodsType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGoodsTypePersistenceImpl.class);
	private static DmGoodsType _nullDmGoodsType = new DmGoodsTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGoodsType> toCacheModel() {
				return _nullDmGoodsTypeCacheModel;
			}
		};

	private static CacheModel<DmGoodsType> _nullDmGoodsTypeCacheModel = new CacheModel<DmGoodsType>() {
			public DmGoodsType toEntityModel() {
				return _nullDmGoodsType;
			}
		};
}