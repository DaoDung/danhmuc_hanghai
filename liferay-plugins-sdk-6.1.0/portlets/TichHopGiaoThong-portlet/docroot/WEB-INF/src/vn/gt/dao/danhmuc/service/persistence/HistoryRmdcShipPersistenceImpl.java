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

import vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;
import vn.gt.dao.danhmuc.model.HistoryRmdcShip;
import vn.gt.dao.danhmuc.model.impl.HistoryRmdcShipImpl;
import vn.gt.dao.danhmuc.model.impl.HistoryRmdcShipModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the history rmdc ship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see HistoryRmdcShipPersistence
 * @see HistoryRmdcShipUtil
 * @generated
 */
public class HistoryRmdcShipPersistenceImpl extends BasePersistenceImpl<HistoryRmdcShip>
	implements HistoryRmdcShipPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HistoryRmdcShipUtil} to access the history rmdc ship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HistoryRmdcShipImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySyncVersion",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION =
		new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySyncVersion",
			new String[] { String.class.getName() },
			HistoryRmdcShipModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SYNCVERSION = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySyncVersion",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByShipTypeCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByShipTypeCode",
			new String[] { String.class.getName() },
			HistoryRmdcShipModelImpl.SHIPTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPTYPECODE = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByShipTypeCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the history rmdc ship in the entity cache if it is enabled.
	 *
	 * @param historyRmdcShip the history rmdc ship
	 */
	public void cacheResult(HistoryRmdcShip historyRmdcShip) {
		EntityCacheUtil.putResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, historyRmdcShip.getPrimaryKey(),
			historyRmdcShip);

		historyRmdcShip.resetOriginalValues();
	}

	/**
	 * Caches the history rmdc ships in the entity cache if it is enabled.
	 *
	 * @param historyRmdcShips the history rmdc ships
	 */
	public void cacheResult(List<HistoryRmdcShip> historyRmdcShips) {
		for (HistoryRmdcShip historyRmdcShip : historyRmdcShips) {
			if (EntityCacheUtil.getResult(
						HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
						HistoryRmdcShipImpl.class,
						historyRmdcShip.getPrimaryKey()) == null) {
				cacheResult(historyRmdcShip);
			}
			else {
				historyRmdcShip.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all history rmdc ships.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HistoryRmdcShipImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HistoryRmdcShipImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the history rmdc ship.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HistoryRmdcShip historyRmdcShip) {
		EntityCacheUtil.removeResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, historyRmdcShip.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Creates a new history rmdc ship with the primary key. Does not add the history rmdc ship to the database.
	 *
	 * @param id the primary key for the new history rmdc ship
	 * @return the new history rmdc ship
	 */
	public HistoryRmdcShip create(long id) {
		HistoryRmdcShip historyRmdcShip = new HistoryRmdcShipImpl();

		historyRmdcShip.setNew(true);
		historyRmdcShip.setPrimaryKey(id);

		return historyRmdcShip;
	}

	/**
	 * Removes the history rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the history rmdc ship
	 * @return the history rmdc ship that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the history rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the history rmdc ship
	 * @return the history rmdc ship that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip remove(long id)
		throws NoSuchHistoryRmdcShipException, SystemException {
		Session session = null;

		try {
			session = openSession();

			HistoryRmdcShip historyRmdcShip = (HistoryRmdcShip)session.get(HistoryRmdcShipImpl.class,
					Long.valueOf(id));

			if (historyRmdcShip == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchHistoryRmdcShipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return historyRmdcShipPersistence.remove(historyRmdcShip);
		}
		catch (NoSuchHistoryRmdcShipException nsee) {
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
	 * Removes the history rmdc ship from the database. Also notifies the appropriate model listeners.
	 *
	 * @param historyRmdcShip the history rmdc ship
	 * @return the history rmdc ship that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip remove(HistoryRmdcShip historyRmdcShip)
		throws SystemException {
		return super.remove(historyRmdcShip);
	}

	@Override
	protected HistoryRmdcShip removeImpl(HistoryRmdcShip historyRmdcShip)
		throws SystemException {
		historyRmdcShip = toUnwrappedModel(historyRmdcShip);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, historyRmdcShip);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		EntityCacheUtil.removeResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, historyRmdcShip.getPrimaryKey());

		return historyRmdcShip;
	}

	@Override
	public HistoryRmdcShip updateImpl(
		vn.gt.dao.danhmuc.model.HistoryRmdcShip historyRmdcShip, boolean merge)
		throws SystemException {
		historyRmdcShip = toUnwrappedModel(historyRmdcShip);

		boolean isNew = historyRmdcShip.isNew();

		HistoryRmdcShipModelImpl historyRmdcShipModelImpl = (HistoryRmdcShipModelImpl)historyRmdcShip;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, historyRmdcShip, merge);

			historyRmdcShip.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !HistoryRmdcShipModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((historyRmdcShipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyRmdcShipModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);

				args = new Object[] { historyRmdcShipModelImpl.getSyncVersion() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION,
					args);
			}

			if ((historyRmdcShipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyRmdcShipModelImpl.getOriginalShipTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);

				args = new Object[] { historyRmdcShipModelImpl.getShipTypeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			HistoryRmdcShipImpl.class, historyRmdcShip.getPrimaryKey(),
			historyRmdcShip);

		return historyRmdcShip;
	}

	protected HistoryRmdcShip toUnwrappedModel(HistoryRmdcShip historyRmdcShip) {
		if (historyRmdcShip instanceof HistoryRmdcShipImpl) {
			return historyRmdcShip;
		}

		HistoryRmdcShipImpl historyRmdcShipImpl = new HistoryRmdcShipImpl();

		historyRmdcShipImpl.setNew(historyRmdcShip.isNew());
		historyRmdcShipImpl.setPrimaryKey(historyRmdcShip.getPrimaryKey());

		historyRmdcShipImpl.setId(historyRmdcShip.getId());
		historyRmdcShipImpl.setShipId(historyRmdcShip.getShipId());
		historyRmdcShipImpl.setShipName(historyRmdcShip.getShipName());
		historyRmdcShipImpl.setShipTypeId(historyRmdcShip.getShipTypeId());
		historyRmdcShipImpl.setShipTypeCode(historyRmdcShip.getShipTypeCode());
		historyRmdcShipImpl.setImo(historyRmdcShip.getImo());
		historyRmdcShipImpl.setCallSign(historyRmdcShip.getCallSign());
		historyRmdcShipImpl.setStateId(historyRmdcShip.getStateId());
		historyRmdcShipImpl.setStateCode(historyRmdcShip.getStateCode());
		historyRmdcShipImpl.setRegistryNumber(historyRmdcShip.getRegistryNumber());
		historyRmdcShipImpl.setRegistryDate(historyRmdcShip.getRegistryDate());
		historyRmdcShipImpl.setRegistryPortId(historyRmdcShip.getRegistryPortId());
		historyRmdcShipImpl.setRegistryPortCode(historyRmdcShip.getRegistryPortCode());
		historyRmdcShipImpl.setGt(historyRmdcShip.getGt());
		historyRmdcShipImpl.setNrt(historyRmdcShip.getNrt());
		historyRmdcShipImpl.setDwt(historyRmdcShip.getDwt());
		historyRmdcShipImpl.setLength(historyRmdcShip.getLength());
		historyRmdcShipImpl.setWidth(historyRmdcShip.getWidth());
		historyRmdcShipImpl.setHeight(historyRmdcShip.getHeight());
		historyRmdcShipImpl.setSailingSpeed(historyRmdcShip.getSailingSpeed());
		historyRmdcShipImpl.setColor(historyRmdcShip.getColor());
		historyRmdcShipImpl.setBoneCode(historyRmdcShip.getBoneCode());
		historyRmdcShipImpl.setMachineCode(historyRmdcShip.getMachineCode());
		historyRmdcShipImpl.setShipAgencyId(historyRmdcShip.getShipAgencyId());
		historyRmdcShipImpl.setShipAgencyCode(historyRmdcShip.getShipAgencyCode());
		historyRmdcShipImpl.setFishingBoatRegistration(historyRmdcShip.getFishingBoatRegistration());
		historyRmdcShipImpl.setRoleShip(historyRmdcShip.getRoleShip());
		historyRmdcShipImpl.setIsDelete(historyRmdcShip.getIsDelete());
		historyRmdcShipImpl.setMarkedAsDelete(historyRmdcShip.getMarkedAsDelete());
		historyRmdcShipImpl.setModifiedDate(historyRmdcShip.getModifiedDate());
		historyRmdcShipImpl.setRequestedDate(historyRmdcShip.getRequestedDate());
		historyRmdcShipImpl.setSyncVersion(historyRmdcShip.getSyncVersion());

		return historyRmdcShipImpl;
	}

	/**
	 * Returns the history rmdc ship with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the history rmdc ship
	 * @return the history rmdc ship
	 * @throws com.liferay.portal.NoSuchModelException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the history rmdc ship with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException} if it could not be found.
	 *
	 * @param id the primary key of the history rmdc ship
	 * @return the history rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip findByPrimaryKey(long id)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = fetchByPrimaryKey(id);

		if (historyRmdcShip == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchHistoryRmdcShipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return historyRmdcShip;
	}

	/**
	 * Returns the history rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the history rmdc ship
	 * @return the history rmdc ship, or <code>null</code> if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryRmdcShip fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the history rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the history rmdc ship
	 * @return the history rmdc ship, or <code>null</code> if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip fetchByPrimaryKey(long id) throws SystemException {
		HistoryRmdcShip historyRmdcShip = (HistoryRmdcShip)EntityCacheUtil.getResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
				HistoryRmdcShipImpl.class, id);

		if (historyRmdcShip == _nullHistoryRmdcShip) {
			return null;
		}

		if (historyRmdcShip == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				historyRmdcShip = (HistoryRmdcShip)session.get(HistoryRmdcShipImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (historyRmdcShip != null) {
					cacheResult(historyRmdcShip);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(HistoryRmdcShipModelImpl.ENTITY_CACHE_ENABLED,
						HistoryRmdcShipImpl.class, id, _nullHistoryRmdcShip);
				}

				closeSession(session);
			}
		}

		return historyRmdcShip;
	}

	/**
	 * Returns all the history rmdc ships where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findBySyncVersion(String syncVersion)
		throws SystemException {
		return findBySyncVersion(syncVersion, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history rmdc ships where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @return the range of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findBySyncVersion(String syncVersion,
		int start, int end) throws SystemException {
		return findBySyncVersion(syncVersion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history rmdc ships where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findBySyncVersion(String syncVersion,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SYNCVERSION;
			finderArgs = new Object[] { syncVersion };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SYNCVERSION;
			finderArgs = new Object[] { syncVersion, start, end, orderByComparator };
		}

		List<HistoryRmdcShip> list = (List<HistoryRmdcShip>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_HISTORYRMDCSHIP_WHERE);

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				list = (List<HistoryRmdcShip>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first history rmdc ship in the ordered set where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip findBySyncVersion_First(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		List<HistoryRmdcShip> list = findBySyncVersion(syncVersion, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchHistoryRmdcShipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last history rmdc ship in the ordered set where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip findBySyncVersion_Last(String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		int count = countBySyncVersion(syncVersion);

		List<HistoryRmdcShip> list = findBySyncVersion(syncVersion, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchHistoryRmdcShipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the history rmdc ships before and after the current history rmdc ship in the ordered set where syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current history rmdc ship
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip[] findBySyncVersion_PrevAndNext(long id,
		String syncVersion, OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistoryRmdcShip[] array = new HistoryRmdcShipImpl[3];

			array[0] = getBySyncVersion_PrevAndNext(session, historyRmdcShip,
					syncVersion, orderByComparator, true);

			array[1] = historyRmdcShip;

			array[2] = getBySyncVersion_PrevAndNext(session, historyRmdcShip,
					syncVersion, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HistoryRmdcShip getBySyncVersion_PrevAndNext(Session session,
		HistoryRmdcShip historyRmdcShip, String syncVersion,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORYRMDCSHIP_WHERE);

		if (syncVersion == null) {
			query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1);
		}
		else {
			if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3);
			}
			else {
				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2);
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
			query.append(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (syncVersion != null) {
			qPos.add(syncVersion);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(historyRmdcShip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistoryRmdcShip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the history rmdc ships where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findByShipTypeCode(String shipTypeCode)
		throws SystemException {
		return findByShipTypeCode(shipTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history rmdc ships where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @return the range of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findByShipTypeCode(String shipTypeCode,
		int start, int end) throws SystemException {
		return findByShipTypeCode(shipTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history rmdc ships where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findByShipTypeCode(String shipTypeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE;
			finderArgs = new Object[] { shipTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE;
			finderArgs = new Object[] {
					shipTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<HistoryRmdcShip> list = (List<HistoryRmdcShip>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_HISTORYRMDCSHIP_WHERE);

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
			}
			else {
				if (shipTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipTypeCode != null) {
					qPos.add(shipTypeCode);
				}

				list = (List<HistoryRmdcShip>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first history rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip findByShipTypeCode_First(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		List<HistoryRmdcShip> list = findByShipTypeCode(shipTypeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchHistoryRmdcShipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last history rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip findByShipTypeCode_Last(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		int count = countByShipTypeCode(shipTypeCode);

		List<HistoryRmdcShip> list = findByShipTypeCode(shipTypeCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchHistoryRmdcShipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the history rmdc ships before and after the current history rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current history rmdc ship
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public HistoryRmdcShip[] findByShipTypeCode_PrevAndNext(long id,
		String shipTypeCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryRmdcShipException, SystemException {
		HistoryRmdcShip historyRmdcShip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistoryRmdcShip[] array = new HistoryRmdcShipImpl[3];

			array[0] = getByShipTypeCode_PrevAndNext(session, historyRmdcShip,
					shipTypeCode, orderByComparator, true);

			array[1] = historyRmdcShip;

			array[2] = getByShipTypeCode_PrevAndNext(session, historyRmdcShip,
					shipTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HistoryRmdcShip getByShipTypeCode_PrevAndNext(Session session,
		HistoryRmdcShip historyRmdcShip, String shipTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORYRMDCSHIP_WHERE);

		if (shipTypeCode == null) {
			query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
		}
		else {
			if (shipTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
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
			query.append(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (shipTypeCode != null) {
			qPos.add(shipTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(historyRmdcShip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistoryRmdcShip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the history rmdc ships.
	 *
	 * @return the history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history rmdc ships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @return the range of history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the history rmdc ships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of history rmdc ships
	 * @param end the upper bound of the range of history rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<HistoryRmdcShip> findAll(int start, int end,
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

		List<HistoryRmdcShip> list = (List<HistoryRmdcShip>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HISTORYRMDCSHIP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HISTORYRMDCSHIP.concat(HistoryRmdcShipModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<HistoryRmdcShip>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<HistoryRmdcShip>)QueryUtil.list(q,
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
	 * Removes all the history rmdc ships where syncVersion = &#63; from the database.
	 *
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySyncVersion(String syncVersion)
		throws SystemException {
		for (HistoryRmdcShip historyRmdcShip : findBySyncVersion(syncVersion)) {
			historyRmdcShipPersistence.remove(historyRmdcShip);
		}
	}

	/**
	 * Removes all the history rmdc ships where shipTypeCode = &#63; from the database.
	 *
	 * @param shipTypeCode the ship type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByShipTypeCode(String shipTypeCode)
		throws SystemException {
		for (HistoryRmdcShip historyRmdcShip : findByShipTypeCode(shipTypeCode)) {
			historyRmdcShipPersistence.remove(historyRmdcShip);
		}
	}

	/**
	 * Removes all the history rmdc ships from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (HistoryRmdcShip historyRmdcShip : findAll()) {
			historyRmdcShipPersistence.remove(historyRmdcShip);
		}
	}

	/**
	 * Returns the number of history rmdc ships where syncVersion = &#63;.
	 *
	 * @param syncVersion the sync version
	 * @return the number of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySyncVersion(String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HISTORYRMDCSHIP_WHERE);

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of history rmdc ships where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the number of matching history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public int countByShipTypeCode(String shipTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { shipTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HISTORYRMDCSHIP_WHERE);

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
			}
			else {
				if (shipTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipTypeCode != null) {
					qPos.add(shipTypeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of history rmdc ships.
	 *
	 * @return the number of history rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_HISTORYRMDCSHIP);

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
	 * Initializes the history rmdc ship persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.HistoryRmdcShip")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<HistoryRmdcShip>> listenersList = new ArrayList<ModelListener<HistoryRmdcShip>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<HistoryRmdcShip>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HistoryRmdcShipImpl.class.getName());
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
	private static final String _SQL_SELECT_HISTORYRMDCSHIP = "SELECT historyRmdcShip FROM HistoryRmdcShip historyRmdcShip";
	private static final String _SQL_SELECT_HISTORYRMDCSHIP_WHERE = "SELECT historyRmdcShip FROM HistoryRmdcShip historyRmdcShip WHERE ";
	private static final String _SQL_COUNT_HISTORYRMDCSHIP = "SELECT COUNT(historyRmdcShip) FROM HistoryRmdcShip historyRmdcShip";
	private static final String _SQL_COUNT_HISTORYRMDCSHIP_WHERE = "SELECT COUNT(historyRmdcShip) FROM HistoryRmdcShip historyRmdcShip WHERE ";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_1 = "historyRmdcShip.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_2 = "historyRmdcShip.syncVersion = ?";
	private static final String _FINDER_COLUMN_SYNCVERSION_SYNCVERSION_3 = "(historyRmdcShip.syncVersion IS NULL OR historyRmdcShip.syncVersion = ?)";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1 = "historyRmdcShip.shipTypeCode IS NULL";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2 = "historyRmdcShip.shipTypeCode = ?";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3 = "(historyRmdcShip.shipTypeCode IS NULL OR historyRmdcShip.shipTypeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "historyRmdcShip.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HistoryRmdcShip exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HistoryRmdcShip exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HistoryRmdcShipPersistenceImpl.class);
	private static HistoryRmdcShip _nullHistoryRmdcShip = new HistoryRmdcShipImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<HistoryRmdcShip> toCacheModel() {
				return _nullHistoryRmdcShipCacheModel;
			}
		};

	private static CacheModel<HistoryRmdcShip> _nullHistoryRmdcShipCacheModel = new CacheModel<HistoryRmdcShip>() {
			public HistoryRmdcShip toEntityModel() {
				return _nullHistoryRmdcShip;
			}
		};
}