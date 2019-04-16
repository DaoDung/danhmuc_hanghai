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

package vn.gt.dao.common.service.persistence;

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

import vn.gt.dao.common.NoSuchUserPortException;
import vn.gt.dao.common.model.UserPort;
import vn.gt.dao.common.model.impl.UserPortImpl;
import vn.gt.dao.common.model.impl.UserPortModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see UserPortPersistence
 * @see UserPortUtil
 * @generated
 */
public class UserPortPersistenceImpl extends BasePersistenceImpl<UserPort>
	implements UserPortPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserPortUtil} to access the user port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserPortImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE =
		new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortCode",
			new String[] { String.class.getName() },
			UserPortModelImpl.PORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODE = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUserId",
			new String[] { Long.class.getName() },
			UserPortModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the user port in the entity cache if it is enabled.
	 *
	 * @param userPort the user port
	 */
	public void cacheResult(UserPort userPort) {
		EntityCacheUtil.putResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortImpl.class, userPort.getPrimaryKey(), userPort);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { Long.valueOf(userPort.getUserId()) }, userPort);

		userPort.resetOriginalValues();
	}

	/**
	 * Caches the user ports in the entity cache if it is enabled.
	 *
	 * @param userPorts the user ports
	 */
	public void cacheResult(List<UserPort> userPorts) {
		for (UserPort userPort : userPorts) {
			if (EntityCacheUtil.getResult(
						UserPortModelImpl.ENTITY_CACHE_ENABLED,
						UserPortImpl.class, userPort.getPrimaryKey()) == null) {
				cacheResult(userPort);
			}
			else {
				userPort.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user ports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserPortImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserPortImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user port.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserPort userPort) {
		EntityCacheUtil.removeResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortImpl.class, userPort.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { Long.valueOf(userPort.getUserId()) });
	}

	/**
	 * Creates a new user port with the primary key. Does not add the user port to the database.
	 *
	 * @param id the primary key for the new user port
	 * @return the new user port
	 */
	public UserPort create(long id) {
		UserPort userPort = new UserPortImpl();

		userPort.setNew(true);
		userPort.setPrimaryKey(id);

		return userPort;
	}

	/**
	 * Removes the user port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user port
	 * @return the user port that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the user port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user port
	 * @return the user port that was removed
	 * @throws vn.gt.dao.common.NoSuchUserPortException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort remove(long id)
		throws NoSuchUserPortException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserPort userPort = (UserPort)session.get(UserPortImpl.class,
					Long.valueOf(id));

			if (userPort == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchUserPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return userPortPersistence.remove(userPort);
		}
		catch (NoSuchUserPortException nsee) {
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
	 * Removes the user port from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userPort the user port
	 * @return the user port that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort remove(UserPort userPort) throws SystemException {
		return super.remove(userPort);
	}

	@Override
	protected UserPort removeImpl(UserPort userPort) throws SystemException {
		userPort = toUnwrappedModel(userPort);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, userPort);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		UserPortModelImpl userPortModelImpl = (UserPortModelImpl)userPort;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { Long.valueOf(userPortModelImpl.getUserId()) });

		EntityCacheUtil.removeResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortImpl.class, userPort.getPrimaryKey());

		return userPort;
	}

	@Override
	public UserPort updateImpl(vn.gt.dao.common.model.UserPort userPort,
		boolean merge) throws SystemException {
		userPort = toUnwrappedModel(userPort);

		boolean isNew = userPort.isNew();

		UserPortModelImpl userPortModelImpl = (UserPortModelImpl)userPort;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, userPort, merge);

			userPort.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserPortModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userPortModelImpl.getOriginalPortCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);

				args = new Object[] { userPortModelImpl.getPortCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortImpl.class, userPort.getPrimaryKey(), userPort);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
				new Object[] { Long.valueOf(userPort.getUserId()) }, userPort);
		}
		else {
			if ((userPortModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(userPortModelImpl.getOriginalUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
					new Object[] { Long.valueOf(userPort.getUserId()) },
					userPort);
			}
		}

		return userPort;
	}

	protected UserPort toUnwrappedModel(UserPort userPort) {
		if (userPort instanceof UserPortImpl) {
			return userPort;
		}

		UserPortImpl userPortImpl = new UserPortImpl();

		userPortImpl.setNew(userPort.isNew());
		userPortImpl.setPrimaryKey(userPort.getPrimaryKey());

		userPortImpl.setId(userPort.getId());
		userPortImpl.setPortCode(userPort.getPortCode());
		userPortImpl.setUserId(userPort.getUserId());
		userPortImpl.setCreateDate(userPort.getCreateDate());
		userPortImpl.setStatus(userPort.getStatus());

		return userPortImpl;
	}

	/**
	 * Returns the user port with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user port
	 * @return the user port
	 * @throws com.liferay.portal.NoSuchModelException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the user port with the primary key or throws a {@link vn.gt.dao.common.NoSuchUserPortException} if it could not be found.
	 *
	 * @param id the primary key of the user port
	 * @return the user port
	 * @throws vn.gt.dao.common.NoSuchUserPortException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort findByPrimaryKey(long id)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = fetchByPrimaryKey(id);

		if (userPort == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchUserPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return userPort;
	}

	/**
	 * Returns the user port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user port
	 * @return the user port, or <code>null</code> if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the user port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user port
	 * @return the user port, or <code>null</code> if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort fetchByPrimaryKey(long id) throws SystemException {
		UserPort userPort = (UserPort)EntityCacheUtil.getResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
				UserPortImpl.class, id);

		if (userPort == _nullUserPort) {
			return null;
		}

		if (userPort == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				userPort = (UserPort)session.get(UserPortImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (userPort != null) {
					cacheResult(userPort);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
						UserPortImpl.class, id, _nullUserPort);
				}

				closeSession(session);
			}
		}

		return userPort;
	}

	/**
	 * Returns all the user ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserPort> findByPortCode(String portCode)
		throws SystemException {
		return findByPortCode(portCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the user ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of user ports
	 * @param end the upper bound of the range of user ports (not inclusive)
	 * @return the range of matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserPort> findByPortCode(String portCode, int start, int end)
		throws SystemException {
		return findByPortCode(portCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of user ports
	 * @param end the upper bound of the range of user ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserPort> findByPortCode(String portCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE;
			finderArgs = new Object[] { portCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE;
			finderArgs = new Object[] { portCode, start, end, orderByComparator };
		}

		List<UserPort> list = (List<UserPort>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_USERPORT_WHERE);

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
			}
			else {
				if (portCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(UserPortModelImpl.ORDER_BY_JPQL);
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

				list = (List<UserPort>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first user port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user port
	 * @throws vn.gt.dao.common.NoSuchUserPortException if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort findByPortCode_First(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserPortException, SystemException {
		List<UserPort> list = findByPortCode(portCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchUserPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last user port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user port
	 * @throws vn.gt.dao.common.NoSuchUserPortException if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort findByPortCode_Last(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserPortException, SystemException {
		int count = countByPortCode(portCode);

		List<UserPort> list = findByPortCode(portCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchUserPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the user ports before and after the current user port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current user port
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user port
	 * @throws vn.gt.dao.common.NoSuchUserPortException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort[] findByPortCode_PrevAndNext(long id, String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserPort[] array = new UserPortImpl[3];

			array[0] = getByPortCode_PrevAndNext(session, userPort, portCode,
					orderByComparator, true);

			array[1] = userPort;

			array[2] = getByPortCode_PrevAndNext(session, userPort, portCode,
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

	protected UserPort getByPortCode_PrevAndNext(Session session,
		UserPort userPort, String portCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERPORT_WHERE);

		if (portCode == null) {
			query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
		}
		else {
			if (portCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
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
			query.append(UserPortModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(userPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the user port where userId = &#63; or throws a {@link vn.gt.dao.common.NoSuchUserPortException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching user port
	 * @throws vn.gt.dao.common.NoSuchUserPortException if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort findByUserId(long userId)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = fetchByUserId(userId);

		if (userPort == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserPortException(msg.toString());
		}

		return userPort;
	}

	/**
	 * Returns the user port where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching user port, or <code>null</code> if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort fetchByUserId(long userId) throws SystemException {
		return fetchByUserId(userId, true);
	}

	/**
	 * Returns the user port where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user port, or <code>null</code> if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserPort fetchByUserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_USERPORT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			query.append(UserPortModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<UserPort> list = q.list();

				result = list;

				UserPort userPort = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					userPort = list.get(0);

					cacheResult(userPort);

					if ((userPort.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, userPort);
					}
				}

				return userPort;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
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
				return (UserPort)result;
			}
		}
	}

	/**
	 * Returns all the user ports.
	 *
	 * @return the user ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserPort> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of user ports
	 * @param end the upper bound of the range of user ports (not inclusive)
	 * @return the range of user ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserPort> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of user ports
	 * @param end the upper bound of the range of user ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserPort> findAll(int start, int end,
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

		List<UserPort> list = (List<UserPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERPORT.concat(UserPortModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<UserPort>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<UserPort>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user ports where portCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortCode(String portCode) throws SystemException {
		for (UserPort userPort : findByPortCode(portCode)) {
			userPortPersistence.remove(userPort);
		}
	}

	/**
	 * Removes the user port where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUserId(long userId)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = findByUserId(userId);

		userPortPersistence.remove(userPort);
	}

	/**
	 * Removes all the user ports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (UserPort userPort : findAll()) {
			userPortPersistence.remove(userPort);
		}
	}

	/**
	 * Returns the number of user ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the number of matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortCode(String portCode) throws SystemException {
		Object[] finderArgs = new Object[] { portCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERPORT_WHERE);

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
			}
			else {
				if (portCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of user ports where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUserId(long userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERPORT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of user ports.
	 *
	 * @return the number of user ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERPORT);

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
	 * Initializes the user port persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.common.model.UserPort")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserPort>> listenersList = new ArrayList<ModelListener<UserPort>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserPort>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserPortImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = LogMessageValidationPersistence.class)
	protected LogMessageValidationPersistence logMessageValidationPersistence;
	@BeanReference(type = UserPortPersistence.class)
	protected UserPortPersistence userPortPersistence;
	@BeanReference(type = UserSignPersistence.class)
	protected UserSignPersistence userSignPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_USERPORT = "SELECT userPort FROM UserPort userPort";
	private static final String _SQL_SELECT_USERPORT_WHERE = "SELECT userPort FROM UserPort userPort WHERE ";
	private static final String _SQL_COUNT_USERPORT = "SELECT COUNT(userPort) FROM UserPort userPort";
	private static final String _SQL_COUNT_USERPORT_WHERE = "SELECT COUNT(userPort) FROM UserPort userPort WHERE ";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_1 = "userPort.portCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_2 = "userPort.portCode = ?";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_3 = "(userPort.portCode IS NULL OR userPort.portCode = ?)";
	private static final String _FINDER_COLUMN_USERID_USERID_2 = "userPort.userId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userPort.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserPort exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserPort exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserPortPersistenceImpl.class);
	private static UserPort _nullUserPort = new UserPortImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserPort> toCacheModel() {
				return _nullUserPortCacheModel;
			}
		};

	private static CacheModel<UserPort> _nullUserPortCacheModel = new CacheModel<UserPort>() {
			public UserPort toEntityModel() {
				return _nullUserPort;
			}
		};
}