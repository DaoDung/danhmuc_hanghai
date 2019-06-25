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

import vn.gt.dao.danhmucgt.NoSuchDmGTFunctionTypeException;
import vn.gt.dao.danhmucgt.model.DmGTFunctionType;
import vn.gt.dao.danhmucgt.model.impl.DmGTFunctionTypeImpl;
import vn.gt.dao.danhmucgt.model.impl.DmGTFunctionTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm g t function type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGTFunctionTypePersistence
 * @see DmGTFunctionTypeUtil
 * @generated
 */
public class DmGTFunctionTypePersistenceImpl extends BasePersistenceImpl<DmGTFunctionType>
	implements DmGTFunctionTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGTFunctionTypeUtil} to access the dm g t function type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGTFunctionTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE = new FinderPath(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTFunctionTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTFunctionTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByFunctionTypeCode", new String[] { String.class.getName() },
			DmGTFunctionTypeModelImpl.FUNCTIONTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FUNCTIONTYPECODE = new FinderPath(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTFunctionTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFunctionTypeCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTFunctionTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTFunctionTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTFunctionTypeModelImpl.FINDER_CACHE_ENABLED,
			DmGTFunctionTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTFunctionTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm g t function type in the entity cache if it is enabled.
	 *
	 * @param dmGTFunctionType the dm g t function type
	 */
	public void cacheResult(DmGTFunctionType dmGTFunctionType) {
		EntityCacheUtil.putResult(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTFunctionTypeImpl.class, dmGTFunctionType.getPrimaryKey(),
			dmGTFunctionType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
			new Object[] { dmGTFunctionType.getFunctionTypeCode() },
			dmGTFunctionType);

		dmGTFunctionType.resetOriginalValues();
	}

	/**
	 * Caches the dm g t function types in the entity cache if it is enabled.
	 *
	 * @param dmGTFunctionTypes the dm g t function types
	 */
	public void cacheResult(List<DmGTFunctionType> dmGTFunctionTypes) {
		for (DmGTFunctionType dmGTFunctionType : dmGTFunctionTypes) {
			if (EntityCacheUtil.getResult(
						DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmGTFunctionTypeImpl.class,
						dmGTFunctionType.getPrimaryKey()) == null) {
				cacheResult(dmGTFunctionType);
			}
			else {
				dmGTFunctionType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm g t function types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGTFunctionTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGTFunctionTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm g t function type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGTFunctionType dmGTFunctionType) {
		EntityCacheUtil.removeResult(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTFunctionTypeImpl.class, dmGTFunctionType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmGTFunctionType);
	}

	@Override
	public void clearCache(List<DmGTFunctionType> dmGTFunctionTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGTFunctionType dmGTFunctionType : dmGTFunctionTypes) {
			EntityCacheUtil.removeResult(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmGTFunctionTypeImpl.class, dmGTFunctionType.getPrimaryKey());

			clearUniqueFindersCache(dmGTFunctionType);
		}
	}

	protected void clearUniqueFindersCache(DmGTFunctionType dmGTFunctionType) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
			new Object[] { dmGTFunctionType.getFunctionTypeCode() });
	}

	/**
	 * Creates a new dm g t function type with the primary key. Does not add the dm g t function type to the database.
	 *
	 * @param id the primary key for the new dm g t function type
	 * @return the new dm g t function type
	 */
	public DmGTFunctionType create(long id) {
		DmGTFunctionType dmGTFunctionType = new DmGTFunctionTypeImpl();

		dmGTFunctionType.setNew(true);
		dmGTFunctionType.setPrimaryKey(id);

		return dmGTFunctionType;
	}

	/**
	 * Removes the dm g t function type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm g t function type
	 * @return the dm g t function type that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTFunctionTypeException if a dm g t function type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTFunctionType remove(long id)
		throws NoSuchDmGTFunctionTypeException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the dm g t function type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm g t function type
	 * @return the dm g t function type that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTFunctionTypeException if a dm g t function type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTFunctionType remove(Serializable primaryKey)
		throws NoSuchDmGTFunctionTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGTFunctionType dmGTFunctionType = (DmGTFunctionType)session.get(DmGTFunctionTypeImpl.class,
					primaryKey);

			if (dmGTFunctionType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGTFunctionTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGTFunctionType);
		}
		catch (NoSuchDmGTFunctionTypeException nsee) {
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
	protected DmGTFunctionType removeImpl(DmGTFunctionType dmGTFunctionType)
		throws SystemException {
		dmGTFunctionType = toUnwrappedModel(dmGTFunctionType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGTFunctionType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmGTFunctionType);

		return dmGTFunctionType;
	}

	@Override
	public DmGTFunctionType updateImpl(
		vn.gt.dao.danhmucgt.model.DmGTFunctionType dmGTFunctionType,
		boolean merge) throws SystemException {
		dmGTFunctionType = toUnwrappedModel(dmGTFunctionType);

		boolean isNew = dmGTFunctionType.isNew();

		DmGTFunctionTypeModelImpl dmGTFunctionTypeModelImpl = (DmGTFunctionTypeModelImpl)dmGTFunctionType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGTFunctionType, merge);

			dmGTFunctionType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGTFunctionTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmGTFunctionTypeImpl.class, dmGTFunctionType.getPrimaryKey(),
			dmGTFunctionType);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
				new Object[] { dmGTFunctionType.getFunctionTypeCode() },
				dmGTFunctionType);
		}
		else {
			if ((dmGTFunctionTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGTFunctionTypeModelImpl.getOriginalFunctionTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FUNCTIONTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
					new Object[] { dmGTFunctionType.getFunctionTypeCode() },
					dmGTFunctionType);
			}
		}

		return dmGTFunctionType;
	}

	protected DmGTFunctionType toUnwrappedModel(
		DmGTFunctionType dmGTFunctionType) {
		if (dmGTFunctionType instanceof DmGTFunctionTypeImpl) {
			return dmGTFunctionType;
		}

		DmGTFunctionTypeImpl dmGTFunctionTypeImpl = new DmGTFunctionTypeImpl();

		dmGTFunctionTypeImpl.setNew(dmGTFunctionType.isNew());
		dmGTFunctionTypeImpl.setPrimaryKey(dmGTFunctionType.getPrimaryKey());

		dmGTFunctionTypeImpl.setId(dmGTFunctionType.getId());
		dmGTFunctionTypeImpl.setFunctionTypeCode(dmGTFunctionType.getFunctionTypeCode());
		dmGTFunctionTypeImpl.setFunctionTypeName(dmGTFunctionType.getFunctionTypeName());
		dmGTFunctionTypeImpl.setFunctionTypeNameVN(dmGTFunctionType.getFunctionTypeNameVN());
		dmGTFunctionTypeImpl.setFunctionTypeOrder(dmGTFunctionType.getFunctionTypeOrder());
		dmGTFunctionTypeImpl.setIsDelete(dmGTFunctionType.getIsDelete());
		dmGTFunctionTypeImpl.setMarkedAsDelete(dmGTFunctionType.getMarkedAsDelete());
		dmGTFunctionTypeImpl.setModifiedDate(dmGTFunctionType.getModifiedDate());
		dmGTFunctionTypeImpl.setRequestedDate(dmGTFunctionType.getRequestedDate());
		dmGTFunctionTypeImpl.setSyncVersion(dmGTFunctionType.getSyncVersion());

		return dmGTFunctionTypeImpl;
	}

	/**
	 * Returns the dm g t function type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm g t function type
	 * @return the dm g t function type
	 * @throws com.liferay.portal.NoSuchModelException if a dm g t function type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTFunctionType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm g t function type with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTFunctionTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm g t function type
	 * @return the dm g t function type
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTFunctionTypeException if a dm g t function type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTFunctionType findByPrimaryKey(long id)
		throws NoSuchDmGTFunctionTypeException, SystemException {
		DmGTFunctionType dmGTFunctionType = fetchByPrimaryKey(id);

		if (dmGTFunctionType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGTFunctionTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGTFunctionType;
	}

	/**
	 * Returns the dm g t function type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm g t function type
	 * @return the dm g t function type, or <code>null</code> if a dm g t function type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTFunctionType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm g t function type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm g t function type
	 * @return the dm g t function type, or <code>null</code> if a dm g t function type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTFunctionType fetchByPrimaryKey(long id)
		throws SystemException {
		DmGTFunctionType dmGTFunctionType = (DmGTFunctionType)EntityCacheUtil.getResult(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmGTFunctionTypeImpl.class, id);

		if (dmGTFunctionType == _nullDmGTFunctionType) {
			return null;
		}

		if (dmGTFunctionType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGTFunctionType = (DmGTFunctionType)session.get(DmGTFunctionTypeImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGTFunctionType != null) {
					cacheResult(dmGTFunctionType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGTFunctionTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmGTFunctionTypeImpl.class, id, _nullDmGTFunctionType);
				}

				closeSession(session);
			}
		}

		return dmGTFunctionType;
	}

	/**
	 * Returns the dm g t function type where functionTypeCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTFunctionTypeException} if it could not be found.
	 *
	 * @param functionTypeCode the function type code
	 * @return the matching dm g t function type
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTFunctionTypeException if a matching dm g t function type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTFunctionType findByFunctionTypeCode(String functionTypeCode)
		throws NoSuchDmGTFunctionTypeException, SystemException {
		DmGTFunctionType dmGTFunctionType = fetchByFunctionTypeCode(functionTypeCode);

		if (dmGTFunctionType == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("functionTypeCode=");
			msg.append(functionTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmGTFunctionTypeException(msg.toString());
		}

		return dmGTFunctionType;
	}

	/**
	 * Returns the dm g t function type where functionTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param functionTypeCode the function type code
	 * @return the matching dm g t function type, or <code>null</code> if a matching dm g t function type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTFunctionType fetchByFunctionTypeCode(String functionTypeCode)
		throws SystemException {
		return fetchByFunctionTypeCode(functionTypeCode, true);
	}

	/**
	 * Returns the dm g t function type where functionTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param functionTypeCode the function type code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm g t function type, or <code>null</code> if a matching dm g t function type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTFunctionType fetchByFunctionTypeCode(String functionTypeCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { functionTypeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMGTFUNCTIONTYPE_WHERE);

			if (functionTypeCode == null) {
				query.append(_FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_1);
			}
			else {
				if (functionTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_2);
				}
			}

			query.append(DmGTFunctionTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (functionTypeCode != null) {
					qPos.add(functionTypeCode);
				}

				List<DmGTFunctionType> list = q.list();

				result = list;

				DmGTFunctionType dmGTFunctionType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
						finderArgs, list);
				}
				else {
					dmGTFunctionType = list.get(0);

					cacheResult(dmGTFunctionType);

					if ((dmGTFunctionType.getFunctionTypeCode() == null) ||
							!dmGTFunctionType.getFunctionTypeCode()
												 .equals(functionTypeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
							finderArgs, dmGTFunctionType);
					}
				}

				return dmGTFunctionType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FUNCTIONTYPECODE,
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
				return (DmGTFunctionType)result;
			}
		}
	}

	/**
	 * Returns all the dm g t function types.
	 *
	 * @return the dm g t function types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTFunctionType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm g t function types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm g t function types
	 * @param end the upper bound of the range of dm g t function types (not inclusive)
	 * @return the range of dm g t function types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTFunctionType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm g t function types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm g t function types
	 * @param end the upper bound of the range of dm g t function types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm g t function types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTFunctionType> findAll(int start, int end,
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

		List<DmGTFunctionType> list = (List<DmGTFunctionType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTFUNCTIONTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTFUNCTIONTYPE.concat(DmGTFunctionTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGTFunctionType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGTFunctionType>)QueryUtil.list(q,
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
	 * Removes the dm g t function type where functionTypeCode = &#63; from the database.
	 *
	 * @param functionTypeCode the function type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFunctionTypeCode(String functionTypeCode)
		throws NoSuchDmGTFunctionTypeException, SystemException {
		DmGTFunctionType dmGTFunctionType = findByFunctionTypeCode(functionTypeCode);

		remove(dmGTFunctionType);
	}

	/**
	 * Removes all the dm g t function types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGTFunctionType dmGTFunctionType : findAll()) {
			remove(dmGTFunctionType);
		}
	}

	/**
	 * Returns the number of dm g t function types where functionTypeCode = &#63;.
	 *
	 * @param functionTypeCode the function type code
	 * @return the number of matching dm g t function types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFunctionTypeCode(String functionTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { functionTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FUNCTIONTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTFUNCTIONTYPE_WHERE);

			if (functionTypeCode == null) {
				query.append(_FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_1);
			}
			else {
				if (functionTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (functionTypeCode != null) {
					qPos.add(functionTypeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FUNCTIONTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm g t function types.
	 *
	 * @return the number of dm g t function types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGTFUNCTIONTYPE);

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
	 * Initializes the dm g t function type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmGTFunctionType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGTFunctionType>> listenersList = new ArrayList<ModelListener<DmGTFunctionType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGTFunctionType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGTFunctionTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_DMGTFUNCTIONTYPE = "SELECT dmGTFunctionType FROM DmGTFunctionType dmGTFunctionType";
	private static final String _SQL_SELECT_DMGTFUNCTIONTYPE_WHERE = "SELECT dmGTFunctionType FROM DmGTFunctionType dmGTFunctionType WHERE ";
	private static final String _SQL_COUNT_DMGTFUNCTIONTYPE = "SELECT COUNT(dmGTFunctionType) FROM DmGTFunctionType dmGTFunctionType";
	private static final String _SQL_COUNT_DMGTFUNCTIONTYPE_WHERE = "SELECT COUNT(dmGTFunctionType) FROM DmGTFunctionType dmGTFunctionType WHERE ";
	private static final String _FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_1 =
		"dmGTFunctionType.functionTypeCode IS NULL";
	private static final String _FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_2 =
		"dmGTFunctionType.functionTypeCode = ?";
	private static final String _FINDER_COLUMN_FUNCTIONTYPECODE_FUNCTIONTYPECODE_3 =
		"(dmGTFunctionType.functionTypeCode IS NULL OR dmGTFunctionType.functionTypeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGTFunctionType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGTFunctionType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGTFunctionType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGTFunctionTypePersistenceImpl.class);
	private static DmGTFunctionType _nullDmGTFunctionType = new DmGTFunctionTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGTFunctionType> toCacheModel() {
				return _nullDmGTFunctionTypeCacheModel;
			}
		};

	private static CacheModel<DmGTFunctionType> _nullDmGTFunctionTypeCacheModel = new CacheModel<DmGTFunctionType>() {
			public DmGTFunctionType toEntityModel() {
				return _nullDmGTFunctionType;
			}
		};
}