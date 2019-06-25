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

import vn.gt.dao.danhmuc.NoSuchDmDocTypeException;
import vn.gt.dao.danhmuc.model.DmDocType;
import vn.gt.dao.danhmuc.model.impl.DmDocTypeImpl;
import vn.gt.dao.danhmuc.model.impl.DmDocTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm doc type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDocTypePersistence
 * @see DmDocTypeUtil
 * @generated
 */
public class DmDocTypePersistenceImpl extends BasePersistenceImpl<DmDocType>
	implements DmDocTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmDocTypeUtil} to access the dm doc type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmDocTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTTYPECODE =
		new FinderPath(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeModelImpl.FINDER_CACHE_ENABLED, DmDocTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDocumentTypeCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE =
		new FinderPath(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeModelImpl.FINDER_CACHE_ENABLED, DmDocTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentTypeCode", new String[] { String.class.getName() },
			DmDocTypeModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE = new FinderPath(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentTypeCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeModelImpl.FINDER_CACHE_ENABLED, DmDocTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeModelImpl.FINDER_CACHE_ENABLED, DmDocTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm doc type in the entity cache if it is enabled.
	 *
	 * @param dmDocType the dm doc type
	 */
	public void cacheResult(DmDocType dmDocType) {
		EntityCacheUtil.putResult(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeImpl.class, dmDocType.getPrimaryKey(), dmDocType);

		dmDocType.resetOriginalValues();
	}

	/**
	 * Caches the dm doc types in the entity cache if it is enabled.
	 *
	 * @param dmDocTypes the dm doc types
	 */
	public void cacheResult(List<DmDocType> dmDocTypes) {
		for (DmDocType dmDocType : dmDocTypes) {
			if (EntityCacheUtil.getResult(
						DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmDocTypeImpl.class, dmDocType.getPrimaryKey()) == null) {
				cacheResult(dmDocType);
			}
			else {
				dmDocType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm doc types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmDocTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmDocTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm doc type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmDocType dmDocType) {
		EntityCacheUtil.removeResult(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeImpl.class, dmDocType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmDocType> dmDocTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmDocType dmDocType : dmDocTypes) {
			EntityCacheUtil.removeResult(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmDocTypeImpl.class, dmDocType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm doc type with the primary key. Does not add the dm doc type to the database.
	 *
	 * @param id the primary key for the new dm doc type
	 * @return the new dm doc type
	 */
	public DmDocType create(int id) {
		DmDocType dmDocType = new DmDocTypeImpl();

		dmDocType.setNew(true);
		dmDocType.setPrimaryKey(id);

		return dmDocType;
	}

	/**
	 * Removes the dm doc type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm doc type
	 * @return the dm doc type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDocType remove(int id)
		throws NoSuchDmDocTypeException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the dm doc type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm doc type
	 * @return the dm doc type that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDocType remove(Serializable primaryKey)
		throws NoSuchDmDocTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmDocType dmDocType = (DmDocType)session.get(DmDocTypeImpl.class,
					primaryKey);

			if (dmDocType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmDocTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmDocType);
		}
		catch (NoSuchDmDocTypeException nsee) {
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
	protected DmDocType removeImpl(DmDocType dmDocType)
		throws SystemException {
		dmDocType = toUnwrappedModel(dmDocType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmDocType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmDocType);

		return dmDocType;
	}

	@Override
	public DmDocType updateImpl(vn.gt.dao.danhmuc.model.DmDocType dmDocType,
		boolean merge) throws SystemException {
		dmDocType = toUnwrappedModel(dmDocType);

		boolean isNew = dmDocType.isNew();

		DmDocTypeModelImpl dmDocTypeModelImpl = (DmDocTypeModelImpl)dmDocType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmDocType, merge);

			dmDocType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmDocTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmDocTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDocTypeModelImpl.getOriginalDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE,
					args);

				args = new Object[] { dmDocTypeModelImpl.getDocumentTypeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmDocTypeImpl.class, dmDocType.getPrimaryKey(), dmDocType);

		return dmDocType;
	}

	protected DmDocType toUnwrappedModel(DmDocType dmDocType) {
		if (dmDocType instanceof DmDocTypeImpl) {
			return dmDocType;
		}

		DmDocTypeImpl dmDocTypeImpl = new DmDocTypeImpl();

		dmDocTypeImpl.setNew(dmDocType.isNew());
		dmDocTypeImpl.setPrimaryKey(dmDocType.getPrimaryKey());

		dmDocTypeImpl.setId(dmDocType.getId());
		dmDocTypeImpl.setDocumentTypeCode(dmDocType.getDocumentTypeCode());
		dmDocTypeImpl.setDocumentType(dmDocType.getDocumentType());
		dmDocTypeImpl.setDocumentTypeName(dmDocType.getDocumentTypeName());
		dmDocTypeImpl.setIsDelete(dmDocType.getIsDelete());
		dmDocTypeImpl.setMarkedAsDelete(dmDocType.getMarkedAsDelete());
		dmDocTypeImpl.setModifiedDate(dmDocType.getModifiedDate());
		dmDocTypeImpl.setRequestedDate(dmDocType.getRequestedDate());
		dmDocTypeImpl.setSyncVersion(dmDocType.getSyncVersion());

		return dmDocTypeImpl;
	}

	/**
	 * Returns the dm doc type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm doc type
	 * @return the dm doc type
	 * @throws com.liferay.portal.NoSuchModelException if a dm doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDocType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm doc type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDocTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm doc type
	 * @return the dm doc type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDocType findByPrimaryKey(int id)
		throws NoSuchDmDocTypeException, SystemException {
		DmDocType dmDocType = fetchByPrimaryKey(id);

		if (dmDocType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmDocTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmDocType;
	}

	/**
	 * Returns the dm doc type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm doc type
	 * @return the dm doc type, or <code>null</code> if a dm doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDocType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm doc type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm doc type
	 * @return the dm doc type, or <code>null</code> if a dm doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDocType fetchByPrimaryKey(int id) throws SystemException {
		DmDocType dmDocType = (DmDocType)EntityCacheUtil.getResult(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmDocTypeImpl.class, id);

		if (dmDocType == _nullDmDocType) {
			return null;
		}

		if (dmDocType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmDocType = (DmDocType)session.get(DmDocTypeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmDocType != null) {
					cacheResult(dmDocType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmDocTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmDocTypeImpl.class, id, _nullDmDocType);
				}

				closeSession(session);
			}
		}

		return dmDocType;
	}

	/**
	 * Returns all the dm doc types where documentTypeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @return the matching dm doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDocType> findByDocumentTypeCode(String documentTypeCode)
		throws SystemException {
		return findByDocumentTypeCode(documentTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm doc types where documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of dm doc types
	 * @param end the upper bound of the range of dm doc types (not inclusive)
	 * @return the range of matching dm doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDocType> findByDocumentTypeCode(String documentTypeCode,
		int start, int end) throws SystemException {
		return findByDocumentTypeCode(documentTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm doc types where documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of dm doc types
	 * @param end the upper bound of the range of dm doc types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDocType> findByDocumentTypeCode(String documentTypeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE;
			finderArgs = new Object[] { documentTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTTYPECODE;
			finderArgs = new Object[] {
					documentTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<DmDocType> list = (List<DmDocType>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMDOCTYPE_WHERE);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmDocTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				list = (List<DmDocType>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first dm doc type in the ordered set where documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm doc type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a matching dm doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDocType findByDocumentTypeCode_First(String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmDocTypeException, SystemException {
		List<DmDocType> list = findByDocumentTypeCode(documentTypeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDocTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm doc type in the ordered set where documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm doc type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a matching dm doc type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDocType findByDocumentTypeCode_Last(String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmDocTypeException, SystemException {
		int count = countByDocumentTypeCode(documentTypeCode);

		List<DmDocType> list = findByDocumentTypeCode(documentTypeCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDocTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm doc types before and after the current dm doc type in the ordered set where documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm doc type
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm doc type
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDocType[] findByDocumentTypeCode_PrevAndNext(int id,
		String documentTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmDocTypeException, SystemException {
		DmDocType dmDocType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmDocType[] array = new DmDocTypeImpl[3];

			array[0] = getByDocumentTypeCode_PrevAndNext(session, dmDocType,
					documentTypeCode, orderByComparator, true);

			array[1] = dmDocType;

			array[2] = getByDocumentTypeCode_PrevAndNext(session, dmDocType,
					documentTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDocType getByDocumentTypeCode_PrevAndNext(Session session,
		DmDocType dmDocType, String documentTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDOCTYPE_WHERE);

		if (documentTypeCode == null) {
			query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
		}
		else {
			if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
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
			query.append(DmDocTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (documentTypeCode != null) {
			qPos.add(documentTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDocType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDocType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm doc types.
	 *
	 * @return the dm doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDocType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm doc types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm doc types
	 * @param end the upper bound of the range of dm doc types (not inclusive)
	 * @return the range of dm doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDocType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm doc types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm doc types
	 * @param end the upper bound of the range of dm doc types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm doc types
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDocType> findAll(int start, int end,
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

		List<DmDocType> list = (List<DmDocType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMDOCTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMDOCTYPE.concat(DmDocTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmDocType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmDocType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm doc types where documentTypeCode = &#63; from the database.
	 *
	 * @param documentTypeCode the document type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentTypeCode(String documentTypeCode)
		throws SystemException {
		for (DmDocType dmDocType : findByDocumentTypeCode(documentTypeCode)) {
			remove(dmDocType);
		}
	}

	/**
	 * Removes all the dm doc types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmDocType dmDocType : findAll()) {
			remove(dmDocType);
		}
	}

	/**
	 * Returns the number of dm doc types where documentTypeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @return the number of matching dm doc types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentTypeCode(String documentTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { documentTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMDOCTYPE_WHERE);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm doc types.
	 *
	 * @return the number of dm doc types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMDOCTYPE);

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
	 * Initializes the dm doc type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmDocType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmDocType>> listenersList = new ArrayList<ModelListener<DmDocType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmDocType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmDocTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_DMDOCTYPE = "SELECT dmDocType FROM DmDocType dmDocType";
	private static final String _SQL_SELECT_DMDOCTYPE_WHERE = "SELECT dmDocType FROM DmDocType dmDocType WHERE ";
	private static final String _SQL_COUNT_DMDOCTYPE = "SELECT COUNT(dmDocType) FROM DmDocType dmDocType";
	private static final String _SQL_COUNT_DMDOCTYPE_WHERE = "SELECT COUNT(dmDocType) FROM DmDocType dmDocType WHERE ";
	private static final String _FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_1 =
		"dmDocType.documentTypeCode IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_2 =
		"dmDocType.documentTypeCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_3 =
		"(dmDocType.documentTypeCode IS NULL OR dmDocType.documentTypeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmDocType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmDocType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmDocType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmDocTypePersistenceImpl.class);
	private static DmDocType _nullDmDocType = new DmDocTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmDocType> toCacheModel() {
				return _nullDmDocTypeCacheModel;
			}
		};

	private static CacheModel<DmDocType> _nullDmDocTypeCacheModel = new CacheModel<DmDocType>() {
			public DmDocType toEntityModel() {
				return _nullDmDocType;
			}
		};
}