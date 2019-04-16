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

import vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;
import vn.gt.dao.noticeandmessage.model.TempPassengerDetails;
import vn.gt.dao.noticeandmessage.model.impl.TempPassengerDetailsImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempPassengerDetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp passenger details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempPassengerDetailsPersistence
 * @see TempPassengerDetailsUtil
 * @generated
 */
public class TempPassengerDetailsPersistenceImpl extends BasePersistenceImpl<TempPassengerDetails>
	implements TempPassengerDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempPassengerDetailsUtil} to access the temp passenger details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempPassengerDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempPassengerDetailsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PASSENGERCODE =
		new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPassengerCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE =
		new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPassengerCode",
			new String[] { String.class.getName() },
			TempPassengerDetailsModelImpl.PASSENGERCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PASSENGERCODE = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPassengerCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp passenger details in the entity cache if it is enabled.
	 *
	 * @param tempPassengerDetails the temp passenger details
	 */
	public void cacheResult(TempPassengerDetails tempPassengerDetails) {
		EntityCacheUtil.putResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			tempPassengerDetails.getPrimaryKey(), tempPassengerDetails);

		tempPassengerDetails.resetOriginalValues();
	}

	/**
	 * Caches the temp passenger detailses in the entity cache if it is enabled.
	 *
	 * @param tempPassengerDetailses the temp passenger detailses
	 */
	public void cacheResult(List<TempPassengerDetails> tempPassengerDetailses) {
		for (TempPassengerDetails tempPassengerDetails : tempPassengerDetailses) {
			if (EntityCacheUtil.getResult(
						TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TempPassengerDetailsImpl.class,
						tempPassengerDetails.getPrimaryKey()) == null) {
				cacheResult(tempPassengerDetails);
			}
			else {
				tempPassengerDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp passenger detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempPassengerDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempPassengerDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp passenger details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempPassengerDetails tempPassengerDetails) {
		EntityCacheUtil.removeResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsImpl.class, tempPassengerDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempPassengerDetails> tempPassengerDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempPassengerDetails tempPassengerDetails : tempPassengerDetailses) {
			EntityCacheUtil.removeResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TempPassengerDetailsImpl.class,
				tempPassengerDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp passenger details with the primary key. Does not add the temp passenger details to the database.
	 *
	 * @param id the primary key for the new temp passenger details
	 * @return the new temp passenger details
	 */
	public TempPassengerDetails create(long id) {
		TempPassengerDetails tempPassengerDetails = new TempPassengerDetailsImpl();

		tempPassengerDetails.setNew(true);
		tempPassengerDetails.setPrimaryKey(id);

		return tempPassengerDetails;
	}

	/**
	 * Removes the temp passenger details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp passenger details
	 * @return the temp passenger details that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails remove(long id)
		throws NoSuchTempPassengerDetailsException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp passenger details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp passenger details
	 * @return the temp passenger details that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails remove(Serializable primaryKey)
		throws NoSuchTempPassengerDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempPassengerDetails tempPassengerDetails = (TempPassengerDetails)session.get(TempPassengerDetailsImpl.class,
					primaryKey);

			if (tempPassengerDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempPassengerDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempPassengerDetails);
		}
		catch (NoSuchTempPassengerDetailsException nsee) {
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
	protected TempPassengerDetails removeImpl(
		TempPassengerDetails tempPassengerDetails) throws SystemException {
		tempPassengerDetails = toUnwrappedModel(tempPassengerDetails);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempPassengerDetails);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempPassengerDetails);

		return tempPassengerDetails;
	}

	@Override
	public TempPassengerDetails updateImpl(
		vn.gt.dao.noticeandmessage.model.TempPassengerDetails tempPassengerDetails,
		boolean merge) throws SystemException {
		tempPassengerDetails = toUnwrappedModel(tempPassengerDetails);

		boolean isNew = tempPassengerDetails.isNew();

		TempPassengerDetailsModelImpl tempPassengerDetailsModelImpl = (TempPassengerDetailsModelImpl)tempPassengerDetails;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempPassengerDetails, merge);

			tempPassengerDetails.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempPassengerDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempPassengerDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPassengerDetailsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempPassengerDetailsModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}

			if ((tempPassengerDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPassengerDetailsModelImpl.getOriginalPassengerCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSENGERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE,
					args);

				args = new Object[] {
						tempPassengerDetailsModelImpl.getPassengerCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSENGERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			tempPassengerDetails.getPrimaryKey(), tempPassengerDetails);

		return tempPassengerDetails;
	}

	protected TempPassengerDetails toUnwrappedModel(
		TempPassengerDetails tempPassengerDetails) {
		if (tempPassengerDetails instanceof TempPassengerDetailsImpl) {
			return tempPassengerDetails;
		}

		TempPassengerDetailsImpl tempPassengerDetailsImpl = new TempPassengerDetailsImpl();

		tempPassengerDetailsImpl.setNew(tempPassengerDetails.isNew());
		tempPassengerDetailsImpl.setPrimaryKey(tempPassengerDetails.getPrimaryKey());

		tempPassengerDetailsImpl.setId(tempPassengerDetails.getId());
		tempPassengerDetailsImpl.setRequestCode(tempPassengerDetails.getRequestCode());
		tempPassengerDetailsImpl.setPassengerCode(tempPassengerDetails.getPassengerCode());
		tempPassengerDetailsImpl.setFamilyName(tempPassengerDetails.getFamilyName());
		tempPassengerDetailsImpl.setGivenName(tempPassengerDetails.getGivenName());
		tempPassengerDetailsImpl.setNationality(tempPassengerDetails.getNationality());
		tempPassengerDetailsImpl.setBirthDay(tempPassengerDetails.getBirthDay());
		tempPassengerDetailsImpl.setBirthPlace(tempPassengerDetails.getBirthPlace());
		tempPassengerDetailsImpl.setTypeOfIdentity(tempPassengerDetails.getTypeOfIdentity());
		tempPassengerDetailsImpl.setPassportExpiredDate(tempPassengerDetails.getPassportExpiredDate());
		tempPassengerDetailsImpl.setSerialNumberOfIdentity(tempPassengerDetails.getSerialNumberOfIdentity());
		tempPassengerDetailsImpl.setPortOfEmbarkation(tempPassengerDetails.getPortOfEmbarkation());
		tempPassengerDetailsImpl.setPortOfDisembarkation(tempPassengerDetails.getPortOfDisembarkation());
		tempPassengerDetailsImpl.setIsTransit(tempPassengerDetails.getIsTransit());

		return tempPassengerDetailsImpl;
	}

	/**
	 * Returns the temp passenger details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp passenger details
	 * @return the temp passenger details
	 * @throws com.liferay.portal.NoSuchModelException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp passenger details with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the temp passenger details
	 * @return the temp passenger details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails findByPrimaryKey(long id)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = fetchByPrimaryKey(id);

		if (tempPassengerDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempPassengerDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempPassengerDetails;
	}

	/**
	 * Returns the temp passenger details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp passenger details
	 * @return the temp passenger details, or <code>null</code> if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp passenger details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp passenger details
	 * @return the temp passenger details, or <code>null</code> if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails fetchByPrimaryKey(long id)
		throws SystemException {
		TempPassengerDetails tempPassengerDetails = (TempPassengerDetails)EntityCacheUtil.getResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TempPassengerDetailsImpl.class, id);

		if (tempPassengerDetails == _nullTempPassengerDetails) {
			return null;
		}

		if (tempPassengerDetails == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempPassengerDetails = (TempPassengerDetails)session.get(TempPassengerDetailsImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempPassengerDetails != null) {
					cacheResult(tempPassengerDetails);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TempPassengerDetailsImpl.class, id,
						_nullTempPassengerDetails);
				}

				closeSession(session);
			}
		}

		return tempPassengerDetails;
	}

	/**
	 * Returns all the temp passenger detailses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger detailses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @return the range of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger detailses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findByRequestCode(String requestCode,
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

		List<TempPassengerDetails> list = (List<TempPassengerDetails>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPPASSENGERDETAILS_WHERE);

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
				query.append(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
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

				list = (List<TempPassengerDetails>)QueryUtil.list(q,
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
	 * Returns the first temp passenger details in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		List<TempPassengerDetails> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempPassengerDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp passenger details in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		int count = countByRequestCode(requestCode);

		List<TempPassengerDetails> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempPassengerDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp passenger detailses before and after the current temp passenger details in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp passenger details
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp passenger details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPassengerDetails[] array = new TempPassengerDetailsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempPassengerDetails, requestCode, orderByComparator, true);

			array[1] = tempPassengerDetails;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempPassengerDetails, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempPassengerDetails getByRequestCode_PrevAndNext(
		Session session, TempPassengerDetails tempPassengerDetails,
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

		query.append(_SQL_SELECT_TEMPPASSENGERDETAILS_WHERE);

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
			query.append(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempPassengerDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPassengerDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp passenger detailses where passengerCode = &#63;.
	 *
	 * @param passengerCode the passenger code
	 * @return the matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findByPassengerCode(String passengerCode)
		throws SystemException {
		return findByPassengerCode(passengerCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger detailses where passengerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passengerCode the passenger code
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @return the range of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findByPassengerCode(
		String passengerCode, int start, int end) throws SystemException {
		return findByPassengerCode(passengerCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger detailses where passengerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passengerCode the passenger code
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findByPassengerCode(
		String passengerCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE;
			finderArgs = new Object[] { passengerCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PASSENGERCODE;
			finderArgs = new Object[] {
					passengerCode,
					
					start, end, orderByComparator
				};
		}

		List<TempPassengerDetails> list = (List<TempPassengerDetails>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPPASSENGERDETAILS_WHERE);

			if (passengerCode == null) {
				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_1);
			}
			else {
				if (passengerCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (passengerCode != null) {
					qPos.add(passengerCode);
				}

				list = (List<TempPassengerDetails>)QueryUtil.list(q,
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
	 * Returns the first temp passenger details in the ordered set where passengerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passengerCode the passenger code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails findByPassengerCode_First(
		String passengerCode, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		List<TempPassengerDetails> list = findByPassengerCode(passengerCode, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("passengerCode=");
			msg.append(passengerCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempPassengerDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp passenger details in the ordered set where passengerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param passengerCode the passenger code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails findByPassengerCode_Last(String passengerCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		int count = countByPassengerCode(passengerCode);

		List<TempPassengerDetails> list = findByPassengerCode(passengerCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("passengerCode=");
			msg.append(passengerCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempPassengerDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp passenger detailses before and after the current temp passenger details in the ordered set where passengerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp passenger details
	 * @param passengerCode the passenger code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp passenger details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempPassengerDetails[] findByPassengerCode_PrevAndNext(long id,
		String passengerCode, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPassengerDetails[] array = new TempPassengerDetailsImpl[3];

			array[0] = getByPassengerCode_PrevAndNext(session,
					tempPassengerDetails, passengerCode, orderByComparator, true);

			array[1] = tempPassengerDetails;

			array[2] = getByPassengerCode_PrevAndNext(session,
					tempPassengerDetails, passengerCode, orderByComparator,
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

	protected TempPassengerDetails getByPassengerCode_PrevAndNext(
		Session session, TempPassengerDetails tempPassengerDetails,
		String passengerCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPPASSENGERDETAILS_WHERE);

		if (passengerCode == null) {
			query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_1);
		}
		else {
			if (passengerCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_2);
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
			query.append(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (passengerCode != null) {
			qPos.add(passengerCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempPassengerDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPassengerDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp passenger detailses.
	 *
	 * @return the temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @return the range of temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempPassengerDetails> findAll(int start, int end,
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

		List<TempPassengerDetails> list = (List<TempPassengerDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPPASSENGERDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPPASSENGERDETAILS.concat(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempPassengerDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempPassengerDetails>)QueryUtil.list(q,
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
	 * Removes all the temp passenger detailses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempPassengerDetails tempPassengerDetails : findByRequestCode(
				requestCode)) {
			remove(tempPassengerDetails);
		}
	}

	/**
	 * Removes all the temp passenger detailses where passengerCode = &#63; from the database.
	 *
	 * @param passengerCode the passenger code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPassengerCode(String passengerCode)
		throws SystemException {
		for (TempPassengerDetails tempPassengerDetails : findByPassengerCode(
				passengerCode)) {
			remove(tempPassengerDetails);
		}
	}

	/**
	 * Removes all the temp passenger detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempPassengerDetails tempPassengerDetails : findAll()) {
			remove(tempPassengerDetails);
		}
	}

	/**
	 * Returns the number of temp passenger detailses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPPASSENGERDETAILS_WHERE);

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
	 * Returns the number of temp passenger detailses where passengerCode = &#63;.
	 *
	 * @param passengerCode the passenger code
	 * @return the number of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPassengerCode(String passengerCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { passengerCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PASSENGERCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPPASSENGERDETAILS_WHERE);

			if (passengerCode == null) {
				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_1);
			}
			else {
				if (passengerCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (passengerCode != null) {
					qPos.add(passengerCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PASSENGERCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp passenger detailses.
	 *
	 * @return the number of temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPPASSENGERDETAILS);

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
	 * Initializes the temp passenger details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempPassengerDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempPassengerDetails>> listenersList = new ArrayList<ModelListener<TempPassengerDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempPassengerDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempPassengerDetailsImpl.class.getName());
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
	private static final String _SQL_SELECT_TEMPPASSENGERDETAILS = "SELECT tempPassengerDetails FROM TempPassengerDetails tempPassengerDetails";
	private static final String _SQL_SELECT_TEMPPASSENGERDETAILS_WHERE = "SELECT tempPassengerDetails FROM TempPassengerDetails tempPassengerDetails WHERE ";
	private static final String _SQL_COUNT_TEMPPASSENGERDETAILS = "SELECT COUNT(tempPassengerDetails) FROM TempPassengerDetails tempPassengerDetails";
	private static final String _SQL_COUNT_TEMPPASSENGERDETAILS_WHERE = "SELECT COUNT(tempPassengerDetails) FROM TempPassengerDetails tempPassengerDetails WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempPassengerDetails.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempPassengerDetails.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempPassengerDetails.requestCode IS NULL OR tempPassengerDetails.requestCode = ?)";
	private static final String _FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_1 = "tempPassengerDetails.passengerCode IS NULL";
	private static final String _FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_2 = "tempPassengerDetails.passengerCode = ?";
	private static final String _FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_3 = "(tempPassengerDetails.passengerCode IS NULL OR tempPassengerDetails.passengerCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempPassengerDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempPassengerDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempPassengerDetails exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempPassengerDetailsPersistenceImpl.class);
	private static TempPassengerDetails _nullTempPassengerDetails = new TempPassengerDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempPassengerDetails> toCacheModel() {
				return _nullTempPassengerDetailsCacheModel;
			}
		};

	private static CacheModel<TempPassengerDetails> _nullTempPassengerDetailsCacheModel =
		new CacheModel<TempPassengerDetails>() {
			public TempPassengerDetails toEntityModel() {
				return _nullTempPassengerDetails;
			}
		};
}