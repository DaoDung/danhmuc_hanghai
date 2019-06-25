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

import vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;
import vn.gt.dao.danhmuc.model.DmHistoryGoods;
import vn.gt.dao.danhmuc.model.impl.DmHistoryGoodsImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryGoodsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history goods service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryGoodsPersistence
 * @see DmHistoryGoodsUtil
 * @generated
 */
public class DmHistoryGoodsPersistenceImpl extends BasePersistenceImpl<DmHistoryGoods>
	implements DmHistoryGoodsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryGoodsUtil} to access the dm history goods persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryGoodsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSITEMCODE =
		new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGoodsItemCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE =
		new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGoodsItemCode",
			new String[] { String.class.getName() },
			DmHistoryGoodsModelImpl.GOODSITEMCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSITEMCODE = new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGoodsItemCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION =
		new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByGoodsItemCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryGoodsModelImpl.GOODSITEMCODE_COLUMN_BITMASK |
			DmHistoryGoodsModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION =
		new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGoodsItemCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history goods in the entity cache if it is enabled.
	 *
	 * @param dmHistoryGoods the dm history goods
	 */
	public void cacheResult(DmHistoryGoods dmHistoryGoods) {
		EntityCacheUtil.putResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey(),
			dmHistoryGoods);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryGoods.getGoodsItemCode(),
				
			dmHistoryGoods.getSyncVersion()
			}, dmHistoryGoods);

		dmHistoryGoods.resetOriginalValues();
	}

	/**
	 * Caches the dm history goodses in the entity cache if it is enabled.
	 *
	 * @param dmHistoryGoodses the dm history goodses
	 */
	public void cacheResult(List<DmHistoryGoods> dmHistoryGoodses) {
		for (DmHistoryGoods dmHistoryGoods : dmHistoryGoodses) {
			if (EntityCacheUtil.getResult(
						DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey()) == null) {
				cacheResult(dmHistoryGoods);
			}
			else {
				dmHistoryGoods.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history goodses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryGoodsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryGoodsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history goods.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryGoods dmHistoryGoods) {
		EntityCacheUtil.removeResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryGoods);
	}

	@Override
	public void clearCache(List<DmHistoryGoods> dmHistoryGoodses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryGoods dmHistoryGoods : dmHistoryGoodses) {
			EntityCacheUtil.removeResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryGoods);
		}
	}

	protected void clearUniqueFindersCache(DmHistoryGoods dmHistoryGoods) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryGoods.getGoodsItemCode(),
				
			dmHistoryGoods.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history goods with the primary key. Does not add the dm history goods to the database.
	 *
	 * @param id the primary key for the new dm history goods
	 * @return the new dm history goods
	 */
	public DmHistoryGoods create(int id) {
		DmHistoryGoods dmHistoryGoods = new DmHistoryGoodsImpl();

		dmHistoryGoods.setNew(true);
		dmHistoryGoods.setPrimaryKey(id);

		return dmHistoryGoods;
	}

	/**
	 * Removes the dm history goods with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history goods
	 * @return the dm history goods that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods remove(int id)
		throws NoSuchDmHistoryGoodsException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm history goods with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history goods
	 * @return the dm history goods that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods remove(Serializable primaryKey)
		throws NoSuchDmHistoryGoodsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryGoods dmHistoryGoods = (DmHistoryGoods)session.get(DmHistoryGoodsImpl.class,
					primaryKey);

			if (dmHistoryGoods == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryGoodsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryGoods);
		}
		catch (NoSuchDmHistoryGoodsException nsee) {
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
	protected DmHistoryGoods removeImpl(DmHistoryGoods dmHistoryGoods)
		throws SystemException {
		dmHistoryGoods = toUnwrappedModel(dmHistoryGoods);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryGoods);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmHistoryGoods);

		return dmHistoryGoods;
	}

	@Override
	public DmHistoryGoods updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryGoods dmHistoryGoods, boolean merge)
		throws SystemException {
		dmHistoryGoods = toUnwrappedModel(dmHistoryGoods);

		boolean isNew = dmHistoryGoods.isNew();

		DmHistoryGoodsModelImpl dmHistoryGoodsModelImpl = (DmHistoryGoodsModelImpl)dmHistoryGoods;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryGoods, merge);

			dmHistoryGoods.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryGoodsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryGoodsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryGoodsModelImpl.getOriginalGoodsItemCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE,
					args);

				args = new Object[] { dmHistoryGoodsModelImpl.getGoodsItemCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey(),
			dmHistoryGoods);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
				new Object[] {
					dmHistoryGoods.getGoodsItemCode(),
					
				dmHistoryGoods.getSyncVersion()
				}, dmHistoryGoods);
		}
		else {
			if ((dmHistoryGoodsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryGoodsModelImpl.getOriginalGoodsItemCode(),
						
						dmHistoryGoodsModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
					new Object[] {
						dmHistoryGoods.getGoodsItemCode(),
						
					dmHistoryGoods.getSyncVersion()
					}, dmHistoryGoods);
			}
		}

		return dmHistoryGoods;
	}

	protected DmHistoryGoods toUnwrappedModel(DmHistoryGoods dmHistoryGoods) {
		if (dmHistoryGoods instanceof DmHistoryGoodsImpl) {
			return dmHistoryGoods;
		}

		DmHistoryGoodsImpl dmHistoryGoodsImpl = new DmHistoryGoodsImpl();

		dmHistoryGoodsImpl.setNew(dmHistoryGoods.isNew());
		dmHistoryGoodsImpl.setPrimaryKey(dmHistoryGoods.getPrimaryKey());

		dmHistoryGoodsImpl.setId(dmHistoryGoods.getId());
		dmHistoryGoodsImpl.setGoodsItemCode(dmHistoryGoods.getGoodsItemCode());
		dmHistoryGoodsImpl.setGoodsItemName(dmHistoryGoods.getGoodsItemName());
		dmHistoryGoodsImpl.setGoodsItemNameVN(dmHistoryGoods.getGoodsItemNameVN());
		dmHistoryGoodsImpl.setGoodsItemOrder(dmHistoryGoods.getGoodsItemOrder());
		dmHistoryGoodsImpl.setIsDelete(dmHistoryGoods.getIsDelete());
		dmHistoryGoodsImpl.setMarkedAsDelete(dmHistoryGoods.getMarkedAsDelete());
		dmHistoryGoodsImpl.setModifiedDate(dmHistoryGoods.getModifiedDate());
		dmHistoryGoodsImpl.setRequestedDate(dmHistoryGoods.getRequestedDate());
		dmHistoryGoodsImpl.setSyncVersion(dmHistoryGoods.getSyncVersion());

		return dmHistoryGoodsImpl;
	}

	/**
	 * Returns the dm history goods with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history goods
	 * @return the dm history goods
	 * @throws com.liferay.portal.NoSuchModelException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history goods with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException} if it could not be found.
	 *
	 * @param id the primary key of the dm history goods
	 * @return the dm history goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods findByPrimaryKey(int id)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = fetchByPrimaryKey(id);

		if (dmHistoryGoods == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryGoodsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryGoods;
	}

	/**
	 * Returns the dm history goods with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history goods
	 * @return the dm history goods, or <code>null</code> if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history goods with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history goods
	 * @return the dm history goods, or <code>null</code> if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods fetchByPrimaryKey(int id) throws SystemException {
		DmHistoryGoods dmHistoryGoods = (DmHistoryGoods)EntityCacheUtil.getResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryGoodsImpl.class, id);

		if (dmHistoryGoods == _nullDmHistoryGoods) {
			return null;
		}

		if (dmHistoryGoods == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryGoods = (DmHistoryGoods)session.get(DmHistoryGoodsImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryGoods != null) {
					cacheResult(dmHistoryGoods);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryGoodsImpl.class, id, _nullDmHistoryGoods);
				}

				closeSession(session);
			}
		}

		return dmHistoryGoods;
	}

	/**
	 * Returns all the dm history goodses where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @return the matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryGoods> findByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		return findByGoodsItemCode(goodsItemCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history goodses where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param start the lower bound of the range of dm history goodses
	 * @param end the upper bound of the range of dm history goodses (not inclusive)
	 * @return the range of matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryGoods> findByGoodsItemCode(String goodsItemCode,
		int start, int end) throws SystemException {
		return findByGoodsItemCode(goodsItemCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history goodses where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param start the lower bound of the range of dm history goodses
	 * @param end the upper bound of the range of dm history goodses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryGoods> findByGoodsItemCode(String goodsItemCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<DmHistoryGoods> list = (List<DmHistoryGoods>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMHISTORYGOODS_WHERE);

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
				query.append(DmHistoryGoodsModelImpl.ORDER_BY_JPQL);
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

				list = (List<DmHistoryGoods>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm history goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods findByGoodsItemCode_First(String goodsItemCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsException, SystemException {
		List<DmHistoryGoods> list = findByGoodsItemCode(goodsItemCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsItemCode=");
			msg.append(goodsItemCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryGoodsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm history goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods findByGoodsItemCode_Last(String goodsItemCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsException, SystemException {
		int count = countByGoodsItemCode(goodsItemCode);

		List<DmHistoryGoods> list = findByGoodsItemCode(goodsItemCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsItemCode=");
			msg.append(goodsItemCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmHistoryGoodsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm history goodses before and after the current dm history goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm history goods
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods[] findByGoodsItemCode_PrevAndNext(int id,
		String goodsItemCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryGoods[] array = new DmHistoryGoodsImpl[3];

			array[0] = getByGoodsItemCode_PrevAndNext(session, dmHistoryGoods,
					goodsItemCode, orderByComparator, true);

			array[1] = dmHistoryGoods;

			array[2] = getByGoodsItemCode_PrevAndNext(session, dmHistoryGoods,
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

	protected DmHistoryGoods getByGoodsItemCode_PrevAndNext(Session session,
		DmHistoryGoods dmHistoryGoods, String goodsItemCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYGOODS_WHERE);

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
			query.append(DmHistoryGoodsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryGoods);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryGoods> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException} if it could not be found.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @return the matching dm history goods
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods findByGoodsItemCodeAndSyncVersion(
		String goodsItemCode, String syncVersion)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = fetchByGoodsItemCodeAndSyncVersion(goodsItemCode,
				syncVersion);

		if (dmHistoryGoods == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsItemCode=");
			msg.append(goodsItemCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryGoodsException(msg.toString());
		}

		return dmHistoryGoods;
	}

	/**
	 * Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @return the matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods fetchByGoodsItemCodeAndSyncVersion(
		String goodsItemCode, String syncVersion) throws SystemException {
		return fetchByGoodsItemCodeAndSyncVersion(goodsItemCode, syncVersion,
			true);
	}

	/**
	 * Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryGoods fetchByGoodsItemCodeAndSyncVersion(
		String goodsItemCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { goodsItemCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYGOODS_WHERE);

			if (goodsItemCode == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_1);
			}
			else {
				if (goodsItemCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryGoodsModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (goodsItemCode != null) {
					qPos.add(goodsItemCode);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryGoods> list = q.list();

				result = list;

				DmHistoryGoods dmHistoryGoods = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryGoods = list.get(0);

					cacheResult(dmHistoryGoods);

					if ((dmHistoryGoods.getGoodsItemCode() == null) ||
							!dmHistoryGoods.getGoodsItemCode()
											   .equals(goodsItemCode) ||
							(dmHistoryGoods.getSyncVersion() == null) ||
							!dmHistoryGoods.getSyncVersion().equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
							finderArgs, dmHistoryGoods);
					}
				}

				return dmHistoryGoods;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
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
				return (DmHistoryGoods)result;
			}
		}
	}

	/**
	 * Returns all the dm history goodses.
	 *
	 * @return the dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryGoods> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history goodses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history goodses
	 * @param end the upper bound of the range of dm history goodses (not inclusive)
	 * @return the range of dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryGoods> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history goodses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history goodses
	 * @param end the upper bound of the range of dm history goodses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryGoods> findAll(int start, int end,
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

		List<DmHistoryGoods> list = (List<DmHistoryGoods>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYGOODS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYGOODS.concat(DmHistoryGoodsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryGoods>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryGoods>)QueryUtil.list(q,
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
	 * Removes all the dm history goodses where goodsItemCode = &#63; from the database.
	 *
	 * @param goodsItemCode the goods item code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		for (DmHistoryGoods dmHistoryGoods : findByGoodsItemCode(goodsItemCode)) {
			remove(dmHistoryGoods);
		}
	}

	/**
	 * Removes the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGoodsItemCodeAndSyncVersion(String goodsItemCode,
		String syncVersion)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = findByGoodsItemCodeAndSyncVersion(goodsItemCode,
				syncVersion);

		remove(dmHistoryGoods);
	}

	/**
	 * Removes all the dm history goodses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryGoods dmHistoryGoods : findAll()) {
			remove(dmHistoryGoods);
		}
	}

	/**
	 * Returns the number of dm history goodses where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @return the number of matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { goodsItemCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYGOODS_WHERE);

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
	 * Returns the number of dm history goodses where goodsItemCode = &#63; and syncVersion = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGoodsItemCodeAndSyncVersion(String goodsItemCode,
		String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { goodsItemCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYGOODS_WHERE);

			if (goodsItemCode == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_1);
			}
			else {
				if (goodsItemCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history goodses.
	 *
	 * @return the number of dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYGOODS);

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
	 * Initializes the dm history goods persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryGoods")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryGoods>> listenersList = new ArrayList<ModelListener<DmHistoryGoods>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryGoods>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryGoodsImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYGOODS = "SELECT dmHistoryGoods FROM DmHistoryGoods dmHistoryGoods";
	private static final String _SQL_SELECT_DMHISTORYGOODS_WHERE = "SELECT dmHistoryGoods FROM DmHistoryGoods dmHistoryGoods WHERE ";
	private static final String _SQL_COUNT_DMHISTORYGOODS = "SELECT COUNT(dmHistoryGoods) FROM DmHistoryGoods dmHistoryGoods";
	private static final String _SQL_COUNT_DMHISTORYGOODS_WHERE = "SELECT COUNT(dmHistoryGoods) FROM DmHistoryGoods dmHistoryGoods WHERE ";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1 = "dmHistoryGoods.goodsItemCode IS NULL";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2 = "dmHistoryGoods.goodsItemCode = ?";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3 = "(dmHistoryGoods.goodsItemCode IS NULL OR dmHistoryGoods.goodsItemCode = ?)";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_1 =
		"dmHistoryGoods.goodsItemCode IS NULL AND ";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_2 =
		"dmHistoryGoods.goodsItemCode = ? AND ";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_3 =
		"(dmHistoryGoods.goodsItemCode IS NULL OR dmHistoryGoods.goodsItemCode = ?) AND ";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryGoods.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryGoods.syncVersion = ?";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryGoods.syncVersion IS NULL OR dmHistoryGoods.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryGoods.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryGoods exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryGoods exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryGoodsPersistenceImpl.class);
	private static DmHistoryGoods _nullDmHistoryGoods = new DmHistoryGoodsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryGoods> toCacheModel() {
				return _nullDmHistoryGoodsCacheModel;
			}
		};

	private static CacheModel<DmHistoryGoods> _nullDmHistoryGoodsCacheModel = new CacheModel<DmHistoryGoods>() {
			public DmHistoryGoods toEntityModel() {
				return _nullDmHistoryGoods;
			}
		};
}