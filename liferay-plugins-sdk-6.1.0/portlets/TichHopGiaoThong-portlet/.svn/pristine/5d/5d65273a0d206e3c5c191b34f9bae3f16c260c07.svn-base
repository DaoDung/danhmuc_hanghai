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

import vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException;
import vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig;
import vn.gt.dao.noticeandmessage.model.impl.TempMaritimePaymentConfigImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempMaritimePaymentConfigModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp maritime payment config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempMaritimePaymentConfigPersistence
 * @see TempMaritimePaymentConfigUtil
 * @generated
 */
public class TempMaritimePaymentConfigPersistenceImpl
	extends BasePersistenceImpl<TempMaritimePaymentConfig>
	implements TempMaritimePaymentConfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempMaritimePaymentConfigUtil} to access the temp maritime payment config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempMaritimePaymentConfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_MARITIMECODE = new FinderPath(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
			TempMaritimePaymentConfigModelImpl.FINDER_CACHE_ENABLED,
			TempMaritimePaymentConfigImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaritimeCode", new String[] { String.class.getName() },
			TempMaritimePaymentConfigModelImpl.MARITIMECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARITIMECODE = new FinderPath(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
			TempMaritimePaymentConfigModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMaritimeCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
			TempMaritimePaymentConfigModelImpl.FINDER_CACHE_ENABLED,
			TempMaritimePaymentConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
			TempMaritimePaymentConfigModelImpl.FINDER_CACHE_ENABLED,
			TempMaritimePaymentConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
			TempMaritimePaymentConfigModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the temp maritime payment config in the entity cache if it is enabled.
	 *
	 * @param tempMaritimePaymentConfig the temp maritime payment config
	 */
	public void cacheResult(TempMaritimePaymentConfig tempMaritimePaymentConfig) {
		EntityCacheUtil.putResult(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
			TempMaritimePaymentConfigImpl.class,
			tempMaritimePaymentConfig.getPrimaryKey(), tempMaritimePaymentConfig);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
			new Object[] { tempMaritimePaymentConfig.getMaritimeCode() },
			tempMaritimePaymentConfig);

		tempMaritimePaymentConfig.resetOriginalValues();
	}

	/**
	 * Caches the temp maritime payment configs in the entity cache if it is enabled.
	 *
	 * @param tempMaritimePaymentConfigs the temp maritime payment configs
	 */
	public void cacheResult(
		List<TempMaritimePaymentConfig> tempMaritimePaymentConfigs) {
		for (TempMaritimePaymentConfig tempMaritimePaymentConfig : tempMaritimePaymentConfigs) {
			if (EntityCacheUtil.getResult(
						TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
						TempMaritimePaymentConfigImpl.class,
						tempMaritimePaymentConfig.getPrimaryKey()) == null) {
				cacheResult(tempMaritimePaymentConfig);
			}
			else {
				tempMaritimePaymentConfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp maritime payment configs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempMaritimePaymentConfigImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempMaritimePaymentConfigImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp maritime payment config.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempMaritimePaymentConfig tempMaritimePaymentConfig) {
		EntityCacheUtil.removeResult(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
			TempMaritimePaymentConfigImpl.class,
			tempMaritimePaymentConfig.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tempMaritimePaymentConfig);
	}

	@Override
	public void clearCache(
		List<TempMaritimePaymentConfig> tempMaritimePaymentConfigs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempMaritimePaymentConfig tempMaritimePaymentConfig : tempMaritimePaymentConfigs) {
			EntityCacheUtil.removeResult(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
				TempMaritimePaymentConfigImpl.class,
				tempMaritimePaymentConfig.getPrimaryKey());

			clearUniqueFindersCache(tempMaritimePaymentConfig);
		}
	}

	protected void clearUniqueFindersCache(
		TempMaritimePaymentConfig tempMaritimePaymentConfig) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
			new Object[] { tempMaritimePaymentConfig.getMaritimeCode() });
	}

	/**
	 * Creates a new temp maritime payment config with the primary key. Does not add the temp maritime payment config to the database.
	 *
	 * @param id the primary key for the new temp maritime payment config
	 * @return the new temp maritime payment config
	 */
	public TempMaritimePaymentConfig create(long id) {
		TempMaritimePaymentConfig tempMaritimePaymentConfig = new TempMaritimePaymentConfigImpl();

		tempMaritimePaymentConfig.setNew(true);
		tempMaritimePaymentConfig.setPrimaryKey(id);

		return tempMaritimePaymentConfig;
	}

	/**
	 * Removes the temp maritime payment config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp maritime payment config
	 * @return the temp maritime payment config that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a temp maritime payment config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempMaritimePaymentConfig remove(long id)
		throws NoSuchTempMaritimePaymentConfigException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp maritime payment config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp maritime payment config
	 * @return the temp maritime payment config that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a temp maritime payment config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempMaritimePaymentConfig remove(Serializable primaryKey)
		throws NoSuchTempMaritimePaymentConfigException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempMaritimePaymentConfig tempMaritimePaymentConfig = (TempMaritimePaymentConfig)session.get(TempMaritimePaymentConfigImpl.class,
					primaryKey);

			if (tempMaritimePaymentConfig == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempMaritimePaymentConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempMaritimePaymentConfig);
		}
		catch (NoSuchTempMaritimePaymentConfigException nsee) {
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
	protected TempMaritimePaymentConfig removeImpl(
		TempMaritimePaymentConfig tempMaritimePaymentConfig)
		throws SystemException {
		tempMaritimePaymentConfig = toUnwrappedModel(tempMaritimePaymentConfig);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempMaritimePaymentConfig);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempMaritimePaymentConfig);

		return tempMaritimePaymentConfig;
	}

	@Override
	public TempMaritimePaymentConfig updateImpl(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig,
		boolean merge) throws SystemException {
		tempMaritimePaymentConfig = toUnwrappedModel(tempMaritimePaymentConfig);

		boolean isNew = tempMaritimePaymentConfig.isNew();

		TempMaritimePaymentConfigModelImpl tempMaritimePaymentConfigModelImpl = (TempMaritimePaymentConfigModelImpl)tempMaritimePaymentConfig;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempMaritimePaymentConfig, merge);

			tempMaritimePaymentConfig.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!TempMaritimePaymentConfigModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
			TempMaritimePaymentConfigImpl.class,
			tempMaritimePaymentConfig.getPrimaryKey(), tempMaritimePaymentConfig);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
				new Object[] { tempMaritimePaymentConfig.getMaritimeCode() },
				tempMaritimePaymentConfig);
		}
		else {
			if ((tempMaritimePaymentConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MARITIMECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempMaritimePaymentConfigModelImpl.getOriginalMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
					new Object[] { tempMaritimePaymentConfig.getMaritimeCode() },
					tempMaritimePaymentConfig);
			}
		}

		return tempMaritimePaymentConfig;
	}

	protected TempMaritimePaymentConfig toUnwrappedModel(
		TempMaritimePaymentConfig tempMaritimePaymentConfig) {
		if (tempMaritimePaymentConfig instanceof TempMaritimePaymentConfigImpl) {
			return tempMaritimePaymentConfig;
		}

		TempMaritimePaymentConfigImpl tempMaritimePaymentConfigImpl = new TempMaritimePaymentConfigImpl();

		tempMaritimePaymentConfigImpl.setNew(tempMaritimePaymentConfig.isNew());
		tempMaritimePaymentConfigImpl.setPrimaryKey(tempMaritimePaymentConfig.getPrimaryKey());

		tempMaritimePaymentConfigImpl.setId(tempMaritimePaymentConfig.getId());
		tempMaritimePaymentConfigImpl.setMaritimeCode(tempMaritimePaymentConfig.getMaritimeCode());
		tempMaritimePaymentConfigImpl.setMerchantCode(tempMaritimePaymentConfig.getMerchantCode());
		tempMaritimePaymentConfigImpl.setMerchantKey(tempMaritimePaymentConfig.getMerchantKey());
		tempMaritimePaymentConfigImpl.setMerchantName(tempMaritimePaymentConfig.getMerchantName());
		tempMaritimePaymentConfigImpl.setKeypayDomain(tempMaritimePaymentConfig.getKeypayDomain());
		tempMaritimePaymentConfigImpl.setKeypayVersion(tempMaritimePaymentConfig.getKeypayVersion());
		tempMaritimePaymentConfigImpl.setReturnURL(tempMaritimePaymentConfig.getReturnURL());

		return tempMaritimePaymentConfigImpl;
	}

	/**
	 * Returns the temp maritime payment config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp maritime payment config
	 * @return the temp maritime payment config
	 * @throws com.liferay.portal.NoSuchModelException if a temp maritime payment config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempMaritimePaymentConfig findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp maritime payment config with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException} if it could not be found.
	 *
	 * @param id the primary key of the temp maritime payment config
	 * @return the temp maritime payment config
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a temp maritime payment config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempMaritimePaymentConfig findByPrimaryKey(long id)
		throws NoSuchTempMaritimePaymentConfigException, SystemException {
		TempMaritimePaymentConfig tempMaritimePaymentConfig = fetchByPrimaryKey(id);

		if (tempMaritimePaymentConfig == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempMaritimePaymentConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempMaritimePaymentConfig;
	}

	/**
	 * Returns the temp maritime payment config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp maritime payment config
	 * @return the temp maritime payment config, or <code>null</code> if a temp maritime payment config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempMaritimePaymentConfig fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp maritime payment config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp maritime payment config
	 * @return the temp maritime payment config, or <code>null</code> if a temp maritime payment config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempMaritimePaymentConfig fetchByPrimaryKey(long id)
		throws SystemException {
		TempMaritimePaymentConfig tempMaritimePaymentConfig = (TempMaritimePaymentConfig)EntityCacheUtil.getResult(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
				TempMaritimePaymentConfigImpl.class, id);

		if (tempMaritimePaymentConfig == _nullTempMaritimePaymentConfig) {
			return null;
		}

		if (tempMaritimePaymentConfig == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempMaritimePaymentConfig = (TempMaritimePaymentConfig)session.get(TempMaritimePaymentConfigImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempMaritimePaymentConfig != null) {
					cacheResult(tempMaritimePaymentConfig);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempMaritimePaymentConfigModelImpl.ENTITY_CACHE_ENABLED,
						TempMaritimePaymentConfigImpl.class, id,
						_nullTempMaritimePaymentConfig);
				}

				closeSession(session);
			}
		}

		return tempMaritimePaymentConfig;
	}

	/**
	 * Returns the temp maritime payment config where maritimeCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException} if it could not be found.
	 *
	 * @param maritimeCode the maritime code
	 * @return the matching temp maritime payment config
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a matching temp maritime payment config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempMaritimePaymentConfig findByMaritimeCode(String maritimeCode)
		throws NoSuchTempMaritimePaymentConfigException, SystemException {
		TempMaritimePaymentConfig tempMaritimePaymentConfig = fetchByMaritimeCode(maritimeCode);

		if (tempMaritimePaymentConfig == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maritimeCode=");
			msg.append(maritimeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTempMaritimePaymentConfigException(msg.toString());
		}

		return tempMaritimePaymentConfig;
	}

	/**
	 * Returns the temp maritime payment config where maritimeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maritimeCode the maritime code
	 * @return the matching temp maritime payment config, or <code>null</code> if a matching temp maritime payment config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempMaritimePaymentConfig fetchByMaritimeCode(String maritimeCode)
		throws SystemException {
		return fetchByMaritimeCode(maritimeCode, true);
	}

	/**
	 * Returns the temp maritime payment config where maritimeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maritimeCode the maritime code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching temp maritime payment config, or <code>null</code> if a matching temp maritime payment config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempMaritimePaymentConfig fetchByMaritimeCode(String maritimeCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maritimeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TEMPMARITIMEPAYMENTCONFIG_WHERE);

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
			}
			else {
				if (maritimeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
				}
			}

			query.append(TempMaritimePaymentConfigModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (maritimeCode != null) {
					qPos.add(maritimeCode);
				}

				List<TempMaritimePaymentConfig> list = q.list();

				result = list;

				TempMaritimePaymentConfig tempMaritimePaymentConfig = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
						finderArgs, list);
				}
				else {
					tempMaritimePaymentConfig = list.get(0);

					cacheResult(tempMaritimePaymentConfig);

					if ((tempMaritimePaymentConfig.getMaritimeCode() == null) ||
							!tempMaritimePaymentConfig.getMaritimeCode()
														  .equals(maritimeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
							finderArgs, tempMaritimePaymentConfig);
					}
				}

				return tempMaritimePaymentConfig;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
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
				return (TempMaritimePaymentConfig)result;
			}
		}
	}

	/**
	 * Returns all the temp maritime payment configs.
	 *
	 * @return the temp maritime payment configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempMaritimePaymentConfig> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp maritime payment configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp maritime payment configs
	 * @param end the upper bound of the range of temp maritime payment configs (not inclusive)
	 * @return the range of temp maritime payment configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempMaritimePaymentConfig> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp maritime payment configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp maritime payment configs
	 * @param end the upper bound of the range of temp maritime payment configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp maritime payment configs
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempMaritimePaymentConfig> findAll(int start, int end,
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

		List<TempMaritimePaymentConfig> list = (List<TempMaritimePaymentConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPMARITIMEPAYMENTCONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPMARITIMEPAYMENTCONFIG.concat(TempMaritimePaymentConfigModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempMaritimePaymentConfig>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempMaritimePaymentConfig>)QueryUtil.list(q,
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
	 * Removes the temp maritime payment config where maritimeCode = &#63; from the database.
	 *
	 * @param maritimeCode the maritime code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMaritimeCode(String maritimeCode)
		throws NoSuchTempMaritimePaymentConfigException, SystemException {
		TempMaritimePaymentConfig tempMaritimePaymentConfig = findByMaritimeCode(maritimeCode);

		remove(tempMaritimePaymentConfig);
	}

	/**
	 * Removes all the temp maritime payment configs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempMaritimePaymentConfig tempMaritimePaymentConfig : findAll()) {
			remove(tempMaritimePaymentConfig);
		}
	}

	/**
	 * Returns the number of temp maritime payment configs where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @return the number of matching temp maritime payment configs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMaritimeCode(String maritimeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { maritimeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPMARITIMEPAYMENTCONFIG_WHERE);

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
			}
			else {
				if (maritimeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (maritimeCode != null) {
					qPos.add(maritimeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp maritime payment configs.
	 *
	 * @return the number of temp maritime payment configs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPMARITIMEPAYMENTCONFIG);

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
	 * Initializes the temp maritime payment config persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempMaritimePaymentConfig>> listenersList = new ArrayList<ModelListener<TempMaritimePaymentConfig>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempMaritimePaymentConfig>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempMaritimePaymentConfigImpl.class.getName());
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
	private static final String _SQL_SELECT_TEMPMARITIMEPAYMENTCONFIG = "SELECT tempMaritimePaymentConfig FROM TempMaritimePaymentConfig tempMaritimePaymentConfig";
	private static final String _SQL_SELECT_TEMPMARITIMEPAYMENTCONFIG_WHERE = "SELECT tempMaritimePaymentConfig FROM TempMaritimePaymentConfig tempMaritimePaymentConfig WHERE ";
	private static final String _SQL_COUNT_TEMPMARITIMEPAYMENTCONFIG = "SELECT COUNT(tempMaritimePaymentConfig) FROM TempMaritimePaymentConfig tempMaritimePaymentConfig";
	private static final String _SQL_COUNT_TEMPMARITIMEPAYMENTCONFIG_WHERE = "SELECT COUNT(tempMaritimePaymentConfig) FROM TempMaritimePaymentConfig tempMaritimePaymentConfig WHERE ";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1 = "tempMaritimePaymentConfig.maritimeCode IS NULL";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2 = "tempMaritimePaymentConfig.maritimeCode = ?";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3 = "(tempMaritimePaymentConfig.maritimeCode IS NULL OR tempMaritimePaymentConfig.maritimeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempMaritimePaymentConfig.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempMaritimePaymentConfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempMaritimePaymentConfig exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempMaritimePaymentConfigPersistenceImpl.class);
	private static TempMaritimePaymentConfig _nullTempMaritimePaymentConfig = new TempMaritimePaymentConfigImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempMaritimePaymentConfig> toCacheModel() {
				return _nullTempMaritimePaymentConfigCacheModel;
			}
		};

	private static CacheModel<TempMaritimePaymentConfig> _nullTempMaritimePaymentConfigCacheModel =
		new CacheModel<TempMaritimePaymentConfig>() {
			public TempMaritimePaymentConfig toEntityModel() {
				return _nullTempMaritimePaymentConfig;
			}
		};
}