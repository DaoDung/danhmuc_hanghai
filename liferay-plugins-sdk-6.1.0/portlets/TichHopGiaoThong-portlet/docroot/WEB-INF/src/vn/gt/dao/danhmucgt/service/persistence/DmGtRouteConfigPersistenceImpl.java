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

import vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;
import vn.gt.dao.danhmucgt.model.DmGtRouteConfig;
import vn.gt.dao.danhmucgt.model.impl.DmGtRouteConfigImpl;
import vn.gt.dao.danhmucgt.model.impl.DmGtRouteConfigModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm gt route config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtRouteConfigPersistence
 * @see DmGtRouteConfigUtil
 * @generated
 */
public class DmGtRouteConfigPersistenceImpl extends BasePersistenceImpl<DmGtRouteConfig>
	implements DmGtRouteConfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtRouteConfigUtil} to access the dm gt route config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtRouteConfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_ROUTECODE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRouteCode", new String[] { String.class.getName() },
			DmGtRouteConfigModelImpl.ROUTECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ROUTECODE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRouteCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISDELETE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIsDelete",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE =
		new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIsDelete",
			new String[] { Integer.class.getName() },
			DmGtRouteConfigModelImpl.ISDELETE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISDELETE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIsDelete",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCCODE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLocCode",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE =
		new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocCode",
			new String[] { String.class.getName(), Integer.class.getName() },
			DmGtRouteConfigModelImpl.LOCCODE_COLUMN_BITMASK |
			DmGtRouteConfigModelImpl.ISDELETE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCCODE = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocCode",
			new String[] { String.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm gt route config in the entity cache if it is enabled.
	 *
	 * @param dmGtRouteConfig the dm gt route config
	 */
	public void cacheResult(DmGtRouteConfig dmGtRouteConfig) {
		EntityCacheUtil.putResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, dmGtRouteConfig.getPrimaryKey(),
			dmGtRouteConfig);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE,
			new Object[] { dmGtRouteConfig.getRouteCode() }, dmGtRouteConfig);

		dmGtRouteConfig.resetOriginalValues();
	}

	/**
	 * Caches the dm gt route configs in the entity cache if it is enabled.
	 *
	 * @param dmGtRouteConfigs the dm gt route configs
	 */
	public void cacheResult(List<DmGtRouteConfig> dmGtRouteConfigs) {
		for (DmGtRouteConfig dmGtRouteConfig : dmGtRouteConfigs) {
			if (EntityCacheUtil.getResult(
						DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
						DmGtRouteConfigImpl.class,
						dmGtRouteConfig.getPrimaryKey()) == null) {
				cacheResult(dmGtRouteConfig);
			}
			else {
				dmGtRouteConfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt route configs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtRouteConfigImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtRouteConfigImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt route config.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtRouteConfig dmGtRouteConfig) {
		EntityCacheUtil.removeResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, dmGtRouteConfig.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ROUTECODE,
			new Object[] { dmGtRouteConfig.getRouteCode() });
	}

	/**
	 * Creates a new dm gt route config with the primary key. Does not add the dm gt route config to the database.
	 *
	 * @param id the primary key for the new dm gt route config
	 * @return the new dm gt route config
	 */
	public DmGtRouteConfig create(long id) {
		DmGtRouteConfig dmGtRouteConfig = new DmGtRouteConfigImpl();

		dmGtRouteConfig.setNew(true);
		dmGtRouteConfig.setPrimaryKey(id);

		return dmGtRouteConfig;
	}

	/**
	 * Removes the dm gt route config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt route config
	 * @return the dm gt route config that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the dm gt route config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt route config
	 * @return the dm gt route config that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig remove(long id)
		throws NoSuchDmGtRouteConfigException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtRouteConfig dmGtRouteConfig = (DmGtRouteConfig)session.get(DmGtRouteConfigImpl.class,
					Long.valueOf(id));

			if (dmGtRouteConfig == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmGtRouteConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmGtRouteConfigPersistence.remove(dmGtRouteConfig);
		}
		catch (NoSuchDmGtRouteConfigException nsee) {
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
	 * Removes the dm gt route config from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmGtRouteConfig the dm gt route config
	 * @return the dm gt route config that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig remove(DmGtRouteConfig dmGtRouteConfig)
		throws SystemException {
		return super.remove(dmGtRouteConfig);
	}

	@Override
	protected DmGtRouteConfig removeImpl(DmGtRouteConfig dmGtRouteConfig)
		throws SystemException {
		dmGtRouteConfig = toUnwrappedModel(dmGtRouteConfig);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGtRouteConfig);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmGtRouteConfigModelImpl dmGtRouteConfigModelImpl = (DmGtRouteConfigModelImpl)dmGtRouteConfig;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ROUTECODE,
			new Object[] { dmGtRouteConfigModelImpl.getRouteCode() });

		EntityCacheUtil.removeResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, dmGtRouteConfig.getPrimaryKey());

		return dmGtRouteConfig;
	}

	@Override
	public DmGtRouteConfig updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtRouteConfig dmGtRouteConfig, boolean merge)
		throws SystemException {
		dmGtRouteConfig = toUnwrappedModel(dmGtRouteConfig);

		boolean isNew = dmGtRouteConfig.isNew();

		DmGtRouteConfigModelImpl dmGtRouteConfigModelImpl = (DmGtRouteConfigModelImpl)dmGtRouteConfig;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGtRouteConfig, merge);

			dmGtRouteConfig.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGtRouteConfigModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmGtRouteConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(dmGtRouteConfigModelImpl.getOriginalIsDelete())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISDELETE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE,
					args);

				args = new Object[] {
						Integer.valueOf(dmGtRouteConfigModelImpl.getIsDelete())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISDELETE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE,
					args);
			}

			if ((dmGtRouteConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGtRouteConfigModelImpl.getOriginalLocCode(),
						Integer.valueOf(dmGtRouteConfigModelImpl.getOriginalIsDelete())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);

				args = new Object[] {
						dmGtRouteConfigModelImpl.getLocCode(),
						Integer.valueOf(dmGtRouteConfigModelImpl.getIsDelete())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
			DmGtRouteConfigImpl.class, dmGtRouteConfig.getPrimaryKey(),
			dmGtRouteConfig);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE,
				new Object[] { dmGtRouteConfig.getRouteCode() }, dmGtRouteConfig);
		}
		else {
			if ((dmGtRouteConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ROUTECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGtRouteConfigModelImpl.getOriginalRouteCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROUTECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ROUTECODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE,
					new Object[] { dmGtRouteConfig.getRouteCode() },
					dmGtRouteConfig);
			}
		}

		return dmGtRouteConfig;
	}

	protected DmGtRouteConfig toUnwrappedModel(DmGtRouteConfig dmGtRouteConfig) {
		if (dmGtRouteConfig instanceof DmGtRouteConfigImpl) {
			return dmGtRouteConfig;
		}

		DmGtRouteConfigImpl dmGtRouteConfigImpl = new DmGtRouteConfigImpl();

		dmGtRouteConfigImpl.setNew(dmGtRouteConfig.isNew());
		dmGtRouteConfigImpl.setPrimaryKey(dmGtRouteConfig.getPrimaryKey());

		dmGtRouteConfigImpl.setId(dmGtRouteConfig.getId());
		dmGtRouteConfigImpl.setRouteCode(dmGtRouteConfig.getRouteCode());
		dmGtRouteConfigImpl.setOrganizationCode(dmGtRouteConfig.getOrganizationCode());
		dmGtRouteConfigImpl.setLocCode(dmGtRouteConfig.getLocCode());
		dmGtRouteConfigImpl.setIpName(dmGtRouteConfig.getIpName());
		dmGtRouteConfigImpl.setPortName(dmGtRouteConfig.getPortName());
		dmGtRouteConfigImpl.setLinkAddress(dmGtRouteConfig.getLinkAddress());
		dmGtRouteConfigImpl.setIsDelete(dmGtRouteConfig.getIsDelete());
		dmGtRouteConfigImpl.setMarkedAsDelete(dmGtRouteConfig.getMarkedAsDelete());
		dmGtRouteConfigImpl.setModifiedDate(dmGtRouteConfig.getModifiedDate());
		dmGtRouteConfigImpl.setRequestedDate(dmGtRouteConfig.getRequestedDate());
		dmGtRouteConfigImpl.setSyncVersion(dmGtRouteConfig.getSyncVersion());

		return dmGtRouteConfigImpl;
	}

	/**
	 * Returns the dm gt route config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt route config
	 * @return the dm gt route config
	 * @throws com.liferay.portal.NoSuchModelException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm gt route config with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt route config
	 * @return the dm gt route config
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig findByPrimaryKey(long id)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = fetchByPrimaryKey(id);

		if (dmGtRouteConfig == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGtRouteConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGtRouteConfig;
	}

	/**
	 * Returns the dm gt route config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt route config
	 * @return the dm gt route config, or <code>null</code> if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtRouteConfig fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm gt route config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt route config
	 * @return the dm gt route config, or <code>null</code> if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig fetchByPrimaryKey(long id) throws SystemException {
		DmGtRouteConfig dmGtRouteConfig = (DmGtRouteConfig)EntityCacheUtil.getResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
				DmGtRouteConfigImpl.class, id);

		if (dmGtRouteConfig == _nullDmGtRouteConfig) {
			return null;
		}

		if (dmGtRouteConfig == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGtRouteConfig = (DmGtRouteConfig)session.get(DmGtRouteConfigImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGtRouteConfig != null) {
					cacheResult(dmGtRouteConfig);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGtRouteConfigModelImpl.ENTITY_CACHE_ENABLED,
						DmGtRouteConfigImpl.class, id, _nullDmGtRouteConfig);
				}

				closeSession(session);
			}
		}

		return dmGtRouteConfig;
	}

	/**
	 * Returns the dm gt route config where routeCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException} if it could not be found.
	 *
	 * @param routeCode the route code
	 * @return the matching dm gt route config
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig findByRouteCode(String routeCode)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = fetchByRouteCode(routeCode);

		if (dmGtRouteConfig == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("routeCode=");
			msg.append(routeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmGtRouteConfigException(msg.toString());
		}

		return dmGtRouteConfig;
	}

	/**
	 * Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param routeCode the route code
	 * @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig fetchByRouteCode(String routeCode)
		throws SystemException {
		return fetchByRouteCode(routeCode, true);
	}

	/**
	 * Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param routeCode the route code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig fetchByRouteCode(String routeCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { routeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ROUTECODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMGTROUTECONFIG_WHERE);

			if (routeCode == null) {
				query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_1);
			}
			else {
				if (routeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_2);
				}
			}

			query.append(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (routeCode != null) {
					qPos.add(routeCode);
				}

				List<DmGtRouteConfig> list = q.list();

				result = list;

				DmGtRouteConfig dmGtRouteConfig = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE,
						finderArgs, list);
				}
				else {
					dmGtRouteConfig = list.get(0);

					cacheResult(dmGtRouteConfig);

					if ((dmGtRouteConfig.getRouteCode() == null) ||
							!dmGtRouteConfig.getRouteCode().equals(routeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ROUTECODE,
							finderArgs, dmGtRouteConfig);
					}
				}

				return dmGtRouteConfig;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ROUTECODE,
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
				return (DmGtRouteConfig)result;
			}
		}
	}

	/**
	 * Returns all the dm gt route configs where isDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @return the matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findByIsDelete(int isDelete)
		throws SystemException {
		return findByIsDelete(isDelete, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm gt route configs where isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @return the range of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findByIsDelete(int isDelete, int start, int end)
		throws SystemException {
		return findByIsDelete(isDelete, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt route configs where isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findByIsDelete(int isDelete, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISDELETE;
			finderArgs = new Object[] { isDelete };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISDELETE;
			finderArgs = new Object[] { isDelete, start, end, orderByComparator };
		}

		List<DmGtRouteConfig> list = (List<DmGtRouteConfig>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMGTROUTECONFIG_WHERE);

			query.append(_FINDER_COLUMN_ISDELETE_ISDELETE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isDelete);

				list = (List<DmGtRouteConfig>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm gt route config in the ordered set where isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt route config
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig findByIsDelete_First(int isDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		List<DmGtRouteConfig> list = findByIsDelete(isDelete, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("isDelete=");
			msg.append(isDelete);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGtRouteConfigException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm gt route config in the ordered set where isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt route config
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig findByIsDelete_Last(int isDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		int count = countByIsDelete(isDelete);

		List<DmGtRouteConfig> list = findByIsDelete(isDelete, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("isDelete=");
			msg.append(isDelete);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGtRouteConfigException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm gt route configs before and after the current dm gt route config in the ordered set where isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm gt route config
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm gt route config
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig[] findByIsDelete_PrevAndNext(long id, int isDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGtRouteConfig[] array = new DmGtRouteConfigImpl[3];

			array[0] = getByIsDelete_PrevAndNext(session, dmGtRouteConfig,
					isDelete, orderByComparator, true);

			array[1] = dmGtRouteConfig;

			array[2] = getByIsDelete_PrevAndNext(session, dmGtRouteConfig,
					isDelete, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGtRouteConfig getByIsDelete_PrevAndNext(Session session,
		DmGtRouteConfig dmGtRouteConfig, int isDelete,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGTROUTECONFIG_WHERE);

		query.append(_FINDER_COLUMN_ISDELETE_ISDELETE_2);

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
			query.append(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isDelete);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGtRouteConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGtRouteConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm gt route configs where locCode = &#63; and isDelete = &#63;.
	 *
	 * @param locCode the loc code
	 * @param isDelete the is delete
	 * @return the matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findByLocCode(String locCode, int isDelete)
		throws SystemException {
		return findByLocCode(locCode, isDelete, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt route configs where locCode = &#63; and isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param isDelete the is delete
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @return the range of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findByLocCode(String locCode, int isDelete,
		int start, int end) throws SystemException {
		return findByLocCode(locCode, isDelete, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt route configs where locCode = &#63; and isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param isDelete the is delete
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findByLocCode(String locCode, int isDelete,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE;
			finderArgs = new Object[] { locCode, isDelete };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCCODE;
			finderArgs = new Object[] {
					locCode, isDelete,
					
					start, end, orderByComparator
				};
		}

		List<DmGtRouteConfig> list = (List<DmGtRouteConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DMGTROUTECONFIG_WHERE);

			if (locCode == null) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
			}
			else {
				if (locCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
				}
			}

			query.append(_FINDER_COLUMN_LOCCODE_ISDELETE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (locCode != null) {
					qPos.add(locCode);
				}

				qPos.add(isDelete);

				list = (List<DmGtRouteConfig>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm gt route config in the ordered set where locCode = &#63; and isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt route config
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig findByLocCode_First(String locCode, int isDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		List<DmGtRouteConfig> list = findByLocCode(locCode, isDelete, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("locCode=");
			msg.append(locCode);

			msg.append(", isDelete=");
			msg.append(isDelete);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGtRouteConfigException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm gt route config in the ordered set where locCode = &#63; and isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt route config
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig findByLocCode_Last(String locCode, int isDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		int count = countByLocCode(locCode, isDelete);

		List<DmGtRouteConfig> list = findByLocCode(locCode, isDelete,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("locCode=");
			msg.append(locCode);

			msg.append(", isDelete=");
			msg.append(isDelete);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGtRouteConfigException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm gt route configs before and after the current dm gt route config in the ordered set where locCode = &#63; and isDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm gt route config
	 * @param locCode the loc code
	 * @param isDelete the is delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm gt route config
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtRouteConfig[] findByLocCode_PrevAndNext(long id, String locCode,
		int isDelete, OrderByComparator orderByComparator)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGtRouteConfig[] array = new DmGtRouteConfigImpl[3];

			array[0] = getByLocCode_PrevAndNext(session, dmGtRouteConfig,
					locCode, isDelete, orderByComparator, true);

			array[1] = dmGtRouteConfig;

			array[2] = getByLocCode_PrevAndNext(session, dmGtRouteConfig,
					locCode, isDelete, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGtRouteConfig getByLocCode_PrevAndNext(Session session,
		DmGtRouteConfig dmGtRouteConfig, String locCode, int isDelete,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGTROUTECONFIG_WHERE);

		if (locCode == null) {
			query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
		}
		else {
			if (locCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
			}
		}

		query.append(_FINDER_COLUMN_LOCCODE_ISDELETE_2);

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
			query.append(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (locCode != null) {
			qPos.add(locCode);
		}

		qPos.add(isDelete);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGtRouteConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGtRouteConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm gt route configs.
	 *
	 * @return the dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt route configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @return the range of dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt route configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt route configs
	 * @param end the upper bound of the range of dm gt route configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtRouteConfig> findAll(int start, int end,
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

		List<DmGtRouteConfig> list = (List<DmGtRouteConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTROUTECONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTROUTECONFIG.concat(DmGtRouteConfigModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGtRouteConfig>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGtRouteConfig>)QueryUtil.list(q,
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
	 * Removes the dm gt route config where routeCode = &#63; from the database.
	 *
	 * @param routeCode the route code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRouteCode(String routeCode)
		throws NoSuchDmGtRouteConfigException, SystemException {
		DmGtRouteConfig dmGtRouteConfig = findByRouteCode(routeCode);

		dmGtRouteConfigPersistence.remove(dmGtRouteConfig);
	}

	/**
	 * Removes all the dm gt route configs where isDelete = &#63; from the database.
	 *
	 * @param isDelete the is delete
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByIsDelete(int isDelete) throws SystemException {
		for (DmGtRouteConfig dmGtRouteConfig : findByIsDelete(isDelete)) {
			dmGtRouteConfigPersistence.remove(dmGtRouteConfig);
		}
	}

	/**
	 * Removes all the dm gt route configs where locCode = &#63; and isDelete = &#63; from the database.
	 *
	 * @param locCode the loc code
	 * @param isDelete the is delete
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByLocCode(String locCode, int isDelete)
		throws SystemException {
		for (DmGtRouteConfig dmGtRouteConfig : findByLocCode(locCode, isDelete)) {
			dmGtRouteConfigPersistence.remove(dmGtRouteConfig);
		}
	}

	/**
	 * Removes all the dm gt route configs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGtRouteConfig dmGtRouteConfig : findAll()) {
			dmGtRouteConfigPersistence.remove(dmGtRouteConfig);
		}
	}

	/**
	 * Returns the number of dm gt route configs where routeCode = &#63;.
	 *
	 * @param routeCode the route code
	 * @return the number of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRouteCode(String routeCode) throws SystemException {
		Object[] finderArgs = new Object[] { routeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ROUTECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTROUTECONFIG_WHERE);

			if (routeCode == null) {
				query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_1);
			}
			else {
				if (routeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ROUTECODE_ROUTECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (routeCode != null) {
					qPos.add(routeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ROUTECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm gt route configs where isDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @return the number of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByIsDelete(int isDelete) throws SystemException {
		Object[] finderArgs = new Object[] { isDelete };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ISDELETE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTROUTECONFIG_WHERE);

			query.append(_FINDER_COLUMN_ISDELETE_ISDELETE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isDelete);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ISDELETE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm gt route configs where locCode = &#63; and isDelete = &#63;.
	 *
	 * @param locCode the loc code
	 * @param isDelete the is delete
	 * @return the number of matching dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByLocCode(String locCode, int isDelete)
		throws SystemException {
		Object[] finderArgs = new Object[] { locCode, isDelete };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_LOCCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMGTROUTECONFIG_WHERE);

			if (locCode == null) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
			}
			else {
				if (locCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
				}
			}

			query.append(_FINDER_COLUMN_LOCCODE_ISDELETE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (locCode != null) {
					qPos.add(locCode);
				}

				qPos.add(isDelete);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LOCCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm gt route configs.
	 *
	 * @return the number of dm gt route configs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGTROUTECONFIG);

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
	 * Initializes the dm gt route config persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmGtRouteConfig")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtRouteConfig>> listenersList = new ArrayList<ModelListener<DmGtRouteConfig>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtRouteConfig>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtRouteConfigImpl.class.getName());
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
	private static final String _SQL_SELECT_DMGTROUTECONFIG = "SELECT dmGtRouteConfig FROM DmGtRouteConfig dmGtRouteConfig";
	private static final String _SQL_SELECT_DMGTROUTECONFIG_WHERE = "SELECT dmGtRouteConfig FROM DmGtRouteConfig dmGtRouteConfig WHERE ";
	private static final String _SQL_COUNT_DMGTROUTECONFIG = "SELECT COUNT(dmGtRouteConfig) FROM DmGtRouteConfig dmGtRouteConfig";
	private static final String _SQL_COUNT_DMGTROUTECONFIG_WHERE = "SELECT COUNT(dmGtRouteConfig) FROM DmGtRouteConfig dmGtRouteConfig WHERE ";
	private static final String _FINDER_COLUMN_ROUTECODE_ROUTECODE_1 = "dmGtRouteConfig.routeCode IS NULL";
	private static final String _FINDER_COLUMN_ROUTECODE_ROUTECODE_2 = "dmGtRouteConfig.routeCode = ?";
	private static final String _FINDER_COLUMN_ROUTECODE_ROUTECODE_3 = "(dmGtRouteConfig.routeCode IS NULL OR dmGtRouteConfig.routeCode = ?)";
	private static final String _FINDER_COLUMN_ISDELETE_ISDELETE_2 = "dmGtRouteConfig.isDelete = ?";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_1 = "dmGtRouteConfig.locCode IS NULL AND ";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_2 = "dmGtRouteConfig.locCode = ? AND ";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_3 = "(dmGtRouteConfig.locCode IS NULL OR dmGtRouteConfig.locCode = ?) AND ";
	private static final String _FINDER_COLUMN_LOCCODE_ISDELETE_2 = "dmGtRouteConfig.isDelete = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtRouteConfig.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtRouteConfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGtRouteConfig exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtRouteConfigPersistenceImpl.class);
	private static DmGtRouteConfig _nullDmGtRouteConfig = new DmGtRouteConfigImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtRouteConfig> toCacheModel() {
				return _nullDmGtRouteConfigCacheModel;
			}
		};

	private static CacheModel<DmGtRouteConfig> _nullDmGtRouteConfigCacheModel = new CacheModel<DmGtRouteConfig>() {
			public DmGtRouteConfig toEntityModel() {
				return _nullDmGtRouteConfig;
			}
		};
}