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

import vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException;
import vn.gt.dao.danhmuc.model.DmHistoryRankRating;
import vn.gt.dao.danhmuc.model.impl.DmHistoryRankRatingImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryRankRatingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history rank rating service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryRankRatingPersistence
 * @see DmHistoryRankRatingUtil
 * @generated
 */
public class DmHistoryRankRatingPersistenceImpl extends BasePersistenceImpl<DmHistoryRankRating>
	implements DmHistoryRankRatingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryRankRatingUtil} to access the dm history rank rating persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryRankRatingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RANKCODE = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRankCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE =
		new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRankCode",
			new String[] { String.class.getName() },
			DmHistoryRankRatingModelImpl.RANKCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RANKCODE = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRankCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRankCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryRankRatingModelImpl.RANKCODE_COLUMN_BITMASK |
			DmHistoryRankRatingModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRankCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history rank rating in the entity cache if it is enabled.
	 *
	 * @param dmHistoryRankRating the dm history rank rating
	 */
	public void cacheResult(DmHistoryRankRating dmHistoryRankRating) {
		EntityCacheUtil.putResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, dmHistoryRankRating.getPrimaryKey(),
			dmHistoryRankRating);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryRankRating.getRankCode(),
				
			dmHistoryRankRating.getSyncVersion()
			}, dmHistoryRankRating);

		dmHistoryRankRating.resetOriginalValues();
	}

	/**
	 * Caches the dm history rank ratings in the entity cache if it is enabled.
	 *
	 * @param dmHistoryRankRatings the dm history rank ratings
	 */
	public void cacheResult(List<DmHistoryRankRating> dmHistoryRankRatings) {
		for (DmHistoryRankRating dmHistoryRankRating : dmHistoryRankRatings) {
			if (EntityCacheUtil.getResult(
						DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryRankRatingImpl.class,
						dmHistoryRankRating.getPrimaryKey()) == null) {
				cacheResult(dmHistoryRankRating);
			}
			else {
				dmHistoryRankRating.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history rank ratings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryRankRatingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryRankRatingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history rank rating.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryRankRating dmHistoryRankRating) {
		EntityCacheUtil.removeResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, dmHistoryRankRating.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryRankRating.getRankCode(),
				
			dmHistoryRankRating.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history rank rating with the primary key. Does not add the dm history rank rating to the database.
	 *
	 * @param id the primary key for the new dm history rank rating
	 * @return the new dm history rank rating
	 */
	public DmHistoryRankRating create(int id) {
		DmHistoryRankRating dmHistoryRankRating = new DmHistoryRankRatingImpl();

		dmHistoryRankRating.setNew(true);
		dmHistoryRankRating.setPrimaryKey(id);

		return dmHistoryRankRating;
	}

	/**
	 * Removes the dm history rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history rank rating
	 * @return the dm history rank rating that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm history rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history rank rating
	 * @return the dm history rank rating that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating remove(int id)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryRankRating dmHistoryRankRating = (DmHistoryRankRating)session.get(DmHistoryRankRatingImpl.class,
					Integer.valueOf(id));

			if (dmHistoryRankRating == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmHistoryRankRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmHistoryRankRatingPersistence.remove(dmHistoryRankRating);
		}
		catch (NoSuchDmHistoryRankRatingException nsee) {
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
	 * Removes the dm history rank rating from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmHistoryRankRating the dm history rank rating
	 * @return the dm history rank rating that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating remove(DmHistoryRankRating dmHistoryRankRating)
		throws SystemException {
		return super.remove(dmHistoryRankRating);
	}

	@Override
	protected DmHistoryRankRating removeImpl(
		DmHistoryRankRating dmHistoryRankRating) throws SystemException {
		dmHistoryRankRating = toUnwrappedModel(dmHistoryRankRating);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryRankRating);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmHistoryRankRatingModelImpl dmHistoryRankRatingModelImpl = (DmHistoryRankRatingModelImpl)dmHistoryRankRating;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryRankRatingModelImpl.getRankCode(),
				
			dmHistoryRankRatingModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, dmHistoryRankRating.getPrimaryKey());

		return dmHistoryRankRating;
	}

	@Override
	public DmHistoryRankRating updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryRankRating dmHistoryRankRating,
		boolean merge) throws SystemException {
		dmHistoryRankRating = toUnwrappedModel(dmHistoryRankRating);

		boolean isNew = dmHistoryRankRating.isNew();

		DmHistoryRankRatingModelImpl dmHistoryRankRatingModelImpl = (DmHistoryRankRatingModelImpl)dmHistoryRankRating;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryRankRating, merge);

			dmHistoryRankRating.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryRankRatingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryRankRatingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryRankRatingModelImpl.getOriginalRankCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE,
					args);

				args = new Object[] { dmHistoryRankRatingModelImpl.getRankCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, dmHistoryRankRating.getPrimaryKey(),
			dmHistoryRankRating);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
				new Object[] {
					dmHistoryRankRating.getRankCode(),
					
				dmHistoryRankRating.getSyncVersion()
				}, dmHistoryRankRating);
		}
		else {
			if ((dmHistoryRankRatingModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryRankRatingModelImpl.getOriginalRankCode(),
						
						dmHistoryRankRatingModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
					new Object[] {
						dmHistoryRankRating.getRankCode(),
						
					dmHistoryRankRating.getSyncVersion()
					}, dmHistoryRankRating);
			}
		}

		return dmHistoryRankRating;
	}

	protected DmHistoryRankRating toUnwrappedModel(
		DmHistoryRankRating dmHistoryRankRating) {
		if (dmHistoryRankRating instanceof DmHistoryRankRatingImpl) {
			return dmHistoryRankRating;
		}

		DmHistoryRankRatingImpl dmHistoryRankRatingImpl = new DmHistoryRankRatingImpl();

		dmHistoryRankRatingImpl.setNew(dmHistoryRankRating.isNew());
		dmHistoryRankRatingImpl.setPrimaryKey(dmHistoryRankRating.getPrimaryKey());

		dmHistoryRankRatingImpl.setId(dmHistoryRankRating.getId());
		dmHistoryRankRatingImpl.setRankCode(dmHistoryRankRating.getRankCode());
		dmHistoryRankRatingImpl.setRankName(dmHistoryRankRating.getRankName());
		dmHistoryRankRatingImpl.setRankNameVN(dmHistoryRankRating.getRankNameVN());
		dmHistoryRankRatingImpl.setRankOrder(dmHistoryRankRating.getRankOrder());
		dmHistoryRankRatingImpl.setIsDelete(dmHistoryRankRating.getIsDelete());
		dmHistoryRankRatingImpl.setMarkedAsDelete(dmHistoryRankRating.getMarkedAsDelete());
		dmHistoryRankRatingImpl.setModifiedDate(dmHistoryRankRating.getModifiedDate());
		dmHistoryRankRatingImpl.setRequestedDate(dmHistoryRankRating.getRequestedDate());
		dmHistoryRankRatingImpl.setSyncVersion(dmHistoryRankRating.getSyncVersion());

		return dmHistoryRankRatingImpl;
	}

	/**
	 * Returns the dm history rank rating with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history rank rating
	 * @return the dm history rank rating
	 * @throws com.liferay.portal.NoSuchModelException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history rank rating with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException} if it could not be found.
	 *
	 * @param id the primary key of the dm history rank rating
	 * @return the dm history rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating findByPrimaryKey(int id)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = fetchByPrimaryKey(id);

		if (dmHistoryRankRating == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryRankRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryRankRating;
	}

	/**
	 * Returns the dm history rank rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history rank rating
	 * @return the dm history rank rating, or <code>null</code> if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history rank rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history rank rating
	 * @return the dm history rank rating, or <code>null</code> if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating fetchByPrimaryKey(int id)
		throws SystemException {
		DmHistoryRankRating dmHistoryRankRating = (DmHistoryRankRating)EntityCacheUtil.getResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryRankRatingImpl.class, id);

		if (dmHistoryRankRating == _nullDmHistoryRankRating) {
			return null;
		}

		if (dmHistoryRankRating == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryRankRating = (DmHistoryRankRating)session.get(DmHistoryRankRatingImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryRankRating != null) {
					cacheResult(dmHistoryRankRating);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryRankRatingImpl.class, id,
						_nullDmHistoryRankRating);
				}

				closeSession(session);
			}
		}

		return dmHistoryRankRating;
	}

	/**
	 * Returns all the dm history rank ratings where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @return the matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRankRating> findByRankCode(String rankCode)
		throws SystemException {
		return findByRankCode(rankCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm history rank ratings where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param start the lower bound of the range of dm history rank ratings
	 * @param end the upper bound of the range of dm history rank ratings (not inclusive)
	 * @return the range of matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRankRating> findByRankCode(String rankCode, int start,
		int end) throws SystemException {
		return findByRankCode(rankCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history rank ratings where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param start the lower bound of the range of dm history rank ratings
	 * @param end the upper bound of the range of dm history rank ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRankRating> findByRankCode(String rankCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE;
			finderArgs = new Object[] { rankCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RANKCODE;
			finderArgs = new Object[] { rankCode, start, end, orderByComparator };
		}

		List<DmHistoryRankRating> list = (List<DmHistoryRankRating>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYRANKRATING_WHERE);

			if (rankCode == null) {
				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_1);
			}
			else {
				if (rankCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmHistoryRankRatingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (rankCode != null) {
					qPos.add(rankCode);
				}

				list = (List<DmHistoryRankRating>)QueryUtil.list(q,
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
	 * Returns the first dm history rank rating in the ordered set where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating findByRankCode_First(String rankCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		List<DmHistoryRankRating> list = findByRankCode(rankCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("rankCode=");
			msg.append(rankCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryRankRatingException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history rank rating in the ordered set where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating findByRankCode_Last(String rankCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		int count = countByRankCode(rankCode);

		List<DmHistoryRankRating> list = findByRankCode(rankCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("rankCode=");
			msg.append(rankCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryRankRatingException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history rank ratings before and after the current dm history rank rating in the ordered set where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history rank rating
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating[] findByRankCode_PrevAndNext(int id,
		String rankCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryRankRating[] array = new DmHistoryRankRatingImpl[3];

			array[0] = getByRankCode_PrevAndNext(session, dmHistoryRankRating,
					rankCode, orderByComparator, true);

			array[1] = dmHistoryRankRating;

			array[2] = getByRankCode_PrevAndNext(session, dmHistoryRankRating,
					rankCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryRankRating getByRankCode_PrevAndNext(Session session,
		DmHistoryRankRating dmHistoryRankRating, String rankCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYRANKRATING_WHERE);

		if (rankCode == null) {
			query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_1);
		}
		else {
			if (rankCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_2);
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
			query.append(DmHistoryRankRatingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (rankCode != null) {
			qPos.add(rankCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryRankRating);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryRankRating> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history rank rating where rankCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException} if it could not be found.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @return the matching dm history rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRankRatingException if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating findByRankCodeAndSyncVersion(String rankCode,
		String syncVersion)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = fetchByRankCodeAndSyncVersion(rankCode,
				syncVersion);

		if (dmHistoryRankRating == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("rankCode=");
			msg.append(rankCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryRankRatingException(msg.toString());
		}

		return dmHistoryRankRating;
	}

	/**
	 * Returns the dm history rank rating where rankCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @return the matching dm history rank rating, or <code>null</code> if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating fetchByRankCodeAndSyncVersion(String rankCode,
		String syncVersion) throws SystemException {
		return fetchByRankCodeAndSyncVersion(rankCode, syncVersion, true);
	}

	/**
	 * Returns the dm history rank rating where rankCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history rank rating, or <code>null</code> if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRankRating fetchByRankCodeAndSyncVersion(String rankCode,
		String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { rankCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYRANKRATING_WHERE);

			if (rankCode == null) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_1);
			}
			else {
				if (rankCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryRankRatingModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (rankCode != null) {
					qPos.add(rankCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryRankRating> list = q.list();

				result = list;

				DmHistoryRankRating dmHistoryRankRating = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryRankRating = list.get(0);

					cacheResult(dmHistoryRankRating);

					if ((dmHistoryRankRating.getRankCode() == null) ||
							!dmHistoryRankRating.getRankCode().equals(rankCode) ||
							(dmHistoryRankRating.getSyncVersion() == null) ||
							!dmHistoryRankRating.getSyncVersion()
													.equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
							finderArgs, dmHistoryRankRating);
					}
				}

				return dmHistoryRankRating;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
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
				return (DmHistoryRankRating)result;
			}
		}
	}

	/**
	 * Returns all the dm history rank ratings.
	 *
	 * @return the dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRankRating> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history rank ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history rank ratings
	 * @param end the upper bound of the range of dm history rank ratings (not inclusive)
	 * @return the range of dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRankRating> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history rank ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history rank ratings
	 * @param end the upper bound of the range of dm history rank ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRankRating> findAll(int start, int end,
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

		List<DmHistoryRankRating> list = (List<DmHistoryRankRating>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYRANKRATING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYRANKRATING.concat(DmHistoryRankRatingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryRankRating>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryRankRating>)QueryUtil.list(q,
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
	 * Removes all the dm history rank ratings where rankCode = &#63; from the database.
	 *
	 * @param rankCode the rank code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRankCode(String rankCode) throws SystemException {
		for (DmHistoryRankRating dmHistoryRankRating : findByRankCode(rankCode)) {
			dmHistoryRankRatingPersistence.remove(dmHistoryRankRating);
		}
	}

	/**
	 * Removes the dm history rank rating where rankCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRankCodeAndSyncVersion(String rankCode,
		String syncVersion)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = findByRankCodeAndSyncVersion(rankCode,
				syncVersion);

		dmHistoryRankRatingPersistence.remove(dmHistoryRankRating);
	}

	/**
	 * Removes all the dm history rank ratings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryRankRating dmHistoryRankRating : findAll()) {
			dmHistoryRankRatingPersistence.remove(dmHistoryRankRating);
		}
	}

	/**
	 * Returns the number of dm history rank ratings where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @return the number of matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRankCode(String rankCode) throws SystemException {
		Object[] finderArgs = new Object[] { rankCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_RANKCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYRANKRATING_WHERE);

			if (rankCode == null) {
				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_1);
			}
			else {
				if (rankCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (rankCode != null) {
					qPos.add(rankCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RANKCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history rank ratings where rankCode = &#63; and syncVersion = &#63;.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRankCodeAndSyncVersion(String rankCode, String syncVersion)
		throws SystemException {
		Object[] finderArgs = new Object[] { rankCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYRANKRATING_WHERE);

			if (rankCode == null) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_1);
			}
			else {
				if (rankCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (rankCode != null) {
					qPos.add(rankCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history rank ratings.
	 *
	 * @return the number of dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYRANKRATING);

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
	 * Initializes the dm history rank rating persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryRankRating")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryRankRating>> listenersList = new ArrayList<ModelListener<DmHistoryRankRating>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryRankRating>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryRankRatingImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYRANKRATING = "SELECT dmHistoryRankRating FROM DmHistoryRankRating dmHistoryRankRating";
	private static final String _SQL_SELECT_DMHISTORYRANKRATING_WHERE = "SELECT dmHistoryRankRating FROM DmHistoryRankRating dmHistoryRankRating WHERE ";
	private static final String _SQL_COUNT_DMHISTORYRANKRATING = "SELECT COUNT(dmHistoryRankRating) FROM DmHistoryRankRating dmHistoryRankRating";
	private static final String _SQL_COUNT_DMHISTORYRANKRATING_WHERE = "SELECT COUNT(dmHistoryRankRating) FROM DmHistoryRankRating dmHistoryRankRating WHERE ";
	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_1 = "dmHistoryRankRating.rankCode IS NULL";
	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_2 = "dmHistoryRankRating.rankCode = ?";
	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_3 = "(dmHistoryRankRating.rankCode IS NULL OR dmHistoryRankRating.rankCode = ?)";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_1 =
		"dmHistoryRankRating.rankCode IS NULL AND ";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_2 =
		"dmHistoryRankRating.rankCode = ? AND ";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_3 =
		"(dmHistoryRankRating.rankCode IS NULL OR dmHistoryRankRating.rankCode = ?) AND ";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryRankRating.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryRankRating.syncVersion = ?";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryRankRating.syncVersion IS NULL OR dmHistoryRankRating.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryRankRating.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryRankRating exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryRankRating exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryRankRatingPersistenceImpl.class);
	private static DmHistoryRankRating _nullDmHistoryRankRating = new DmHistoryRankRatingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryRankRating> toCacheModel() {
				return _nullDmHistoryRankRatingCacheModel;
			}
		};

	private static CacheModel<DmHistoryRankRating> _nullDmHistoryRankRatingCacheModel =
		new CacheModel<DmHistoryRankRating>() {
			public DmHistoryRankRating toEntityModel() {
				return _nullDmHistoryRankRating;
			}
		};
}