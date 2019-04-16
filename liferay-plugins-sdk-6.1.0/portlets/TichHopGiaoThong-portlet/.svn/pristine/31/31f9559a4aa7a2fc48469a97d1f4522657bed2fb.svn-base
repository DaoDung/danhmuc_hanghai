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

package vn.gt.dao.danhmucgt.service.persistence;

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

import vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException;
import vn.gt.dao.danhmucgt.model.DmGTShipPosition;
import vn.gt.dao.danhmucgt.model.impl.DmGTShipPositionImpl;
import vn.gt.dao.danhmucgt.model.impl.DmGTShipPositionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm g t ship position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGTShipPositionPersistence
 * @see DmGTShipPositionUtil
 * @generated
 */
public class DmGTShipPositionPersistenceImpl extends BasePersistenceImpl<DmGTShipPosition>
	implements DmGTShipPositionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGTShipPositionUtil} to access the dm g t ship position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGTShipPositionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITIONCODE =
		new FinderPath(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionModelImpl.FINDER_CACHE_ENABLED,
			DmGTShipPositionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPositionCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONCODE =
		new FinderPath(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionModelImpl.FINDER_CACHE_ENABLED,
			DmGTShipPositionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPositionCode",
			new String[] { String.class.getName() },
			DmGTShipPositionModelImpl.POSITIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_POSITIONCODE = new FinderPath(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPositionCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionModelImpl.FINDER_CACHE_ENABLED,
			DmGTShipPositionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionModelImpl.FINDER_CACHE_ENABLED,
			DmGTShipPositionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm g t ship position in the entity cache if it is enabled.
	 *
	 * @param dmGTShipPosition the dm g t ship position
	 */
	public void cacheResult(DmGTShipPosition dmGTShipPosition) {
		EntityCacheUtil.putResult(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionImpl.class, dmGTShipPosition.getPrimaryKey(),
			dmGTShipPosition);

		dmGTShipPosition.resetOriginalValues();
	}

	/**
	 * Caches the dm g t ship positions in the entity cache if it is enabled.
	 *
	 * @param dmGTShipPositions the dm g t ship positions
	 */
	public void cacheResult(List<DmGTShipPosition> dmGTShipPositions) {
		for (DmGTShipPosition dmGTShipPosition : dmGTShipPositions) {
			if (EntityCacheUtil.getResult(
						DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
						DmGTShipPositionImpl.class,
						dmGTShipPosition.getPrimaryKey()) == null) {
				cacheResult(dmGTShipPosition);
			}
			else {
				dmGTShipPosition.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm g t ship positions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGTShipPositionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGTShipPositionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm g t ship position.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGTShipPosition dmGTShipPosition) {
		EntityCacheUtil.removeResult(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionImpl.class, dmGTShipPosition.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Creates a new dm g t ship position with the primary key. Does not add the dm g t ship position to the database.
	 *
	 * @param id the primary key for the new dm g t ship position
	 * @return the new dm g t ship position
	 */
	public DmGTShipPosition create(long id) {
		DmGTShipPosition dmGTShipPosition = new DmGTShipPositionImpl();

		dmGTShipPosition.setNew(true);
		dmGTShipPosition.setPrimaryKey(id);

		return dmGTShipPosition;
	}

	/**
	 * Removes the dm g t ship position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm g t ship position
	 * @return the dm g t ship position that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm g t ship position with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTShipPosition remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the dm g t ship position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm g t ship position
	 * @return the dm g t ship position that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTShipPosition remove(long id)
		throws NoSuchDmGTShipPositionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGTShipPosition dmGTShipPosition = (DmGTShipPosition)session.get(DmGTShipPositionImpl.class,
					Long.valueOf(id));

			if (dmGTShipPosition == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmGTShipPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmGTShipPositionPersistence.remove(dmGTShipPosition);
		}
		catch (NoSuchDmGTShipPositionException nsee) {
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
	 * Removes the dm g t ship position from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmGTShipPosition the dm g t ship position
	 * @return the dm g t ship position that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTShipPosition remove(DmGTShipPosition dmGTShipPosition)
		throws SystemException {
		return super.remove(dmGTShipPosition);
	}

	@Override
	protected DmGTShipPosition removeImpl(DmGTShipPosition dmGTShipPosition)
		throws SystemException {
		dmGTShipPosition = toUnwrappedModel(dmGTShipPosition);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGTShipPosition);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		EntityCacheUtil.removeResult(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionImpl.class, dmGTShipPosition.getPrimaryKey());

		return dmGTShipPosition;
	}

	@Override
	public DmGTShipPosition updateImpl(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition,
		boolean merge) throws SystemException {
		dmGTShipPosition = toUnwrappedModel(dmGTShipPosition);

		boolean isNew = dmGTShipPosition.isNew();

		DmGTShipPositionModelImpl dmGTShipPositionModelImpl = (DmGTShipPositionModelImpl)dmGTShipPosition;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGTShipPosition, merge);

			dmGTShipPosition.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGTShipPositionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmGTShipPositionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGTShipPositionModelImpl.getOriginalPositionCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONCODE,
					args);

				args = new Object[] { dmGTShipPositionModelImpl.getPositionCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
			DmGTShipPositionImpl.class, dmGTShipPosition.getPrimaryKey(),
			dmGTShipPosition);

		return dmGTShipPosition;
	}

	protected DmGTShipPosition toUnwrappedModel(
		DmGTShipPosition dmGTShipPosition) {
		if (dmGTShipPosition instanceof DmGTShipPositionImpl) {
			return dmGTShipPosition;
		}

		DmGTShipPositionImpl dmGTShipPositionImpl = new DmGTShipPositionImpl();

		dmGTShipPositionImpl.setNew(dmGTShipPosition.isNew());
		dmGTShipPositionImpl.setPrimaryKey(dmGTShipPosition.getPrimaryKey());

		dmGTShipPositionImpl.setId(dmGTShipPosition.getId());
		dmGTShipPositionImpl.setPositionCode(dmGTShipPosition.getPositionCode());
		dmGTShipPositionImpl.setPositionName(dmGTShipPosition.getPositionName());
		dmGTShipPositionImpl.setRemarks(dmGTShipPosition.getRemarks());
		dmGTShipPositionImpl.setPositionOrder(dmGTShipPosition.getPositionOrder());
		dmGTShipPositionImpl.setIsDelete(dmGTShipPosition.getIsDelete());
		dmGTShipPositionImpl.setMarkedAsDelete(dmGTShipPosition.getMarkedAsDelete());
		dmGTShipPositionImpl.setModifiedDate(dmGTShipPosition.getModifiedDate());
		dmGTShipPositionImpl.setRequestedDate(dmGTShipPosition.getRequestedDate());
		dmGTShipPositionImpl.setSyncVersion(dmGTShipPosition.getSyncVersion());

		return dmGTShipPositionImpl;
	}

	/**
	 * Returns the dm g t ship position with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm g t ship position
	 * @return the dm g t ship position
	 * @throws com.liferay.portal.NoSuchModelException if a dm g t ship position with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTShipPosition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm g t ship position with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException} if it could not be found.
	 *
	 * @param id the primary key of the dm g t ship position
	 * @return the dm g t ship position
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTShipPosition findByPrimaryKey(long id)
		throws NoSuchDmGTShipPositionException, SystemException {
		DmGTShipPosition dmGTShipPosition = fetchByPrimaryKey(id);

		if (dmGTShipPosition == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGTShipPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGTShipPosition;
	}

	/**
	 * Returns the dm g t ship position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm g t ship position
	 * @return the dm g t ship position, or <code>null</code> if a dm g t ship position with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGTShipPosition fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm g t ship position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm g t ship position
	 * @return the dm g t ship position, or <code>null</code> if a dm g t ship position with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTShipPosition fetchByPrimaryKey(long id)
		throws SystemException {
		DmGTShipPosition dmGTShipPosition = (DmGTShipPosition)EntityCacheUtil.getResult(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
				DmGTShipPositionImpl.class, id);

		if (dmGTShipPosition == _nullDmGTShipPosition) {
			return null;
		}

		if (dmGTShipPosition == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGTShipPosition = (DmGTShipPosition)session.get(DmGTShipPositionImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGTShipPosition != null) {
					cacheResult(dmGTShipPosition);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGTShipPositionModelImpl.ENTITY_CACHE_ENABLED,
						DmGTShipPositionImpl.class, id, _nullDmGTShipPosition);
				}

				closeSession(session);
			}
		}

		return dmGTShipPosition;
	}

	/**
	 * Returns all the dm g t ship positions where positionCode = &#63;.
	 *
	 * @param positionCode the position code
	 * @return the matching dm g t ship positions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTShipPosition> findByPositionCode(String positionCode)
		throws SystemException {
		return findByPositionCode(positionCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm g t ship positions where positionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param positionCode the position code
	 * @param start the lower bound of the range of dm g t ship positions
	 * @param end the upper bound of the range of dm g t ship positions (not inclusive)
	 * @return the range of matching dm g t ship positions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTShipPosition> findByPositionCode(String positionCode,
		int start, int end) throws SystemException {
		return findByPositionCode(positionCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm g t ship positions where positionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param positionCode the position code
	 * @param start the lower bound of the range of dm g t ship positions
	 * @param end the upper bound of the range of dm g t ship positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm g t ship positions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTShipPosition> findByPositionCode(String positionCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONCODE;
			finderArgs = new Object[] { positionCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITIONCODE;
			finderArgs = new Object[] {
					positionCode,
					
					start, end, orderByComparator
				};
		}

		List<DmGTShipPosition> list = (List<DmGTShipPosition>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMGTSHIPPOSITION_WHERE);

			if (positionCode == null) {
				query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_1);
			}
			else {
				if (positionCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmGTShipPositionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (positionCode != null) {
					qPos.add(positionCode);
				}

				list = (List<DmGTShipPosition>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm g t ship position in the ordered set where positionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param positionCode the position code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm g t ship position
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a matching dm g t ship position could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTShipPosition findByPositionCode_First(String positionCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmGTShipPositionException, SystemException {
		List<DmGTShipPosition> list = findByPositionCode(positionCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("positionCode=");
			msg.append(positionCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGTShipPositionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm g t ship position in the ordered set where positionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param positionCode the position code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm g t ship position
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a matching dm g t ship position could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTShipPosition findByPositionCode_Last(String positionCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmGTShipPositionException, SystemException {
		int count = countByPositionCode(positionCode);

		List<DmGTShipPosition> list = findByPositionCode(positionCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("positionCode=");
			msg.append(positionCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGTShipPositionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm g t ship positions before and after the current dm g t ship position in the ordered set where positionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm g t ship position
	 * @param positionCode the position code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm g t ship position
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGTShipPosition[] findByPositionCode_PrevAndNext(long id,
		String positionCode, OrderByComparator orderByComparator)
		throws NoSuchDmGTShipPositionException, SystemException {
		DmGTShipPosition dmGTShipPosition = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGTShipPosition[] array = new DmGTShipPositionImpl[3];

			array[0] = getByPositionCode_PrevAndNext(session, dmGTShipPosition,
					positionCode, orderByComparator, true);

			array[1] = dmGTShipPosition;

			array[2] = getByPositionCode_PrevAndNext(session, dmGTShipPosition,
					positionCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGTShipPosition getByPositionCode_PrevAndNext(Session session,
		DmGTShipPosition dmGTShipPosition, String positionCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGTSHIPPOSITION_WHERE);

		if (positionCode == null) {
			query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_1);
		}
		else {
			if (positionCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_2);
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
			query.append(DmGTShipPositionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (positionCode != null) {
			qPos.add(positionCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGTShipPosition);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGTShipPosition> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm g t ship positions.
	 *
	 * @return the dm g t ship positions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTShipPosition> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm g t ship positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm g t ship positions
	 * @param end the upper bound of the range of dm g t ship positions (not inclusive)
	 * @return the range of dm g t ship positions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTShipPosition> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm g t ship positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm g t ship positions
	 * @param end the upper bound of the range of dm g t ship positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm g t ship positions
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGTShipPosition> findAll(int start, int end,
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

		List<DmGTShipPosition> list = (List<DmGTShipPosition>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTSHIPPOSITION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTSHIPPOSITION.concat(DmGTShipPositionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGTShipPosition>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGTShipPosition>)QueryUtil.list(q,
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
	 * Removes all the dm g t ship positions where positionCode = &#63; from the database.
	 *
	 * @param positionCode the position code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPositionCode(String positionCode)
		throws SystemException {
		for (DmGTShipPosition dmGTShipPosition : findByPositionCode(
				positionCode)) {
			dmGTShipPositionPersistence.remove(dmGTShipPosition);
		}
	}

	/**
	 * Removes all the dm g t ship positions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGTShipPosition dmGTShipPosition : findAll()) {
			dmGTShipPositionPersistence.remove(dmGTShipPosition);
		}
	}

	/**
	 * Returns the number of dm g t ship positions where positionCode = &#63;.
	 *
	 * @param positionCode the position code
	 * @return the number of matching dm g t ship positions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPositionCode(String positionCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { positionCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_POSITIONCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTSHIPPOSITION_WHERE);

			if (positionCode == null) {
				query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_1);
			}
			else {
				if (positionCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_POSITIONCODE_POSITIONCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (positionCode != null) {
					qPos.add(positionCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POSITIONCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm g t ship positions.
	 *
	 * @return the number of dm g t ship positions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGTSHIPPOSITION);

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
	 * Initializes the dm g t ship position persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmGTShipPosition")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGTShipPosition>> listenersList = new ArrayList<ModelListener<DmGTShipPosition>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGTShipPosition>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGTShipPositionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DmCertificatePersistence.class)
	protected DmCertificatePersistence dmCertificatePersistence;
	@BeanReference(type = DmGTBusinessTypePersistence.class)
	protected DmGTBusinessTypePersistence dmGTBusinessTypePersistence;
	@BeanReference(type = DmGTFunctionTypePersistence.class)
	protected DmGTFunctionTypePersistence dmGTFunctionTypePersistence;
	@BeanReference(type = DmGtOrganizationPersistence.class)
	protected DmGtOrganizationPersistence dmGtOrganizationPersistence;
	@BeanReference(type = DmGtReportCategoryPersistence.class)
	protected DmGtReportCategoryPersistence dmGtReportCategoryPersistence;
	@BeanReference(type = DmGtReportTemplatePersistence.class)
	protected DmGtReportTemplatePersistence dmGtReportTemplatePersistence;
	@BeanReference(type = DmGtRouteConfigPersistence.class)
	protected DmGtRouteConfigPersistence dmGtRouteConfigPersistence;
	@BeanReference(type = DmGTShipPositionPersistence.class)
	protected DmGTShipPositionPersistence dmGTShipPositionPersistence;
	@BeanReference(type = DmGtStatusPersistence.class)
	protected DmGtStatusPersistence dmGtStatusPersistence;
	@BeanReference(type = DmGtVersionPersistence.class)
	protected DmGtVersionPersistence dmGtVersionPersistence;
	@BeanReference(type = DmHistoryMinistryPersistence.class)
	protected DmHistoryMinistryPersistence dmHistoryMinistryPersistence;
	@BeanReference(type = DmMinistryPersistence.class)
	protected DmMinistryPersistence dmMinistryPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DMGTSHIPPOSITION = "SELECT dmGTShipPosition FROM DmGTShipPosition dmGTShipPosition";
	private static final String _SQL_SELECT_DMGTSHIPPOSITION_WHERE = "SELECT dmGTShipPosition FROM DmGTShipPosition dmGTShipPosition WHERE ";
	private static final String _SQL_COUNT_DMGTSHIPPOSITION = "SELECT COUNT(dmGTShipPosition) FROM DmGTShipPosition dmGTShipPosition";
	private static final String _SQL_COUNT_DMGTSHIPPOSITION_WHERE = "SELECT COUNT(dmGTShipPosition) FROM DmGTShipPosition dmGTShipPosition WHERE ";
	private static final String _FINDER_COLUMN_POSITIONCODE_POSITIONCODE_1 = "dmGTShipPosition.positionCode IS NULL";
	private static final String _FINDER_COLUMN_POSITIONCODE_POSITIONCODE_2 = "dmGTShipPosition.positionCode = ?";
	private static final String _FINDER_COLUMN_POSITIONCODE_POSITIONCODE_3 = "(dmGTShipPosition.positionCode IS NULL OR dmGTShipPosition.positionCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGTShipPosition.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGTShipPosition exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGTShipPosition exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGTShipPositionPersistenceImpl.class);
	private static DmGTShipPosition _nullDmGTShipPosition = new DmGTShipPositionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGTShipPosition> toCacheModel() {
				return _nullDmGTShipPositionCacheModel;
			}
		};

	private static CacheModel<DmGTShipPosition> _nullDmGTShipPositionCacheModel = new CacheModel<DmGTShipPosition>() {
			public DmGTShipPosition toEntityModel() {
				return _nullDmGTShipPosition;
			}
		};
}