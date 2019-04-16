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

import vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException;
import vn.gt.dao.danhmuc.model.DmHistoryDocType;
import vn.gt.dao.danhmuc.model.impl.DmHistoryDocTypeImpl;
import vn.gt.dao.danhmuc.model.impl.DmHistoryDocTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm history doc type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryDocTypePersistence
 * @see DmHistoryDocTypeUtil
 * @generated
 */
public class DmHistoryDocTypePersistenceImpl extends BasePersistenceImpl<DmHistoryDocType>
	implements DmHistoryDocTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryDocTypeUtil} to access the dm history doc type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryDocTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTTYPE = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDocumentType", new String[] { String.class.getName() },
			DmHistoryDocTypeModelImpl.DOCUMENTTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTTYPE = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDocumentType",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION =
		new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDocumentTypeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryDocTypeModelImpl.DOCUMENTTYPE_COLUMN_BITMASK |
			DmHistoryDocTypeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION =
		new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentTypeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm history doc type in the entity cache if it is enabled.
	 *
	 * @param dmHistoryDocType the dm history doc type
	 */
	public void cacheResult(DmHistoryDocType dmHistoryDocType) {
		EntityCacheUtil.putResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, dmHistoryDocType.getPrimaryKey(),
			dmHistoryDocType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
			new Object[] { dmHistoryDocType.getDocumentType() },
			dmHistoryDocType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
			new Object[] {
				dmHistoryDocType.getDocumentType(),
				
			dmHistoryDocType.getSyncVersion()
			}, dmHistoryDocType);

		dmHistoryDocType.resetOriginalValues();
	}

	/**
	 * Caches the dm history doc types in the entity cache if it is enabled.
	 *
	 * @param dmHistoryDocTypes the dm history doc types
	 */
	public void cacheResult(List<DmHistoryDocType> dmHistoryDocTypes) {
		for (DmHistoryDocType dmHistoryDocType : dmHistoryDocTypes) {
			if (EntityCacheUtil.getResult(
						DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryDocTypeImpl.class,
						dmHistoryDocType.getPrimaryKey()) == null) {
				cacheResult(dmHistoryDocType);
			}
			else {
				dmHistoryDocType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history doc types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryDocTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryDocTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history doc type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryDocType dmHistoryDocType) {
		EntityCacheUtil.removeResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, dmHistoryDocType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
			new Object[] { dmHistoryDocType.getDocumentType() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
			new Object[] {
				dmHistoryDocType.getDocumentType(),
				
			dmHistoryDocType.getSyncVersion()
			});
	}

	/**
	 * Creates a new dm history doc type with the primary key. Does not add the dm history doc type to the database.
	 *
	 * @param id the primary key for the new dm history doc type
	 * @return the new dm history doc type
	 */
	public DmHistoryDocType create(int id) {
		DmHistoryDocType dmHistoryDocType = new DmHistoryDocTypeImpl();

		dmHistoryDocType.setNew(true);
		dmHistoryDocType.setPrimaryKey(id);

		return dmHistoryDocType;
	}

	/**
	 * Removes the dm history doc type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history doc type
	 * @return the dm history doc type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm history doc type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history doc type
	 * @return the dm history doc type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType remove(int id)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryDocType dmHistoryDocType = (DmHistoryDocType)session.get(DmHistoryDocTypeImpl.class,
					Integer.valueOf(id));

			if (dmHistoryDocType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmHistoryDocTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmHistoryDocTypePersistence.remove(dmHistoryDocType);
		}
		catch (NoSuchDmHistoryDocTypeException nsee) {
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
	 * Removes the dm history doc type from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmHistoryDocType the dm history doc type
	 * @return the dm history doc type that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType remove(DmHistoryDocType dmHistoryDocType)
		throws SystemException {
		return super.remove(dmHistoryDocType);
	}

	@Override
	protected DmHistoryDocType removeImpl(DmHistoryDocType dmHistoryDocType)
		throws SystemException {
		dmHistoryDocType = toUnwrappedModel(dmHistoryDocType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmHistoryDocType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmHistoryDocTypeModelImpl dmHistoryDocTypeModelImpl = (DmHistoryDocTypeModelImpl)dmHistoryDocType;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
			new Object[] { dmHistoryDocTypeModelImpl.getDocumentType() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
			new Object[] {
				dmHistoryDocTypeModelImpl.getDocumentType(),
				
			dmHistoryDocTypeModelImpl.getSyncVersion()
			});

		EntityCacheUtil.removeResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, dmHistoryDocType.getPrimaryKey());

		return dmHistoryDocType;
	}

	@Override
	public DmHistoryDocType updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryDocType dmHistoryDocType, boolean merge)
		throws SystemException {
		dmHistoryDocType = toUnwrappedModel(dmHistoryDocType);

		boolean isNew = dmHistoryDocType.isNew();

		DmHistoryDocTypeModelImpl dmHistoryDocTypeModelImpl = (DmHistoryDocTypeModelImpl)dmHistoryDocType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmHistoryDocType, merge);

			dmHistoryDocType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryDocTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryDocTypeImpl.class, dmHistoryDocType.getPrimaryKey(),
			dmHistoryDocType);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
				new Object[] { dmHistoryDocType.getDocumentType() },
				dmHistoryDocType);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
				new Object[] {
					dmHistoryDocType.getDocumentType(),
					
				dmHistoryDocType.getSyncVersion()
				}, dmHistoryDocType);
		}
		else {
			if ((dmHistoryDocTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryDocTypeModelImpl.getOriginalDocumentType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
					new Object[] { dmHistoryDocType.getDocumentType() },
					dmHistoryDocType);
			}

			if ((dmHistoryDocTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryDocTypeModelImpl.getOriginalDocumentType(),
						
						dmHistoryDocTypeModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
					new Object[] {
						dmHistoryDocType.getDocumentType(),
						
					dmHistoryDocType.getSyncVersion()
					}, dmHistoryDocType);
			}
		}

		return dmHistoryDocType;
	}

	protected DmHistoryDocType toUnwrappedModel(
		DmHistoryDocType dmHistoryDocType) {
		if (dmHistoryDocType instanceof DmHistoryDocTypeImpl) {
			return dmHistoryDocType;
		}

		DmHistoryDocTypeImpl dmHistoryDocTypeImpl = new DmHistoryDocTypeImpl();

		dmHistoryDocTypeImpl.setNew(dmHistoryDocType.isNew());
		dmHistoryDocTypeImpl.setPrimaryKey(dmHistoryDocType.getPrimaryKey());

		dmHistoryDocTypeImpl.setId(dmHistoryDocType.getId());
		dmHistoryDocTypeImpl.setDocumentTypeCode(dmHistoryDocType.getDocumentTypeCode());
		dmHistoryDocTypeImpl.setDocumentType(dmHistoryDocType.getDocumentType());
		dmHistoryDocTypeImpl.setDocumentTypeName(dmHistoryDocType.getDocumentTypeName());
		dmHistoryDocTypeImpl.setIsDelete(dmHistoryDocType.getIsDelete());
		dmHistoryDocTypeImpl.setMarkedAsDelete(dmHistoryDocType.getMarkedAsDelete());
		dmHistoryDocTypeImpl.setModifiedDate(dmHistoryDocType.getModifiedDate());
		dmHistoryDocTypeImpl.setRequestedDate(dmHistoryDocType.getRequestedDate());
		dmHistoryDocTypeImpl.setSyncVersion(dmHistoryDocType.getSyncVersion());

		return dmHistoryDocTypeImpl;
	}

	/**
	 * Returns the dm history doc type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history doc type
	 * @return the dm history doc type
	 * @throws com.liferay.portal.NoSuchModelException if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history doc type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history doc type
	 * @return the dm history doc type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType findByPrimaryKey(int id)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = fetchByPrimaryKey(id);

		if (dmHistoryDocType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmHistoryDocTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmHistoryDocType;
	}

	/**
	 * Returns the dm history doc type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history doc type
	 * @return the dm history doc type, or <code>null</code> if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryDocType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm history doc type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history doc type
	 * @return the dm history doc type, or <code>null</code> if a dm history doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType fetchByPrimaryKey(int id) throws SystemException {
		DmHistoryDocType dmHistoryDocType = (DmHistoryDocType)EntityCacheUtil.getResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryDocTypeImpl.class, id);

		if (dmHistoryDocType == _nullDmHistoryDocType) {
			return null;
		}

		if (dmHistoryDocType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmHistoryDocType = (DmHistoryDocType)session.get(DmHistoryDocTypeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmHistoryDocType != null) {
					cacheResult(dmHistoryDocType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmHistoryDocTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryDocTypeImpl.class, id, _nullDmHistoryDocType);
				}

				closeSession(session);
			}
		}

		return dmHistoryDocType;
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException} if it could not be found.
	 *
	 * @param documentType the document type
	 * @return the matching dm history doc type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType findByDocumentType(String documentType)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = fetchByDocumentType(documentType);

		if (dmHistoryDocType == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentType=");
			msg.append(documentType);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryDocTypeException(msg.toString());
		}

		return dmHistoryDocType;
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentType the document type
	 * @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType fetchByDocumentType(String documentType)
		throws SystemException {
		return fetchByDocumentType(documentType, true);
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentType the document type
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType fetchByDocumentType(String documentType,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { documentType };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMHISTORYDOCTYPE_WHERE);

			if (documentType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_1);
			}
			else {
				if (documentType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_2);
				}
			}

			query.append(DmHistoryDocTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentType != null) {
					qPos.add(documentType);
				}

				List<DmHistoryDocType> list = q.list();

				result = list;

				DmHistoryDocType dmHistoryDocType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
						finderArgs, list);
				}
				else {
					dmHistoryDocType = list.get(0);

					cacheResult(dmHistoryDocType);

					if ((dmHistoryDocType.getDocumentType() == null) ||
							!dmHistoryDocType.getDocumentType()
												 .equals(documentType)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
							finderArgs, dmHistoryDocType);
					}
				}

				return dmHistoryDocType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPE,
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
				return (DmHistoryDocType)result;
			}
		}
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException} if it could not be found.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @return the matching dm history doc type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType findByDocumentTypeAndSyncVersion(
		String documentType, String syncVersion)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = fetchByDocumentTypeAndSyncVersion(documentType,
				syncVersion);

		if (dmHistoryDocType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentType=");
			msg.append(documentType);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryDocTypeException(msg.toString());
		}

		return dmHistoryDocType;
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		String documentType, String syncVersion) throws SystemException {
		return fetchByDocumentTypeAndSyncVersion(documentType, syncVersion, true);
	}

	/**
	 * Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		String documentType, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { documentType, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYDOCTYPE_WHERE);

			if (documentType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_1);
			}
			else {
				if (documentType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			query.append(DmHistoryDocTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentType != null) {
					qPos.add(documentType);
				}

				if (syncVersion != null) {
					qPos.add(syncVersion);
				}

				List<DmHistoryDocType> list = q.list();

				result = list;

				DmHistoryDocType dmHistoryDocType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					dmHistoryDocType = list.get(0);

					cacheResult(dmHistoryDocType);

					if ((dmHistoryDocType.getDocumentType() == null) ||
							!dmHistoryDocType.getDocumentType()
												 .equals(documentType) ||
							(dmHistoryDocType.getSyncVersion() == null) ||
							!dmHistoryDocType.getSyncVersion()
												 .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
							finderArgs, dmHistoryDocType);
					}
				}

				return dmHistoryDocType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTTYPEANDSYNCVERSION,
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
				return (DmHistoryDocType)result;
			}
		}
	}

	/**
	 * Returns all the dm history doc types.
	 *
	 * @return the dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryDocType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history doc types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history doc types
	 * @param end the upper bound of the range of dm history doc types (not inclusive)
	 * @return the range of dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryDocType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history doc types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history doc types
	 * @param end the upper bound of the range of dm history doc types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmHistoryDocType> findAll(int start, int end,
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

		List<DmHistoryDocType> list = (List<DmHistoryDocType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYDOCTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYDOCTYPE.concat(DmHistoryDocTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmHistoryDocType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmHistoryDocType>)QueryUtil.list(q,
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
	 * Removes the dm history doc type where documentType = &#63; from the database.
	 *
	 * @param documentType the document type
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentType(String documentType)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = findByDocumentType(documentType);

		dmHistoryDocTypePersistence.remove(dmHistoryDocType);
	}

	/**
	 * Removes the dm history doc type where documentType = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentTypeAndSyncVersion(String documentType,
		String syncVersion)
		throws NoSuchDmHistoryDocTypeException, SystemException {
		DmHistoryDocType dmHistoryDocType = findByDocumentTypeAndSyncVersion(documentType,
				syncVersion);

		dmHistoryDocTypePersistence.remove(dmHistoryDocType);
	}

	/**
	 * Removes all the dm history doc types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmHistoryDocType dmHistoryDocType : findAll()) {
			dmHistoryDocTypePersistence.remove(dmHistoryDocType);
		}
	}

	/**
	 * Returns the number of dm history doc types where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the number of matching dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentType(String documentType)
		throws SystemException {
		Object[] finderArgs = new Object[] { documentType };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYDOCTYPE_WHERE);

			if (documentType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_1);
			}
			else {
				if (documentType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentType != null) {
					qPos.add(documentType);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history doc types where documentType = &#63; and syncVersion = &#63;.
	 *
	 * @param documentType the document type
	 * @param syncVersion the sync version
	 * @return the number of matching dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentTypeAndSyncVersion(String documentType,
		String syncVersion) throws SystemException {
		Object[] finderArgs = new Object[] { documentType, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYDOCTYPE_WHERE);

			if (documentType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_1);
			}
			else {
				if (documentType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_2);
				}
			}

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_1);
			}
			else {
				if (syncVersion.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentType != null) {
					qPos.add(documentType);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPEANDSYNCVERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm history doc types.
	 *
	 * @return the number of dm history doc types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYDOCTYPE);

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
	 * Initializes the dm history doc type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmHistoryDocType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryDocType>> listenersList = new ArrayList<ModelListener<DmHistoryDocType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryDocType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryDocTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_DMHISTORYDOCTYPE = "SELECT dmHistoryDocType FROM DmHistoryDocType dmHistoryDocType";
	private static final String _SQL_SELECT_DMHISTORYDOCTYPE_WHERE = "SELECT dmHistoryDocType FROM DmHistoryDocType dmHistoryDocType WHERE ";
	private static final String _SQL_COUNT_DMHISTORYDOCTYPE = "SELECT COUNT(dmHistoryDocType) FROM DmHistoryDocType dmHistoryDocType";
	private static final String _SQL_COUNT_DMHISTORYDOCTYPE_WHERE = "SELECT COUNT(dmHistoryDocType) FROM DmHistoryDocType dmHistoryDocType WHERE ";
	private static final String _FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_1 = "dmHistoryDocType.documentType IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_2 = "dmHistoryDocType.documentType = ?";
	private static final String _FINDER_COLUMN_DOCUMENTTYPE_DOCUMENTTYPE_3 = "(dmHistoryDocType.documentType IS NULL OR dmHistoryDocType.documentType = ?)";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_1 =
		"dmHistoryDocType.documentType IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_2 =
		"dmHistoryDocType.documentType = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_DOCUMENTTYPE_3 =
		"(dmHistoryDocType.documentType IS NULL OR dmHistoryDocType.documentType = ?) AND ";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryDocType.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryDocType.syncVersion = ?";
	private static final String _FINDER_COLUMN_DOCUMENTTYPEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryDocType.syncVersion IS NULL OR dmHistoryDocType.syncVersion = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryDocType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryDocType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryDocType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryDocTypePersistenceImpl.class);
	private static DmHistoryDocType _nullDmHistoryDocType = new DmHistoryDocTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryDocType> toCacheModel() {
				return _nullDmHistoryDocTypeCacheModel;
			}
		};

	private static CacheModel<DmHistoryDocType> _nullDmHistoryDocTypeCacheModel = new CacheModel<DmHistoryDocType>() {
			public DmHistoryDocType toEntityModel() {
				return _nullDmHistoryDocType;
			}
		};
}