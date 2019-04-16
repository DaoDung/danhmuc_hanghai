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

import vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException;
import vn.gt.dao.danhmuc.model.DmHistoryPackage;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPackageImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPackageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPackagePersistence
 * @see DmHistoryPackageUtil
 * @generated
 */
public class DmHistoryPackagePersistenceImpl extends BasePersistenceImpl<DmHistoryPackage>
	implements DmHistoryPackagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryPackageUtil} to access the dm history package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryPackageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGECODE =
		new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPackageCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE =
		new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPackageCode",
			new String[] { String.class.getName() },
			DmHistoryPackageModelImpl.PACKAGECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGECODE = new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPackageCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION =
		new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPackageCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryPackageModelImpl.PACKAGECODE_COLUMN_BITMASK |
			DmHistoryPackageModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION =
		new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPackageCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPackageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history package in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPackage the dm history package
	 */
	public void cacheResult(DmHistoryPackage dmHistoryPackage) {
		EntityCacheUtil.putResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageImpl.class, dmHistoryPackage.getPrimaryKey(),
			dmHistoryPackage);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPackage.getPackageCode(),
				
			dmHistoryPackage.getSyncVersion()
			}, dmHistoryPackage);

		dmHistoryPackage.resetOriginalValues();
	}

	/**
	 * Caches the dm history packages in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPackages the dm history packages
	 */
	public void cacheResult(List<DmHistoryPackage> dmHistoryPackages) {
		for (DmHistoryPackage dmHistoryPackage : dmHistoryPackages) {
			if (EntityCacheUtil.getResult(
						DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPackageImpl.class,
						dmHistoryPackage.getPrimaryKey()) == null) {
				cacheResult(dmHistoryPackage);
			}
			else {
				dmHistoryPackage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history packages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryPackageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryPackageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history package.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryPackage dmHistoryPackage) {
		EntityCacheUtil.removeResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageImpl.class, dmHistoryPackage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPackage.getPackageCode(),
				
			dmHistoryPackage.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history package with the primary key. Does not add the dm history package to the database.
	 *
	 * @param id the primary key for the new dm history package
	 * @return the new dm history package
	 */
	public DmHistoryPackage create(int id) {
		DmHistoryPackage dmHistoryPackage = new DmHistoryPackageImpl();

		dmHistoryPackage.setNew(true);
		dmHistoryPackage.setPrimaryKey(id);

		return dmHistoryPackage;
	}

	/**
	 * Removes the dm history package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history package
	 * @return the dm history package that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm history package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history package
	 * @return the dm history package that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage remove(int id)
		throws NoSuchDmHistoryPackageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryPackage dmHistoryPackage = (DmHistoryPackage)session.get(DmHistoryPackageImpl.class,
					Integer.valueOf(id));

			if (dmHistoryPackage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmHistoryPackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmHistoryPackagePersistence.remove(dmHistoryPackage);
		}
		catch (NoSuchDmHistoryPackageException nsee) {
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
	 * Removes the dm history package from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmHistoryPackage the dm history package
	 * @return the dm history package that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage remove(DmHistoryPackage dmHistoryPackage)
		throws SystemException {
		return super.remove(dmHistoryPackage);
	}

	@Override
	protected DmHistoryPackage removeImpl(DmHistoryPackage dmHistoryPackage)
		throws SystemException {
		dmHistoryPackage = toUnwrappedModel(dmHistoryPackage);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryPackage);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmHistoryPackageModelImpl dmHistoryPackageModelImpl = (DmHistoryPackageModelImpl)dmHistoryPackage;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPackageModelImpl.getPackageCode(),
				
			dmHistoryPackageModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageImpl.class, dmHistoryPackage.getPrimaryKey());

		return dmHistoryPackage;
	}

	@Override
	public DmHistoryPackage updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPackage dmHistoryPackage, boolean merge)
		throws SystemException {
		dmHistoryPackage = toUnwrappedModel(dmHistoryPackage);

		boolean isNew = dmHistoryPackage.isNew();

		DmHistoryPackageModelImpl dmHistoryPackageModelImpl = (DmHistoryPackageModelImpl)dmHistoryPackage;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryPackage, merge);

			dmHistoryPackage.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryPackageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryPackageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPackageModelImpl.getOriginalPackageCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE,
					args);

				args = new Object[] { dmHistoryPackageModelImpl.getPackageCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPackageImpl.class, dmHistoryPackage.getPrimaryKey(),
			dmHistoryPackage);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
				new Object[] {
					dmHistoryPackage.getPackageCode(),
					
				dmHistoryPackage.getSyncVersion()
				}, dmHistoryPackage);
		}
		else {
			if ((dmHistoryPackageModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPackageModelImpl.getOriginalPackageCode(),
						
						dmHistoryPackageModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
					new Object[] {
						dmHistoryPackage.getPackageCode(),
						
					dmHistoryPackage.getSyncVersion()
					}, dmHistoryPackage);
			}
		}

		return dmHistoryPackage;
	}

	protected DmHistoryPackage toUnwrappedModel(
		DmHistoryPackage dmHistoryPackage) {
		if (dmHistoryPackage instanceof DmHistoryPackageImpl) {
			return dmHistoryPackage;
		}

		DmHistoryPackageImpl dmHistoryPackageImpl = new DmHistoryPackageImpl();

		dmHistoryPackageImpl.setNew(dmHistoryPackage.isNew());
		dmHistoryPackageImpl.setPrimaryKey(dmHistoryPackage.getPrimaryKey());

		dmHistoryPackageImpl.setId(dmHistoryPackage.getId());
		dmHistoryPackageImpl.setPackageCode(dmHistoryPackage.getPackageCode());
		dmHistoryPackageImpl.setPackageName(dmHistoryPackage.getPackageName());
		dmHistoryPackageImpl.setPackageNameVN(dmHistoryPackage.getPackageNameVN());
		dmHistoryPackageImpl.setPackageOrder(dmHistoryPackage.getPackageOrder());
		dmHistoryPackageImpl.setIsDelete(dmHistoryPackage.getIsDelete());
		dmHistoryPackageImpl.setMarkedAsDelete(dmHistoryPackage.getMarkedAsDelete());
		dmHistoryPackageImpl.setModifiedDate(dmHistoryPackage.getModifiedDate());
		dmHistoryPackageImpl.setRequestedDate(dmHistoryPackage.getRequestedDate());
		dmHistoryPackageImpl.setSyncVersion(dmHistoryPackage.getSyncVersion());

		return dmHistoryPackageImpl;
	}

	/**
	 * Returns the dm history package with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history package
	 * @return the dm history package
	 * @throws com.liferay.portal.NoSuchModelException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history package with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException} if it could not be found.
	 *
	 * @param id the primary key of the dm history package
	 * @return the dm history package
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage findByPrimaryKey(int id)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = fetchByPrimaryKey(id);

		if (dmHistoryPackage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryPackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryPackage;
	}

	/**
	 * Returns the dm history package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history package
	 * @return the dm history package, or <code>null</code> if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPackage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history package
	 * @return the dm history package, or <code>null</code> if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage fetchByPrimaryKey(int id) throws SystemException {
		DmHistoryPackage dmHistoryPackage = (DmHistoryPackage)EntityCacheUtil.getResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPackageImpl.class, id);

		if (dmHistoryPackage == _nullDmHistoryPackage) {
			return null;
		}

		if (dmHistoryPackage == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryPackage = (DmHistoryPackage)session.get(DmHistoryPackageImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryPackage != null) {
					cacheResult(dmHistoryPackage);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryPackageModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPackageImpl.class, id, _nullDmHistoryPackage);
				}

				closeSession(session);
			}
		}

		return dmHistoryPackage;
	}

	/**
	 * Returns all the dm history packages where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @return the matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPackage> findByPackageCode(String packageCode)
		throws SystemException {
		return findByPackageCode(packageCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history packages where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param packageCode the package code
	 * @param start the lower bound of the range of dm history packages
	 * @param end the upper bound of the range of dm history packages (not inclusive)
	 * @return the range of matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPackage> findByPackageCode(String packageCode,
		int start, int end) throws SystemException {
		return findByPackageCode(packageCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history packages where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param packageCode the package code
	 * @param start the lower bound of the range of dm history packages
	 * @param end the upper bound of the range of dm history packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPackage> findByPackageCode(String packageCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGECODE;
			finderArgs = new Object[] { packageCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGECODE;
			finderArgs = new Object[] { packageCode, start, end, orderByComparator };
		}

		List<DmHistoryPackage> list = (List<DmHistoryPackage>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYPACKAGE_WHERE);

			if (packageCode == null) {
				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1);
			}
			else {
				if (packageCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmHistoryPackageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (packageCode != null) {
					qPos.add(packageCode);
				}

				list = (List<DmHistoryPackage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm history package in the ordered set where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history package
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage findByPackageCode_First(String packageCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPackageException, SystemException {
		List<DmHistoryPackage> list = findByPackageCode(packageCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("packageCode=");
			msg.append(packageCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPackageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history package in the ordered set where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history package
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage findByPackageCode_Last(String packageCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPackageException, SystemException {
		int count = countByPackageCode(packageCode);

		List<DmHistoryPackage> list = findByPackageCode(packageCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("packageCode=");
			msg.append(packageCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPackageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history packages before and after the current dm history package in the ordered set where packageCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history package
	 * @param packageCode the package code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history package
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage[] findByPackageCode_PrevAndNext(int id,
		String packageCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPackage[] array = new DmHistoryPackageImpl[3];

			array[0] = getByPackageCode_PrevAndNext(session, dmHistoryPackage,
					packageCode, orderByComparator, true);

			array[1] = dmHistoryPackage;

			array[2] = getByPackageCode_PrevAndNext(session, dmHistoryPackage,
					packageCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryPackage getByPackageCode_PrevAndNext(Session session,
		DmHistoryPackage dmHistoryPackage, String packageCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYPACKAGE_WHERE);

		if (packageCode == null) {
			query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1);
		}
		else {
			if (packageCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2);
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
			query.append(DmHistoryPackageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (packageCode != null) {
			qPos.add(packageCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPackage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPackage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException} if it could not be found.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @return the matching dm history package
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage findByPackageCodeAndSyncVersion(
		String packageCode, String syncVersion)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = fetchByPackageCodeAndSyncVersion(packageCode,
				syncVersion);

		if (dmHistoryPackage == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("packageCode=");
			msg.append(packageCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryPackageException(msg.toString());
		}

		return dmHistoryPackage;
	}

	/**
	 * Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @return the matching dm history package, or <code>null</code> if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage fetchByPackageCodeAndSyncVersion(
		String packageCode, String syncVersion) throws SystemException {
		return fetchByPackageCodeAndSyncVersion(packageCode, syncVersion, true);
	}

	/**
	 * Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history package, or <code>null</code> if a matching dm history package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPackage fetchByPackageCodeAndSyncVersion(
		String packageCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { packageCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYPACKAGE_WHERE);

			if (packageCode == null) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_1);
			}
			else {
				if (packageCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryPackageModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (packageCode != null) {
					qPos.add(packageCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryPackage> list = q.list();

				result = list;

				DmHistoryPackage dmHistoryPackage = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryPackage = list.get(0);

					cacheResult(dmHistoryPackage);

					if ((dmHistoryPackage.getPackageCode() == null) ||
							!dmHistoryPackage.getPackageCode()
												 .equals(packageCode) ||
							(dmHistoryPackage.getSyncVersion() == null) ||
							!dmHistoryPackage.getSyncVersion()
												 .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
							finderArgs, dmHistoryPackage);
					}
				}

				return dmHistoryPackage;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PACKAGECODEANDSYNCVERSION,
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
				return (DmHistoryPackage)result;
			}
		}
	}

	/**
	 * Returns all the dm history packages.
	 *
	 * @return the dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPackage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history packages
	 * @param end the upper bound of the range of dm history packages (not inclusive)
	 * @return the range of dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPackage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history packages
	 * @param end the upper bound of the range of dm history packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPackage> findAll(int start, int end,
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

		List<DmHistoryPackage> list = (List<DmHistoryPackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYPACKAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYPACKAGE.concat(DmHistoryPackageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryPackage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryPackage>)QueryUtil.list(q,
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
	 * Removes all the dm history packages where packageCode = &#63; from the database.
	 *
	 * @param packageCode the package code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPackageCode(String packageCode)
		throws SystemException {
		for (DmHistoryPackage dmHistoryPackage : findByPackageCode(packageCode)) {
			dmHistoryPackagePersistence.remove(dmHistoryPackage);
		}
	}

	/**
	 * Removes the dm history package where packageCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPackageCodeAndSyncVersion(String packageCode,
		String syncVersion)
		throws NoSuchDmHistoryPackageException, SystemException {
		DmHistoryPackage dmHistoryPackage = findByPackageCodeAndSyncVersion(packageCode,
				syncVersion);

		dmHistoryPackagePersistence.remove(dmHistoryPackage);
	}

	/**
	 * Removes all the dm history packages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryPackage dmHistoryPackage : findAll()) {
			dmHistoryPackagePersistence.remove(dmHistoryPackage);
		}
	}

	/**
	 * Returns the number of dm history packages where packageCode = &#63;.
	 *
	 * @param packageCode the package code
	 * @return the number of matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPackageCode(String packageCode) throws SystemException {
		Object[] finderArgs = new Object[] { packageCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PACKAGECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPACKAGE_WHERE);

			if (packageCode == null) {
				query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1);
			}
			else {
				if (packageCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (packageCode != null) {
					qPos.add(packageCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PACKAGECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history packages where packageCode = &#63; and syncVersion = &#63;.
	 *
	 * @param packageCode the package code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPackageCodeAndSyncVersion(String packageCode,
		String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { packageCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYPACKAGE_WHERE);

			if (packageCode == null) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_1);
			}
			else {
				if (packageCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (packageCode != null) {
					qPos.add(packageCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PACKAGECODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history packages.
	 *
	 * @return the number of dm history packages
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYPACKAGE);

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
	 * Initializes the dm history package persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryPackage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryPackage>> listenersList = new ArrayList<ModelListener<DmHistoryPackage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryPackage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryPackageImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYPACKAGE = "SELECT dmHistoryPackage FROM DmHistoryPackage dmHistoryPackage";
	private static final String _SQL_SELECT_DMHISTORYPACKAGE_WHERE = "SELECT dmHistoryPackage FROM DmHistoryPackage dmHistoryPackage WHERE ";
	private static final String _SQL_COUNT_DMHISTORYPACKAGE = "SELECT COUNT(dmHistoryPackage) FROM DmHistoryPackage dmHistoryPackage";
	private static final String _SQL_COUNT_DMHISTORYPACKAGE_WHERE = "SELECT COUNT(dmHistoryPackage) FROM DmHistoryPackage dmHistoryPackage WHERE ";
	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_1 = "dmHistoryPackage.packageCode IS NULL";
	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_2 = "dmHistoryPackage.packageCode = ?";
	private static final String _FINDER_COLUMN_PACKAGECODE_PACKAGECODE_3 = "(dmHistoryPackage.packageCode IS NULL OR dmHistoryPackage.packageCode = ?)";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_1 =
		"dmHistoryPackage.packageCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_2 =
		"dmHistoryPackage.packageCode = ? AND ";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_PACKAGECODE_3 =
		"(dmHistoryPackage.packageCode IS NULL OR dmHistoryPackage.packageCode = ?) AND ";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryPackage.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryPackage.syncVersion = ?";
	private static final String _FINDER_COLUMN_PACKAGECODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryPackage.syncVersion IS NULL OR dmHistoryPackage.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryPackage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryPackage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryPackage exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryPackagePersistenceImpl.class);
	private static DmHistoryPackage _nullDmHistoryPackage = new DmHistoryPackageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryPackage> toCacheModel() {
				return _nullDmHistoryPackageCacheModel;
			}
		};

	private static CacheModel<DmHistoryPackage> _nullDmHistoryPackageCacheModel = new CacheModel<DmHistoryPackage>() {
			public DmHistoryPackage toEntityModel() {
				return _nullDmHistoryPackage;
			}
		};
}