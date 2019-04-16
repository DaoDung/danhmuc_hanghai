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

import vn.gt.dao.noticeandmessage.NoSuchTempGoodsItemsException;
import vn.gt.dao.noticeandmessage.model.TempGoodsItems;
import vn.gt.dao.noticeandmessage.model.impl.TempGoodsItemsImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempGoodsItemsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp goods items service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempGoodsItemsPersistence
 * @see TempGoodsItemsUtil
 * @generated
 */
public class TempGoodsItemsPersistenceImpl extends BasePersistenceImpl<TempGoodsItems>
	implements TempGoodsItemsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempGoodsItemsUtil} to access the temp goods items persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempGoodsItemsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempGoodsItemsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempGoodsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempGoodsItemsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempGoodsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempGoodsItemsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp goods items in the entity cache if it is enabled.
	 *
	 * @param tempGoodsItems the temp goods items
	 */
	public void cacheResult(TempGoodsItems tempGoodsItems) {
		EntityCacheUtil.putResult(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsImpl.class, tempGoodsItems.getPrimaryKey(),
			tempGoodsItems);

		tempGoodsItems.resetOriginalValues();
	}

	/**
	 * Caches the temp goods itemses in the entity cache if it is enabled.
	 *
	 * @param tempGoodsItemses the temp goods itemses
	 */
	public void cacheResult(List<TempGoodsItems> tempGoodsItemses) {
		for (TempGoodsItems tempGoodsItems : tempGoodsItemses) {
			if (EntityCacheUtil.getResult(
						TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempGoodsItemsImpl.class, tempGoodsItems.getPrimaryKey()) == null) {
				cacheResult(tempGoodsItems);
			}
			else {
				tempGoodsItems.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp goods itemses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempGoodsItemsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempGoodsItemsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp goods items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempGoodsItems tempGoodsItems) {
		EntityCacheUtil.removeResult(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsImpl.class, tempGoodsItems.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempGoodsItems> tempGoodsItemses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempGoodsItems tempGoodsItems : tempGoodsItemses) {
			EntityCacheUtil.removeResult(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempGoodsItemsImpl.class, tempGoodsItems.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp goods items with the primary key. Does not add the temp goods items to the database.
	 *
	 * @param id the primary key for the new temp goods items
	 * @return the new temp goods items
	 */
	public TempGoodsItems create(long id) {
		TempGoodsItems tempGoodsItems = new TempGoodsItemsImpl();

		tempGoodsItems.setNew(true);
		tempGoodsItems.setPrimaryKey(id);

		return tempGoodsItems;
	}

	/**
	 * Removes the temp goods items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp goods items
	 * @return the temp goods items that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGoodsItemsException if a temp goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGoodsItems remove(long id)
		throws NoSuchTempGoodsItemsException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp goods items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp goods items
	 * @return the temp goods items that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGoodsItemsException if a temp goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGoodsItems remove(Serializable primaryKey)
		throws NoSuchTempGoodsItemsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempGoodsItems tempGoodsItems = (TempGoodsItems)session.get(TempGoodsItemsImpl.class,
					primaryKey);

			if (tempGoodsItems == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempGoodsItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempGoodsItems);
		}
		catch (NoSuchTempGoodsItemsException nsee) {
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
	protected TempGoodsItems removeImpl(TempGoodsItems tempGoodsItems)
		throws SystemException {
		tempGoodsItems = toUnwrappedModel(tempGoodsItems);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempGoodsItems);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempGoodsItems);

		return tempGoodsItems;
	}

	@Override
	public TempGoodsItems updateImpl(
		vn.gt.dao.noticeandmessage.model.TempGoodsItems tempGoodsItems,
		boolean merge) throws SystemException {
		tempGoodsItems = toUnwrappedModel(tempGoodsItems);

		boolean isNew = tempGoodsItems.isNew();

		TempGoodsItemsModelImpl tempGoodsItemsModelImpl = (TempGoodsItemsModelImpl)tempGoodsItems;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempGoodsItems, merge);

			tempGoodsItems.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempGoodsItemsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempGoodsItemsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempGoodsItemsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempGoodsItemsModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempGoodsItemsImpl.class, tempGoodsItems.getPrimaryKey(),
			tempGoodsItems);

		return tempGoodsItems;
	}

	protected TempGoodsItems toUnwrappedModel(TempGoodsItems tempGoodsItems) {
		if (tempGoodsItems instanceof TempGoodsItemsImpl) {
			return tempGoodsItems;
		}

		TempGoodsItemsImpl tempGoodsItemsImpl = new TempGoodsItemsImpl();

		tempGoodsItemsImpl.setNew(tempGoodsItems.isNew());
		tempGoodsItemsImpl.setPrimaryKey(tempGoodsItems.getPrimaryKey());

		tempGoodsItemsImpl.setId(tempGoodsItems.getId());
		tempGoodsItemsImpl.setRequestCode(tempGoodsItems.getRequestCode());
		tempGoodsItemsImpl.setBillOfLadingNo(tempGoodsItems.getBillOfLadingNo());
		tempGoodsItemsImpl.setGoodItemCode(tempGoodsItems.getGoodItemCode());
		tempGoodsItemsImpl.setGoodItemDescription(tempGoodsItems.getGoodItemDescription());
		tempGoodsItemsImpl.setNumberOfPackage(tempGoodsItems.getNumberOfPackage());
		tempGoodsItemsImpl.setKindOfPackages(tempGoodsItems.getKindOfPackages());
		tempGoodsItemsImpl.setMarksandNosofGoods(tempGoodsItems.getMarksandNosofGoods());
		tempGoodsItemsImpl.setGrossWeight(tempGoodsItems.getGrossWeight());
		tempGoodsItemsImpl.setGrossWeightUnit(tempGoodsItems.getGrossWeightUnit());
		tempGoodsItemsImpl.setMeasurement(tempGoodsItems.getMeasurement());
		tempGoodsItemsImpl.setMeasurementUnit(tempGoodsItems.getMeasurementUnit());

		return tempGoodsItemsImpl;
	}

	/**
	 * Returns the temp goods items with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp goods items
	 * @return the temp goods items
	 * @throws com.liferay.portal.NoSuchModelException if a temp goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGoodsItems findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp goods items with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempGoodsItemsException} if it could not be found.
	 *
	 * @param id the primary key of the temp goods items
	 * @return the temp goods items
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGoodsItemsException if a temp goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGoodsItems findByPrimaryKey(long id)
		throws NoSuchTempGoodsItemsException, SystemException {
		TempGoodsItems tempGoodsItems = fetchByPrimaryKey(id);

		if (tempGoodsItems == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempGoodsItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempGoodsItems;
	}

	/**
	 * Returns the temp goods items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp goods items
	 * @return the temp goods items, or <code>null</code> if a temp goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGoodsItems fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp goods items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp goods items
	 * @return the temp goods items, or <code>null</code> if a temp goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGoodsItems fetchByPrimaryKey(long id) throws SystemException {
		TempGoodsItems tempGoodsItems = (TempGoodsItems)EntityCacheUtil.getResult(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempGoodsItemsImpl.class, id);

		if (tempGoodsItems == _nullTempGoodsItems) {
			return null;
		}

		if (tempGoodsItems == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempGoodsItems = (TempGoodsItems)session.get(TempGoodsItemsImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempGoodsItems != null) {
					cacheResult(tempGoodsItems);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempGoodsItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempGoodsItemsImpl.class, id, _nullTempGoodsItems);
				}

				closeSession(session);
			}
		}

		return tempGoodsItems;
	}

	/**
	 * Returns all the temp goods itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGoodsItems> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp goods itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp goods itemses
	 * @param end the upper bound of the range of temp goods itemses (not inclusive)
	 * @return the range of matching temp goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGoodsItems> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp goods itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp goods itemses
	 * @param end the upper bound of the range of temp goods itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGoodsItems> findByRequestCode(String requestCode,
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

		List<TempGoodsItems> list = (List<TempGoodsItems>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPGOODSITEMS_WHERE);

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
				query.append(TempGoodsItemsModelImpl.ORDER_BY_JPQL);
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

				list = (List<TempGoodsItems>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp goods items in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp goods items
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGoodsItemsException if a matching temp goods items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGoodsItems findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempGoodsItemsException, SystemException {
		List<TempGoodsItems> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempGoodsItemsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp goods items in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp goods items
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGoodsItemsException if a matching temp goods items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGoodsItems findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempGoodsItemsException, SystemException {
		int count = countByRequestCode(requestCode);

		List<TempGoodsItems> list = findByRequestCode(requestCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempGoodsItemsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp goods itemses before and after the current temp goods items in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp goods items
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp goods items
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGoodsItemsException if a temp goods items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGoodsItems[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempGoodsItemsException, SystemException {
		TempGoodsItems tempGoodsItems = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempGoodsItems[] array = new TempGoodsItemsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session, tempGoodsItems,
					requestCode, orderByComparator, true);

			array[1] = tempGoodsItems;

			array[2] = getByRequestCode_PrevAndNext(session, tempGoodsItems,
					requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempGoodsItems getByRequestCode_PrevAndNext(Session session,
		TempGoodsItems tempGoodsItems, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPGOODSITEMS_WHERE);

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
			query.append(TempGoodsItemsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempGoodsItems);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempGoodsItems> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp goods itemses.
	 *
	 * @return the temp goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGoodsItems> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp goods itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp goods itemses
	 * @param end the upper bound of the range of temp goods itemses (not inclusive)
	 * @return the range of temp goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGoodsItems> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp goods itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp goods itemses
	 * @param end the upper bound of the range of temp goods itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGoodsItems> findAll(int start, int end,
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

		List<TempGoodsItems> list = (List<TempGoodsItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPGOODSITEMS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPGOODSITEMS.concat(TempGoodsItemsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempGoodsItems>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempGoodsItems>)QueryUtil.list(q,
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
	 * Removes all the temp goods itemses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempGoodsItems tempGoodsItems : findByRequestCode(requestCode)) {
			remove(tempGoodsItems);
		}
	}

	/**
	 * Removes all the temp goods itemses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempGoodsItems tempGoodsItems : findAll()) {
			remove(tempGoodsItems);
		}
	}

	/**
	 * Returns the number of temp goods itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPGOODSITEMS_WHERE);

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
	 * Returns the number of temp goods itemses.
	 *
	 * @return the number of temp goods itemses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPGOODSITEMS);

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
	 * Initializes the temp goods items persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempGoodsItems")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempGoodsItems>> listenersList = new ArrayList<ModelListener<TempGoodsItems>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempGoodsItems>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempGoodsItemsImpl.class.getName());
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
	private static final String _SQL_SELECT_TEMPGOODSITEMS = "SELECT tempGoodsItems FROM TempGoodsItems tempGoodsItems";
	private static final String _SQL_SELECT_TEMPGOODSITEMS_WHERE = "SELECT tempGoodsItems FROM TempGoodsItems tempGoodsItems WHERE ";
	private static final String _SQL_COUNT_TEMPGOODSITEMS = "SELECT COUNT(tempGoodsItems) FROM TempGoodsItems tempGoodsItems";
	private static final String _SQL_COUNT_TEMPGOODSITEMS_WHERE = "SELECT COUNT(tempGoodsItems) FROM TempGoodsItems tempGoodsItems WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempGoodsItems.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempGoodsItems.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempGoodsItems.requestCode IS NULL OR tempGoodsItems.requestCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempGoodsItems.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempGoodsItems exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempGoodsItems exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempGoodsItemsPersistenceImpl.class);
	private static TempGoodsItems _nullTempGoodsItems = new TempGoodsItemsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempGoodsItems> toCacheModel() {
				return _nullTempGoodsItemsCacheModel;
			}
		};

	private static CacheModel<TempGoodsItems> _nullTempGoodsItemsCacheModel = new CacheModel<TempGoodsItems>() {
			public TempGoodsItems toEntityModel() {
				return _nullTempGoodsItems;
			}
		};
}