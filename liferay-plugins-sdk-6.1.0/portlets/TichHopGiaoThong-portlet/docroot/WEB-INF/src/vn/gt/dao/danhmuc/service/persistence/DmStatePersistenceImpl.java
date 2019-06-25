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

import vn.gt.dao.danhmuc.NoSuchDmStateException;
import vn.gt.dao.danhmuc.model.DmState;
import vn.gt.dao.danhmuc.model.impl.DmStateImpl;
import vn.gt.dao.danhmuc.model.impl.DmStateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmStatePersistence
 * @see DmStateUtil
 * @generated
 */
public class DmStatePersistenceImpl extends BasePersistenceImpl<DmState>
	implements DmStatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmStateUtil} to access the dm state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmStateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATECODE =
		new FinderPath(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateModelImpl.FINDER_CACHE_ENABLED, DmStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStateCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE =
		new FinderPath(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateModelImpl.FINDER_CACHE_ENABLED, DmStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStateCode",
			new String[] { String.class.getName() },
			DmStateModelImpl.STATECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATECODE = new FinderPath(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStateCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateModelImpl.FINDER_CACHE_ENABLED, DmStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateModelImpl.FINDER_CACHE_ENABLED, DmStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm state in the entity cache if it is enabled.
	 *
	 * @param dmState the dm state
	 */
	public void cacheResult(DmState dmState) {
		EntityCacheUtil.putResult(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateImpl.class, dmState.getPrimaryKey(), dmState);

		dmState.resetOriginalValues();
	}

	/**
	 * Caches the dm states in the entity cache if it is enabled.
	 *
	 * @param dmStates the dm states
	 */
	public void cacheResult(List<DmState> dmStates) {
		for (DmState dmState : dmStates) {
			if (EntityCacheUtil.getResult(
						DmStateModelImpl.ENTITY_CACHE_ENABLED,
						DmStateImpl.class, dmState.getPrimaryKey()) == null) {
				cacheResult(dmState);
			}
			else {
				dmState.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm states.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmStateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmStateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm state.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmState dmState) {
		EntityCacheUtil.removeResult(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateImpl.class, dmState.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmState> dmStates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmState dmState : dmStates) {
			EntityCacheUtil.removeResult(DmStateModelImpl.ENTITY_CACHE_ENABLED,
				DmStateImpl.class, dmState.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm state with the primary key. Does not add the dm state to the database.
	 *
	 * @param id the primary key for the new dm state
	 * @return the new dm state
	 */
	public DmState create(int id) {
		DmState dmState = new DmStateImpl();

		dmState.setNew(true);
		dmState.setPrimaryKey(id);

		return dmState;
	}

	/**
	 * Removes the dm state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm state
	 * @return the dm state that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmStateException if a dm state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmState remove(int id)
		throws NoSuchDmStateException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm state
	 * @return the dm state that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmStateException if a dm state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmState remove(Serializable primaryKey)
		throws NoSuchDmStateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmState dmState = (DmState)session.get(DmStateImpl.class, primaryKey);

			if (dmState == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmState);
		}
		catch (NoSuchDmStateException nsee) {
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
	protected DmState removeImpl(DmState dmState) throws SystemException {
		dmState = toUnwrappedModel(dmState);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmState);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmState);

		return dmState;
	}

	@Override
	public DmState updateImpl(vn.gt.dao.danhmuc.model.DmState dmState,
		boolean merge) throws SystemException {
		dmState = toUnwrappedModel(dmState);

		boolean isNew = dmState.isNew();

		DmStateModelImpl dmStateModelImpl = (DmStateModelImpl)dmState;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmState, merge);

			dmState.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmStateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmStateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmStateModelImpl.getOriginalStateCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE,
					args);

				args = new Object[] { dmStateModelImpl.getStateCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmStateModelImpl.ENTITY_CACHE_ENABLED,
			DmStateImpl.class, dmState.getPrimaryKey(), dmState);

		return dmState;
	}

	protected DmState toUnwrappedModel(DmState dmState) {
		if (dmState instanceof DmStateImpl) {
			return dmState;
		}

		DmStateImpl dmStateImpl = new DmStateImpl();

		dmStateImpl.setNew(dmState.isNew());
		dmStateImpl.setPrimaryKey(dmState.getPrimaryKey());

		dmStateImpl.setId(dmState.getId());
		dmStateImpl.setStateCode(dmState.getStateCode());
		dmStateImpl.setStateName(dmState.getStateName());
		dmStateImpl.setDescription(dmState.getDescription());
		dmStateImpl.setIsDelete(dmState.getIsDelete());
		dmStateImpl.setMarkedAsDelete(dmState.getMarkedAsDelete());
		dmStateImpl.setModifiedDate(dmState.getModifiedDate());
		dmStateImpl.setRequestedDate(dmState.getRequestedDate());
		dmStateImpl.setSyncVersion(dmState.getSyncVersion());

		return dmStateImpl;
	}

	/**
	 * Returns the dm state with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm state
	 * @return the dm state
	 * @throws com.liferay.portal.NoSuchModelException if a dm state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmState findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm state with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmStateException} if it could not be found.
	 *
	 * @param id the primary key of the dm state
	 * @return the dm state
	 * @throws vn.gt.dao.danhmuc.NoSuchDmStateException if a dm state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmState findByPrimaryKey(int id)
		throws NoSuchDmStateException, SystemException {
		DmState dmState = fetchByPrimaryKey(id);

		if (dmState == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmState;
	}

	/**
	 * Returns the dm state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm state
	 * @return the dm state, or <code>null</code> if a dm state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmState fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm state
	 * @return the dm state, or <code>null</code> if a dm state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmState fetchByPrimaryKey(int id) throws SystemException {
		DmState dmState = (DmState)EntityCacheUtil.getResult(DmStateModelImpl.ENTITY_CACHE_ENABLED,
				DmStateImpl.class, id);

		if (dmState == _nullDmState) {
			return null;
		}

		if (dmState == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmState = (DmState)session.get(DmStateImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmState != null) {
					cacheResult(dmState);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmStateModelImpl.ENTITY_CACHE_ENABLED,
						DmStateImpl.class, id, _nullDmState);
				}

				closeSession(session);
			}
		}

		return dmState;
	}

	/**
	 * Returns all the dm states where stateCode = &#63;.
	 *
	 * @param stateCode the state code
	 * @return the matching dm states
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmState> findByStateCode(String stateCode)
		throws SystemException {
		return findByStateCode(stateCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm states where stateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param start the lower bound of the range of dm states
	 * @param end the upper bound of the range of dm states (not inclusive)
	 * @return the range of matching dm states
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmState> findByStateCode(String stateCode, int start, int end)
		throws SystemException {
		return findByStateCode(stateCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm states where stateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param start the lower bound of the range of dm states
	 * @param end the upper bound of the range of dm states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm states
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmState> findByStateCode(String stateCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODE;
			finderArgs = new Object[] { stateCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATECODE;
			finderArgs = new Object[] { stateCode, start, end, orderByComparator };
		}

		List<DmState> list = (List<DmState>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMSTATE_WHERE);

			if (stateCode == null) {
				query.append(_FINDER_COLUMN_STATECODE_STATECODE_1);
			}
			else {
				if (stateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STATECODE_STATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_STATECODE_STATECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmStateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (stateCode != null) {
					qPos.add(stateCode);
				}

				list = (List<DmState>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first dm state in the ordered set where stateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm state
	 * @throws vn.gt.dao.danhmuc.NoSuchDmStateException if a matching dm state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmState findByStateCode_First(String stateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmStateException, SystemException {
		List<DmState> list = findByStateCode(stateCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("stateCode=");
			msg.append(stateCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmStateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm state in the ordered set where stateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm state
	 * @throws vn.gt.dao.danhmuc.NoSuchDmStateException if a matching dm state could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmState findByStateCode_Last(String stateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmStateException, SystemException {
		int count = countByStateCode(stateCode);

		List<DmState> list = findByStateCode(stateCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("stateCode=");
			msg.append(stateCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmStateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm states before and after the current dm state in the ordered set where stateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm state
	 * @param stateCode the state code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm state
	 * @throws vn.gt.dao.danhmuc.NoSuchDmStateException if a dm state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmState[] findByStateCode_PrevAndNext(int id, String stateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmStateException, SystemException {
		DmState dmState = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmState[] array = new DmStateImpl[3];

			array[0] = getByStateCode_PrevAndNext(session, dmState, stateCode,
					orderByComparator, true);

			array[1] = dmState;

			array[2] = getByStateCode_PrevAndNext(session, dmState, stateCode,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmState getByStateCode_PrevAndNext(Session session,
		DmState dmState, String stateCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMSTATE_WHERE);

		if (stateCode == null) {
			query.append(_FINDER_COLUMN_STATECODE_STATECODE_1);
		}
		else {
			if (stateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODE_STATECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_STATECODE_STATECODE_2);
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
			query.append(DmStateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (stateCode != null) {
			qPos.add(stateCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmState);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmState> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm states.
	 *
	 * @return the dm states
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmState> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm states
	 * @param end the upper bound of the range of dm states (not inclusive)
	 * @return the range of dm states
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmState> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm states
	 * @param end the upper bound of the range of dm states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm states
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmState> findAll(int start, int end,
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

		List<DmState> list = (List<DmState>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMSTATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMSTATE.concat(DmStateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmState>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmState>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm states where stateCode = &#63; from the database.
	 *
	 * @param stateCode the state code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStateCode(String stateCode) throws SystemException {
		for (DmState dmState : findByStateCode(stateCode)) {
			remove(dmState);
		}
	}

	/**
	 * Removes all the dm states from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmState dmState : findAll()) {
			remove(dmState);
		}
	}

	/**
	 * Returns the number of dm states where stateCode = &#63;.
	 *
	 * @param stateCode the state code
	 * @return the number of matching dm states
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStateCode(String stateCode) throws SystemException {
		Object[] finderArgs = new Object[] { stateCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMSTATE_WHERE);

			if (stateCode == null) {
				query.append(_FINDER_COLUMN_STATECODE_STATECODE_1);
			}
			else {
				if (stateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STATECODE_STATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_STATECODE_STATECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (stateCode != null) {
					qPos.add(stateCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm states.
	 *
	 * @return the number of dm states
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMSTATE);

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
	 * Initializes the dm state persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmState")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmState>> listenersList = new ArrayList<ModelListener<DmState>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmState>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmStateImpl.class.getName());
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
	private static final String _SQL_SELECT_DMSTATE = "SELECT dmState FROM DmState dmState";
	private static final String _SQL_SELECT_DMSTATE_WHERE = "SELECT dmState FROM DmState dmState WHERE ";
	private static final String _SQL_COUNT_DMSTATE = "SELECT COUNT(dmState) FROM DmState dmState";
	private static final String _SQL_COUNT_DMSTATE_WHERE = "SELECT COUNT(dmState) FROM DmState dmState WHERE ";
	private static final String _FINDER_COLUMN_STATECODE_STATECODE_1 = "dmState.stateCode IS NULL";
	private static final String _FINDER_COLUMN_STATECODE_STATECODE_2 = "dmState.stateCode = ?";
	private static final String _FINDER_COLUMN_STATECODE_STATECODE_3 = "(dmState.stateCode IS NULL OR dmState.stateCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmState.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmState exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmState exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmStatePersistenceImpl.class);
	private static DmState _nullDmState = new DmStateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmState> toCacheModel() {
				return _nullDmStateCacheModel;
			}
		};

	private static CacheModel<DmState> _nullDmStateCacheModel = new CacheModel<DmState>() {
			public DmState toEntityModel() {
				return _nullDmState;
			}
		};
}