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

import vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException;
import vn.gt.dao.danhmuc.model.DmHistoryPortRegion;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPortRegionImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPortRegionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history port region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPortRegionPersistence
 * @see DmHistoryPortRegionUtil
 * @generated
 */
public class DmHistoryPortRegionPersistenceImpl extends BasePersistenceImpl<DmHistoryPortRegion>
	implements DmHistoryPortRegionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryPortRegionUtil} to access the dm history port region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryPortRegionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortRegionCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortRegionCode",
			new String[] { String.class.getName() },
			DmHistoryPortRegionModelImpl.PORTREGIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTREGIONCODE = new FinderPath(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortRegionCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION =
		new FinderPath(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPortRegionCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryPortRegionModelImpl.PORTREGIONCODE_COLUMN_BITMASK |
			DmHistoryPortRegionModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTREGIONCODEANDSYNCVERSION =
		new FinderPath(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPortRegionCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history port region in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPortRegion the dm history port region
	 */
	public void cacheResult(DmHistoryPortRegion dmHistoryPortRegion) {
		EntityCacheUtil.putResult(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class, dmHistoryPortRegion.getPrimaryKey(),
			dmHistoryPortRegion);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPortRegion.getPortRegionCode(),
				
			dmHistoryPortRegion.getSyncVersion()
			}, dmHistoryPortRegion);

		dmHistoryPortRegion.resetOriginalValues();
	}

	/**
	 * Caches the dm history port regions in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPortRegions the dm history port regions
	 */
	public void cacheResult(List<DmHistoryPortRegion> dmHistoryPortRegions) {
		for (DmHistoryPortRegion dmHistoryPortRegion : dmHistoryPortRegions) {
			if (EntityCacheUtil.getResult(
						DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortRegionImpl.class,
						dmHistoryPortRegion.getPrimaryKey()) == null) {
				cacheResult(dmHistoryPortRegion);
			}
			else {
				dmHistoryPortRegion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history port regions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryPortRegionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryPortRegionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history port region.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryPortRegion dmHistoryPortRegion) {
		EntityCacheUtil.removeResult(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class, dmHistoryPortRegion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPortRegion.getPortRegionCode(),
				
			dmHistoryPortRegion.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history port region with the primary key. Does not add the dm history port region to the database.
	 *
	 * @param id the primary key for the new dm history port region
	 * @return the new dm history port region
	 */
	public DmHistoryPortRegion create(int id) {
		DmHistoryPortRegion dmHistoryPortRegion = new DmHistoryPortRegionImpl();

		dmHistoryPortRegion.setNew(true);
		dmHistoryPortRegion.setPrimaryKey(id);

		return dmHistoryPortRegion;
	}

	/**
	 * Removes the dm history port region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history port region
	 * @return the dm history port region that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm history port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortRegion remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm history port region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history port region
	 * @return the dm history port region that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion remove(int id)
		throws NoSuchDmHistoryPortRegionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryPortRegion dmHistoryPortRegion = (DmHistoryPortRegion)session.get(DmHistoryPortRegionImpl.class,
					Integer.valueOf(id));

			if (dmHistoryPortRegion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmHistoryPortRegionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmHistoryPortRegionPersistence.remove(dmHistoryPortRegion);
		}
		catch (NoSuchDmHistoryPortRegionException nsee) {
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
	 * Removes the dm history port region from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmHistoryPortRegion the dm history port region
	 * @return the dm history port region that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortRegion remove(DmHistoryPortRegion dmHistoryPortRegion)
		throws SystemException {
		return super.remove(dmHistoryPortRegion);
	}

	@Override
	protected DmHistoryPortRegion removeImpl(
		DmHistoryPortRegion dmHistoryPortRegion) throws SystemException {
		dmHistoryPortRegion = toUnwrappedModel(dmHistoryPortRegion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryPortRegion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmHistoryPortRegionModelImpl dmHistoryPortRegionModelImpl = (DmHistoryPortRegionModelImpl)dmHistoryPortRegion;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPortRegionModelImpl.getPortRegionCode(),
				
			dmHistoryPortRegionModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class, dmHistoryPortRegion.getPrimaryKey());

		return dmHistoryPortRegion;
	}

	@Override
	public DmHistoryPortRegion updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPortRegion dmHistoryPortRegion,
		boolean merge) throws SystemException {
		dmHistoryPortRegion = toUnwrappedModel(dmHistoryPortRegion);

		boolean isNew = dmHistoryPortRegion.isNew();

		DmHistoryPortRegionModelImpl dmHistoryPortRegionModelImpl = (DmHistoryPortRegionModelImpl)dmHistoryPortRegion;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryPortRegion, merge);

			dmHistoryPortRegion.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryPortRegionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryPortRegionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortRegionModelImpl.getOriginalPortRegionCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);

				args = new Object[] {
						dmHistoryPortRegionModelImpl.getPortRegionCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortRegionImpl.class, dmHistoryPortRegion.getPrimaryKey(),
			dmHistoryPortRegion);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
				new Object[] {
					dmHistoryPortRegion.getPortRegionCode(),
					
				dmHistoryPortRegion.getSyncVersion()
				}, dmHistoryPortRegion);
		}
		else {
			if ((dmHistoryPortRegionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortRegionModelImpl.getOriginalPortRegionCode(),
						
						dmHistoryPortRegionModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
					new Object[] {
						dmHistoryPortRegion.getPortRegionCode(),
						
					dmHistoryPortRegion.getSyncVersion()
					}, dmHistoryPortRegion);
			}
		}

		return dmHistoryPortRegion;
	}

	protected DmHistoryPortRegion toUnwrappedModel(
		DmHistoryPortRegion dmHistoryPortRegion) {
		if (dmHistoryPortRegion instanceof DmHistoryPortRegionImpl) {
			return dmHistoryPortRegion;
		}

		DmHistoryPortRegionImpl dmHistoryPortRegionImpl = new DmHistoryPortRegionImpl();

		dmHistoryPortRegionImpl.setNew(dmHistoryPortRegion.isNew());
		dmHistoryPortRegionImpl.setPrimaryKey(dmHistoryPortRegion.getPrimaryKey());

		dmHistoryPortRegionImpl.setId(dmHistoryPortRegion.getId());
		dmHistoryPortRegionImpl.setPortRegionCode(dmHistoryPortRegion.getPortRegionCode());
		dmHistoryPortRegionImpl.setPortRegionName(dmHistoryPortRegion.getPortRegionName());
		dmHistoryPortRegionImpl.setPortRegionNameVN(dmHistoryPortRegion.getPortRegionNameVN());
		dmHistoryPortRegionImpl.setPortRegionRef(dmHistoryPortRegion.getPortRegionRef());
		dmHistoryPortRegionImpl.setPortCode(dmHistoryPortRegion.getPortCode());
		dmHistoryPortRegionImpl.setIsDelete(dmHistoryPortRegion.getIsDelete());
		dmHistoryPortRegionImpl.setMarkedAsDelete(dmHistoryPortRegion.getMarkedAsDelete());
		dmHistoryPortRegionImpl.setModifiedDate(dmHistoryPortRegion.getModifiedDate());
		dmHistoryPortRegionImpl.setRequestedDate(dmHistoryPortRegion.getRequestedDate());
		dmHistoryPortRegionImpl.setSyncVersion(dmHistoryPortRegion.getSyncVersion());

		return dmHistoryPortRegionImpl;
	}

	/**
	 * Returns the dm history port region with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port region
	 * @return the dm history port region
	 * @throws com.liferay.portal.NoSuchModelException if a dm history port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortRegion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history port region with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException} if it could not be found.
	 *
	 * @param id the primary key of the dm history port region
	 * @return the dm history port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion findByPrimaryKey(int id)
		throws NoSuchDmHistoryPortRegionException, SystemException {
		DmHistoryPortRegion dmHistoryPortRegion = fetchByPrimaryKey(id);

		if (dmHistoryPortRegion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryPortRegionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryPortRegion;
	}

	/**
	 * Returns the dm history port region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port region
	 * @return the dm history port region, or <code>null</code> if a dm history port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortRegion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history port region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history port region
	 * @return the dm history port region, or <code>null</code> if a dm history port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion fetchByPrimaryKey(int id)
		throws SystemException {
		DmHistoryPortRegion dmHistoryPortRegion = (DmHistoryPortRegion)EntityCacheUtil.getResult(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPortRegionImpl.class, id);

		if (dmHistoryPortRegion == _nullDmHistoryPortRegion) {
			return null;
		}

		if (dmHistoryPortRegion == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryPortRegion = (DmHistoryPortRegion)session.get(DmHistoryPortRegionImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryPortRegion != null) {
					cacheResult(dmHistoryPortRegion);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryPortRegionModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortRegionImpl.class, id,
						_nullDmHistoryPortRegion);
				}

				closeSession(session);
			}
		}

		return dmHistoryPortRegion;
	}

	/**
	 * Returns all the dm history port regions where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the matching dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortRegion> findByPortRegionCode(String portRegionCode)
		throws SystemException {
		return findByPortRegionCode(portRegionCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history port regions where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm history port regions
	 * @param end the upper bound of the range of dm history port regions (not inclusive)
	 * @return the range of matching dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortRegion> findByPortRegionCode(
		String portRegionCode, int start, int end) throws SystemException {
		return findByPortRegionCode(portRegionCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history port regions where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm history port regions
	 * @param end the upper bound of the range of dm history port regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortRegion> findByPortRegionCode(
		String portRegionCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE;
			finderArgs = new Object[] { portRegionCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONCODE;
			finderArgs = new Object[] {
					portRegionCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryPortRegion> list = (List<DmHistoryPortRegion>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYPORTREGION_WHERE);

			if (portRegionCode == null) {
				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1);
			}
			else {
				if (portRegionCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmHistoryPortRegionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portRegionCode != null) {
					qPos.add(portRegionCode);
				}

				list = (List<DmHistoryPortRegion>)QueryUtil.list(q,
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
	 * Returns the first dm history port region in the ordered set where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion findByPortRegionCode_First(
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortRegionException, SystemException {
		List<DmHistoryPortRegion> list = findByPortRegionCode(portRegionCode,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portRegionCode=");
			msg.append(portRegionCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPortRegionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history port region in the ordered set where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion findByPortRegionCode_Last(
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortRegionException, SystemException {
		int count = countByPortRegionCode(portRegionCode);

		List<DmHistoryPortRegion> list = findByPortRegionCode(portRegionCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portRegionCode=");
			msg.append(portRegionCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPortRegionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history port regions before and after the current dm history port region in the ordered set where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history port region
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion[] findByPortRegionCode_PrevAndNext(int id,
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortRegionException, SystemException {
		DmHistoryPortRegion dmHistoryPortRegion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPortRegion[] array = new DmHistoryPortRegionImpl[3];

			array[0] = getByPortRegionCode_PrevAndNext(session,
					dmHistoryPortRegion, portRegionCode, orderByComparator, true);

			array[1] = dmHistoryPortRegion;

			array[2] = getByPortRegionCode_PrevAndNext(session,
					dmHistoryPortRegion, portRegionCode, orderByComparator,
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

	protected DmHistoryPortRegion getByPortRegionCode_PrevAndNext(
		Session session, DmHistoryPortRegion dmHistoryPortRegion,
		String portRegionCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYPORTREGION_WHERE);

		if (portRegionCode == null) {
			query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1);
		}
		else {
			if (portRegionCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2);
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
			query.append(DmHistoryPortRegionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (portRegionCode != null) {
			qPos.add(portRegionCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPortRegion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPortRegion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException} if it could not be found.
	 *
	 * @param portRegionCode the port region code
	 * @param syncVersion the sync version
	 * @return the matching dm history port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion findByPortRegionCodeAndSyncVersion(
		String portRegionCode, String syncVersion)
		throws NoSuchDmHistoryPortRegionException, SystemException {
		DmHistoryPortRegion dmHistoryPortRegion = fetchByPortRegionCodeAndSyncVersion(portRegionCode,
				syncVersion);

		if (dmHistoryPortRegion == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portRegionCode=");
			msg.append(portRegionCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryPortRegionException(msg.toString());
		}

		return dmHistoryPortRegion;
	}

	/**
	 * Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portRegionCode the port region code
	 * @param syncVersion the sync version
	 * @return the matching dm history port region, or <code>null</code> if a matching dm history port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion fetchByPortRegionCodeAndSyncVersion(
		String portRegionCode, String syncVersion) throws SystemException {
		return fetchByPortRegionCodeAndSyncVersion(portRegionCode, syncVersion,
			true);
	}

	/**
	 * Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portRegionCode the port region code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history port region, or <code>null</code> if a matching dm history port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortRegion fetchByPortRegionCodeAndSyncVersion(
		String portRegionCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { portRegionCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYPORTREGION_WHERE);

			if (portRegionCode == null) {
				query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_1);
			}
			else {
				if (portRegionCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryPortRegionModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portRegionCode != null) {
					qPos.add(portRegionCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryPortRegion> list = q.list();

				result = list;

				DmHistoryPortRegion dmHistoryPortRegion = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryPortRegion = list.get(0);

					cacheResult(dmHistoryPortRegion);

					if ((dmHistoryPortRegion.getPortRegionCode() == null) ||
							!dmHistoryPortRegion.getPortRegionCode()
													.equals(portRegionCode) ||
							(dmHistoryPortRegion.getSyncVersion() == null) ||
							!dmHistoryPortRegion.getSyncVersion()
													.equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
							finderArgs, dmHistoryPortRegion);
					}
				}

				return dmHistoryPortRegion;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTREGIONCODEANDSYNCVERSION,
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
				return (DmHistoryPortRegion)result;
			}
		}
	}

	/**
	 * Returns all the dm history port regions.
	 *
	 * @return the dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortRegion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history port regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history port regions
	 * @param end the upper bound of the range of dm history port regions (not inclusive)
	 * @return the range of dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortRegion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history port regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history port regions
	 * @param end the upper bound of the range of dm history port regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortRegion> findAll(int start, int end,
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

		List<DmHistoryPortRegion> list = (List<DmHistoryPortRegion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYPORTREGION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYPORTREGION.concat(DmHistoryPortRegionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryPortRegion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryPortRegion>)QueryUtil.list(q,
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
	 * Removes all the dm history port regions where portRegionCode = &#63; from the database.
	 *
	 * @param portRegionCode the port region code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortRegionCode(String portRegionCode)
		throws SystemException {
		for (DmHistoryPortRegion dmHistoryPortRegion : findByPortRegionCode(
				portRegionCode)) {
			dmHistoryPortRegionPersistence.remove(dmHistoryPortRegion);
		}
	}

	/**
	 * Removes the dm history port region where portRegionCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param portRegionCode the port region code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortRegionCodeAndSyncVersion(String portRegionCode,
		String syncVersion)
		throws NoSuchDmHistoryPortRegionException, SystemException {
		DmHistoryPortRegion dmHistoryPortRegion = findByPortRegionCodeAndSyncVersion(portRegionCode,
				syncVersion);

		dmHistoryPortRegionPersistence.remove(dmHistoryPortRegion);
	}

	/**
	 * Removes all the dm history port regions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryPortRegion dmHistoryPortRegion : findAll()) {
			dmHistoryPortRegionPersistence.remove(dmHistoryPortRegion);
		}
	}

	/**
	 * Returns the number of dm history port regions where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the number of matching dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortRegionCode(String portRegionCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { portRegionCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPORTREGION_WHERE);

			if (portRegionCode == null) {
				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1);
			}
			else {
				if (portRegionCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portRegionCode != null) {
					qPos.add(portRegionCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history port regions where portRegionCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortRegionCodeAndSyncVersion(String portRegionCode,
		String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { portRegionCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTREGIONCODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYPORTREGION_WHERE);

			if (portRegionCode == null) {
				query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_1);
			}
			else {
				if (portRegionCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portRegionCode != null) {
					qPos.add(portRegionCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTREGIONCODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history port regions.
	 *
	 * @return the number of dm history port regions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYPORTREGION);

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
	 * Initializes the dm history port region persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryPortRegion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryPortRegion>> listenersList = new ArrayList<ModelListener<DmHistoryPortRegion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryPortRegion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryPortRegionImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYPORTREGION = "SELECT dmHistoryPortRegion FROM DmHistoryPortRegion dmHistoryPortRegion";
	private static final String _SQL_SELECT_DMHISTORYPORTREGION_WHERE = "SELECT dmHistoryPortRegion FROM DmHistoryPortRegion dmHistoryPortRegion WHERE ";
	private static final String _SQL_COUNT_DMHISTORYPORTREGION = "SELECT COUNT(dmHistoryPortRegion) FROM DmHistoryPortRegion dmHistoryPortRegion";
	private static final String _SQL_COUNT_DMHISTORYPORTREGION_WHERE = "SELECT COUNT(dmHistoryPortRegion) FROM DmHistoryPortRegion dmHistoryPortRegion WHERE ";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1 = "dmHistoryPortRegion.portRegionCode IS NULL";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2 = "dmHistoryPortRegion.portRegionCode = ?";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3 = "(dmHistoryPortRegion.portRegionCode IS NULL OR dmHistoryPortRegion.portRegionCode = ?)";
	private static final String _FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_1 =
		"dmHistoryPortRegion.portRegionCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_2 =
		"dmHistoryPortRegion.portRegionCode = ? AND ";
	private static final String _FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_PORTREGIONCODE_3 =
		"(dmHistoryPortRegion.portRegionCode IS NULL OR dmHistoryPortRegion.portRegionCode = ?) AND ";
	private static final String _FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryPortRegion.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryPortRegion.syncVersion = ?";
	private static final String _FINDER_COLUMN_PORTREGIONCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryPortRegion.syncVersion IS NULL OR dmHistoryPortRegion.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryPortRegion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryPortRegion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryPortRegion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryPortRegionPersistenceImpl.class);
	private static DmHistoryPortRegion _nullDmHistoryPortRegion = new DmHistoryPortRegionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryPortRegion> toCacheModel() {
				return _nullDmHistoryPortRegionCacheModel;
			}
		};

	private static CacheModel<DmHistoryPortRegion> _nullDmHistoryPortRegionCacheModel =
		new CacheModel<DmHistoryPortRegion>() {
			public DmHistoryPortRegion toEntityModel() {
				return _nullDmHistoryPortRegion;
			}
		};
}