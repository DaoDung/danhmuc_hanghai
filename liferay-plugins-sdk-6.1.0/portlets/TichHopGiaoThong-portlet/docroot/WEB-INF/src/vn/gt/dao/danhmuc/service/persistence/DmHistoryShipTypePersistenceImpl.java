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

import vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException;
import vn.gt.dao.danhmuc.model.DmHistoryShipType;
import vn.gt.dao.danhmuc.model.impl.DmHistoryShipTypeImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryShipTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history ship type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryShipTypePersistence
 * @see DmHistoryShipTypeUtil
 * @generated
 */
public class DmHistoryShipTypePersistenceImpl extends BasePersistenceImpl<DmHistoryShipType>
	implements DmHistoryShipTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryShipTypeUtil} to access the dm history ship type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryShipTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByShipTypeCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByShipTypeCode",
			new String[] { String.class.getName() },
			DmHistoryShipTypeModelImpl.SHIPTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPTYPECODE = new FinderPath(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByShipTypeCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION =
		new FinderPath(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByShipTypeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryShipTypeModelImpl.SHIPTYPECODE_COLUMN_BITMASK |
			DmHistoryShipTypeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPTYPECODEANDSYNCVERSION =
		new FinderPath(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByShipTypeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history ship type in the entity cache if it is enabled.
	 *
	 * @param dmHistoryShipType the dm history ship type
	 */
	public void cacheResult(DmHistoryShipType dmHistoryShipType) {
		EntityCacheUtil.putResult(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class, dmHistoryShipType.getPrimaryKey(),
			dmHistoryShipType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryShipType.getShipTypeCode(),
				
			dmHistoryShipType.getSyncVersion()
			}, dmHistoryShipType);

		dmHistoryShipType.resetOriginalValues();
	}

	/**
	 * Caches the dm history ship types in the entity cache if it is enabled.
	 *
	 * @param dmHistoryShipTypes the dm history ship types
	 */
	public void cacheResult(List<DmHistoryShipType> dmHistoryShipTypes) {
		for (DmHistoryShipType dmHistoryShipType : dmHistoryShipTypes) {
			if (EntityCacheUtil.getResult(
						DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryShipTypeImpl.class,
						dmHistoryShipType.getPrimaryKey()) == null) {
				cacheResult(dmHistoryShipType);
			}
			else {
				dmHistoryShipType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history ship types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryShipTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryShipTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history ship type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryShipType dmHistoryShipType) {
		EntityCacheUtil.removeResult(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class, dmHistoryShipType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryShipType.getShipTypeCode(),
				
			dmHistoryShipType.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history ship type with the primary key. Does not add the dm history ship type to the database.
	 *
	 * @param id the primary key for the new dm history ship type
	 * @return the new dm history ship type
	 */
	public DmHistoryShipType create(int id) {
		DmHistoryShipType dmHistoryShipType = new DmHistoryShipTypeImpl();

		dmHistoryShipType.setNew(true);
		dmHistoryShipType.setPrimaryKey(id);

		return dmHistoryShipType;
	}

	/**
	 * Removes the dm history ship type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history ship type
	 * @return the dm history ship type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm history ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryShipType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm history ship type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history ship type
	 * @return the dm history ship type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType remove(int id)
		throws NoSuchDmHistoryShipTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryShipType dmHistoryShipType = (DmHistoryShipType)session.get(DmHistoryShipTypeImpl.class,
					Integer.valueOf(id));

			if (dmHistoryShipType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmHistoryShipTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmHistoryShipTypePersistence.remove(dmHistoryShipType);
		}
		catch (NoSuchDmHistoryShipTypeException nsee) {
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
	 * Removes the dm history ship type from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmHistoryShipType the dm history ship type
	 * @return the dm history ship type that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryShipType remove(DmHistoryShipType dmHistoryShipType)
		throws SystemException {
		return super.remove(dmHistoryShipType);
	}

	@Override
	protected DmHistoryShipType removeImpl(DmHistoryShipType dmHistoryShipType)
		throws SystemException {
		dmHistoryShipType = toUnwrappedModel(dmHistoryShipType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryShipType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmHistoryShipTypeModelImpl dmHistoryShipTypeModelImpl = (DmHistoryShipTypeModelImpl)dmHistoryShipType;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryShipTypeModelImpl.getShipTypeCode(),
				
			dmHistoryShipTypeModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class, dmHistoryShipType.getPrimaryKey());

		return dmHistoryShipType;
	}

	@Override
	public DmHistoryShipType updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryShipType dmHistoryShipType,
		boolean merge) throws SystemException {
		dmHistoryShipType = toUnwrappedModel(dmHistoryShipType);

		boolean isNew = dmHistoryShipType.isNew();

		DmHistoryShipTypeModelImpl dmHistoryShipTypeModelImpl = (DmHistoryShipTypeModelImpl)dmHistoryShipType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryShipType, merge);

			dmHistoryShipType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryShipTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryShipTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryShipTypeModelImpl.getOriginalShipTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);

				args = new Object[] { dmHistoryShipTypeModelImpl.getShipTypeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipTypeImpl.class, dmHistoryShipType.getPrimaryKey(),
			dmHistoryShipType);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
				new Object[] {
					dmHistoryShipType.getShipTypeCode(),
					
				dmHistoryShipType.getSyncVersion()
				}, dmHistoryShipType);
		}
		else {
			if ((dmHistoryShipTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryShipTypeModelImpl.getOriginalShipTypeCode(),
						
						dmHistoryShipTypeModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
					new Object[] {
						dmHistoryShipType.getShipTypeCode(),
						
					dmHistoryShipType.getSyncVersion()
					}, dmHistoryShipType);
			}
		}

		return dmHistoryShipType;
	}

	protected DmHistoryShipType toUnwrappedModel(
		DmHistoryShipType dmHistoryShipType) {
		if (dmHistoryShipType instanceof DmHistoryShipTypeImpl) {
			return dmHistoryShipType;
		}

		DmHistoryShipTypeImpl dmHistoryShipTypeImpl = new DmHistoryShipTypeImpl();

		dmHistoryShipTypeImpl.setNew(dmHistoryShipType.isNew());
		dmHistoryShipTypeImpl.setPrimaryKey(dmHistoryShipType.getPrimaryKey());

		dmHistoryShipTypeImpl.setId(dmHistoryShipType.getId());
		dmHistoryShipTypeImpl.setShipTypeCode(dmHistoryShipType.getShipTypeCode());
		dmHistoryShipTypeImpl.setShipTypeName(dmHistoryShipType.getShipTypeName());
		dmHistoryShipTypeImpl.setShipTypeNameVN(dmHistoryShipType.getShipTypeNameVN());
		dmHistoryShipTypeImpl.setShipTypeOrder(dmHistoryShipType.getShipTypeOrder());
		dmHistoryShipTypeImpl.setIsDelete(dmHistoryShipType.getIsDelete());
		dmHistoryShipTypeImpl.setMarkedAsDelete(dmHistoryShipType.getMarkedAsDelete());
		dmHistoryShipTypeImpl.setModifiedDate(dmHistoryShipType.getModifiedDate());
		dmHistoryShipTypeImpl.setRequestedDate(dmHistoryShipType.getRequestedDate());
		dmHistoryShipTypeImpl.setSyncVersion(dmHistoryShipType.getSyncVersion());

		return dmHistoryShipTypeImpl;
	}

	/**
	 * Returns the dm history ship type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history ship type
	 * @return the dm history ship type
	 * @throws com.liferay.portal.NoSuchModelException if a dm history ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryShipType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history ship type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history ship type
	 * @return the dm history ship type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType findByPrimaryKey(int id)
		throws NoSuchDmHistoryShipTypeException, SystemException {
		DmHistoryShipType dmHistoryShipType = fetchByPrimaryKey(id);

		if (dmHistoryShipType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryShipTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryShipType;
	}

	/**
	 * Returns the dm history ship type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history ship type
	 * @return the dm history ship type, or <code>null</code> if a dm history ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryShipType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history ship type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history ship type
	 * @return the dm history ship type, or <code>null</code> if a dm history ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType fetchByPrimaryKey(int id)
		throws SystemException {
		DmHistoryShipType dmHistoryShipType = (DmHistoryShipType)EntityCacheUtil.getResult(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryShipTypeImpl.class, id);

		if (dmHistoryShipType == _nullDmHistoryShipType) {
			return null;
		}

		if (dmHistoryShipType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryShipType = (DmHistoryShipType)session.get(DmHistoryShipTypeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryShipType != null) {
					cacheResult(dmHistoryShipType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryShipTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryShipTypeImpl.class, id, _nullDmHistoryShipType);
				}

				closeSession(session);
			}
		}

		return dmHistoryShipType;
	}

	/**
	 * Returns all the dm history ship types where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the matching dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipType> findByShipTypeCode(String shipTypeCode)
		throws SystemException {
		return findByShipTypeCode(shipTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history ship types where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of dm history ship types
	 * @param end the upper bound of the range of dm history ship types (not inclusive)
	 * @return the range of matching dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipType> findByShipTypeCode(String shipTypeCode,
		int start, int end) throws SystemException {
		return findByShipTypeCode(shipTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ship types where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of dm history ship types
	 * @param end the upper bound of the range of dm history ship types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipType> findByShipTypeCode(String shipTypeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE;
			finderArgs = new Object[] { shipTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE;
			finderArgs = new Object[] {
					shipTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryShipType> list = (List<DmHistoryShipType>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYSHIPTYPE_WHERE);

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
			}
			else {
				if (shipTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmHistoryShipTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipTypeCode != null) {
					qPos.add(shipTypeCode);
				}

				list = (List<DmHistoryShipType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm history ship type in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history ship type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType findByShipTypeCode_First(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryShipTypeException, SystemException {
		List<DmHistoryShipType> list = findByShipTypeCode(shipTypeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryShipTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history ship type in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history ship type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType findByShipTypeCode_Last(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryShipTypeException, SystemException {
		int count = countByShipTypeCode(shipTypeCode);

		List<DmHistoryShipType> list = findByShipTypeCode(shipTypeCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryShipTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history ship types before and after the current dm history ship type in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history ship type
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history ship type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType[] findByShipTypeCode_PrevAndNext(int id,
		String shipTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryShipTypeException, SystemException {
		DmHistoryShipType dmHistoryShipType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryShipType[] array = new DmHistoryShipTypeImpl[3];

			array[0] = getByShipTypeCode_PrevAndNext(session,
					dmHistoryShipType, shipTypeCode, orderByComparator, true);

			array[1] = dmHistoryShipType;

			array[2] = getByShipTypeCode_PrevAndNext(session,
					dmHistoryShipType, shipTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryShipType getByShipTypeCode_PrevAndNext(Session session,
		DmHistoryShipType dmHistoryShipType, String shipTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYSHIPTYPE_WHERE);

		if (shipTypeCode == null) {
			query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
		}
		else {
			if (shipTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
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
			query.append(DmHistoryShipTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (shipTypeCode != null) {
			qPos.add(shipTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryShipType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryShipType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException} if it could not be found.
	 *
	 * @param shipTypeCode the ship type code
	 * @param syncVersion the sync version
	 * @return the matching dm history ship type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType findByShipTypeCodeAndSyncVersion(
		String shipTypeCode, String syncVersion)
		throws NoSuchDmHistoryShipTypeException, SystemException {
		DmHistoryShipType dmHistoryShipType = fetchByShipTypeCodeAndSyncVersion(shipTypeCode,
				syncVersion);

		if (dmHistoryShipType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryShipTypeException(msg.toString());
		}

		return dmHistoryShipType;
	}

	/**
	 * Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param shipTypeCode the ship type code
	 * @param syncVersion the sync version
	 * @return the matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType fetchByShipTypeCodeAndSyncVersion(
		String shipTypeCode, String syncVersion) throws SystemException {
		return fetchByShipTypeCodeAndSyncVersion(shipTypeCode, syncVersion, true);
	}

	/**
	 * Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param shipTypeCode the ship type code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipType fetchByShipTypeCodeAndSyncVersion(
		String shipTypeCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { shipTypeCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYSHIPTYPE_WHERE);

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_1);
			}
			else {
				if (shipTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryShipTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipTypeCode != null) {
					qPos.add(shipTypeCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryShipType> list = q.list();

				result = list;

				DmHistoryShipType dmHistoryShipType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryShipType = list.get(0);

					cacheResult(dmHistoryShipType);

					if ((dmHistoryShipType.getShipTypeCode() == null) ||
							!dmHistoryShipType.getShipTypeCode()
												  .equals(shipTypeCode) ||
							(dmHistoryShipType.getSyncVersion() == null) ||
							!dmHistoryShipType.getSyncVersion()
												  .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
							finderArgs, dmHistoryShipType);
					}
				}

				return dmHistoryShipType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SHIPTYPECODEANDSYNCVERSION,
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
				return (DmHistoryShipType)result;
			}
		}
	}

	/**
	 * Returns all the dm history ship types.
	 *
	 * @return the dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history ship types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ship types
	 * @param end the upper bound of the range of dm history ship types (not inclusive)
	 * @return the range of dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ship types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ship types
	 * @param end the upper bound of the range of dm history ship types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipType> findAll(int start, int end,
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

		List<DmHistoryShipType> list = (List<DmHistoryShipType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYSHIPTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYSHIPTYPE.concat(DmHistoryShipTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryShipType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryShipType>)QueryUtil.list(q,
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
	 * Removes all the dm history ship types where shipTypeCode = &#63; from the database.
	 *
	 * @param shipTypeCode the ship type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByShipTypeCode(String shipTypeCode)
		throws SystemException {
		for (DmHistoryShipType dmHistoryShipType : findByShipTypeCode(
				shipTypeCode)) {
			dmHistoryShipTypePersistence.remove(dmHistoryShipType);
		}
	}

	/**
	 * Removes the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param shipTypeCode the ship type code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByShipTypeCodeAndSyncVersion(String shipTypeCode,
		String syncVersion)
		throws NoSuchDmHistoryShipTypeException, SystemException {
		DmHistoryShipType dmHistoryShipType = findByShipTypeCodeAndSyncVersion(shipTypeCode,
				syncVersion);

		dmHistoryShipTypePersistence.remove(dmHistoryShipType);
	}

	/**
	 * Removes all the dm history ship types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryShipType dmHistoryShipType : findAll()) {
			dmHistoryShipTypePersistence.remove(dmHistoryShipType);
		}
	}

	/**
	 * Returns the number of dm history ship types where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the number of matching dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByShipTypeCode(String shipTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { shipTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYSHIPTYPE_WHERE);

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
			}
			else {
				if (shipTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipTypeCode != null) {
					qPos.add(shipTypeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history ship types where shipTypeCode = &#63; and syncVersion = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByShipTypeCodeAndSyncVersion(String shipTypeCode,
		String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { shipTypeCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SHIPTYPECODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYSHIPTYPE_WHERE);

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_1);
			}
			else {
				if (shipTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipTypeCode != null) {
					qPos.add(shipTypeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SHIPTYPECODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history ship types.
	 *
	 * @return the number of dm history ship types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYSHIPTYPE);

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
	 * Initializes the dm history ship type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryShipType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryShipType>> listenersList = new ArrayList<ModelListener<DmHistoryShipType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryShipType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryShipTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYSHIPTYPE = "SELECT dmHistoryShipType FROM DmHistoryShipType dmHistoryShipType";
	private static final String _SQL_SELECT_DMHISTORYSHIPTYPE_WHERE = "SELECT dmHistoryShipType FROM DmHistoryShipType dmHistoryShipType WHERE ";
	private static final String _SQL_COUNT_DMHISTORYSHIPTYPE = "SELECT COUNT(dmHistoryShipType) FROM DmHistoryShipType dmHistoryShipType";
	private static final String _SQL_COUNT_DMHISTORYSHIPTYPE_WHERE = "SELECT COUNT(dmHistoryShipType) FROM DmHistoryShipType dmHistoryShipType WHERE ";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1 = "dmHistoryShipType.shipTypeCode IS NULL";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2 = "dmHistoryShipType.shipTypeCode = ?";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3 = "(dmHistoryShipType.shipTypeCode IS NULL OR dmHistoryShipType.shipTypeCode = ?)";
	private static final String _FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_1 =
		"dmHistoryShipType.shipTypeCode IS NULL AND ";
	private static final String _FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_2 =
		"dmHistoryShipType.shipTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SHIPTYPECODE_3 =
		"(dmHistoryShipType.shipTypeCode IS NULL OR dmHistoryShipType.shipTypeCode = ?) AND ";
	private static final String _FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryShipType.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryShipType.syncVersion = ?";
	private static final String _FINDER_COLUMN_SHIPTYPECODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryShipType.syncVersion IS NULL OR dmHistoryShipType.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryShipType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryShipType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryShipType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryShipTypePersistenceImpl.class);
	private static DmHistoryShipType _nullDmHistoryShipType = new DmHistoryShipTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryShipType> toCacheModel() {
				return _nullDmHistoryShipTypeCacheModel;
			}
		};

	private static CacheModel<DmHistoryShipType> _nullDmHistoryShipTypeCacheModel =
		new CacheModel<DmHistoryShipType>() {
			public DmHistoryShipType toEntityModel() {
				return _nullDmHistoryShipType;
			}
		};
}