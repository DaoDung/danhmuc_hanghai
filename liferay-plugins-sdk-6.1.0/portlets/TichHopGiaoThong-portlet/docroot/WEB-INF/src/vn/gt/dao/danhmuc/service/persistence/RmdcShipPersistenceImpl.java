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

import vn.gt.dao.danhmuc.NoSuchRmdcShipException;
import vn.gt.dao.danhmuc.model.RmdcShip;
import vn.gt.dao.danhmuc.model.impl.RmdcShipImpl;
import vn.gt.dao.danhmuc.model.impl.RmdcShipModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rmdc ship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see RmdcShipPersistence
 * @see RmdcShipUtil
 * @generated
 */
public class RmdcShipPersistenceImpl extends BasePersistenceImpl<RmdcShip>
	implements RmdcShipPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RmdcShipUtil} to access the rmdc ship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RmdcShipImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPID = new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, RmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByShipId",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPID =
		new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, RmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByShipId",
			new String[] { Integer.class.getName() },
			RmdcShipModelImpl.SHIPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPID = new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByShipId",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, RmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByShipTypeCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, RmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByShipTypeCode",
			new String[] { String.class.getName() },
			RmdcShipModelImpl.SHIPTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPTYPECODE = new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByShipTypeCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, RmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, RmdcShipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the rmdc ship in the entity cache if it is enabled.
	 *
	 * @param rmdcShip the rmdc ship
	 */
	public void cacheResult(RmdcShip rmdcShip) {
		EntityCacheUtil.putResult(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipImpl.class, rmdcShip.getPrimaryKey(), rmdcShip);

		rmdcShip.resetOriginalValues();
	}

	/**
	 * Caches the rmdc ships in the entity cache if it is enabled.
	 *
	 * @param rmdcShips the rmdc ships
	 */
	public void cacheResult(List<RmdcShip> rmdcShips) {
		for (RmdcShip rmdcShip : rmdcShips) {
			if (EntityCacheUtil.getResult(
						RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
						RmdcShipImpl.class, rmdcShip.getPrimaryKey()) == null) {
				cacheResult(rmdcShip);
			}
			else {
				rmdcShip.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rmdc ships.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RmdcShipImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RmdcShipImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rmdc ship.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RmdcShip rmdcShip) {
		EntityCacheUtil.removeResult(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipImpl.class, rmdcShip.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RmdcShip> rmdcShips) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RmdcShip rmdcShip : rmdcShips) {
			EntityCacheUtil.removeResult(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
				RmdcShipImpl.class, rmdcShip.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rmdc ship with the primary key. Does not add the rmdc ship to the database.
	 *
	 * @param id the primary key for the new rmdc ship
	 * @return the new rmdc ship
	 */
	public RmdcShip create(long id) {
		RmdcShip rmdcShip = new RmdcShipImpl();

		rmdcShip.setNew(true);
		rmdcShip.setPrimaryKey(id);

		return rmdcShip;
	}

	/**
	 * Removes the rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rmdc ship
	 * @return the rmdc ship that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip remove(long id)
		throws NoSuchRmdcShipException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rmdc ship
	 * @return the rmdc ship that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RmdcShip remove(Serializable primaryKey)
		throws NoSuchRmdcShipException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RmdcShip rmdcShip = (RmdcShip)session.get(RmdcShipImpl.class,
					primaryKey);

			if (rmdcShip == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRmdcShipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rmdcShip);
		}
		catch (NoSuchRmdcShipException nsee) {
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
	protected RmdcShip removeImpl(RmdcShip rmdcShip) throws SystemException {
		rmdcShip = toUnwrappedModel(rmdcShip);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, rmdcShip);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(rmdcShip);

		return rmdcShip;
	}

	@Override
	public RmdcShip updateImpl(vn.gt.dao.danhmuc.model.RmdcShip rmdcShip,
		boolean merge) throws SystemException {
		rmdcShip = toUnwrappedModel(rmdcShip);

		boolean isNew = rmdcShip.isNew();

		RmdcShipModelImpl rmdcShipModelImpl = (RmdcShipModelImpl)rmdcShip;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, rmdcShip, merge);

			rmdcShip.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RmdcShipModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((rmdcShipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(rmdcShipModelImpl.getOriginalShipId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPID,
					args);

				args = new Object[] {
						Integer.valueOf(rmdcShipModelImpl.getShipId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPID,
					args);
			}

			if ((rmdcShipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rmdcShipModelImpl.getOriginalShipTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);

				args = new Object[] { rmdcShipModelImpl.getShipTypeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
			RmdcShipImpl.class, rmdcShip.getPrimaryKey(), rmdcShip);

		return rmdcShip;
	}

	protected RmdcShip toUnwrappedModel(RmdcShip rmdcShip) {
		if (rmdcShip instanceof RmdcShipImpl) {
			return rmdcShip;
		}

		RmdcShipImpl rmdcShipImpl = new RmdcShipImpl();

		rmdcShipImpl.setNew(rmdcShip.isNew());
		rmdcShipImpl.setPrimaryKey(rmdcShip.getPrimaryKey());

		rmdcShipImpl.setId(rmdcShip.getId());
		rmdcShipImpl.setShipId(rmdcShip.getShipId());
		rmdcShipImpl.setShipName(rmdcShip.getShipName());
		rmdcShipImpl.setShipTypeId(rmdcShip.getShipTypeId());
		rmdcShipImpl.setShipTypeCode(rmdcShip.getShipTypeCode());
		rmdcShipImpl.setImo(rmdcShip.getImo());
		rmdcShipImpl.setCallSign(rmdcShip.getCallSign());
		rmdcShipImpl.setStateId(rmdcShip.getStateId());
		rmdcShipImpl.setStateCode(rmdcShip.getStateCode());
		rmdcShipImpl.setRegistryNumber(rmdcShip.getRegistryNumber());
		rmdcShipImpl.setRegistryDate(rmdcShip.getRegistryDate());
		rmdcShipImpl.setRegistryPortId(rmdcShip.getRegistryPortId());
		rmdcShipImpl.setRegistryPortCode(rmdcShip.getRegistryPortCode());
		rmdcShipImpl.setGt(rmdcShip.getGt());
		rmdcShipImpl.setNrt(rmdcShip.getNrt());
		rmdcShipImpl.setDwt(rmdcShip.getDwt());
		rmdcShipImpl.setLength(rmdcShip.getLength());
		rmdcShipImpl.setWidth(rmdcShip.getWidth());
		rmdcShipImpl.setHeight(rmdcShip.getHeight());
		rmdcShipImpl.setSailingSpeed(rmdcShip.getSailingSpeed());
		rmdcShipImpl.setColor(rmdcShip.getColor());
		rmdcShipImpl.setBoneCode(rmdcShip.getBoneCode());
		rmdcShipImpl.setMachineCode(rmdcShip.getMachineCode());
		rmdcShipImpl.setShipAgencyId(rmdcShip.getShipAgencyId());
		rmdcShipImpl.setShipAgencyCode(rmdcShip.getShipAgencyCode());
		rmdcShipImpl.setFishingBoatRegistration(rmdcShip.getFishingBoatRegistration());
		rmdcShipImpl.setRoleShip(rmdcShip.getRoleShip());
		rmdcShipImpl.setIsDelete(rmdcShip.getIsDelete());
		rmdcShipImpl.setMarkedAsDelete(rmdcShip.getMarkedAsDelete());
		rmdcShipImpl.setModifiedDate(rmdcShip.getModifiedDate());
		rmdcShipImpl.setRequestedDate(rmdcShip.getRequestedDate());
		rmdcShipImpl.setSyncVersion(rmdcShip.getSyncVersion());

		return rmdcShipImpl;
	}

	/**
	 * Returns the rmdc ship with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rmdc ship
	 * @return the rmdc ship
	 * @throws com.liferay.portal.NoSuchModelException if a rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RmdcShip findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the rmdc ship with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchRmdcShipException} if it could not be found.
	 *
	 * @param id the primary key of the rmdc ship
	 * @return the rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip findByPrimaryKey(long id)
		throws NoSuchRmdcShipException, SystemException {
		RmdcShip rmdcShip = fetchByPrimaryKey(id);

		if (rmdcShip == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchRmdcShipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return rmdcShip;
	}

	/**
	 * Returns the rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rmdc ship
	 * @return the rmdc ship, or <code>null</code> if a rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RmdcShip fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rmdc ship
	 * @return the rmdc ship, or <code>null</code> if a rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip fetchByPrimaryKey(long id) throws SystemException {
		RmdcShip rmdcShip = (RmdcShip)EntityCacheUtil.getResult(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
				RmdcShipImpl.class, id);

		if (rmdcShip == _nullRmdcShip) {
			return null;
		}

		if (rmdcShip == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				rmdcShip = (RmdcShip)session.get(RmdcShipImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (rmdcShip != null) {
					cacheResult(rmdcShip);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(RmdcShipModelImpl.ENTITY_CACHE_ENABLED,
						RmdcShipImpl.class, id, _nullRmdcShip);
				}

				closeSession(session);
			}
		}

		return rmdcShip;
	}

	/**
	 * Returns all the rmdc ships where shipId = &#63;.
	 *
	 * @param shipId the ship ID
	 * @return the matching rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findByShipId(int shipId) throws SystemException {
		return findByShipId(shipId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rmdc ships where shipId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipId the ship ID
	 * @param start the lower bound of the range of rmdc ships
	 * @param end the upper bound of the range of rmdc ships (not inclusive)
	 * @return the range of matching rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findByShipId(int shipId, int start, int end)
		throws SystemException {
		return findByShipId(shipId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rmdc ships where shipId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipId the ship ID
	 * @param start the lower bound of the range of rmdc ships
	 * @param end the upper bound of the range of rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findByShipId(int shipId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPID;
			finderArgs = new Object[] { shipId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPID;
			finderArgs = new Object[] { shipId, start, end, orderByComparator };
		}

		List<RmdcShip> list = (List<RmdcShip>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RMDCSHIP_WHERE);

			query.append(_FINDER_COLUMN_SHIPID_SHIPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(RmdcShipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(shipId);

				list = (List<RmdcShip>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first rmdc ship in the ordered set where shipId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipId the ship ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a matching rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip findByShipId_First(int shipId,
		OrderByComparator orderByComparator)
		throws NoSuchRmdcShipException, SystemException {
		List<RmdcShip> list = findByShipId(shipId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipId=");
			msg.append(shipId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchRmdcShipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last rmdc ship in the ordered set where shipId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipId the ship ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a matching rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip findByShipId_Last(int shipId,
		OrderByComparator orderByComparator)
		throws NoSuchRmdcShipException, SystemException {
		int count = countByShipId(shipId);

		List<RmdcShip> list = findByShipId(shipId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipId=");
			msg.append(shipId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchRmdcShipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the rmdc ships before and after the current rmdc ship in the ordered set where shipId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current rmdc ship
	 * @param shipId the ship ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip[] findByShipId_PrevAndNext(long id, int shipId,
		OrderByComparator orderByComparator)
		throws NoSuchRmdcShipException, SystemException {
		RmdcShip rmdcShip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RmdcShip[] array = new RmdcShipImpl[3];

			array[0] = getByShipId_PrevAndNext(session, rmdcShip, shipId,
					orderByComparator, true);

			array[1] = rmdcShip;

			array[2] = getByShipId_PrevAndNext(session, rmdcShip, shipId,
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

	protected RmdcShip getByShipId_PrevAndNext(Session session,
		RmdcShip rmdcShip, int shipId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RMDCSHIP_WHERE);

		query.append(_FINDER_COLUMN_SHIPID_SHIPID_2);

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
			query.append(RmdcShipModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(shipId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rmdcShip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RmdcShip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the rmdc ships where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the matching rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findByShipTypeCode(String shipTypeCode)
		throws SystemException {
		return findByShipTypeCode(shipTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rmdc ships where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of rmdc ships
	 * @param end the upper bound of the range of rmdc ships (not inclusive)
	 * @return the range of matching rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findByShipTypeCode(String shipTypeCode, int start,
		int end) throws SystemException {
		return findByShipTypeCode(shipTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rmdc ships where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of rmdc ships
	 * @param end the upper bound of the range of rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findByShipTypeCode(String shipTypeCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<RmdcShip> list = (List<RmdcShip>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RMDCSHIP_WHERE);

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
				query.append(RmdcShipModelImpl.ORDER_BY_JPQL);
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

				list = (List<RmdcShip>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a matching rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip findByShipTypeCode_First(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchRmdcShipException, SystemException {
		List<RmdcShip> list = findByShipTypeCode(shipTypeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchRmdcShipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a matching rmdc ship could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip findByShipTypeCode_Last(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchRmdcShipException, SystemException {
		int count = countByShipTypeCode(shipTypeCode);

		List<RmdcShip> list = findByShipTypeCode(shipTypeCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchRmdcShipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the rmdc ships before and after the current rmdc ship in the ordered set where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current rmdc ship
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rmdc ship
	 * @throws vn.gt.dao.danhmuc.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RmdcShip[] findByShipTypeCode_PrevAndNext(long id,
		String shipTypeCode, OrderByComparator orderByComparator)
		throws NoSuchRmdcShipException, SystemException {
		RmdcShip rmdcShip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RmdcShip[] array = new RmdcShipImpl[3];

			array[0] = getByShipTypeCode_PrevAndNext(session, rmdcShip,
					shipTypeCode, orderByComparator, true);

			array[1] = rmdcShip;

			array[2] = getByShipTypeCode_PrevAndNext(session, rmdcShip,
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

	protected RmdcShip getByShipTypeCode_PrevAndNext(Session session,
		RmdcShip rmdcShip, String shipTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RMDCSHIP_WHERE);

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
			query.append(RmdcShipModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(rmdcShip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RmdcShip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the rmdc ships.
	 *
	 * @return the rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rmdc ships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of rmdc ships
	 * @param end the upper bound of the range of rmdc ships (not inclusive)
	 * @return the range of rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rmdc ships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of rmdc ships
	 * @param end the upper bound of the range of rmdc ships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public List<RmdcShip> findAll(int start, int end,
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

		List<RmdcShip> list = (List<RmdcShip>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RMDCSHIP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RMDCSHIP.concat(RmdcShipModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<RmdcShip>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<RmdcShip>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the rmdc ships where shipId = &#63; from the database.
	 *
	 * @param shipId the ship ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByShipId(int shipId) throws SystemException {
		for (RmdcShip rmdcShip : findByShipId(shipId)) {
			remove(rmdcShip);
		}
	}

	/**
	 * Removes all the rmdc ships where shipTypeCode = &#63; from the database.
	 *
	 * @param shipTypeCode the ship type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByShipTypeCode(String shipTypeCode)
		throws SystemException {
		for (RmdcShip rmdcShip : findByShipTypeCode(shipTypeCode)) {
			remove(rmdcShip);
		}
	}

	/**
	 * Removes all the rmdc ships from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (RmdcShip rmdcShip : findAll()) {
			remove(rmdcShip);
		}
	}

	/**
	 * Returns the number of rmdc ships where shipId = &#63;.
	 *
	 * @param shipId the ship ID
	 * @return the number of matching rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public int countByShipId(int shipId) throws SystemException {
		Object[] finderArgs = new Object[] { shipId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SHIPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RMDCSHIP_WHERE);

			query.append(_FINDER_COLUMN_SHIPID_SHIPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(shipId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SHIPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of rmdc ships where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the number of matching rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public int countByShipTypeCode(String shipTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { shipTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RMDCSHIP_WHERE);

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
	 * Returns the number of rmdc ships.
	 *
	 * @return the number of rmdc ships
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RMDCSHIP);

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
	 * Initializes the rmdc ship persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.RmdcShip")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RmdcShip>> listenersList = new ArrayList<ModelListener<RmdcShip>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RmdcShip>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RmdcShipImpl.class.getName());
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
	private static final String _SQL_SELECT_RMDCSHIP = "SELECT rmdcShip FROM RmdcShip rmdcShip";
	private static final String _SQL_SELECT_RMDCSHIP_WHERE = "SELECT rmdcShip FROM RmdcShip rmdcShip WHERE ";
	private static final String _SQL_COUNT_RMDCSHIP = "SELECT COUNT(rmdcShip) FROM RmdcShip rmdcShip";
	private static final String _SQL_COUNT_RMDCSHIP_WHERE = "SELECT COUNT(rmdcShip) FROM RmdcShip rmdcShip WHERE ";
	private static final String _FINDER_COLUMN_SHIPID_SHIPID_2 = "rmdcShip.shipId = ?";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1 = "rmdcShip.shipTypeCode IS NULL";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2 = "rmdcShip.shipTypeCode = ?";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3 = "(rmdcShip.shipTypeCode IS NULL OR rmdcShip.shipTypeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rmdcShip.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RmdcShip exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RmdcShip exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RmdcShipPersistenceImpl.class);
	private static RmdcShip _nullRmdcShip = new RmdcShipImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RmdcShip> toCacheModel() {
				return _nullRmdcShipCacheModel;
			}
		};

	private static CacheModel<RmdcShip> _nullRmdcShipCacheModel = new CacheModel<RmdcShip>() {
			public RmdcShip toEntityModel() {
				return _nullRmdcShip;
			}
		};
}