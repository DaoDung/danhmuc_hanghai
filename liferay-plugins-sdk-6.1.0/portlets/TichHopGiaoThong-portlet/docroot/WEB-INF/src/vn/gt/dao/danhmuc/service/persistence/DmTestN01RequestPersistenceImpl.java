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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException;
import vn.gt.dao.danhmuc.model.DmTestN01Request;
import vn.gt.dao.danhmuc.model.impl.DmTestN01RequestImpl;
import vn.gt.dao.danhmuc.model.impl.DmTestN01RequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm test n01 request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmTestN01RequestPersistence
 * @see DmTestN01RequestUtil
 * @generated
 */
public class DmTestN01RequestPersistenceImpl extends BasePersistenceImpl<DmTestN01Request>
	implements DmTestN01RequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmTestN01RequestUtil} to access the dm test n01 request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmTestN01RequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestModelImpl.FINDER_CACHE_ENABLED,
			DmTestN01RequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestModelImpl.FINDER_CACHE_ENABLED,
			DmTestN01RequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm test n01 request in the entity cache if it is enabled.
	 *
	 * @param dmTestN01Request the dm test n01 request
	 */
	public void cacheResult(DmTestN01Request dmTestN01Request) {
		EntityCacheUtil.putResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestImpl.class, dmTestN01Request.getPrimaryKey(),
			dmTestN01Request);

		dmTestN01Request.resetOriginalValues();
	}

	/**
	 * Caches the dm test n01 requests in the entity cache if it is enabled.
	 *
	 * @param dmTestN01Requests the dm test n01 requests
	 */
	public void cacheResult(List<DmTestN01Request> dmTestN01Requests) {
		for (DmTestN01Request dmTestN01Request : dmTestN01Requests) {
			if (EntityCacheUtil.getResult(
						DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
						DmTestN01RequestImpl.class,
						dmTestN01Request.getPrimaryKey()) == null) {
				cacheResult(dmTestN01Request);
			}
			else {
				dmTestN01Request.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm test n01 requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmTestN01RequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmTestN01RequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm test n01 request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmTestN01Request dmTestN01Request) {
		EntityCacheUtil.removeResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestImpl.class, dmTestN01Request.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmTestN01Request> dmTestN01Requests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmTestN01Request dmTestN01Request : dmTestN01Requests) {
			EntityCacheUtil.removeResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
				DmTestN01RequestImpl.class, dmTestN01Request.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm test n01 request with the primary key. Does not add the dm test n01 request to the database.
	 *
	 * @param requestID the primary key for the new dm test n01 request
	 * @return the new dm test n01 request
	 */
	public DmTestN01Request create(int requestID) {
		DmTestN01Request dmTestN01Request = new DmTestN01RequestImpl();

		dmTestN01Request.setNew(true);
		dmTestN01Request.setPrimaryKey(requestID);

		return dmTestN01Request;
	}

	/**
	 * Removes the dm test n01 request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestID the primary key of the dm test n01 request
	 * @return the dm test n01 request that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmTestN01Request remove(int requestID)
		throws NoSuchDmTestN01RequestException, SystemException {
		return remove(Integer.valueOf(requestID));
	}

	/**
	 * Removes the dm test n01 request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm test n01 request
	 * @return the dm test n01 request that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request remove(Serializable primaryKey)
		throws NoSuchDmTestN01RequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmTestN01Request dmTestN01Request = (DmTestN01Request)session.get(DmTestN01RequestImpl.class,
					primaryKey);

			if (dmTestN01Request == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmTestN01RequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmTestN01Request);
		}
		catch (NoSuchDmTestN01RequestException nsee) {
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
	protected DmTestN01Request removeImpl(DmTestN01Request dmTestN01Request)
		throws SystemException {
		dmTestN01Request = toUnwrappedModel(dmTestN01Request);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmTestN01Request);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmTestN01Request);

		return dmTestN01Request;
	}

	@Override
	public DmTestN01Request updateImpl(
		vn.gt.dao.danhmuc.model.DmTestN01Request dmTestN01Request, boolean merge)
		throws SystemException {
		dmTestN01Request = toUnwrappedModel(dmTestN01Request);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmTestN01Request, merge);

			dmTestN01Request.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestImpl.class, dmTestN01Request.getPrimaryKey(),
			dmTestN01Request);

		return dmTestN01Request;
	}

	protected DmTestN01Request toUnwrappedModel(
		DmTestN01Request dmTestN01Request) {
		if (dmTestN01Request instanceof DmTestN01RequestImpl) {
			return dmTestN01Request;
		}

		DmTestN01RequestImpl dmTestN01RequestImpl = new DmTestN01RequestImpl();

		dmTestN01RequestImpl.setNew(dmTestN01Request.isNew());
		dmTestN01RequestImpl.setPrimaryKey(dmTestN01Request.getPrimaryKey());

		dmTestN01RequestImpl.setRequestID(dmTestN01Request.getRequestID());
		dmTestN01RequestImpl.setEnterpriseCode(dmTestN01Request.getEnterpriseCode());
		dmTestN01RequestImpl.setTenDuAn(dmTestN01Request.getTenDuAn());
		dmTestN01RequestImpl.setSuCanThietDauTu(dmTestN01Request.getSuCanThietDauTu());
		dmTestN01RequestImpl.setViTri(dmTestN01Request.getViTri());
		dmTestN01RequestImpl.setLoaiTauBienGioiHanVaoCang(dmTestN01Request.getLoaiTauBienGioiHanVaoCang());
		dmTestN01RequestImpl.setSoLuongCauCang(dmTestN01Request.getSoLuongCauCang());
		dmTestN01RequestImpl.setTongDienTichXayDungDuKien(dmTestN01Request.getTongDienTichXayDungDuKien());
		dmTestN01RequestImpl.setTaiLieulienQuan(dmTestN01Request.getTaiLieulienQuan());
		dmTestN01RequestImpl.setModifiedDate(dmTestN01Request.getModifiedDate());
		dmTestN01RequestImpl.setModifiedUser(dmTestN01Request.getModifiedUser());
		dmTestN01RequestImpl.setIsAuthorized(dmTestN01Request.getIsAuthorized());
		dmTestN01RequestImpl.setAuthorizedDate(dmTestN01Request.getAuthorizedDate());
		dmTestN01RequestImpl.setAuthorizedUser(dmTestN01Request.getAuthorizedUser());

		return dmTestN01RequestImpl;
	}

	/**
	 * Returns the dm test n01 request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm test n01 request
	 * @return the dm test n01 request
	 * @throws com.liferay.portal.NoSuchModelException if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm test n01 request with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException} if it could not be found.
	 *
	 * @param requestID the primary key of the dm test n01 request
	 * @return the dm test n01 request
	 * @throws vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmTestN01Request findByPrimaryKey(int requestID)
		throws NoSuchDmTestN01RequestException, SystemException {
		DmTestN01Request dmTestN01Request = fetchByPrimaryKey(requestID);

		if (dmTestN01Request == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + requestID);
			}

			throw new NoSuchDmTestN01RequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				requestID);
		}

		return dmTestN01Request;
	}

	/**
	 * Returns the dm test n01 request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm test n01 request
	 * @return the dm test n01 request, or <code>null</code> if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm test n01 request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestID the primary key of the dm test n01 request
	 * @return the dm test n01 request, or <code>null</code> if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmTestN01Request fetchByPrimaryKey(int requestID)
		throws SystemException {
		DmTestN01Request dmTestN01Request = (DmTestN01Request)EntityCacheUtil.getResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
				DmTestN01RequestImpl.class, requestID);

		if (dmTestN01Request == _nullDmTestN01Request) {
			return null;
		}

		if (dmTestN01Request == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmTestN01Request = (DmTestN01Request)session.get(DmTestN01RequestImpl.class,
						Integer.valueOf(requestID));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmTestN01Request != null) {
					cacheResult(dmTestN01Request);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
						DmTestN01RequestImpl.class, requestID,
						_nullDmTestN01Request);
				}

				closeSession(session);
			}
		}

		return dmTestN01Request;
	}

	/**
	 * Returns all the dm test n01 requests.
	 *
	 * @return the dm test n01 requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmTestN01Request> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm test n01 requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm test n01 requests
	 * @param end the upper bound of the range of dm test n01 requests (not inclusive)
	 * @return the range of dm test n01 requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmTestN01Request> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm test n01 requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm test n01 requests
	 * @param end the upper bound of the range of dm test n01 requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm test n01 requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmTestN01Request> findAll(int start, int end,
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

		List<DmTestN01Request> list = (List<DmTestN01Request>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMTESTN01REQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMTESTN01REQUEST.concat(DmTestN01RequestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmTestN01Request>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmTestN01Request>)QueryUtil.list(q,
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
	 * Removes all the dm test n01 requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmTestN01Request dmTestN01Request : findAll()) {
			remove(dmTestN01Request);
		}
	}

	/**
	 * Returns the number of dm test n01 requests.
	 *
	 * @return the number of dm test n01 requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMTESTN01REQUEST);

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
	 * Initializes the dm test n01 request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmTestN01Request")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmTestN01Request>> listenersList = new ArrayList<ModelListener<DmTestN01Request>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmTestN01Request>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmTestN01RequestImpl.class.getName());
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
	private static final String _SQL_SELECT_DMTESTN01REQUEST = "SELECT dmTestN01Request FROM DmTestN01Request dmTestN01Request";
	private static final String _SQL_COUNT_DMTESTN01REQUEST = "SELECT COUNT(dmTestN01Request) FROM DmTestN01Request dmTestN01Request";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmTestN01Request.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmTestN01Request exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmTestN01RequestPersistenceImpl.class);
	private static DmTestN01Request _nullDmTestN01Request = new DmTestN01RequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmTestN01Request> toCacheModel() {
				return _nullDmTestN01RequestCacheModel;
			}
		};

	private static CacheModel<DmTestN01Request> _nullDmTestN01RequestCacheModel = new CacheModel<DmTestN01Request>() {
			public DmTestN01Request toEntityModel() {
				return _nullDmTestN01Request;
			}
		};
}