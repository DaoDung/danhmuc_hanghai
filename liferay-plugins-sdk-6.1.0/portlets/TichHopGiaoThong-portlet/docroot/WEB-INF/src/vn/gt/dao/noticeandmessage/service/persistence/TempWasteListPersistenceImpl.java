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

import vn.gt.dao.noticeandmessage.NoSuchTempWasteListException;
import vn.gt.dao.noticeandmessage.model.TempWasteList;
import vn.gt.dao.noticeandmessage.model.impl.TempWasteListImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempWasteListModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp waste list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempWasteListPersistence
 * @see TempWasteListUtil
 * @generated
 */
public class TempWasteListPersistenceImpl extends BasePersistenceImpl<TempWasteList>
	implements TempWasteListPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempWasteListUtil} to access the temp waste list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempWasteListImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempWasteListModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempWasteListModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE =
		new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearAndRequestCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE =
		new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearAndRequestCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			TempWasteListModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempWasteListModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempWasteListModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE =
		new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearAndRequestCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRequestCode", new String[] { String.class.getName() },
			TempWasteListModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE = new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode_TypeCode",
			new String[] { String.class.getName(), String.class.getName() },
			TempWasteListModelImpl.REQUESTCODE_COLUMN_BITMASK |
			TempWasteListModelImpl.TYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE_TYPECODE = new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode_TypeCode",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED,
			TempWasteListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp waste list in the entity cache if it is enabled.
	 *
	 * @param tempWasteList the temp waste list
	 */
	public void cacheResult(TempWasteList tempWasteList) {
		EntityCacheUtil.putResult(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListImpl.class, tempWasteList.getPrimaryKey(),
			tempWasteList);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
			new Object[] {
				tempWasteList.getRequestCode(),
				
			tempWasteList.getTypeCode()
			}, tempWasteList);

		tempWasteList.resetOriginalValues();
	}

	/**
	 * Caches the temp waste lists in the entity cache if it is enabled.
	 *
	 * @param tempWasteLists the temp waste lists
	 */
	public void cacheResult(List<TempWasteList> tempWasteLists) {
		for (TempWasteList tempWasteList : tempWasteLists) {
			if (EntityCacheUtil.getResult(
						TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
						TempWasteListImpl.class, tempWasteList.getPrimaryKey()) == null) {
				cacheResult(tempWasteList);
			}
			else {
				tempWasteList.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp waste lists.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempWasteListImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempWasteListImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp waste list.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempWasteList tempWasteList) {
		EntityCacheUtil.removeResult(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListImpl.class, tempWasteList.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tempWasteList);
	}

	@Override
	public void clearCache(List<TempWasteList> tempWasteLists) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempWasteList tempWasteList : tempWasteLists) {
			EntityCacheUtil.removeResult(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
				TempWasteListImpl.class, tempWasteList.getPrimaryKey());

			clearUniqueFindersCache(tempWasteList);
		}
	}

	protected void clearUniqueFindersCache(TempWasteList tempWasteList) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
			new Object[] {
				tempWasteList.getRequestCode(),
				
			tempWasteList.getTypeCode()
			});
	}

	/**
	 * Creates a new temp waste list with the primary key. Does not add the temp waste list to the database.
	 *
	 * @param id the primary key for the new temp waste list
	 * @return the new temp waste list
	 */
	public TempWasteList create(long id) {
		TempWasteList tempWasteList = new TempWasteListImpl();

		tempWasteList.setNew(true);
		tempWasteList.setPrimaryKey(id);

		return tempWasteList;
	}

	/**
	 * Removes the temp waste list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp waste list
	 * @return the temp waste list that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList remove(long id)
		throws NoSuchTempWasteListException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp waste list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp waste list
	 * @return the temp waste list that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempWasteList remove(Serializable primaryKey)
		throws NoSuchTempWasteListException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempWasteList tempWasteList = (TempWasteList)session.get(TempWasteListImpl.class,
					primaryKey);

			if (tempWasteList == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempWasteListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempWasteList);
		}
		catch (NoSuchTempWasteListException nsee) {
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
	protected TempWasteList removeImpl(TempWasteList tempWasteList)
		throws SystemException {
		tempWasteList = toUnwrappedModel(tempWasteList);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempWasteList);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempWasteList);

		return tempWasteList;
	}

	@Override
	public TempWasteList updateImpl(
		vn.gt.dao.noticeandmessage.model.TempWasteList tempWasteList,
		boolean merge) throws SystemException {
		tempWasteList = toUnwrappedModel(tempWasteList);

		boolean isNew = tempWasteList.isNew();

		TempWasteListModelImpl tempWasteListModelImpl = (TempWasteListModelImpl)tempWasteList;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempWasteList, merge);

			tempWasteList.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempWasteListModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempWasteListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempWasteListModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempWasteListModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(tempWasteListModelImpl.getDocumentName()),
						Integer.valueOf(tempWasteListModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempWasteListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempWasteListModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempWasteListModelImpl.getOriginalDocumentYear()),
						
						tempWasteListModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE,
					args);

				args = new Object[] {
						Long.valueOf(tempWasteListModelImpl.getDocumentName()),
						Integer.valueOf(tempWasteListModelImpl.getDocumentYear()),
						
						tempWasteListModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE,
					args);
			}

			if ((tempWasteListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempWasteListModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempWasteListModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
			TempWasteListImpl.class, tempWasteList.getPrimaryKey(),
			tempWasteList);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
				new Object[] {
					tempWasteList.getRequestCode(),
					
				tempWasteList.getTypeCode()
				}, tempWasteList);
		}
		else {
			if ((tempWasteListModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempWasteListModelImpl.getOriginalRequestCode(),
						
						tempWasteListModelImpl.getOriginalTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE_TYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
					new Object[] {
						tempWasteList.getRequestCode(),
						
					tempWasteList.getTypeCode()
					}, tempWasteList);
			}
		}

		return tempWasteList;
	}

	protected TempWasteList toUnwrappedModel(TempWasteList tempWasteList) {
		if (tempWasteList instanceof TempWasteListImpl) {
			return tempWasteList;
		}

		TempWasteListImpl tempWasteListImpl = new TempWasteListImpl();

		tempWasteListImpl.setNew(tempWasteList.isNew());
		tempWasteListImpl.setPrimaryKey(tempWasteList.getPrimaryKey());

		tempWasteListImpl.setId(tempWasteList.getId());
		tempWasteListImpl.setRequestCode(tempWasteList.getRequestCode());
		tempWasteListImpl.setDocumentName(tempWasteList.getDocumentName());
		tempWasteListImpl.setDocumentYear(tempWasteList.getDocumentYear());
		tempWasteListImpl.setTypeCode(tempWasteList.getTypeCode());
		tempWasteListImpl.setTypeName(tempWasteList.getTypeName());
		tempWasteListImpl.setWeight(tempWasteList.getWeight());
		tempWasteListImpl.setUnit(tempWasteList.getUnit());

		return tempWasteListImpl;
	}

	/**
	 * Returns the temp waste list with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp waste list
	 * @return the temp waste list
	 * @throws com.liferay.portal.NoSuchModelException if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempWasteList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp waste list with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempWasteListException} if it could not be found.
	 *
	 * @param id the primary key of the temp waste list
	 * @return the temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList findByPrimaryKey(long id)
		throws NoSuchTempWasteListException, SystemException {
		TempWasteList tempWasteList = fetchByPrimaryKey(id);

		if (tempWasteList == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempWasteListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempWasteList;
	}

	/**
	 * Returns the temp waste list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp waste list
	 * @return the temp waste list, or <code>null</code> if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempWasteList fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp waste list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp waste list
	 * @return the temp waste list, or <code>null</code> if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList fetchByPrimaryKey(long id) throws SystemException {
		TempWasteList tempWasteList = (TempWasteList)EntityCacheUtil.getResult(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
				TempWasteListImpl.class, id);

		if (tempWasteList == _nullTempWasteList) {
			return null;
		}

		if (tempWasteList == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempWasteList = (TempWasteList)session.get(TempWasteListImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempWasteList != null) {
					cacheResult(tempWasteList);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempWasteListModelImpl.ENTITY_CACHE_ENABLED,
						TempWasteListImpl.class, id, _nullTempWasteList);
				}

				closeSession(session);
			}
		}

		return tempWasteList;
	}

	/**
	 * Returns all the temp waste lists where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp waste lists where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp waste lists
	 * @param end the upper bound of the range of temp waste lists (not inclusive)
	 * @return the range of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp waste lists where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp waste lists
	 * @param end the upper bound of the range of temp waste lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findBydocumentNameAnddocumentYear(
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

		List<TempWasteList> list = (List<TempWasteList>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPWASTELIST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempWasteListModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<TempWasteList>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp waste list in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		List<TempWasteList> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempWasteListException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp waste list in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		List<TempWasteList> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempWasteListException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp waste lists before and after the current temp waste list in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp waste list
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		TempWasteList tempWasteList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempWasteList[] array = new TempWasteListImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempWasteList, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempWasteList;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempWasteList, documentName, documentYear,
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

	protected TempWasteList getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempWasteList tempWasteList, long documentName,
		int documentYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPWASTELIST_WHERE);

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
			query.append(TempWasteListModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempWasteList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempWasteList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp waste lists where documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @return the matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findBydocumentNameAnddocumentYearAndRequestCode(
		long documentName, int documentYear, String requestCode)
		throws SystemException {
		return findBydocumentNameAnddocumentYearAndRequestCode(documentName,
			documentYear, requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp waste lists where documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp waste lists
	 * @param end the upper bound of the range of temp waste lists (not inclusive)
	 * @return the range of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findBydocumentNameAnddocumentYearAndRequestCode(
		long documentName, int documentYear, String requestCode, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearAndRequestCode(documentName,
			documentYear, requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp waste lists where documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp waste lists
	 * @param end the upper bound of the range of temp waste lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findBydocumentNameAnddocumentYearAndRequestCode(
		long documentName, int documentYear, String requestCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE;
			finderArgs = new Object[] { documentName, documentYear, requestCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE;
			finderArgs = new Object[] {
					documentName, documentYear, requestCode,
					
					start, end, orderByComparator
				};
		}

		List<TempWasteList> list = (List<TempWasteList>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPWASTELIST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_DOCUMENTYEAR_2);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempWasteListModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				list = (List<TempWasteList>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp waste list in the ordered set where documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList findBydocumentNameAnddocumentYearAndRequestCode_First(
		long documentName, int documentYear, String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		List<TempWasteList> list = findBydocumentNameAnddocumentYearAndRequestCode(documentName,
				documentYear, requestCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempWasteListException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp waste list in the ordered set where documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList findBydocumentNameAnddocumentYearAndRequestCode_Last(
		long documentName, int documentYear, String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		int count = countBydocumentNameAnddocumentYearAndRequestCode(documentName,
				documentYear, requestCode);

		List<TempWasteList> list = findBydocumentNameAnddocumentYearAndRequestCode(documentName,
				documentYear, requestCode, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempWasteListException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp waste lists before and after the current temp waste list in the ordered set where documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp waste list
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList[] findBydocumentNameAnddocumentYearAndRequestCode_PrevAndNext(
		long id, long documentName, int documentYear, String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		TempWasteList tempWasteList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempWasteList[] array = new TempWasteListImpl[3];

			array[0] = getBydocumentNameAnddocumentYearAndRequestCode_PrevAndNext(session,
					tempWasteList, documentName, documentYear, requestCode,
					orderByComparator, true);

			array[1] = tempWasteList;

			array[2] = getBydocumentNameAnddocumentYearAndRequestCode_PrevAndNext(session,
					tempWasteList, documentName, documentYear, requestCode,
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

	protected TempWasteList getBydocumentNameAnddocumentYearAndRequestCode_PrevAndNext(
		Session session, TempWasteList tempWasteList, long documentName,
		int documentYear, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPWASTELIST_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_DOCUMENTYEAR_2);

		if (requestCode == null) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_1);
		}
		else {
			if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_2);
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
			query.append(TempWasteListModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (requestCode != null) {
			qPos.add(requestCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempWasteList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempWasteList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp waste lists where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp waste lists where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp waste lists
	 * @param end the upper bound of the range of temp waste lists (not inclusive)
	 * @return the range of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findByRequestCode(String requestCode, int start,
		int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp waste lists where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp waste lists
	 * @param end the upper bound of the range of temp waste lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findByRequestCode(String requestCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<TempWasteList> list = (List<TempWasteList>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPWASTELIST_WHERE);

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
				query.append(TempWasteListModelImpl.ORDER_BY_JPQL);
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

				list = (List<TempWasteList>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp waste list in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		List<TempWasteList> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempWasteListException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp waste list in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		int count = countByRequestCode(requestCode);

		List<TempWasteList> list = findByRequestCode(requestCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempWasteListException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp waste lists before and after the current temp waste list in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp waste list
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a temp waste list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempWasteListException, SystemException {
		TempWasteList tempWasteList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempWasteList[] array = new TempWasteListImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session, tempWasteList,
					requestCode, orderByComparator, true);

			array[1] = tempWasteList;

			array[2] = getByRequestCode_PrevAndNext(session, tempWasteList,
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

	protected TempWasteList getByRequestCode_PrevAndNext(Session session,
		TempWasteList tempWasteList, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPWASTELIST_WHERE);

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
			query.append(TempWasteListModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempWasteList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempWasteList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the temp waste list where requestCode = &#63; and typeCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempWasteListException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @param typeCode the type code
	 * @return the matching temp waste list
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempWasteListException if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList findByRequestCode_TypeCode(String requestCode,
		String typeCode) throws NoSuchTempWasteListException, SystemException {
		TempWasteList tempWasteList = fetchByRequestCode_TypeCode(requestCode,
				typeCode);

		if (tempWasteList == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(", typeCode=");
			msg.append(typeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTempWasteListException(msg.toString());
		}

		return tempWasteList;
	}

	/**
	 * Returns the temp waste list where requestCode = &#63; and typeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @param typeCode the type code
	 * @return the matching temp waste list, or <code>null</code> if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList fetchByRequestCode_TypeCode(String requestCode,
		String typeCode) throws SystemException {
		return fetchByRequestCode_TypeCode(requestCode, typeCode, true);
	}

	/**
	 * Returns the temp waste list where requestCode = &#63; and typeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param typeCode the type code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching temp waste list, or <code>null</code> if a matching temp waste list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempWasteList fetchByRequestCode_TypeCode(String requestCode,
		String typeCode, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode, typeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TEMPWASTELIST_WHERE);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_2);
				}
			}

			if (typeCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_1);
			}
			else {
				if (typeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_2);
				}
			}

			query.append(TempWasteListModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				if (typeCode != null) {
					qPos.add(typeCode);
				}

				List<TempWasteList> list = q.list();

				result = list;

				TempWasteList tempWasteList = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
						finderArgs, list);
				}
				else {
					tempWasteList = list.get(0);

					cacheResult(tempWasteList);

					if ((tempWasteList.getRequestCode() == null) ||
							!tempWasteList.getRequestCode().equals(requestCode) ||
							(tempWasteList.getTypeCode() == null) ||
							!tempWasteList.getTypeCode().equals(typeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
							finderArgs, tempWasteList);
					}
				}

				return tempWasteList;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE_TYPECODE,
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
				return (TempWasteList)result;
			}
		}
	}

	/**
	 * Returns all the temp waste lists.
	 *
	 * @return the temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp waste lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp waste lists
	 * @param end the upper bound of the range of temp waste lists (not inclusive)
	 * @return the range of temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp waste lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp waste lists
	 * @param end the upper bound of the range of temp waste lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempWasteList> findAll(int start, int end,
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

		List<TempWasteList> list = (List<TempWasteList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPWASTELIST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPWASTELIST.concat(TempWasteListModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempWasteList>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempWasteList>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the temp waste lists where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempWasteList tempWasteList : findBydocumentNameAnddocumentYear(
				documentName, documentYear)) {
			remove(tempWasteList);
		}
	}

	/**
	 * Removes all the temp waste lists where documentName = &#63; and documentYear = &#63; and requestCode = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBydocumentNameAnddocumentYearAndRequestCode(
		long documentName, int documentYear, String requestCode)
		throws SystemException {
		for (TempWasteList tempWasteList : findBydocumentNameAnddocumentYearAndRequestCode(
				documentName, documentYear, requestCode)) {
			remove(tempWasteList);
		}
	}

	/**
	 * Removes all the temp waste lists where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempWasteList tempWasteList : findByRequestCode(requestCode)) {
			remove(tempWasteList);
		}
	}

	/**
	 * Removes the temp waste list where requestCode = &#63; and typeCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @param typeCode the type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode_TypeCode(String requestCode, String typeCode)
		throws NoSuchTempWasteListException, SystemException {
		TempWasteList tempWasteList = findByRequestCode_TypeCode(requestCode,
				typeCode);

		remove(tempWasteList);
	}

	/**
	 * Removes all the temp waste lists from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempWasteList tempWasteList : findAll()) {
			remove(tempWasteList);
		}
	}

	/**
	 * Returns the number of temp waste lists where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPWASTELIST_WHERE);

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
	 * Returns the number of temp waste lists where documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @return the number of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countBydocumentNameAnddocumentYearAndRequestCode(
		long documentName, int documentYear, String requestCode)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPWASTELIST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_DOCUMENTYEAR_2);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp waste lists where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPWASTELIST_WHERE);

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
	 * Returns the number of temp waste lists where requestCode = &#63; and typeCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param typeCode the type code
	 * @return the number of matching temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode_TypeCode(String requestCode, String typeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { requestCode, typeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE_TYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPWASTELIST_WHERE);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_2);
				}
			}

			if (typeCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_1);
			}
			else {
				if (typeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_2);
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

				if (typeCode != null) {
					qPos.add(typeCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE_TYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp waste lists.
	 *
	 * @return the number of temp waste lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPWASTELIST);

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
	 * Initializes the temp waste list persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempWasteList")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempWasteList>> listenersList = new ArrayList<ModelListener<TempWasteList>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempWasteList>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempWasteListImpl.class.getName());
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
	private static final String _SQL_SELECT_TEMPWASTELIST = "SELECT tempWasteList FROM TempWasteList tempWasteList";
	private static final String _SQL_SELECT_TEMPWASTELIST_WHERE = "SELECT tempWasteList FROM TempWasteList tempWasteList WHERE ";
	private static final String _SQL_COUNT_TEMPWASTELIST = "SELECT COUNT(tempWasteList) FROM TempWasteList tempWasteList";
	private static final String _SQL_COUNT_TEMPWASTELIST_WHERE = "SELECT COUNT(tempWasteList) FROM TempWasteList tempWasteList WHERE ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"tempWasteList.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempWasteList.documentYear = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_DOCUMENTNAME_2 =
		"tempWasteList.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_DOCUMENTYEAR_2 =
		"tempWasteList.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_1 =
		"tempWasteList.requestCode IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_2 =
		"tempWasteList.requestCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDREQUESTCODE_REQUESTCODE_3 =
		"(tempWasteList.requestCode IS NULL OR tempWasteList.requestCode = ?)";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempWasteList.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempWasteList.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempWasteList.requestCode IS NULL OR tempWasteList.requestCode = ?)";
	private static final String _FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_1 =
		"tempWasteList.requestCode IS NULL AND ";
	private static final String _FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_2 =
		"tempWasteList.requestCode = ? AND ";
	private static final String _FINDER_COLUMN_REQUESTCODE_TYPECODE_REQUESTCODE_3 =
		"(tempWasteList.requestCode IS NULL OR tempWasteList.requestCode = ?) AND ";
	private static final String _FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_1 = "tempWasteList.typeCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_2 = "tempWasteList.typeCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_TYPECODE_TYPECODE_3 = "(tempWasteList.typeCode IS NULL OR tempWasteList.typeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempWasteList.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempWasteList exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempWasteList exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempWasteListPersistenceImpl.class);
	private static TempWasteList _nullTempWasteList = new TempWasteListImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempWasteList> toCacheModel() {
				return _nullTempWasteListCacheModel;
			}
		};

	private static CacheModel<TempWasteList> _nullTempWasteListCacheModel = new CacheModel<TempWasteList>() {
			public TempWasteList toEntityModel() {
				return _nullTempWasteList;
			}
		};
}