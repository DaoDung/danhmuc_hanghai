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

import vn.gt.dao.danhmuc.NoSuchDmGoodsException;
import vn.gt.dao.danhmuc.model.DmGoods;
import vn.gt.dao.danhmuc.model.impl.DmGoodsImpl;
import vn.gt.dao.danhmuc.model.impl.DmGoodsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm goods service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGoodsPersistence
 * @see DmGoodsUtil
 * @generated
 */
public class DmGoodsPersistenceImpl extends BasePersistenceImpl<DmGoods>
	implements DmGoodsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGoodsUtil} to access the dm goods persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGoodsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSITEMCODE =
		new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, DmGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGoodsItemCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE =
		new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, DmGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGoodsItemCode",
			new String[] { String.class.getName() },
			DmGoodsModelImpl.GOODSITEMCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSITEMCODE = new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGoodsItemCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, DmGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, DmGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm goods in the entity cache if it is enabled.
	 *
	 * @param dmGoods the dm goods
	 */
	public void cacheResult(DmGoods dmGoods) {
		EntityCacheUtil.putResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsImpl.class, dmGoods.getPrimaryKey(), dmGoods);

		dmGoods.resetOriginalValues();
	}

	/**
	 * Caches the dm goodses in the entity cache if it is enabled.
	 *
	 * @param dmGoodses the dm goodses
	 */
	public void cacheResult(List<DmGoods> dmGoodses) {
		for (DmGoods dmGoods : dmGoodses) {
			if (EntityCacheUtil.getResult(
						DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
						DmGoodsImpl.class, dmGoods.getPrimaryKey()) == null) {
				cacheResult(dmGoods);
			}
			else {
				dmGoods.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm goodses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGoodsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGoodsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm goods.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGoods dmGoods) {
		EntityCacheUtil.removeResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsImpl.class, dmGoods.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmGoods> dmGoodses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGoods dmGoods : dmGoodses) {
			EntityCacheUtil.removeResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
				DmGoodsImpl.class, dmGoods.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm goods with the primary key. Does not add the dm goods to the database.
	 *
	 * @param id the primary key for the new dm goods
	 * @return the new dm goods
	 */
	public DmGoods create(int id) {
		DmGoods dmGoods = new DmGoodsImpl();

		dmGoods.setNew(true);
		dmGoods.setPrimaryKey(id);

		return dmGoods;
	}

	/**
	 * Removes the dm goods with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm goods
	 * @return the dm goods that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoods remove(int id)
		throws NoSuchDmGoodsException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm goods with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm goods
	 * @return the dm goods that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods remove(Serializable primaryKey)
		throws NoSuchDmGoodsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGoods dmGoods = (DmGoods)session.get(DmGoodsImpl.class, primaryKey);

			if (dmGoods == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGoodsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGoods);
		}
		catch (NoSuchDmGoodsException nsee) {
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
	protected DmGoods removeImpl(DmGoods dmGoods) throws SystemException {
		dmGoods = toUnwrappedModel(dmGoods);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGoods);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmGoods);

		return dmGoods;
	}

	@Override
	public DmGoods updateImpl(vn.gt.dao.danhmuc.model.DmGoods dmGoods,
		boolean merge) throws SystemException {
		dmGoods = toUnwrappedModel(dmGoods);

		boolean isNew = dmGoods.isNew();

		DmGoodsModelImpl dmGoodsModelImpl = (DmGoodsModelImpl)dmGoods;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGoods, merge);

			dmGoods.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGoodsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmGoodsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGoodsModelImpl.getOriginalGoodsItemCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE,
					args);

				args = new Object[] { dmGoodsModelImpl.getGoodsItemCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsImpl.class, dmGoods.getPrimaryKey(), dmGoods);

		return dmGoods;
	}

	protected DmGoods toUnwrappedModel(DmGoods dmGoods) {
		if (dmGoods instanceof DmGoodsImpl) {
			return dmGoods;
		}

		DmGoodsImpl dmGoodsImpl = new DmGoodsImpl();

		dmGoodsImpl.setNew(dmGoods.isNew());
		dmGoodsImpl.setPrimaryKey(dmGoods.getPrimaryKey());

		dmGoodsImpl.setId(dmGoods.getId());
		dmGoodsImpl.setGoodsItemCode(dmGoods.getGoodsItemCode());
		dmGoodsImpl.setGoodsItemName(dmGoods.getGoodsItemName());
		dmGoodsImpl.setGoodsItemNameVN(dmGoods.getGoodsItemNameVN());
		dmGoodsImpl.setGoodsItemOrder(dmGoods.getGoodsItemOrder());
		dmGoodsImpl.setIsDelete(dmGoods.getIsDelete());
		dmGoodsImpl.setMarkedAsDelete(dmGoods.getMarkedAsDelete());
		dmGoodsImpl.setModifiedDate(dmGoods.getModifiedDate());
		dmGoodsImpl.setRequestedDate(dmGoods.getRequestedDate());
		dmGoodsImpl.setSyncVersion(dmGoods.getSyncVersion());

		return dmGoodsImpl;
	}

	/**
	 * Returns the dm goods with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm goods
	 * @return the dm goods
	 * @throws com.liferay.portal.NoSuchModelException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm goods with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmGoodsException} if it could not be found.
	 *
	 * @param id the primary key of the dm goods
	 * @return the dm goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoods findByPrimaryKey(int id)
		throws NoSuchDmGoodsException, SystemException {
		DmGoods dmGoods = fetchByPrimaryKey(id);

		if (dmGoods == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGoodsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGoods;
	}

	/**
	 * Returns the dm goods with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm goods
	 * @return the dm goods, or <code>null</code> if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm goods with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm goods
	 * @return the dm goods, or <code>null</code> if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoods fetchByPrimaryKey(int id) throws SystemException {
		DmGoods dmGoods = (DmGoods)EntityCacheUtil.getResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
				DmGoodsImpl.class, id);

		if (dmGoods == _nullDmGoods) {
			return null;
		}

		if (dmGoods == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGoods = (DmGoods)session.get(DmGoodsImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGoods != null) {
					cacheResult(dmGoods);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
						DmGoodsImpl.class, id, _nullDmGoods);
				}

				closeSession(session);
			}
		}

		return dmGoods;
	}

	/**
	 * Returns all the dm goodses where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @return the matching dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoods> findByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		return findByGoodsItemCode(goodsItemCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm goodses where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param start the lower bound of the range of dm goodses
	 * @param end the upper bound of the range of dm goodses (not inclusive)
	 * @return the range of matching dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoods> findByGoodsItemCode(String goodsItemCode, int start,
		int end) throws SystemException {
		return findByGoodsItemCode(goodsItemCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm goodses where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param start the lower bound of the range of dm goodses
	 * @param end the upper bound of the range of dm goodses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoods> findByGoodsItemCode(String goodsItemCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE;
			finderArgs = new Object[] { goodsItemCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSITEMCODE;
			finderArgs = new Object[] {
					goodsItemCode,
					
					start, end, orderByComparator
				};
		}

		List<DmGoods> list = (List<DmGoods>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMGOODS_WHERE);

			if (goodsItemCode == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1);
			}
			else {
				if (goodsItemCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmGoodsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (goodsItemCode != null) {
					qPos.add(goodsItemCode);
				}

				list = (List<DmGoods>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first dm goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a matching dm goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoods findByGoodsItemCode_First(String goodsItemCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmGoodsException, SystemException {
		List<DmGoods> list = findByGoodsItemCode(goodsItemCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsItemCode=");
			msg.append(goodsItemCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGoodsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a matching dm goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoods findByGoodsItemCode_Last(String goodsItemCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmGoodsException, SystemException {
		int count = countByGoodsItemCode(goodsItemCode);

		List<DmGoods> list = findByGoodsItemCode(goodsItemCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsItemCode=");
			msg.append(goodsItemCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGoodsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm goodses before and after the current dm goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm goods
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGoods[] findByGoodsItemCode_PrevAndNext(int id,
		String goodsItemCode, OrderByComparator orderByComparator)
		throws NoSuchDmGoodsException, SystemException {
		DmGoods dmGoods = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGoods[] array = new DmGoodsImpl[3];

			array[0] = getByGoodsItemCode_PrevAndNext(session, dmGoods,
					goodsItemCode, orderByComparator, true);

			array[1] = dmGoods;

			array[2] = getByGoodsItemCode_PrevAndNext(session, dmGoods,
					goodsItemCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGoods getByGoodsItemCode_PrevAndNext(Session session,
		DmGoods dmGoods, String goodsItemCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGOODS_WHERE);

		if (goodsItemCode == null) {
			query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1);
		}
		else {
			if (goodsItemCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2);
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
			query.append(DmGoodsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (goodsItemCode != null) {
			qPos.add(goodsItemCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGoods);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGoods> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm goodses.
	 *
	 * @return the dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoods> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm goodses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm goodses
	 * @param end the upper bound of the range of dm goodses (not inclusive)
	 * @return the range of dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoods> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm goodses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm goodses
	 * @param end the upper bound of the range of dm goodses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGoods> findAll(int start, int end,
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

		List<DmGoods> list = (List<DmGoods>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGOODS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGOODS.concat(DmGoodsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGoods>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGoods>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm goodses where goodsItemCode = &#63; from the database.
	 *
	 * @param goodsItemCode the goods item code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		for (DmGoods dmGoods : findByGoodsItemCode(goodsItemCode)) {
			remove(dmGoods);
		}
	}

	/**
	 * Removes all the dm goodses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGoods dmGoods : findAll()) {
			remove(dmGoods);
		}
	}

	/**
	 * Returns the number of dm goodses where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @return the number of matching dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { goodsItemCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGOODS_WHERE);

			if (goodsItemCode == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1);
			}
			else {
				if (goodsItemCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (goodsItemCode != null) {
					qPos.add(goodsItemCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm goodses.
	 *
	 * @return the number of dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGOODS);

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
	 * Initializes the dm goods persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmGoods")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGoods>> listenersList = new ArrayList<ModelListener<DmGoods>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGoods>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGoodsImpl.class.getName());
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
	private static final String _SQL_SELECT_DMGOODS = "SELECT dmGoods FROM DmGoods dmGoods";
	private static final String _SQL_SELECT_DMGOODS_WHERE = "SELECT dmGoods FROM DmGoods dmGoods WHERE ";
	private static final String _SQL_COUNT_DMGOODS = "SELECT COUNT(dmGoods) FROM DmGoods dmGoods";
	private static final String _SQL_COUNT_DMGOODS_WHERE = "SELECT COUNT(dmGoods) FROM DmGoods dmGoods WHERE ";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1 = "dmGoods.goodsItemCode IS NULL";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2 = "dmGoods.goodsItemCode = ?";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3 = "(dmGoods.goodsItemCode IS NULL OR dmGoods.goodsItemCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGoods.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGoods exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGoods exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGoodsPersistenceImpl.class);
	private static DmGoods _nullDmGoods = new DmGoodsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGoods> toCacheModel() {
				return _nullDmGoodsCacheModel;
			}
		};

	private static CacheModel<DmGoods> _nullDmGoodsCacheModel = new CacheModel<DmGoods>() {
			public DmGoods toEntityModel() {
				return _nullDmGoods;
			}
		};
}