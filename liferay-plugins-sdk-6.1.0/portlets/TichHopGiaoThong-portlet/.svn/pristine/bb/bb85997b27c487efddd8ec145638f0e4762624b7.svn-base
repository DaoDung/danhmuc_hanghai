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

import vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;
import vn.gt.dao.noticeandmessage.model.InterfaceRequest;
import vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestImpl;
import vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the interface request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see InterfaceRequestPersistence
 * @see InterfaceRequestUtil
 * @generated
 */
public class InterfaceRequestPersistenceImpl extends BasePersistenceImpl<InterfaceRequest>
	implements InterfaceRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InterfaceRequestUtil} to access the interface request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InterfaceRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			InterfaceRequestModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONCODE =
		new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOrganizationCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE =
		new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOrganizationCode", new String[] { String.class.getName() },
			InterfaceRequestModelImpl.ORGANIZATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONCODE = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOrganizationCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCCODE = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLocCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE =
		new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocCode",
			new String[] { String.class.getName() },
			InterfaceRequestModelImpl.LOCCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCCODE = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_BY_documentNameRef",
			new String[] { String.class.getName(), String.class.getName() },
			InterfaceRequestModelImpl.DOCUMENTNAMEREF_COLUMN_BITMASK |
			InterfaceRequestModelImpl.BUSINESSTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_BY_DOCUMENTNAMEREF = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_BY_documentNameRef",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the interface request in the entity cache if it is enabled.
	 *
	 * @param interfaceRequest the interface request
	 */
	public void cacheResult(InterfaceRequest interfaceRequest) {
		EntityCacheUtil.putResult(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestImpl.class, interfaceRequest.getPrimaryKey(),
			interfaceRequest);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { interfaceRequest.getRequestCode() }, interfaceRequest);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
			new Object[] {
				interfaceRequest.getDocumentNameRef(),
				
			interfaceRequest.getBusinessType()
			}, interfaceRequest);

		interfaceRequest.resetOriginalValues();
	}

	/**
	 * Caches the interface requests in the entity cache if it is enabled.
	 *
	 * @param interfaceRequests the interface requests
	 */
	public void cacheResult(List<InterfaceRequest> interfaceRequests) {
		for (InterfaceRequest interfaceRequest : interfaceRequests) {
			if (EntityCacheUtil.getResult(
						InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
						InterfaceRequestImpl.class,
						interfaceRequest.getPrimaryKey()) == null) {
				cacheResult(interfaceRequest);
			}
			else {
				interfaceRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all interface requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InterfaceRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InterfaceRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the interface request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InterfaceRequest interfaceRequest) {
		EntityCacheUtil.removeResult(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestImpl.class, interfaceRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(interfaceRequest);
	}

	@Override
	public void clearCache(List<InterfaceRequest> interfaceRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InterfaceRequest interfaceRequest : interfaceRequests) {
			EntityCacheUtil.removeResult(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
				InterfaceRequestImpl.class, interfaceRequest.getPrimaryKey());

			clearUniqueFindersCache(interfaceRequest);
		}
	}

	protected void clearUniqueFindersCache(InterfaceRequest interfaceRequest) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { interfaceRequest.getRequestCode() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
			new Object[] {
				interfaceRequest.getDocumentNameRef(),
				
			interfaceRequest.getBusinessType()
			});
	}

	/**
	 * Creates a new interface request with the primary key. Does not add the interface request to the database.
	 *
	 * @param id the primary key for the new interface request
	 * @return the new interface request
	 */
	public InterfaceRequest create(long id) {
		InterfaceRequest interfaceRequest = new InterfaceRequestImpl();

		interfaceRequest.setNew(true);
		interfaceRequest.setPrimaryKey(id);

		return interfaceRequest;
	}

	/**
	 * Removes the interface request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the interface request
	 * @return the interface request that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest remove(long id)
		throws NoSuchInterfaceRequestException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the interface request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the interface request
	 * @return the interface request that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequest remove(Serializable primaryKey)
		throws NoSuchInterfaceRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InterfaceRequest interfaceRequest = (InterfaceRequest)session.get(InterfaceRequestImpl.class,
					primaryKey);

			if (interfaceRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInterfaceRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(interfaceRequest);
		}
		catch (NoSuchInterfaceRequestException nsee) {
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
	protected InterfaceRequest removeImpl(InterfaceRequest interfaceRequest)
		throws SystemException {
		interfaceRequest = toUnwrappedModel(interfaceRequest);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, interfaceRequest);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(interfaceRequest);

		return interfaceRequest;
	}

	@Override
	public InterfaceRequest updateImpl(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest,
		boolean merge) throws SystemException {
		interfaceRequest = toUnwrappedModel(interfaceRequest);

		boolean isNew = interfaceRequest.isNew();

		InterfaceRequestModelImpl interfaceRequestModelImpl = (InterfaceRequestModelImpl)interfaceRequest;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, interfaceRequest, merge);

			interfaceRequest.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InterfaceRequestModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((interfaceRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						interfaceRequestModelImpl.getOriginalOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE,
					args);

				args = new Object[] {
						interfaceRequestModelImpl.getOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE,
					args);
			}

			if ((interfaceRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						interfaceRequestModelImpl.getOriginalLocCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);

				args = new Object[] { interfaceRequestModelImpl.getLocCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestImpl.class, interfaceRequest.getPrimaryKey(),
			interfaceRequest);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
				new Object[] { interfaceRequest.getRequestCode() },
				interfaceRequest);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
				new Object[] {
					interfaceRequest.getDocumentNameRef(),
					
				interfaceRequest.getBusinessType()
				}, interfaceRequest);
		}
		else {
			if ((interfaceRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						interfaceRequestModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					new Object[] { interfaceRequest.getRequestCode() },
					interfaceRequest);
			}

			if ((interfaceRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						interfaceRequestModelImpl.getOriginalDocumentNameRef(),
						
						interfaceRequestModelImpl.getOriginalBusinessType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_BY_DOCUMENTNAMEREF,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
					new Object[] {
						interfaceRequest.getDocumentNameRef(),
						
					interfaceRequest.getBusinessType()
					}, interfaceRequest);
			}
		}

		return interfaceRequest;
	}

	protected InterfaceRequest toUnwrappedModel(
		InterfaceRequest interfaceRequest) {
		if (interfaceRequest instanceof InterfaceRequestImpl) {
			return interfaceRequest;
		}

		InterfaceRequestImpl interfaceRequestImpl = new InterfaceRequestImpl();

		interfaceRequestImpl.setNew(interfaceRequest.isNew());
		interfaceRequestImpl.setPrimaryKey(interfaceRequest.getPrimaryKey());

		interfaceRequestImpl.setId(interfaceRequest.getId());
		interfaceRequestImpl.setRequestCode(interfaceRequest.getRequestCode());
		interfaceRequestImpl.setOrganizationCode(interfaceRequest.getOrganizationCode());
		interfaceRequestImpl.setLocCode(interfaceRequest.getLocCode());
		interfaceRequestImpl.setRequestDate(interfaceRequest.getRequestDate());
		interfaceRequestImpl.setRequestedDate(interfaceRequest.getRequestedDate());
		interfaceRequestImpl.setRequestDirection(interfaceRequest.getRequestDirection());
		interfaceRequestImpl.setRequestState(interfaceRequest.getRequestState());
		interfaceRequestImpl.setRequestResponseTime(interfaceRequest.getRequestResponseTime());
		interfaceRequestImpl.setDocumentType(interfaceRequest.getDocumentType());
		interfaceRequestImpl.setDocumentNameRef(interfaceRequest.getDocumentNameRef());
		interfaceRequestImpl.setBusinessType(interfaceRequest.getBusinessType());
		interfaceRequestImpl.setFunctionType(interfaceRequest.getFunctionType());
		interfaceRequestImpl.setRequestContent(interfaceRequest.getRequestContent());
		interfaceRequestImpl.setSenderName(interfaceRequest.getSenderName());
		interfaceRequestImpl.setRequestVersion(interfaceRequest.getRequestVersion());
		interfaceRequestImpl.setSenderIdentify(interfaceRequest.getSenderIdentify());
		interfaceRequestImpl.setReceiverName(interfaceRequest.getReceiverName());
		interfaceRequestImpl.setSendingDate(interfaceRequest.getSendingDate());
		interfaceRequestImpl.setReceiverIdentify(interfaceRequest.getReceiverIdentify());
		interfaceRequestImpl.setRemarks(interfaceRequest.getRemarks());

		return interfaceRequestImpl;
	}

	/**
	 * Returns the interface request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the interface request
	 * @return the interface request
	 * @throws com.liferay.portal.NoSuchModelException if a interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the interface request with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	 *
	 * @param id the primary key of the interface request
	 * @return the interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest findByPrimaryKey(long id)
		throws NoSuchInterfaceRequestException, SystemException {
		InterfaceRequest interfaceRequest = fetchByPrimaryKey(id);

		if (interfaceRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchInterfaceRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return interfaceRequest;
	}

	/**
	 * Returns the interface request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the interface request
	 * @return the interface request, or <code>null</code> if a interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the interface request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the interface request
	 * @return the interface request, or <code>null</code> if a interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest fetchByPrimaryKey(long id)
		throws SystemException {
		InterfaceRequest interfaceRequest = (InterfaceRequest)EntityCacheUtil.getResult(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
				InterfaceRequestImpl.class, id);

		if (interfaceRequest == _nullInterfaceRequest) {
			return null;
		}

		if (interfaceRequest == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				interfaceRequest = (InterfaceRequest)session.get(InterfaceRequestImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (interfaceRequest != null) {
					cacheResult(interfaceRequest);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(InterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
						InterfaceRequestImpl.class, id, _nullInterfaceRequest);
				}

				closeSession(session);
			}
		}

		return interfaceRequest;
	}

	/**
	 * Returns the interface request where requestCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest findByRequestCode(String requestCode)
		throws NoSuchInterfaceRequestException, SystemException {
		InterfaceRequest interfaceRequest = fetchByRequestCode(requestCode);

		if (interfaceRequest == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInterfaceRequestException(msg.toString());
		}

		return interfaceRequest;
	}

	/**
	 * Returns the interface request where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the interface request where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_INTERFACEREQUEST_WHERE);

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

			query.append(InterfaceRequestModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				List<InterfaceRequest> list = q.list();

				result = list;

				InterfaceRequest interfaceRequest = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					interfaceRequest = list.get(0);

					cacheResult(interfaceRequest);

					if ((interfaceRequest.getRequestCode() == null) ||
							!interfaceRequest.getRequestCode()
												 .equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, interfaceRequest);
					}
				}

				return interfaceRequest;
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
				return (InterfaceRequest)result;
			}
		}
	}

	/**
	 * Returns all the interface requests where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findByOrganizationCode(
		String organizationCode) throws SystemException {
		return findByOrganizationCode(organizationCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the interface requests where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param start the lower bound of the range of interface requests
	 * @param end the upper bound of the range of interface requests (not inclusive)
	 * @return the range of matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findByOrganizationCode(
		String organizationCode, int start, int end) throws SystemException {
		return findByOrganizationCode(organizationCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the interface requests where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param start the lower bound of the range of interface requests
	 * @param end the upper bound of the range of interface requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findByOrganizationCode(
		String organizationCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE;
			finderArgs = new Object[] { organizationCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONCODE;
			finderArgs = new Object[] {
					organizationCode,
					
					start, end, orderByComparator
				};
		}

		List<InterfaceRequest> list = (List<InterfaceRequest>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_INTERFACEREQUEST_WHERE);

			if (organizationCode == null) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
			}
			else {
				if (organizationCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(InterfaceRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (organizationCode != null) {
					qPos.add(organizationCode);
				}

				list = (List<InterfaceRequest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first interface request in the ordered set where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest findByOrganizationCode_First(
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestException, SystemException {
		List<InterfaceRequest> list = findByOrganizationCode(organizationCode,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("organizationCode=");
			msg.append(organizationCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchInterfaceRequestException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last interface request in the ordered set where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest findByOrganizationCode_Last(
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestException, SystemException {
		int count = countByOrganizationCode(organizationCode);

		List<InterfaceRequest> list = findByOrganizationCode(organizationCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("organizationCode=");
			msg.append(organizationCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchInterfaceRequestException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the interface requests before and after the current interface request in the ordered set where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current interface request
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest[] findByOrganizationCode_PrevAndNext(long id,
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestException, SystemException {
		InterfaceRequest interfaceRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InterfaceRequest[] array = new InterfaceRequestImpl[3];

			array[0] = getByOrganizationCode_PrevAndNext(session,
					interfaceRequest, organizationCode, orderByComparator, true);

			array[1] = interfaceRequest;

			array[2] = getByOrganizationCode_PrevAndNext(session,
					interfaceRequest, organizationCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected InterfaceRequest getByOrganizationCode_PrevAndNext(
		Session session, InterfaceRequest interfaceRequest,
		String organizationCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INTERFACEREQUEST_WHERE);

		if (organizationCode == null) {
			query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
		}
		else {
			if (organizationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
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
			query.append(InterfaceRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (organizationCode != null) {
			qPos.add(organizationCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(interfaceRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InterfaceRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the interface requests where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @return the matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findByLocCode(String locCode)
		throws SystemException {
		return findByLocCode(locCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the interface requests where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param start the lower bound of the range of interface requests
	 * @param end the upper bound of the range of interface requests (not inclusive)
	 * @return the range of matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findByLocCode(String locCode, int start,
		int end) throws SystemException {
		return findByLocCode(locCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the interface requests where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param start the lower bound of the range of interface requests
	 * @param end the upper bound of the range of interface requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findByLocCode(String locCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE;
			finderArgs = new Object[] { locCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCCODE;
			finderArgs = new Object[] { locCode, start, end, orderByComparator };
		}

		List<InterfaceRequest> list = (List<InterfaceRequest>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_INTERFACEREQUEST_WHERE);

			if (locCode == null) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
			}
			else {
				if (locCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(InterfaceRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (locCode != null) {
					qPos.add(locCode);
				}

				list = (List<InterfaceRequest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first interface request in the ordered set where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest findByLocCode_First(String locCode,
		OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestException, SystemException {
		List<InterfaceRequest> list = findByLocCode(locCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("locCode=");
			msg.append(locCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchInterfaceRequestException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last interface request in the ordered set where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest findByLocCode_Last(String locCode,
		OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestException, SystemException {
		int count = countByLocCode(locCode);

		List<InterfaceRequest> list = findByLocCode(locCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("locCode=");
			msg.append(locCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchInterfaceRequestException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the interface requests before and after the current interface request in the ordered set where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current interface request
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest[] findByLocCode_PrevAndNext(long id,
		String locCode, OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestException, SystemException {
		InterfaceRequest interfaceRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InterfaceRequest[] array = new InterfaceRequestImpl[3];

			array[0] = getByLocCode_PrevAndNext(session, interfaceRequest,
					locCode, orderByComparator, true);

			array[1] = interfaceRequest;

			array[2] = getByLocCode_PrevAndNext(session, interfaceRequest,
					locCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected InterfaceRequest getByLocCode_PrevAndNext(Session session,
		InterfaceRequest interfaceRequest, String locCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INTERFACEREQUEST_WHERE);

		if (locCode == null) {
			query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
		}
		else {
			if (locCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
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
			query.append(InterfaceRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (locCode != null) {
			qPos.add(locCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(interfaceRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InterfaceRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the interface request where documentNameRef = &#63; and businessType = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	 *
	 * @param documentNameRef the document name ref
	 * @param businessType the business type
	 * @return the matching interface request
	 * @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest findByF_BY_documentNameRef(String documentNameRef,
		String businessType)
		throws NoSuchInterfaceRequestException, SystemException {
		InterfaceRequest interfaceRequest = fetchByF_BY_documentNameRef(documentNameRef,
				businessType);

		if (interfaceRequest == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentNameRef=");
			msg.append(documentNameRef);

			msg.append(", businessType=");
			msg.append(businessType);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInterfaceRequestException(msg.toString());
		}

		return interfaceRequest;
	}

	/**
	 * Returns the interface request where documentNameRef = &#63; and businessType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentNameRef the document name ref
	 * @param businessType the business type
	 * @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest fetchByF_BY_documentNameRef(
		String documentNameRef, String businessType) throws SystemException {
		return fetchByF_BY_documentNameRef(documentNameRef, businessType, true);
	}

	/**
	 * Returns the interface request where documentNameRef = &#63; and businessType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentNameRef the document name ref
	 * @param businessType the business type
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public InterfaceRequest fetchByF_BY_documentNameRef(
		String documentNameRef, String businessType, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { documentNameRef, businessType };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_INTERFACEREQUEST_WHERE);

			if (documentNameRef == null) {
				query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_1);
			}
			else {
				if (documentNameRef.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_2);
				}
			}

			if (businessType == null) {
				query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_1);
			}
			else {
				if (businessType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_2);
				}
			}

			query.append(InterfaceRequestModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentNameRef != null) {
					qPos.add(documentNameRef);
				}

				if (businessType != null) {
					qPos.add(businessType);
				}

				List<InterfaceRequest> list = q.list();

				result = list;

				InterfaceRequest interfaceRequest = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
						finderArgs, list);
				}
				else {
					interfaceRequest = list.get(0);

					cacheResult(interfaceRequest);

					if ((interfaceRequest.getDocumentNameRef() == null) ||
							!interfaceRequest.getDocumentNameRef()
												 .equals(documentNameRef) ||
							(interfaceRequest.getBusinessType() == null) ||
							!interfaceRequest.getBusinessType()
												 .equals(businessType)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
							finderArgs, interfaceRequest);
					}
				}

				return interfaceRequest;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_BY_DOCUMENTNAMEREF,
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
				return (InterfaceRequest)result;
			}
		}
	}

	/**
	 * Returns all the interface requests.
	 *
	 * @return the interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the interface requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of interface requests
	 * @param end the upper bound of the range of interface requests (not inclusive)
	 * @return the range of interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the interface requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of interface requests
	 * @param end the upper bound of the range of interface requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public List<InterfaceRequest> findAll(int start, int end,
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

		List<InterfaceRequest> list = (List<InterfaceRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INTERFACEREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INTERFACEREQUEST.concat(InterfaceRequestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<InterfaceRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<InterfaceRequest>)QueryUtil.list(q,
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
	 * Removes the interface request where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws NoSuchInterfaceRequestException, SystemException {
		InterfaceRequest interfaceRequest = findByRequestCode(requestCode);

		remove(interfaceRequest);
	}

	/**
	 * Removes all the interface requests where organizationCode = &#63; from the database.
	 *
	 * @param organizationCode the organization code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByOrganizationCode(String organizationCode)
		throws SystemException {
		for (InterfaceRequest interfaceRequest : findByOrganizationCode(
				organizationCode)) {
			remove(interfaceRequest);
		}
	}

	/**
	 * Removes all the interface requests where locCode = &#63; from the database.
	 *
	 * @param locCode the loc code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByLocCode(String locCode) throws SystemException {
		for (InterfaceRequest interfaceRequest : findByLocCode(locCode)) {
			remove(interfaceRequest);
		}
	}

	/**
	 * Removes the interface request where documentNameRef = &#63; and businessType = &#63; from the database.
	 *
	 * @param documentNameRef the document name ref
	 * @param businessType the business type
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_BY_documentNameRef(String documentNameRef,
		String businessType)
		throws NoSuchInterfaceRequestException, SystemException {
		InterfaceRequest interfaceRequest = findByF_BY_documentNameRef(documentNameRef,
				businessType);

		remove(interfaceRequest);
	}

	/**
	 * Removes all the interface requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (InterfaceRequest interfaceRequest : findAll()) {
			remove(interfaceRequest);
		}
	}

	/**
	 * Returns the number of interface requests where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INTERFACEREQUEST_WHERE);

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
	 * Returns the number of interface requests where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the number of matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countByOrganizationCode(String organizationCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { organizationCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INTERFACEREQUEST_WHERE);

			if (organizationCode == null) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
			}
			else {
				if (organizationCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (organizationCode != null) {
					qPos.add(organizationCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of interface requests where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @return the number of matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countByLocCode(String locCode) throws SystemException {
		Object[] finderArgs = new Object[] { locCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_LOCCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INTERFACEREQUEST_WHERE);

			if (locCode == null) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
			}
			else {
				if (locCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (locCode != null) {
					qPos.add(locCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LOCCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of interface requests where documentNameRef = &#63; and businessType = &#63;.
	 *
	 * @param documentNameRef the document name ref
	 * @param businessType the business type
	 * @return the number of matching interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_BY_documentNameRef(String documentNameRef,
		String businessType) throws SystemException {
		Object[] finderArgs = new Object[] { documentNameRef, businessType };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_BY_DOCUMENTNAMEREF,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_INTERFACEREQUEST_WHERE);

			if (documentNameRef == null) {
				query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_1);
			}
			else {
				if (documentNameRef.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_2);
				}
			}

			if (businessType == null) {
				query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_1);
			}
			else {
				if (businessType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentNameRef != null) {
					qPos.add(documentNameRef);
				}

				if (businessType != null) {
					qPos.add(businessType);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_BY_DOCUMENTNAMEREF,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of interface requests.
	 *
	 * @return the number of interface requests
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_INTERFACEREQUEST);

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
	 * Initializes the interface request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.InterfaceRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InterfaceRequest>> listenersList = new ArrayList<ModelListener<InterfaceRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InterfaceRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InterfaceRequestImpl.class.getName());
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
	private static final String _SQL_SELECT_INTERFACEREQUEST = "SELECT interfaceRequest FROM InterfaceRequest interfaceRequest";
	private static final String _SQL_SELECT_INTERFACEREQUEST_WHERE = "SELECT interfaceRequest FROM InterfaceRequest interfaceRequest WHERE ";
	private static final String _SQL_COUNT_INTERFACEREQUEST = "SELECT COUNT(interfaceRequest) FROM InterfaceRequest interfaceRequest";
	private static final String _SQL_COUNT_INTERFACEREQUEST_WHERE = "SELECT COUNT(interfaceRequest) FROM InterfaceRequest interfaceRequest WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "interfaceRequest.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "interfaceRequest.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(interfaceRequest.requestCode IS NULL OR interfaceRequest.requestCode = ?)";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1 =
		"interfaceRequest.organizationCode IS NULL";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2 =
		"interfaceRequest.organizationCode = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3 =
		"(interfaceRequest.organizationCode IS NULL OR interfaceRequest.organizationCode = ?)";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_1 = "interfaceRequest.locCode IS NULL";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_2 = "interfaceRequest.locCode = ?";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_3 = "(interfaceRequest.locCode IS NULL OR interfaceRequest.locCode = ?)";
	private static final String _FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_1 =
		"interfaceRequest.documentNameRef IS NULL AND ";
	private static final String _FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_2 =
		"interfaceRequest.documentNameRef = ? AND ";
	private static final String _FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_DOCUMENTNAMEREF_3 =
		"(interfaceRequest.documentNameRef IS NULL OR interfaceRequest.documentNameRef = ?) AND ";
	private static final String _FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_1 =
		"interfaceRequest.businessType IS NULL AND  ( interfaceRequest.requestDirection = 'OUT' ) ";
	private static final String _FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_2 =
		"interfaceRequest.businessType = ? AND  ( interfaceRequest.requestDirection = 'OUT' ) ";
	private static final String _FINDER_COLUMN_F_BY_DOCUMENTNAMEREF_BUSINESSTYPE_3 =
		"(interfaceRequest.businessType IS NULL OR interfaceRequest.businessType = ?) AND  ( interfaceRequest.requestDirection = 'OUT' ) ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "interfaceRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InterfaceRequest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InterfaceRequest exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InterfaceRequestPersistenceImpl.class);
	private static InterfaceRequest _nullInterfaceRequest = new InterfaceRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InterfaceRequest> toCacheModel() {
				return _nullInterfaceRequestCacheModel;
			}
		};

	private static CacheModel<InterfaceRequest> _nullInterfaceRequestCacheModel = new CacheModel<InterfaceRequest>() {
			public InterfaceRequest toEntityModel() {
				return _nullInterfaceRequest;
			}
		};
}