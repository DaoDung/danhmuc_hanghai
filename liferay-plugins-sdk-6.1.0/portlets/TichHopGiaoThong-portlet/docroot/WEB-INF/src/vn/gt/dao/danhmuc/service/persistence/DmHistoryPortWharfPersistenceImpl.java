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

import vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException;
import vn.gt.dao.danhmuc.model.DmHistoryPortWharf;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPortWharfImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPortWharfModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history port wharf service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPortWharfPersistence
 * @see DmHistoryPortWharfUtil
 * @generated
 */
public class DmHistoryPortWharfPersistenceImpl extends BasePersistenceImpl<DmHistoryPortWharf>
	implements DmHistoryPortWharfPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryPortWharfUtil} to access the dm history port wharf persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryPortWharfImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTWHARFCODE =
		new FinderPath(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortWharfCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE =
		new FinderPath(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortWharfCode",
			new String[] { String.class.getName() },
			DmHistoryPortWharfModelImpl.PORTWHARFCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTWHARFCODE = new FinderPath(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortWharfCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION =
		new FinderPath(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortWharfImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPortWharfCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryPortWharfModelImpl.PORTWHARFCODE_COLUMN_BITMASK |
			DmHistoryPortWharfModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTWHARFCODEANDSYNCVERSION =
		new FinderPath(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPortWharfCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history port wharf in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPortWharf the dm history port wharf
	 */
	public void cacheResult(DmHistoryPortWharf dmHistoryPortWharf) {
		EntityCacheUtil.putResult(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfImpl.class, dmHistoryPortWharf.getPrimaryKey(),
			dmHistoryPortWharf);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPortWharf.getPortWharfCode(),
				
			dmHistoryPortWharf.getSyncVersion()
			}, dmHistoryPortWharf);

		dmHistoryPortWharf.resetOriginalValues();
	}

	/**
	 * Caches the dm history port wharfs in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPortWharfs the dm history port wharfs
	 */
	public void cacheResult(List<DmHistoryPortWharf> dmHistoryPortWharfs) {
		for (DmHistoryPortWharf dmHistoryPortWharf : dmHistoryPortWharfs) {
			if (EntityCacheUtil.getResult(
						DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortWharfImpl.class,
						dmHistoryPortWharf.getPrimaryKey()) == null) {
				cacheResult(dmHistoryPortWharf);
			}
			else {
				dmHistoryPortWharf.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history port wharfs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryPortWharfImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryPortWharfImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history port wharf.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryPortWharf dmHistoryPortWharf) {
		EntityCacheUtil.removeResult(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfImpl.class, dmHistoryPortWharf.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryPortWharf);
	}

	@Override
	public void clearCache(List<DmHistoryPortWharf> dmHistoryPortWharfs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryPortWharf dmHistoryPortWharf : dmHistoryPortWharfs) {
			EntityCacheUtil.removeResult(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPortWharfImpl.class, dmHistoryPortWharf.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryPortWharf);
		}
	}

	protected void clearUniqueFindersCache(
		DmHistoryPortWharf dmHistoryPortWharf) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPortWharf.getPortWharfCode(),
				
			dmHistoryPortWharf.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history port wharf with the primary key. Does not add the dm history port wharf to the database.
	 *
	 * @param id the primary key for the new dm history port wharf
	 * @return the new dm history port wharf
	 */
	public DmHistoryPortWharf create(int id) {
		DmHistoryPortWharf dmHistoryPortWharf = new DmHistoryPortWharfImpl();

		dmHistoryPortWharf.setNew(true);
		dmHistoryPortWharf.setPrimaryKey(id);

		return dmHistoryPortWharf;
	}

	/**
	 * Removes the dm history port wharf with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history port wharf
	 * @return the dm history port wharf that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException if a dm history port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf remove(int id)
		throws NoSuchDmHistoryPortWharfException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm history port wharf with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history port wharf
	 * @return the dm history port wharf that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException if a dm history port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortWharf remove(Serializable primaryKey)
		throws NoSuchDmHistoryPortWharfException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryPortWharf dmHistoryPortWharf = (DmHistoryPortWharf)session.get(DmHistoryPortWharfImpl.class,
					primaryKey);

			if (dmHistoryPortWharf == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryPortWharfException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryPortWharf);
		}
		catch (NoSuchDmHistoryPortWharfException nsee) {
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
	protected DmHistoryPortWharf removeImpl(
		DmHistoryPortWharf dmHistoryPortWharf) throws SystemException {
		dmHistoryPortWharf = toUnwrappedModel(dmHistoryPortWharf);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryPortWharf);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmHistoryPortWharf);

		return dmHistoryPortWharf;
	}

	@Override
	public DmHistoryPortWharf updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPortWharf dmHistoryPortWharf,
		boolean merge) throws SystemException {
		dmHistoryPortWharf = toUnwrappedModel(dmHistoryPortWharf);

		boolean isNew = dmHistoryPortWharf.isNew();

		DmHistoryPortWharfModelImpl dmHistoryPortWharfModelImpl = (DmHistoryPortWharfModelImpl)dmHistoryPortWharf;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryPortWharf, merge);

			dmHistoryPortWharf.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryPortWharfModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryPortWharfModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortWharfModelImpl.getOriginalPortWharfCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTWHARFCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE,
					args);

				args = new Object[] {
						dmHistoryPortWharfModelImpl.getPortWharfCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTWHARFCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortWharfImpl.class, dmHistoryPortWharf.getPrimaryKey(),
			dmHistoryPortWharf);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
				new Object[] {
					dmHistoryPortWharf.getPortWharfCode(),
					
				dmHistoryPortWharf.getSyncVersion()
				}, dmHistoryPortWharf);
		}
		else {
			if ((dmHistoryPortWharfModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortWharfModelImpl.getOriginalPortWharfCode(),
						
						dmHistoryPortWharfModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTWHARFCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
					new Object[] {
						dmHistoryPortWharf.getPortWharfCode(),
						
					dmHistoryPortWharf.getSyncVersion()
					}, dmHistoryPortWharf);
			}
		}

		return dmHistoryPortWharf;
	}

	protected DmHistoryPortWharf toUnwrappedModel(
		DmHistoryPortWharf dmHistoryPortWharf) {
		if (dmHistoryPortWharf instanceof DmHistoryPortWharfImpl) {
			return dmHistoryPortWharf;
		}

		DmHistoryPortWharfImpl dmHistoryPortWharfImpl = new DmHistoryPortWharfImpl();

		dmHistoryPortWharfImpl.setNew(dmHistoryPortWharf.isNew());
		dmHistoryPortWharfImpl.setPrimaryKey(dmHistoryPortWharf.getPrimaryKey());

		dmHistoryPortWharfImpl.setId(dmHistoryPortWharf.getId());
		dmHistoryPortWharfImpl.setPortWharfCode(dmHistoryPortWharf.getPortWharfCode());
		dmHistoryPortWharfImpl.setPortWharfName(dmHistoryPortWharf.getPortWharfName());
		dmHistoryPortWharfImpl.setPortWharfNameVN(dmHistoryPortWharf.getPortWharfNameVN());
		dmHistoryPortWharfImpl.setPortWharfType(dmHistoryPortWharf.getPortWharfType());
		dmHistoryPortWharfImpl.setPortHarbourCode(dmHistoryPortWharf.getPortHarbourCode());
		dmHistoryPortWharfImpl.setPortCode(dmHistoryPortWharf.getPortCode());
		dmHistoryPortWharfImpl.setPortRegionCode(dmHistoryPortWharf.getPortRegionCode());
		dmHistoryPortWharfImpl.setNote(dmHistoryPortWharf.getNote());
		dmHistoryPortWharfImpl.setIsDelete(dmHistoryPortWharf.getIsDelete());
		dmHistoryPortWharfImpl.setMarkedAsDelete(dmHistoryPortWharf.getMarkedAsDelete());
		dmHistoryPortWharfImpl.setModifiedDate(dmHistoryPortWharf.getModifiedDate());
		dmHistoryPortWharfImpl.setRequestedDate(dmHistoryPortWharf.getRequestedDate());
		dmHistoryPortWharfImpl.setSyncVersion(dmHistoryPortWharf.getSyncVersion());

		return dmHistoryPortWharfImpl;
	}

	/**
	 * Returns the dm history port wharf with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port wharf
	 * @return the dm history port wharf
	 * @throws com.liferay.portal.NoSuchModelException if a dm history port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortWharf findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history port wharf with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException} if it could not be found.
	 *
	 * @param id the primary key of the dm history port wharf
	 * @return the dm history port wharf
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException if a dm history port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf findByPrimaryKey(int id)
		throws NoSuchDmHistoryPortWharfException, SystemException {
		DmHistoryPortWharf dmHistoryPortWharf = fetchByPrimaryKey(id);

		if (dmHistoryPortWharf == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryPortWharfException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryPortWharf;
	}

	/**
	 * Returns the dm history port wharf with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port wharf
	 * @return the dm history port wharf, or <code>null</code> if a dm history port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortWharf fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history port wharf with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history port wharf
	 * @return the dm history port wharf, or <code>null</code> if a dm history port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf fetchByPrimaryKey(int id)
		throws SystemException {
		DmHistoryPortWharf dmHistoryPortWharf = (DmHistoryPortWharf)EntityCacheUtil.getResult(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPortWharfImpl.class, id);

		if (dmHistoryPortWharf == _nullDmHistoryPortWharf) {
			return null;
		}

		if (dmHistoryPortWharf == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryPortWharf = (DmHistoryPortWharf)session.get(DmHistoryPortWharfImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryPortWharf != null) {
					cacheResult(dmHistoryPortWharf);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryPortWharfModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortWharfImpl.class, id,
						_nullDmHistoryPortWharf);
				}

				closeSession(session);
			}
		}

		return dmHistoryPortWharf;
	}

	/**
	 * Returns all the dm history port wharfs where portWharfCode = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @return the matching dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortWharf> findByPortWharfCode(String portWharfCode)
		throws SystemException {
		return findByPortWharfCode(portWharfCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history port wharfs where portWharfCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portWharfCode the port wharf code
	 * @param start the lower bound of the range of dm history port wharfs
	 * @param end the upper bound of the range of dm history port wharfs (not inclusive)
	 * @return the range of matching dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortWharf> findByPortWharfCode(String portWharfCode,
		int start, int end) throws SystemException {
		return findByPortWharfCode(portWharfCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history port wharfs where portWharfCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portWharfCode the port wharf code
	 * @param start the lower bound of the range of dm history port wharfs
	 * @param end the upper bound of the range of dm history port wharfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortWharf> findByPortWharfCode(String portWharfCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE;
			finderArgs = new Object[] { portWharfCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTWHARFCODE;
			finderArgs = new Object[] {
					portWharfCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryPortWharf> list = (List<DmHistoryPortWharf>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYPORTWHARF_WHERE);

			if (portWharfCode == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_1);
			}
			else {
				if (portWharfCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmHistoryPortWharfModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portWharfCode != null) {
					qPos.add(portWharfCode);
				}

				list = (List<DmHistoryPortWharf>)QueryUtil.list(q,
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
	 * Returns the first dm history port wharf in the ordered set where portWharfCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portWharfCode the port wharf code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port wharf
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException if a matching dm history port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf findByPortWharfCode_First(String portWharfCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortWharfException, SystemException {
		List<DmHistoryPortWharf> list = findByPortWharfCode(portWharfCode, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portWharfCode=");
			msg.append(portWharfCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPortWharfException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history port wharf in the ordered set where portWharfCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portWharfCode the port wharf code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port wharf
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException if a matching dm history port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf findByPortWharfCode_Last(String portWharfCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortWharfException, SystemException {
		int count = countByPortWharfCode(portWharfCode);

		List<DmHistoryPortWharf> list = findByPortWharfCode(portWharfCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portWharfCode=");
			msg.append(portWharfCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPortWharfException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history port wharfs before and after the current dm history port wharf in the ordered set where portWharfCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history port wharf
	 * @param portWharfCode the port wharf code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history port wharf
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException if a dm history port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf[] findByPortWharfCode_PrevAndNext(int id,
		String portWharfCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortWharfException, SystemException {
		DmHistoryPortWharf dmHistoryPortWharf = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPortWharf[] array = new DmHistoryPortWharfImpl[3];

			array[0] = getByPortWharfCode_PrevAndNext(session,
					dmHistoryPortWharf, portWharfCode, orderByComparator, true);

			array[1] = dmHistoryPortWharf;

			array[2] = getByPortWharfCode_PrevAndNext(session,
					dmHistoryPortWharf, portWharfCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryPortWharf getByPortWharfCode_PrevAndNext(
		Session session, DmHistoryPortWharf dmHistoryPortWharf,
		String portWharfCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYPORTWHARF_WHERE);

		if (portWharfCode == null) {
			query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_1);
		}
		else {
			if (portWharfCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_2);
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
			query.append(DmHistoryPortWharfModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (portWharfCode != null) {
			qPos.add(portWharfCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPortWharf);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPortWharf> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history port wharf where portWharfCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException} if it could not be found.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @return the matching dm history port wharf
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortWharfException if a matching dm history port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf findByPortWharfCodeAndSyncVersion(
		String portWharfCode, String syncVersion)
		throws NoSuchDmHistoryPortWharfException, SystemException {
		DmHistoryPortWharf dmHistoryPortWharf = fetchByPortWharfCodeAndSyncVersion(portWharfCode,
				syncVersion);

		if (dmHistoryPortWharf == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portWharfCode=");
			msg.append(portWharfCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryPortWharfException(msg.toString());
		}

		return dmHistoryPortWharf;
	}

	/**
	 * Returns the dm history port wharf where portWharfCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @return the matching dm history port wharf, or <code>null</code> if a matching dm history port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf fetchByPortWharfCodeAndSyncVersion(
		String portWharfCode, String syncVersion) throws SystemException {
		return fetchByPortWharfCodeAndSyncVersion(portWharfCode, syncVersion,
			true);
	}

	/**
	 * Returns the dm history port wharf where portWharfCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history port wharf, or <code>null</code> if a matching dm history port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPortWharf fetchByPortWharfCodeAndSyncVersion(
		String portWharfCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { portWharfCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYPORTWHARF_WHERE);

			if (portWharfCode == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_1);
			}
			else {
				if (portWharfCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryPortWharfModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portWharfCode != null) {
					qPos.add(portWharfCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryPortWharf> list = q.list();

				result = list;

				DmHistoryPortWharf dmHistoryPortWharf = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryPortWharf = list.get(0);

					cacheResult(dmHistoryPortWharf);

					if ((dmHistoryPortWharf.getPortWharfCode() == null) ||
							!dmHistoryPortWharf.getPortWharfCode()
												   .equals(portWharfCode) ||
							(dmHistoryPortWharf.getSyncVersion() == null) ||
							!dmHistoryPortWharf.getSyncVersion()
												   .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
							finderArgs, dmHistoryPortWharf);
					}
				}

				return dmHistoryPortWharf;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTWHARFCODEANDSYNCVERSION,
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
				return (DmHistoryPortWharf)result;
			}
		}
	}

	/**
	 * Returns all the dm history port wharfs.
	 *
	 * @return the dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortWharf> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history port wharfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history port wharfs
	 * @param end the upper bound of the range of dm history port wharfs (not inclusive)
	 * @return the range of dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortWharf> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history port wharfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history port wharfs
	 * @param end the upper bound of the range of dm history port wharfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPortWharf> findAll(int start, int end,
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

		List<DmHistoryPortWharf> list = (List<DmHistoryPortWharf>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYPORTWHARF);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYPORTWHARF.concat(DmHistoryPortWharfModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryPortWharf>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryPortWharf>)QueryUtil.list(q,
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
	 * Removes all the dm history port wharfs where portWharfCode = &#63; from the database.
	 *
	 * @param portWharfCode the port wharf code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortWharfCode(String portWharfCode)
		throws SystemException {
		for (DmHistoryPortWharf dmHistoryPortWharf : findByPortWharfCode(
				portWharfCode)) {
			remove(dmHistoryPortWharf);
		}
	}

	/**
	 * Removes the dm history port wharf where portWharfCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortWharfCodeAndSyncVersion(String portWharfCode,
		String syncVersion)
		throws NoSuchDmHistoryPortWharfException, SystemException {
		DmHistoryPortWharf dmHistoryPortWharf = findByPortWharfCodeAndSyncVersion(portWharfCode,
				syncVersion);

		remove(dmHistoryPortWharf);
	}

	/**
	 * Removes all the dm history port wharfs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryPortWharf dmHistoryPortWharf : findAll()) {
			remove(dmHistoryPortWharf);
		}
	}

	/**
	 * Returns the number of dm history port wharfs where portWharfCode = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @return the number of matching dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortWharfCode(String portWharfCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { portWharfCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTWHARFCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPORTWHARF_WHERE);

			if (portWharfCode == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_1);
			}
			else {
				if (portWharfCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portWharfCode != null) {
					qPos.add(portWharfCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTWHARFCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortWharfCodeAndSyncVersion(String portWharfCode,
		String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { portWharfCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTWHARFCODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYPORTWHARF_WHERE);

			if (portWharfCode == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_1);
			}
			else {
				if (portWharfCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portWharfCode != null) {
					qPos.add(portWharfCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTWHARFCODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history port wharfs.
	 *
	 * @return the number of dm history port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYPORTWHARF);

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
	 * Initializes the dm history port wharf persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryPortWharf")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryPortWharf>> listenersList = new ArrayList<ModelListener<DmHistoryPortWharf>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryPortWharf>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryPortWharfImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYPORTWHARF = "SELECT dmHistoryPortWharf FROM DmHistoryPortWharf dmHistoryPortWharf";
	private static final String _SQL_SELECT_DMHISTORYPORTWHARF_WHERE = "SELECT dmHistoryPortWharf FROM DmHistoryPortWharf dmHistoryPortWharf WHERE ";
	private static final String _SQL_COUNT_DMHISTORYPORTWHARF = "SELECT COUNT(dmHistoryPortWharf) FROM DmHistoryPortWharf dmHistoryPortWharf";
	private static final String _SQL_COUNT_DMHISTORYPORTWHARF_WHERE = "SELECT COUNT(dmHistoryPortWharf) FROM DmHistoryPortWharf dmHistoryPortWharf WHERE ";
	private static final String _FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_1 = "dmHistoryPortWharf.portWharfCode IS NULL";
	private static final String _FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_2 = "dmHistoryPortWharf.portWharfCode = ?";
	private static final String _FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_3 = "(dmHistoryPortWharf.portWharfCode IS NULL OR dmHistoryPortWharf.portWharfCode = ?)";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_1 =
		"dmHistoryPortWharf.portWharfCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_2 =
		"dmHistoryPortWharf.portWharfCode = ? AND ";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_3 =
		"(dmHistoryPortWharf.portWharfCode IS NULL OR dmHistoryPortWharf.portWharfCode = ?) AND ";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryPortWharf.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryPortWharf.syncVersion = ?";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryPortWharf.syncVersion IS NULL OR dmHistoryPortWharf.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryPortWharf.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryPortWharf exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryPortWharf exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryPortWharfPersistenceImpl.class);
	private static DmHistoryPortWharf _nullDmHistoryPortWharf = new DmHistoryPortWharfImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryPortWharf> toCacheModel() {
				return _nullDmHistoryPortWharfCacheModel;
			}
		};

	private static CacheModel<DmHistoryPortWharf> _nullDmHistoryPortWharfCacheModel =
		new CacheModel<DmHistoryPortWharf>() {
			public DmHistoryPortWharf toEntityModel() {
				return _nullDmHistoryPortWharf;
			}
		};
}