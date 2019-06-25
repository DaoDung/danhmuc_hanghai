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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.gt.dao.danhmucgt.NoSuchDmGtVersionException;
import vn.gt.dao.danhmucgt.model.DmGtVersion;
import vn.gt.dao.danhmucgt.model.impl.DmGtVersionImpl;
import vn.gt.dao.danhmucgt.model.impl.DmGtVersionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm gt version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtVersionPersistence
 * @see DmGtVersionUtil
 * @generated
 */
public class DmGtVersionPersistenceImpl extends BasePersistenceImpl<DmGtVersion>
	implements DmGtVersionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtVersionUtil} to access the dm gt version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtVersionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmGtVersionModelImpl.FINDER_CACHE_ENABLED, DmGtVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmGtVersionModelImpl.FINDER_CACHE_ENABLED, DmGtVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmGtVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm gt version in the entity cache if it is enabled.
	 *
	 * @param dmGtVersion the dm gt version
	 */
	public void cacheResult(DmGtVersion dmGtVersion) {
		EntityCacheUtil.putResult(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmGtVersionImpl.class, dmGtVersion.getPrimaryKey(), dmGtVersion);

		dmGtVersion.resetOriginalValues();
	}

	/**
	 * Caches the dm gt versions in the entity cache if it is enabled.
	 *
	 * @param dmGtVersions the dm gt versions
	 */
	public void cacheResult(List<DmGtVersion> dmGtVersions) {
		for (DmGtVersion dmGtVersion : dmGtVersions) {
			if (EntityCacheUtil.getResult(
						DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
						DmGtVersionImpl.class, dmGtVersion.getPrimaryKey()) == null) {
				cacheResult(dmGtVersion);
			}
			else {
				dmGtVersion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt versions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtVersionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtVersionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt version.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtVersion dmGtVersion) {
		EntityCacheUtil.removeResult(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmGtVersionImpl.class, dmGtVersion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmGtVersion> dmGtVersions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGtVersion dmGtVersion : dmGtVersions) {
			EntityCacheUtil.removeResult(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
				DmGtVersionImpl.class, dmGtVersion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm gt version with the primary key. Does not add the dm gt version to the database.
	 *
	 * @param id the primary key for the new dm gt version
	 * @return the new dm gt version
	 */
	public DmGtVersion create(int id) {
		DmGtVersion dmGtVersion = new DmGtVersionImpl();

		dmGtVersion.setNew(true);
		dmGtVersion.setPrimaryKey(id);

		return dmGtVersion;
	}

	/**
	 * Removes the dm gt version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt version
	 * @return the dm gt version that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtVersionException if a dm gt version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtVersion remove(int id)
		throws NoSuchDmGtVersionException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm gt version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt version
	 * @return the dm gt version that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtVersionException if a dm gt version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtVersion remove(Serializable primaryKey)
		throws NoSuchDmGtVersionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtVersion dmGtVersion = (DmGtVersion)session.get(DmGtVersionImpl.class,
					primaryKey);

			if (dmGtVersion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGtVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGtVersion);
		}
		catch (NoSuchDmGtVersionException nsee) {
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
	protected DmGtVersion removeImpl(DmGtVersion dmGtVersion)
		throws SystemException {
		dmGtVersion = toUnwrappedModel(dmGtVersion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGtVersion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmGtVersion);

		return dmGtVersion;
	}

	@Override
	public DmGtVersion updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtVersion dmGtVersion, boolean merge)
		throws SystemException {
		dmGtVersion = toUnwrappedModel(dmGtVersion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGtVersion, merge);

			dmGtVersion.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmGtVersionImpl.class, dmGtVersion.getPrimaryKey(), dmGtVersion);

		return dmGtVersion;
	}

	protected DmGtVersion toUnwrappedModel(DmGtVersion dmGtVersion) {
		if (dmGtVersion instanceof DmGtVersionImpl) {
			return dmGtVersion;
		}

		DmGtVersionImpl dmGtVersionImpl = new DmGtVersionImpl();

		dmGtVersionImpl.setNew(dmGtVersion.isNew());
		dmGtVersionImpl.setPrimaryKey(dmGtVersion.getPrimaryKey());

		dmGtVersionImpl.setId(dmGtVersion.getId());
		dmGtVersionImpl.setVersionName(dmGtVersion.getVersionName());
		dmGtVersionImpl.setVersionDate(dmGtVersion.getVersionDate());
		dmGtVersionImpl.setVersionDeployer(dmGtVersion.getVersionDeployer());
		dmGtVersionImpl.setContents(dmGtVersion.getContents());
		dmGtVersionImpl.setDescription(dmGtVersion.getDescription());
		dmGtVersionImpl.setDbFileName(dmGtVersion.getDbFileName());
		dmGtVersionImpl.setDbFileSize(dmGtVersion.getDbFileSize());
		dmGtVersionImpl.setDbDescription(dmGtVersion.getDbDescription());
		dmGtVersionImpl.setAppFileName(dmGtVersion.getAppFileName());
		dmGtVersionImpl.setAppFileSize(dmGtVersion.getAppFileSize());
		dmGtVersionImpl.setAppDescription(dmGtVersion.getAppDescription());
		dmGtVersionImpl.setSpecFileName(dmGtVersion.getSpecFileName());
		dmGtVersionImpl.setSpecFileSize(dmGtVersion.getSpecFileSize());
		dmGtVersionImpl.setSpecDescription(dmGtVersion.getSpecDescription());
		dmGtVersionImpl.setOrganizationCode(dmGtVersion.getOrganizationCode());
		dmGtVersionImpl.setIsDelete(dmGtVersion.getIsDelete());
		dmGtVersionImpl.setMarkedAsDelete(dmGtVersion.getMarkedAsDelete());
		dmGtVersionImpl.setModifiedDate(dmGtVersion.getModifiedDate());
		dmGtVersionImpl.setRequestedDate(dmGtVersion.getRequestedDate());
		dmGtVersionImpl.setSyncVersion(dmGtVersion.getSyncVersion());

		return dmGtVersionImpl;
	}

	/**
	 * Returns the dm gt version with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt version
	 * @return the dm gt version
	 * @throws com.liferay.portal.NoSuchModelException if a dm gt version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtVersion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm gt version with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtVersionException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt version
	 * @return the dm gt version
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtVersionException if a dm gt version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtVersion findByPrimaryKey(int id)
		throws NoSuchDmGtVersionException, SystemException {
		DmGtVersion dmGtVersion = fetchByPrimaryKey(id);

		if (dmGtVersion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGtVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGtVersion;
	}

	/**
	 * Returns the dm gt version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt version
	 * @return the dm gt version, or <code>null</code> if a dm gt version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtVersion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm gt version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt version
	 * @return the dm gt version, or <code>null</code> if a dm gt version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtVersion fetchByPrimaryKey(int id) throws SystemException {
		DmGtVersion dmGtVersion = (DmGtVersion)EntityCacheUtil.getResult(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
				DmGtVersionImpl.class, id);

		if (dmGtVersion == _nullDmGtVersion) {
			return null;
		}

		if (dmGtVersion == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGtVersion = (DmGtVersion)session.get(DmGtVersionImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGtVersion != null) {
					cacheResult(dmGtVersion);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGtVersionModelImpl.ENTITY_CACHE_ENABLED,
						DmGtVersionImpl.class, id, _nullDmGtVersion);
				}

				closeSession(session);
			}
		}

		return dmGtVersion;
	}

	/**
	 * Returns all the dm gt versions.
	 *
	 * @return the dm gt versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtVersion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt versions
	 * @param end the upper bound of the range of dm gt versions (not inclusive)
	 * @return the range of dm gt versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtVersion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt versions
	 * @param end the upper bound of the range of dm gt versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtVersion> findAll(int start, int end,
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

		List<DmGtVersion> list = (List<DmGtVersion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTVERSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTVERSION.concat(DmGtVersionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGtVersion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGtVersion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm gt versions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGtVersion dmGtVersion : findAll()) {
			remove(dmGtVersion);
		}
	}

	/**
	 * Returns the number of dm gt versions.
	 *
	 * @return the number of dm gt versions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGTVERSION);

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
	 * Initializes the dm gt version persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmGtVersion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtVersion>> listenersList = new ArrayList<ModelListener<DmGtVersion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtVersion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtVersionImpl.class.getName());
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
	private static final String _SQL_SELECT_DMGTVERSION = "SELECT dmGtVersion FROM DmGtVersion dmGtVersion";
	private static final String _SQL_COUNT_DMGTVERSION = "SELECT COUNT(dmGtVersion) FROM DmGtVersion dmGtVersion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtVersion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtVersion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtVersionPersistenceImpl.class);
	private static DmGtVersion _nullDmGtVersion = new DmGtVersionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtVersion> toCacheModel() {
				return _nullDmGtVersionCacheModel;
			}
		};

	private static CacheModel<DmGtVersion> _nullDmGtVersionCacheModel = new CacheModel<DmGtVersion>() {
			public DmGtVersion toEntityModel() {
				return _nullDmGtVersion;
			}
		};
}