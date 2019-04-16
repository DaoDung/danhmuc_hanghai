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

import vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException;
import vn.gt.dao.danhmuc.model.DmHistoryPassportType;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPassportTypeImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPassportTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history passport type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPassportTypePersistence
 * @see DmHistoryPassportTypeUtil
 * @generated
 */
public class DmHistoryPassportTypePersistenceImpl extends BasePersistenceImpl<DmHistoryPassportType>
	implements DmHistoryPassportTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryPassportTypeUtil} to access the dm history passport type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryPassportTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PASSPORTTYPECODE =
		new FinderPath(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPassportTypeCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE =
		new FinderPath(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPassportTypeCode", new String[] { String.class.getName() },
			DmHistoryPassportTypeModelImpl.PASSPORTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PASSPORTTYPECODE = new FinderPath(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPassportTypeCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION =
		new FinderPath(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPassportTypeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryPassportTypeModelImpl.PASSPORTTYPECODE_COLUMN_BITMASK |
			DmHistoryPassportTypeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PASSPORTTYPECODEANDSYNCVERSION =
		new FinderPath(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPassportTypeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history passport type in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPassportType the dm history passport type
	 */
	public void cacheResult(DmHistoryPassportType dmHistoryPassportType) {
		EntityCacheUtil.putResult(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class,
			dmHistoryPassportType.getPrimaryKey(), dmHistoryPassportType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPassportType.getPassportTypeCode(),
				
			dmHistoryPassportType.getSyncVersion()
			}, dmHistoryPassportType);

		dmHistoryPassportType.resetOriginalValues();
	}

	/**
	 * Caches the dm history passport types in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPassportTypes the dm history passport types
	 */
	public void cacheResult(List<DmHistoryPassportType> dmHistoryPassportTypes) {
		for (DmHistoryPassportType dmHistoryPassportType : dmHistoryPassportTypes) {
			if (EntityCacheUtil.getResult(
						DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPassportTypeImpl.class,
						dmHistoryPassportType.getPrimaryKey()) == null) {
				cacheResult(dmHistoryPassportType);
			}
			else {
				dmHistoryPassportType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history passport types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryPassportTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryPassportTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history passport type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryPassportType dmHistoryPassportType) {
		EntityCacheUtil.removeResult(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class,
			dmHistoryPassportType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPassportType.getPassportTypeCode(),
				
			dmHistoryPassportType.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history passport type with the primary key. Does not add the dm history passport type to the database.
	 *
	 * @param id the primary key for the new dm history passport type
	 * @return the new dm history passport type
	 */
	public DmHistoryPassportType create(int id) {
		DmHistoryPassportType dmHistoryPassportType = new DmHistoryPassportTypeImpl();

		dmHistoryPassportType.setNew(true);
		dmHistoryPassportType.setPrimaryKey(id);

		return dmHistoryPassportType;
	}

	/**
	 * Removes the dm history passport type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history passport type
	 * @return the dm history passport type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm history passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPassportType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm history passport type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history passport type
	 * @return the dm history passport type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a dm history passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType remove(int id)
		throws NoSuchDmHistoryPassportTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryPassportType dmHistoryPassportType = (DmHistoryPassportType)session.get(DmHistoryPassportTypeImpl.class,
					Integer.valueOf(id));

			if (dmHistoryPassportType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmHistoryPassportTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmHistoryPassportTypePersistence.remove(dmHistoryPassportType);
		}
		catch (NoSuchDmHistoryPassportTypeException nsee) {
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
	 * Removes the dm history passport type from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmHistoryPassportType the dm history passport type
	 * @return the dm history passport type that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPassportType remove(
		DmHistoryPassportType dmHistoryPassportType) throws SystemException {
		return super.remove(dmHistoryPassportType);
	}

	@Override
	protected DmHistoryPassportType removeImpl(
		DmHistoryPassportType dmHistoryPassportType) throws SystemException {
		dmHistoryPassportType = toUnwrappedModel(dmHistoryPassportType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryPassportType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmHistoryPassportTypeModelImpl dmHistoryPassportTypeModelImpl = (DmHistoryPassportTypeModelImpl)dmHistoryPassportType;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPassportTypeModelImpl.getPassportTypeCode(),
				
			dmHistoryPassportTypeModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class,
			dmHistoryPassportType.getPrimaryKey());

		return dmHistoryPassportType;
	}

	@Override
	public DmHistoryPassportType updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPassportType dmHistoryPassportType,
		boolean merge) throws SystemException {
		dmHistoryPassportType = toUnwrappedModel(dmHistoryPassportType);

		boolean isNew = dmHistoryPassportType.isNew();

		DmHistoryPassportTypeModelImpl dmHistoryPassportTypeModelImpl = (DmHistoryPassportTypeModelImpl)dmHistoryPassportType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryPassportType, merge);

			dmHistoryPassportType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryPassportTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryPassportTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPassportTypeModelImpl.getOriginalPassportTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE,
					args);

				args = new Object[] {
						dmHistoryPassportTypeModelImpl.getPassportTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSPORTTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPassportTypeImpl.class,
			dmHistoryPassportType.getPrimaryKey(), dmHistoryPassportType);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
				new Object[] {
					dmHistoryPassportType.getPassportTypeCode(),
					
				dmHistoryPassportType.getSyncVersion()
				}, dmHistoryPassportType);
		}
		else {
			if ((dmHistoryPassportTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPassportTypeModelImpl.getOriginalPassportTypeCode(),
						
						dmHistoryPassportTypeModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
					new Object[] {
						dmHistoryPassportType.getPassportTypeCode(),
						
					dmHistoryPassportType.getSyncVersion()
					}, dmHistoryPassportType);
			}
		}

		return dmHistoryPassportType;
	}

	protected DmHistoryPassportType toUnwrappedModel(
		DmHistoryPassportType dmHistoryPassportType) {
		if (dmHistoryPassportType instanceof DmHistoryPassportTypeImpl) {
			return dmHistoryPassportType;
		}

		DmHistoryPassportTypeImpl dmHistoryPassportTypeImpl = new DmHistoryPassportTypeImpl();

		dmHistoryPassportTypeImpl.setNew(dmHistoryPassportType.isNew());
		dmHistoryPassportTypeImpl.setPrimaryKey(dmHistoryPassportType.getPrimaryKey());

		dmHistoryPassportTypeImpl.setId(dmHistoryPassportType.getId());
		dmHistoryPassportTypeImpl.setPassportTypeCode(dmHistoryPassportType.getPassportTypeCode());
		dmHistoryPassportTypeImpl.setPassportType(dmHistoryPassportType.getPassportType());
		dmHistoryPassportTypeImpl.setPassportTypeName(dmHistoryPassportType.getPassportTypeName());
		dmHistoryPassportTypeImpl.setPassportTypeNameVN(dmHistoryPassportType.getPassportTypeNameVN());
		dmHistoryPassportTypeImpl.setIsDelete(dmHistoryPassportType.getIsDelete());
		dmHistoryPassportTypeImpl.setMarkedAsDelete(dmHistoryPassportType.getMarkedAsDelete());
		dmHistoryPassportTypeImpl.setModifiedDate(dmHistoryPassportType.getModifiedDate());
		dmHistoryPassportTypeImpl.setRequestedDate(dmHistoryPassportType.getRequestedDate());
		dmHistoryPassportTypeImpl.setSyncVersion(dmHistoryPassportType.getSyncVersion());

		return dmHistoryPassportTypeImpl;
	}

	/**
	 * Returns the dm history passport type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history passport type
	 * @return the dm history passport type
	 * @throws com.liferay.portal.NoSuchModelException if a dm history passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPassportType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history passport type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history passport type
	 * @return the dm history passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a dm history passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType findByPrimaryKey(int id)
		throws NoSuchDmHistoryPassportTypeException, SystemException {
		DmHistoryPassportType dmHistoryPassportType = fetchByPrimaryKey(id);

		if (dmHistoryPassportType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryPassportTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryPassportType;
	}

	/**
	 * Returns the dm history passport type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history passport type
	 * @return the dm history passport type, or <code>null</code> if a dm history passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPassportType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history passport type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history passport type
	 * @return the dm history passport type, or <code>null</code> if a dm history passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType fetchByPrimaryKey(int id)
		throws SystemException {
		DmHistoryPassportType dmHistoryPassportType = (DmHistoryPassportType)EntityCacheUtil.getResult(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPassportTypeImpl.class, id);

		if (dmHistoryPassportType == _nullDmHistoryPassportType) {
			return null;
		}

		if (dmHistoryPassportType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryPassportType = (DmHistoryPassportType)session.get(DmHistoryPassportTypeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryPassportType != null) {
					cacheResult(dmHistoryPassportType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryPassportTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPassportTypeImpl.class, id,
						_nullDmHistoryPassportType);
				}

				closeSession(session);
			}
		}

		return dmHistoryPassportType;
	}

	/**
	 * Returns all the dm history passport types where passportTypeCode = &#63;.
	 *
	 * @param passportTypeCode the passport type code
	 * @return the matching dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPassportType> findByPassportTypeCode(
		String passportTypeCode) throws SystemException {
		return findByPassportTypeCode(passportTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history passport types where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passportTypeCode the passport type code
	 * @param start the lower bound of the range of dm history passport types
	 * @param end the upper bound of the range of dm history passport types (not inclusive)
	 * @return the range of matching dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPassportType> findByPassportTypeCode(
		String passportTypeCode, int start, int end) throws SystemException {
		return findByPassportTypeCode(passportTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history passport types where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passportTypeCode the passport type code
	 * @param start the lower bound of the range of dm history passport types
	 * @param end the upper bound of the range of dm history passport types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPassportType> findByPassportTypeCode(
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

		List<DmHistoryPassportType> list = (List<DmHistoryPassportType>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYPASSPORTTYPE_WHERE);

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
				query.append(DmHistoryPassportTypeModelImpl.ORDER_BY_JPQL);
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

				list = (List<DmHistoryPassportType>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Returns the first dm history passport type in the ordered set where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passportTypeCode the passport type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a matching dm history passport type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType findByPassportTypeCode_First(
		String passportTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPassportTypeException, SystemException {
		List<DmHistoryPassportType> list = findByPassportTypeCode(passportTypeCode,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("passportTypeCode=");
			msg.append(passportTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPassportTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history passport type in the ordered set where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passportTypeCode the passport type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a matching dm history passport type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType findByPassportTypeCode_Last(
		String passportTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPassportTypeException, SystemException {
		int count = countByPassportTypeCode(passportTypeCode);

		List<DmHistoryPassportType> list = findByPassportTypeCode(passportTypeCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("passportTypeCode=");
			msg.append(passportTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPassportTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history passport types before and after the current dm history passport type in the ordered set where passportTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history passport type
	 * @param passportTypeCode the passport type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a dm history passport type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType[] findByPassportTypeCode_PrevAndNext(int id,
		String passportTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPassportTypeException, SystemException {
		DmHistoryPassportType dmHistoryPassportType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPassportType[] array = new DmHistoryPassportTypeImpl[3];

			array[0] = getByPassportTypeCode_PrevAndNext(session,
					dmHistoryPassportType, passportTypeCode, orderByComparator,
					true);

			array[1] = dmHistoryPassportType;

			array[2] = getByPassportTypeCode_PrevAndNext(session,
					dmHistoryPassportType, passportTypeCode, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryPassportType getByPassportTypeCode_PrevAndNext(
		Session session, DmHistoryPassportType dmHistoryPassportType,
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

		query.append(_SQL_SELECT_DMHISTORYPASSPORTTYPE_WHERE);

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
			query.append(DmHistoryPassportTypeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPassportType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPassportType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException} if it could not be found.
	 *
	 * @param passportTypeCode the passport type code
	 * @param syncVersion the sync version
	 * @return the matching dm history passport type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a matching dm history passport type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType findByPassportTypeCodeAndSyncVersion(
		String passportTypeCode, String syncVersion)
		throws NoSuchDmHistoryPassportTypeException, SystemException {
		DmHistoryPassportType dmHistoryPassportType = fetchByPassportTypeCodeAndSyncVersion(passportTypeCode,
				syncVersion);

		if (dmHistoryPassportType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("passportTypeCode=");
			msg.append(passportTypeCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryPassportTypeException(msg.toString());
		}

		return dmHistoryPassportType;
	}

	/**
	 * Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param passportTypeCode the passport type code
	 * @param syncVersion the sync version
	 * @return the matching dm history passport type, or <code>null</code> if a matching dm history passport type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType fetchByPassportTypeCodeAndSyncVersion(
		String passportTypeCode, String syncVersion) throws SystemException {
		return fetchByPassportTypeCodeAndSyncVersion(passportTypeCode,
			syncVersion, true);
	}

	/**
	 * Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param passportTypeCode the passport type code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history passport type, or <code>null</code> if a matching dm history passport type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPassportType fetchByPassportTypeCodeAndSyncVersion(
		String passportTypeCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { passportTypeCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYPASSPORTTYPE_WHERE);

			if (passportTypeCode == null) {
				query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_1);
			}
			else {
				if (passportTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryPassportTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (passportTypeCode != null) {
					qPos.add(passportTypeCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryPassportType> list = q.list();

				result = list;

				DmHistoryPassportType dmHistoryPassportType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryPassportType = list.get(0);

					cacheResult(dmHistoryPassportType);

					if ((dmHistoryPassportType.getPassportTypeCode() == null) ||
							!dmHistoryPassportType.getPassportTypeCode()
													  .equals(passportTypeCode) ||
							(dmHistoryPassportType.getSyncVersion() == null) ||
							!dmHistoryPassportType.getSyncVersion()
													  .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
							finderArgs, dmHistoryPassportType);
					}
				}

				return dmHistoryPassportType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PASSPORTTYPECODEANDSYNCVERSION,
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
				return (DmHistoryPassportType)result;
			}
		}
	}

	/**
	 * Returns all the dm history passport types.
	 *
	 * @return the dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPassportType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history passport types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history passport types
	 * @param end the upper bound of the range of dm history passport types (not inclusive)
	 * @return the range of dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPassportType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history passport types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history passport types
	 * @param end the upper bound of the range of dm history passport types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPassportType> findAll(int start, int end,
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

		List<DmHistoryPassportType> list = (List<DmHistoryPassportType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYPASSPORTTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYPASSPORTTYPE.concat(DmHistoryPassportTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryPassportType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryPassportType>)QueryUtil.list(q,
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
	 * Removes all the dm history passport types where passportTypeCode = &#63; from the database.
	 *
	 * @param passportTypeCode the passport type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPassportTypeCode(String passportTypeCode)
		throws SystemException {
		for (DmHistoryPassportType dmHistoryPassportType : findByPassportTypeCode(
				passportTypeCode)) {
			dmHistoryPassportTypePersistence.remove(dmHistoryPassportType);
		}
	}

	/**
	 * Removes the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param passportTypeCode the passport type code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPassportTypeCodeAndSyncVersion(
		String passportTypeCode, String syncVersion)
		throws NoSuchDmHistoryPassportTypeException, SystemException {
		DmHistoryPassportType dmHistoryPassportType = findByPassportTypeCodeAndSyncVersion(passportTypeCode,
				syncVersion);

		dmHistoryPassportTypePersistence.remove(dmHistoryPassportType);
	}

	/**
	 * Removes all the dm history passport types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryPassportType dmHistoryPassportType : findAll()) {
			dmHistoryPassportTypePersistence.remove(dmHistoryPassportType);
		}
	}

	/**
	 * Returns the number of dm history passport types where passportTypeCode = &#63;.
	 *
	 * @param passportTypeCode the passport type code
	 * @return the number of matching dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPassportTypeCode(String passportTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { passportTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPASSPORTTYPE_WHERE);

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
	 * Returns the number of dm history passport types where passportTypeCode = &#63; and syncVersion = &#63;.
	 *
	 * @param passportTypeCode the passport type code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPassportTypeCodeAndSyncVersion(String passportTypeCode,
		String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { passportTypeCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYPASSPORTTYPE_WHERE);

			if (passportTypeCode == null) {
				query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_1);
			}
			else {
				if (passportTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_2);
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

				if (syncVersion != null) {
					qPos.add(syncVersion);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PASSPORTTYPECODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history passport types.
	 *
	 * @return the number of dm history passport types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYPASSPORTTYPE);

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
	 * Initializes the dm history passport type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryPassportType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryPassportType>> listenersList = new ArrayList<ModelListener<DmHistoryPassportType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryPassportType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryPassportTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYPASSPORTTYPE = "SELECT dmHistoryPassportType FROM DmHistoryPassportType dmHistoryPassportType";
	private static final String _SQL_SELECT_DMHISTORYPASSPORTTYPE_WHERE = "SELECT dmHistoryPassportType FROM DmHistoryPassportType dmHistoryPassportType WHERE ";
	private static final String _SQL_COUNT_DMHISTORYPASSPORTTYPE = "SELECT COUNT(dmHistoryPassportType) FROM DmHistoryPassportType dmHistoryPassportType";
	private static final String _SQL_COUNT_DMHISTORYPASSPORTTYPE_WHERE = "SELECT COUNT(dmHistoryPassportType) FROM DmHistoryPassportType dmHistoryPassportType WHERE ";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_1 =
		"dmHistoryPassportType.passportTypeCode IS NULL";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_2 =
		"dmHistoryPassportType.passportTypeCode = ?";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODE_PASSPORTTYPECODE_3 =
		"(dmHistoryPassportType.passportTypeCode IS NULL OR dmHistoryPassportType.passportTypeCode = ?)";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_1 =
		"dmHistoryPassportType.passportTypeCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_2 =
		"dmHistoryPassportType.passportTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_PASSPORTTYPECODE_3 =
		"(dmHistoryPassportType.passportTypeCode IS NULL OR dmHistoryPassportType.passportTypeCode = ?) AND ";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryPassportType.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryPassportType.syncVersion = ?";
	private static final String _FINDER_COLUMN_PASSPORTTYPECODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryPassportType.syncVersion IS NULL OR dmHistoryPassportType.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryPassportType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryPassportType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryPassportType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryPassportTypePersistenceImpl.class);
	private static DmHistoryPassportType _nullDmHistoryPassportType = new DmHistoryPassportTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryPassportType> toCacheModel() {
				return _nullDmHistoryPassportTypeCacheModel;
			}
		};

	private static CacheModel<DmHistoryPassportType> _nullDmHistoryPassportTypeCacheModel =
		new CacheModel<DmHistoryPassportType>() {
			public DmHistoryPassportType toEntityModel() {
				return _nullDmHistoryPassportType;
			}
		};
}