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

import vn.gt.dao.danhmuc.NoSuchDmHistoryPortException;
import vn.gt.dao.danhmuc.model.DmHistoryPort;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPortImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryPortModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPortPersistence
 * @see DmHistoryPortUtil
 * @generated
 */
public class DmHistoryPortPersistenceImpl extends BasePersistenceImpl<DmHistoryPort>
	implements DmHistoryPortPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryPortUtil} to access the dm history port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryPortImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPortCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE =
		new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPortCode", new String[] { String.class.getName() },
			DmHistoryPortModelImpl.PORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODE = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPortCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryPortModelImpl.PORTCODE_COLUMN_BITMASK |
			DmHistoryPortModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPortCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history port in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPort the dm history port
	 */
	public void cacheResult(DmHistoryPort dmHistoryPort) {
		EntityCacheUtil.putResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey(),
			dmHistoryPort);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPort.getPortCode(),
				
			dmHistoryPort.getSyncVersion()
			}, dmHistoryPort);

		dmHistoryPort.resetOriginalValues();
	}

	/**
	 * Caches the dm history ports in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPorts the dm history ports
	 */
	public void cacheResult(List<DmHistoryPort> dmHistoryPorts) {
		for (DmHistoryPort dmHistoryPort : dmHistoryPorts) {
			if (EntityCacheUtil.getResult(
						DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey()) == null) {
				cacheResult(dmHistoryPort);
			}
			else {
				dmHistoryPort.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history ports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryPortImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryPortImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history port.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryPort dmHistoryPort) {
		EntityCacheUtil.removeResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPort.getPortCode(),
				
			dmHistoryPort.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history port with the primary key. Does not add the dm history port to the database.
	 *
	 * @param id the primary key for the new dm history port
	 * @return the new dm history port
	 */
	public DmHistoryPort create(int id) {
		DmHistoryPort dmHistoryPort = new DmHistoryPortImpl();

		dmHistoryPort.setNew(true);
		dmHistoryPort.setPrimaryKey(id);

		return dmHistoryPort;
	}

	/**
	 * Removes the dm history port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history port
	 * @return the dm history port that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm history port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history port
	 * @return the dm history port that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort remove(int id)
		throws NoSuchDmHistoryPortException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryPort dmHistoryPort = (DmHistoryPort)session.get(DmHistoryPortImpl.class,
					Integer.valueOf(id));

			if (dmHistoryPort == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmHistoryPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmHistoryPortPersistence.remove(dmHistoryPort);
		}
		catch (NoSuchDmHistoryPortException nsee) {
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
	 * Removes the dm history port from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmHistoryPort the dm history port
	 * @return the dm history port that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort remove(DmHistoryPort dmHistoryPort)
		throws SystemException {
		return super.remove(dmHistoryPort);
	}

	@Override
	protected DmHistoryPort removeImpl(DmHistoryPort dmHistoryPort)
		throws SystemException {
		dmHistoryPort = toUnwrappedModel(dmHistoryPort);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryPort);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmHistoryPortModelImpl dmHistoryPortModelImpl = (DmHistoryPortModelImpl)dmHistoryPort;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPortModelImpl.getPortCode(),
				
			dmHistoryPortModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey());

		return dmHistoryPort;
	}

	@Override
	public DmHistoryPort updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPort dmHistoryPort, boolean merge)
		throws SystemException {
		dmHistoryPort = toUnwrappedModel(dmHistoryPort);

		boolean isNew = dmHistoryPort.isNew();

		DmHistoryPortModelImpl dmHistoryPortModelImpl = (DmHistoryPortModelImpl)dmHistoryPort;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryPort, merge);

			dmHistoryPort.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryPortModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortModelImpl.getOriginalPortCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);

				args = new Object[] { dmHistoryPortModelImpl.getPortCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortImpl.class, dmHistoryPort.getPrimaryKey(),
			dmHistoryPort);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
				new Object[] {
					dmHistoryPort.getPortCode(),
					
				dmHistoryPort.getSyncVersion()
				}, dmHistoryPort);
		}
		else {
			if ((dmHistoryPortModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortModelImpl.getOriginalPortCode(),
						
						dmHistoryPortModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
					new Object[] {
						dmHistoryPort.getPortCode(),
						
					dmHistoryPort.getSyncVersion()
					}, dmHistoryPort);
			}
		}

		return dmHistoryPort;
	}

	protected DmHistoryPort toUnwrappedModel(DmHistoryPort dmHistoryPort) {
		if (dmHistoryPort instanceof DmHistoryPortImpl) {
			return dmHistoryPort;
		}

		DmHistoryPortImpl dmHistoryPortImpl = new DmHistoryPortImpl();

		dmHistoryPortImpl.setNew(dmHistoryPort.isNew());
		dmHistoryPortImpl.setPrimaryKey(dmHistoryPort.getPrimaryKey());

		dmHistoryPortImpl.setId(dmHistoryPort.getId());
		dmHistoryPortImpl.setPortCode(dmHistoryPort.getPortCode());
		dmHistoryPortImpl.setLoCode(dmHistoryPort.getLoCode());
		dmHistoryPortImpl.setPortName(dmHistoryPort.getPortName());
		dmHistoryPortImpl.setFullName(dmHistoryPort.getFullName());
		dmHistoryPortImpl.setFullNameVN(dmHistoryPort.getFullNameVN());
		dmHistoryPortImpl.setPortType(dmHistoryPort.getPortType());
		dmHistoryPortImpl.setPortOrder(dmHistoryPort.getPortOrder());
		dmHistoryPortImpl.setAddress(dmHistoryPort.getAddress());
		dmHistoryPortImpl.setAddressVN(dmHistoryPort.getAddressVN());
		dmHistoryPortImpl.setStateCode(dmHistoryPort.getStateCode());
		dmHistoryPortImpl.setCitycode(dmHistoryPort.getCitycode());
		dmHistoryPortImpl.setIsDelete(dmHistoryPort.getIsDelete());
		dmHistoryPortImpl.setMarkedAsDelete(dmHistoryPort.getMarkedAsDelete());
		dmHistoryPortImpl.setModifiedDate(dmHistoryPort.getModifiedDate());
		dmHistoryPortImpl.setRequestedDate(dmHistoryPort.getRequestedDate());
		dmHistoryPortImpl.setSyncVersion(dmHistoryPort.getSyncVersion());

		return dmHistoryPortImpl;
	}

	/**
	 * Returns the dm history port with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port
	 * @return the dm history port
	 * @throws com.liferay.portal.NoSuchModelException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history port with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortException} if it could not be found.
	 *
	 * @param id the primary key of the dm history port
	 * @return the dm history port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort findByPrimaryKey(int id)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = fetchByPrimaryKey(id);

		if (dmHistoryPort == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryPort;
	}

	/**
	 * Returns the dm history port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port
	 * @return the dm history port, or <code>null</code> if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPort fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history port
	 * @return the dm history port, or <code>null</code> if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort fetchByPrimaryKey(int id) throws SystemException {
		DmHistoryPort dmHistoryPort = (DmHistoryPort)EntityCacheUtil.getResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPortImpl.class, id);

		if (dmHistoryPort == _nullDmHistoryPort) {
			return null;
		}

		if (dmHistoryPort == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryPort = (DmHistoryPort)session.get(DmHistoryPortImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryPort != null) {
					cacheResult(dmHistoryPort);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryPortModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortImpl.class, id, _nullDmHistoryPort);
				}

				closeSession(session);
			}
		}

		return dmHistoryPort;
	}

	/**
	 * Returns all the dm history ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPort> findByPortCode(String portCode)
		throws SystemException {
		return findByPortCode(portCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm history ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm history ports
	 * @param end the upper bound of the range of dm history ports (not inclusive)
	 * @return the range of matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPort> findByPortCode(String portCode, int start,
		int end) throws SystemException {
		return findByPortCode(portCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of dm history ports
	 * @param end the upper bound of the range of dm history ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPort> findByPortCode(String portCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<DmHistoryPort> list = (List<DmHistoryPort>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYPORT_WHERE);

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
				query.append(DmHistoryPortModelImpl.ORDER_BY_JPQL);
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

				list = (List<DmHistoryPort>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm history port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortException if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort findByPortCode_First(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortException, SystemException {
		List<DmHistoryPort> list = findByPortCode(portCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortException if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort findByPortCode_Last(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortException, SystemException {
		int count = countByPortCode(portCode);

		List<DmHistoryPort> list = findByPortCode(portCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryPortException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history ports before and after the current dm history port in the ordered set where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history port
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort[] findByPortCode_PrevAndNext(int id, String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPort[] array = new DmHistoryPortImpl[3];

			array[0] = getByPortCode_PrevAndNext(session, dmHistoryPort,
					portCode, orderByComparator, true);

			array[1] = dmHistoryPort;

			array[2] = getByPortCode_PrevAndNext(session, dmHistoryPort,
					portCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryPort getByPortCode_PrevAndNext(Session session,
		DmHistoryPort dmHistoryPort, String portCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYPORT_WHERE);

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
			query.append(DmHistoryPortModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history port where portCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortException} if it could not be found.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @return the matching dm history port
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortException if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort findByPortCodeAndSyncVersion(String portCode,
		String syncVersion)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = fetchByPortCodeAndSyncVersion(portCode,
				syncVersion);

		if (dmHistoryPort == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portCode=");
			msg.append(portCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryPortException(msg.toString());
		}

		return dmHistoryPort;
	}

	/**
	 * Returns the dm history port where portCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @return the matching dm history port, or <code>null</code> if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort fetchByPortCodeAndSyncVersion(String portCode,
		String syncVersion) throws SystemException {
		return fetchByPortCodeAndSyncVersion(portCode, syncVersion, true);
	}

	/**
	 * Returns the dm history port where portCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history port, or <code>null</code> if a matching dm history port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryPort fetchByPortCodeAndSyncVersion(String portCode,
		String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { portCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYPORT_WHERE);

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_1);
			}
			else {
				if (portCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryPortModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portCode != null) {
					qPos.add(portCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryPort> list = q.list();

				result = list;

				DmHistoryPort dmHistoryPort = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryPort = list.get(0);

					cacheResult(dmHistoryPort);

					if ((dmHistoryPort.getPortCode() == null) ||
							!dmHistoryPort.getPortCode().equals(portCode) ||
							(dmHistoryPort.getSyncVersion() == null) ||
							!dmHistoryPort.getSyncVersion().equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
							finderArgs, dmHistoryPort);
					}
				}

				return dmHistoryPort;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTCODEANDSYNCVERSION,
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
				return (DmHistoryPort)result;
			}
		}
	}

	/**
	 * Returns all the dm history ports.
	 *
	 * @return the dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPort> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ports
	 * @param end the upper bound of the range of dm history ports (not inclusive)
	 * @return the range of dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPort> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history ports
	 * @param end the upper bound of the range of dm history ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryPort> findAll(int start, int end,
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

		List<DmHistoryPort> list = (List<DmHistoryPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYPORT.concat(DmHistoryPortModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryPort>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryPort>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm history ports where portCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortCode(String portCode) throws SystemException {
		for (DmHistoryPort dmHistoryPort : findByPortCode(portCode)) {
			dmHistoryPortPersistence.remove(dmHistoryPort);
		}
	}

	/**
	 * Removes the dm history port where portCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortCodeAndSyncVersion(String portCode,
		String syncVersion)
		throws NoSuchDmHistoryPortException, SystemException {
		DmHistoryPort dmHistoryPort = findByPortCodeAndSyncVersion(portCode,
				syncVersion);

		dmHistoryPortPersistence.remove(dmHistoryPort);
	}

	/**
	 * Removes all the dm history ports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryPort dmHistoryPort : findAll()) {
			dmHistoryPortPersistence.remove(dmHistoryPort);
		}
	}

	/**
	 * Returns the number of dm history ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the number of matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortCode(String portCode) throws SystemException {
		Object[] finderArgs = new Object[] { portCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPORT_WHERE);

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
	 * Returns the number of dm history ports where portCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portCode the port code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortCodeAndSyncVersion(String portCode, String syncVersion)
		throws SystemException {
		Object[] finderArgs = new Object[] { portCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYPORT_WHERE);

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_1);
			}
			else {
				if (portCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTCODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history ports.
	 *
	 * @return the number of dm history ports
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYPORT);

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
	 * Initializes the dm history port persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryPort")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryPort>> listenersList = new ArrayList<ModelListener<DmHistoryPort>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryPort>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryPortImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYPORT = "SELECT dmHistoryPort FROM DmHistoryPort dmHistoryPort";
	private static final String _SQL_SELECT_DMHISTORYPORT_WHERE = "SELECT dmHistoryPort FROM DmHistoryPort dmHistoryPort WHERE ";
	private static final String _SQL_COUNT_DMHISTORYPORT = "SELECT COUNT(dmHistoryPort) FROM DmHistoryPort dmHistoryPort";
	private static final String _SQL_COUNT_DMHISTORYPORT_WHERE = "SELECT COUNT(dmHistoryPort) FROM DmHistoryPort dmHistoryPort WHERE ";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_1 = "dmHistoryPort.portCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_2 = "dmHistoryPort.portCode = ?";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_3 = "(dmHistoryPort.portCode IS NULL OR dmHistoryPort.portCode = ?)";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_1 =
		"dmHistoryPort.portCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_2 =
		"dmHistoryPort.portCode = ? AND ";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_PORTCODE_3 =
		"(dmHistoryPort.portCode IS NULL OR dmHistoryPort.portCode = ?) AND ";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryPort.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryPort.syncVersion = ?";
	private static final String _FINDER_COLUMN_PORTCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryPort.syncVersion IS NULL OR dmHistoryPort.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryPort.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryPort exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryPort exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryPortPersistenceImpl.class);
	private static DmHistoryPort _nullDmHistoryPort = new DmHistoryPortImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryPort> toCacheModel() {
				return _nullDmHistoryPortCacheModel;
			}
		};

	private static CacheModel<DmHistoryPort> _nullDmHistoryPortCacheModel = new CacheModel<DmHistoryPort>() {
			public DmHistoryPort toEntityModel() {
				return _nullDmHistoryPort;
			}
		};
}