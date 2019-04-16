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

package vn.gt.dao.result.service.persistence;

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

import vn.gt.dao.result.NoSuchResultCompetionException;
import vn.gt.dao.result.model.ResultCompetion;
import vn.gt.dao.result.model.impl.ResultCompetionImpl;
import vn.gt.dao.result.model.impl.ResultCompetionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the result competion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultCompetionPersistence
 * @see ResultCompetionUtil
 * @generated
 */
public class ResultCompetionPersistenceImpl extends BasePersistenceImpl<ResultCompetion>
	implements ResultCompetionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultCompetionUtil} to access the result competion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultCompetionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionModelImpl.FINDER_CACHE_ENABLED,
			ResultCompetionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			ResultCompetionModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionModelImpl.FINDER_CACHE_ENABLED,
			ResultCompetionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionModelImpl.FINDER_CACHE_ENABLED,
			ResultCompetionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			ResultCompetionModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultCompetionModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionModelImpl.FINDER_CACHE_ENABLED,
			ResultCompetionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionModelImpl.FINDER_CACHE_ENABLED,
			ResultCompetionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the result competion in the entity cache if it is enabled.
	 *
	 * @param resultCompetion the result competion
	 */
	public void cacheResult(ResultCompetion resultCompetion) {
		EntityCacheUtil.putResult(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionImpl.class, resultCompetion.getPrimaryKey(),
			resultCompetion);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultCompetion.getRequestCode() }, resultCompetion);

		resultCompetion.resetOriginalValues();
	}

	/**
	 * Caches the result competions in the entity cache if it is enabled.
	 *
	 * @param resultCompetions the result competions
	 */
	public void cacheResult(List<ResultCompetion> resultCompetions) {
		for (ResultCompetion resultCompetion : resultCompetions) {
			if (EntityCacheUtil.getResult(
						ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
						ResultCompetionImpl.class,
						resultCompetion.getPrimaryKey()) == null) {
				cacheResult(resultCompetion);
			}
			else {
				resultCompetion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all result competions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ResultCompetionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ResultCompetionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the result competion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResultCompetion resultCompetion) {
		EntityCacheUtil.removeResult(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionImpl.class, resultCompetion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultCompetion.getRequestCode() });
	}

	/**
	 * Creates a new result competion with the primary key. Does not add the result competion to the database.
	 *
	 * @param id the primary key for the new result competion
	 * @return the new result competion
	 */
	public ResultCompetion create(long id) {
		ResultCompetion resultCompetion = new ResultCompetionImpl();

		resultCompetion.setNew(true);
		resultCompetion.setPrimaryKey(id);

		return resultCompetion;
	}

	/**
	 * Removes the result competion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the result competion
	 * @return the result competion that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a result competion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCompetion remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the result competion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the result competion
	 * @return the result competion that was removed
	 * @throws vn.gt.dao.result.NoSuchResultCompetionException if a result competion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion remove(long id)
		throws NoSuchResultCompetionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ResultCompetion resultCompetion = (ResultCompetion)session.get(ResultCompetionImpl.class,
					Long.valueOf(id));

			if (resultCompetion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchResultCompetionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return resultCompetionPersistence.remove(resultCompetion);
		}
		catch (NoSuchResultCompetionException nsee) {
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
	 * Removes the result competion from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resultCompetion the result competion
	 * @return the result competion that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCompetion remove(ResultCompetion resultCompetion)
		throws SystemException {
		return super.remove(resultCompetion);
	}

	@Override
	protected ResultCompetion removeImpl(ResultCompetion resultCompetion)
		throws SystemException {
		resultCompetion = toUnwrappedModel(resultCompetion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, resultCompetion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		ResultCompetionModelImpl resultCompetionModelImpl = (ResultCompetionModelImpl)resultCompetion;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultCompetionModelImpl.getRequestCode() });

		EntityCacheUtil.removeResult(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionImpl.class, resultCompetion.getPrimaryKey());

		return resultCompetion;
	}

	@Override
	public ResultCompetion updateImpl(
		vn.gt.dao.result.model.ResultCompetion resultCompetion, boolean merge)
		throws SystemException {
		resultCompetion = toUnwrappedModel(resultCompetion);

		boolean isNew = resultCompetion.isNew();

		ResultCompetionModelImpl resultCompetionModelImpl = (ResultCompetionModelImpl)resultCompetion;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, resultCompetion, merge);

			resultCompetion.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ResultCompetionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((resultCompetionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(resultCompetionModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultCompetionModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(resultCompetionModelImpl.getDocumentName()),
						Integer.valueOf(resultCompetionModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}
		}

		EntityCacheUtil.putResult(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
			ResultCompetionImpl.class, resultCompetion.getPrimaryKey(),
			resultCompetion);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
				new Object[] { resultCompetion.getRequestCode() },
				resultCompetion);
		}
		else {
			if ((resultCompetionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultCompetionModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					new Object[] { resultCompetion.getRequestCode() },
					resultCompetion);
			}
		}

		return resultCompetion;
	}

	protected ResultCompetion toUnwrappedModel(ResultCompetion resultCompetion) {
		if (resultCompetion instanceof ResultCompetionImpl) {
			return resultCompetion;
		}

		ResultCompetionImpl resultCompetionImpl = new ResultCompetionImpl();

		resultCompetionImpl.setNew(resultCompetion.isNew());
		resultCompetionImpl.setPrimaryKey(resultCompetion.getPrimaryKey());

		resultCompetionImpl.setId(resultCompetion.getId());
		resultCompetionImpl.setRequestCode(resultCompetion.getRequestCode());
		resultCompetionImpl.setRequestState(resultCompetion.getRequestState());
		resultCompetionImpl.setDocumentName(resultCompetion.getDocumentName());
		resultCompetionImpl.setDocumentYear(resultCompetion.getDocumentYear());
		resultCompetionImpl.setNameOfShip(resultCompetion.getNameOfShip());
		resultCompetionImpl.setFlagStateOfShip(resultCompetion.getFlagStateOfShip());
		resultCompetionImpl.setNameOfMaster(resultCompetion.getNameOfMaster());
		resultCompetionImpl.setGrossTonnage(resultCompetion.getGrossTonnage());
		resultCompetionImpl.setPortOfArrivalCode(resultCompetion.getPortOfArrivalCode());
		resultCompetionImpl.setMaritimeCode(resultCompetion.getMaritimeCode());
		resultCompetionImpl.setDivision(resultCompetion.getDivision());
		resultCompetionImpl.setApprovalName(resultCompetion.getApprovalName());
		resultCompetionImpl.setApprovalTime(resultCompetion.getApprovalTime());
		resultCompetionImpl.setCertificateNo(resultCompetion.getCertificateNo());
		resultCompetionImpl.setResponseStatusHQ(resultCompetion.getResponseStatusHQ());
		resultCompetionImpl.setResponseStatusBP(resultCompetion.getResponseStatusBP());
		resultCompetionImpl.setResponseStatusYT(resultCompetion.getResponseStatusYT());
		resultCompetionImpl.setResponseStatusDV(resultCompetion.getResponseStatusDV());
		resultCompetionImpl.setResponseStatusTV(resultCompetion.getResponseStatusTV());
		resultCompetionImpl.setResponseStatusCVHH(resultCompetion.getResponseStatusCVHH());
		resultCompetionImpl.setResponseTimeHQ(resultCompetion.getResponseTimeHQ());
		resultCompetionImpl.setResponseTimeBP(resultCompetion.getResponseTimeBP());
		resultCompetionImpl.setResponseTimeYT(resultCompetion.getResponseTimeYT());
		resultCompetionImpl.setResponseTimeDV(resultCompetion.getResponseTimeDV());
		resultCompetionImpl.setResponseTimeTV(resultCompetion.getResponseTimeTV());
		resultCompetionImpl.setResponseTimeCVHH(resultCompetion.getResponseTimeCVHH());
		resultCompetionImpl.setResponseHQ(resultCompetion.getResponseHQ());
		resultCompetionImpl.setResponseBP(resultCompetion.getResponseBP());
		resultCompetionImpl.setResponseYT(resultCompetion.getResponseYT());
		resultCompetionImpl.setResponseDV(resultCompetion.getResponseDV());
		resultCompetionImpl.setResponseTV(resultCompetion.getResponseTV());
		resultCompetionImpl.setResponseCVHH(resultCompetion.getResponseCVHH());

		return resultCompetionImpl;
	}

	/**
	 * Returns the result competion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the result competion
	 * @return the result competion
	 * @throws com.liferay.portal.NoSuchModelException if a result competion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCompetion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result competion with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultCompetionException} if it could not be found.
	 *
	 * @param id the primary key of the result competion
	 * @return the result competion
	 * @throws vn.gt.dao.result.NoSuchResultCompetionException if a result competion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion findByPrimaryKey(long id)
		throws NoSuchResultCompetionException, SystemException {
		ResultCompetion resultCompetion = fetchByPrimaryKey(id);

		if (resultCompetion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchResultCompetionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return resultCompetion;
	}

	/**
	 * Returns the result competion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the result competion
	 * @return the result competion, or <code>null</code> if a result competion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCompetion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result competion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the result competion
	 * @return the result competion, or <code>null</code> if a result competion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion fetchByPrimaryKey(long id) throws SystemException {
		ResultCompetion resultCompetion = (ResultCompetion)EntityCacheUtil.getResult(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
				ResultCompetionImpl.class, id);

		if (resultCompetion == _nullResultCompetion) {
			return null;
		}

		if (resultCompetion == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				resultCompetion = (ResultCompetion)session.get(ResultCompetionImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (resultCompetion != null) {
					cacheResult(resultCompetion);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ResultCompetionModelImpl.ENTITY_CACHE_ENABLED,
						ResultCompetionImpl.class, id, _nullResultCompetion);
				}

				closeSession(session);
			}
		}

		return resultCompetion;
	}

	/**
	 * Returns the result competion where requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultCompetionException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching result competion
	 * @throws vn.gt.dao.result.NoSuchResultCompetionException if a matching result competion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion findByRequestCode(String requestCode)
		throws NoSuchResultCompetionException, SystemException {
		ResultCompetion resultCompetion = fetchByRequestCode(requestCode);

		if (resultCompetion == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchResultCompetionException(msg.toString());
		}

		return resultCompetion;
	}

	/**
	 * Returns the result competion where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching result competion, or <code>null</code> if a matching result competion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the result competion where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching result competion, or <code>null</code> if a matching result competion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_RESULTCOMPETION_WHERE);

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

			query.append(ResultCompetionModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				List<ResultCompetion> list = q.list();

				result = list;

				ResultCompetion resultCompetion = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					resultCompetion = list.get(0);

					cacheResult(resultCompetion);

					if ((resultCompetion.getRequestCode() == null) ||
							!resultCompetion.getRequestCode().equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, resultCompetion);
					}
				}

				return resultCompetion;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
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
				return (ResultCompetion)result;
			}
		}
	}

	/**
	 * Returns all the result competions where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching result competions
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultCompetion> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result competions where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result competions
	 * @param end the upper bound of the range of result competions (not inclusive)
	 * @return the range of matching result competions
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultCompetion> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the result competions where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result competions
	 * @param end the upper bound of the range of result competions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result competions
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultCompetion> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<ResultCompetion> list = (List<ResultCompetion>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTCOMPETION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultCompetionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<ResultCompetion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result competion in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result competion
	 * @throws vn.gt.dao.result.NoSuchResultCompetionException if a matching result competion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultCompetionException, SystemException {
		List<ResultCompetion> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultCompetionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result competion in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result competion
	 * @throws vn.gt.dao.result.NoSuchResultCompetionException if a matching result competion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultCompetionException, SystemException {
		int count = countByDocumentNameAndDocumentYear(documentName,
				documentYear);

		List<ResultCompetion> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultCompetionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result competions before and after the current result competion in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result competion
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result competion
	 * @throws vn.gt.dao.result.NoSuchResultCompetionException if a result competion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultCompetion[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultCompetionException, SystemException {
		ResultCompetion resultCompetion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultCompetion[] array = new ResultCompetionImpl[3];

			array[0] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					resultCompetion, documentName, documentYear,
					orderByComparator, true);

			array[1] = resultCompetion;

			array[2] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					resultCompetion, documentName, documentYear,
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

	protected ResultCompetion getByDocumentNameAndDocumentYear_PrevAndNext(
		Session session, ResultCompetion resultCompetion, long documentName,
		int documentYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTCOMPETION_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(ResultCompetionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultCompetion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultCompetion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result competions.
	 *
	 * @return the result competions
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultCompetion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result competions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result competions
	 * @param end the upper bound of the range of result competions (not inclusive)
	 * @return the range of result competions
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultCompetion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the result competions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result competions
	 * @param end the upper bound of the range of result competions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of result competions
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultCompetion> findAll(int start, int end,
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

		List<ResultCompetion> list = (List<ResultCompetion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESULTCOMPETION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTCOMPETION.concat(ResultCompetionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ResultCompetion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ResultCompetion>)QueryUtil.list(q,
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
	 * Removes the result competion where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws NoSuchResultCompetionException, SystemException {
		ResultCompetion resultCompetion = findByRequestCode(requestCode);

		resultCompetionPersistence.remove(resultCompetion);
	}

	/**
	 * Removes all the result competions where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (ResultCompetion resultCompetion : findByDocumentNameAndDocumentYear(
				documentName, documentYear)) {
			resultCompetionPersistence.remove(resultCompetion);
		}
	}

	/**
	 * Removes all the result competions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ResultCompetion resultCompetion : findAll()) {
			resultCompetionPersistence.remove(resultCompetion);
		}
	}

	/**
	 * Returns the number of result competions where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching result competions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTCOMPETION_WHERE);

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
	 * Returns the number of result competions where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching result competions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTCOMPETION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result competions.
	 *
	 * @return the number of result competions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESULTCOMPETION);

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
	 * Initializes the result competion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.result.model.ResultCompetion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ResultCompetion>> listenersList = new ArrayList<ModelListener<ResultCompetion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ResultCompetion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ResultCompetionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = ResultCertificatePersistence.class)
	protected ResultCertificatePersistence resultCertificatePersistence;
	@BeanReference(type = ResultCompetionPersistence.class)
	protected ResultCompetionPersistence resultCompetionPersistence;
	@BeanReference(type = ResultDeclarationPersistence.class)
	protected ResultDeclarationPersistence resultDeclarationPersistence;
	@BeanReference(type = ResultHistoryMinistryPersistence.class)
	protected ResultHistoryMinistryPersistence resultHistoryMinistryPersistence;
	@BeanReference(type = ResultMinistryPersistence.class)
	protected ResultMinistryPersistence resultMinistryPersistence;
	@BeanReference(type = ResultNotificationPersistence.class)
	protected ResultNotificationPersistence resultNotificationPersistence;
	@BeanReference(type = TempDebitNotePersistence.class)
	protected TempDebitNotePersistence tempDebitNotePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_RESULTCOMPETION = "SELECT resultCompetion FROM ResultCompetion resultCompetion";
	private static final String _SQL_SELECT_RESULTCOMPETION_WHERE = "SELECT resultCompetion FROM ResultCompetion resultCompetion WHERE ";
	private static final String _SQL_COUNT_RESULTCOMPETION = "SELECT COUNT(resultCompetion) FROM ResultCompetion resultCompetion";
	private static final String _SQL_COUNT_RESULTCOMPETION_WHERE = "SELECT COUNT(resultCompetion) FROM ResultCompetion resultCompetion WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "resultCompetion.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "resultCompetion.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(resultCompetion.requestCode IS NULL OR resultCompetion.requestCode = ?)";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"resultCompetion.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"resultCompetion.documentYear = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultCompetion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResultCompetion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ResultCompetion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ResultCompetionPersistenceImpl.class);
	private static ResultCompetion _nullResultCompetion = new ResultCompetionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ResultCompetion> toCacheModel() {
				return _nullResultCompetionCacheModel;
			}
		};

	private static CacheModel<ResultCompetion> _nullResultCompetionCacheModel = new CacheModel<ResultCompetion>() {
			public ResultCompetion toEntityModel() {
				return _nullResultCompetion;
			}
		};
}