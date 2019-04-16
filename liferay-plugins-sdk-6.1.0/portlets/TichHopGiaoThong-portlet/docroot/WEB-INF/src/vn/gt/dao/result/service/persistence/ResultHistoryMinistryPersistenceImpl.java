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

import vn.gt.dao.result.NoSuchResultHistoryMinistryException;
import vn.gt.dao.result.model.ResultHistoryMinistry;
import vn.gt.dao.result.model.impl.ResultHistoryMinistryImpl;
import vn.gt.dao.result.model.impl.ResultHistoryMinistryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the result history ministry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultHistoryMinistryPersistence
 * @see ResultHistoryMinistryUtil
 * @generated
 */
public class ResultHistoryMinistryPersistenceImpl extends BasePersistenceImpl<ResultHistoryMinistry>
	implements ResultHistoryMinistryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultHistoryMinistryUtil} to access the result history ministry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultHistoryMinistryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			ResultHistoryMinistryModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			ResultHistoryMinistryModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultHistoryMinistryModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE =
		new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYearAndMinistryCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE =
		new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYearAndMinistryCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			ResultHistoryMinistryModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultHistoryMinistryModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			ResultHistoryMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE =
		new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYearAndMinistryCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MINISTRYCODE =
		new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMinistryCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE =
		new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMinistryCode",
			new String[] { String.class.getName() },
			ResultHistoryMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MINISTRYCODE = new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMinistryCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the result history ministry in the entity cache if it is enabled.
	 *
	 * @param resultHistoryMinistry the result history ministry
	 */
	public void cacheResult(ResultHistoryMinistry resultHistoryMinistry) {
		EntityCacheUtil.putResult(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			resultHistoryMinistry.getPrimaryKey(), resultHistoryMinistry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultHistoryMinistry.getRequestCode() },
			resultHistoryMinistry);

		resultHistoryMinistry.resetOriginalValues();
	}

	/**
	 * Caches the result history ministries in the entity cache if it is enabled.
	 *
	 * @param resultHistoryMinistries the result history ministries
	 */
	public void cacheResult(List<ResultHistoryMinistry> resultHistoryMinistries) {
		for (ResultHistoryMinistry resultHistoryMinistry : resultHistoryMinistries) {
			if (EntityCacheUtil.getResult(
						ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
						ResultHistoryMinistryImpl.class,
						resultHistoryMinistry.getPrimaryKey()) == null) {
				cacheResult(resultHistoryMinistry);
			}
			else {
				resultHistoryMinistry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all result history ministries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ResultHistoryMinistryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ResultHistoryMinistryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the result history ministry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResultHistoryMinistry resultHistoryMinistry) {
		EntityCacheUtil.removeResult(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			resultHistoryMinistry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultHistoryMinistry.getRequestCode() });
	}

	/**
	 * Creates a new result history ministry with the primary key. Does not add the result history ministry to the database.
	 *
	 * @param id the primary key for the new result history ministry
	 * @return the new result history ministry
	 */
	public ResultHistoryMinistry create(long id) {
		ResultHistoryMinistry resultHistoryMinistry = new ResultHistoryMinistryImpl();

		resultHistoryMinistry.setNew(true);
		resultHistoryMinistry.setPrimaryKey(id);

		return resultHistoryMinistry;
	}

	/**
	 * Removes the result history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the result history ministry
	 * @return the result history ministry that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultHistoryMinistry remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the result history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the result history ministry
	 * @return the result history ministry that was removed
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry remove(long id)
		throws NoSuchResultHistoryMinistryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ResultHistoryMinistry resultHistoryMinistry = (ResultHistoryMinistry)session.get(ResultHistoryMinistryImpl.class,
					Long.valueOf(id));

			if (resultHistoryMinistry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchResultHistoryMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return resultHistoryMinistryPersistence.remove(resultHistoryMinistry);
		}
		catch (NoSuchResultHistoryMinistryException nsee) {
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
	 * Removes the result history ministry from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resultHistoryMinistry the result history ministry
	 * @return the result history ministry that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultHistoryMinistry remove(
		ResultHistoryMinistry resultHistoryMinistry) throws SystemException {
		return super.remove(resultHistoryMinistry);
	}

	@Override
	protected ResultHistoryMinistry removeImpl(
		ResultHistoryMinistry resultHistoryMinistry) throws SystemException {
		resultHistoryMinistry = toUnwrappedModel(resultHistoryMinistry);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, resultHistoryMinistry);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		ResultHistoryMinistryModelImpl resultHistoryMinistryModelImpl = (ResultHistoryMinistryModelImpl)resultHistoryMinistry;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultHistoryMinistryModelImpl.getRequestCode() });

		EntityCacheUtil.removeResult(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			resultHistoryMinistry.getPrimaryKey());

		return resultHistoryMinistry;
	}

	@Override
	public ResultHistoryMinistry updateImpl(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry,
		boolean merge) throws SystemException {
		resultHistoryMinistry = toUnwrappedModel(resultHistoryMinistry);

		boolean isNew = resultHistoryMinistry.isNew();

		ResultHistoryMinistryModelImpl resultHistoryMinistryModelImpl = (ResultHistoryMinistryModelImpl)resultHistoryMinistry;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, resultHistoryMinistry, merge);

			resultHistoryMinistry.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ResultHistoryMinistryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((resultHistoryMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(resultHistoryMinistryModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultHistoryMinistryModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(resultHistoryMinistryModelImpl.getDocumentName()),
						Integer.valueOf(resultHistoryMinistryModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((resultHistoryMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(resultHistoryMinistryModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultHistoryMinistryModelImpl.getOriginalDocumentYear()),
						
						resultHistoryMinistryModelImpl.getOriginalMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE,
					args);

				args = new Object[] {
						Long.valueOf(resultHistoryMinistryModelImpl.getDocumentName()),
						Integer.valueOf(resultHistoryMinistryModelImpl.getDocumentYear()),
						
						resultHistoryMinistryModelImpl.getMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE,
					args);
			}

			if ((resultHistoryMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultHistoryMinistryModelImpl.getOriginalMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE,
					args);

				args = new Object[] {
						resultHistoryMinistryModelImpl.getMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultHistoryMinistryImpl.class,
			resultHistoryMinistry.getPrimaryKey(), resultHistoryMinistry);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
				new Object[] { resultHistoryMinistry.getRequestCode() },
				resultHistoryMinistry);
		}
		else {
			if ((resultHistoryMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultHistoryMinistryModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					new Object[] { resultHistoryMinistry.getRequestCode() },
					resultHistoryMinistry);
			}
		}

		return resultHistoryMinistry;
	}

	protected ResultHistoryMinistry toUnwrappedModel(
		ResultHistoryMinistry resultHistoryMinistry) {
		if (resultHistoryMinistry instanceof ResultHistoryMinistryImpl) {
			return resultHistoryMinistry;
		}

		ResultHistoryMinistryImpl resultHistoryMinistryImpl = new ResultHistoryMinistryImpl();

		resultHistoryMinistryImpl.setNew(resultHistoryMinistry.isNew());
		resultHistoryMinistryImpl.setPrimaryKey(resultHistoryMinistry.getPrimaryKey());

		resultHistoryMinistryImpl.setId(resultHistoryMinistry.getId());
		resultHistoryMinistryImpl.setRequestCode(resultHistoryMinistry.getRequestCode());
		resultHistoryMinistryImpl.setRequestState(resultHistoryMinistry.getRequestState());
		resultHistoryMinistryImpl.setDocumentName(resultHistoryMinistry.getDocumentName());
		resultHistoryMinistryImpl.setDocumentYear(resultHistoryMinistry.getDocumentYear());
		resultHistoryMinistryImpl.setMinistryCode(resultHistoryMinistry.getMinistryCode());
		resultHistoryMinistryImpl.setOrganization(resultHistoryMinistry.getOrganization());
		resultHistoryMinistryImpl.setDivision(resultHistoryMinistry.getDivision());
		resultHistoryMinistryImpl.setOfficerName(resultHistoryMinistry.getOfficerName());
		resultHistoryMinistryImpl.setLatestDate(resultHistoryMinistry.getLatestDate());
		resultHistoryMinistryImpl.setBusinessTypeCode(resultHistoryMinistry.getBusinessTypeCode());
		resultHistoryMinistryImpl.setResponse(resultHistoryMinistry.getResponse());
		resultHistoryMinistryImpl.setRemarks(resultHistoryMinistry.getRemarks());

		return resultHistoryMinistryImpl;
	}

	/**
	 * Returns the result history ministry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the result history ministry
	 * @return the result history ministry
	 * @throws com.liferay.portal.NoSuchModelException if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultHistoryMinistry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result history ministry with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultHistoryMinistryException} if it could not be found.
	 *
	 * @param id the primary key of the result history ministry
	 * @return the result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry findByPrimaryKey(long id)
		throws NoSuchResultHistoryMinistryException, SystemException {
		ResultHistoryMinistry resultHistoryMinistry = fetchByPrimaryKey(id);

		if (resultHistoryMinistry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchResultHistoryMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return resultHistoryMinistry;
	}

	/**
	 * Returns the result history ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the result history ministry
	 * @return the result history ministry, or <code>null</code> if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultHistoryMinistry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result history ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the result history ministry
	 * @return the result history ministry, or <code>null</code> if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry fetchByPrimaryKey(long id)
		throws SystemException {
		ResultHistoryMinistry resultHistoryMinistry = (ResultHistoryMinistry)EntityCacheUtil.getResult(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
				ResultHistoryMinistryImpl.class, id);

		if (resultHistoryMinistry == _nullResultHistoryMinistry) {
			return null;
		}

		if (resultHistoryMinistry == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				resultHistoryMinistry = (ResultHistoryMinistry)session.get(ResultHistoryMinistryImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (resultHistoryMinistry != null) {
					cacheResult(resultHistoryMinistry);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ResultHistoryMinistryModelImpl.ENTITY_CACHE_ENABLED,
						ResultHistoryMinistryImpl.class, id,
						_nullResultHistoryMinistry);
				}

				closeSession(session);
			}
		}

		return resultHistoryMinistry;
	}

	/**
	 * Returns the result history ministry where requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultHistoryMinistryException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry findByRequestCode(String requestCode)
		throws NoSuchResultHistoryMinistryException, SystemException {
		ResultHistoryMinistry resultHistoryMinistry = fetchByRequestCode(requestCode);

		if (resultHistoryMinistry == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchResultHistoryMinistryException(msg.toString());
		}

		return resultHistoryMinistry;
	}

	/**
	 * Returns the result history ministry where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the result history ministry where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_RESULTHISTORYMINISTRY_WHERE);

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

			query.append(ResultHistoryMinistryModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				List<ResultHistoryMinistry> list = q.list();

				result = list;

				ResultHistoryMinistry resultHistoryMinistry = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					resultHistoryMinistry = list.get(0);

					cacheResult(resultHistoryMinistry);

					if ((resultHistoryMinistry.getRequestCode() == null) ||
							!resultHistoryMinistry.getRequestCode()
													  .equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, resultHistoryMinistry);
					}
				}

				return resultHistoryMinistry;
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
				return (ResultHistoryMinistry)result;
			}
		}
	}

	/**
	 * Returns all the result history ministries where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result history ministries where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result history ministries
	 * @param end the upper bound of the range of result history ministries (not inclusive)
	 * @return the range of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the result history ministries where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result history ministries
	 * @param end the upper bound of the range of result history ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
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

		List<ResultHistoryMinistry> list = (List<ResultHistoryMinistry>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTHISTORYMINISTRY_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultHistoryMinistryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<ResultHistoryMinistry>)QueryUtil.list(q,
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
	 * Returns the first result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		List<ResultHistoryMinistry> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultHistoryMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		int count = countByDocumentNameAnddocumentYear(documentName,
				documentYear);

		List<ResultHistoryMinistry> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultHistoryMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result history ministries before and after the current result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result history ministry
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		ResultHistoryMinistry resultHistoryMinistry = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultHistoryMinistry[] array = new ResultHistoryMinistryImpl[3];

			array[0] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					resultHistoryMinistry, documentName, documentYear,
					orderByComparator, true);

			array[1] = resultHistoryMinistry;

			array[2] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					resultHistoryMinistry, documentName, documentYear,
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

	protected ResultHistoryMinistry getByDocumentNameAnddocumentYear_PrevAndNext(
		Session session, ResultHistoryMinistry resultHistoryMinistry,
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

		query.append(_SQL_SELECT_RESULTHISTORYMINISTRY_WHERE);

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
			query.append(ResultHistoryMinistryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultHistoryMinistry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultHistoryMinistry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @return the matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, String ministryCode)
		throws SystemException {
		return findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param start the lower bound of the range of result history ministries
	 * @param end the upper bound of the range of result history ministries (not inclusive)
	 * @return the range of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, String ministryCode, int start,
		int end) throws SystemException {
		return findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param start the lower bound of the range of result history ministries
	 * @param end the upper bound of the range of result history ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, String ministryCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE;
			finderArgs = new Object[] { documentName, documentYear, ministryCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE;
			finderArgs = new Object[] {
					documentName, documentYear, ministryCode,
					
					start, end, orderByComparator
				};
		}

		List<ResultHistoryMinistry> list = (List<ResultHistoryMinistry>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTHISTORYMINISTRY_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_DOCUMENTYEAR_2);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultHistoryMinistryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (ministryCode != null) {
					qPos.add(ministryCode);
				}

				list = (List<ResultHistoryMinistry>)QueryUtil.list(q,
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
	 * Returns the first result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry findByDocumentNameAnddocumentYearAndMinistryCode_First(
		long documentName, int documentYear, String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		List<ResultHistoryMinistry> list = findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
				documentYear, ministryCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultHistoryMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry findByDocumentNameAnddocumentYearAndMinistryCode_Last(
		long documentName, int documentYear, String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		int count = countByDocumentNameAnddocumentYearAndMinistryCode(documentName,
				documentYear, ministryCode);

		List<ResultHistoryMinistry> list = findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
				documentYear, ministryCode, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultHistoryMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result history ministries before and after the current result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result history ministry
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry[] findByDocumentNameAnddocumentYearAndMinistryCode_PrevAndNext(
		long id, long documentName, int documentYear, String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		ResultHistoryMinistry resultHistoryMinistry = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultHistoryMinistry[] array = new ResultHistoryMinistryImpl[3];

			array[0] = getByDocumentNameAnddocumentYearAndMinistryCode_PrevAndNext(session,
					resultHistoryMinistry, documentName, documentYear,
					ministryCode, orderByComparator, true);

			array[1] = resultHistoryMinistry;

			array[2] = getByDocumentNameAnddocumentYearAndMinistryCode_PrevAndNext(session,
					resultHistoryMinistry, documentName, documentYear,
					ministryCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ResultHistoryMinistry getByDocumentNameAnddocumentYearAndMinistryCode_PrevAndNext(
		Session session, ResultHistoryMinistry resultHistoryMinistry,
		long documentName, int documentYear, String ministryCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTHISTORYMINISTRY_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_DOCUMENTYEAR_2);

		if (ministryCode == null) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_1);
		}
		else {
			if (ministryCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_2);
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
			query.append(ResultHistoryMinistryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (ministryCode != null) {
			qPos.add(ministryCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultHistoryMinistry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultHistoryMinistry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result history ministries where ministryCode = &#63;.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByMinistryCode(String ministryCode)
		throws SystemException {
		return findByMinistryCode(ministryCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result history ministries where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param ministryCode the ministry code
	 * @param start the lower bound of the range of result history ministries
	 * @param end the upper bound of the range of result history ministries (not inclusive)
	 * @return the range of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByMinistryCode(String ministryCode,
		int start, int end) throws SystemException {
		return findByMinistryCode(ministryCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result history ministries where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param ministryCode the ministry code
	 * @param start the lower bound of the range of result history ministries
	 * @param end the upper bound of the range of result history ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findByMinistryCode(String ministryCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE;
			finderArgs = new Object[] { ministryCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MINISTRYCODE;
			finderArgs = new Object[] {
					ministryCode,
					
					start, end, orderByComparator
				};
		}

		List<ResultHistoryMinistry> list = (List<ResultHistoryMinistry>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTHISTORYMINISTRY_WHERE);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultHistoryMinistryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ministryCode != null) {
					qPos.add(ministryCode);
				}

				list = (List<ResultHistoryMinistry>)QueryUtil.list(q,
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
	 * Returns the first result history ministry in the ordered set where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry findByMinistryCode_First(String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		List<ResultHistoryMinistry> list = findByMinistryCode(ministryCode, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultHistoryMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result history ministry in the ordered set where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry findByMinistryCode_Last(String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		int count = countByMinistryCode(ministryCode);

		List<ResultHistoryMinistry> list = findByMinistryCode(ministryCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultHistoryMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result history ministries before and after the current result history ministry in the ordered set where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result history ministry
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result history ministry
	 * @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultHistoryMinistry[] findByMinistryCode_PrevAndNext(long id,
		String ministryCode, OrderByComparator orderByComparator)
		throws NoSuchResultHistoryMinistryException, SystemException {
		ResultHistoryMinistry resultHistoryMinistry = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultHistoryMinistry[] array = new ResultHistoryMinistryImpl[3];

			array[0] = getByMinistryCode_PrevAndNext(session,
					resultHistoryMinistry, ministryCode, orderByComparator, true);

			array[1] = resultHistoryMinistry;

			array[2] = getByMinistryCode_PrevAndNext(session,
					resultHistoryMinistry, ministryCode, orderByComparator,
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

	protected ResultHistoryMinistry getByMinistryCode_PrevAndNext(
		Session session, ResultHistoryMinistry resultHistoryMinistry,
		String ministryCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTHISTORYMINISTRY_WHERE);

		if (ministryCode == null) {
			query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1);
		}
		else {
			if (ministryCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2);
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
			query.append(ResultHistoryMinistryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (ministryCode != null) {
			qPos.add(ministryCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultHistoryMinistry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultHistoryMinistry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result history ministries.
	 *
	 * @return the result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result history ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result history ministries
	 * @param end the upper bound of the range of result history ministries (not inclusive)
	 * @return the range of result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the result history ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result history ministries
	 * @param end the upper bound of the range of result history ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultHistoryMinistry> findAll(int start, int end,
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

		List<ResultHistoryMinistry> list = (List<ResultHistoryMinistry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESULTHISTORYMINISTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTHISTORYMINISTRY.concat(ResultHistoryMinistryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ResultHistoryMinistry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ResultHistoryMinistry>)QueryUtil.list(q,
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
	 * Removes the result history ministry where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws NoSuchResultHistoryMinistryException, SystemException {
		ResultHistoryMinistry resultHistoryMinistry = findByRequestCode(requestCode);

		resultHistoryMinistryPersistence.remove(resultHistoryMinistry);
	}

	/**
	 * Removes all the result history ministries where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (ResultHistoryMinistry resultHistoryMinistry : findByDocumentNameAnddocumentYear(
				documentName, documentYear)) {
			resultHistoryMinistryPersistence.remove(resultHistoryMinistry);
		}
	}

	/**
	 * Removes all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, String ministryCode)
		throws SystemException {
		for (ResultHistoryMinistry resultHistoryMinistry : findByDocumentNameAnddocumentYearAndMinistryCode(
				documentName, documentYear, ministryCode)) {
			resultHistoryMinistryPersistence.remove(resultHistoryMinistry);
		}
	}

	/**
	 * Removes all the result history ministries where ministryCode = &#63; from the database.
	 *
	 * @param ministryCode the ministry code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMinistryCode(String ministryCode)
		throws SystemException {
		for (ResultHistoryMinistry resultHistoryMinistry : findByMinistryCode(
				ministryCode)) {
			resultHistoryMinistryPersistence.remove(resultHistoryMinistry);
		}
	}

	/**
	 * Removes all the result history ministries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ResultHistoryMinistry resultHistoryMinistry : findAll()) {
			resultHistoryMinistryPersistence.remove(resultHistoryMinistry);
		}
	}

	/**
	 * Returns the number of result history ministries where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTHISTORYMINISTRY_WHERE);

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
	 * Returns the number of result history ministries where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTHISTORYMINISTRY_WHERE);

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
	 * Returns the number of result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @return the number of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, String ministryCode)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, ministryCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_RESULTHISTORYMINISTRY_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_DOCUMENTYEAR_2);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_2);
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

				if (ministryCode != null) {
					qPos.add(ministryCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result history ministries where ministryCode = &#63;.
	 *
	 * @param ministryCode the ministry code
	 * @return the number of matching result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMinistryCode(String ministryCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { ministryCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTHISTORYMINISTRY_WHERE);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ministryCode != null) {
					qPos.add(ministryCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result history ministries.
	 *
	 * @return the number of result history ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESULTHISTORYMINISTRY);

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
	 * Initializes the result history ministry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.result.model.ResultHistoryMinistry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ResultHistoryMinistry>> listenersList = new ArrayList<ModelListener<ResultHistoryMinistry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ResultHistoryMinistry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ResultHistoryMinistryImpl.class.getName());
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
	private static final String _SQL_SELECT_RESULTHISTORYMINISTRY = "SELECT resultHistoryMinistry FROM ResultHistoryMinistry resultHistoryMinistry";
	private static final String _SQL_SELECT_RESULTHISTORYMINISTRY_WHERE = "SELECT resultHistoryMinistry FROM ResultHistoryMinistry resultHistoryMinistry WHERE ";
	private static final String _SQL_COUNT_RESULTHISTORYMINISTRY = "SELECT COUNT(resultHistoryMinistry) FROM ResultHistoryMinistry resultHistoryMinistry";
	private static final String _SQL_COUNT_RESULTHISTORYMINISTRY_WHERE = "SELECT COUNT(resultHistoryMinistry) FROM ResultHistoryMinistry resultHistoryMinistry WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "resultHistoryMinistry.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "resultHistoryMinistry.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(resultHistoryMinistry.requestCode IS NULL OR resultHistoryMinistry.requestCode = ?)";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"resultHistoryMinistry.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"resultHistoryMinistry.documentYear = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_DOCUMENTNAME_2 =
		"resultHistoryMinistry.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_DOCUMENTYEAR_2 =
		"resultHistoryMinistry.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_1 =
		"resultHistoryMinistry.ministryCode IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_2 =
		"resultHistoryMinistry.ministryCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMINISTRYCODE_MINISTRYCODE_3 =
		"(resultHistoryMinistry.ministryCode IS NULL OR resultHistoryMinistry.ministryCode = ?)";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1 = "resultHistoryMinistry.ministryCode IS NULL";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2 = "resultHistoryMinistry.ministryCode = ?";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3 = "(resultHistoryMinistry.ministryCode IS NULL OR resultHistoryMinistry.ministryCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultHistoryMinistry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResultHistoryMinistry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ResultHistoryMinistry exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ResultHistoryMinistryPersistenceImpl.class);
	private static ResultHistoryMinistry _nullResultHistoryMinistry = new ResultHistoryMinistryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ResultHistoryMinistry> toCacheModel() {
				return _nullResultHistoryMinistryCacheModel;
			}
		};

	private static CacheModel<ResultHistoryMinistry> _nullResultHistoryMinistryCacheModel =
		new CacheModel<ResultHistoryMinistry>() {
			public ResultHistoryMinistry toEntityModel() {
				return _nullResultHistoryMinistry;
			}
		};
}