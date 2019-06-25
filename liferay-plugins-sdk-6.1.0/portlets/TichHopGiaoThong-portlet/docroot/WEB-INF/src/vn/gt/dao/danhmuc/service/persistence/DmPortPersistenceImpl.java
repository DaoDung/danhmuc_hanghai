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

import vn.gt.dao.danhmuc.NoSuchDmPortException;
import vn.gt.dao.danhmuc.model.DmPort;
import vn.gt.dao.danhmuc.model.impl.DmPortImpl;
import vn.gt.dao.danhmuc.model.impl.DmPortModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmPortPersistence
 * @see DmPortUtil
 * @generated
 */
public class DmPortPersistenceImpl extends BasePersistenceImpl<DmPort>
	implements DmPortPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmPortUtil} to access the dm port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmPortImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE =
		new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortCode",
			new String[] { String.class.getName() },
			DmPortModelImpl.PORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLoCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE =
		new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLoCode",
			new String[] { String.class.getName() },
			DmPortModelImpl.LOCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLoCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATECODEANDCITYCODE =
		new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByStateCodeAndCityCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODEANDCITYCODE =
		new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByStateCodeAndCityCode",
			new String[] { String.class.getName(), String.class.getName() },
			DmPortModelImpl.STATECODE_COLUMN_BITMASK |
			DmPortModelImpl.CITYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATECODEANDCITYCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByStateCodeAndCityCode",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_PORTCODELOCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByPortCodeLoCode",
			new String[] { String.class.getName(), String.class.getName() },
			DmPortModelImpl.PORTCODE_COLUMN_BITMASK |
			DmPortModelImpl.LOCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODELOCODE = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCodeLoCode",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, DmPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm port in the entity cache if it is enabled.
	 *
	 * @param dmPort the dm port
	 */
	public void cacheResult(DmPort dmPort) {
		EntityCacheUtil.putResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortImpl.class, dmPort.getPrimaryKey(), dmPort);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
			new Object[] { dmPort.getPortCode(), dmPort.getLoCode() }, dmPort);

		dmPort.resetOriginalValues();
	}

	/**
	 * Caches the dm ports in the entity cache if it is enabled.
	 *
	 * @param dmPorts the dm ports
	 */
	public void cacheResult(List<DmPort> dmPorts) {
		for (DmPort dmPort : dmPorts) {
			if (EntityCacheUtil.getResult(
						DmPortModelImpl.ENTITY_CACHE_ENABLED, DmPortImpl.class,
						dmPort.getPrimaryKey()) == null) {
				cacheResult(dmPort);
			}
			else {
				dmPort.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm ports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmPortImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmPortImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm port.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmPort dmPort) {
		EntityCacheUtil.removeResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortImpl.class, dmPort.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmPort);
	}

	@Override
	public void clearCache(List<DmPort> dmPorts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmPort dmPort : dmPorts) {
			EntityCacheUtil.removeResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
				DmPortImpl.class, dmPort.getPrimaryKey());

			clearUniqueFindersCache(dmPort);
		}
	}

	protected void clearUniqueFindersCache(DmPort dmPort) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
			new Object[] { dmPort.getPortCode(), dmPort.getLoCode() });
	}

	/**
	 * Creates a new dm port with the primary key. Does not add the dm port to the database.
	 *
	 * @param id the primary key for the new dm port
	 * @return the new dm port
	 */
	public DmPort create(int id) {
		DmPort dmPort = new DmPortImpl();

		dmPort.setNew(true);
		dmPort.setPrimaryKey(id);

		return dmPort;
	}

	/**
	 * Removes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm port
	 * @return the dm port that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort remove(int id) throws NoSuchDmPortException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm port
	 * @return the dm port that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort remove(Serializable primaryKey)
		throws NoSuchDmPortException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmPort dmPort = (DmPort)session.get(DmPortImpl.class, primaryKey);

			if (dmPort == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmPort);
		}
		catch (NoSuchDmPortException nsee) {
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
	protected DmPort removeImpl(DmPort dmPort) throws SystemException {
		dmPort = toUnwrappedModel(dmPort);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmPort);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmPort);

		return dmPort;
	}

	@Override
	public DmPort updateImpl(vn.gt.dao.danhmuc.model.DmPort dmPort,
		boolean merge) throws SystemException {
		dmPort = toUnwrappedModel(dmPort);

		boolean isNew = dmPort.isNew();

		DmPortModelImpl dmPortModelImpl = (DmPortModelImpl)dmPort;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmPort, merge);

			dmPort.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmPortModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortModelImpl.getOriginalPortCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);

				args = new Object[] { dmPortModelImpl.getPortCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);
			}

			if ((dmPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmPortModelImpl.getOriginalLoCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE,
					args);

				args = new Object[] { dmPortModelImpl.getLoCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE,
					args);
			}

			if ((dmPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODEANDCITYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortModelImpl.getOriginalStateCode(),
						
						dmPortModelImpl.getOriginalCitycode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATECODEANDCITYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODEANDCITYCODE,
					args);

				args = new Object[] {
						dmPortModelImpl.getStateCode(),
						
						dmPortModelImpl.getCitycode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATECODEANDCITYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODEANDCITYCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
			DmPortImpl.class, dmPort.getPrimaryKey(), dmPort);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
				new Object[] { dmPort.getPortCode(), dmPort.getLoCode() },
				dmPort);
		}
		else {
			if ((dmPortModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PORTCODELOCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortModelImpl.getOriginalPortCode(),
						
						dmPortModelImpl.getOriginalLoCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODELOCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
					new Object[] { dmPort.getPortCode(), dmPort.getLoCode() },
					dmPort);
			}
		}

		return dmPort;
	}

	protected DmPort toUnwrappedModel(DmPort dmPort) {
		if (dmPort instanceof DmPortImpl) {
			return dmPort;
		}

		DmPortImpl dmPortImpl = new DmPortImpl();

		dmPortImpl.setNew(dmPort.isNew());
		dmPortImpl.setPrimaryKey(dmPort.getPrimaryKey());

		dmPortImpl.setId(dmPort.getId());
		dmPortImpl.setPortCode(dmPort.getPortCode());
		dmPortImpl.setLoCode(dmPort.getLoCode());
		dmPortImpl.setPortName(dmPort.getPortName());
		dmPortImpl.setFullName(dmPort.getFullName());
		dmPortImpl.setFullNameVN(dmPort.getFullNameVN());
		dmPortImpl.setPortType(dmPort.getPortType());
		dmPortImpl.setPortOrder(dmPort.getPortOrder());
		dmPortImpl.setAddress(dmPort.getAddress());
		dmPortImpl.setAddressVN(dmPort.getAddressVN());
		dmPortImpl.setStateCode(dmPort.getStateCode());
		dmPortImpl.setCitycode(dmPort.getCitycode());
		dmPortImpl.setIsDelete(dmPort.getIsDelete());
		dmPortImpl.setMarkedAsDelete(dmPort.getMarkedAsDelete());
		dmPortImpl.setModifiedDate(dmPort.getModifiedDate());
		dmPortImpl.setRequestedDate(dmPort.getRequestedDate());
		dmPortImpl.setSyncVersion(dmPort.getSyncVersion());

		return dmPortImpl;
	}

	/**
	 * Returns the dm port with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port
	 * @return the dm port
	 * @throws com.liferay.portal.NoSuchModelException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm port with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortException} if it could not be found.
	 *
	 * @param id the primary key of the dm port
	 * @return the dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort findByPrimaryKey(int id)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = fetchByPrimaryKey(id);

		if (dmPort == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmPort;
	}

	/**
	 * Returns the dm port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port
	 * @return the dm port, or <code>null</code> if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPort fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm port
	 * @return the dm port, or <code>null</code> if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort fetchByPrimaryKey(int id) throws SystemException {
		DmPort dmPort = (DmPort)EntityCacheUtil.getResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
				DmPortImpl.class, id);

		if (dmPort == _nullDmPort) {
			return null;
		}

		if (dmPort == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmPort = (DmPort)session.get(DmPortImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmPort != null) {
					cacheResult(dmPort);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmPortModelImpl.ENTITY_CACHE_ENABLED,
						DmPortImpl.class, id, _nullDmPort);
				}

				closeSession(session);
			}
		}

		return dmPort;
	}

	/**
	 * Returns all the dm ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByPortCode(String portCode)
		throws SystemException {
		return findByPortCode(portCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @return the range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByPortCode(String portCode, int start, int end)
		throws SystemException {
		return findByPortCode(portCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByPortCode(String portCode, int start, int end,
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

		List<DmPort> list = (List<DmPort>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMPORT_WHERE);

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
				query.append(DmPortModelImpl.ORDER_BY_JPQL);
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

				list = (List<DmPort>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first dm port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort findByPortCode_First(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		List<DmPort> list = findByPortCode(portCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort findByPortCode_Last(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		int count = countByPortCode(portCode);

		List<DmPort> list = findByPortCode(portCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm ports before and after the current dm port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm port
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort[] findByPortCode_PrevAndNext(int id, String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPort[] array = new DmPortImpl[3];

			array[0] = getByPortCode_PrevAndNext(session, dmPort, portCode,
					orderByComparator, true);

			array[1] = dmPort;

			array[2] = getByPortCode_PrevAndNext(session, dmPort, portCode,
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

	protected DmPort getByPortCode_PrevAndNext(Session session, DmPort dmPort,
		String portCode, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORT_WHERE);

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
			query.append(DmPortModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm ports where loCode = &#63;.
	 *
	 * @param loCode the lo code
	 * @return the matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByLoCode(String loCode) throws SystemException {
		return findByLoCode(loCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ports where loCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param loCode the lo code
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @return the range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByLoCode(String loCode, int start, int end)
		throws SystemException {
		return findByLoCode(loCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ports where loCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param loCode the lo code
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByLoCode(String loCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCODE;
			finderArgs = new Object[] { loCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCODE;
			finderArgs = new Object[] { loCode, start, end, orderByComparator };
		}

		List<DmPort> list = (List<DmPort>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMPORT_WHERE);

			if (loCode == null) {
				query.append(_FINDER_COLUMN_LOCODE_LOCODE_1);
			}
			else {
				if (loCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LOCODE_LOCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LOCODE_LOCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmPortModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (loCode != null) {
					qPos.add(loCode);
				}

				list = (List<DmPort>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first dm port in the ordered set where loCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param loCode the lo code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort findByLoCode_First(String loCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		List<DmPort> list = findByLoCode(loCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("loCode=");
			msg.append(loCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm port in the ordered set where loCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param loCode the lo code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort findByLoCode_Last(String loCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		int count = countByLoCode(loCode);

		List<DmPort> list = findByLoCode(loCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("loCode=");
			msg.append(loCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm ports before and after the current dm port in the ordered set where loCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm port
	 * @param loCode the lo code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort[] findByLoCode_PrevAndNext(int id, String loCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPort[] array = new DmPortImpl[3];

			array[0] = getByLoCode_PrevAndNext(session, dmPort, loCode,
					orderByComparator, true);

			array[1] = dmPort;

			array[2] = getByLoCode_PrevAndNext(session, dmPort, loCode,
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

	protected DmPort getByLoCode_PrevAndNext(Session session, DmPort dmPort,
		String loCode, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORT_WHERE);

		if (loCode == null) {
			query.append(_FINDER_COLUMN_LOCODE_LOCODE_1);
		}
		else {
			if (loCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCODE_LOCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_LOCODE_LOCODE_2);
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
			query.append(DmPortModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (loCode != null) {
			qPos.add(loCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm ports where stateCode = &#63; and citycode = &#63;.
	 *
	 * @param stateCode the state code
	 * @param citycode the citycode
	 * @return the matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByStateCodeAndCityCode(String stateCode,
		String citycode) throws SystemException {
		return findByStateCodeAndCityCode(stateCode, citycode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ports where stateCode = &#63; and citycode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param citycode the citycode
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @return the range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByStateCodeAndCityCode(String stateCode,
		String citycode, int start, int end) throws SystemException {
		return findByStateCodeAndCityCode(stateCode, citycode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ports where stateCode = &#63; and citycode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param citycode the citycode
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findByStateCodeAndCityCode(String stateCode,
		String citycode, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATECODEANDCITYCODE;
			finderArgs = new Object[] { stateCode, citycode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATECODEANDCITYCODE;
			finderArgs = new Object[] {
					stateCode, citycode,
					
					start, end, orderByComparator
				};
		}

		List<DmPort> list = (List<DmPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DMPORT_WHERE);

			if (stateCode == null) {
				query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_1);
			}
			else {
				if (stateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_2);
				}
			}

			if (citycode == null) {
				query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_1);
			}
			else {
				if (citycode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmPortModelImpl.ORDER_BY_JPQL);
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

				if (citycode != null) {
					qPos.add(citycode);
				}

				list = (List<DmPort>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first dm port in the ordered set where stateCode = &#63; and citycode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param citycode the citycode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort findByStateCodeAndCityCode_First(String stateCode,
		String citycode, OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		List<DmPort> list = findByStateCodeAndCityCode(stateCode, citycode, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("stateCode=");
			msg.append(stateCode);

			msg.append(", citycode=");
			msg.append(citycode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm port in the ordered set where stateCode = &#63; and citycode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param stateCode the state code
	 * @param citycode the citycode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort findByStateCodeAndCityCode_Last(String stateCode,
		String citycode, OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		int count = countByStateCodeAndCityCode(stateCode, citycode);

		List<DmPort> list = findByStateCodeAndCityCode(stateCode, citycode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("stateCode=");
			msg.append(stateCode);

			msg.append(", citycode=");
			msg.append(citycode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm ports before and after the current dm port in the ordered set where stateCode = &#63; and citycode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm port
	 * @param stateCode the state code
	 * @param citycode the citycode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort[] findByStateCodeAndCityCode_PrevAndNext(int id,
		String stateCode, String citycode, OrderByComparator orderByComparator)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPort[] array = new DmPortImpl[3];

			array[0] = getByStateCodeAndCityCode_PrevAndNext(session, dmPort,
					stateCode, citycode, orderByComparator, true);

			array[1] = dmPort;

			array[2] = getByStateCodeAndCityCode_PrevAndNext(session, dmPort,
					stateCode, citycode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPort getByStateCodeAndCityCode_PrevAndNext(Session session,
		DmPort dmPort, String stateCode, String citycode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORT_WHERE);

		if (stateCode == null) {
			query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_1);
		}
		else {
			if (stateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_2);
			}
		}

		if (citycode == null) {
			query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_1);
		}
		else {
			if (citycode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_2);
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
			query.append(DmPortModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (stateCode != null) {
			qPos.add(stateCode);
		}

		if (citycode != null) {
			qPos.add(citycode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm port where portCode = &#63; and loCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortException} if it could not be found.
	 *
	 * @param portCode the port code
	 * @param loCode the lo code
	 * @return the matching dm port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort findByPortCodeLoCode(String portCode, String loCode)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = fetchByPortCodeLoCode(portCode, loCode);

		if (dmPort == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(", loCode=");
			msg.append(loCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmPortException(msg.toString());
		}

		return dmPort;
	}

	/**
	 * Returns the dm port where portCode = &#63; and loCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portCode the port code
	 * @param loCode the lo code
	 * @return the matching dm port, or <code>null</code> if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort fetchByPortCodeLoCode(String portCode, String loCode)
		throws SystemException {
		return fetchByPortCodeLoCode(portCode, loCode, true);
	}

	/**
	 * Returns the dm port where portCode = &#63; and loCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portCode the port code
	 * @param loCode the lo code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm port, or <code>null</code> if a matching dm port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmPort fetchByPortCodeLoCode(String portCode, String loCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { portCode, loCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMPORT_WHERE);

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODELOCODE_PORTCODE_1);
			}
			else {
				if (portCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODELOCODE_PORTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODELOCODE_PORTCODE_2);
				}
			}

			if (loCode == null) {
				query.append(_FINDER_COLUMN_PORTCODELOCODE_LOCODE_1);
			}
			else {
				if (loCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODELOCODE_LOCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODELOCODE_LOCODE_2);
				}
			}

			query.append(DmPortModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portCode != null) {
					qPos.add(portCode);
				}

				if (loCode != null) {
					qPos.add(loCode);
				}

				List<DmPort> list = q.list();

				result = list;

				DmPort dmPort = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
						finderArgs, list);
				}
				else {
					dmPort = list.get(0);

					cacheResult(dmPort);

					if ((dmPort.getPortCode() == null) ||
							!dmPort.getPortCode().equals(portCode) ||
							(dmPort.getLoCode() == null) ||
							!dmPort.getLoCode().equals(loCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
							finderArgs, dmPort);
					}
				}

				return dmPort;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODELOCODE,
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
				return (DmPort)result;
			}
		}
	}

	/**
	 * Returns all the dm ports.
	 *
	 * @return the dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @return the range of dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ports
	 * @param end the upper bound of the range of dm ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmPort> findAll(int start, int end,
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

		List<DmPort> list = (List<DmPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMPORT.concat(DmPortModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmPort>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmPort>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the dm ports where portCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortCode(String portCode) throws SystemException {
		for (DmPort dmPort : findByPortCode(portCode)) {
			remove(dmPort);
		}
	}

	/**
	 * Removes all the dm ports where loCode = &#63; from the database.
	 *
	 * @param loCode the lo code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByLoCode(String loCode) throws SystemException {
		for (DmPort dmPort : findByLoCode(loCode)) {
			remove(dmPort);
		}
	}

	/**
	 * Removes all the dm ports where stateCode = &#63; and citycode = &#63; from the database.
	 *
	 * @param stateCode the state code
	 * @param citycode the citycode
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStateCodeAndCityCode(String stateCode, String citycode)
		throws SystemException {
		for (DmPort dmPort : findByStateCodeAndCityCode(stateCode, citycode)) {
			remove(dmPort);
		}
	}

	/**
	 * Removes the dm port where portCode = &#63; and loCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @param loCode the lo code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortCodeLoCode(String portCode, String loCode)
		throws NoSuchDmPortException, SystemException {
		DmPort dmPort = findByPortCodeLoCode(portCode, loCode);

		remove(dmPort);
	}

	/**
	 * Removes all the dm ports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmPort dmPort : findAll()) {
			remove(dmPort);
		}
	}

	/**
	 * Returns the number of dm ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the number of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortCode(String portCode) throws SystemException {
		Object[] finderArgs = new Object[] { portCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMPORT_WHERE);

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
	 * Returns the number of dm ports where loCode = &#63;.
	 *
	 * @param loCode the lo code
	 * @return the number of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countByLoCode(String loCode) throws SystemException {
		Object[] finderArgs = new Object[] { loCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_LOCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMPORT_WHERE);

			if (loCode == null) {
				query.append(_FINDER_COLUMN_LOCODE_LOCODE_1);
			}
			else {
				if (loCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LOCODE_LOCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LOCODE_LOCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (loCode != null) {
					qPos.add(loCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LOCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm ports where stateCode = &#63; and citycode = &#63;.
	 *
	 * @param stateCode the state code
	 * @param citycode the citycode
	 * @return the number of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStateCodeAndCityCode(String stateCode, String citycode)
		throws SystemException {
		Object[] finderArgs = new Object[] { stateCode, citycode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATECODEANDCITYCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMPORT_WHERE);

			if (stateCode == null) {
				query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_1);
			}
			else {
				if (stateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_2);
				}
			}

			if (citycode == null) {
				query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_1);
			}
			else {
				if (citycode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_2);
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

				if (citycode != null) {
					qPos.add(citycode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATECODEANDCITYCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm ports where portCode = &#63; and loCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param loCode the lo code
	 * @return the number of matching dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortCodeLoCode(String portCode, String loCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { portCode, loCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTCODELOCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMPORT_WHERE);

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODELOCODE_PORTCODE_1);
			}
			else {
				if (portCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODELOCODE_PORTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODELOCODE_PORTCODE_2);
				}
			}

			if (loCode == null) {
				query.append(_FINDER_COLUMN_PORTCODELOCODE_LOCODE_1);
			}
			else {
				if (loCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODELOCODE_LOCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODELOCODE_LOCODE_2);
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

				if (loCode != null) {
					qPos.add(loCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTCODELOCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm ports.
	 *
	 * @return the number of dm ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMPORT);

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
	 * Initializes the dm port persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmPort")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmPort>> listenersList = new ArrayList<ModelListener<DmPort>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmPort>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmPortImpl.class.getName());
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
	private static final String _SQL_SELECT_DMPORT = "SELECT dmPort FROM DmPort dmPort";
	private static final String _SQL_SELECT_DMPORT_WHERE = "SELECT dmPort FROM DmPort dmPort WHERE ";
	private static final String _SQL_COUNT_DMPORT = "SELECT COUNT(dmPort) FROM DmPort dmPort";
	private static final String _SQL_COUNT_DMPORT_WHERE = "SELECT COUNT(dmPort) FROM DmPort dmPort WHERE ";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_1 = "dmPort.portCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_2 = "dmPort.portCode = ?";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_3 = "(dmPort.portCode IS NULL OR dmPort.portCode = ?)";
	private static final String _FINDER_COLUMN_LOCODE_LOCODE_1 = "dmPort.loCode IS NULL";
	private static final String _FINDER_COLUMN_LOCODE_LOCODE_2 = "dmPort.loCode = ?";
	private static final String _FINDER_COLUMN_LOCODE_LOCODE_3 = "(dmPort.loCode IS NULL OR dmPort.loCode = ?)";
	private static final String _FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_1 = "dmPort.stateCode IS NULL AND ";
	private static final String _FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_2 = "dmPort.stateCode = ? AND ";
	private static final String _FINDER_COLUMN_STATECODEANDCITYCODE_STATECODE_3 = "(dmPort.stateCode IS NULL OR dmPort.stateCode = ?) AND ";
	private static final String _FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_1 = "dmPort.citycode IS NULL";
	private static final String _FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_2 = "dmPort.citycode = ?";
	private static final String _FINDER_COLUMN_STATECODEANDCITYCODE_CITYCODE_3 = "(dmPort.citycode IS NULL OR dmPort.citycode = ?)";
	private static final String _FINDER_COLUMN_PORTCODELOCODE_PORTCODE_1 = "dmPort.portCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTCODELOCODE_PORTCODE_2 = "dmPort.portCode = ? AND ";
	private static final String _FINDER_COLUMN_PORTCODELOCODE_PORTCODE_3 = "(dmPort.portCode IS NULL OR dmPort.portCode = ?) AND ";
	private static final String _FINDER_COLUMN_PORTCODELOCODE_LOCODE_1 = "dmPort.loCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODELOCODE_LOCODE_2 = "dmPort.loCode = ?";
	private static final String _FINDER_COLUMN_PORTCODELOCODE_LOCODE_3 = "(dmPort.loCode IS NULL OR dmPort.loCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmPort.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmPort exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmPort exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmPortPersistenceImpl.class);
	private static DmPort _nullDmPort = new DmPortImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmPort> toCacheModel() {
				return _nullDmPortCacheModel;
			}
		};

	private static CacheModel<DmPort> _nullDmPortCacheModel = new CacheModel<DmPort>() {
			public DmPort toEntityModel() {
				return _nullDmPort;
			}
		};
}