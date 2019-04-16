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

import vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException;
import vn.gt.dao.noticeandmessage.model.TempCrewDetails;
import vn.gt.dao.noticeandmessage.model.impl.TempCrewDetailsImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempCrewDetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp crew details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempCrewDetailsPersistence
 * @see TempCrewDetailsUtil
 * @generated
 */
public class TempCrewDetailsPersistenceImpl extends BasePersistenceImpl<TempCrewDetails>
	implements TempCrewDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempCrewDetailsUtil} to access the temp crew details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempCrewDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempCrewDetailsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GIVENNAMEANDPASSPORTNUMBER =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGivenNameAndPassportNumber",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIVENNAMEANDPASSPORTNUMBER =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGivenNameAndPassportNumber",
			new String[] { String.class.getName(), String.class.getName() },
			TempCrewDetailsModelImpl.GIVENNAME_COLUMN_BITMASK |
			TempCrewDetailsModelImpl.PASSPORTNUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GIVENNAMEANDPASSPORTNUMBER =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGivenNameAndPassportNumber",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CREWCODE = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCrewCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCrewCode",
			new String[] { String.class.getName() },
			TempCrewDetailsModelImpl.CREWCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CREWCODE = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCrewCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp crew details in the entity cache if it is enabled.
	 *
	 * @param tempCrewDetails the temp crew details
	 */
	public void cacheResult(TempCrewDetails tempCrewDetails) {
		EntityCacheUtil.putResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsImpl.class, tempCrewDetails.getPrimaryKey(),
			tempCrewDetails);

		tempCrewDetails.resetOriginalValues();
	}

	/**
	 * Caches the temp crew detailses in the entity cache if it is enabled.
	 *
	 * @param tempCrewDetailses the temp crew detailses
	 */
	public void cacheResult(List<TempCrewDetails> tempCrewDetailses) {
		for (TempCrewDetails tempCrewDetails : tempCrewDetailses) {
			if (EntityCacheUtil.getResult(
						TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TempCrewDetailsImpl.class,
						tempCrewDetails.getPrimaryKey()) == null) {
				cacheResult(tempCrewDetails);
			}
			else {
				tempCrewDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp crew detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempCrewDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempCrewDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp crew details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempCrewDetails tempCrewDetails) {
		EntityCacheUtil.removeResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsImpl.class, tempCrewDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempCrewDetails> tempCrewDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempCrewDetails tempCrewDetails : tempCrewDetailses) {
			EntityCacheUtil.removeResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TempCrewDetailsImpl.class, tempCrewDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp crew details with the primary key. Does not add the temp crew details to the database.
	 *
	 * @param id the primary key for the new temp crew details
	 * @return the new temp crew details
	 */
	public TempCrewDetails create(long id) {
		TempCrewDetails tempCrewDetails = new TempCrewDetailsImpl();

		tempCrewDetails.setNew(true);
		tempCrewDetails.setPrimaryKey(id);

		return tempCrewDetails;
	}

	/**
	 * Removes the temp crew details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp crew details
	 * @return the temp crew details that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails remove(long id)
		throws NoSuchTempCrewDetailsException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp crew details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp crew details
	 * @return the temp crew details that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails remove(Serializable primaryKey)
		throws NoSuchTempCrewDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempCrewDetails tempCrewDetails = (TempCrewDetails)session.get(TempCrewDetailsImpl.class,
					primaryKey);

			if (tempCrewDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempCrewDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempCrewDetails);
		}
		catch (NoSuchTempCrewDetailsException nsee) {
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
	protected TempCrewDetails removeImpl(TempCrewDetails tempCrewDetails)
		throws SystemException {
		tempCrewDetails = toUnwrappedModel(tempCrewDetails);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempCrewDetails);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempCrewDetails);

		return tempCrewDetails;
	}

	@Override
	public TempCrewDetails updateImpl(
		vn.gt.dao.noticeandmessage.model.TempCrewDetails tempCrewDetails,
		boolean merge) throws SystemException {
		tempCrewDetails = toUnwrappedModel(tempCrewDetails);

		boolean isNew = tempCrewDetails.isNew();

		TempCrewDetailsModelImpl tempCrewDetailsModelImpl = (TempCrewDetailsModelImpl)tempCrewDetails;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempCrewDetails, merge);

			tempCrewDetails.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempCrewDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempCrewDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewDetailsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempCrewDetailsModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}

			if ((tempCrewDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIVENNAMEANDPASSPORTNUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewDetailsModelImpl.getOriginalGivenName(),
						
						tempCrewDetailsModelImpl.getOriginalPassportNumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GIVENNAMEANDPASSPORTNUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIVENNAMEANDPASSPORTNUMBER,
					args);

				args = new Object[] {
						tempCrewDetailsModelImpl.getGivenName(),
						
						tempCrewDetailsModelImpl.getPassportNumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GIVENNAMEANDPASSPORTNUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIVENNAMEANDPASSPORTNUMBER,
					args);
			}

			if ((tempCrewDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewDetailsModelImpl.getOriginalCrewcode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREWCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE,
					args);

				args = new Object[] { tempCrewDetailsModelImpl.getCrewcode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREWCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsImpl.class, tempCrewDetails.getPrimaryKey(),
			tempCrewDetails);

		return tempCrewDetails;
	}

	protected TempCrewDetails toUnwrappedModel(TempCrewDetails tempCrewDetails) {
		if (tempCrewDetails instanceof TempCrewDetailsImpl) {
			return tempCrewDetails;
		}

		TempCrewDetailsImpl tempCrewDetailsImpl = new TempCrewDetailsImpl();

		tempCrewDetailsImpl.setNew(tempCrewDetails.isNew());
		tempCrewDetailsImpl.setPrimaryKey(tempCrewDetails.getPrimaryKey());

		tempCrewDetailsImpl.setId(tempCrewDetails.getId());
		tempCrewDetailsImpl.setRequestCode(tempCrewDetails.getRequestCode());
		tempCrewDetailsImpl.setCrewcode(tempCrewDetails.getCrewcode());
		tempCrewDetailsImpl.setFamilyName(tempCrewDetails.getFamilyName());
		tempCrewDetailsImpl.setGivenName(tempCrewDetails.getGivenName());
		tempCrewDetailsImpl.setRankCode(tempCrewDetails.getRankCode());
		tempCrewDetailsImpl.setNationality(tempCrewDetails.getNationality());
		tempCrewDetailsImpl.setDateOfBirth(tempCrewDetails.getDateOfBirth());
		tempCrewDetailsImpl.setPlaceOfBirth(tempCrewDetails.getPlaceOfBirth());
		tempCrewDetailsImpl.setPassportNumber(tempCrewDetails.getPassportNumber());
		tempCrewDetailsImpl.setPassportTypeCode(tempCrewDetails.getPassportTypeCode());

		return tempCrewDetailsImpl;
	}

	/**
	 * Returns the temp crew details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp crew details
	 * @return the temp crew details
	 * @throws com.liferay.portal.NoSuchModelException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp crew details with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the temp crew details
	 * @return the temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails findByPrimaryKey(long id)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = fetchByPrimaryKey(id);

		if (tempCrewDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempCrewDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempCrewDetails;
	}

	/**
	 * Returns the temp crew details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp crew details
	 * @return the temp crew details, or <code>null</code> if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp crew details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp crew details
	 * @return the temp crew details, or <code>null</code> if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails fetchByPrimaryKey(long id) throws SystemException {
		TempCrewDetails tempCrewDetails = (TempCrewDetails)EntityCacheUtil.getResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TempCrewDetailsImpl.class, id);

		if (tempCrewDetails == _nullTempCrewDetails) {
			return null;
		}

		if (tempCrewDetails == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempCrewDetails = (TempCrewDetails)session.get(TempCrewDetailsImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempCrewDetails != null) {
					cacheResult(tempCrewDetails);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TempCrewDetailsImpl.class, id, _nullTempCrewDetails);
				}

				closeSession(session);
			}
		}

		return tempCrewDetails;
	}

	/**
	 * Returns all the temp crew detailses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew detailses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @return the range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew detailses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByRequestCode(String requestCode,
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

		List<TempCrewDetails> list = (List<TempCrewDetails>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

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
				query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
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

				list = (List<TempCrewDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp crew details in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		List<TempCrewDetails> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempCrewDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp crew details in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		int count = countByRequestCode(requestCode);

		List<TempCrewDetails> list = findByRequestCode(requestCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempCrewDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp crew detailses before and after the current temp crew details in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp crew details
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewDetails[] array = new TempCrewDetailsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session, tempCrewDetails,
					requestCode, orderByComparator, true);

			array[1] = tempCrewDetails;

			array[2] = getByRequestCode_PrevAndNext(session, tempCrewDetails,
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

	protected TempCrewDetails getByRequestCode_PrevAndNext(Session session,
		TempCrewDetails tempCrewDetails, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

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
			query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp crew detailses where givenName = &#63; and passportNumber = &#63;.
	 *
	 * @param givenName the given name
	 * @param passportNumber the passport number
	 * @return the matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByGivenNameAndPassportNumber(
		String givenName, String passportNumber) throws SystemException {
		return findByGivenNameAndPassportNumber(givenName, passportNumber,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew detailses where givenName = &#63; and passportNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param givenName the given name
	 * @param passportNumber the passport number
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @return the range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByGivenNameAndPassportNumber(
		String givenName, String passportNumber, int start, int end)
		throws SystemException {
		return findByGivenNameAndPassportNumber(givenName, passportNumber,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew detailses where givenName = &#63; and passportNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param givenName the given name
	 * @param passportNumber the passport number
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByGivenNameAndPassportNumber(
		String givenName, String passportNumber, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIVENNAMEANDPASSPORTNUMBER;
			finderArgs = new Object[] { givenName, passportNumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GIVENNAMEANDPASSPORTNUMBER;
			finderArgs = new Object[] {
					givenName, passportNumber,
					
					start, end, orderByComparator
				};
		}

		List<TempCrewDetails> list = (List<TempCrewDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

			if (givenName == null) {
				query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_1);
			}
			else {
				if (givenName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_2);
				}
			}

			if (passportNumber == null) {
				query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_1);
			}
			else {
				if (passportNumber.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_3);
				}
				else {
					query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (givenName != null) {
					qPos.add(givenName);
				}

				if (passportNumber != null) {
					qPos.add(passportNumber);
				}

				list = (List<TempCrewDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp crew details in the ordered set where givenName = &#63; and passportNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param givenName the given name
	 * @param passportNumber the passport number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails findByGivenNameAndPassportNumber_First(
		String givenName, String passportNumber,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		List<TempCrewDetails> list = findByGivenNameAndPassportNumber(givenName,
				passportNumber, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("givenName=");
			msg.append(givenName);

			msg.append(", passportNumber=");
			msg.append(passportNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempCrewDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp crew details in the ordered set where givenName = &#63; and passportNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param givenName the given name
	 * @param passportNumber the passport number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails findByGivenNameAndPassportNumber_Last(
		String givenName, String passportNumber,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		int count = countByGivenNameAndPassportNumber(givenName, passportNumber);

		List<TempCrewDetails> list = findByGivenNameAndPassportNumber(givenName,
				passportNumber, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("givenName=");
			msg.append(givenName);

			msg.append(", passportNumber=");
			msg.append(passportNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempCrewDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp crew detailses before and after the current temp crew details in the ordered set where givenName = &#63; and passportNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp crew details
	 * @param givenName the given name
	 * @param passportNumber the passport number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails[] findByGivenNameAndPassportNumber_PrevAndNext(
		long id, String givenName, String passportNumber,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewDetails[] array = new TempCrewDetailsImpl[3];

			array[0] = getByGivenNameAndPassportNumber_PrevAndNext(session,
					tempCrewDetails, givenName, passportNumber,
					orderByComparator, true);

			array[1] = tempCrewDetails;

			array[2] = getByGivenNameAndPassportNumber_PrevAndNext(session,
					tempCrewDetails, givenName, passportNumber,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempCrewDetails getByGivenNameAndPassportNumber_PrevAndNext(
		Session session, TempCrewDetails tempCrewDetails, String givenName,
		String passportNumber, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

		if (givenName == null) {
			query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_1);
		}
		else {
			if (givenName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_2);
			}
		}

		if (passportNumber == null) {
			query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_1);
		}
		else {
			if (passportNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_3);
			}
			else {
				query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_2);
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
			query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (givenName != null) {
			qPos.add(givenName);
		}

		if (passportNumber != null) {
			qPos.add(passportNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp crew detailses where crewcode = &#63;.
	 *
	 * @param crewcode the crewcode
	 * @return the matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByCrewCode(String crewcode)
		throws SystemException {
		return findByCrewCode(crewcode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp crew detailses where crewcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param crewcode the crewcode
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @return the range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByCrewCode(String crewcode, int start,
		int end) throws SystemException {
		return findByCrewCode(crewcode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew detailses where crewcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param crewcode the crewcode
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findByCrewCode(String crewcode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE;
			finderArgs = new Object[] { crewcode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CREWCODE;
			finderArgs = new Object[] { crewcode, start, end, orderByComparator };
		}

		List<TempCrewDetails> list = (List<TempCrewDetails>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

			if (crewcode == null) {
				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_1);
			}
			else {
				if (crewcode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (crewcode != null) {
					qPos.add(crewcode);
				}

				list = (List<TempCrewDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp crew details in the ordered set where crewcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param crewcode the crewcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails findByCrewCode_First(String crewcode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		List<TempCrewDetails> list = findByCrewCode(crewcode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("crewcode=");
			msg.append(crewcode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempCrewDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp crew details in the ordered set where crewcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param crewcode the crewcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails findByCrewCode_Last(String crewcode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		int count = countByCrewCode(crewcode);

		List<TempCrewDetails> list = findByCrewCode(crewcode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("crewcode=");
			msg.append(crewcode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempCrewDetailsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp crew detailses before and after the current temp crew details in the ordered set where crewcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp crew details
	 * @param crewcode the crewcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew details
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempCrewDetails[] findByCrewCode_PrevAndNext(long id,
		String crewcode, OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewDetails[] array = new TempCrewDetailsImpl[3];

			array[0] = getByCrewCode_PrevAndNext(session, tempCrewDetails,
					crewcode, orderByComparator, true);

			array[1] = tempCrewDetails;

			array[2] = getByCrewCode_PrevAndNext(session, tempCrewDetails,
					crewcode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempCrewDetails getByCrewCode_PrevAndNext(Session session,
		TempCrewDetails tempCrewDetails, String crewcode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

		if (crewcode == null) {
			query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_1);
		}
		else {
			if (crewcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_2);
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
			query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (crewcode != null) {
			qPos.add(crewcode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp crew detailses.
	 *
	 * @return the temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @return the range of temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempCrewDetails> findAll(int start, int end,
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

		List<TempCrewDetails> list = (List<TempCrewDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPCREWDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPCREWDETAILS.concat(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempCrewDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempCrewDetails>)QueryUtil.list(q,
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
	 * Removes all the temp crew detailses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempCrewDetails tempCrewDetails : findByRequestCode(requestCode)) {
			remove(tempCrewDetails);
		}
	}

	/**
	 * Removes all the temp crew detailses where givenName = &#63; and passportNumber = &#63; from the database.
	 *
	 * @param givenName the given name
	 * @param passportNumber the passport number
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGivenNameAndPassportNumber(String givenName,
		String passportNumber) throws SystemException {
		for (TempCrewDetails tempCrewDetails : findByGivenNameAndPassportNumber(
				givenName, passportNumber)) {
			remove(tempCrewDetails);
		}
	}

	/**
	 * Removes all the temp crew detailses where crewcode = &#63; from the database.
	 *
	 * @param crewcode the crewcode
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCrewCode(String crewcode) throws SystemException {
		for (TempCrewDetails tempCrewDetails : findByCrewCode(crewcode)) {
			remove(tempCrewDetails);
		}
	}

	/**
	 * Removes all the temp crew detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempCrewDetails tempCrewDetails : findAll()) {
			remove(tempCrewDetails);
		}
	}

	/**
	 * Returns the number of temp crew detailses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPCREWDETAILS_WHERE);

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
	 * Returns the number of temp crew detailses where givenName = &#63; and passportNumber = &#63;.
	 *
	 * @param givenName the given name
	 * @param passportNumber the passport number
	 * @return the number of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGivenNameAndPassportNumber(String givenName,
		String passportNumber) throws SystemException {
		Object[] finderArgs = new Object[] { givenName, passportNumber };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GIVENNAMEANDPASSPORTNUMBER,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPCREWDETAILS_WHERE);

			if (givenName == null) {
				query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_1);
			}
			else {
				if (givenName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_2);
				}
			}

			if (passportNumber == null) {
				query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_1);
			}
			else {
				if (passportNumber.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_3);
				}
				else {
					query.append(_FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (givenName != null) {
					qPos.add(givenName);
				}

				if (passportNumber != null) {
					qPos.add(passportNumber);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GIVENNAMEANDPASSPORTNUMBER,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp crew detailses where crewcode = &#63;.
	 *
	 * @param crewcode the crewcode
	 * @return the number of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCrewCode(String crewcode) throws SystemException {
		Object[] finderArgs = new Object[] { crewcode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CREWCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPCREWDETAILS_WHERE);

			if (crewcode == null) {
				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_1);
			}
			else {
				if (crewcode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (crewcode != null) {
					qPos.add(crewcode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CREWCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp crew detailses.
	 *
	 * @return the number of temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPCREWDETAILS);

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
	 * Initializes the temp crew details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempCrewDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempCrewDetails>> listenersList = new ArrayList<ModelListener<TempCrewDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempCrewDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempCrewDetailsImpl.class.getName());
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
	private static final String _SQL_SELECT_TEMPCREWDETAILS = "SELECT tempCrewDetails FROM TempCrewDetails tempCrewDetails";
	private static final String _SQL_SELECT_TEMPCREWDETAILS_WHERE = "SELECT tempCrewDetails FROM TempCrewDetails tempCrewDetails WHERE ";
	private static final String _SQL_COUNT_TEMPCREWDETAILS = "SELECT COUNT(tempCrewDetails) FROM TempCrewDetails tempCrewDetails";
	private static final String _SQL_COUNT_TEMPCREWDETAILS_WHERE = "SELECT COUNT(tempCrewDetails) FROM TempCrewDetails tempCrewDetails WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempCrewDetails.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempCrewDetails.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempCrewDetails.requestCode IS NULL OR tempCrewDetails.requestCode = ?)";
	private static final String _FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_1 =
		"tempCrewDetails.givenName IS NULL AND ";
	private static final String _FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_2 =
		"tempCrewDetails.givenName = ? AND ";
	private static final String _FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_GIVENNAME_3 =
		"(tempCrewDetails.givenName IS NULL OR tempCrewDetails.givenName = ?) AND ";
	private static final String _FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_1 =
		"tempCrewDetails.passportNumber IS NULL";
	private static final String _FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_2 =
		"tempCrewDetails.passportNumber = ?";
	private static final String _FINDER_COLUMN_GIVENNAMEANDPASSPORTNUMBER_PASSPORTNUMBER_3 =
		"(tempCrewDetails.passportNumber IS NULL OR tempCrewDetails.passportNumber = ?)";
	private static final String _FINDER_COLUMN_CREWCODE_CREWCODE_1 = "tempCrewDetails.crewcode IS NULL";
	private static final String _FINDER_COLUMN_CREWCODE_CREWCODE_2 = "tempCrewDetails.crewcode = ?";
	private static final String _FINDER_COLUMN_CREWCODE_CREWCODE_3 = "(tempCrewDetails.crewcode IS NULL OR tempCrewDetails.crewcode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempCrewDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempCrewDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempCrewDetails exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempCrewDetailsPersistenceImpl.class);
	private static TempCrewDetails _nullTempCrewDetails = new TempCrewDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempCrewDetails> toCacheModel() {
				return _nullTempCrewDetailsCacheModel;
			}
		};

	private static CacheModel<TempCrewDetails> _nullTempCrewDetailsCacheModel = new CacheModel<TempCrewDetails>() {
			public TempCrewDetails toEntityModel() {
				return _nullTempCrewDetails;
			}
		};
}