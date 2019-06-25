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

import vn.gt.dao.danhmuc.NoSuchDmPassportTypeException;
import vn.gt.dao.danhmuc.model.DmPassportType;
import vn.gt.dao.danhmuc.model.impl.DmPassportTypeImpl;
import vn.gt.dao.danhmuc.model.impl.DmPassportTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm passport type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmPassportTypePersistence
 * @see DmPassportTypeUtil
 * @generated
 */
public class DmPassportTypePersistenceImpl extends BasePersistenceImpl<DmPassportType>
	implements DmPassportTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmPassportTypeUtil} to access the dm passport type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmPassportTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PASSPORTTYPECODE =
		new FinderPath(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmPassportTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPassportTypeCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE =
		new FinderPath(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmPassportTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPassportTypeCode", new String[] { String.class.getName() },
			DmPassportTypeModelImpl.PASSPORTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PASSPORTTYPECODE = new FinderPath(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPassportTypeCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmPassportTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmPassportTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm passport type in the entity cache if it is enabled.
	 *
	 * @param dmPassportType the dm passport type
	 */
	public void cacheResult(DmPassportType dmPassportType) {
		EntityCacheUtil.putResult(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeImpl.class, dmPassportType.getPrimaryKey(),
			dmPassportType);

		dmPassportType.resetOriginalValues();
	}

	/**
	 * Caches the dm passport types in the entity cache if it is enabled.
	 *
	 * @param dmPassportTypes the dm passport types
	 */
	public void cacheResult(List<DmPassportType> dmPassportTypes) {
		for (DmPassportType dmPassportType : dmPassportTypes) {
			if (EntityCacheUtil.getResult(
						DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmPassportTypeImpl.class, dmPassportType.getPrimaryKey()) == null) {
				cacheResult(dmPassportType);
			}
			else {
				dmPassportType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm passport types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmPassportTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmPassportTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm passport type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmPassportType dmPassportType) {
		EntityCacheUtil.removeResult(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeImpl.class, dmPassportType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmPassportType> dmPassportTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmPassportType dmPassportType : dmPassportTypes) {
			EntityCacheUtil.removeResult(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmPassportTypeImpl.class, dmPassportType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm passport type with the primary key. Does not add the dm passport type to the database.
	 *
	 * @param id the primary key for the new dm passport type
	 * @return the new dm passport type
	 */
	public DmPassportType create(int id) {
		DmPassportType dmPassportType = new DmPassportTypeImpl();

		dmPassportType.setNew(true);
		dmPassportType.setPrimaryKey(id);

		return dmPassportType;
	}

	/**
	 * Removes the dm passport type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm passport type
	 * @return the dm passport type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPassportType remove(int id)
		throws NoSuchDmPassportTypeException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm passport type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm passport type
	 * @return the dm passport type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPassportType remove(Serializable primaryKey)
		throws NoSuchDmPassportTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmPassportType dmPassportType = (DmPassportType)session.get(DmPassportTypeImpl.class,
					primaryKey);

			if (dmPassportType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmPassportTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmPassportType);
		}
		catch (NoSuchDmPassportTypeException nsee) {
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
	protected DmPassportType removeImpl(DmPassportType dmPassportType)
		throws SystemException {
		dmPassportType = toUnwrappedModel(dmPassportType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmPassportType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmPassportType);

		return dmPassportType;
	}

	@Override
	public DmPassportType updateImpl(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType, boolean merge)
		throws SystemException {
		dmPassportType = toUnwrappedModel(dmPassportType);

		boolean isNew = dmPassportType.isNew();

		DmPassportTypeModelImpl dmPassportTypeModelImpl = (DmPassportTypeModelImpl)dmPassportType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmPassportType, merge);

			dmPassportType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmPassportTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmPassportTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPassportTypeModelImpl.getOriginalPassportTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE,
					args);

				args = new Object[] {
						dmPassportTypeModelImpl.getPassportTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmPassportTypeImpl.class, dmPassportType.getPrimaryKey(),
			dmPassportType);

		return dmPassportType;
	}

	protected DmPassportType toUnwrappedModel(DmPassportType dmPassportType) {
		if (dmPassportType instanceof DmPassportTypeImpl) {
			return dmPassportType;
		}

		DmPassportTypeImpl dmPassportTypeImpl = new DmPassportTypeImpl();

		dmPassportTypeImpl.setNew(dmPassportType.isNew());
		dmPassportTypeImpl.setPrimaryKey(dmPassportType.getPrimaryKey());

		dmPassportTypeImpl.setId(dmPassportType.getId());
		dmPassportTypeImpl.setPassportTypeCode(dmPassportType.getPassportTypeCode());
		dmPassportTypeImpl.setPassportType(dmPassportType.getPassportType());
		dmPassportTypeImpl.setPassportTypeName(dmPassportType.getPassportTypeName());
		dmPassportTypeImpl.setPassportTypeNameVN(dmPassportType.getPassportTypeNameVN());
		dmPassportTypeImpl.setIsDelete(dmPassportType.getIsDelete());
		dmPassportTypeImpl.setMarkedAsDelete(dmPassportType.getMarkedAsDelete());
		dmPassportTypeImpl.setModifiedDate(dmPassportType.getModifiedDate());
		dmPassportTypeImpl.setRequestedDate(dmPassportType.getRequestedDate());
		dmPassportTypeImpl.setSyncVersion(dmPassportType.getSyncVersion());

		return dmPassportTypeImpl;
	}

	/**
	 * Returns the dm passport type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm passport type
	 * @return the dm passport type
	 * @throws com.liferay.portal.NoSuchModelException if a dm passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPassportType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm passport type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPassportTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm passport type
	 * @return the dm passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPassportType findByPrimaryKey(int id)
		throws NoSuchDmPassportTypeException, SystemException {
		DmPassportType dmPassportType = fetchByPrimaryKey(id);

		if (dmPassportType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmPassportTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmPassportType;
	}

	/**
	 * Returns the dm passport type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm passport type
	 * @return the dm passport type, or <code>null</code> if a dm passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPassportType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm passport type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm passport type
	 * @return the dm passport type, or <code>null</code> if a dm passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPassportType fetchByPrimaryKey(int id) throws SystemException {
		DmPassportType dmPassportType = (DmPassportType)EntityCacheUtil.getResult(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmPassportTypeImpl.class, id);

		if (dmPassportType == _nullDmPassportType) {
			return null;
		}

		if (dmPassportType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmPassportType = (DmPassportType)session.get(DmPassportTypeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmPassportType != null) {
					cacheResult(dmPassportType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmPassportTypeImpl.class, id, _nullDmPassportType);
				}

				closeSession(session);
			}
		}

		return dmPassportType;
	}

	/**
	 * Returns all the dm passport types where passportTypeCode = &#63;.
	 *
	 * @param passportTypeCode the passport type code
	 * @return the matching dm passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPassportType> findByPassportTypeCode(String passportTypeCode)
		throws SystemException {
		return findByPassportTypeCode(passportTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm passport types where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passportTypeCode the passport type code
	 * @param start the lower bound of the range of dm passport types
	 * @param end the upper bound of the range of dm passport types (not inclusive)
	 * @return the range of matching dm passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPassportType> findByPassportTypeCode(
		String passportTypeCode, int start, int end) throws SystemException {
		return findByPassportTypeCode(passportTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm passport types where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passportTypeCode the passport type code
	 * @param start the lower bound of the range of dm passport types
	 * @param end the upper bound of the range of dm passport types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPassportType> findByPassportTypeCode(
		String passportTypeCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE;
			finderArgs = new Object[] { passportTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PASSPORTTYPECODE;
			finderArgs = new Object[] {
					passportTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<DmPassportType> list = (List<DmPassportType>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMPASSPORTTYPE_WHERE);

			if (passportTypeCode == null) {
				query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_1);
			}
			else {
				if (passportTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmPassportTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (passportTypeCode != null) {
					qPos.add(passportTypeCode);
				}

				list = (List<DmPassportType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm passport type in the ordered set where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passportTypeCode the passport type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPassportTypeException if a matching dm passport type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPassportType findByPassportTypeCode_First(
		String passportTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmPassportTypeException, SystemException {
		List<DmPassportType> list = findByPassportTypeCode(passportTypeCode, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("passportTypeCode=");
			msg.append(passportTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPassportTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm passport type in the ordered set where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passportTypeCode the passport type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPassportTypeException if a matching dm passport type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPassportType findByPassportTypeCode_Last(String passportTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPassportTypeException, SystemException {
		int count = countByPassportTypeCode(passportTypeCode);

		List<DmPassportType> list = findByPassportTypeCode(passportTypeCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("passportTypeCode=");
			msg.append(passportTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPassportTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm passport types before and after the current dm passport type in the ordered set where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm passport type
	 * @param passportTypeCode the passport type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPassportType[] findByPassportTypeCode_PrevAndNext(int id,
		String passportTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmPassportTypeException, SystemException {
		DmPassportType dmPassportType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPassportType[] array = new DmPassportTypeImpl[3];

			array[0] = getByPassportTypeCode_PrevAndNext(session,
					dmPassportType, passportTypeCode, orderByComparator, true);

			array[1] = dmPassportType;

			array[2] = getByPassportTypeCode_PrevAndNext(session,
					dmPassportType, passportTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPassportType getByPassportTypeCode_PrevAndNext(
		Session session, DmPassportType dmPassportType,
		String passportTypeCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPASSPORTTYPE_WHERE);

		if (passportTypeCode == null) {
			query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_1);
		}
		else {
			if (passportTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_2);
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
			query.append(DmPassportTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (passportTypeCode != null) {
			qPos.add(passportTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmPassportType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPassportType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm passport types.
	 *
	 * @return the dm passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPassportType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm passport types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm passport types
	 * @param end the upper bound of the range of dm passport types (not inclusive)
	 * @return the range of dm passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPassportType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm passport types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm passport types
	 * @param end the upper bound of the range of dm passport types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPassportType> findAll(int start, int end,
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

		List<DmPassportType> list = (List<DmPassportType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMPASSPORTTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMPASSPORTTYPE.concat(DmPassportTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmPassportType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmPassportType>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the dm passport types where passportTypeCode = &#63; from the database.
	 *
	 * @param passportTypeCode the passport type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPassportTypeCode(String passportTypeCode)
		throws SystemException {
		for (DmPassportType dmPassportType : findByPassportTypeCode(
				passportTypeCode)) {
			remove(dmPassportType);
		}
	}

	/**
	 * Removes all the dm passport types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmPassportType dmPassportType : findAll()) {
			remove(dmPassportType);
		}
	}

	/**
	 * Returns the number of dm passport types where passportTypeCode = &#63;.
	 *
	 * @param passportTypeCode the passport type code
	 * @return the number of matching dm passport types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPassportTypeCode(String passportTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { passportTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMPASSPORTTYPE_WHERE);

			if (passportTypeCode == null) {
				query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_1);
			}
			else {
				if (passportTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (passportTypeCode != null) {
					qPos.add(passportTypeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm passport types.
	 *
	 * @return the number of dm passport types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMPASSPORTTYPE);

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
	 * Initializes the dm passport type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmPassportType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmPassportType>> listenersList = new ArrayList<ModelListener<DmPassportType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmPassportType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmPassportTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_DMPASSPORTTYPE = "SELECT dmPassportType FROM DmPassportType dmPassportType";
	private static final String _SQL_SELECT_DMPASSPORTTYPE_WHERE = "SELECT dmPassportType FROM DmPassportType dmPassportType WHERE ";
	private static final String _SQL_COUNT_DMPASSPORTTYPE = "SELECT COUNT(dmPassportType) FROM DmPassportType dmPassportType";
	private static final String _SQL_COUNT_DMPASSPORTTYPE_WHERE = "SELECT COUNT(dmPassportType) FROM DmPassportType dmPassportType WHERE ";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_1 =
		"dmPassportType.passportTypeCode IS NULL";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_2 =
		"dmPassportType.passportTypeCode = ?";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_3 =
		"(dmPassportType.passportTypeCode IS NULL OR dmPassportType.passportTypeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmPassportType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmPassportType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmPassportType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmPassportTypePersistenceImpl.class);
	private static DmPassportType _nullDmPassportType = new DmPassportTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmPassportType> toCacheModel() {
				return _nullDmPassportTypeCacheModel;
			}
		};

	private static CacheModel<DmPassportType> _nullDmPassportTypeCacheModel = new CacheModel<DmPassportType>() {
			public DmPassportType toEntityModel() {
				return _nullDmPassportType;
			}
		};
}