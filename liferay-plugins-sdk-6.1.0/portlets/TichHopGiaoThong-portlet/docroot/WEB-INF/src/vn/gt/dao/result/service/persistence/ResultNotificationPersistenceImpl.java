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

import vn.gt.dao.result.NoSuchResultNotificationException;
import vn.gt.dao.result.model.ResultNotification;
import vn.gt.dao.result.model.impl.ResultNotificationImpl;
import vn.gt.dao.result.model.impl.ResultNotificationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the result notification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultNotificationPersistence
 * @see ResultNotificationUtil
 * @generated
 */
public class ResultNotificationPersistenceImpl extends BasePersistenceImpl<ResultNotification>
	implements ResultNotificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultNotificationUtil} to access the result notification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultNotificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BUSINESSTYPECODE =
		new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED,
			ResultNotificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBusinessTypeCode",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE =
		new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED,
			ResultNotificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBusinessTypeCode",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			ResultNotificationModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK |
			ResultNotificationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultNotificationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BUSINESSTYPECODE = new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBusinessTypeCode",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED,
			ResultNotificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED,
			ResultNotificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			ResultNotificationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultNotificationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED,
			ResultNotificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED,
			ResultNotificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the result notification in the entity cache if it is enabled.
	 *
	 * @param resultNotification the result notification
	 */
	public void cacheResult(ResultNotification resultNotification) {
		EntityCacheUtil.putResult(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationImpl.class, resultNotification.getPrimaryKey(),
			resultNotification);

		resultNotification.resetOriginalValues();
	}

	/**
	 * Caches the result notifications in the entity cache if it is enabled.
	 *
	 * @param resultNotifications the result notifications
	 */
	public void cacheResult(List<ResultNotification> resultNotifications) {
		for (ResultNotification resultNotification : resultNotifications) {
			if (EntityCacheUtil.getResult(
						ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
						ResultNotificationImpl.class,
						resultNotification.getPrimaryKey()) == null) {
				cacheResult(resultNotification);
			}
			else {
				resultNotification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all result notifications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ResultNotificationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ResultNotificationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the result notification.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResultNotification resultNotification) {
		EntityCacheUtil.removeResult(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationImpl.class, resultNotification.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ResultNotification> resultNotifications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ResultNotification resultNotification : resultNotifications) {
			EntityCacheUtil.removeResult(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
				ResultNotificationImpl.class, resultNotification.getPrimaryKey());
		}
	}

	/**
	 * Creates a new result notification with the primary key. Does not add the result notification to the database.
	 *
	 * @param id the primary key for the new result notification
	 * @return the new result notification
	 */
	public ResultNotification create(long id) {
		ResultNotification resultNotification = new ResultNotificationImpl();

		resultNotification.setNew(true);
		resultNotification.setPrimaryKey(id);

		return resultNotification;
	}

	/**
	 * Removes the result notification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the result notification
	 * @return the result notification that was removed
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification remove(long id)
		throws NoSuchResultNotificationException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the result notification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the result notification
	 * @return the result notification that was removed
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultNotification remove(Serializable primaryKey)
		throws NoSuchResultNotificationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ResultNotification resultNotification = (ResultNotification)session.get(ResultNotificationImpl.class,
					primaryKey);

			if (resultNotification == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchResultNotificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(resultNotification);
		}
		catch (NoSuchResultNotificationException nsee) {
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
	protected ResultNotification removeImpl(
		ResultNotification resultNotification) throws SystemException {
		resultNotification = toUnwrappedModel(resultNotification);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, resultNotification);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(resultNotification);

		return resultNotification;
	}

	@Override
	public ResultNotification updateImpl(
		vn.gt.dao.result.model.ResultNotification resultNotification,
		boolean merge) throws SystemException {
		resultNotification = toUnwrappedModel(resultNotification);

		boolean isNew = resultNotification.isNew();

		ResultNotificationModelImpl resultNotificationModelImpl = (ResultNotificationModelImpl)resultNotification;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, resultNotification, merge);

			resultNotification.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ResultNotificationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((resultNotificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(resultNotificationModelImpl.getOriginalBusinessTypeCode()),
						Long.valueOf(resultNotificationModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultNotificationModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE,
					args);

				args = new Object[] {
						Integer.valueOf(resultNotificationModelImpl.getBusinessTypeCode()),
						Long.valueOf(resultNotificationModelImpl.getDocumentName()),
						Integer.valueOf(resultNotificationModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE,
					args);
			}

			if ((resultNotificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(resultNotificationModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultNotificationModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(resultNotificationModelImpl.getDocumentName()),
						Integer.valueOf(resultNotificationModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}
		}

		EntityCacheUtil.putResult(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
			ResultNotificationImpl.class, resultNotification.getPrimaryKey(),
			resultNotification);

		return resultNotification;
	}

	protected ResultNotification toUnwrappedModel(
		ResultNotification resultNotification) {
		if (resultNotification instanceof ResultNotificationImpl) {
			return resultNotification;
		}

		ResultNotificationImpl resultNotificationImpl = new ResultNotificationImpl();

		resultNotificationImpl.setNew(resultNotification.isNew());
		resultNotificationImpl.setPrimaryKey(resultNotification.getPrimaryKey());

		resultNotificationImpl.setId(resultNotification.getId());
		resultNotificationImpl.setRequestCode(resultNotification.getRequestCode());
		resultNotificationImpl.setRequestState(resultNotification.getRequestState());
		resultNotificationImpl.setDocumentName(resultNotification.getDocumentName());
		resultNotificationImpl.setDocumentYear(resultNotification.getDocumentYear());
		resultNotificationImpl.setMaritimeCode(resultNotification.getMaritimeCode());
		resultNotificationImpl.setRole(resultNotification.getRole());
		resultNotificationImpl.setResponse(resultNotification.getResponse());
		resultNotificationImpl.setOrganization(resultNotification.getOrganization());
		resultNotificationImpl.setDivision(resultNotification.getDivision());
		resultNotificationImpl.setOfficerName(resultNotification.getOfficerName());
		resultNotificationImpl.setLatestDate(resultNotification.getLatestDate());
		resultNotificationImpl.setBusinessTypeCode(resultNotification.getBusinessTypeCode());
		resultNotificationImpl.setRemarks(resultNotification.getRemarks());
		resultNotificationImpl.setIsReply(resultNotification.getIsReply());
		resultNotificationImpl.setResponseTime(resultNotification.getResponseTime());

		return resultNotificationImpl;
	}

	/**
	 * Returns the result notification with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the result notification
	 * @return the result notification
	 * @throws com.liferay.portal.NoSuchModelException if a result notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultNotification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result notification with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultNotificationException} if it could not be found.
	 *
	 * @param id the primary key of the result notification
	 * @return the result notification
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification findByPrimaryKey(long id)
		throws NoSuchResultNotificationException, SystemException {
		ResultNotification resultNotification = fetchByPrimaryKey(id);

		if (resultNotification == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchResultNotificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return resultNotification;
	}

	/**
	 * Returns the result notification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the result notification
	 * @return the result notification, or <code>null</code> if a result notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultNotification fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result notification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the result notification
	 * @return the result notification, or <code>null</code> if a result notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification fetchByPrimaryKey(long id)
		throws SystemException {
		ResultNotification resultNotification = (ResultNotification)EntityCacheUtil.getResult(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
				ResultNotificationImpl.class, id);

		if (resultNotification == _nullResultNotification) {
			return null;
		}

		if (resultNotification == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				resultNotification = (ResultNotification)session.get(ResultNotificationImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (resultNotification != null) {
					cacheResult(resultNotification);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ResultNotificationModelImpl.ENTITY_CACHE_ENABLED,
						ResultNotificationImpl.class, id,
						_nullResultNotification);
				}

				closeSession(session);
			}
		}

		return resultNotification;
	}

	/**
	 * Returns all the result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findByBusinessTypeCode(
		int businessTypeCode, long documentName, int documentYear)
		throws SystemException {
		return findByBusinessTypeCode(businessTypeCode, documentName,
			documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result notifications
	 * @param end the upper bound of the range of result notifications (not inclusive)
	 * @return the range of matching result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findByBusinessTypeCode(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end) throws SystemException {
		return findByBusinessTypeCode(businessTypeCode, documentName,
			documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result notifications
	 * @param end the upper bound of the range of result notifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findByBusinessTypeCode(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE;
			finderArgs = new Object[] {
					businessTypeCode, documentName, documentYear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BUSINESSTYPECODE;
			finderArgs = new Object[] {
					businessTypeCode, documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<ResultNotification> list = (List<ResultNotification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_RESULTNOTIFICATION_WHERE);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultNotificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessTypeCode);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<ResultNotification>)QueryUtil.list(q,
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
	 * Returns the first result notification in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result notification
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a matching result notification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification findByBusinessTypeCode_First(
		int businessTypeCode, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultNotificationException, SystemException {
		List<ResultNotification> list = findByBusinessTypeCode(businessTypeCode,
				documentName, documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultNotificationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result notification in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result notification
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a matching result notification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification findByBusinessTypeCode_Last(
		int businessTypeCode, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultNotificationException, SystemException {
		int count = countByBusinessTypeCode(businessTypeCode, documentName,
				documentYear);

		List<ResultNotification> list = findByBusinessTypeCode(businessTypeCode,
				documentName, documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultNotificationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result notifications before and after the current result notification in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result notification
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result notification
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification[] findByBusinessTypeCode_PrevAndNext(long id,
		int businessTypeCode, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultNotificationException, SystemException {
		ResultNotification resultNotification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultNotification[] array = new ResultNotificationImpl[3];

			array[0] = getByBusinessTypeCode_PrevAndNext(session,
					resultNotification, businessTypeCode, documentName,
					documentYear, orderByComparator, true);

			array[1] = resultNotification;

			array[2] = getByBusinessTypeCode_PrevAndNext(session,
					resultNotification, businessTypeCode, documentName,
					documentYear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ResultNotification getByBusinessTypeCode_PrevAndNext(
		Session session, ResultNotification resultNotification,
		int businessTypeCode, long documentName, int documentYear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTNOTIFICATION_WHERE);

		query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

		query.append(_FINDER_COLUMN_BUSINESSTYPECODE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_BUSINESSTYPECODE_DOCUMENTYEAR_2);

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
			query.append(ResultNotificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(businessTypeCode);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultNotification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultNotification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result notifications where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result notifications where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result notifications
	 * @param end the upper bound of the range of result notifications (not inclusive)
	 * @return the range of matching result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the result notifications where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result notifications
	 * @param end the upper bound of the range of result notifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findByDocumentNameAnddocumentYear(
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

		List<ResultNotification> list = (List<ResultNotification>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTNOTIFICATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultNotificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<ResultNotification>)QueryUtil.list(q,
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
	 * Returns the first result notification in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result notification
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a matching result notification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultNotificationException, SystemException {
		List<ResultNotification> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultNotificationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result notification in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result notification
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a matching result notification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultNotificationException, SystemException {
		int count = countByDocumentNameAnddocumentYear(documentName,
				documentYear);

		List<ResultNotification> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultNotificationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result notifications before and after the current result notification in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result notification
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result notification
	 * @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultNotification[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultNotificationException, SystemException {
		ResultNotification resultNotification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultNotification[] array = new ResultNotificationImpl[3];

			array[0] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					resultNotification, documentName, documentYear,
					orderByComparator, true);

			array[1] = resultNotification;

			array[2] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					resultNotification, documentName, documentYear,
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

	protected ResultNotification getByDocumentNameAnddocumentYear_PrevAndNext(
		Session session, ResultNotification resultNotification,
		long documentName, int documentYear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTNOTIFICATION_WHERE);

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
			query.append(ResultNotificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultNotification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultNotification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result notifications.
	 *
	 * @return the result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result notifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result notifications
	 * @param end the upper bound of the range of result notifications (not inclusive)
	 * @return the range of result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the result notifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result notifications
	 * @param end the upper bound of the range of result notifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultNotification> findAll(int start, int end,
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

		List<ResultNotification> list = (List<ResultNotification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESULTNOTIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTNOTIFICATION.concat(ResultNotificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ResultNotification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ResultNotification>)QueryUtil.list(q,
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
	 * Removes all the result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByBusinessTypeCode(int businessTypeCode,
		long documentName, int documentYear) throws SystemException {
		for (ResultNotification resultNotification : findByBusinessTypeCode(
				businessTypeCode, documentName, documentYear)) {
			remove(resultNotification);
		}
	}

	/**
	 * Removes all the result notifications where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (ResultNotification resultNotification : findByDocumentNameAnddocumentYear(
				documentName, documentYear)) {
			remove(resultNotification);
		}
	}

	/**
	 * Removes all the result notifications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ResultNotification resultNotification : findAll()) {
			remove(resultNotification);
		}
	}

	/**
	 * Returns the number of result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public int countByBusinessTypeCode(int businessTypeCode, long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] {
				businessTypeCode, documentName, documentYear
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_RESULTNOTIFICATION_WHERE);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_DOCUMENTYEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessTypeCode);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result notifications where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTNOTIFICATION_WHERE);

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
	 * Returns the number of result notifications.
	 *
	 * @return the number of result notifications
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESULTNOTIFICATION);

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
	 * Initializes the result notification persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.result.model.ResultNotification")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ResultNotification>> listenersList = new ArrayList<ModelListener<ResultNotification>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ResultNotification>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ResultNotificationImpl.class.getName());
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
	private static final String _SQL_SELECT_RESULTNOTIFICATION = "SELECT resultNotification FROM ResultNotification resultNotification";
	private static final String _SQL_SELECT_RESULTNOTIFICATION_WHERE = "SELECT resultNotification FROM ResultNotification resultNotification WHERE ";
	private static final String _SQL_COUNT_RESULTNOTIFICATION = "SELECT COUNT(resultNotification) FROM ResultNotification resultNotification";
	private static final String _SQL_COUNT_RESULTNOTIFICATION_WHERE = "SELECT COUNT(resultNotification) FROM ResultNotification resultNotification WHERE ";
	private static final String _FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2 =
		"resultNotification.businessTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_BUSINESSTYPECODE_DOCUMENTNAME_2 = "resultNotification.documentName = ? AND ";
	private static final String _FINDER_COLUMN_BUSINESSTYPECODE_DOCUMENTYEAR_2 = "resultNotification.documentYear = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"resultNotification.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"resultNotification.documentYear = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultNotification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResultNotification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ResultNotification exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ResultNotificationPersistenceImpl.class);
	private static ResultNotification _nullResultNotification = new ResultNotificationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ResultNotification> toCacheModel() {
				return _nullResultNotificationCacheModel;
			}
		};

	private static CacheModel<ResultNotification> _nullResultNotificationCacheModel =
		new CacheModel<ResultNotification>() {
			public ResultNotification toEntityModel() {
				return _nullResultNotification;
			}
		};
}