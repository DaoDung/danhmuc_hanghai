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

import vn.gt.dao.danhmuc.NoSuchThamSoHeThongException;
import vn.gt.dao.danhmuc.model.ThamSoHeThong;
import vn.gt.dao.danhmuc.model.impl.ThamSoHeThongImpl;
import vn.gt.dao.danhmuc.model.impl.ThamSoHeThongModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tham so he thong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ThamSoHeThongPersistence
 * @see ThamSoHeThongUtil
 * @generated
 */
public class ThamSoHeThongPersistenceImpl extends BasePersistenceImpl<ThamSoHeThong>
	implements ThamSoHeThongPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ThamSoHeThongUtil} to access the tham so he thong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ThamSoHeThongImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_KEYDATA = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED,
			ThamSoHeThongImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByKeyData", new String[] { String.class.getName() },
			ThamSoHeThongModelImpl.KEYDATA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEYDATA = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByKeyData",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED,
			ThamSoHeThongImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByKeyDataAndDescription",
			new String[] { String.class.getName(), String.class.getName() },
			ThamSoHeThongModelImpl.KEYDATA_COLUMN_BITMASK |
			ThamSoHeThongModelImpl.DESCRIPTION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEYDATAANDDESCRIPTION = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByKeyDataAndDescription",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED,
			ThamSoHeThongImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED,
			ThamSoHeThongImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the tham so he thong in the entity cache if it is enabled.
	 *
	 * @param thamSoHeThong the tham so he thong
	 */
	public void cacheResult(ThamSoHeThong thamSoHeThong) {
		EntityCacheUtil.putResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey(),
			thamSoHeThong);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA,
			new Object[] { thamSoHeThong.getKeyData() }, thamSoHeThong);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
			new Object[] {
				thamSoHeThong.getKeyData(),
				
			thamSoHeThong.getDescription()
			}, thamSoHeThong);

		thamSoHeThong.resetOriginalValues();
	}

	/**
	 * Caches the tham so he thongs in the entity cache if it is enabled.
	 *
	 * @param thamSoHeThongs the tham so he thongs
	 */
	public void cacheResult(List<ThamSoHeThong> thamSoHeThongs) {
		for (ThamSoHeThong thamSoHeThong : thamSoHeThongs) {
			if (EntityCacheUtil.getResult(
						ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
						ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey()) == null) {
				cacheResult(thamSoHeThong);
			}
			else {
				thamSoHeThong.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tham so he thongs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ThamSoHeThongImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ThamSoHeThongImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tham so he thong.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ThamSoHeThong thamSoHeThong) {
		EntityCacheUtil.removeResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(thamSoHeThong);
	}

	@Override
	public void clearCache(List<ThamSoHeThong> thamSoHeThongs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ThamSoHeThong thamSoHeThong : thamSoHeThongs) {
			EntityCacheUtil.removeResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
				ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey());

			clearUniqueFindersCache(thamSoHeThong);
		}
	}

	protected void clearUniqueFindersCache(ThamSoHeThong thamSoHeThong) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATA,
			new Object[] { thamSoHeThong.getKeyData() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
			new Object[] {
				thamSoHeThong.getKeyData(),
				
			thamSoHeThong.getDescription()
			});
	}

	/**
	 * Creates a new tham so he thong with the primary key. Does not add the tham so he thong to the database.
	 *
	 * @param id the primary key for the new tham so he thong
	 * @return the new tham so he thong
	 */
	public ThamSoHeThong create(long id) {
		ThamSoHeThong thamSoHeThong = new ThamSoHeThongImpl();

		thamSoHeThong.setNew(true);
		thamSoHeThong.setPrimaryKey(id);

		return thamSoHeThong;
	}

	/**
	 * Removes the tham so he thong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tham so he thong
	 * @return the tham so he thong that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong remove(long id)
		throws NoSuchThamSoHeThongException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the tham so he thong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tham so he thong
	 * @return the tham so he thong that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong remove(Serializable primaryKey)
		throws NoSuchThamSoHeThongException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ThamSoHeThong thamSoHeThong = (ThamSoHeThong)session.get(ThamSoHeThongImpl.class,
					primaryKey);

			if (thamSoHeThong == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchThamSoHeThongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thamSoHeThong);
		}
		catch (NoSuchThamSoHeThongException nsee) {
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
	protected ThamSoHeThong removeImpl(ThamSoHeThong thamSoHeThong)
		throws SystemException {
		thamSoHeThong = toUnwrappedModel(thamSoHeThong);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, thamSoHeThong);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(thamSoHeThong);

		return thamSoHeThong;
	}

	@Override
	public ThamSoHeThong updateImpl(
		vn.gt.dao.danhmuc.model.ThamSoHeThong thamSoHeThong, boolean merge)
		throws SystemException {
		thamSoHeThong = toUnwrappedModel(thamSoHeThong);

		boolean isNew = thamSoHeThong.isNew();

		ThamSoHeThongModelImpl thamSoHeThongModelImpl = (ThamSoHeThongModelImpl)thamSoHeThong;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, thamSoHeThong, merge);

			thamSoHeThong.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ThamSoHeThongModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey(),
			thamSoHeThong);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA,
				new Object[] { thamSoHeThong.getKeyData() }, thamSoHeThong);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
				new Object[] {
					thamSoHeThong.getKeyData(),
					
				thamSoHeThong.getDescription()
				}, thamSoHeThong);
		}
		else {
			if ((thamSoHeThongModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_KEYDATA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thamSoHeThongModelImpl.getOriginalKeyData()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEYDATA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATA, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA,
					new Object[] { thamSoHeThong.getKeyData() }, thamSoHeThong);
			}

			if ((thamSoHeThongModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thamSoHeThongModelImpl.getOriginalKeyData(),
						
						thamSoHeThongModelImpl.getOriginalDescription()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEYDATAANDDESCRIPTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
					new Object[] {
						thamSoHeThong.getKeyData(),
						
					thamSoHeThong.getDescription()
					}, thamSoHeThong);
			}
		}

		return thamSoHeThong;
	}

	protected ThamSoHeThong toUnwrappedModel(ThamSoHeThong thamSoHeThong) {
		if (thamSoHeThong instanceof ThamSoHeThongImpl) {
			return thamSoHeThong;
		}

		ThamSoHeThongImpl thamSoHeThongImpl = new ThamSoHeThongImpl();

		thamSoHeThongImpl.setNew(thamSoHeThong.isNew());
		thamSoHeThongImpl.setPrimaryKey(thamSoHeThong.getPrimaryKey());

		thamSoHeThongImpl.setId(thamSoHeThong.getId());
		thamSoHeThongImpl.setValueData(thamSoHeThong.getValueData());
		thamSoHeThongImpl.setKeyData(thamSoHeThong.getKeyData());
		thamSoHeThongImpl.setDescription(thamSoHeThong.getDescription());

		return thamSoHeThongImpl;
	}

	/**
	 * Returns the tham so he thong with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tham so he thong
	 * @return the tham so he thong
	 * @throws com.liferay.portal.NoSuchModelException if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the tham so he thong with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchThamSoHeThongException} if it could not be found.
	 *
	 * @param id the primary key of the tham so he thong
	 * @return the tham so he thong
	 * @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong findByPrimaryKey(long id)
		throws NoSuchThamSoHeThongException, SystemException {
		ThamSoHeThong thamSoHeThong = fetchByPrimaryKey(id);

		if (thamSoHeThong == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchThamSoHeThongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return thamSoHeThong;
	}

	/**
	 * Returns the tham so he thong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tham so he thong
	 * @return the tham so he thong, or <code>null</code> if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the tham so he thong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tham so he thong
	 * @return the tham so he thong, or <code>null</code> if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong fetchByPrimaryKey(long id) throws SystemException {
		ThamSoHeThong thamSoHeThong = (ThamSoHeThong)EntityCacheUtil.getResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
				ThamSoHeThongImpl.class, id);

		if (thamSoHeThong == _nullThamSoHeThong) {
			return null;
		}

		if (thamSoHeThong == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				thamSoHeThong = (ThamSoHeThong)session.get(ThamSoHeThongImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (thamSoHeThong != null) {
					cacheResult(thamSoHeThong);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
						ThamSoHeThongImpl.class, id, _nullThamSoHeThong);
				}

				closeSession(session);
			}
		}

		return thamSoHeThong;
	}

	/**
	 * Returns the tham so he thong where keyData = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchThamSoHeThongException} if it could not be found.
	 *
	 * @param keyData the key data
	 * @return the matching tham so he thong
	 * @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong findByKeyData(String keyData)
		throws NoSuchThamSoHeThongException, SystemException {
		ThamSoHeThong thamSoHeThong = fetchByKeyData(keyData);

		if (thamSoHeThong == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("keyData=");
			msg.append(keyData);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchThamSoHeThongException(msg.toString());
		}

		return thamSoHeThong;
	}

	/**
	 * Returns the tham so he thong where keyData = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param keyData the key data
	 * @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong fetchByKeyData(String keyData)
		throws SystemException {
		return fetchByKeyData(keyData, true);
	}

	/**
	 * Returns the tham so he thong where keyData = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param keyData the key data
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong fetchByKeyData(String keyData,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { keyData };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_KEYDATA,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_THAMSOHETHONG_WHERE);

			if (keyData == null) {
				query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_1);
			}
			else {
				if (keyData.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_3);
				}
				else {
					query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_2);
				}
			}

			query.append(ThamSoHeThongModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (keyData != null) {
					qPos.add(keyData);
				}

				List<ThamSoHeThong> list = q.list();

				result = list;

				ThamSoHeThong thamSoHeThong = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA,
						finderArgs, list);
				}
				else {
					thamSoHeThong = list.get(0);

					cacheResult(thamSoHeThong);

					if ((thamSoHeThong.getKeyData() == null) ||
							!thamSoHeThong.getKeyData().equals(keyData)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA,
							finderArgs, thamSoHeThong);
					}
				}

				return thamSoHeThong;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATA,
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
				return (ThamSoHeThong)result;
			}
		}
	}

	/**
	 * Returns the tham so he thong where keyData = &#63; and description = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchThamSoHeThongException} if it could not be found.
	 *
	 * @param keyData the key data
	 * @param description the description
	 * @return the matching tham so he thong
	 * @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong findByKeyDataAndDescription(String keyData,
		String description)
		throws NoSuchThamSoHeThongException, SystemException {
		ThamSoHeThong thamSoHeThong = fetchByKeyDataAndDescription(keyData,
				description);

		if (thamSoHeThong == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("keyData=");
			msg.append(keyData);

			msg.append(", description=");
			msg.append(description);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchThamSoHeThongException(msg.toString());
		}

		return thamSoHeThong;
	}

	/**
	 * Returns the tham so he thong where keyData = &#63; and description = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param keyData the key data
	 * @param description the description
	 * @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong fetchByKeyDataAndDescription(String keyData,
		String description) throws SystemException {
		return fetchByKeyDataAndDescription(keyData, description, true);
	}

	/**
	 * Returns the tham so he thong where keyData = &#63; and description = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param keyData the key data
	 * @param description the description
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSoHeThong fetchByKeyDataAndDescription(String keyData,
		String description, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { keyData, description };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_THAMSOHETHONG_WHERE);

			if (keyData == null) {
				query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_1);
			}
			else {
				if (keyData.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_3);
				}
				else {
					query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_2);
				}
			}

			if (description == null) {
				query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_1);
			}
			else {
				if (description.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_3);
				}
				else {
					query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_2);
				}
			}

			query.append(ThamSoHeThongModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (keyData != null) {
					qPos.add(keyData);
				}

				if (description != null) {
					qPos.add(description);
				}

				List<ThamSoHeThong> list = q.list();

				result = list;

				ThamSoHeThong thamSoHeThong = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
						finderArgs, list);
				}
				else {
					thamSoHeThong = list.get(0);

					cacheResult(thamSoHeThong);

					if ((thamSoHeThong.getKeyData() == null) ||
							!thamSoHeThong.getKeyData().equals(keyData) ||
							(thamSoHeThong.getDescription() == null) ||
							!thamSoHeThong.getDescription().equals(description)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
							finderArgs, thamSoHeThong);
					}
				}

				return thamSoHeThong;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATAANDDESCRIPTION,
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
				return (ThamSoHeThong)result;
			}
		}
	}

	/**
	 * Returns all the tham so he thongs.
	 *
	 * @return the tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	public List<ThamSoHeThong> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tham so he thongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tham so he thongs
	 * @param end the upper bound of the range of tham so he thongs (not inclusive)
	 * @return the range of tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	public List<ThamSoHeThong> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tham so he thongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tham so he thongs
	 * @param end the upper bound of the range of tham so he thongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	public List<ThamSoHeThong> findAll(int start, int end,
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

		List<ThamSoHeThong> list = (List<ThamSoHeThong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THAMSOHETHONG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THAMSOHETHONG.concat(ThamSoHeThongModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ThamSoHeThong>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ThamSoHeThong>)QueryUtil.list(q, getDialect(),
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
	 * Removes the tham so he thong where keyData = &#63; from the database.
	 *
	 * @param keyData the key data
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByKeyData(String keyData)
		throws NoSuchThamSoHeThongException, SystemException {
		ThamSoHeThong thamSoHeThong = findByKeyData(keyData);

		remove(thamSoHeThong);
	}

	/**
	 * Removes the tham so he thong where keyData = &#63; and description = &#63; from the database.
	 *
	 * @param keyData the key data
	 * @param description the description
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByKeyDataAndDescription(String keyData, String description)
		throws NoSuchThamSoHeThongException, SystemException {
		ThamSoHeThong thamSoHeThong = findByKeyDataAndDescription(keyData,
				description);

		remove(thamSoHeThong);
	}

	/**
	 * Removes all the tham so he thongs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ThamSoHeThong thamSoHeThong : findAll()) {
			remove(thamSoHeThong);
		}
	}

	/**
	 * Returns the number of tham so he thongs where keyData = &#63;.
	 *
	 * @param keyData the key data
	 * @return the number of matching tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByKeyData(String keyData) throws SystemException {
		Object[] finderArgs = new Object[] { keyData };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_KEYDATA,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THAMSOHETHONG_WHERE);

			if (keyData == null) {
				query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_1);
			}
			else {
				if (keyData.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_3);
				}
				else {
					query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (keyData != null) {
					qPos.add(keyData);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_KEYDATA,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of tham so he thongs where keyData = &#63; and description = &#63;.
	 *
	 * @param keyData the key data
	 * @param description the description
	 * @return the number of matching tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByKeyDataAndDescription(String keyData, String description)
		throws SystemException {
		Object[] finderArgs = new Object[] { keyData, description };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_KEYDATAANDDESCRIPTION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_THAMSOHETHONG_WHERE);

			if (keyData == null) {
				query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_1);
			}
			else {
				if (keyData.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_3);
				}
				else {
					query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_2);
				}
			}

			if (description == null) {
				query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_1);
			}
			else {
				if (description.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_3);
				}
				else {
					query.append(_FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (keyData != null) {
					qPos.add(keyData);
				}

				if (description != null) {
					qPos.add(description);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_KEYDATAANDDESCRIPTION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of tham so he thongs.
	 *
	 * @return the number of tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_THAMSOHETHONG);

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
	 * Initializes the tham so he thong persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.ThamSoHeThong")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ThamSoHeThong>> listenersList = new ArrayList<ModelListener<ThamSoHeThong>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ThamSoHeThong>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ThamSoHeThongImpl.class.getName());
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
	private static final String _SQL_SELECT_THAMSOHETHONG = "SELECT thamSoHeThong FROM ThamSoHeThong thamSoHeThong";
	private static final String _SQL_SELECT_THAMSOHETHONG_WHERE = "SELECT thamSoHeThong FROM ThamSoHeThong thamSoHeThong WHERE ";
	private static final String _SQL_COUNT_THAMSOHETHONG = "SELECT COUNT(thamSoHeThong) FROM ThamSoHeThong thamSoHeThong";
	private static final String _SQL_COUNT_THAMSOHETHONG_WHERE = "SELECT COUNT(thamSoHeThong) FROM ThamSoHeThong thamSoHeThong WHERE ";
	private static final String _FINDER_COLUMN_KEYDATA_KEYDATA_1 = "thamSoHeThong.keyData IS NULL";
	private static final String _FINDER_COLUMN_KEYDATA_KEYDATA_2 = "thamSoHeThong.keyData = ?";
	private static final String _FINDER_COLUMN_KEYDATA_KEYDATA_3 = "(thamSoHeThong.keyData IS NULL OR thamSoHeThong.keyData = ?)";
	private static final String _FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_1 = "thamSoHeThong.keyData IS NULL AND ";
	private static final String _FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_2 = "thamSoHeThong.keyData = ? AND ";
	private static final String _FINDER_COLUMN_KEYDATAANDDESCRIPTION_KEYDATA_3 = "(thamSoHeThong.keyData IS NULL OR thamSoHeThong.keyData = ?) AND ";
	private static final String _FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_1 =
		"thamSoHeThong.description IS NULL";
	private static final String _FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_2 =
		"thamSoHeThong.description = ?";
	private static final String _FINDER_COLUMN_KEYDATAANDDESCRIPTION_DESCRIPTION_3 =
		"(thamSoHeThong.description IS NULL OR thamSoHeThong.description = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thamSoHeThong.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ThamSoHeThong exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ThamSoHeThong exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ThamSoHeThongPersistenceImpl.class);
	private static ThamSoHeThong _nullThamSoHeThong = new ThamSoHeThongImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ThamSoHeThong> toCacheModel() {
				return _nullThamSoHeThongCacheModel;
			}
		};

	private static CacheModel<ThamSoHeThong> _nullThamSoHeThongCacheModel = new CacheModel<ThamSoHeThong>() {
			public ThamSoHeThong toEntityModel() {
				return _nullThamSoHeThong;
			}
		};
}