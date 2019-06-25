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

import vn.gt.dao.danhmucgt.NoSuchDmGtReportCategoryException;
import vn.gt.dao.danhmucgt.model.DmGtReportCategory;
import vn.gt.dao.danhmucgt.model.impl.DmGtReportCategoryImpl;
import vn.gt.dao.danhmucgt.model.impl.DmGtReportCategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm gt report category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtReportCategoryPersistence
 * @see DmGtReportCategoryUtil
 * @generated
 */
public class DmGtReportCategoryPersistenceImpl extends BasePersistenceImpl<DmGtReportCategory>
	implements DmGtReportCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtReportCategoryUtil} to access the dm gt report category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtReportCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm gt report category in the entity cache if it is enabled.
	 *
	 * @param dmGtReportCategory the dm gt report category
	 */
	public void cacheResult(DmGtReportCategory dmGtReportCategory) {
		EntityCacheUtil.putResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryImpl.class, dmGtReportCategory.getPrimaryKey(),
			dmGtReportCategory);

		dmGtReportCategory.resetOriginalValues();
	}

	/**
	 * Caches the dm gt report categories in the entity cache if it is enabled.
	 *
	 * @param dmGtReportCategories the dm gt report categories
	 */
	public void cacheResult(List<DmGtReportCategory> dmGtReportCategories) {
		for (DmGtReportCategory dmGtReportCategory : dmGtReportCategories) {
			if (EntityCacheUtil.getResult(
						DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
						DmGtReportCategoryImpl.class,
						dmGtReportCategory.getPrimaryKey()) == null) {
				cacheResult(dmGtReportCategory);
			}
			else {
				dmGtReportCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt report categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtReportCategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtReportCategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt report category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtReportCategory dmGtReportCategory) {
		EntityCacheUtil.removeResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryImpl.class, dmGtReportCategory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmGtReportCategory> dmGtReportCategories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGtReportCategory dmGtReportCategory : dmGtReportCategories) {
			EntityCacheUtil.removeResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
				DmGtReportCategoryImpl.class, dmGtReportCategory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm gt report category with the primary key. Does not add the dm gt report category to the database.
	 *
	 * @param id the primary key for the new dm gt report category
	 * @return the new dm gt report category
	 */
	public DmGtReportCategory create(long id) {
		DmGtReportCategory dmGtReportCategory = new DmGtReportCategoryImpl();

		dmGtReportCategory.setNew(true);
		dmGtReportCategory.setPrimaryKey(id);

		return dmGtReportCategory;
	}

	/**
	 * Removes the dm gt report category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt report category
	 * @return the dm gt report category that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportCategory remove(long id)
		throws NoSuchDmGtReportCategoryException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the dm gt report category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt report category
	 * @return the dm gt report category that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory remove(Serializable primaryKey)
		throws NoSuchDmGtReportCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtReportCategory dmGtReportCategory = (DmGtReportCategory)session.get(DmGtReportCategoryImpl.class,
					primaryKey);

			if (dmGtReportCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGtReportCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGtReportCategory);
		}
		catch (NoSuchDmGtReportCategoryException nsee) {
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
	protected DmGtReportCategory removeImpl(
		DmGtReportCategory dmGtReportCategory) throws SystemException {
		dmGtReportCategory = toUnwrappedModel(dmGtReportCategory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGtReportCategory);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmGtReportCategory);

		return dmGtReportCategory;
	}

	@Override
	public DmGtReportCategory updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtReportCategory dmGtReportCategory,
		boolean merge) throws SystemException {
		dmGtReportCategory = toUnwrappedModel(dmGtReportCategory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGtReportCategory, merge);

			dmGtReportCategory.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryImpl.class, dmGtReportCategory.getPrimaryKey(),
			dmGtReportCategory);

		return dmGtReportCategory;
	}

	protected DmGtReportCategory toUnwrappedModel(
		DmGtReportCategory dmGtReportCategory) {
		if (dmGtReportCategory instanceof DmGtReportCategoryImpl) {
			return dmGtReportCategory;
		}

		DmGtReportCategoryImpl dmGtReportCategoryImpl = new DmGtReportCategoryImpl();

		dmGtReportCategoryImpl.setNew(dmGtReportCategory.isNew());
		dmGtReportCategoryImpl.setPrimaryKey(dmGtReportCategory.getPrimaryKey());

		dmGtReportCategoryImpl.setId(dmGtReportCategory.getId());
		dmGtReportCategoryImpl.setCategory(dmGtReportCategory.getCategory());
		dmGtReportCategoryImpl.setCategoryName(dmGtReportCategory.getCategoryName());
		dmGtReportCategoryImpl.setCategoryOrder(dmGtReportCategory.getCategoryOrder());
		dmGtReportCategoryImpl.setIsDelete(dmGtReportCategory.getIsDelete());
		dmGtReportCategoryImpl.setMarkedAsDelete(dmGtReportCategory.getMarkedAsDelete());
		dmGtReportCategoryImpl.setModifiedDate(dmGtReportCategory.getModifiedDate());
		dmGtReportCategoryImpl.setRequestedDate(dmGtReportCategory.getRequestedDate());
		dmGtReportCategoryImpl.setSyncVersion(dmGtReportCategory.getSyncVersion());

		return dmGtReportCategoryImpl;
	}

	/**
	 * Returns the dm gt report category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt report category
	 * @return the dm gt report category
	 * @throws com.liferay.portal.NoSuchModelException if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm gt report category with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtReportCategoryException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt report category
	 * @return the dm gt report category
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportCategory findByPrimaryKey(long id)
		throws NoSuchDmGtReportCategoryException, SystemException {
		DmGtReportCategory dmGtReportCategory = fetchByPrimaryKey(id);

		if (dmGtReportCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGtReportCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGtReportCategory;
	}

	/**
	 * Returns the dm gt report category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt report category
	 * @return the dm gt report category, or <code>null</code> if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm gt report category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt report category
	 * @return the dm gt report category, or <code>null</code> if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportCategory fetchByPrimaryKey(long id)
		throws SystemException {
		DmGtReportCategory dmGtReportCategory = (DmGtReportCategory)EntityCacheUtil.getResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
				DmGtReportCategoryImpl.class, id);

		if (dmGtReportCategory == _nullDmGtReportCategory) {
			return null;
		}

		if (dmGtReportCategory == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGtReportCategory = (DmGtReportCategory)session.get(DmGtReportCategoryImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGtReportCategory != null) {
					cacheResult(dmGtReportCategory);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
						DmGtReportCategoryImpl.class, id,
						_nullDmGtReportCategory);
				}

				closeSession(session);
			}
		}

		return dmGtReportCategory;
	}

	/**
	 * Returns all the dm gt report categories.
	 *
	 * @return the dm gt report categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt report categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt report categories
	 * @param end the upper bound of the range of dm gt report categories (not inclusive)
	 * @return the range of dm gt report categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt report categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt report categories
	 * @param end the upper bound of the range of dm gt report categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt report categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportCategory> findAll(int start, int end,
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

		List<DmGtReportCategory> list = (List<DmGtReportCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTREPORTCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTREPORTCATEGORY.concat(DmGtReportCategoryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGtReportCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGtReportCategory>)QueryUtil.list(q,
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
	 * Removes all the dm gt report categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGtReportCategory dmGtReportCategory : findAll()) {
			remove(dmGtReportCategory);
		}
	}

	/**
	 * Returns the number of dm gt report categories.
	 *
	 * @return the number of dm gt report categories
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGTREPORTCATEGORY);

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
	 * Initializes the dm gt report category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmGtReportCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtReportCategory>> listenersList = new ArrayList<ModelListener<DmGtReportCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtReportCategory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtReportCategoryImpl.class.getName());
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
	private static final String _SQL_SELECT_DMGTREPORTCATEGORY = "SELECT dmGtReportCategory FROM DmGtReportCategory dmGtReportCategory";
	private static final String _SQL_COUNT_DMGTREPORTCATEGORY = "SELECT COUNT(dmGtReportCategory) FROM DmGtReportCategory dmGtReportCategory";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtReportCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtReportCategory exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtReportCategoryPersistenceImpl.class);
	private static DmGtReportCategory _nullDmGtReportCategory = new DmGtReportCategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtReportCategory> toCacheModel() {
				return _nullDmGtReportCategoryCacheModel;
			}
		};

	private static CacheModel<DmGtReportCategory> _nullDmGtReportCategoryCacheModel =
		new CacheModel<DmGtReportCategory>() {
			public DmGtReportCategory toEntityModel() {
				return _nullDmGtReportCategory;
			}
		};
}