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

import vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException;
import vn.gt.dao.danhmuc.model.DmSyncCategory;
import vn.gt.dao.danhmuc.model.impl.DmSyncCategoryImpl;
import vn.gt.dao.danhmuc.model.impl.DmSyncCategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm sync category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmSyncCategoryPersistence
 * @see DmSyncCategoryUtil
 * @generated
 */
public class DmSyncCategoryPersistenceImpl extends BasePersistenceImpl<DmSyncCategory>
	implements DmSyncCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmSyncCategoryUtil} to access the dm sync category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmSyncCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmSyncCategoryModelImpl.FINDER_CACHE_ENABLED,
			DmSyncCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmSyncCategoryModelImpl.FINDER_CACHE_ENABLED,
			DmSyncCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmSyncCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm sync category in the entity cache if it is enabled.
	 *
	 * @param dmSyncCategory the dm sync category
	 */
	public void cacheResult(DmSyncCategory dmSyncCategory) {
		EntityCacheUtil.putResult(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmSyncCategoryImpl.class, dmSyncCategory.getPrimaryKey(),
			dmSyncCategory);

		dmSyncCategory.resetOriginalValues();
	}

	/**
	 * Caches the dm sync categories in the entity cache if it is enabled.
	 *
	 * @param dmSyncCategories the dm sync categories
	 */
	public void cacheResult(List<DmSyncCategory> dmSyncCategories) {
		for (DmSyncCategory dmSyncCategory : dmSyncCategories) {
			if (EntityCacheUtil.getResult(
						DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
						DmSyncCategoryImpl.class, dmSyncCategory.getPrimaryKey()) == null) {
				cacheResult(dmSyncCategory);
			}
			else {
				dmSyncCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm sync categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmSyncCategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmSyncCategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm sync category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmSyncCategory dmSyncCategory) {
		EntityCacheUtil.removeResult(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmSyncCategoryImpl.class, dmSyncCategory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Creates a new dm sync category with the primary key. Does not add the dm sync category to the database.
	 *
	 * @param id the primary key for the new dm sync category
	 * @return the new dm sync category
	 */
	public DmSyncCategory create(long id) {
		DmSyncCategory dmSyncCategory = new DmSyncCategoryImpl();

		dmSyncCategory.setNew(true);
		dmSyncCategory.setPrimaryKey(id);

		return dmSyncCategory;
	}

	/**
	 * Removes the dm sync category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm sync category
	 * @return the dm sync category that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm sync category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmSyncCategory remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the dm sync category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm sync category
	 * @return the dm sync category that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException if a dm sync category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSyncCategory remove(long id)
		throws NoSuchDmSyncCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmSyncCategory dmSyncCategory = (DmSyncCategory)session.get(DmSyncCategoryImpl.class,
					Long.valueOf(id));

			if (dmSyncCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmSyncCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmSyncCategoryPersistence.remove(dmSyncCategory);
		}
		catch (NoSuchDmSyncCategoryException nsee) {
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
	 * Removes the dm sync category from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmSyncCategory the dm sync category
	 * @return the dm sync category that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmSyncCategory remove(DmSyncCategory dmSyncCategory)
		throws SystemException {
		return super.remove(dmSyncCategory);
	}

	@Override
	protected DmSyncCategory removeImpl(DmSyncCategory dmSyncCategory)
		throws SystemException {
		dmSyncCategory = toUnwrappedModel(dmSyncCategory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmSyncCategory);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		EntityCacheUtil.removeResult(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmSyncCategoryImpl.class, dmSyncCategory.getPrimaryKey());

		return dmSyncCategory;
	}

	@Override
	public DmSyncCategory updateImpl(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory, boolean merge)
		throws SystemException {
		dmSyncCategory = toUnwrappedModel(dmSyncCategory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmSyncCategory, merge);

			dmSyncCategory.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmSyncCategoryImpl.class, dmSyncCategory.getPrimaryKey(),
			dmSyncCategory);

		return dmSyncCategory;
	}

	protected DmSyncCategory toUnwrappedModel(DmSyncCategory dmSyncCategory) {
		if (dmSyncCategory instanceof DmSyncCategoryImpl) {
			return dmSyncCategory;
		}

		DmSyncCategoryImpl dmSyncCategoryImpl = new DmSyncCategoryImpl();

		dmSyncCategoryImpl.setNew(dmSyncCategory.isNew());
		dmSyncCategoryImpl.setPrimaryKey(dmSyncCategory.getPrimaryKey());

		dmSyncCategoryImpl.setId(dmSyncCategory.getId());
		dmSyncCategoryImpl.setCategoryId(dmSyncCategory.getCategoryId());
		dmSyncCategoryImpl.setCategoryDescription(dmSyncCategory.getCategoryDescription());
		dmSyncCategoryImpl.setModifiedUser(dmSyncCategory.getModifiedUser());
		dmSyncCategoryImpl.setModifiedDate(dmSyncCategory.getModifiedDate());

		return dmSyncCategoryImpl;
	}

	/**
	 * Returns the dm sync category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm sync category
	 * @return the dm sync category
	 * @throws com.liferay.portal.NoSuchModelException if a dm sync category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmSyncCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm sync category with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException} if it could not be found.
	 *
	 * @param id the primary key of the dm sync category
	 * @return the dm sync category
	 * @throws vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException if a dm sync category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSyncCategory findByPrimaryKey(long id)
		throws NoSuchDmSyncCategoryException, SystemException {
		DmSyncCategory dmSyncCategory = fetchByPrimaryKey(id);

		if (dmSyncCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmSyncCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmSyncCategory;
	}

	/**
	 * Returns the dm sync category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm sync category
	 * @return the dm sync category, or <code>null</code> if a dm sync category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmSyncCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm sync category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm sync category
	 * @return the dm sync category, or <code>null</code> if a dm sync category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSyncCategory fetchByPrimaryKey(long id) throws SystemException {
		DmSyncCategory dmSyncCategory = (DmSyncCategory)EntityCacheUtil.getResult(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
				DmSyncCategoryImpl.class, id);

		if (dmSyncCategory == _nullDmSyncCategory) {
			return null;
		}

		if (dmSyncCategory == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmSyncCategory = (DmSyncCategory)session.get(DmSyncCategoryImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmSyncCategory != null) {
					cacheResult(dmSyncCategory);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmSyncCategoryModelImpl.ENTITY_CACHE_ENABLED,
						DmSyncCategoryImpl.class, id, _nullDmSyncCategory);
				}

				closeSession(session);
			}
		}

		return dmSyncCategory;
	}

	/**
	 * Returns all the dm sync categories.
	 *
	 * @return the dm sync categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSyncCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm sync categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm sync categories
	 * @param end the upper bound of the range of dm sync categories (not inclusive)
	 * @return the range of dm sync categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSyncCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm sync categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm sync categories
	 * @param end the upper bound of the range of dm sync categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm sync categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSyncCategory> findAll(int start, int end,
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

		List<DmSyncCategory> list = (List<DmSyncCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMSYNCCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMSYNCCATEGORY.concat(DmSyncCategoryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmSyncCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmSyncCategory>)QueryUtil.list(q,
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
	 * Removes all the dm sync categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmSyncCategory dmSyncCategory : findAll()) {
			dmSyncCategoryPersistence.remove(dmSyncCategory);
		}
	}

	/**
	 * Returns the number of dm sync categories.
	 *
	 * @return the number of dm sync categories
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMSYNCCATEGORY);

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
	 * Initializes the dm sync category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmSyncCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmSyncCategory>> listenersList = new ArrayList<ModelListener<DmSyncCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmSyncCategory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmSyncCategoryImpl.class.getName());
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
	private static final String _SQL_SELECT_DMSYNCCATEGORY = "SELECT dmSyncCategory FROM DmSyncCategory dmSyncCategory";
	private static final String _SQL_COUNT_DMSYNCCATEGORY = "SELECT COUNT(dmSyncCategory) FROM DmSyncCategory dmSyncCategory";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmSyncCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmSyncCategory exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmSyncCategoryPersistenceImpl.class);
	private static DmSyncCategory _nullDmSyncCategory = new DmSyncCategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmSyncCategory> toCacheModel() {
				return _nullDmSyncCategoryCacheModel;
			}
		};

	private static CacheModel<DmSyncCategory> _nullDmSyncCategoryCacheModel = new CacheModel<DmSyncCategory>() {
			public DmSyncCategory toEntityModel() {
				return _nullDmSyncCategory;
			}
		};
}