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

package vn.gt.dao.noticeandmessage.service.persistence;

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

import vn.gt.dao.noticeandmessage.NoSuchTempDangerousGoodsItemsException;
import vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems;
import vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsItemsImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsItemsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp dangerous goods items service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempDangerousGoodsItemsPersistence
 * @see TempDangerousGoodsItemsUtil
 * @generated
 */
public class TempDangerousGoodsItemsPersistenceImpl extends BasePersistenceImpl<TempDangerousGoodsItems>
	implements TempDangerousGoodsItemsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempDangerousGoodsItemsUtil} to access the temp dangerous goods items persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempDangerousGoodsItemsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempDangerousGoodsItemsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp dangerous goods items in the entity cache if it is enabled.
	 *
	 * @param tempDangerousGoodsItems the temp dangerous goods items
	 */
	public void cacheResult(TempDangerousGoodsItems tempDangerousGoodsItems) {
		EntityCacheUtil.putResult(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsImpl.class,
			tempDangerousGoodsItems.getPrimaryKey(), tempDangerousGoodsItems);

		tempDangerousGoodsItems.resetOriginalValues();
	}

	/**
	 * Caches the temp dangerous goods itemses in the entity cache if it is enabled.
	 *
	 * @param tempDangerousGoodsItemses the temp dangerous goods itemses
	 */
	public void cacheResult(
		List<TempDangerousGoodsItems> tempDangerousGoodsItemses) {
		for (TempDangerousGoodsItems tempDangerousGoodsItems : tempDangerousGoodsItemses) {
			if (EntityCacheUtil.getResult(
						TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempDangerousGoodsItemsImpl.class,
						tempDangerousGoodsItems.getPrimaryKey()) == null) {
				cacheResult(tempDangerousGoodsItems);
			}
			else {
				tempDangerousGoodsItems.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp dangerous goods itemses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempDangerousGoodsItemsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempDangerousGoodsItemsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp dangerous goods items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempDangerousGoodsItems tempDangerousGoodsItems) {
		EntityCacheUtil.removeResult(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsImpl.class,
			tempDangerousGoodsItems.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempDangerousGoodsItems> tempDangerousGoodsItemses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempDangerousGoodsItems tempDangerousGoodsItems : tempDangerousGoodsItemses) {
			EntityCacheUtil.removeResult(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempDangerousGoodsItemsImpl.class,
				tempDangerousGoodsItems.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp dangerous goods items with the primary key. Does not add the temp dangerous goods items to the database.
	 *
	 * @param id the primary key for the new temp dangerous goods items
	 * @return the new temp dangerous goods items
	 */
	public TempDangerousGoodsItems create(long id) {
		TempDangerousGoodsItems tempDangerousGoodsItems = new TempDangerousGoodsItemsImpl();

		tempDangerousGoodsItems.setNew(true);
		tempDangerousGoodsItems.setPrimaryKey(id);

		return tempDangerousGoodsItems;
	}

	/**
	 * Removes the temp dangerous goods items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp dangerous goods items
	 * @return the temp dangerous goods items that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDangerousGoodsItemsException if a temp dangerous goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDangerousGoodsItems remove(long id)
		throws NoSuchTempDangerousGoodsItemsException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp dangerous goods items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp dangerous goods items
	 * @return the temp dangerous goods items that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDangerousGoodsItemsException if a temp dangerous goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsItems remove(Serializable primaryKey)
		throws NoSuchTempDangerousGoodsItemsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempDangerousGoodsItems tempDangerousGoodsItems = (TempDangerousGoodsItems)session.get(TempDangerousGoodsItemsImpl.class,
					primaryKey);

			if (tempDangerousGoodsItems == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempDangerousGoodsItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempDangerousGoodsItems);
		}
		catch (NoSuchTempDangerousGoodsItemsException nsee) {
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
	protected TempDangerousGoodsItems removeImpl(
		TempDangerousGoodsItems tempDangerousGoodsItems)
		throws SystemException {
		tempDangerousGoodsItems = toUnwrappedModel(tempDangerousGoodsItems);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempDangerousGoodsItems);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempDangerousGoodsItems);

		return tempDangerousGoodsItems;
	}

	@Override
	public TempDangerousGoodsItems updateImpl(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems tempDangerousGoodsItems,
		boolean merge) throws SystemException {
		tempDangerousGoodsItems = toUnwrappedModel(tempDangerousGoodsItems);

		boolean isNew = tempDangerousGoodsItems.isNew();

		TempDangerousGoodsItemsModelImpl tempDangerousGoodsItemsModelImpl = (TempDangerousGoodsItemsModelImpl)tempDangerousGoodsItems;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempDangerousGoodsItems, merge);

			tempDangerousGoodsItems.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempDangerousGoodsItemsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempDangerousGoodsItemsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDangerousGoodsItemsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempDangerousGoodsItemsModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsItemsImpl.class,
			tempDangerousGoodsItems.getPrimaryKey(), tempDangerousGoodsItems);

		return tempDangerousGoodsItems;
	}

	protected TempDangerousGoodsItems toUnwrappedModel(
		TempDangerousGoodsItems tempDangerousGoodsItems) {
		if (tempDangerousGoodsItems instanceof TempDangerousGoodsItemsImpl) {
			return tempDangerousGoodsItems;
		}

		TempDangerousGoodsItemsImpl tempDangerousGoodsItemsImpl = new TempDangerousGoodsItemsImpl();

		tempDangerousGoodsItemsImpl.setNew(tempDangerousGoodsItems.isNew());
		tempDangerousGoodsItemsImpl.setPrimaryKey(tempDangerousGoodsItems.getPrimaryKey());

		tempDangerousGoodsItemsImpl.setId(tempDangerousGoodsItems.getId());
		tempDangerousGoodsItemsImpl.setRequestCode(tempDangerousGoodsItems.getRequestCode());
		tempDangerousGoodsItemsImpl.setDangerousGoodItemCode(tempDangerousGoodsItems.getDangerousGoodItemCode());
		tempDangerousGoodsItemsImpl.setRefNumber(tempDangerousGoodsItems.getRefNumber());
		tempDangerousGoodsItemsImpl.setMarksContainer(tempDangerousGoodsItems.getMarksContainer());
		tempDangerousGoodsItemsImpl.setNumberContainer(tempDangerousGoodsItems.getNumberContainer());
		tempDangerousGoodsItemsImpl.setNumberOfPackage(tempDangerousGoodsItems.getNumberOfPackage());
		tempDangerousGoodsItemsImpl.setKindOfPackages(tempDangerousGoodsItems.getKindOfPackages());
		tempDangerousGoodsItemsImpl.setProperShippingName(tempDangerousGoodsItems.getProperShippingName());
		tempDangerousGoodsItemsImpl.setGoodClass(tempDangerousGoodsItems.getGoodClass());
		tempDangerousGoodsItemsImpl.setUnNumber(tempDangerousGoodsItems.getUnNumber());
		tempDangerousGoodsItemsImpl.setPackingGroup(tempDangerousGoodsItems.getPackingGroup());
		tempDangerousGoodsItemsImpl.setSubsidiaryRisk(tempDangerousGoodsItems.getSubsidiaryRisk());
		tempDangerousGoodsItemsImpl.setFlashPoint(tempDangerousGoodsItems.getFlashPoint());
		tempDangerousGoodsItemsImpl.setMarinePollutant(tempDangerousGoodsItems.getMarinePollutant());
		tempDangerousGoodsItemsImpl.setGrossWeight(tempDangerousGoodsItems.getGrossWeight());
		tempDangerousGoodsItemsImpl.setEms(tempDangerousGoodsItems.getEms());

		return tempDangerousGoodsItemsImpl;
	}

	/**
	 * Returns the temp dangerous goods items with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp dangerous goods items
	 * @return the temp dangerous goods items
	 * @throws com.liferay.portal.NoSuchModelException if a temp dangerous goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsItems findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp dangerous goods items with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempDangerousGoodsItemsException} if it could not be found.
	 *
	 * @param id the primary key of the temp dangerous goods items
	 * @return the temp dangerous goods items
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDangerousGoodsItemsException if a temp dangerous goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDangerousGoodsItems findByPrimaryKey(long id)
		throws NoSuchTempDangerousGoodsItemsException, SystemException {
		TempDangerousGoodsItems tempDangerousGoodsItems = fetchByPrimaryKey(id);

		if (tempDangerousGoodsItems == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempDangerousGoodsItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempDangerousGoodsItems;
	}

	/**
	 * Returns the temp dangerous goods items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp dangerous goods items
	 * @return the temp dangerous goods items, or <code>null</code> if a temp dangerous goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsItems fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp dangerous goods items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp dangerous goods items
	 * @return the temp dangerous goods items, or <code>null</code> if a temp dangerous goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDangerousGoodsItems fetchByPrimaryKey(long id)
		throws SystemException {
		TempDangerousGoodsItems tempDangerousGoodsItems = (TempDangerousGoodsItems)EntityCacheUtil.getResult(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempDangerousGoodsItemsImpl.class, id);

		if (tempDangerousGoodsItems == _nullTempDangerousGoodsItems) {
			return null;
		}

		if (tempDangerousGoodsItems == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempDangerousGoodsItems = (TempDangerousGoodsItems)session.get(TempDangerousGoodsItemsImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempDangerousGoodsItems != null) {
					cacheResult(tempDangerousGoodsItems);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempDangerousGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempDangerousGoodsItemsImpl.class, id,
						_nullTempDangerousGoodsItems);
				}

				closeSession(session);
			}
		}

		return tempDangerousGoodsItems;
	}

	/**
	 * Returns all the temp dangerous goods itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp dangerous goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDangerousGoodsItems> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp dangerous goods itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp dangerous goods itemses
	 * @param end the upper bound of the range of temp dangerous goods itemses (not inclusive)
	 * @return the range of matching temp dangerous goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDangerousGoodsItems> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp dangerous goods itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp dangerous goods itemses
	 * @param end the upper bound of the range of temp dangerous goods itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp dangerous goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDangerousGoodsItems> findByRequestCode(String requestCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode, start, end, orderByComparator };
		}

		List<TempDangerousGoodsItems> list = (List<TempDangerousGoodsItems>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPDANGEROUSGOODSITEMS_WHERE);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDangerousGoodsItemsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				list = (List<TempDangerousGoodsItems>)QueryUtil.list(q,
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
	 * Returns the first temp dangerous goods items in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp dangerous goods items
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDangerousGoodsItemsException if a matching temp dangerous goods items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDangerousGoodsItems findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsItemsException, SystemException {
		List<TempDangerousGoodsItems> list = findByRequestCode(requestCode, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDangerousGoodsItemsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp dangerous goods items in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp dangerous goods items
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDangerousGoodsItemsException if a matching temp dangerous goods items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDangerousGoodsItems findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsItemsException, SystemException {
		int count = countByRequestCode(requestCode);

		List<TempDangerousGoodsItems> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDangerousGoodsItemsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp dangerous goods itemses before and after the current temp dangerous goods items in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp dangerous goods items
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp dangerous goods items
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDangerousGoodsItemsException if a temp dangerous goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDangerousGoodsItems[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsItemsException, SystemException {
		TempDangerousGoodsItems tempDangerousGoodsItems = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDangerousGoodsItems[] array = new TempDangerousGoodsItemsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempDangerousGoodsItems, requestCode, orderByComparator,
					true);

			array[1] = tempDangerousGoodsItems;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempDangerousGoodsItems, requestCode, orderByComparator,
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

	protected TempDangerousGoodsItems getByRequestCode_PrevAndNext(
		Session session, TempDangerousGoodsItems tempDangerousGoodsItems,
		String requestCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDANGEROUSGOODSITEMS_WHERE);

		if (requestCode == null) {
			query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
		}
		else {
			if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
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
			query.append(TempDangerousGoodsItemsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (requestCode != null) {
			qPos.add(requestCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDangerousGoodsItems);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDangerousGoodsItems> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp dangerous goods itemses.
	 *
	 * @return the temp dangerous goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDangerousGoodsItems> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp dangerous goods itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp dangerous goods itemses
	 * @param end the upper bound of the range of temp dangerous goods itemses (not inclusive)
	 * @return the range of temp dangerous goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDangerousGoodsItems> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp dangerous goods itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp dangerous goods itemses
	 * @param end the upper bound of the range of temp dangerous goods itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp dangerous goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDangerousGoodsItems> findAll(int start, int end,
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

		List<TempDangerousGoodsItems> list = (List<TempDangerousGoodsItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPDANGEROUSGOODSITEMS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPDANGEROUSGOODSITEMS.concat(TempDangerousGoodsItemsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempDangerousGoodsItems>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempDangerousGoodsItems>)QueryUtil.list(q,
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
	 * Removes all the temp dangerous goods itemses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempDangerousGoodsItems tempDangerousGoodsItems : findByRequestCode(
				requestCode)) {
			remove(tempDangerousGoodsItems);
		}
	}

	/**
	 * Removes all the temp dangerous goods itemses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempDangerousGoodsItems tempDangerousGoodsItems : findAll()) {
			remove(tempDangerousGoodsItems);
		}
	}

	/**
	 * Returns the number of temp dangerous goods itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp dangerous goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPDANGEROUSGOODSITEMS_WHERE);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp dangerous goods itemses.
	 *
	 * @return the number of temp dangerous goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPDANGEROUSGOODSITEMS);

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
	 * Initializes the temp dangerous goods items persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempDangerousGoodsItems>> listenersList = new ArrayList<ModelListener<TempDangerousGoodsItems>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempDangerousGoodsItems>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempDangerousGoodsItemsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = HistoryInterfaceRequestPersistence.class)
	protected HistoryInterfaceRequestPersistence historyInterfaceRequestPersistence;
	@BeanReference(type = HistoryInterfaceRequestFieldPersistence.class)
	protected HistoryInterfaceRequestFieldPersistence historyInterfaceRequestFieldPersistence;
	@BeanReference(type = InterfaceRequestPersistence.class)
	protected InterfaceRequestPersistence interfaceRequestPersistence;
	@BeanReference(type = InterfaceRequestFieldPersistence.class)
	protected InterfaceRequestFieldPersistence interfaceRequestFieldPersistence;
	@BeanReference(type = IssueAcceptancePersistence.class)
	protected IssueAcceptancePersistence issueAcceptancePersistence;
	@BeanReference(type = IssueAcceptanceForTransitPersistence.class)
	protected IssueAcceptanceForTransitPersistence issueAcceptanceForTransitPersistence;
	@BeanReference(type = IssuePermissionForTransitPersistence.class)
	protected IssuePermissionForTransitPersistence issuePermissionForTransitPersistence;
	@BeanReference(type = IssuePortClearancePersistence.class)
	protected IssuePortClearancePersistence issuePortClearancePersistence;
	@BeanReference(type = IssueShiftingOrderPersistence.class)
	protected IssueShiftingOrderPersistence issueShiftingOrderPersistence;
	@BeanReference(type = IssueShiftingOrderChanelPersistence.class)
	protected IssueShiftingOrderChanelPersistence issueShiftingOrderChanelPersistence;
	@BeanReference(type = ModifyPersistence.class)
	protected ModifyPersistence modifyPersistence;
	@BeanReference(type = NoticeShipMessagePersistence.class)
	protected NoticeShipMessagePersistence noticeShipMessagePersistence;
	@BeanReference(type = TempAnimalQuarantinePersistence.class)
	protected TempAnimalQuarantinePersistence tempAnimalQuarantinePersistence;
	@BeanReference(type = TempAttachmentDeclarationHealthPersistence.class)
	protected TempAttachmentDeclarationHealthPersistence tempAttachmentDeclarationHealthPersistence;
	@BeanReference(type = TempCargoDeclarationPersistence.class)
	protected TempCargoDeclarationPersistence tempCargoDeclarationPersistence;
	@BeanReference(type = TempCargoItemsPersistence.class)
	protected TempCargoItemsPersistence tempCargoItemsPersistence;
	@BeanReference(type = TempCrewDetailsPersistence.class)
	protected TempCrewDetailsPersistence tempCrewDetailsPersistence;
	@BeanReference(type = TempCrewEffectsDeclarationPersistence.class)
	protected TempCrewEffectsDeclarationPersistence tempCrewEffectsDeclarationPersistence;
	@BeanReference(type = TempCrewEffectsItemsPersistence.class)
	protected TempCrewEffectsItemsPersistence tempCrewEffectsItemsPersistence;
	@BeanReference(type = TempCrewListPersistence.class)
	protected TempCrewListPersistence tempCrewListPersistence;
	@BeanReference(type = TempDangerousGoodsItemsPersistence.class)
	protected TempDangerousGoodsItemsPersistence tempDangerousGoodsItemsPersistence;
	@BeanReference(type = TempDangerousGoodsNanifestPersistence.class)
	protected TempDangerousGoodsNanifestPersistence tempDangerousGoodsNanifestPersistence;
	@BeanReference(type = TempDeclarationForAnimalQuarantinePersistence.class)
	protected TempDeclarationForAnimalQuarantinePersistence tempDeclarationForAnimalQuarantinePersistence;
	@BeanReference(type = TempDeclarationForPlantQuarantinePersistence.class)
	protected TempDeclarationForPlantQuarantinePersistence tempDeclarationForPlantQuarantinePersistence;
	@BeanReference(type = TempDeclarationOfHealthPersistence.class)
	protected TempDeclarationOfHealthPersistence tempDeclarationOfHealthPersistence;
	@BeanReference(type = TempDocumentPersistence.class)
	protected TempDocumentPersistence tempDocumentPersistence;
	@BeanReference(type = TempGeneralDeclarationPersistence.class)
	protected TempGeneralDeclarationPersistence tempGeneralDeclarationPersistence;
	@BeanReference(type = TempGoodsItemsPersistence.class)
	protected TempGoodsItemsPersistence tempGoodsItemsPersistence;
	@BeanReference(type = TempHealthCrewPassengerListPersistence.class)
	protected TempHealthCrewPassengerListPersistence tempHealthCrewPassengerListPersistence;
	@BeanReference(type = TempHealthQuestionPersistence.class)
	protected TempHealthQuestionPersistence tempHealthQuestionPersistence;
	@BeanReference(type = TempMaritimePaymentConfigPersistence.class)
	protected TempMaritimePaymentConfigPersistence tempMaritimePaymentConfigPersistence;
	@BeanReference(type = TempNoTiceShipMessagePersistence.class)
	protected TempNoTiceShipMessagePersistence tempNoTiceShipMessagePersistence;
	@BeanReference(type = TempPassengerDetailsPersistence.class)
	protected TempPassengerDetailsPersistence tempPassengerDetailsPersistence;
	@BeanReference(type = TempPassengerListPersistence.class)
	protected TempPassengerListPersistence tempPassengerListPersistence;
	@BeanReference(type = TempPersonListPersistence.class)
	protected TempPersonListPersistence tempPersonListPersistence;
	@BeanReference(type = TempPlantQuarantinePersistence.class)
	protected TempPlantQuarantinePersistence tempPlantQuarantinePersistence;
	@BeanReference(type = TempShipSecurityMessagePersistence.class)
	protected TempShipSecurityMessagePersistence tempShipSecurityMessagePersistence;
	@BeanReference(type = TempShipSecurityPortItemsPersistence.class)
	protected TempShipSecurityPortItemsPersistence tempShipSecurityPortItemsPersistence;
	@BeanReference(type = TempShipStoresDeclarationPersistence.class)
	protected TempShipStoresDeclarationPersistence tempShipStoresDeclarationPersistence;
	@BeanReference(type = TempShipStoresItemsPersistence.class)
	protected TempShipStoresItemsPersistence tempShipStoresItemsPersistence;
	@BeanReference(type = TempUnitGeneralPersistence.class)
	protected TempUnitGeneralPersistence tempUnitGeneralPersistence;
	@BeanReference(type = TempWasteListPersistence.class)
	protected TempWasteListPersistence tempWasteListPersistence;
	@BeanReference(type = ViewHoanThanhThuTucPersistence.class)
	protected ViewHoanThanhThuTucPersistence viewHoanThanhThuTucPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TEMPDANGEROUSGOODSITEMS = "SELECT tempDangerousGoodsItems FROM TempDangerousGoodsItems tempDangerousGoodsItems";
	private static final String _SQL_SELECT_TEMPDANGEROUSGOODSITEMS_WHERE = "SELECT tempDangerousGoodsItems FROM TempDangerousGoodsItems tempDangerousGoodsItems WHERE ";
	private static final String _SQL_COUNT_TEMPDANGEROUSGOODSITEMS = "SELECT COUNT(tempDangerousGoodsItems) FROM TempDangerousGoodsItems tempDangerousGoodsItems";
	private static final String _SQL_COUNT_TEMPDANGEROUSGOODSITEMS_WHERE = "SELECT COUNT(tempDangerousGoodsItems) FROM TempDangerousGoodsItems tempDangerousGoodsItems WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempDangerousGoodsItems.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempDangerousGoodsItems.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempDangerousGoodsItems.requestCode IS NULL OR tempDangerousGoodsItems.requestCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempDangerousGoodsItems.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempDangerousGoodsItems exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempDangerousGoodsItems exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempDangerousGoodsItemsPersistenceImpl.class);
	private static TempDangerousGoodsItems _nullTempDangerousGoodsItems = new TempDangerousGoodsItemsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempDangerousGoodsItems> toCacheModel() {
				return _nullTempDangerousGoodsItemsCacheModel;
			}
		};

	private static CacheModel<TempDangerousGoodsItems> _nullTempDangerousGoodsItemsCacheModel =
		new CacheModel<TempDangerousGoodsItems>() {
			public TempDangerousGoodsItems toEntityModel() {
				return _nullTempDangerousGoodsItems;
			}
		};
}