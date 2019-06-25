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

import vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException;
import vn.gt.dao.danhmucgt.model.DmHistoryMinistry;
import vn.gt.dao.danhmucgt.model.impl.DmHistoryMinistryImpl;
import vn.gt.dao.danhmucgt.model.impl.DmHistoryMinistryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history ministry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryMinistryPersistence
 * @see DmHistoryMinistryUtil
 * @generated
 */
public class DmHistoryMinistryPersistenceImpl extends BasePersistenceImpl<DmHistoryMinistry>
	implements DmHistoryMinistryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryMinistryUtil} to access the dm history ministry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryMinistryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_MINISTRYCODE = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMinistryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMinistryCode", new String[] { String.class.getName() },
			DmHistoryMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MINISTRYCODE = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMinistryCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history ministry in the entity cache if it is enabled.
	 *
	 * @param dmHistoryMinistry the dm history ministry
	 */
	public void cacheResult(DmHistoryMinistry dmHistoryMinistry) {
		EntityCacheUtil.putResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryImpl.class, dmHistoryMinistry.getPrimaryKey(),
			dmHistoryMinistry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
			new Object[] { dmHistoryMinistry.getMinistryCode() },
			dmHistoryMinistry);

		dmHistoryMinistry.resetOriginalValues();
	}

	/**
	 * Caches the dm history ministries in the entity cache if it is enabled.
	 *
	 * @param dmHistoryMinistries the dm history ministries
	 */
	public void cacheResult(List<DmHistoryMinistry> dmHistoryMinistries) {
		for (DmHistoryMinistry dmHistoryMinistry : dmHistoryMinistries) {
			if (EntityCacheUtil.getResult(
						DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryMinistryImpl.class,
						dmHistoryMinistry.getPrimaryKey()) == null) {
				cacheResult(dmHistoryMinistry);
			}
			else {
				dmHistoryMinistry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history ministries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryMinistryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryMinistryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history ministry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryMinistry dmHistoryMinistry) {
		EntityCacheUtil.removeResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryImpl.class, dmHistoryMinistry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryMinistry);
	}

	@Override
	public void clearCache(List<DmHistoryMinistry> dmHistoryMinistries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryMinistry dmHistoryMinistry : dmHistoryMinistries) {
			EntityCacheUtil.removeResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryMinistryImpl.class, dmHistoryMinistry.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryMinistry);
		}
	}

	protected void clearUniqueFindersCache(DmHistoryMinistry dmHistoryMinistry) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
			new Object[] { dmHistoryMinistry.getMinistryCode() });
	}

	/**
	 * Creates a new dm history ministry with the primary key. Does not add the dm history ministry to the database.
	 *
	 * @param id the primary key for the new dm history ministry
	 * @return the new dm history ministry
	 */
	public DmHistoryMinistry create(long id) {
		DmHistoryMinistry dmHistoryMinistry = new DmHistoryMinistryImpl();

		dmHistoryMinistry.setNew(true);
		dmHistoryMinistry.setPrimaryKey(id);

		return dmHistoryMinistry;
	}

	/**
	 * Removes the dm history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history ministry
	 * @return the dm history ministry that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryMinistry remove(long id)
		throws NoSuchDmHistoryMinistryException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the dm history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history ministry
	 * @return the dm history ministry that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry remove(Serializable primaryKey)
		throws NoSuchDmHistoryMinistryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryMinistry dmHistoryMinistry = (DmHistoryMinistry)session.get(DmHistoryMinistryImpl.class,
					primaryKey);

			if (dmHistoryMinistry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryMinistry);
		}
		catch (NoSuchDmHistoryMinistryException nsee) {
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
	protected DmHistoryMinistry removeImpl(DmHistoryMinistry dmHistoryMinistry)
		throws SystemException {
		dmHistoryMinistry = toUnwrappedModel(dmHistoryMinistry);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryMinistry);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmHistoryMinistry);

		return dmHistoryMinistry;
	}

	@Override
	public DmHistoryMinistry updateImpl(
		vn.gt.dao.danhmucgt.model.DmHistoryMinistry dmHistoryMinistry,
		boolean merge) throws SystemException {
		dmHistoryMinistry = toUnwrappedModel(dmHistoryMinistry);

		boolean isNew = dmHistoryMinistry.isNew();

		DmHistoryMinistryModelImpl dmHistoryMinistryModelImpl = (DmHistoryMinistryModelImpl)dmHistoryMinistry;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryMinistry, merge);

			dmHistoryMinistry.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryMinistryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryMinistryImpl.class, dmHistoryMinistry.getPrimaryKey(),
			dmHistoryMinistry);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
				new Object[] { dmHistoryMinistry.getMinistryCode() },
				dmHistoryMinistry);
		}
		else {
			if ((dmHistoryMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MINISTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryMinistryModelImpl.getOriginalMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					new Object[] { dmHistoryMinistry.getMinistryCode() },
					dmHistoryMinistry);
			}
		}

		return dmHistoryMinistry;
	}

	protected DmHistoryMinistry toUnwrappedModel(
		DmHistoryMinistry dmHistoryMinistry) {
		if (dmHistoryMinistry instanceof DmHistoryMinistryImpl) {
			return dmHistoryMinistry;
		}

		DmHistoryMinistryImpl dmHistoryMinistryImpl = new DmHistoryMinistryImpl();

		dmHistoryMinistryImpl.setNew(dmHistoryMinistry.isNew());
		dmHistoryMinistryImpl.setPrimaryKey(dmHistoryMinistry.getPrimaryKey());

		dmHistoryMinistryImpl.setId(dmHistoryMinistry.getId());
		dmHistoryMinistryImpl.setMinistryCode(dmHistoryMinistry.getMinistryCode());
		dmHistoryMinistryImpl.setMinistryName(dmHistoryMinistry.getMinistryName());
		dmHistoryMinistryImpl.setMinistryNameVN(dmHistoryMinistry.getMinistryNameVN());
		dmHistoryMinistryImpl.setMinistryOrder(dmHistoryMinistry.getMinistryOrder());
		dmHistoryMinistryImpl.setIsDelete(dmHistoryMinistry.getIsDelete());
		dmHistoryMinistryImpl.setMarkedAsDelete(dmHistoryMinistry.getMarkedAsDelete());
		dmHistoryMinistryImpl.setModifiedDate(dmHistoryMinistry.getModifiedDate());
		dmHistoryMinistryImpl.setRequestedDate(dmHistoryMinistry.getRequestedDate());
		dmHistoryMinistryImpl.setSyncVersion(dmHistoryMinistry.getSyncVersion());

		return dmHistoryMinistryImpl;
	}

	/**
	 * Returns the dm history ministry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history ministry
	 * @return the dm history ministry
	 * @throws com.liferay.portal.NoSuchModelException if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm history ministry with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException} if it could not be found.
	 *
	 * @param id the primary key of the dm history ministry
	 * @return the dm history ministry
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryMinistry findByPrimaryKey(long id)
		throws NoSuchDmHistoryMinistryException, SystemException {
		DmHistoryMinistry dmHistoryMinistry = fetchByPrimaryKey(id);

		if (dmHistoryMinistry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryMinistry;
	}

	/**
	 * Returns the dm history ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history ministry
	 * @return the dm history ministry, or <code>null</code> if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryMinistry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm history ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history ministry
	 * @return the dm history ministry, or <code>null</code> if a dm history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryMinistry fetchByPrimaryKey(long id)
		throws SystemException {
		DmHistoryMinistry dmHistoryMinistry = (DmHistoryMinistry)EntityCacheUtil.getResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryMinistryImpl.class, id);

		if (dmHistoryMinistry == _nullDmHistoryMinistry) {
			return null;
		}

		if (dmHistoryMinistry == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryMinistry = (DmHistoryMinistry)session.get(DmHistoryMinistryImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryMinistry != null) {
					cacheResult(dmHistoryMinistry);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryMinistryImpl.class, id, _nullDmHistoryMinistry);
				}

				closeSession(session);
			}
		}

		return dmHistoryMinistry;
	}

	/**
	 * Returns the dm history ministry where ministryCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException} if it could not be found.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching dm history ministry
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException if a matching dm history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryMinistry findByMinistryCode(String ministryCode)
		throws NoSuchDmHistoryMinistryException, SystemException {
		DmHistoryMinistry dmHistoryMinistry = fetchByMinistryCode(ministryCode);

		if (dmHistoryMinistry == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryMinistryException(msg.toString());
		}

		return dmHistoryMinistry;
	}

	/**
	 * Returns the dm history ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching dm history ministry, or <code>null</code> if a matching dm history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryMinistry fetchByMinistryCode(String ministryCode)
		throws SystemException {
		return fetchByMinistryCode(ministryCode, true);
	}

	/**
	 * Returns the dm history ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ministryCode the ministry code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history ministry, or <code>null</code> if a matching dm history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryMinistry fetchByMinistryCode(String ministryCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ministryCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMHISTORYMINISTRY_WHERE);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2);
				}
			}

			query.append(DmHistoryMinistryModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ministryCode != null) {
					qPos.add(ministryCode);
				}

				List<DmHistoryMinistry> list = q.list();

				result = list;

				DmHistoryMinistry dmHistoryMinistry = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
						finderArgs, list);
				}
				else {
					dmHistoryMinistry = list.get(0);

					cacheResult(dmHistoryMinistry);

					if ((dmHistoryMinistry.getMinistryCode() == null) ||
							!dmHistoryMinistry.getMinistryCode()
												  .equals(ministryCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
							finderArgs, dmHistoryMinistry);
					}
				}

				return dmHistoryMinistry;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
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
				return (DmHistoryMinistry)result;
			}
		}
	}

	/**
	 * Returns all the dm history ministries.
	 *
	 * @return the dm history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryMinistry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ministries
	 * @param end the upper bound of the range of dm history ministries (not inclusive)
	 * @return the range of dm history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryMinistry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ministries
	 * @param end the upper bound of the range of dm history ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryMinistry> findAll(int start, int end,
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

		List<DmHistoryMinistry> list = (List<DmHistoryMinistry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYMINISTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYMINISTRY.concat(DmHistoryMinistryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryMinistry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryMinistry>)QueryUtil.list(q,
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
	 * Removes the dm history ministry where ministryCode = &#63; from the database.
	 *
	 * @param ministryCode the ministry code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMinistryCode(String ministryCode)
		throws NoSuchDmHistoryMinistryException, SystemException {
		DmHistoryMinistry dmHistoryMinistry = findByMinistryCode(ministryCode);

		remove(dmHistoryMinistry);
	}

	/**
	 * Removes all the dm history ministries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryMinistry dmHistoryMinistry : findAll()) {
			remove(dmHistoryMinistry);
		}
	}

	/**
	 * Returns the number of dm history ministries where ministryCode = &#63;.
	 *
	 * @param ministryCode the ministry code
	 * @return the number of matching dm history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMinistryCode(String ministryCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { ministryCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYMINISTRY_WHERE);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ministryCode != null) {
					qPos.add(ministryCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history ministries.
	 *
	 * @return the number of dm history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYMINISTRY);

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
	 * Initializes the dm history ministry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmHistoryMinistry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryMinistry>> listenersList = new ArrayList<ModelListener<DmHistoryMinistry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryMinistry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryMinistryImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYMINISTRY = "SELECT dmHistoryMinistry FROM DmHistoryMinistry dmHistoryMinistry";
	private static final String _SQL_SELECT_DMHISTORYMINISTRY_WHERE = "SELECT dmHistoryMinistry FROM DmHistoryMinistry dmHistoryMinistry WHERE ";
	private static final String _SQL_COUNT_DMHISTORYMINISTRY = "SELECT COUNT(dmHistoryMinistry) FROM DmHistoryMinistry dmHistoryMinistry";
	private static final String _SQL_COUNT_DMHISTORYMINISTRY_WHERE = "SELECT COUNT(dmHistoryMinistry) FROM DmHistoryMinistry dmHistoryMinistry WHERE ";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1 = "dmHistoryMinistry.ministryCode IS NULL";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2 = "dmHistoryMinistry.ministryCode = ?";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3 = "(dmHistoryMinistry.ministryCode IS NULL OR dmHistoryMinistry.ministryCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryMinistry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryMinistry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryMinistry exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryMinistryPersistenceImpl.class);
	private static DmHistoryMinistry _nullDmHistoryMinistry = new DmHistoryMinistryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryMinistry> toCacheModel() {
				return _nullDmHistoryMinistryCacheModel;
			}
		};

	private static CacheModel<DmHistoryMinistry> _nullDmHistoryMinistryCacheModel =
		new CacheModel<DmHistoryMinistry>() {
			public DmHistoryMinistry toEntityModel() {
				return _nullDmHistoryMinistry;
			}
		};
}