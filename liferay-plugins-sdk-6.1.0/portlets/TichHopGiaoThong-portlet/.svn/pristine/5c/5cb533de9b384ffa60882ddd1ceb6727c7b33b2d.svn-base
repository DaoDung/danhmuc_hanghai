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

import vn.gt.dao.common.NoSuchUserSignException;
import vn.gt.dao.common.model.UserSign;
import vn.gt.dao.common.model.impl.UserSignImpl;
import vn.gt.dao.common.model.impl.UserSignModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user sign service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see UserSignPersistence
 * @see UserSignUtil
 * @generated
 */
public class UserSignPersistenceImpl extends BasePersistenceImpl<UserSign>
	implements UserSignPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserSignUtil} to access the user sign persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserSignImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE = new FinderPath(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignModelImpl.FINDER_CACHE_ENABLED, UserSignImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE =
		new FinderPath(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignModelImpl.FINDER_CACHE_ENABLED, UserSignImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortCode",
			new String[] { String.class.getName() },
			UserSignModelImpl.PORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODE = new FinderPath(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignModelImpl.FINDER_CACHE_ENABLED, UserSignImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUserId",
			new String[] { Long.class.getName() },
			UserSignModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignModelImpl.FINDER_CACHE_ENABLED, UserSignImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignModelImpl.FINDER_CACHE_ENABLED, UserSignImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the user sign in the entity cache if it is enabled.
	 *
	 * @param userSign the user sign
	 */
	public void cacheResult(UserSign userSign) {
		EntityCacheUtil.putResult(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignImpl.class, userSign.getPrimaryKey(), userSign);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { Long.valueOf(userSign.getUserId()) }, userSign);

		userSign.resetOriginalValues();
	}

	/**
	 * Caches the user signs in the entity cache if it is enabled.
	 *
	 * @param userSigns the user signs
	 */
	public void cacheResult(List<UserSign> userSigns) {
		for (UserSign userSign : userSigns) {
			if (EntityCacheUtil.getResult(
						UserSignModelImpl.ENTITY_CACHE_ENABLED,
						UserSignImpl.class, userSign.getPrimaryKey()) == null) {
				cacheResult(userSign);
			}
			else {
				userSign.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user signs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserSignImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserSignImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user sign.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserSign userSign) {
		EntityCacheUtil.removeResult(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignImpl.class, userSign.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { Long.valueOf(userSign.getUserId()) });
	}

	/**
	 * Creates a new user sign with the primary key. Does not add the user sign to the database.
	 *
	 * @param id the primary key for the new user sign
	 * @return the new user sign
	 */
	public UserSign create(long id) {
		UserSign userSign = new UserSignImpl();

		userSign.setNew(true);
		userSign.setPrimaryKey(id);

		return userSign;
	}

	/**
	 * Removes the user sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user sign
	 * @return the user sign that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a user sign with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSign remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the user sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user sign
	 * @return the user sign that was removed
	 * @throws vn.gt.dao.common.NoSuchUserSignException if a user sign with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign remove(long id)
		throws NoSuchUserSignException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserSign userSign = (UserSign)session.get(UserSignImpl.class,
					Long.valueOf(id));

			if (userSign == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchUserSignException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return userSignPersistence.remove(userSign);
		}
		catch (NoSuchUserSignException nsee) {
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
	 * Removes the user sign from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userSign the user sign
	 * @return the user sign that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSign remove(UserSign userSign) throws SystemException {
		return super.remove(userSign);
	}

	@Override
	protected UserSign removeImpl(UserSign userSign) throws SystemException {
		userSign = toUnwrappedModel(userSign);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, userSign);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		UserSignModelImpl userSignModelImpl = (UserSignModelImpl)userSign;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { Long.valueOf(userSignModelImpl.getUserId()) });

		EntityCacheUtil.removeResult(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignImpl.class, userSign.getPrimaryKey());

		return userSign;
	}

	@Override
	public UserSign updateImpl(vn.gt.dao.common.model.UserSign userSign,
		boolean merge) throws SystemException {
		userSign = toUnwrappedModel(userSign);

		boolean isNew = userSign.isNew();

		UserSignModelImpl userSignModelImpl = (UserSignModelImpl)userSign;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, userSign, merge);

			userSign.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserSignModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userSignModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userSignModelImpl.getOriginalPortCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);

				args = new Object[] { userSignModelImpl.getPortCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(UserSignModelImpl.ENTITY_CACHE_ENABLED,
			UserSignImpl.class, userSign.getPrimaryKey(), userSign);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
				new Object[] { Long.valueOf(userSign.getUserId()) }, userSign);
		}
		else {
			if ((userSignModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(userSignModelImpl.getOriginalUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
					new Object[] { Long.valueOf(userSign.getUserId()) },
					userSign);
			}
		}

		return userSign;
	}

	protected UserSign toUnwrappedModel(UserSign userSign) {
		if (userSign instanceof UserSignImpl) {
			return userSign;
		}

		UserSignImpl userSignImpl = new UserSignImpl();

		userSignImpl.setNew(userSign.isNew());
		userSignImpl.setPrimaryKey(userSign.getPrimaryKey());

		userSignImpl.setId(userSign.getId());
		userSignImpl.setUserId(userSign.getUserId());
		userSignImpl.setPortCode(userSign.getPortCode());
		userSignImpl.setTitle(userSign.getTitle());
		userSignImpl.setRepresentative(userSign.getRepresentative());
		userSignImpl.setFileChuKyId(userSign.getFileChuKyId());
		userSignImpl.setFileConDauId(userSign.getFileConDauId());
		userSignImpl.setFileChungThuSoId(userSign.getFileChungThuSoId());
		userSignImpl.setModifyUser(userSign.getModifyUser());
		userSignImpl.setModifyDate(userSign.getModifyDate());

		return userSignImpl;
	}

	/**
	 * Returns the user sign with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user sign
	 * @return the user sign
	 * @throws com.liferay.portal.NoSuchModelException if a user sign with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSign findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the user sign with the primary key or throws a {@link vn.gt.dao.common.NoSuchUserSignException} if it could not be found.
	 *
	 * @param id the primary key of the user sign
	 * @return the user sign
	 * @throws vn.gt.dao.common.NoSuchUserSignException if a user sign with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign findByPrimaryKey(long id)
		throws NoSuchUserSignException, SystemException {
		UserSign userSign = fetchByPrimaryKey(id);

		if (userSign == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchUserSignException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return userSign;
	}

	/**
	 * Returns the user sign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user sign
	 * @return the user sign, or <code>null</code> if a user sign with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSign fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the user sign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user sign
	 * @return the user sign, or <code>null</code> if a user sign with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign fetchByPrimaryKey(long id) throws SystemException {
		UserSign userSign = (UserSign)EntityCacheUtil.getResult(UserSignModelImpl.ENTITY_CACHE_ENABLED,
				UserSignImpl.class, id);

		if (userSign == _nullUserSign) {
			return null;
		}

		if (userSign == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				userSign = (UserSign)session.get(UserSignImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (userSign != null) {
					cacheResult(userSign);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(UserSignModelImpl.ENTITY_CACHE_ENABLED,
						UserSignImpl.class, id, _nullUserSign);
				}

				closeSession(session);
			}
		}

		return userSign;
	}

	/**
	 * Returns all the user signs where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the matching user signs
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserSign> findByPortCode(String portCode)
		throws SystemException {
		return findByPortCode(portCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the user signs where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of user signs
	 * @param end the upper bound of the range of user signs (not inclusive)
	 * @return the range of matching user signs
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserSign> findByPortCode(String portCode, int start, int end)
		throws SystemException {
		return findByPortCode(portCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user signs where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of user signs
	 * @param end the upper bound of the range of user signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user signs
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserSign> findByPortCode(String portCode, int start, int end,
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

		List<UserSign> list = (List<UserSign>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_USERSIGN_WHERE);

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
				query.append(UserSignModelImpl.ORDER_BY_JPQL);
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

				list = (List<UserSign>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first user sign in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user sign
	 * @throws vn.gt.dao.common.NoSuchUserSignException if a matching user sign could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign findByPortCode_First(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserSignException, SystemException {
		List<UserSign> list = findByPortCode(portCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchUserSignException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last user sign in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user sign
	 * @throws vn.gt.dao.common.NoSuchUserSignException if a matching user sign could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign findByPortCode_Last(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserSignException, SystemException {
		int count = countByPortCode(portCode);

		List<UserSign> list = findByPortCode(portCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchUserSignException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the user signs before and after the current user sign in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current user sign
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user sign
	 * @throws vn.gt.dao.common.NoSuchUserSignException if a user sign with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign[] findByPortCode_PrevAndNext(long id, String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserSignException, SystemException {
		UserSign userSign = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserSign[] array = new UserSignImpl[3];

			array[0] = getByPortCode_PrevAndNext(session, userSign, portCode,
					orderByComparator, true);

			array[1] = userSign;

			array[2] = getByPortCode_PrevAndNext(session, userSign, portCode,
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

	protected UserSign getByPortCode_PrevAndNext(Session session,
		UserSign userSign, String portCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERSIGN_WHERE);

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
			query.append(UserSignModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(userSign);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserSign> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the user sign where userId = &#63; or throws a {@link vn.gt.dao.common.NoSuchUserSignException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching user sign
	 * @throws vn.gt.dao.common.NoSuchUserSignException if a matching user sign could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign findByUserId(long userId)
		throws NoSuchUserSignException, SystemException {
		UserSign userSign = fetchByUserId(userId);

		if (userSign == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserSignException(msg.toString());
		}

		return userSign;
	}

	/**
	 * Returns the user sign where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching user sign, or <code>null</code> if a matching user sign could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign fetchByUserId(long userId) throws SystemException {
		return fetchByUserId(userId, true);
	}

	/**
	 * Returns the user sign where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user sign, or <code>null</code> if a matching user sign could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserSign fetchByUserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_USERSIGN_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			query.append(UserSignModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<UserSign> list = q.list();

				result = list;

				UserSign userSign = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					userSign = list.get(0);

					cacheResult(userSign);

					if ((userSign.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, userSign);
					}
				}

				return userSign;
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
				return (UserSign)result;
			}
		}
	}

	/**
	 * Returns all the user signs.
	 *
	 * @return the user signs
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserSign> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of user signs
	 * @param end the upper bound of the range of user signs (not inclusive)
	 * @return the range of user signs
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserSign> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of user signs
	 * @param end the upper bound of the range of user signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user signs
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserSign> findAll(int start, int end,
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

		List<UserSign> list = (List<UserSign>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERSIGN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERSIGN.concat(UserSignModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<UserSign>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<UserSign>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user signs where portCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortCode(String portCode) throws SystemException {
		for (UserSign userSign : findByPortCode(portCode)) {
			userSignPersistence.remove(userSign);
		}
	}

	/**
	 * Removes the user sign where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUserId(long userId)
		throws NoSuchUserSignException, SystemException {
		UserSign userSign = findByUserId(userId);

		userSignPersistence.remove(userSign);
	}

	/**
	 * Removes all the user signs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (UserSign userSign : findAll()) {
			userSignPersistence.remove(userSign);
		}
	}

	/**
	 * Returns the number of user signs where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the number of matching user signs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortCode(String portCode) throws SystemException {
		Object[] finderArgs = new Object[] { portCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERSIGN_WHERE);

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
	 * Returns the number of user signs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user signs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUserId(long userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERSIGN_WHERE);

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
	 * Returns the number of user signs.
	 *
	 * @return the number of user signs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERSIGN);

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
	 * Initializes the user sign persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.common.model.UserSign")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserSign>> listenersList = new ArrayList<ModelListener<UserSign>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserSign>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserSignImpl.class.getName());
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
	private static final String _SQL_SELECT_USERSIGN = "SELECT userSign FROM UserSign userSign";
	private static final String _SQL_SELECT_USERSIGN_WHERE = "SELECT userSign FROM UserSign userSign WHERE ";
	private static final String _SQL_COUNT_USERSIGN = "SELECT COUNT(userSign) FROM UserSign userSign";
	private static final String _SQL_COUNT_USERSIGN_WHERE = "SELECT COUNT(userSign) FROM UserSign userSign WHERE ";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_1 = "userSign.portCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_2 = "userSign.portCode = ?";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_3 = "(userSign.portCode IS NULL OR userSign.portCode = ?)";
	private static final String _FINDER_COLUMN_USERID_USERID_2 = "userSign.userId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userSign.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserSign exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserSign exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserSignPersistenceImpl.class);
	private static UserSign _nullUserSign = new UserSignImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserSign> toCacheModel() {
				return _nullUserSignCacheModel;
			}
		};

	private static CacheModel<UserSign> _nullUserSignCacheModel = new CacheModel<UserSign>() {
			public UserSign toEntityModel() {
				return _nullUserSign;
			}
		};
}