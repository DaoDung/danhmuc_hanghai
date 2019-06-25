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

import vn.gt.dao.danhmucgt.NoSuchDmMinistryException;
import vn.gt.dao.danhmucgt.model.DmMinistry;
import vn.gt.dao.danhmucgt.model.impl.DmMinistryImpl;
import vn.gt.dao.danhmucgt.model.impl.DmMinistryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm ministry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmMinistryPersistence
 * @see DmMinistryUtil
 * @generated
 */
public class DmMinistryPersistenceImpl extends BasePersistenceImpl<DmMinistry>
	implements DmMinistryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmMinistryUtil} to access the dm ministry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmMinistryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_MINISTRYCODE = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, DmMinistryImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMinistryCode",
			new String[] { String.class.getName() },
			DmMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MINISTRYCODE = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMinistryCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, DmMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, DmMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm ministry in the entity cache if it is enabled.
	 *
	 * @param dmMinistry the dm ministry
	 */
	public void cacheResult(DmMinistry dmMinistry) {
		EntityCacheUtil.putResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryImpl.class, dmMinistry.getPrimaryKey(), dmMinistry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
			new Object[] { dmMinistry.getMinistryCode() }, dmMinistry);

		dmMinistry.resetOriginalValues();
	}

	/**
	 * Caches the dm ministries in the entity cache if it is enabled.
	 *
	 * @param dmMinistries the dm ministries
	 */
	public void cacheResult(List<DmMinistry> dmMinistries) {
		for (DmMinistry dmMinistry : dmMinistries) {
			if (EntityCacheUtil.getResult(
						DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
						DmMinistryImpl.class, dmMinistry.getPrimaryKey()) == null) {
				cacheResult(dmMinistry);
			}
			else {
				dmMinistry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm ministries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmMinistryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmMinistryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm ministry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmMinistry dmMinistry) {
		EntityCacheUtil.removeResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryImpl.class, dmMinistry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmMinistry);
	}

	@Override
	public void clearCache(List<DmMinistry> dmMinistries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmMinistry dmMinistry : dmMinistries) {
			EntityCacheUtil.removeResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
				DmMinistryImpl.class, dmMinistry.getPrimaryKey());

			clearUniqueFindersCache(dmMinistry);
		}
	}

	protected void clearUniqueFindersCache(DmMinistry dmMinistry) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
			new Object[] { dmMinistry.getMinistryCode() });
	}

	/**
	 * Creates a new dm ministry with the primary key. Does not add the dm ministry to the database.
	 *
	 * @param id the primary key for the new dm ministry
	 * @return the new dm ministry
	 */
	public DmMinistry create(long id) {
		DmMinistry dmMinistry = new DmMinistryImpl();

		dmMinistry.setNew(true);
		dmMinistry.setPrimaryKey(id);

		return dmMinistry;
	}

	/**
	 * Removes the dm ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm ministry
	 * @return the dm ministry that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMinistry remove(long id)
		throws NoSuchDmMinistryException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the dm ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm ministry
	 * @return the dm ministry that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry remove(Serializable primaryKey)
		throws NoSuchDmMinistryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmMinistry dmMinistry = (DmMinistry)session.get(DmMinistryImpl.class,
					primaryKey);

			if (dmMinistry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmMinistry);
		}
		catch (NoSuchDmMinistryException nsee) {
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
	protected DmMinistry removeImpl(DmMinistry dmMinistry)
		throws SystemException {
		dmMinistry = toUnwrappedModel(dmMinistry);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmMinistry);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmMinistry);

		return dmMinistry;
	}

	@Override
	public DmMinistry updateImpl(
		vn.gt.dao.danhmucgt.model.DmMinistry dmMinistry, boolean merge)
		throws SystemException {
		dmMinistry = toUnwrappedModel(dmMinistry);

		boolean isNew = dmMinistry.isNew();

		DmMinistryModelImpl dmMinistryModelImpl = (DmMinistryModelImpl)dmMinistry;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmMinistry, merge);

			dmMinistry.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmMinistryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
			DmMinistryImpl.class, dmMinistry.getPrimaryKey(), dmMinistry);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
				new Object[] { dmMinistry.getMinistryCode() }, dmMinistry);
		}
		else {
			if ((dmMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MINISTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmMinistryModelImpl.getOriginalMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					new Object[] { dmMinistry.getMinistryCode() }, dmMinistry);
			}
		}

		return dmMinistry;
	}

	protected DmMinistry toUnwrappedModel(DmMinistry dmMinistry) {
		if (dmMinistry instanceof DmMinistryImpl) {
			return dmMinistry;
		}

		DmMinistryImpl dmMinistryImpl = new DmMinistryImpl();

		dmMinistryImpl.setNew(dmMinistry.isNew());
		dmMinistryImpl.setPrimaryKey(dmMinistry.getPrimaryKey());

		dmMinistryImpl.setId(dmMinistry.getId());
		dmMinistryImpl.setMinistryCode(dmMinistry.getMinistryCode());
		dmMinistryImpl.setMinistryName(dmMinistry.getMinistryName());
		dmMinistryImpl.setMinistryNameVN(dmMinistry.getMinistryNameVN());
		dmMinistryImpl.setMinistryOrder(dmMinistry.getMinistryOrder());
		dmMinistryImpl.setIsDelete(dmMinistry.getIsDelete());
		dmMinistryImpl.setMarkedAsDelete(dmMinistry.getMarkedAsDelete());
		dmMinistryImpl.setModifiedDate(dmMinistry.getModifiedDate());
		dmMinistryImpl.setRequestedDate(dmMinistry.getRequestedDate());
		dmMinistryImpl.setSyncVersion(dmMinistry.getSyncVersion());

		return dmMinistryImpl;
	}

	/**
	 * Returns the dm ministry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm ministry
	 * @return the dm ministry
	 * @throws com.liferay.portal.NoSuchModelException if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm ministry with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmMinistryException} if it could not be found.
	 *
	 * @param id the primary key of the dm ministry
	 * @return the dm ministry
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMinistry findByPrimaryKey(long id)
		throws NoSuchDmMinistryException, SystemException {
		DmMinistry dmMinistry = fetchByPrimaryKey(id);

		if (dmMinistry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmMinistry;
	}

	/**
	 * Returns the dm ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm ministry
	 * @return the dm ministry, or <code>null</code> if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMinistry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm ministry
	 * @return the dm ministry, or <code>null</code> if a dm ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMinistry fetchByPrimaryKey(long id) throws SystemException {
		DmMinistry dmMinistry = (DmMinistry)EntityCacheUtil.getResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
				DmMinistryImpl.class, id);

		if (dmMinistry == _nullDmMinistry) {
			return null;
		}

		if (dmMinistry == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmMinistry = (DmMinistry)session.get(DmMinistryImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmMinistry != null) {
					cacheResult(dmMinistry);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmMinistryModelImpl.ENTITY_CACHE_ENABLED,
						DmMinistryImpl.class, id, _nullDmMinistry);
				}

				closeSession(session);
			}
		}

		return dmMinistry;
	}

	/**
	 * Returns the dm ministry where ministryCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmMinistryException} if it could not be found.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching dm ministry
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmMinistryException if a matching dm ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMinistry findByMinistryCode(String ministryCode)
		throws NoSuchDmMinistryException, SystemException {
		DmMinistry dmMinistry = fetchByMinistryCode(ministryCode);

		if (dmMinistry == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmMinistryException(msg.toString());
		}

		return dmMinistry;
	}

	/**
	 * Returns the dm ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching dm ministry, or <code>null</code> if a matching dm ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMinistry fetchByMinistryCode(String ministryCode)
		throws SystemException {
		return fetchByMinistryCode(ministryCode, true);
	}

	/**
	 * Returns the dm ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ministryCode the ministry code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm ministry, or <code>null</code> if a matching dm ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMinistry fetchByMinistryCode(String ministryCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ministryCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMMINISTRY_WHERE);

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

			query.append(DmMinistryModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ministryCode != null) {
					qPos.add(ministryCode);
				}

				List<DmMinistry> list = q.list();

				result = list;

				DmMinistry dmMinistry = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
						finderArgs, list);
				}
				else {
					dmMinistry = list.get(0);

					cacheResult(dmMinistry);

					if ((dmMinistry.getMinistryCode() == null) ||
							!dmMinistry.getMinistryCode().equals(ministryCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MINISTRYCODE,
							finderArgs, dmMinistry);
					}
				}

				return dmMinistry;
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
				return (DmMinistry)result;
			}
		}
	}

	/**
	 * Returns all the dm ministries.
	 *
	 * @return the dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMinistry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ministries
	 * @param end the upper bound of the range of dm ministries (not inclusive)
	 * @return the range of dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMinistry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ministries
	 * @param end the upper bound of the range of dm ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMinistry> findAll(int start, int end,
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

		List<DmMinistry> list = (List<DmMinistry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMMINISTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMMINISTRY.concat(DmMinistryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmMinistry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmMinistry>)QueryUtil.list(q, getDialect(),
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
	 * Removes the dm ministry where ministryCode = &#63; from the database.
	 *
	 * @param ministryCode the ministry code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMinistryCode(String ministryCode)
		throws NoSuchDmMinistryException, SystemException {
		DmMinistry dmMinistry = findByMinistryCode(ministryCode);

		remove(dmMinistry);
	}

	/**
	 * Removes all the dm ministries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmMinistry dmMinistry : findAll()) {
			remove(dmMinistry);
		}
	}

	/**
	 * Returns the number of dm ministries where ministryCode = &#63;.
	 *
	 * @param ministryCode the ministry code
	 * @return the number of matching dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMinistryCode(String ministryCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { ministryCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMMINISTRY_WHERE);

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
	 * Returns the number of dm ministries.
	 *
	 * @return the number of dm ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMMINISTRY);

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
	 * Initializes the dm ministry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmMinistry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmMinistry>> listenersList = new ArrayList<ModelListener<DmMinistry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmMinistry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmMinistryImpl.class.getName());
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
	private static final String _SQL_SELECT_DMMINISTRY = "SELECT dmMinistry FROM DmMinistry dmMinistry";
	private static final String _SQL_SELECT_DMMINISTRY_WHERE = "SELECT dmMinistry FROM DmMinistry dmMinistry WHERE ";
	private static final String _SQL_COUNT_DMMINISTRY = "SELECT COUNT(dmMinistry) FROM DmMinistry dmMinistry";
	private static final String _SQL_COUNT_DMMINISTRY_WHERE = "SELECT COUNT(dmMinistry) FROM DmMinistry dmMinistry WHERE ";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1 = "dmMinistry.ministryCode IS NULL";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2 = "dmMinistry.ministryCode = ?";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3 = "(dmMinistry.ministryCode IS NULL OR dmMinistry.ministryCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmMinistry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmMinistry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmMinistry exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmMinistryPersistenceImpl.class);
	private static DmMinistry _nullDmMinistry = new DmMinistryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmMinistry> toCacheModel() {
				return _nullDmMinistryCacheModel;
			}
		};

	private static CacheModel<DmMinistry> _nullDmMinistryCacheModel = new CacheModel<DmMinistry>() {
			public DmMinistry toEntityModel() {
				return _nullDmMinistry;
			}
		};
}