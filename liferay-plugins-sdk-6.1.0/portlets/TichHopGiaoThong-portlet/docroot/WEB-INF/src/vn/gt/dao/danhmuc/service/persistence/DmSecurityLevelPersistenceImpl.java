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

import vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException;
import vn.gt.dao.danhmuc.model.DmSecurityLevel;
import vn.gt.dao.danhmuc.model.impl.DmSecurityLevelImpl;
import vn.gt.dao.danhmuc.model.impl.DmSecurityLevelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm security level service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmSecurityLevelPersistence
 * @see DmSecurityLevelUtil
 * @generated
 */
public class DmSecurityLevelPersistenceImpl extends BasePersistenceImpl<DmSecurityLevel>
	implements DmSecurityLevelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmSecurityLevelUtil} to access the dm security level persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmSecurityLevelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SECURITYLEVELCODE =
		new FinderPath(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmSecurityLevelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySecurityLevelCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE =
		new FinderPath(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmSecurityLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySecurityLevelCode", new String[] { String.class.getName() },
			DmSecurityLevelModelImpl.SECURITYLEVELCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SECURITYLEVELCODE = new FinderPath(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySecurityLevelCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION =
		new FinderPath(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmSecurityLevelImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBySecurityLevelCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmSecurityLevelModelImpl.SECURITYLEVELCODE_COLUMN_BITMASK |
			DmSecurityLevelModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION =
		new FinderPath(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySecurityLevelCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmSecurityLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmSecurityLevelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm security level in the entity cache if it is enabled.
	 *
	 * @param dmSecurityLevel the dm security level
	 */
	public void cacheResult(DmSecurityLevel dmSecurityLevel) {
		EntityCacheUtil.putResult(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelImpl.class, dmSecurityLevel.getPrimaryKey(),
			dmSecurityLevel);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
			new Object[] {
				dmSecurityLevel.getSecurityLevelCode(),
				
			dmSecurityLevel.getSyncVersion()
			}, dmSecurityLevel);

		dmSecurityLevel.resetOriginalValues();
	}

	/**
	 * Caches the dm security levels in the entity cache if it is enabled.
	 *
	 * @param dmSecurityLevels the dm security levels
	 */
	public void cacheResult(List<DmSecurityLevel> dmSecurityLevels) {
		for (DmSecurityLevel dmSecurityLevel : dmSecurityLevels) {
			if (EntityCacheUtil.getResult(
						DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
						DmSecurityLevelImpl.class,
						dmSecurityLevel.getPrimaryKey()) == null) {
				cacheResult(dmSecurityLevel);
			}
			else {
				dmSecurityLevel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm security levels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmSecurityLevelImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmSecurityLevelImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm security level.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmSecurityLevel dmSecurityLevel) {
		EntityCacheUtil.removeResult(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelImpl.class, dmSecurityLevel.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
			new Object[] {
				dmSecurityLevel.getSecurityLevelCode(),
				
			dmSecurityLevel.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm security level with the primary key. Does not add the dm security level to the database.
	 *
	 * @param id the primary key for the new dm security level
	 * @return the new dm security level
	 */
	public DmSecurityLevel create(int id) {
		DmSecurityLevel dmSecurityLevel = new DmSecurityLevelImpl();

		dmSecurityLevel.setNew(true);
		dmSecurityLevel.setPrimaryKey(id);

		return dmSecurityLevel;
	}

	/**
	 * Removes the dm security level with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm security level
	 * @return the dm security level that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmSecurityLevel remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm security level with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm security level
	 * @return the dm security level that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a dm security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel remove(int id)
		throws NoSuchDmSecurityLevelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmSecurityLevel dmSecurityLevel = (DmSecurityLevel)session.get(DmSecurityLevelImpl.class,
					Integer.valueOf(id));

			if (dmSecurityLevel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmSecurityLevelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmSecurityLevelPersistence.remove(dmSecurityLevel);
		}
		catch (NoSuchDmSecurityLevelException nsee) {
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
	 * Removes the dm security level from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmSecurityLevel the dm security level
	 * @return the dm security level that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmSecurityLevel remove(DmSecurityLevel dmSecurityLevel)
		throws SystemException {
		return super.remove(dmSecurityLevel);
	}

	@Override
	protected DmSecurityLevel removeImpl(DmSecurityLevel dmSecurityLevel)
		throws SystemException {
		dmSecurityLevel = toUnwrappedModel(dmSecurityLevel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmSecurityLevel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmSecurityLevelModelImpl dmSecurityLevelModelImpl = (DmSecurityLevelModelImpl)dmSecurityLevel;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
			new Object[] {
				dmSecurityLevelModelImpl.getSecurityLevelCode(),
				
			dmSecurityLevelModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelImpl.class, dmSecurityLevel.getPrimaryKey());

		return dmSecurityLevel;
	}

	@Override
	public DmSecurityLevel updateImpl(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel, boolean merge)
		throws SystemException {
		dmSecurityLevel = toUnwrappedModel(dmSecurityLevel);

		boolean isNew = dmSecurityLevel.isNew();

		DmSecurityLevelModelImpl dmSecurityLevelModelImpl = (DmSecurityLevelModelImpl)dmSecurityLevel;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmSecurityLevel, merge);

			dmSecurityLevel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmSecurityLevelModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmSecurityLevelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmSecurityLevelModelImpl.getOriginalSecurityLevelCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE,
					args);

				args = new Object[] {
						dmSecurityLevelModelImpl.getSecurityLevelCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmSecurityLevelImpl.class, dmSecurityLevel.getPrimaryKey(),
			dmSecurityLevel);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
				new Object[] {
					dmSecurityLevel.getSecurityLevelCode(),
					
				dmSecurityLevel.getSyncVersion()
				}, dmSecurityLevel);
		}
		else {
			if ((dmSecurityLevelModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmSecurityLevelModelImpl.getOriginalSecurityLevelCode(),
						
						dmSecurityLevelModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
					new Object[] {
						dmSecurityLevel.getSecurityLevelCode(),
						
					dmSecurityLevel.getSyncVersion()
					}, dmSecurityLevel);
			}
		}

		return dmSecurityLevel;
	}

	protected DmSecurityLevel toUnwrappedModel(DmSecurityLevel dmSecurityLevel) {
		if (dmSecurityLevel instanceof DmSecurityLevelImpl) {
			return dmSecurityLevel;
		}

		DmSecurityLevelImpl dmSecurityLevelImpl = new DmSecurityLevelImpl();

		dmSecurityLevelImpl.setNew(dmSecurityLevel.isNew());
		dmSecurityLevelImpl.setPrimaryKey(dmSecurityLevel.getPrimaryKey());

		dmSecurityLevelImpl.setId(dmSecurityLevel.getId());
		dmSecurityLevelImpl.setSecurityLevelCode(dmSecurityLevel.getSecurityLevelCode());
		dmSecurityLevelImpl.setSecurityLevel(dmSecurityLevel.getSecurityLevel());
		dmSecurityLevelImpl.setSecurityLevelName(dmSecurityLevel.getSecurityLevelName());
		dmSecurityLevelImpl.setIsDelete(dmSecurityLevel.getIsDelete());
		dmSecurityLevelImpl.setMarkedAsDelete(dmSecurityLevel.getMarkedAsDelete());
		dmSecurityLevelImpl.setModifiedDate(dmSecurityLevel.getModifiedDate());
		dmSecurityLevelImpl.setRequestedDate(dmSecurityLevel.getRequestedDate());
		dmSecurityLevelImpl.setSyncVersion(dmSecurityLevel.getSyncVersion());

		return dmSecurityLevelImpl;
	}

	/**
	 * Returns the dm security level with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm security level
	 * @return the dm security level
	 * @throws com.liferay.portal.NoSuchModelException if a dm security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmSecurityLevel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm security level with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException} if it could not be found.
	 *
	 * @param id the primary key of the dm security level
	 * @return the dm security level
	 * @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a dm security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel findByPrimaryKey(int id)
		throws NoSuchDmSecurityLevelException, SystemException {
		DmSecurityLevel dmSecurityLevel = fetchByPrimaryKey(id);

		if (dmSecurityLevel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmSecurityLevelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmSecurityLevel;
	}

	/**
	 * Returns the dm security level with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm security level
	 * @return the dm security level, or <code>null</code> if a dm security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmSecurityLevel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm security level with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm security level
	 * @return the dm security level, or <code>null</code> if a dm security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel fetchByPrimaryKey(int id) throws SystemException {
		DmSecurityLevel dmSecurityLevel = (DmSecurityLevel)EntityCacheUtil.getResult(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
				DmSecurityLevelImpl.class, id);

		if (dmSecurityLevel == _nullDmSecurityLevel) {
			return null;
		}

		if (dmSecurityLevel == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmSecurityLevel = (DmSecurityLevel)session.get(DmSecurityLevelImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmSecurityLevel != null) {
					cacheResult(dmSecurityLevel);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmSecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
						DmSecurityLevelImpl.class, id, _nullDmSecurityLevel);
				}

				closeSession(session);
			}
		}

		return dmSecurityLevel;
	}

	/**
	 * Returns all the dm security levels where securityLevelCode = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @return the matching dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSecurityLevel> findBySecurityLevelCode(
		String securityLevelCode) throws SystemException {
		return findBySecurityLevelCode(securityLevelCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm security levels where securityLevelCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param securityLevelCode the security level code
	 * @param start the lower bound of the range of dm security levels
	 * @param end the upper bound of the range of dm security levels (not inclusive)
	 * @return the range of matching dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSecurityLevel> findBySecurityLevelCode(
		String securityLevelCode, int start, int end) throws SystemException {
		return findBySecurityLevelCode(securityLevelCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm security levels where securityLevelCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param securityLevelCode the security level code
	 * @param start the lower bound of the range of dm security levels
	 * @param end the upper bound of the range of dm security levels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSecurityLevel> findBySecurityLevelCode(
		String securityLevelCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE;
			finderArgs = new Object[] { securityLevelCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SECURITYLEVELCODE;
			finderArgs = new Object[] {
					securityLevelCode,
					
					start, end, orderByComparator
				};
		}

		List<DmSecurityLevel> list = (List<DmSecurityLevel>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMSECURITYLEVEL_WHERE);

			if (securityLevelCode == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_1);
			}
			else {
				if (securityLevelCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmSecurityLevelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (securityLevelCode != null) {
					qPos.add(securityLevelCode);
				}

				list = (List<DmSecurityLevel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm security level in the ordered set where securityLevelCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param securityLevelCode the security level code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm security level
	 * @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a matching dm security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel findBySecurityLevelCode_First(
		String securityLevelCode, OrderByComparator orderByComparator)
		throws NoSuchDmSecurityLevelException, SystemException {
		List<DmSecurityLevel> list = findBySecurityLevelCode(securityLevelCode,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("securityLevelCode=");
			msg.append(securityLevelCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmSecurityLevelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm security level in the ordered set where securityLevelCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param securityLevelCode the security level code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm security level
	 * @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a matching dm security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel findBySecurityLevelCode_Last(
		String securityLevelCode, OrderByComparator orderByComparator)
		throws NoSuchDmSecurityLevelException, SystemException {
		int count = countBySecurityLevelCode(securityLevelCode);

		List<DmSecurityLevel> list = findBySecurityLevelCode(securityLevelCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("securityLevelCode=");
			msg.append(securityLevelCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmSecurityLevelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm security levels before and after the current dm security level in the ordered set where securityLevelCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm security level
	 * @param securityLevelCode the security level code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm security level
	 * @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a dm security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel[] findBySecurityLevelCode_PrevAndNext(int id,
		String securityLevelCode, OrderByComparator orderByComparator)
		throws NoSuchDmSecurityLevelException, SystemException {
		DmSecurityLevel dmSecurityLevel = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmSecurityLevel[] array = new DmSecurityLevelImpl[3];

			array[0] = getBySecurityLevelCode_PrevAndNext(session,
					dmSecurityLevel, securityLevelCode, orderByComparator, true);

			array[1] = dmSecurityLevel;

			array[2] = getBySecurityLevelCode_PrevAndNext(session,
					dmSecurityLevel, securityLevelCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmSecurityLevel getBySecurityLevelCode_PrevAndNext(
		Session session, DmSecurityLevel dmSecurityLevel,
		String securityLevelCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMSECURITYLEVEL_WHERE);

		if (securityLevelCode == null) {
			query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_1);
		}
		else {
			if (securityLevelCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_2);
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
			query.append(DmSecurityLevelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (securityLevelCode != null) {
			qPos.add(securityLevelCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmSecurityLevel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmSecurityLevel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException} if it could not be found.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @return the matching dm security level
	 * @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a matching dm security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel findBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion)
		throws NoSuchDmSecurityLevelException, SystemException {
		DmSecurityLevel dmSecurityLevel = fetchBySecurityLevelCodeAndSyncVersion(securityLevelCode,
				syncVersion);

		if (dmSecurityLevel == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("securityLevelCode=");
			msg.append(securityLevelCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmSecurityLevelException(msg.toString());
		}

		return dmSecurityLevel;
	}

	/**
	 * Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @return the matching dm security level, or <code>null</code> if a matching dm security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion) throws SystemException {
		return fetchBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion, true);
	}

	/**
	 * Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm security level, or <code>null</code> if a matching dm security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmSecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { securityLevelCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMSECURITYLEVEL_WHERE);

			if (securityLevelCode == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_1);
			}
			else {
				if (securityLevelCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmSecurityLevelModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (securityLevelCode != null) {
					qPos.add(securityLevelCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmSecurityLevel> list = q.list();

				result = list;

				DmSecurityLevel dmSecurityLevel = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmSecurityLevel = list.get(0);

					cacheResult(dmSecurityLevel);

					if ((dmSecurityLevel.getSecurityLevelCode() == null) ||
							!dmSecurityLevel.getSecurityLevelCode()
												.equals(securityLevelCode) ||
							(dmSecurityLevel.getSyncVersion() == null) ||
							!dmSecurityLevel.getSyncVersion().equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
							finderArgs, dmSecurityLevel);
					}
				}

				return dmSecurityLevel;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
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
				return (DmSecurityLevel)result;
			}
		}
	}

	/**
	 * Returns all the dm security levels.
	 *
	 * @return the dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSecurityLevel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm security levels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm security levels
	 * @param end the upper bound of the range of dm security levels (not inclusive)
	 * @return the range of dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSecurityLevel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm security levels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm security levels
	 * @param end the upper bound of the range of dm security levels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmSecurityLevel> findAll(int start, int end,
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

		List<DmSecurityLevel> list = (List<DmSecurityLevel>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMSECURITYLEVEL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMSECURITYLEVEL.concat(DmSecurityLevelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmSecurityLevel>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmSecurityLevel>)QueryUtil.list(q,
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
	 * Removes all the dm security levels where securityLevelCode = &#63; from the database.
	 *
	 * @param securityLevelCode the security level code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySecurityLevelCode(String securityLevelCode)
		throws SystemException {
		for (DmSecurityLevel dmSecurityLevel : findBySecurityLevelCode(
				securityLevelCode)) {
			dmSecurityLevelPersistence.remove(dmSecurityLevel);
		}
	}

	/**
	 * Removes the dm security level where securityLevelCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion)
		throws NoSuchDmSecurityLevelException, SystemException {
		DmSecurityLevel dmSecurityLevel = findBySecurityLevelCodeAndSyncVersion(securityLevelCode,
				syncVersion);

		dmSecurityLevelPersistence.remove(dmSecurityLevel);
	}

	/**
	 * Removes all the dm security levels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmSecurityLevel dmSecurityLevel : findAll()) {
			dmSecurityLevelPersistence.remove(dmSecurityLevel);
		}
	}

	/**
	 * Returns the number of dm security levels where securityLevelCode = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @return the number of matching dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySecurityLevelCode(String securityLevelCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { securityLevelCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMSECURITYLEVEL_WHERE);

			if (securityLevelCode == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_1);
			}
			else {
				if (securityLevelCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (securityLevelCode != null) {
					qPos.add(securityLevelCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm security levels where securityLevelCode = &#63; and syncVersion = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @return the number of matching dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { securityLevelCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMSECURITYLEVEL_WHERE);

			if (securityLevelCode == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_1);
			}
			else {
				if (securityLevelCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (securityLevelCode != null) {
					qPos.add(securityLevelCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm security levels.
	 *
	 * @return the number of dm security levels
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMSECURITYLEVEL);

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
	 * Initializes the dm security level persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmSecurityLevel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmSecurityLevel>> listenersList = new ArrayList<ModelListener<DmSecurityLevel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmSecurityLevel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmSecurityLevelImpl.class.getName());
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
	private static final String _SQL_SELECT_DMSECURITYLEVEL = "SELECT dmSecurityLevel FROM DmSecurityLevel dmSecurityLevel";
	private static final String _SQL_SELECT_DMSECURITYLEVEL_WHERE = "SELECT dmSecurityLevel FROM DmSecurityLevel dmSecurityLevel WHERE ";
	private static final String _SQL_COUNT_DMSECURITYLEVEL = "SELECT COUNT(dmSecurityLevel) FROM DmSecurityLevel dmSecurityLevel";
	private static final String _SQL_COUNT_DMSECURITYLEVEL_WHERE = "SELECT COUNT(dmSecurityLevel) FROM DmSecurityLevel dmSecurityLevel WHERE ";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_1 =
		"dmSecurityLevel.securityLevelCode IS NULL";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_2 =
		"dmSecurityLevel.securityLevelCode = ?";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_3 =
		"(dmSecurityLevel.securityLevelCode IS NULL OR dmSecurityLevel.securityLevelCode = ?)";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_1 =
		"dmSecurityLevel.securityLevelCode IS NULL AND ";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_2 =
		"dmSecurityLevel.securityLevelCode = ? AND ";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_3 =
		"(dmSecurityLevel.securityLevelCode IS NULL OR dmSecurityLevel.securityLevelCode = ?) AND ";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmSecurityLevel.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmSecurityLevel.syncVersion = ?";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmSecurityLevel.syncVersion IS NULL OR dmSecurityLevel.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmSecurityLevel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmSecurityLevel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmSecurityLevel exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmSecurityLevelPersistenceImpl.class);
	private static DmSecurityLevel _nullDmSecurityLevel = new DmSecurityLevelImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmSecurityLevel> toCacheModel() {
				return _nullDmSecurityLevelCacheModel;
			}
		};

	private static CacheModel<DmSecurityLevel> _nullDmSecurityLevelCacheModel = new CacheModel<DmSecurityLevel>() {
			public DmSecurityLevel toEntityModel() {
				return _nullDmSecurityLevel;
			}
		};
}