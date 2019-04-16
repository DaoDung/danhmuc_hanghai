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

import vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException;
import vn.gt.dao.danhmuc.model.DmHistoryRepresentative;
import vn.gt.dao.danhmuc.model.impl.DmHistoryRepresentativeImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryRepresentativeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history representative service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryRepresentativePersistence
 * @see DmHistoryRepresentativeUtil
 * @generated
 */
public class DmHistoryRepresentativePersistenceImpl extends BasePersistenceImpl<DmHistoryRepresentative>
	implements DmHistoryRepresentativePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryRepresentativeUtil} to access the dm history representative persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryRepresentativeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_REPCODE = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRepCode", new String[] { String.class.getName() },
			DmHistoryRepresentativeModelImpl.REPCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPCODE = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRepCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRepCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryRepresentativeModelImpl.REPCODE_COLUMN_BITMASK |
			DmHistoryRepresentativeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRepCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history representative in the entity cache if it is enabled.
	 *
	 * @param dmHistoryRepresentative the dm history representative
	 */
	public void cacheResult(DmHistoryRepresentative dmHistoryRepresentative) {
		EntityCacheUtil.putResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			dmHistoryRepresentative.getPrimaryKey(), dmHistoryRepresentative);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
			new Object[] { dmHistoryRepresentative.getRepCode() },
			dmHistoryRepresentative);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryRepresentative.getRepCode(),
				
			dmHistoryRepresentative.getSyncVersion()
			}, dmHistoryRepresentative);

		dmHistoryRepresentative.resetOriginalValues();
	}

	/**
	 * Caches the dm history representatives in the entity cache if it is enabled.
	 *
	 * @param dmHistoryRepresentatives the dm history representatives
	 */
	public void cacheResult(
		List<DmHistoryRepresentative> dmHistoryRepresentatives) {
		for (DmHistoryRepresentative dmHistoryRepresentative : dmHistoryRepresentatives) {
			if (EntityCacheUtil.getResult(
						DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryRepresentativeImpl.class,
						dmHistoryRepresentative.getPrimaryKey()) == null) {
				cacheResult(dmHistoryRepresentative);
			}
			else {
				dmHistoryRepresentative.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history representatives.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryRepresentativeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryRepresentativeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history representative.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryRepresentative dmHistoryRepresentative) {
		EntityCacheUtil.removeResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			dmHistoryRepresentative.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE,
			new Object[] { dmHistoryRepresentative.getRepCode() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryRepresentative.getRepCode(),
				
			dmHistoryRepresentative.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history representative with the primary key. Does not add the dm history representative to the database.
	 *
	 * @param id the primary key for the new dm history representative
	 * @return the new dm history representative
	 */
	public DmHistoryRepresentative create(int id) {
		DmHistoryRepresentative dmHistoryRepresentative = new DmHistoryRepresentativeImpl();

		dmHistoryRepresentative.setNew(true);
		dmHistoryRepresentative.setPrimaryKey(id);

		return dmHistoryRepresentative;
	}

	/**
	 * Removes the dm history representative with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history representative
	 * @return the dm history representative that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm history representative with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history representative
	 * @return the dm history representative that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative remove(int id)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryRepresentative dmHistoryRepresentative = (DmHistoryRepresentative)session.get(DmHistoryRepresentativeImpl.class,
					Integer.valueOf(id));

			if (dmHistoryRepresentative == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmHistoryRepresentativeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmHistoryRepresentativePersistence.remove(dmHistoryRepresentative);
		}
		catch (NoSuchDmHistoryRepresentativeException nsee) {
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
	 * Removes the dm history representative from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmHistoryRepresentative the dm history representative
	 * @return the dm history representative that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative remove(
		DmHistoryRepresentative dmHistoryRepresentative)
		throws SystemException {
		return super.remove(dmHistoryRepresentative);
	}

	@Override
	protected DmHistoryRepresentative removeImpl(
		DmHistoryRepresentative dmHistoryRepresentative)
		throws SystemException {
		dmHistoryRepresentative = toUnwrappedModel(dmHistoryRepresentative);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryRepresentative);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmHistoryRepresentativeModelImpl dmHistoryRepresentativeModelImpl = (DmHistoryRepresentativeModelImpl)dmHistoryRepresentative;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE,
			new Object[] { dmHistoryRepresentativeModelImpl.getRepCode() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryRepresentativeModelImpl.getRepCode(),
				
			dmHistoryRepresentativeModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			dmHistoryRepresentative.getPrimaryKey());

		return dmHistoryRepresentative;
	}

	@Override
	public DmHistoryRepresentative updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative,
		boolean merge) throws SystemException {
		dmHistoryRepresentative = toUnwrappedModel(dmHistoryRepresentative);

		boolean isNew = dmHistoryRepresentative.isNew();

		DmHistoryRepresentativeModelImpl dmHistoryRepresentativeModelImpl = (DmHistoryRepresentativeModelImpl)dmHistoryRepresentative;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryRepresentative, merge);

			dmHistoryRepresentative.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryRepresentativeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRepresentativeImpl.class,
			dmHistoryRepresentative.getPrimaryKey(), dmHistoryRepresentative);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
				new Object[] { dmHistoryRepresentative.getRepCode() },
				dmHistoryRepresentative);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
				new Object[] {
					dmHistoryRepresentative.getRepCode(),
					
				dmHistoryRepresentative.getSyncVersion()
				}, dmHistoryRepresentative);
		}
		else {
			if ((dmHistoryRepresentativeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryRepresentativeModelImpl.getOriginalRepCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
					new Object[] { dmHistoryRepresentative.getRepCode() },
					dmHistoryRepresentative);
			}

			if ((dmHistoryRepresentativeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryRepresentativeModelImpl.getOriginalRepCode(),
						
						dmHistoryRepresentativeModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
					new Object[] {
						dmHistoryRepresentative.getRepCode(),
						
					dmHistoryRepresentative.getSyncVersion()
					}, dmHistoryRepresentative);
			}
		}

		return dmHistoryRepresentative;
	}

	protected DmHistoryRepresentative toUnwrappedModel(
		DmHistoryRepresentative dmHistoryRepresentative) {
		if (dmHistoryRepresentative instanceof DmHistoryRepresentativeImpl) {
			return dmHistoryRepresentative;
		}

		DmHistoryRepresentativeImpl dmHistoryRepresentativeImpl = new DmHistoryRepresentativeImpl();

		dmHistoryRepresentativeImpl.setNew(dmHistoryRepresentative.isNew());
		dmHistoryRepresentativeImpl.setPrimaryKey(dmHistoryRepresentative.getPrimaryKey());

		dmHistoryRepresentativeImpl.setId(dmHistoryRepresentative.getId());
		dmHistoryRepresentativeImpl.setRepCode(dmHistoryRepresentative.getRepCode());
		dmHistoryRepresentativeImpl.setRepName(dmHistoryRepresentative.getRepName());
		dmHistoryRepresentativeImpl.setRepNameVN(dmHistoryRepresentative.getRepNameVN());
		dmHistoryRepresentativeImpl.setRepLevel(dmHistoryRepresentative.getRepLevel());
		dmHistoryRepresentativeImpl.setRepOrder(dmHistoryRepresentative.getRepOrder());
		dmHistoryRepresentativeImpl.setMaritimeCode(dmHistoryRepresentative.getMaritimeCode());
		dmHistoryRepresentativeImpl.setIsDelete(dmHistoryRepresentative.getIsDelete());
		dmHistoryRepresentativeImpl.setMarkedAsDelete(dmHistoryRepresentative.getMarkedAsDelete());
		dmHistoryRepresentativeImpl.setModifiedDate(dmHistoryRepresentative.getModifiedDate());
		dmHistoryRepresentativeImpl.setRequestedDate(dmHistoryRepresentative.getRequestedDate());
		dmHistoryRepresentativeImpl.setSyncVersion(dmHistoryRepresentative.getSyncVersion());

		return dmHistoryRepresentativeImpl;
	}

	/**
	 * Returns the dm history representative with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history representative
	 * @return the dm history representative
	 * @throws com.liferay.portal.NoSuchModelException if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history representative with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history representative
	 * @return the dm history representative
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative findByPrimaryKey(int id)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = fetchByPrimaryKey(id);

		if (dmHistoryRepresentative == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryRepresentativeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryRepresentative;
	}

	/**
	 * Returns the dm history representative with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history representative
	 * @return the dm history representative, or <code>null</code> if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRepresentative fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history representative with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history representative
	 * @return the dm history representative, or <code>null</code> if a dm history representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative fetchByPrimaryKey(int id)
		throws SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = (DmHistoryRepresentative)EntityCacheUtil.getResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryRepresentativeImpl.class, id);

		if (dmHistoryRepresentative == _nullDmHistoryRepresentative) {
			return null;
		}

		if (dmHistoryRepresentative == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryRepresentative = (DmHistoryRepresentative)session.get(DmHistoryRepresentativeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryRepresentative != null) {
					cacheResult(dmHistoryRepresentative);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryRepresentativeImpl.class, id,
						_nullDmHistoryRepresentative);
				}

				closeSession(session);
			}
		}

		return dmHistoryRepresentative;
	}

	/**
	 * Returns the dm history representative where repCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	 *
	 * @param repCode the rep code
	 * @return the matching dm history representative
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative findByRepCode(String repCode)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = fetchByRepCode(repCode);

		if (dmHistoryRepresentative == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("repCode=");
			msg.append(repCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryRepresentativeException(msg.toString());
		}

		return dmHistoryRepresentative;
	}

	/**
	 * Returns the dm history representative where repCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param repCode the rep code
	 * @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative fetchByRepCode(String repCode)
		throws SystemException {
		return fetchByRepCode(repCode, true);
	}

	/**
	 * Returns the dm history representative where repCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param repCode the rep code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative fetchByRepCode(String repCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { repCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMHISTORYREPRESENTATIVE_WHERE);

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_1);
			}
			else {
				if (repCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REPCODE_REPCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REPCODE_REPCODE_2);
				}
			}

			query.append(DmHistoryRepresentativeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (repCode != null) {
					qPos.add(repCode);
				}

				List<DmHistoryRepresentative> list = q.list();

				result = list;

				DmHistoryRepresentative dmHistoryRepresentative = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
						finderArgs, list);
				}
				else {
					dmHistoryRepresentative = list.get(0);

					cacheResult(dmHistoryRepresentative);

					if ((dmHistoryRepresentative.getRepCode() == null) ||
							!dmHistoryRepresentative.getRepCode().equals(repCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
							finderArgs, dmHistoryRepresentative);
					}
				}

				return dmHistoryRepresentative;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE,
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
				return (DmHistoryRepresentative)result;
			}
		}
	}

	/**
	 * Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @return the matching dm history representative
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative findByRepCodeAndSyncVersion(String repCode,
		String syncVersion)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = fetchByRepCodeAndSyncVersion(repCode,
				syncVersion);

		if (dmHistoryRepresentative == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("repCode=");
			msg.append(repCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryRepresentativeException(msg.toString());
		}

		return dmHistoryRepresentative;
	}

	/**
	 * Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative fetchByRepCodeAndSyncVersion(
		String repCode, String syncVersion) throws SystemException {
		return fetchByRepCodeAndSyncVersion(repCode, syncVersion, true);
	}

	/**
	 * Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryRepresentative fetchByRepCodeAndSyncVersion(
		String repCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { repCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYREPRESENTATIVE_WHERE);

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_1);
			}
			else {
				if (repCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryRepresentativeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (repCode != null) {
					qPos.add(repCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryRepresentative> list = q.list();

				result = list;

				DmHistoryRepresentative dmHistoryRepresentative = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryRepresentative = list.get(0);

					cacheResult(dmHistoryRepresentative);

					if ((dmHistoryRepresentative.getRepCode() == null) ||
							!dmHistoryRepresentative.getRepCode().equals(repCode) ||
							(dmHistoryRepresentative.getSyncVersion() == null) ||
							!dmHistoryRepresentative.getSyncVersion()
														.equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
							finderArgs, dmHistoryRepresentative);
					}
				}

				return dmHistoryRepresentative;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODEANDSYNCVERSION,
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
				return (DmHistoryRepresentative)result;
			}
		}
	}

	/**
	 * Returns all the dm history representatives.
	 *
	 * @return the dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRepresentative> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history representatives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history representatives
	 * @param end the upper bound of the range of dm history representatives (not inclusive)
	 * @return the range of dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRepresentative> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history representatives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history representatives
	 * @param end the upper bound of the range of dm history representatives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryRepresentative> findAll(int start, int end,
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

		List<DmHistoryRepresentative> list = (List<DmHistoryRepresentative>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYREPRESENTATIVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYREPRESENTATIVE.concat(DmHistoryRepresentativeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryRepresentative>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryRepresentative>)QueryUtil.list(q,
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
	 * Removes the dm history representative where repCode = &#63; from the database.
	 *
	 * @param repCode the rep code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRepCode(String repCode)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = findByRepCode(repCode);

		dmHistoryRepresentativePersistence.remove(dmHistoryRepresentative);
	}

	/**
	 * Removes the dm history representative where repCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRepCodeAndSyncVersion(String repCode, String syncVersion)
		throws NoSuchDmHistoryRepresentativeException, SystemException {
		DmHistoryRepresentative dmHistoryRepresentative = findByRepCodeAndSyncVersion(repCode,
				syncVersion);

		dmHistoryRepresentativePersistence.remove(dmHistoryRepresentative);
	}

	/**
	 * Removes all the dm history representatives from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryRepresentative dmHistoryRepresentative : findAll()) {
			dmHistoryRepresentativePersistence.remove(dmHistoryRepresentative);
		}
	}

	/**
	 * Returns the number of dm history representatives where repCode = &#63;.
	 *
	 * @param repCode the rep code
	 * @return the number of matching dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRepCode(String repCode) throws SystemException {
		Object[] finderArgs = new Object[] { repCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REPCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYREPRESENTATIVE_WHERE);

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_1);
			}
			else {
				if (repCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REPCODE_REPCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REPCODE_REPCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (repCode != null) {
					qPos.add(repCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history representatives where repCode = &#63; and syncVersion = &#63;.
	 *
	 * @param repCode the rep code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRepCodeAndSyncVersion(String repCode, String syncVersion)
		throws SystemException {
		Object[] finderArgs = new Object[] { repCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYREPRESENTATIVE_WHERE);

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_1);
			}
			else {
				if (repCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (repCode != null) {
					qPos.add(repCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPCODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history representatives.
	 *
	 * @return the number of dm history representatives
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYREPRESENTATIVE);

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
	 * Initializes the dm history representative persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryRepresentative")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryRepresentative>> listenersList = new ArrayList<ModelListener<DmHistoryRepresentative>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryRepresentative>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryRepresentativeImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYREPRESENTATIVE = "SELECT dmHistoryRepresentative FROM DmHistoryRepresentative dmHistoryRepresentative";
	private static final String _SQL_SELECT_DMHISTORYREPRESENTATIVE_WHERE = "SELECT dmHistoryRepresentative FROM DmHistoryRepresentative dmHistoryRepresentative WHERE ";
	private static final String _SQL_COUNT_DMHISTORYREPRESENTATIVE = "SELECT COUNT(dmHistoryRepresentative) FROM DmHistoryRepresentative dmHistoryRepresentative";
	private static final String _SQL_COUNT_DMHISTORYREPRESENTATIVE_WHERE = "SELECT COUNT(dmHistoryRepresentative) FROM DmHistoryRepresentative dmHistoryRepresentative WHERE ";
	private static final String _FINDER_COLUMN_REPCODE_REPCODE_1 = "dmHistoryRepresentative.repCode IS NULL";
	private static final String _FINDER_COLUMN_REPCODE_REPCODE_2 = "dmHistoryRepresentative.repCode = ?";
	private static final String _FINDER_COLUMN_REPCODE_REPCODE_3 = "(dmHistoryRepresentative.repCode IS NULL OR dmHistoryRepresentative.repCode = ?)";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_1 = "dmHistoryRepresentative.repCode IS NULL AND ";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_2 = "dmHistoryRepresentative.repCode = ? AND ";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_REPCODE_3 = "(dmHistoryRepresentative.repCode IS NULL OR dmHistoryRepresentative.repCode = ?) AND ";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryRepresentative.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryRepresentative.syncVersion = ?";
	private static final String _FINDER_COLUMN_REPCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryRepresentative.syncVersion IS NULL OR dmHistoryRepresentative.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryRepresentative.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryRepresentative exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryRepresentative exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryRepresentativePersistenceImpl.class);
	private static DmHistoryRepresentative _nullDmHistoryRepresentative = new DmHistoryRepresentativeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryRepresentative> toCacheModel() {
				return _nullDmHistoryRepresentativeCacheModel;
			}
		};

	private static CacheModel<DmHistoryRepresentative> _nullDmHistoryRepresentativeCacheModel =
		new CacheModel<DmHistoryRepresentative>() {
			public DmHistoryRepresentative toEntityModel() {
				return _nullDmHistoryRepresentative;
			}
		};
}