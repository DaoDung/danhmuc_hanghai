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

import vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException;
import vn.gt.dao.danhmuc.model.DmHistoryShipAgency;
import vn.gt.dao.danhmuc.model.impl.DmHistoryShipAgencyImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryShipAgencyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history ship agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryShipAgencyPersistence
 * @see DmHistoryShipAgencyUtil
 * @generated
 */
public class DmHistoryShipAgencyPersistenceImpl extends BasePersistenceImpl<DmHistoryShipAgency>
	implements DmHistoryShipAgencyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryShipAgencyUtil} to access the dm history ship agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryShipAgencyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPAGENCYCODE =
		new FinderPath(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipAgencyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByShipAgencyCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPAGENCYCODE =
		new FinderPath(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipAgencyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByShipAgencyCode",
			new String[] { String.class.getName() },
			DmHistoryShipAgencyModelImpl.SHIPAGENCYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPAGENCYCODE = new FinderPath(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByShipAgencyCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION =
		new FinderPath(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipAgencyImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByShipAgencyCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryShipAgencyModelImpl.SHIPAGENCYCODE_COLUMN_BITMASK |
			DmHistoryShipAgencyModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPAGENCYCODEANDSYNCVERSION =
		new FinderPath(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByShipAgencyCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipAgencyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryShipAgencyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history ship agency in the entity cache if it is enabled.
	 *
	 * @param dmHistoryShipAgency the dm history ship agency
	 */
	public void cacheResult(DmHistoryShipAgency dmHistoryShipAgency) {
		EntityCacheUtil.putResult(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyImpl.class, dmHistoryShipAgency.getPrimaryKey(),
			dmHistoryShipAgency);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryShipAgency.getShipAgencyCode(),
				
			dmHistoryShipAgency.getSyncVersion()
			}, dmHistoryShipAgency);

		dmHistoryShipAgency.resetOriginalValues();
	}

	/**
	 * Caches the dm history ship agencies in the entity cache if it is enabled.
	 *
	 * @param dmHistoryShipAgencies the dm history ship agencies
	 */
	public void cacheResult(List<DmHistoryShipAgency> dmHistoryShipAgencies) {
		for (DmHistoryShipAgency dmHistoryShipAgency : dmHistoryShipAgencies) {
			if (EntityCacheUtil.getResult(
						DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryShipAgencyImpl.class,
						dmHistoryShipAgency.getPrimaryKey()) == null) {
				cacheResult(dmHistoryShipAgency);
			}
			else {
				dmHistoryShipAgency.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history ship agencies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryShipAgencyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryShipAgencyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history ship agency.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryShipAgency dmHistoryShipAgency) {
		EntityCacheUtil.removeResult(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyImpl.class, dmHistoryShipAgency.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryShipAgency);
	}

	@Override
	public void clearCache(List<DmHistoryShipAgency> dmHistoryShipAgencies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryShipAgency dmHistoryShipAgency : dmHistoryShipAgencies) {
			EntityCacheUtil.removeResult(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryShipAgencyImpl.class,
				dmHistoryShipAgency.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryShipAgency);
		}
	}

	protected void clearUniqueFindersCache(
		DmHistoryShipAgency dmHistoryShipAgency) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryShipAgency.getShipAgencyCode(),
				
			dmHistoryShipAgency.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history ship agency with the primary key. Does not add the dm history ship agency to the database.
	 *
	 * @param id the primary key for the new dm history ship agency
	 * @return the new dm history ship agency
	 */
	public DmHistoryShipAgency create(int id) {
		DmHistoryShipAgency dmHistoryShipAgency = new DmHistoryShipAgencyImpl();

		dmHistoryShipAgency.setNew(true);
		dmHistoryShipAgency.setPrimaryKey(id);

		return dmHistoryShipAgency;
	}

	/**
	 * Removes the dm history ship agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history ship agency
	 * @return the dm history ship agency that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency remove(int id)
		throws NoSuchDmHistoryShipAgencyException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm history ship agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history ship agency
	 * @return the dm history ship agency that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryShipAgency remove(Serializable primaryKey)
		throws NoSuchDmHistoryShipAgencyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryShipAgency dmHistoryShipAgency = (DmHistoryShipAgency)session.get(DmHistoryShipAgencyImpl.class,
					primaryKey);

			if (dmHistoryShipAgency == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryShipAgencyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryShipAgency);
		}
		catch (NoSuchDmHistoryShipAgencyException nsee) {
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
	protected DmHistoryShipAgency removeImpl(
		DmHistoryShipAgency dmHistoryShipAgency) throws SystemException {
		dmHistoryShipAgency = toUnwrappedModel(dmHistoryShipAgency);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryShipAgency);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmHistoryShipAgency);

		return dmHistoryShipAgency;
	}

	@Override
	public DmHistoryShipAgency updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryShipAgency dmHistoryShipAgency,
		boolean merge) throws SystemException {
		dmHistoryShipAgency = toUnwrappedModel(dmHistoryShipAgency);

		boolean isNew = dmHistoryShipAgency.isNew();

		DmHistoryShipAgencyModelImpl dmHistoryShipAgencyModelImpl = (DmHistoryShipAgencyModelImpl)dmHistoryShipAgency;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryShipAgency, merge);

			dmHistoryShipAgency.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryShipAgencyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryShipAgencyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPAGENCYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryShipAgencyModelImpl.getOriginalShipAgencyCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPAGENCYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPAGENCYCODE,
					args);

				args = new Object[] {
						dmHistoryShipAgencyModelImpl.getShipAgencyCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPAGENCYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPAGENCYCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryShipAgencyImpl.class, dmHistoryShipAgency.getPrimaryKey(),
			dmHistoryShipAgency);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
				new Object[] {
					dmHistoryShipAgency.getShipAgencyCode(),
					
				dmHistoryShipAgency.getSyncVersion()
				}, dmHistoryShipAgency);
		}
		else {
			if ((dmHistoryShipAgencyModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryShipAgencyModelImpl.getOriginalShipAgencyCode(),
						
						dmHistoryShipAgencyModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPAGENCYCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
					new Object[] {
						dmHistoryShipAgency.getShipAgencyCode(),
						
					dmHistoryShipAgency.getSyncVersion()
					}, dmHistoryShipAgency);
			}
		}

		return dmHistoryShipAgency;
	}

	protected DmHistoryShipAgency toUnwrappedModel(
		DmHistoryShipAgency dmHistoryShipAgency) {
		if (dmHistoryShipAgency instanceof DmHistoryShipAgencyImpl) {
			return dmHistoryShipAgency;
		}

		DmHistoryShipAgencyImpl dmHistoryShipAgencyImpl = new DmHistoryShipAgencyImpl();

		dmHistoryShipAgencyImpl.setNew(dmHistoryShipAgency.isNew());
		dmHistoryShipAgencyImpl.setPrimaryKey(dmHistoryShipAgency.getPrimaryKey());

		dmHistoryShipAgencyImpl.setId(dmHistoryShipAgency.getId());
		dmHistoryShipAgencyImpl.setShipAgencyCode(dmHistoryShipAgency.getShipAgencyCode());
		dmHistoryShipAgencyImpl.setShipAgencyName(dmHistoryShipAgency.getShipAgencyName());
		dmHistoryShipAgencyImpl.setShipAgencyNameVN(dmHistoryShipAgency.getShipAgencyNameVN());
		dmHistoryShipAgencyImpl.setTaxCode(dmHistoryShipAgency.getTaxCode());
		dmHistoryShipAgencyImpl.setStateCode(dmHistoryShipAgency.getStateCode());
		dmHistoryShipAgencyImpl.setCitycode(dmHistoryShipAgency.getCitycode());
		dmHistoryShipAgencyImpl.setAddress(dmHistoryShipAgency.getAddress());
		dmHistoryShipAgencyImpl.setAddressVN(dmHistoryShipAgency.getAddressVN());
		dmHistoryShipAgencyImpl.setPhone(dmHistoryShipAgency.getPhone());
		dmHistoryShipAgencyImpl.setFax(dmHistoryShipAgency.getFax());
		dmHistoryShipAgencyImpl.setEmail(dmHistoryShipAgency.getEmail());
		dmHistoryShipAgencyImpl.setDescription(dmHistoryShipAgency.getDescription());
		dmHistoryShipAgencyImpl.setContacter(dmHistoryShipAgency.getContacter());
		dmHistoryShipAgencyImpl.setPosition(dmHistoryShipAgency.getPosition());
		dmHistoryShipAgencyImpl.setContactTell(dmHistoryShipAgency.getContactTell());
		dmHistoryShipAgencyImpl.setIsDelete(dmHistoryShipAgency.getIsDelete());
		dmHistoryShipAgencyImpl.setMarkedAsDelete(dmHistoryShipAgency.getMarkedAsDelete());
		dmHistoryShipAgencyImpl.setModifiedDate(dmHistoryShipAgency.getModifiedDate());
		dmHistoryShipAgencyImpl.setRequestedDate(dmHistoryShipAgency.getRequestedDate());
		dmHistoryShipAgencyImpl.setSyncVersion(dmHistoryShipAgency.getSyncVersion());

		return dmHistoryShipAgencyImpl;
	}

	/**
	 * Returns the dm history ship agency with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history ship agency
	 * @return the dm history ship agency
	 * @throws com.liferay.portal.NoSuchModelException if a dm history ship agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryShipAgency findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history ship agency with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException} if it could not be found.
	 *
	 * @param id the primary key of the dm history ship agency
	 * @return the dm history ship agency
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency findByPrimaryKey(int id)
		throws NoSuchDmHistoryShipAgencyException, SystemException {
		DmHistoryShipAgency dmHistoryShipAgency = fetchByPrimaryKey(id);

		if (dmHistoryShipAgency == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryShipAgencyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryShipAgency;
	}

	/**
	 * Returns the dm history ship agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history ship agency
	 * @return the dm history ship agency, or <code>null</code> if a dm history ship agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryShipAgency fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history ship agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history ship agency
	 * @return the dm history ship agency, or <code>null</code> if a dm history ship agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency fetchByPrimaryKey(int id)
		throws SystemException {
		DmHistoryShipAgency dmHistoryShipAgency = (DmHistoryShipAgency)EntityCacheUtil.getResult(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryShipAgencyImpl.class, id);

		if (dmHistoryShipAgency == _nullDmHistoryShipAgency) {
			return null;
		}

		if (dmHistoryShipAgency == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryShipAgency = (DmHistoryShipAgency)session.get(DmHistoryShipAgencyImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryShipAgency != null) {
					cacheResult(dmHistoryShipAgency);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryShipAgencyModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryShipAgencyImpl.class, id,
						_nullDmHistoryShipAgency);
				}

				closeSession(session);
			}
		}

		return dmHistoryShipAgency;
	}

	/**
	 * Returns all the dm history ship agencies where shipAgencyCode = &#63;.
	 *
	 * @param shipAgencyCode the ship agency code
	 * @return the matching dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipAgency> findByShipAgencyCode(String shipAgencyCode)
		throws SystemException {
		return findByShipAgencyCode(shipAgencyCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history ship agencies where shipAgencyCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param start the lower bound of the range of dm history ship agencies
	 * @param end the upper bound of the range of dm history ship agencies (not inclusive)
	 * @return the range of matching dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipAgency> findByShipAgencyCode(
		String shipAgencyCode, int start, int end) throws SystemException {
		return findByShipAgencyCode(shipAgencyCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ship agencies where shipAgencyCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param start the lower bound of the range of dm history ship agencies
	 * @param end the upper bound of the range of dm history ship agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipAgency> findByShipAgencyCode(
		String shipAgencyCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPAGENCYCODE;
			finderArgs = new Object[] { shipAgencyCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPAGENCYCODE;
			finderArgs = new Object[] {
					shipAgencyCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryShipAgency> list = (List<DmHistoryShipAgency>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYSHIPAGENCY_WHERE);

			if (shipAgencyCode == null) {
				query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_1);
			}
			else {
				if (shipAgencyCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmHistoryShipAgencyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipAgencyCode != null) {
					qPos.add(shipAgencyCode);
				}

				list = (List<DmHistoryShipAgency>)QueryUtil.list(q,
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
	 * Returns the first dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history ship agency
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency findByShipAgencyCode_First(
		String shipAgencyCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryShipAgencyException, SystemException {
		List<DmHistoryShipAgency> list = findByShipAgencyCode(shipAgencyCode,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipAgencyCode=");
			msg.append(shipAgencyCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryShipAgencyException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history ship agency
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency findByShipAgencyCode_Last(
		String shipAgencyCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryShipAgencyException, SystemException {
		int count = countByShipAgencyCode(shipAgencyCode);

		List<DmHistoryShipAgency> list = findByShipAgencyCode(shipAgencyCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipAgencyCode=");
			msg.append(shipAgencyCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryShipAgencyException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history ship agencies before and after the current dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history ship agency
	 * @param shipAgencyCode the ship agency code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history ship agency
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency[] findByShipAgencyCode_PrevAndNext(int id,
		String shipAgencyCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryShipAgencyException, SystemException {
		DmHistoryShipAgency dmHistoryShipAgency = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryShipAgency[] array = new DmHistoryShipAgencyImpl[3];

			array[0] = getByShipAgencyCode_PrevAndNext(session,
					dmHistoryShipAgency, shipAgencyCode, orderByComparator, true);

			array[1] = dmHistoryShipAgency;

			array[2] = getByShipAgencyCode_PrevAndNext(session,
					dmHistoryShipAgency, shipAgencyCode, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryShipAgency getByShipAgencyCode_PrevAndNext(
		Session session, DmHistoryShipAgency dmHistoryShipAgency,
		String shipAgencyCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYSHIPAGENCY_WHERE);

		if (shipAgencyCode == null) {
			query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_1);
		}
		else {
			if (shipAgencyCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_2);
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
			query.append(DmHistoryShipAgencyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (shipAgencyCode != null) {
			qPos.add(shipAgencyCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryShipAgency);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryShipAgency> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException} if it could not be found.
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param syncVersion the sync version
	 * @return the matching dm history ship agency
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency findByShipAgencyCodeAndSyncVersion(
		String shipAgencyCode, String syncVersion)
		throws NoSuchDmHistoryShipAgencyException, SystemException {
		DmHistoryShipAgency dmHistoryShipAgency = fetchByShipAgencyCodeAndSyncVersion(shipAgencyCode,
				syncVersion);

		if (dmHistoryShipAgency == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipAgencyCode=");
			msg.append(shipAgencyCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryShipAgencyException(msg.toString());
		}

		return dmHistoryShipAgency;
	}

	/**
	 * Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param syncVersion the sync version
	 * @return the matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency fetchByShipAgencyCodeAndSyncVersion(
		String shipAgencyCode, String syncVersion) throws SystemException {
		return fetchByShipAgencyCodeAndSyncVersion(shipAgencyCode, syncVersion,
			true);
	}

	/**
	 * Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryShipAgency fetchByShipAgencyCodeAndSyncVersion(
		String shipAgencyCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { shipAgencyCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYSHIPAGENCY_WHERE);

			if (shipAgencyCode == null) {
				query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_1);
			}
			else {
				if (shipAgencyCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryShipAgencyModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipAgencyCode != null) {
					qPos.add(shipAgencyCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryShipAgency> list = q.list();

				result = list;

				DmHistoryShipAgency dmHistoryShipAgency = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryShipAgency = list.get(0);

					cacheResult(dmHistoryShipAgency);

					if ((dmHistoryShipAgency.getShipAgencyCode() == null) ||
							!dmHistoryShipAgency.getShipAgencyCode()
													.equals(shipAgencyCode) ||
							(dmHistoryShipAgency.getSyncVersion() == null) ||
							!dmHistoryShipAgency.getSyncVersion()
													.equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
							finderArgs, dmHistoryShipAgency);
					}
				}

				return dmHistoryShipAgency;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SHIPAGENCYCODEANDSYNCVERSION,
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
				return (DmHistoryShipAgency)result;
			}
		}
	}

	/**
	 * Returns all the dm history ship agencies.
	 *
	 * @return the dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipAgency> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history ship agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ship agencies
	 * @param end the upper bound of the range of dm history ship agencies (not inclusive)
	 * @return the range of dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipAgency> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ship agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ship agencies
	 * @param end the upper bound of the range of dm history ship agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryShipAgency> findAll(int start, int end,
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

		List<DmHistoryShipAgency> list = (List<DmHistoryShipAgency>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYSHIPAGENCY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYSHIPAGENCY.concat(DmHistoryShipAgencyModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryShipAgency>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryShipAgency>)QueryUtil.list(q,
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
	 * Removes all the dm history ship agencies where shipAgencyCode = &#63; from the database.
	 *
	 * @param shipAgencyCode the ship agency code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByShipAgencyCode(String shipAgencyCode)
		throws SystemException {
		for (DmHistoryShipAgency dmHistoryShipAgency : findByShipAgencyCode(
				shipAgencyCode)) {
			remove(dmHistoryShipAgency);
		}
	}

	/**
	 * Removes the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByShipAgencyCodeAndSyncVersion(String shipAgencyCode,
		String syncVersion)
		throws NoSuchDmHistoryShipAgencyException, SystemException {
		DmHistoryShipAgency dmHistoryShipAgency = findByShipAgencyCodeAndSyncVersion(shipAgencyCode,
				syncVersion);

		remove(dmHistoryShipAgency);
	}

	/**
	 * Removes all the dm history ship agencies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryShipAgency dmHistoryShipAgency : findAll()) {
			remove(dmHistoryShipAgency);
		}
	}

	/**
	 * Returns the number of dm history ship agencies where shipAgencyCode = &#63;.
	 *
	 * @param shipAgencyCode the ship agency code
	 * @return the number of matching dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public int countByShipAgencyCode(String shipAgencyCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { shipAgencyCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SHIPAGENCYCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYSHIPAGENCY_WHERE);

			if (shipAgencyCode == null) {
				query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_1);
			}
			else {
				if (shipAgencyCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipAgencyCode != null) {
					qPos.add(shipAgencyCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SHIPAGENCYCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history ship agencies where shipAgencyCode = &#63; and syncVersion = &#63;.
	 *
	 * @param shipAgencyCode the ship agency code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public int countByShipAgencyCodeAndSyncVersion(String shipAgencyCode,
		String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { shipAgencyCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SHIPAGENCYCODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYSHIPAGENCY_WHERE);

			if (shipAgencyCode == null) {
				query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_1);
			}
			else {
				if (shipAgencyCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipAgencyCode != null) {
					qPos.add(shipAgencyCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SHIPAGENCYCODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history ship agencies.
	 *
	 * @return the number of dm history ship agencies
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYSHIPAGENCY);

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
	 * Initializes the dm history ship agency persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryShipAgency")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryShipAgency>> listenersList = new ArrayList<ModelListener<DmHistoryShipAgency>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryShipAgency>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryShipAgencyImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYSHIPAGENCY = "SELECT dmHistoryShipAgency FROM DmHistoryShipAgency dmHistoryShipAgency";
	private static final String _SQL_SELECT_DMHISTORYSHIPAGENCY_WHERE = "SELECT dmHistoryShipAgency FROM DmHistoryShipAgency dmHistoryShipAgency WHERE ";
	private static final String _SQL_COUNT_DMHISTORYSHIPAGENCY = "SELECT COUNT(dmHistoryShipAgency) FROM DmHistoryShipAgency dmHistoryShipAgency";
	private static final String _SQL_COUNT_DMHISTORYSHIPAGENCY_WHERE = "SELECT COUNT(dmHistoryShipAgency) FROM DmHistoryShipAgency dmHistoryShipAgency WHERE ";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_1 = "dmHistoryShipAgency.shipAgencyCode IS NULL";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_2 = "dmHistoryShipAgency.shipAgencyCode = ?";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODE_SHIPAGENCYCODE_3 = "(dmHistoryShipAgency.shipAgencyCode IS NULL OR dmHistoryShipAgency.shipAgencyCode = ?)";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_1 =
		"dmHistoryShipAgency.shipAgencyCode IS NULL AND ";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_2 =
		"dmHistoryShipAgency.shipAgencyCode = ? AND ";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SHIPAGENCYCODE_3 =
		"(dmHistoryShipAgency.shipAgencyCode IS NULL OR dmHistoryShipAgency.shipAgencyCode = ?) AND ";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryShipAgency.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryShipAgency.syncVersion = ?";
	private static final String _FINDER_COLUMN_SHIPAGENCYCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryShipAgency.syncVersion IS NULL OR dmHistoryShipAgency.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryShipAgency.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryShipAgency exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryShipAgency exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryShipAgencyPersistenceImpl.class);
	private static DmHistoryShipAgency _nullDmHistoryShipAgency = new DmHistoryShipAgencyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryShipAgency> toCacheModel() {
				return _nullDmHistoryShipAgencyCacheModel;
			}
		};

	private static CacheModel<DmHistoryShipAgency> _nullDmHistoryShipAgencyCacheModel =
		new CacheModel<DmHistoryShipAgency>() {
			public DmHistoryShipAgency toEntityModel() {
				return _nullDmHistoryShipAgency;
			}
		};
}