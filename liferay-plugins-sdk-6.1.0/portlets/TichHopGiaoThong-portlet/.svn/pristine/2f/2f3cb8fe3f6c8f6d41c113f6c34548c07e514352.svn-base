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

import vn.gt.dao.danhmuc.NoSuchDmRankRatingException;
import vn.gt.dao.danhmuc.model.DmRankRating;
import vn.gt.dao.danhmuc.model.impl.DmRankRatingImpl;
import vn.gt.dao.danhmuc.model.impl.DmRankRatingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm rank rating service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmRankRatingPersistence
 * @see DmRankRatingUtil
 * @generated
 */
public class DmRankRatingPersistenceImpl extends BasePersistenceImpl<DmRankRating>
	implements DmRankRatingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmRankRatingUtil} to access the dm rank rating persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmRankRatingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RANKCODE = new FinderPath(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingModelImpl.FINDER_CACHE_ENABLED, DmRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRankCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE =
		new FinderPath(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingModelImpl.FINDER_CACHE_ENABLED, DmRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRankCode",
			new String[] { String.class.getName() },
			DmRankRatingModelImpl.RANKCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RANKCODE = new FinderPath(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRankCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingModelImpl.FINDER_CACHE_ENABLED, DmRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingModelImpl.FINDER_CACHE_ENABLED, DmRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm rank rating in the entity cache if it is enabled.
	 *
	 * @param dmRankRating the dm rank rating
	 */
	public void cacheResult(DmRankRating dmRankRating) {
		EntityCacheUtil.putResult(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingImpl.class, dmRankRating.getPrimaryKey(), dmRankRating);

		dmRankRating.resetOriginalValues();
	}

	/**
	 * Caches the dm rank ratings in the entity cache if it is enabled.
	 *
	 * @param dmRankRatings the dm rank ratings
	 */
	public void cacheResult(List<DmRankRating> dmRankRatings) {
		for (DmRankRating dmRankRating : dmRankRatings) {
			if (EntityCacheUtil.getResult(
						DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
						DmRankRatingImpl.class, dmRankRating.getPrimaryKey()) == null) {
				cacheResult(dmRankRating);
			}
			else {
				dmRankRating.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm rank ratings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmRankRatingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmRankRatingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm rank rating.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmRankRating dmRankRating) {
		EntityCacheUtil.removeResult(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingImpl.class, dmRankRating.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Creates a new dm rank rating with the primary key. Does not add the dm rank rating to the database.
	 *
	 * @param id the primary key for the new dm rank rating
	 * @return the new dm rank rating
	 */
	public DmRankRating create(int id) {
		DmRankRating dmRankRating = new DmRankRatingImpl();

		dmRankRating.setNew(true);
		dmRankRating.setPrimaryKey(id);

		return dmRankRating;
	}

	/**
	 * Removes the dm rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm rank rating
	 * @return the dm rank rating that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRankRating remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm rank rating
	 * @return the dm rank rating that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating remove(int id)
		throws NoSuchDmRankRatingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmRankRating dmRankRating = (DmRankRating)session.get(DmRankRatingImpl.class,
					Integer.valueOf(id));

			if (dmRankRating == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmRankRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmRankRatingPersistence.remove(dmRankRating);
		}
		catch (NoSuchDmRankRatingException nsee) {
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
	 * Removes the dm rank rating from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmRankRating the dm rank rating
	 * @return the dm rank rating that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRankRating remove(DmRankRating dmRankRating)
		throws SystemException {
		return super.remove(dmRankRating);
	}

	@Override
	protected DmRankRating removeImpl(DmRankRating dmRankRating)
		throws SystemException {
		dmRankRating = toUnwrappedModel(dmRankRating);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmRankRating);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		EntityCacheUtil.removeResult(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingImpl.class, dmRankRating.getPrimaryKey());

		return dmRankRating;
	}

	@Override
	public DmRankRating updateImpl(
		vn.gt.dao.danhmuc.model.DmRankRating dmRankRating, boolean merge)
		throws SystemException {
		dmRankRating = toUnwrappedModel(dmRankRating);

		boolean isNew = dmRankRating.isNew();

		DmRankRatingModelImpl dmRankRatingModelImpl = (DmRankRatingModelImpl)dmRankRating;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmRankRating, merge);

			dmRankRating.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmRankRatingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmRankRatingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmRankRatingModelImpl.getOriginalRankCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE,
					args);

				args = new Object[] { dmRankRatingModelImpl.getRankCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmRankRatingImpl.class, dmRankRating.getPrimaryKey(), dmRankRating);

		return dmRankRating;
	}

	protected DmRankRating toUnwrappedModel(DmRankRating dmRankRating) {
		if (dmRankRating instanceof DmRankRatingImpl) {
			return dmRankRating;
		}

		DmRankRatingImpl dmRankRatingImpl = new DmRankRatingImpl();

		dmRankRatingImpl.setNew(dmRankRating.isNew());
		dmRankRatingImpl.setPrimaryKey(dmRankRating.getPrimaryKey());

		dmRankRatingImpl.setId(dmRankRating.getId());
		dmRankRatingImpl.setRankCode(dmRankRating.getRankCode());
		dmRankRatingImpl.setRankName(dmRankRating.getRankName());
		dmRankRatingImpl.setRankNameVN(dmRankRating.getRankNameVN());
		dmRankRatingImpl.setRankOrder(dmRankRating.getRankOrder());
		dmRankRatingImpl.setIsDelete(dmRankRating.getIsDelete());
		dmRankRatingImpl.setMarkedAsDelete(dmRankRating.getMarkedAsDelete());
		dmRankRatingImpl.setModifiedDate(dmRankRating.getModifiedDate());
		dmRankRatingImpl.setRequestedDate(dmRankRating.getRequestedDate());
		dmRankRatingImpl.setSyncVersion(dmRankRating.getSyncVersion());

		return dmRankRatingImpl;
	}

	/**
	 * Returns the dm rank rating with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm rank rating
	 * @return the dm rank rating
	 * @throws com.liferay.portal.NoSuchModelException if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRankRating findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm rank rating with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmRankRatingException} if it could not be found.
	 *
	 * @param id the primary key of the dm rank rating
	 * @return the dm rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating findByPrimaryKey(int id)
		throws NoSuchDmRankRatingException, SystemException {
		DmRankRating dmRankRating = fetchByPrimaryKey(id);

		if (dmRankRating == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmRankRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmRankRating;
	}

	/**
	 * Returns the dm rank rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm rank rating
	 * @return the dm rank rating, or <code>null</code> if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRankRating fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm rank rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm rank rating
	 * @return the dm rank rating, or <code>null</code> if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating fetchByPrimaryKey(int id) throws SystemException {
		DmRankRating dmRankRating = (DmRankRating)EntityCacheUtil.getResult(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
				DmRankRatingImpl.class, id);

		if (dmRankRating == _nullDmRankRating) {
			return null;
		}

		if (dmRankRating == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmRankRating = (DmRankRating)session.get(DmRankRatingImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmRankRating != null) {
					cacheResult(dmRankRating);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmRankRatingModelImpl.ENTITY_CACHE_ENABLED,
						DmRankRatingImpl.class, id, _nullDmRankRating);
				}

				closeSession(session);
			}
		}

		return dmRankRating;
	}

	/**
	 * Returns all the dm rank ratings where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @return the matching dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmRankRating> findByRankCode(String rankCode)
		throws SystemException {
		return findByRankCode(rankCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm rank ratings where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param start the lower bound of the range of dm rank ratings
	 * @param end the upper bound of the range of dm rank ratings (not inclusive)
	 * @return the range of matching dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmRankRating> findByRankCode(String rankCode, int start, int end)
		throws SystemException {
		return findByRankCode(rankCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm rank ratings where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param start the lower bound of the range of dm rank ratings
	 * @param end the upper bound of the range of dm rank ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmRankRating> findByRankCode(String rankCode, int start,
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

		List<DmRankRating> list = (List<DmRankRating>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMRANKRATING_WHERE);

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
				query.append(DmRankRatingModelImpl.ORDER_BY_JPQL);
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

				list = (List<DmRankRating>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm rank rating in the ordered set where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a matching dm rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating findByRankCode_First(String rankCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmRankRatingException, SystemException {
		List<DmRankRating> list = findByRankCode(rankCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("rankCode=");
			msg.append(rankCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmRankRatingException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm rank rating in the ordered set where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a matching dm rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating findByRankCode_Last(String rankCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmRankRatingException, SystemException {
		int count = countByRankCode(rankCode);

		List<DmRankRating> list = findByRankCode(rankCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("rankCode=");
			msg.append(rankCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmRankRatingException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm rank ratings before and after the current dm rank rating in the ordered set where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm rank rating
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm rank rating
	 * @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating[] findByRankCode_PrevAndNext(int id, String rankCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmRankRatingException, SystemException {
		DmRankRating dmRankRating = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmRankRating[] array = new DmRankRatingImpl[3];

			array[0] = getByRankCode_PrevAndNext(session, dmRankRating,
					rankCode, orderByComparator, true);

			array[1] = dmRankRating;

			array[2] = getByRankCode_PrevAndNext(session, dmRankRating,
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

	protected DmRankRating getByRankCode_PrevAndNext(Session session,
		DmRankRating dmRankRating, String rankCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMRANKRATING_WHERE);

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
			query.append(DmRankRatingModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmRankRating);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmRankRating> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm rank ratings.
	 *
	 * @return the dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmRankRating> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm rank ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm rank ratings
	 * @param end the upper bound of the range of dm rank ratings (not inclusive)
	 * @return the range of dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmRankRating> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm rank ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm rank ratings
	 * @param end the upper bound of the range of dm rank ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmRankRating> findAll(int start, int end,
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

		List<DmRankRating> list = (List<DmRankRating>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMRANKRATING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMRANKRATING.concat(DmRankRatingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmRankRating>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmRankRating>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm rank ratings where rankCode = &#63; from the database.
	 *
	 * @param rankCode the rank code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRankCode(String rankCode) throws SystemException {
		for (DmRankRating dmRankRating : findByRankCode(rankCode)) {
			dmRankRatingPersistence.remove(dmRankRating);
		}
	}

	/**
	 * Removes all the dm rank ratings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmRankRating dmRankRating : findAll()) {
			dmRankRatingPersistence.remove(dmRankRating);
		}
	}

	/**
	 * Returns the number of dm rank ratings where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @return the number of matching dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRankCode(String rankCode) throws SystemException {
		Object[] finderArgs = new Object[] { rankCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_RANKCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMRANKRATING_WHERE);

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
	 * Returns the number of dm rank ratings.
	 *
	 * @return the number of dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMRANKRATING);

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
	 * Initializes the dm rank rating persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmRankRating")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmRankRating>> listenersList = new ArrayList<ModelListener<DmRankRating>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmRankRating>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmRankRatingImpl.class.getName());
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
	private static final String _SQL_SELECT_DMRANKRATING = "SELECT dmRankRating FROM DmRankRating dmRankRating";
	private static final String _SQL_SELECT_DMRANKRATING_WHERE = "SELECT dmRankRating FROM DmRankRating dmRankRating WHERE ";
	private static final String _SQL_COUNT_DMRANKRATING = "SELECT COUNT(dmRankRating) FROM DmRankRating dmRankRating";
	private static final String _SQL_COUNT_DMRANKRATING_WHERE = "SELECT COUNT(dmRankRating) FROM DmRankRating dmRankRating WHERE ";
	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_1 = "dmRankRating.rankCode IS NULL";
	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_2 = "dmRankRating.rankCode = ?";
	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_3 = "(dmRankRating.rankCode IS NULL OR dmRankRating.rankCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmRankRating.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmRankRating exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmRankRating exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmRankRatingPersistenceImpl.class);
	private static DmRankRating _nullDmRankRating = new DmRankRatingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmRankRating> toCacheModel() {
				return _nullDmRankRatingCacheModel;
			}
		};

	private static CacheModel<DmRankRating> _nullDmRankRatingCacheModel = new CacheModel<DmRankRating>() {
			public DmRankRating toEntityModel() {
				return _nullDmRankRating;
			}
		};
}