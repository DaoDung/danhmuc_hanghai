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

import vn.gt.dao.danhmuc.NoSuchDmPortRegionException;
import vn.gt.dao.danhmuc.model.DmPortRegion;
import vn.gt.dao.danhmuc.model.impl.DmPortRegionImpl;
import vn.gt.dao.danhmuc.model.impl.DmPortRegionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm port region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmPortRegionPersistence
 * @see DmPortRegionUtil
 * @generated
 */
public class DmPortRegionPersistenceImpl extends BasePersistenceImpl<DmPortRegion>
	implements DmPortRegionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmPortRegionUtil} to access the dm port region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmPortRegionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, DmPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortRegionCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, DmPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortRegionCode",
			new String[] { String.class.getName() },
			DmPortRegionModelImpl.PORTREGIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTREGIONCODE = new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortRegionCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONREF =
		new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, DmPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortRegionRef",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONREF =
		new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, DmPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortRegionRef",
			new String[] { String.class.getName() },
			DmPortRegionModelImpl.PORTREGIONREF_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTREGIONREF = new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortRegionRef",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODENAME =
		new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, DmPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortCodeName",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODENAME =
		new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, DmPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortCodeName",
			new String[] { String.class.getName() },
			DmPortRegionModelImpl.PORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODENAME = new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCodeName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, DmPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, DmPortRegionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm port region in the entity cache if it is enabled.
	 *
	 * @param dmPortRegion the dm port region
	 */
	public void cacheResult(DmPortRegion dmPortRegion) {
		EntityCacheUtil.putResult(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionImpl.class, dmPortRegion.getPrimaryKey(), dmPortRegion);

		dmPortRegion.resetOriginalValues();
	}

	/**
	 * Caches the dm port regions in the entity cache if it is enabled.
	 *
	 * @param dmPortRegions the dm port regions
	 */
	public void cacheResult(List<DmPortRegion> dmPortRegions) {
		for (DmPortRegion dmPortRegion : dmPortRegions) {
			if (EntityCacheUtil.getResult(
						DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
						DmPortRegionImpl.class, dmPortRegion.getPrimaryKey()) == null) {
				cacheResult(dmPortRegion);
			}
			else {
				dmPortRegion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm port regions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmPortRegionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmPortRegionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm port region.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmPortRegion dmPortRegion) {
		EntityCacheUtil.removeResult(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionImpl.class, dmPortRegion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmPortRegion> dmPortRegions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmPortRegion dmPortRegion : dmPortRegions) {
			EntityCacheUtil.removeResult(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
				DmPortRegionImpl.class, dmPortRegion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm port region with the primary key. Does not add the dm port region to the database.
	 *
	 * @param id the primary key for the new dm port region
	 * @return the new dm port region
	 */
	public DmPortRegion create(int id) {
		DmPortRegion dmPortRegion = new DmPortRegionImpl();

		dmPortRegion.setNew(true);
		dmPortRegion.setPrimaryKey(id);

		return dmPortRegion;
	}

	/**
	 * Removes the dm port region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm port region
	 * @return the dm port region that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion remove(int id)
		throws NoSuchDmPortRegionException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm port region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm port region
	 * @return the dm port region that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortRegion remove(Serializable primaryKey)
		throws NoSuchDmPortRegionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmPortRegion dmPortRegion = (DmPortRegion)session.get(DmPortRegionImpl.class,
					primaryKey);

			if (dmPortRegion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmPortRegionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmPortRegion);
		}
		catch (NoSuchDmPortRegionException nsee) {
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
	protected DmPortRegion removeImpl(DmPortRegion dmPortRegion)
		throws SystemException {
		dmPortRegion = toUnwrappedModel(dmPortRegion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmPortRegion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmPortRegion);

		return dmPortRegion;
	}

	@Override
	public DmPortRegion updateImpl(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion, boolean merge)
		throws SystemException {
		dmPortRegion = toUnwrappedModel(dmPortRegion);

		boolean isNew = dmPortRegion.isNew();

		DmPortRegionModelImpl dmPortRegionModelImpl = (DmPortRegionModelImpl)dmPortRegion;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmPortRegion, merge);

			dmPortRegion.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmPortRegionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmPortRegionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortRegionModelImpl.getOriginalPortRegionCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);

				args = new Object[] { dmPortRegionModelImpl.getPortRegionCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);
			}

			if ((dmPortRegionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONREF.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortRegionModelImpl.getOriginalPortRegionRef()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONREF,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONREF,
					args);

				args = new Object[] { dmPortRegionModelImpl.getPortRegionRef() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONREF,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONREF,
					args);
			}

			if ((dmPortRegionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODENAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortRegionModelImpl.getOriginalPortCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODENAME,
					args);

				args = new Object[] { dmPortRegionModelImpl.getPortCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODENAME,
					args);
			}
		}

		EntityCacheUtil.putResult(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
			DmPortRegionImpl.class, dmPortRegion.getPrimaryKey(), dmPortRegion);

		return dmPortRegion;
	}

	protected DmPortRegion toUnwrappedModel(DmPortRegion dmPortRegion) {
		if (dmPortRegion instanceof DmPortRegionImpl) {
			return dmPortRegion;
		}

		DmPortRegionImpl dmPortRegionImpl = new DmPortRegionImpl();

		dmPortRegionImpl.setNew(dmPortRegion.isNew());
		dmPortRegionImpl.setPrimaryKey(dmPortRegion.getPrimaryKey());

		dmPortRegionImpl.setId(dmPortRegion.getId());
		dmPortRegionImpl.setPortRegionCode(dmPortRegion.getPortRegionCode());
		dmPortRegionImpl.setPortRegionName(dmPortRegion.getPortRegionName());
		dmPortRegionImpl.setPortRegionNameVN(dmPortRegion.getPortRegionNameVN());
		dmPortRegionImpl.setPortRegionRef(dmPortRegion.getPortRegionRef());
		dmPortRegionImpl.setPortCode(dmPortRegion.getPortCode());
		dmPortRegionImpl.setIsDelete(dmPortRegion.getIsDelete());
		dmPortRegionImpl.setMarkedAsDelete(dmPortRegion.getMarkedAsDelete());
		dmPortRegionImpl.setModifiedDate(dmPortRegion.getModifiedDate());
		dmPortRegionImpl.setRequestedDate(dmPortRegion.getRequestedDate());
		dmPortRegionImpl.setSyncVersion(dmPortRegion.getSyncVersion());

		return dmPortRegionImpl;
	}

	/**
	 * Returns the dm port region with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port region
	 * @return the dm port region
	 * @throws com.liferay.portal.NoSuchModelException if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortRegion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm port region with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortRegionException} if it could not be found.
	 *
	 * @param id the primary key of the dm port region
	 * @return the dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion findByPrimaryKey(int id)
		throws NoSuchDmPortRegionException, SystemException {
		DmPortRegion dmPortRegion = fetchByPrimaryKey(id);

		if (dmPortRegion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmPortRegionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmPortRegion;
	}

	/**
	 * Returns the dm port region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port region
	 * @return the dm port region, or <code>null</code> if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortRegion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm port region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm port region
	 * @return the dm port region, or <code>null</code> if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion fetchByPrimaryKey(int id) throws SystemException {
		DmPortRegion dmPortRegion = (DmPortRegion)EntityCacheUtil.getResult(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
				DmPortRegionImpl.class, id);

		if (dmPortRegion == _nullDmPortRegion) {
			return null;
		}

		if (dmPortRegion == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmPortRegion = (DmPortRegion)session.get(DmPortRegionImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmPortRegion != null) {
					cacheResult(dmPortRegion);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmPortRegionModelImpl.ENTITY_CACHE_ENABLED,
						DmPortRegionImpl.class, id, _nullDmPortRegion);
				}

				closeSession(session);
			}
		}

		return dmPortRegion;
	}

	/**
	 * Returns all the dm port regions where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortRegionCode(String portRegionCode)
		throws SystemException {
		return findByPortRegionCode(portRegionCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port regions where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm port regions
	 * @param end the upper bound of the range of dm port regions (not inclusive)
	 * @return the range of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortRegionCode(String portRegionCode,
		int start, int end) throws SystemException {
		return findByPortRegionCode(portRegionCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port regions where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm port regions
	 * @param end the upper bound of the range of dm port regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortRegionCode(String portRegionCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<DmPortRegion> list = (List<DmPortRegion>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMPORTREGION_WHERE);

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
				query.append(DmPortRegionModelImpl.ORDER_BY_JPQL);
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

				list = (List<DmPortRegion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm port region in the ordered set where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion findByPortRegionCode_First(String portRegionCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		List<DmPortRegion> list = findByPortRegionCode(portRegionCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portRegionCode=");
			msg.append(portRegionCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortRegionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm port region in the ordered set where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion findByPortRegionCode_Last(String portRegionCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		int count = countByPortRegionCode(portRegionCode);

		List<DmPortRegion> list = findByPortRegionCode(portRegionCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portRegionCode=");
			msg.append(portRegionCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortRegionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm port regions before and after the current dm port region in the ordered set where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm port region
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion[] findByPortRegionCode_PrevAndNext(int id,
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		DmPortRegion dmPortRegion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPortRegion[] array = new DmPortRegionImpl[3];

			array[0] = getByPortRegionCode_PrevAndNext(session, dmPortRegion,
					portRegionCode, orderByComparator, true);

			array[1] = dmPortRegion;

			array[2] = getByPortRegionCode_PrevAndNext(session, dmPortRegion,
					portRegionCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPortRegion getByPortRegionCode_PrevAndNext(Session session,
		DmPortRegion dmPortRegion, String portRegionCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORTREGION_WHERE);

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
			query.append(DmPortRegionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmPortRegion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPortRegion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm port regions where portRegionRef = &#63;.
	 *
	 * @param portRegionRef the port region ref
	 * @return the matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortRegionRef(String portRegionRef)
		throws SystemException {
		return findByPortRegionRef(portRegionRef, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port regions where portRegionRef = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionRef the port region ref
	 * @param start the lower bound of the range of dm port regions
	 * @param end the upper bound of the range of dm port regions (not inclusive)
	 * @return the range of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortRegionRef(String portRegionRef,
		int start, int end) throws SystemException {
		return findByPortRegionRef(portRegionRef, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port regions where portRegionRef = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionRef the port region ref
	 * @param start the lower bound of the range of dm port regions
	 * @param end the upper bound of the range of dm port regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortRegionRef(String portRegionRef,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONREF;
			finderArgs = new Object[] { portRegionRef };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONREF;
			finderArgs = new Object[] {
					portRegionRef,
					
					start, end, orderByComparator
				};
		}

		List<DmPortRegion> list = (List<DmPortRegion>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMPORTREGION_WHERE);

			if (portRegionRef == null) {
				query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_1);
			}
			else {
				if (portRegionRef.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmPortRegionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portRegionRef != null) {
					qPos.add(portRegionRef);
				}

				list = (List<DmPortRegion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm port region in the ordered set where portRegionRef = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionRef the port region ref
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion findByPortRegionRef_First(String portRegionRef,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		List<DmPortRegion> list = findByPortRegionRef(portRegionRef, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portRegionRef=");
			msg.append(portRegionRef);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortRegionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm port region in the ordered set where portRegionRef = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portRegionRef the port region ref
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion findByPortRegionRef_Last(String portRegionRef,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		int count = countByPortRegionRef(portRegionRef);

		List<DmPortRegion> list = findByPortRegionRef(portRegionRef, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portRegionRef=");
			msg.append(portRegionRef);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortRegionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm port regions before and after the current dm port region in the ordered set where portRegionRef = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm port region
	 * @param portRegionRef the port region ref
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion[] findByPortRegionRef_PrevAndNext(int id,
		String portRegionRef, OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		DmPortRegion dmPortRegion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPortRegion[] array = new DmPortRegionImpl[3];

			array[0] = getByPortRegionRef_PrevAndNext(session, dmPortRegion,
					portRegionRef, orderByComparator, true);

			array[1] = dmPortRegion;

			array[2] = getByPortRegionRef_PrevAndNext(session, dmPortRegion,
					portRegionRef, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPortRegion getByPortRegionRef_PrevAndNext(Session session,
		DmPortRegion dmPortRegion, String portRegionRef,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORTREGION_WHERE);

		if (portRegionRef == null) {
			query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_1);
		}
		else {
			if (portRegionRef.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_2);
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
			query.append(DmPortRegionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (portRegionRef != null) {
			qPos.add(portRegionRef);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmPortRegion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPortRegion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm port regions where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortCodeName(String portCode)
		throws SystemException {
		return findByPortCodeName(portCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port regions where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm port regions
	 * @param end the upper bound of the range of dm port regions (not inclusive)
	 * @return the range of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortCodeName(String portCode, int start,
		int end) throws SystemException {
		return findByPortCodeName(portCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port regions where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm port regions
	 * @param end the upper bound of the range of dm port regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findByPortCodeName(String portCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODENAME;
			finderArgs = new Object[] { portCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODENAME;
			finderArgs = new Object[] { portCode, start, end, orderByComparator };
		}

		List<DmPortRegion> list = (List<DmPortRegion>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMPORTREGION_WHERE);

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_1);
			}
			else {
				if (portCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmPortRegionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portCode != null) {
					qPos.add(portCode);
				}

				list = (List<DmPortRegion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm port region in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion findByPortCodeName_First(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		List<DmPortRegion> list = findByPortCodeName(portCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortRegionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm port region in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion findByPortCodeName_Last(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		int count = countByPortCodeName(portCode);

		List<DmPortRegion> list = findByPortCodeName(portCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortRegionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm port regions before and after the current dm port region in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm port region
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port region
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPortRegion[] findByPortCodeName_PrevAndNext(int id,
		String portCode, OrderByComparator orderByComparator)
		throws NoSuchDmPortRegionException, SystemException {
		DmPortRegion dmPortRegion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPortRegion[] array = new DmPortRegionImpl[3];

			array[0] = getByPortCodeName_PrevAndNext(session, dmPortRegion,
					portCode, orderByComparator, true);

			array[1] = dmPortRegion;

			array[2] = getByPortCodeName_PrevAndNext(session, dmPortRegion,
					portCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPortRegion getByPortCodeName_PrevAndNext(Session session,
		DmPortRegion dmPortRegion, String portCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORTREGION_WHERE);

		if (portCode == null) {
			query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_1);
		}
		else {
			if (portCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_2);
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
			query.append(DmPortRegionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (portCode != null) {
			qPos.add(portCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmPortRegion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPortRegion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm port regions.
	 *
	 * @return the dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm port regions
	 * @param end the upper bound of the range of dm port regions (not inclusive)
	 * @return the range of dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm port regions
	 * @param end the upper bound of the range of dm port regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPortRegion> findAll(int start, int end,
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

		List<DmPortRegion> list = (List<DmPortRegion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMPORTREGION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMPORTREGION.concat(DmPortRegionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmPortRegion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmPortRegion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm port regions where portRegionCode = &#63; from the database.
	 *
	 * @param portRegionCode the port region code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortRegionCode(String portRegionCode)
		throws SystemException {
		for (DmPortRegion dmPortRegion : findByPortRegionCode(portRegionCode)) {
			remove(dmPortRegion);
		}
	}

	/**
	 * Removes all the dm port regions where portRegionRef = &#63; from the database.
	 *
	 * @param portRegionRef the port region ref
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortRegionRef(String portRegionRef)
		throws SystemException {
		for (DmPortRegion dmPortRegion : findByPortRegionRef(portRegionRef)) {
			remove(dmPortRegion);
		}
	}

	/**
	 * Removes all the dm port regions where portCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortCodeName(String portCode) throws SystemException {
		for (DmPortRegion dmPortRegion : findByPortCodeName(portCode)) {
			remove(dmPortRegion);
		}
	}

	/**
	 * Removes all the dm port regions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmPortRegion dmPortRegion : findAll()) {
			remove(dmPortRegion);
		}
	}

	/**
	 * Returns the number of dm port regions where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the number of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortRegionCode(String portRegionCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { portRegionCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMPORTREGION_WHERE);

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
	 * Returns the number of dm port regions where portRegionRef = &#63;.
	 *
	 * @param portRegionRef the port region ref
	 * @return the number of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortRegionRef(String portRegionRef)
		throws SystemException {
		Object[] finderArgs = new Object[] { portRegionRef };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTREGIONREF,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMPORTREGION_WHERE);

			if (portRegionRef == null) {
				query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_1);
			}
			else {
				if (portRegionRef.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portRegionRef != null) {
					qPos.add(portRegionRef);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTREGIONREF,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm port regions where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the number of matching dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortCodeName(String portCode) throws SystemException {
		Object[] finderArgs = new Object[] { portCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTCODENAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMPORTREGION_WHERE);

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_1);
			}
			else {
				if (portCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODENAME_PORTCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portCode != null) {
					qPos.add(portCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTCODENAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm port regions.
	 *
	 * @return the number of dm port regions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMPORTREGION);

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
	 * Initializes the dm port region persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmPortRegion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmPortRegion>> listenersList = new ArrayList<ModelListener<DmPortRegion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmPortRegion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmPortRegionImpl.class.getName());
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
	private static final String _SQL_SELECT_DMPORTREGION = "SELECT dmPortRegion FROM DmPortRegion dmPortRegion";
	private static final String _SQL_SELECT_DMPORTREGION_WHERE = "SELECT dmPortRegion FROM DmPortRegion dmPortRegion WHERE ";
	private static final String _SQL_COUNT_DMPORTREGION = "SELECT COUNT(dmPortRegion) FROM DmPortRegion dmPortRegion";
	private static final String _SQL_COUNT_DMPORTREGION_WHERE = "SELECT COUNT(dmPortRegion) FROM DmPortRegion dmPortRegion WHERE ";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1 = "dmPortRegion.portRegionCode IS NULL";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2 = "dmPortRegion.portRegionCode = ?";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3 = "(dmPortRegion.portRegionCode IS NULL OR dmPortRegion.portRegionCode = ?)";
	private static final String _FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_1 = "dmPortRegion.portRegionRef IS NULL";
	private static final String _FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_2 = "dmPortRegion.portRegionRef = ?";
	private static final String _FINDER_COLUMN_PORTREGIONREF_PORTREGIONREF_3 = "(dmPortRegion.portRegionRef IS NULL OR dmPortRegion.portRegionRef = ?)";
	private static final String _FINDER_COLUMN_PORTCODENAME_PORTCODE_1 = "dmPortRegion.portCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODENAME_PORTCODE_2 = "dmPortRegion.portCode = ?";
	private static final String _FINDER_COLUMN_PORTCODENAME_PORTCODE_3 = "(dmPortRegion.portCode IS NULL OR dmPortRegion.portCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmPortRegion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmPortRegion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmPortRegion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmPortRegionPersistenceImpl.class);
	private static DmPortRegion _nullDmPortRegion = new DmPortRegionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmPortRegion> toCacheModel() {
				return _nullDmPortRegionCacheModel;
			}
		};

	private static CacheModel<DmPortRegion> _nullDmPortRegionCacheModel = new CacheModel<DmPortRegion>() {
			public DmPortRegion toEntityModel() {
				return _nullDmPortRegion;
			}
		};
}