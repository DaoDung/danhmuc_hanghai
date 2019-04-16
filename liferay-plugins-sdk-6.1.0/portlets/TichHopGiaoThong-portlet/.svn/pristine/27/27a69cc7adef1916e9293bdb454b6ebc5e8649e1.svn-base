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

import vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException;
import vn.gt.dao.danhmuc.model.DmArrivalPurpose;
import vn.gt.dao.danhmuc.model.impl.DmArrivalPurposeImpl;
import vn.gt.dao.danhmuc.model.impl.DmArrivalPurposeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm arrival purpose service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmArrivalPurposePersistence
 * @see DmArrivalPurposeUtil
 * @generated
 */
public class DmArrivalPurposePersistenceImpl extends BasePersistenceImpl<DmArrivalPurpose>
	implements DmArrivalPurposePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmArrivalPurposeUtil} to access the dm arrival purpose persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmArrivalPurposeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PURPOSECODE =
		new FinderPath(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmArrivalPurposeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPurposeCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE =
		new FinderPath(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmArrivalPurposeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPurposeCode",
			new String[] { String.class.getName() },
			DmArrivalPurposeModelImpl.PURPOSECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PURPOSECODE = new FinderPath(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPurposeCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmArrivalPurposeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmArrivalPurposeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm arrival purpose in the entity cache if it is enabled.
	 *
	 * @param dmArrivalPurpose the dm arrival purpose
	 */
	public void cacheResult(DmArrivalPurpose dmArrivalPurpose) {
		EntityCacheUtil.putResult(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeImpl.class, dmArrivalPurpose.getPrimaryKey(),
			dmArrivalPurpose);

		dmArrivalPurpose.resetOriginalValues();
	}

	/**
	 * Caches the dm arrival purposes in the entity cache if it is enabled.
	 *
	 * @param dmArrivalPurposes the dm arrival purposes
	 */
	public void cacheResult(List<DmArrivalPurpose> dmArrivalPurposes) {
		for (DmArrivalPurpose dmArrivalPurpose : dmArrivalPurposes) {
			if (EntityCacheUtil.getResult(
						DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
						DmArrivalPurposeImpl.class,
						dmArrivalPurpose.getPrimaryKey()) == null) {
				cacheResult(dmArrivalPurpose);
			}
			else {
				dmArrivalPurpose.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm arrival purposes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmArrivalPurposeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmArrivalPurposeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm arrival purpose.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmArrivalPurpose dmArrivalPurpose) {
		EntityCacheUtil.removeResult(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeImpl.class, dmArrivalPurpose.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Creates a new dm arrival purpose with the primary key. Does not add the dm arrival purpose to the database.
	 *
	 * @param id the primary key for the new dm arrival purpose
	 * @return the new dm arrival purpose
	 */
	public DmArrivalPurpose create(int id) {
		DmArrivalPurpose dmArrivalPurpose = new DmArrivalPurposeImpl();

		dmArrivalPurpose.setNew(true);
		dmArrivalPurpose.setPrimaryKey(id);

		return dmArrivalPurpose;
	}

	/**
	 * Removes the dm arrival purpose with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm arrival purpose
	 * @return the dm arrival purpose that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmArrivalPurpose remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm arrival purpose with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm arrival purpose
	 * @return the dm arrival purpose that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a dm arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmArrivalPurpose remove(int id)
		throws NoSuchDmArrivalPurposeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmArrivalPurpose dmArrivalPurpose = (DmArrivalPurpose)session.get(DmArrivalPurposeImpl.class,
					Integer.valueOf(id));

			if (dmArrivalPurpose == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmArrivalPurposeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmArrivalPurposePersistence.remove(dmArrivalPurpose);
		}
		catch (NoSuchDmArrivalPurposeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Removes the dm arrival purpose from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmArrivalPurpose the dm arrival purpose
	 * @return the dm arrival purpose that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmArrivalPurpose remove(DmArrivalPurpose dmArrivalPurpose)
		throws SystemException {
		return super.remove(dmArrivalPurpose);
	}

	@Override
	protected DmArrivalPurpose removeImpl(DmArrivalPurpose dmArrivalPurpose)
		throws SystemException {
		dmArrivalPurpose = toUnwrappedModel(dmArrivalPurpose);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmArrivalPurpose);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		EntityCacheUtil.removeResult(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeImpl.class, dmArrivalPurpose.getPrimaryKey());

		return dmArrivalPurpose;
	}

	@Override
	public DmArrivalPurpose updateImpl(
		vn.gt.dao.danhmuc.model.DmArrivalPurpose dmArrivalPurpose, boolean merge)
		throws SystemException {
		dmArrivalPurpose = toUnwrappedModel(dmArrivalPurpose);

		boolean isNew = dmArrivalPurpose.isNew();

		DmArrivalPurposeModelImpl dmArrivalPurposeModelImpl = (DmArrivalPurposeModelImpl)dmArrivalPurpose;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmArrivalPurpose, merge);

			dmArrivalPurpose.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmArrivalPurposeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmArrivalPurposeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmArrivalPurposeModelImpl.getOriginalPurposeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURPOSECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE,
					args);

				args = new Object[] { dmArrivalPurposeModelImpl.getPurposeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURPOSECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmArrivalPurposeImpl.class, dmArrivalPurpose.getPrimaryKey(),
			dmArrivalPurpose);

		return dmArrivalPurpose;
	}

	protected DmArrivalPurpose toUnwrappedModel(
		DmArrivalPurpose dmArrivalPurpose) {
		if (dmArrivalPurpose instanceof DmArrivalPurposeImpl) {
			return dmArrivalPurpose;
		}

		DmArrivalPurposeImpl dmArrivalPurposeImpl = new DmArrivalPurposeImpl();

		dmArrivalPurposeImpl.setNew(dmArrivalPurpose.isNew());
		dmArrivalPurposeImpl.setPrimaryKey(dmArrivalPurpose.getPrimaryKey());

		dmArrivalPurposeImpl.setId(dmArrivalPurpose.getId());
		dmArrivalPurposeImpl.setPurposeCode(dmArrivalPurpose.getPurposeCode());
		dmArrivalPurposeImpl.setPurposeName(dmArrivalPurpose.getPurposeName());
		dmArrivalPurposeImpl.setPurposeNameVN(dmArrivalPurpose.getPurposeNameVN());
		dmArrivalPurposeImpl.setIsDelete(dmArrivalPurpose.getIsDelete());
		dmArrivalPurposeImpl.setMarkedAsDelete(dmArrivalPurpose.getMarkedAsDelete());
		dmArrivalPurposeImpl.setModifiedDate(dmArrivalPurpose.getModifiedDate());
		dmArrivalPurposeImpl.setRequestedDate(dmArrivalPurpose.getRequestedDate());
		dmArrivalPurposeImpl.setSyncVersion(dmArrivalPurpose.getSyncVersion());

		return dmArrivalPurposeImpl;
	}

	/**
	 * Returns the dm arrival purpose with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm arrival purpose
	 * @return the dm arrival purpose
	 * @throws com.liferay.portal.NoSuchModelException if a dm arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmArrivalPurpose findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm arrival purpose with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException} if it could not be found.
	 *
	 * @param id the primary key of the dm arrival purpose
	 * @return the dm arrival purpose
	 * @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a dm arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmArrivalPurpose findByPrimaryKey(int id)
		throws NoSuchDmArrivalPurposeException, SystemException {
		DmArrivalPurpose dmArrivalPurpose = fetchByPrimaryKey(id);

		if (dmArrivalPurpose == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmArrivalPurposeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmArrivalPurpose;
	}

	/**
	 * Returns the dm arrival purpose with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm arrival purpose
	 * @return the dm arrival purpose, or <code>null</code> if a dm arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmArrivalPurpose fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm arrival purpose with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm arrival purpose
	 * @return the dm arrival purpose, or <code>null</code> if a dm arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmArrivalPurpose fetchByPrimaryKey(int id) throws SystemException {
		DmArrivalPurpose dmArrivalPurpose = (DmArrivalPurpose)EntityCacheUtil.getResult(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
				DmArrivalPurposeImpl.class, id);

		if (dmArrivalPurpose == _nullDmArrivalPurpose) {
			return null;
		}

		if (dmArrivalPurpose == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmArrivalPurpose = (DmArrivalPurpose)session.get(DmArrivalPurposeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmArrivalPurpose != null) {
					cacheResult(dmArrivalPurpose);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
						DmArrivalPurposeImpl.class, id, _nullDmArrivalPurpose);
				}

				closeSession(session);
			}
		}

		return dmArrivalPurpose;
	}

	/**
	 * Returns all the dm arrival purposes where purposeCode = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @return the matching dm arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmArrivalPurpose> findByPurposeCode(String purposeCode)
		throws SystemException {
		return findByPurposeCode(purposeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm arrival purposes where purposeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param purposeCode the purpose code
	 * @param start the lower bound of the range of dm arrival purposes
	 * @param end the upper bound of the range of dm arrival purposes (not inclusive)
	 * @return the range of matching dm arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmArrivalPurpose> findByPurposeCode(String purposeCode,
		int start, int end) throws SystemException {
		return findByPurposeCode(purposeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm arrival purposes where purposeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param purposeCode the purpose code
	 * @param start the lower bound of the range of dm arrival purposes
	 * @param end the upper bound of the range of dm arrival purposes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmArrivalPurpose> findByPurposeCode(String purposeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE;
			finderArgs = new Object[] { purposeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PURPOSECODE;
			finderArgs = new Object[] { purposeCode, start, end, orderByComparator };
		}

		List<DmArrivalPurpose> list = (List<DmArrivalPurpose>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMARRIVALPURPOSE_WHERE);

			if (purposeCode == null) {
				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_1);
			}
			else {
				if (purposeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmArrivalPurposeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (purposeCode != null) {
					qPos.add(purposeCode);
				}

				list = (List<DmArrivalPurpose>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm arrival purpose in the ordered set where purposeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param purposeCode the purpose code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm arrival purpose
	 * @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a matching dm arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmArrivalPurpose findByPurposeCode_First(String purposeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmArrivalPurposeException, SystemException {
		List<DmArrivalPurpose> list = findByPurposeCode(purposeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("purposeCode=");
			msg.append(purposeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmArrivalPurposeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm arrival purpose in the ordered set where purposeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param purposeCode the purpose code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm arrival purpose
	 * @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a matching dm arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmArrivalPurpose findByPurposeCode_Last(String purposeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmArrivalPurposeException, SystemException {
		int count = countByPurposeCode(purposeCode);

		List<DmArrivalPurpose> list = findByPurposeCode(purposeCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("purposeCode=");
			msg.append(purposeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmArrivalPurposeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm arrival purposes before and after the current dm arrival purpose in the ordered set where purposeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm arrival purpose
	 * @param purposeCode the purpose code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm arrival purpose
	 * @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a dm arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmArrivalPurpose[] findByPurposeCode_PrevAndNext(int id,
		String purposeCode, OrderByComparator orderByComparator)
		throws NoSuchDmArrivalPurposeException, SystemException {
		DmArrivalPurpose dmArrivalPurpose = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmArrivalPurpose[] array = new DmArrivalPurposeImpl[3];

			array[0] = getByPurposeCode_PrevAndNext(session, dmArrivalPurpose,
					purposeCode, orderByComparator, true);

			array[1] = dmArrivalPurpose;

			array[2] = getByPurposeCode_PrevAndNext(session, dmArrivalPurpose,
					purposeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmArrivalPurpose getByPurposeCode_PrevAndNext(Session session,
		DmArrivalPurpose dmArrivalPurpose, String purposeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMARRIVALPURPOSE_WHERE);

		if (purposeCode == null) {
			query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_1);
		}
		else {
			if (purposeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_2);
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
			query.append(DmArrivalPurposeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (purposeCode != null) {
			qPos.add(purposeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmArrivalPurpose);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmArrivalPurpose> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm arrival purposes.
	 *
	 * @return the dm arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmArrivalPurpose> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm arrival purposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm arrival purposes
	 * @param end the upper bound of the range of dm arrival purposes (not inclusive)
	 * @return the range of dm arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmArrivalPurpose> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm arrival purposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm arrival purposes
	 * @param end the upper bound of the range of dm arrival purposes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmArrivalPurpose> findAll(int start, int end,
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

		List<DmArrivalPurpose> list = (List<DmArrivalPurpose>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMARRIVALPURPOSE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMARRIVALPURPOSE.concat(DmArrivalPurposeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmArrivalPurpose>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmArrivalPurpose>)QueryUtil.list(q,
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
	 * Removes all the dm arrival purposes where purposeCode = &#63; from the database.
	 *
	 * @param purposeCode the purpose code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPurposeCode(String purposeCode)
		throws SystemException {
		for (DmArrivalPurpose dmArrivalPurpose : findByPurposeCode(purposeCode)) {
			dmArrivalPurposePersistence.remove(dmArrivalPurpose);
		}
	}

	/**
	 * Removes all the dm arrival purposes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmArrivalPurpose dmArrivalPurpose : findAll()) {
			dmArrivalPurposePersistence.remove(dmArrivalPurpose);
		}
	}

	/**
	 * Returns the number of dm arrival purposes where purposeCode = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @return the number of matching dm arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPurposeCode(String purposeCode) throws SystemException {
		Object[] finderArgs = new Object[] { purposeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PURPOSECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMARRIVALPURPOSE_WHERE);

			if (purposeCode == null) {
				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_1);
			}
			else {
				if (purposeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (purposeCode != null) {
					qPos.add(purposeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PURPOSECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm arrival purposes.
	 *
	 * @return the number of dm arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMARRIVALPURPOSE);

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
	 * Initializes the dm arrival purpose persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmArrivalPurpose")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmArrivalPurpose>> listenersList = new ArrayList<ModelListener<DmArrivalPurpose>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmArrivalPurpose>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmArrivalPurposeImpl.class.getName());
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
	private static final String _SQL_SELECT_DMARRIVALPURPOSE = "SELECT dmArrivalPurpose FROM DmArrivalPurpose dmArrivalPurpose";
	private static final String _SQL_SELECT_DMARRIVALPURPOSE_WHERE = "SELECT dmArrivalPurpose FROM DmArrivalPurpose dmArrivalPurpose WHERE ";
	private static final String _SQL_COUNT_DMARRIVALPURPOSE = "SELECT COUNT(dmArrivalPurpose) FROM DmArrivalPurpose dmArrivalPurpose";
	private static final String _SQL_COUNT_DMARRIVALPURPOSE_WHERE = "SELECT COUNT(dmArrivalPurpose) FROM DmArrivalPurpose dmArrivalPurpose WHERE ";
	private static final String _FINDER_COLUMN_PURPOSECODE_PURPOSECODE_1 = "dmArrivalPurpose.purposeCode IS NULL";
	private static final String _FINDER_COLUMN_PURPOSECODE_PURPOSECODE_2 = "dmArrivalPurpose.purposeCode = ?";
	private static final String _FINDER_COLUMN_PURPOSECODE_PURPOSECODE_3 = "(dmArrivalPurpose.purposeCode IS NULL OR dmArrivalPurpose.purposeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmArrivalPurpose.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmArrivalPurpose exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmArrivalPurpose exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmArrivalPurposePersistenceImpl.class);
	private static DmArrivalPurpose _nullDmArrivalPurpose = new DmArrivalPurposeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmArrivalPurpose> toCacheModel() {
				return _nullDmArrivalPurposeCacheModel;
			}
		};

	private static CacheModel<DmArrivalPurpose> _nullDmArrivalPurposeCacheModel = new CacheModel<DmArrivalPurpose>() {
			public DmArrivalPurpose toEntityModel() {
				return _nullDmArrivalPurpose;
			}
		};
}