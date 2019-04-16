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

package vn.gt.dao.danhmucgt.service.persistence;

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

import vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException;
import vn.gt.dao.danhmucgt.model.DmGTBusinessType;
import vn.gt.dao.danhmucgt.model.impl.DmGTBusinessTypeImpl;
import vn.gt.dao.danhmucgt.model.impl.DmGTBusinessTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm g t business type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGTBusinessTypePersistence
 * @see DmGTBusinessTypeUtil
 * @generated
 */
public class DmGTBusinessTypePersistenceImpl extends BasePersistenceImpl<DmGTBusinessType>
	implements DmGTBusinessTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGTBusinessTypeUtil} to access the dm g t business type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGTBusinessTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_BUSINESSTYPECODE = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByBusinessTypeCode",
			new String[] { Integer.class.getName() },
			DmGTBusinessTypeModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BUSINESSTYPECODE = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBusinessTypeCode", new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm g t business type in the entity cache if it is enabled.
	 *
	 * @param dmGTBusinessType the dm g t business type
	 */
	public void cacheResult(DmGTBusinessType dmGTBusinessType) {
		EntityCacheUtil.putResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, dmGTBusinessType.getPrimaryKey(),
			dmGTBusinessType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
			new Object[] { Integer.valueOf(
					dmGTBusinessType.getBusinessTypeCode()) }, dmGTBusinessType);

		dmGTBusinessType.resetOriginalValues();
	}

	/**
	 * Caches the dm g t business types in the entity cache if it is enabled.
	 *
	 * @param dmGTBusinessTypes the dm g t business types
	 */
	public void cacheResult(List<DmGTBusinessType> dmGTBusinessTypes) {
		for (DmGTBusinessType dmGTBusinessType : dmGTBusinessTypes) {
			if (EntityCacheUtil.getResult(
						DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmGTBusinessTypeImpl.class,
						dmGTBusinessType.getPrimaryKey()) == null) {
				cacheResult(dmGTBusinessType);
			}
			else {
				dmGTBusinessType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm g t business types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGTBusinessTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGTBusinessTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm g t business type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGTBusinessType dmGTBusinessType) {
		EntityCacheUtil.removeResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, dmGTBusinessType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
			new Object[] { Integer.valueOf(
					dmGTBusinessType.getBusinessTypeCode()) });
	}

	/**
	 * Creates a new dm g t business type with the primary key. Does not add the dm g t business type to the database.
	 *
	 * @param id the primary key for the new dm g t business type
	 * @return the new dm g t business type
	 */
	public DmGTBusinessType create(long id) {
		DmGTBusinessType dmGTBusinessType = new DmGTBusinessTypeImpl();

		dmGTBusinessType.setNew(true);
		dmGTBusinessType.setPrimaryKey(id);

		return dmGTBusinessType;
	}

	/**
	 * Removes the dm g t business type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm g t business type
	 * @return the dm g t business type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the dm g t business type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm g t business type
	 * @return the dm g t business type that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTBusinessType remove(long id)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGTBusinessType dmGTBusinessType = (DmGTBusinessType)session.get(DmGTBusinessTypeImpl.class,
					Long.valueOf(id));

			if (dmGTBusinessType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmGTBusinessTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmGTBusinessTypePersistence.remove(dmGTBusinessType);
		}
		catch (NoSuchDmGTBusinessTypeException nsee) {
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
	 * Removes the dm g t business type from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmGTBusinessType the dm g t business type
	 * @return the dm g t business type that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType remove(DmGTBusinessType dmGTBusinessType)
		throws SystemException {
		return super.remove(dmGTBusinessType);
	}

	@Override
	protected DmGTBusinessType removeImpl(DmGTBusinessType dmGTBusinessType)
		throws SystemException {
		dmGTBusinessType = toUnwrappedModel(dmGTBusinessType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGTBusinessType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmGTBusinessTypeModelImpl dmGTBusinessTypeModelImpl = (DmGTBusinessTypeModelImpl)dmGTBusinessType;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
			new Object[] {
				Integer.valueOf(dmGTBusinessTypeModelImpl.getBusinessTypeCode())
			});

		EntityCacheUtil.removeResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, dmGTBusinessType.getPrimaryKey());

		return dmGTBusinessType;
	}

	@Override
	public DmGTBusinessType updateImpl(
		vn.gt.dao.danhmucgt.model.DmGTBusinessType dmGTBusinessType,
		boolean merge) throws SystemException {
		dmGTBusinessType = toUnwrappedModel(dmGTBusinessType);

		boolean isNew = dmGTBusinessType.isNew();

		DmGTBusinessTypeModelImpl dmGTBusinessTypeModelImpl = (DmGTBusinessTypeModelImpl)dmGTBusinessType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGTBusinessType, merge);

			dmGTBusinessType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGTBusinessTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTBusinessTypeImpl.class, dmGTBusinessType.getPrimaryKey(),
			dmGTBusinessType);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
				new Object[] {
					Integer.valueOf(dmGTBusinessType.getBusinessTypeCode())
				}, dmGTBusinessType);
		}
		else {
			if ((dmGTBusinessTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_BUSINESSTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(dmGTBusinessTypeModelImpl.getOriginalBusinessTypeCode())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
					new Object[] {
						Integer.valueOf(dmGTBusinessType.getBusinessTypeCode())
					}, dmGTBusinessType);
			}
		}

		return dmGTBusinessType;
	}

	protected DmGTBusinessType toUnwrappedModel(
		DmGTBusinessType dmGTBusinessType) {
		if (dmGTBusinessType instanceof DmGTBusinessTypeImpl) {
			return dmGTBusinessType;
		}

		DmGTBusinessTypeImpl dmGTBusinessTypeImpl = new DmGTBusinessTypeImpl();

		dmGTBusinessTypeImpl.setNew(dmGTBusinessType.isNew());
		dmGTBusinessTypeImpl.setPrimaryKey(dmGTBusinessType.getPrimaryKey());

		dmGTBusinessTypeImpl.setId(dmGTBusinessType.getId());
		dmGTBusinessTypeImpl.setBusinessTypeCode(dmGTBusinessType.getBusinessTypeCode());
		dmGTBusinessTypeImpl.setBusinessTypeName(dmGTBusinessType.getBusinessTypeName());
		dmGTBusinessTypeImpl.setBusinessTypeNameVN(dmGTBusinessType.getBusinessTypeNameVN());
		dmGTBusinessTypeImpl.setBusinessTypeOrder(dmGTBusinessType.getBusinessTypeOrder());
		dmGTBusinessTypeImpl.setIsDelete(dmGTBusinessType.getIsDelete());
		dmGTBusinessTypeImpl.setMarkedAsDelete(dmGTBusinessType.getMarkedAsDelete());
		dmGTBusinessTypeImpl.setModifiedDate(dmGTBusinessType.getModifiedDate());
		dmGTBusinessTypeImpl.setRequestedDate(dmGTBusinessType.getRequestedDate());
		dmGTBusinessTypeImpl.setSyncVersion(dmGTBusinessType.getSyncVersion());
		dmGTBusinessTypeImpl.setRemarks(dmGTBusinessType.getRemarks());

		return dmGTBusinessTypeImpl;
	}

	/**
	 * Returns the dm g t business type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm g t business type
	 * @return the dm g t business type
	 * @throws com.liferay.portal.NoSuchModelException if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm g t business type with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm g t business type
	 * @return the dm g t business type
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTBusinessType findByPrimaryKey(long id)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		DmGTBusinessType dmGTBusinessType = fetchByPrimaryKey(id);

		if (dmGTBusinessType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGTBusinessTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGTBusinessType;
	}

	/**
	 * Returns the dm g t business type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm g t business type
	 * @return the dm g t business type, or <code>null</code> if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTBusinessType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm g t business type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm g t business type
	 * @return the dm g t business type, or <code>null</code> if a dm g t business type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTBusinessType fetchByPrimaryKey(long id)
		throws SystemException {
		DmGTBusinessType dmGTBusinessType = (DmGTBusinessType)EntityCacheUtil.getResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmGTBusinessTypeImpl.class, id);

		if (dmGTBusinessType == _nullDmGTBusinessType) {
			return null;
		}

		if (dmGTBusinessType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGTBusinessType = (DmGTBusinessType)session.get(DmGTBusinessTypeImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGTBusinessType != null) {
					cacheResult(dmGTBusinessType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGTBusinessTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmGTBusinessTypeImpl.class, id, _nullDmGTBusinessType);
				}

				closeSession(session);
			}
		}

		return dmGTBusinessType;
	}

	/**
	 * Returns the dm g t business type where businessTypeCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException} if it could not be found.
	 *
	 * @param businessTypeCode the business type code
	 * @return the matching dm g t business type
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException if a matching dm g t business type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTBusinessType findByBusinessTypeCode(int businessTypeCode)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		DmGTBusinessType dmGTBusinessType = fetchByBusinessTypeCode(businessTypeCode);

		if (dmGTBusinessType == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmGTBusinessTypeException(msg.toString());
		}

		return dmGTBusinessType;
	}

	/**
	 * Returns the dm g t business type where businessTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param businessTypeCode the business type code
	 * @return the matching dm g t business type, or <code>null</code> if a matching dm g t business type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTBusinessType fetchByBusinessTypeCode(int businessTypeCode)
		throws SystemException {
		return fetchByBusinessTypeCode(businessTypeCode, true);
	}

	/**
	 * Returns the dm g t business type where businessTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param businessTypeCode the business type code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm g t business type, or <code>null</code> if a matching dm g t business type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTBusinessType fetchByBusinessTypeCode(int businessTypeCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { businessTypeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMGTBUSINESSTYPE_WHERE);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

			query.append(DmGTBusinessTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessTypeCode);

				List<DmGTBusinessType> list = q.list();

				result = list;

				DmGTBusinessType dmGTBusinessType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
						finderArgs, list);
				}
				else {
					dmGTBusinessType = list.get(0);

					cacheResult(dmGTBusinessType);

					if ((dmGTBusinessType.getBusinessTypeCode() != businessTypeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
							finderArgs, dmGTBusinessType);
					}
				}

				return dmGTBusinessType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSTYPECODE,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (DmGTBusinessType)result;
			}
		}
	}

	/**
	 * Returns all the dm g t business types.
	 *
	 * @return the dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTBusinessType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm g t business types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm g t business types
	 * @param end the upper bound of the range of dm g t business types (not inclusive)
	 * @return the range of dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTBusinessType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm g t business types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm g t business types
	 * @param end the upper bound of the range of dm g t business types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTBusinessType> findAll(int start, int end,
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

		List<DmGTBusinessType> list = (List<DmGTBusinessType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTBUSINESSTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTBUSINESSTYPE.concat(DmGTBusinessTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGTBusinessType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGTBusinessType>)QueryUtil.list(q,
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
	 * Removes the dm g t business type where businessTypeCode = &#63; from the database.
	 *
	 * @param businessTypeCode the business type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByBusinessTypeCode(int businessTypeCode)
		throws NoSuchDmGTBusinessTypeException, SystemException {
		DmGTBusinessType dmGTBusinessType = findByBusinessTypeCode(businessTypeCode);

		dmGTBusinessTypePersistence.remove(dmGTBusinessType);
	}

	/**
	 * Removes all the dm g t business types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGTBusinessType dmGTBusinessType : findAll()) {
			dmGTBusinessTypePersistence.remove(dmGTBusinessType);
		}
	}

	/**
	 * Returns the number of dm g t business types where businessTypeCode = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @return the number of matching dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByBusinessTypeCode(int businessTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { businessTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTBUSINESSTYPE_WHERE);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessTypeCode);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm g t business types.
	 *
	 * @return the number of dm g t business types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGTBUSINESSTYPE);

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
	 * Initializes the dm g t business type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmGTBusinessType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGTBusinessType>> listenersList = new ArrayList<ModelListener<DmGTBusinessType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGTBusinessType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGTBusinessTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DmCertificatePersistence.class)
	protected DmCertificatePersistence dmCertificatePersistence;
	@BeanReference(type = DmGTBusinessTypePersistence.class)
	protected DmGTBusinessTypePersistence dmGTBusinessTypePersistence;
	@BeanReference(type = DmGTFunctionTypePersistence.class)
	protected DmGTFunctionTypePersistence dmGTFunctionTypePersistence;
	@BeanReference(type = DmGtOrganizationPersistence.class)
	protected DmGtOrganizationPersistence dmGtOrganizationPersistence;
	@BeanReference(type = DmGtReportCategoryPersistence.class)
	protected DmGtReportCategoryPersistence dmGtReportCategoryPersistence;
	@BeanReference(type = DmGtReportTemplatePersistence.class)
	protected DmGtReportTemplatePersistence dmGtReportTemplatePersistence;
	@BeanReference(type = DmGtRouteConfigPersistence.class)
	protected DmGtRouteConfigPersistence dmGtRouteConfigPersistence;
	@BeanReference(type = DmGTShipPositionPersistence.class)
	protected DmGTShipPositionPersistence dmGTShipPositionPersistence;
	@BeanReference(type = DmGtStatusPersistence.class)
	protected DmGtStatusPersistence dmGtStatusPersistence;
	@BeanReference(type = DmGtVersionPersistence.class)
	protected DmGtVersionPersistence dmGtVersionPersistence;
	@BeanReference(type = DmHistoryMinistryPersistence.class)
	protected DmHistoryMinistryPersistence dmHistoryMinistryPersistence;
	@BeanReference(type = DmMinistryPersistence.class)
	protected DmMinistryPersistence dmMinistryPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DMGTBUSINESSTYPE = "SELECT dmGTBusinessType FROM DmGTBusinessType dmGTBusinessType";
	private static final String _SQL_SELECT_DMGTBUSINESSTYPE_WHERE = "SELECT dmGTBusinessType FROM DmGTBusinessType dmGTBusinessType WHERE ";
	private static final String _SQL_COUNT_DMGTBUSINESSTYPE = "SELECT COUNT(dmGTBusinessType) FROM DmGTBusinessType dmGTBusinessType";
	private static final String _SQL_COUNT_DMGTBUSINESSTYPE_WHERE = "SELECT COUNT(dmGTBusinessType) FROM DmGTBusinessType dmGTBusinessType WHERE ";
	private static final String _FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2 =
		"dmGTBusinessType.businessTypeCode = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGTBusinessType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGTBusinessType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGTBusinessType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGTBusinessTypePersistenceImpl.class);
	private static DmGTBusinessType _nullDmGTBusinessType = new DmGTBusinessTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGTBusinessType> toCacheModel() {
				return _nullDmGTBusinessTypeCacheModel;
			}
		};

	private static CacheModel<DmGTBusinessType> _nullDmGTBusinessTypeCacheModel = new CacheModel<DmGTBusinessType>() {
			public DmGTBusinessType toEntityModel() {
				return _nullDmGTBusinessType;
			}
		};
}