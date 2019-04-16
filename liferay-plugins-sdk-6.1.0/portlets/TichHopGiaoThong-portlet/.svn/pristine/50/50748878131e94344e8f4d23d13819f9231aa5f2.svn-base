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

import vn.gt.dao.result.NoSuchResultMinistryException;
import vn.gt.dao.result.model.ResultMinistry;
import vn.gt.dao.result.model.impl.ResultMinistryImpl;
import vn.gt.dao.result.model.impl.ResultMinistryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the result ministry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultMinistryPersistence
 * @see ResultMinistryUtil
 * @generated
 */
public class ResultMinistryPersistenceImpl extends BasePersistenceImpl<ResultMinistry>
	implements ResultMinistryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultMinistryUtil} to access the result ministry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultMinistryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			ResultMinistryModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			ResultMinistryModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultMinistryModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYear",
			new String[] { Integer.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocNameAndDocYearAndMinistryCode",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocNameAndDocYearAndMinistryCode",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			ResultMinistryModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultMinistryModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			ResultMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocNameAndDocYearAndMinistryCode",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MINISTRYCODE =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByMinistryCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMinistryCode",
			new String[] { String.class.getName() },
			ResultMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MINISTRYCODE = new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMinistryCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			ResultMinistryModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultMinistryModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			ResultMinistryModelImpl.MINISTRYCODE_COLUMN_BITMASK |
			ResultMinistryModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE =
		new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED,
			ResultMinistryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the result ministry in the entity cache if it is enabled.
	 *
	 * @param resultMinistry the result ministry
	 */
	public void cacheResult(ResultMinistry resultMinistry) {
		EntityCacheUtil.putResult(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryImpl.class, resultMinistry.getPrimaryKey(),
			resultMinistry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultMinistry.getRequestCode() }, resultMinistry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
			new Object[] {
				Integer.valueOf(resultMinistry.getDocumentName()),
				Integer.valueOf(resultMinistry.getDocumentYear()),
				
			resultMinistry.getMinistryCode(),
				Integer.valueOf(resultMinistry.getBusinessTypeCode())
			}, resultMinistry);

		resultMinistry.resetOriginalValues();
	}

	/**
	 * Caches the result ministries in the entity cache if it is enabled.
	 *
	 * @param resultMinistries the result ministries
	 */
	public void cacheResult(List<ResultMinistry> resultMinistries) {
		for (ResultMinistry resultMinistry : resultMinistries) {
			if (EntityCacheUtil.getResult(
						ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
						ResultMinistryImpl.class, resultMinistry.getPrimaryKey()) == null) {
				cacheResult(resultMinistry);
			}
			else {
				resultMinistry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all result ministries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ResultMinistryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ResultMinistryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the result ministry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResultMinistry resultMinistry) {
		EntityCacheUtil.removeResult(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryImpl.class, resultMinistry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultMinistry.getRequestCode() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
			new Object[] {
				Integer.valueOf(resultMinistry.getDocumentName()),
				Integer.valueOf(resultMinistry.getDocumentYear()),
				
			resultMinistry.getMinistryCode(),
				Integer.valueOf(resultMinistry.getBusinessTypeCode())
			});
	}

	/**
	 * Creates a new result ministry with the primary key. Does not add the result ministry to the database.
	 *
	 * @param id the primary key for the new result ministry
	 * @return the new result ministry
	 */
	public ResultMinistry create(long id) {
		ResultMinistry resultMinistry = new ResultMinistryImpl();

		resultMinistry.setNew(true);
		resultMinistry.setPrimaryKey(id);

		return resultMinistry;
	}

	/**
	 * Removes the result ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the result ministry
	 * @return the result ministry that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultMinistry remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the result ministry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the result ministry
	 * @return the result ministry that was removed
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry remove(long id)
		throws NoSuchResultMinistryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ResultMinistry resultMinistry = (ResultMinistry)session.get(ResultMinistryImpl.class,
					Long.valueOf(id));

			if (resultMinistry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchResultMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return resultMinistryPersistence.remove(resultMinistry);
		}
		catch (NoSuchResultMinistryException nsee) {
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
	 * Removes the result ministry from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resultMinistry the result ministry
	 * @return the result ministry that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultMinistry remove(ResultMinistry resultMinistry)
		throws SystemException {
		return super.remove(resultMinistry);
	}

	@Override
	protected ResultMinistry removeImpl(ResultMinistry resultMinistry)
		throws SystemException {
		resultMinistry = toUnwrappedModel(resultMinistry);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, resultMinistry);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		ResultMinistryModelImpl resultMinistryModelImpl = (ResultMinistryModelImpl)resultMinistry;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultMinistryModelImpl.getRequestCode() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
			new Object[] {
				Integer.valueOf(resultMinistryModelImpl.getDocumentName()),
				Integer.valueOf(resultMinistryModelImpl.getDocumentYear()),
				
			resultMinistryModelImpl.getMinistryCode(),
				Integer.valueOf(resultMinistryModelImpl.getBusinessTypeCode())
			});

		EntityCacheUtil.removeResult(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryImpl.class, resultMinistry.getPrimaryKey());

		return resultMinistry;
	}

	@Override
	public ResultMinistry updateImpl(
		vn.gt.dao.result.model.ResultMinistry resultMinistry, boolean merge)
		throws SystemException {
		resultMinistry = toUnwrappedModel(resultMinistry);

		boolean isNew = resultMinistry.isNew();

		ResultMinistryModelImpl resultMinistryModelImpl = (ResultMinistryModelImpl)resultMinistry;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, resultMinistry, merge);

			resultMinistry.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ResultMinistryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((resultMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(resultMinistryModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultMinistryModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Integer.valueOf(resultMinistryModelImpl.getDocumentName()),
						Integer.valueOf(resultMinistryModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((resultMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(resultMinistryModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultMinistryModelImpl.getOriginalDocumentYear()),
						
						resultMinistryModelImpl.getOriginalMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE,
					args);

				args = new Object[] {
						Integer.valueOf(resultMinistryModelImpl.getDocumentName()),
						Integer.valueOf(resultMinistryModelImpl.getDocumentYear()),
						
						resultMinistryModelImpl.getMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE,
					args);
			}

			if ((resultMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultMinistryModelImpl.getOriginalMinistryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE,
					args);

				args = new Object[] { resultMinistryModelImpl.getMinistryCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MINISTRYCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
			ResultMinistryImpl.class, resultMinistry.getPrimaryKey(),
			resultMinistry);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
				new Object[] { resultMinistry.getRequestCode() }, resultMinistry);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
				new Object[] {
					Integer.valueOf(resultMinistry.getDocumentName()),
					Integer.valueOf(resultMinistry.getDocumentYear()),
					
				resultMinistry.getMinistryCode(),
					Integer.valueOf(resultMinistry.getBusinessTypeCode())
				}, resultMinistry);
		}
		else {
			if ((resultMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultMinistryModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					new Object[] { resultMinistry.getRequestCode() },
					resultMinistry);
			}

			if ((resultMinistryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(resultMinistryModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultMinistryModelImpl.getOriginalDocumentYear()),
						
						resultMinistryModelImpl.getOriginalMinistryCode(),
						Integer.valueOf(resultMinistryModelImpl.getOriginalBusinessTypeCode())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
					new Object[] {
						Integer.valueOf(resultMinistry.getDocumentName()),
						Integer.valueOf(resultMinistry.getDocumentYear()),
						
					resultMinistry.getMinistryCode(),
						Integer.valueOf(resultMinistry.getBusinessTypeCode())
					}, resultMinistry);
			}
		}

		return resultMinistry;
	}

	protected ResultMinistry toUnwrappedModel(ResultMinistry resultMinistry) {
		if (resultMinistry instanceof ResultMinistryImpl) {
			return resultMinistry;
		}

		ResultMinistryImpl resultMinistryImpl = new ResultMinistryImpl();

		resultMinistryImpl.setNew(resultMinistry.isNew());
		resultMinistryImpl.setPrimaryKey(resultMinistry.getPrimaryKey());

		resultMinistryImpl.setId(resultMinistry.getId());
		resultMinistryImpl.setRequestCode(resultMinistry.getRequestCode());
		resultMinistryImpl.setRequestState(resultMinistry.getRequestState());
		resultMinistryImpl.setDocumentName(resultMinistry.getDocumentName());
		resultMinistryImpl.setDocumentYear(resultMinistry.getDocumentYear());
		resultMinistryImpl.setMinistryCode(resultMinistry.getMinistryCode());
		resultMinistryImpl.setOrganization(resultMinistry.getOrganization());
		resultMinistryImpl.setDivision(resultMinistry.getDivision());
		resultMinistryImpl.setOfficerName(resultMinistry.getOfficerName());
		resultMinistryImpl.setLatestDate(resultMinistry.getLatestDate());
		resultMinistryImpl.setBusinessTypeCode(resultMinistry.getBusinessTypeCode());
		resultMinistryImpl.setResponse(resultMinistry.getResponse());
		resultMinistryImpl.setRemarks(resultMinistry.getRemarks());

		return resultMinistryImpl;
	}

	/**
	 * Returns the result ministry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the result ministry
	 * @return the result ministry
	 * @throws com.liferay.portal.NoSuchModelException if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultMinistry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result ministry with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultMinistryException} if it could not be found.
	 *
	 * @param id the primary key of the result ministry
	 * @return the result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByPrimaryKey(long id)
		throws NoSuchResultMinistryException, SystemException {
		ResultMinistry resultMinistry = fetchByPrimaryKey(id);

		if (resultMinistry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchResultMinistryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return resultMinistry;
	}

	/**
	 * Returns the result ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the result ministry
	 * @return the result ministry, or <code>null</code> if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultMinistry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result ministry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the result ministry
	 * @return the result ministry, or <code>null</code> if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry fetchByPrimaryKey(long id) throws SystemException {
		ResultMinistry resultMinistry = (ResultMinistry)EntityCacheUtil.getResult(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
				ResultMinistryImpl.class, id);

		if (resultMinistry == _nullResultMinistry) {
			return null;
		}

		if (resultMinistry == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				resultMinistry = (ResultMinistry)session.get(ResultMinistryImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (resultMinistry != null) {
					cacheResult(resultMinistry);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ResultMinistryModelImpl.ENTITY_CACHE_ENABLED,
						ResultMinistryImpl.class, id, _nullResultMinistry);
				}

				closeSession(session);
			}
		}

		return resultMinistry;
	}

	/**
	 * Returns the result ministry where requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultMinistryException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByRequestCode(String requestCode)
		throws NoSuchResultMinistryException, SystemException {
		ResultMinistry resultMinistry = fetchByRequestCode(requestCode);

		if (resultMinistry == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchResultMinistryException(msg.toString());
		}

		return resultMinistry;
	}

	/**
	 * Returns the result ministry where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching result ministry, or <code>null</code> if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the result ministry where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching result ministry, or <code>null</code> if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_RESULTMINISTRY_WHERE);

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

			query.append(ResultMinistryModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				List<ResultMinistry> list = q.list();

				result = list;

				ResultMinistry resultMinistry = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					resultMinistry = list.get(0);

					cacheResult(resultMinistry);

					if ((resultMinistry.getRequestCode() == null) ||
							!resultMinistry.getRequestCode().equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, resultMinistry);
					}
				}

				return resultMinistry;
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
				return (ResultMinistry)result;
			}
		}
	}

	/**
	 * Returns all the result ministries where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByDocumentNameAnddocumentYear(
		int documentName, int documentYear) throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result ministries where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result ministries
	 * @param end the upper bound of the range of result ministries (not inclusive)
	 * @return the range of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByDocumentNameAnddocumentYear(
		int documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the result ministries where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result ministries
	 * @param end the upper bound of the range of result ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByDocumentNameAnddocumentYear(
		int documentName, int documentYear, int start, int end,
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

		List<ResultMinistry> list = (List<ResultMinistry>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTMINISTRY_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultMinistryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<ResultMinistry>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByDocumentNameAnddocumentYear_First(
		int documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		List<ResultMinistry> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByDocumentNameAnddocumentYear_Last(
		int documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		int count = countByDocumentNameAnddocumentYear(documentName,
				documentYear);

		List<ResultMinistry> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result ministries before and after the current result ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result ministry
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, int documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		ResultMinistry resultMinistry = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultMinistry[] array = new ResultMinistryImpl[3];

			array[0] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					resultMinistry, documentName, documentYear,
					orderByComparator, true);

			array[1] = resultMinistry;

			array[2] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					resultMinistry, documentName, documentYear,
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

	protected ResultMinistry getByDocumentNameAnddocumentYear_PrevAndNext(
		Session session, ResultMinistry resultMinistry, int documentName,
		int documentYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTMINISTRY_WHERE);

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
			query.append(ResultMinistryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultMinistry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultMinistry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @return the matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByDocNameAndDocYearAndMinistryCode(
		int documentName, int documentYear, String ministryCode)
		throws SystemException {
		return findByDocNameAndDocYearAndMinistryCode(documentName,
			documentYear, ministryCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the result ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param start the lower bound of the range of result ministries
	 * @param end the upper bound of the range of result ministries (not inclusive)
	 * @return the range of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByDocNameAndDocYearAndMinistryCode(
		int documentName, int documentYear, String ministryCode, int start,
		int end) throws SystemException {
		return findByDocNameAndDocYearAndMinistryCode(documentName,
			documentYear, ministryCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param start the lower bound of the range of result ministries
	 * @param end the upper bound of the range of result ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByDocNameAndDocYearAndMinistryCode(
		int documentName, int documentYear, String ministryCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE;
			finderArgs = new Object[] { documentName, documentYear, ministryCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE;
			finderArgs = new Object[] {
					documentName, documentYear, ministryCode,
					
					start, end, orderByComparator
				};
		}

		List<ResultMinistry> list = (List<ResultMinistry>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTMINISTRY_WHERE);

			query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_DOCUMENTYEAR_2);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultMinistryModelImpl.ORDER_BY_JPQL);
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

				list = (List<ResultMinistry>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByDocNameAndDocYearAndMinistryCode_First(
		int documentName, int documentYear, String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		List<ResultMinistry> list = findByDocNameAndDocYearAndMinistryCode(documentName,
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

			throw new NoSuchResultMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByDocNameAndDocYearAndMinistryCode_Last(
		int documentName, int documentYear, String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		int count = countByDocNameAndDocYearAndMinistryCode(documentName,
				documentYear, ministryCode);

		List<ResultMinistry> list = findByDocNameAndDocYearAndMinistryCode(documentName,
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

			throw new NoSuchResultMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result ministries before and after the current result ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result ministry
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry[] findByDocNameAndDocYearAndMinistryCode_PrevAndNext(
		long id, int documentName, int documentYear, String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		ResultMinistry resultMinistry = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultMinistry[] array = new ResultMinistryImpl[3];

			array[0] = getByDocNameAndDocYearAndMinistryCode_PrevAndNext(session,
					resultMinistry, documentName, documentYear, ministryCode,
					orderByComparator, true);

			array[1] = resultMinistry;

			array[2] = getByDocNameAndDocYearAndMinistryCode_PrevAndNext(session,
					resultMinistry, documentName, documentYear, ministryCode,
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

	protected ResultMinistry getByDocNameAndDocYearAndMinistryCode_PrevAndNext(
		Session session, ResultMinistry resultMinistry, int documentName,
		int documentYear, String ministryCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTMINISTRY_WHERE);

		query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_DOCUMENTYEAR_2);

		if (ministryCode == null) {
			query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_1);
		}
		else {
			if (ministryCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_2);
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
			query.append(ResultMinistryModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(resultMinistry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultMinistry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result ministries where ministryCode = &#63;.
	 *
	 * @param ministryCode the ministry code
	 * @return the matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByMinistryCode(String ministryCode)
		throws SystemException {
		return findByMinistryCode(ministryCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result ministries where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param ministryCode the ministry code
	 * @param start the lower bound of the range of result ministries
	 * @param end the upper bound of the range of result ministries (not inclusive)
	 * @return the range of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByMinistryCode(String ministryCode,
		int start, int end) throws SystemException {
		return findByMinistryCode(ministryCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result ministries where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param ministryCode the ministry code
	 * @param start the lower bound of the range of result ministries
	 * @param end the upper bound of the range of result ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findByMinistryCode(String ministryCode,
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

		List<ResultMinistry> list = (List<ResultMinistry>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTMINISTRY_WHERE);

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
				query.append(ResultMinistryModelImpl.ORDER_BY_JPQL);
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

				list = (List<ResultMinistry>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result ministry in the ordered set where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByMinistryCode_First(String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		List<ResultMinistry> list = findByMinistryCode(ministryCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result ministry in the ordered set where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByMinistryCode_Last(String ministryCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		int count = countByMinistryCode(ministryCode);

		List<ResultMinistry> list = findByMinistryCode(ministryCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ministryCode=");
			msg.append(ministryCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultMinistryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result ministries before and after the current result ministry in the ordered set where ministryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result ministry
	 * @param ministryCode the ministry code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a result ministry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry[] findByMinistryCode_PrevAndNext(long id,
		String ministryCode, OrderByComparator orderByComparator)
		throws NoSuchResultMinistryException, SystemException {
		ResultMinistry resultMinistry = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultMinistry[] array = new ResultMinistryImpl[3];

			array[0] = getByMinistryCode_PrevAndNext(session, resultMinistry,
					ministryCode, orderByComparator, true);

			array[1] = resultMinistry;

			array[2] = getByMinistryCode_PrevAndNext(session, resultMinistry,
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

	protected ResultMinistry getByMinistryCode_PrevAndNext(Session session,
		ResultMinistry resultMinistry, String ministryCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTMINISTRY_WHERE);

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
			query.append(ResultMinistryModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(resultMinistry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultMinistry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the result ministry where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; and businessTypeCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultMinistryException} if it could not be found.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param businessTypeCode the business type code
	 * @return the matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
		int documentName, int documentYear, String ministryCode,
		int businessTypeCode)
		throws NoSuchResultMinistryException, SystemException {
		ResultMinistry resultMinistry = fetchByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(documentName,
				documentYear, ministryCode, businessTypeCode);

		if (resultMinistry == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", ministryCode=");
			msg.append(ministryCode);

			msg.append(", businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchResultMinistryException(msg.toString());
		}

		return resultMinistry;
	}

	/**
	 * Returns the result ministry where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; and businessTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param businessTypeCode the business type code
	 * @return the matching result ministry, or <code>null</code> if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry fetchByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
		int documentName, int documentYear, String ministryCode,
		int businessTypeCode) throws SystemException {
		return fetchByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(documentName,
			documentYear, ministryCode, businessTypeCode, true);
	}

	/**
	 * Returns the result ministry where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; and businessTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param businessTypeCode the business type code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching result ministry, or <code>null</code> if a matching result ministry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultMinistry fetchByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
		int documentName, int documentYear, String ministryCode,
		int businessTypeCode, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, ministryCode, businessTypeCode
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_RESULTMINISTRY_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_DOCUMENTYEAR_2);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_BUSINESSTYPECODE_2);

			query.append(ResultMinistryModelImpl.ORDER_BY_JPQL);

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

				qPos.add(businessTypeCode);

				List<ResultMinistry> list = q.list();

				result = list;

				ResultMinistry resultMinistry = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
						finderArgs, list);
				}
				else {
					resultMinistry = list.get(0);

					cacheResult(resultMinistry);

					if ((resultMinistry.getDocumentName() != documentName) ||
							(resultMinistry.getDocumentYear() != documentYear) ||
							(resultMinistry.getMinistryCode() == null) ||
							!resultMinistry.getMinistryCode()
											   .equals(ministryCode) ||
							(resultMinistry.getBusinessTypeCode() != businessTypeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
							finderArgs, resultMinistry);
					}
				}

				return resultMinistry;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
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
				return (ResultMinistry)result;
			}
		}
	}

	/**
	 * Returns all the result ministries.
	 *
	 * @return the result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result ministries
	 * @param end the upper bound of the range of result ministries (not inclusive)
	 * @return the range of result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the result ministries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result ministries
	 * @param end the upper bound of the range of result ministries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultMinistry> findAll(int start, int end,
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

		List<ResultMinistry> list = (List<ResultMinistry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESULTMINISTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTMINISTRY.concat(ResultMinistryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ResultMinistry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ResultMinistry>)QueryUtil.list(q,
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
	 * Removes the result ministry where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws NoSuchResultMinistryException, SystemException {
		ResultMinistry resultMinistry = findByRequestCode(requestCode);

		resultMinistryPersistence.remove(resultMinistry);
	}

	/**
	 * Removes all the result ministries where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAnddocumentYear(int documentName,
		int documentYear) throws SystemException {
		for (ResultMinistry resultMinistry : findByDocumentNameAnddocumentYear(
				documentName, documentYear)) {
			resultMinistryPersistence.remove(resultMinistry);
		}
	}

	/**
	 * Removes all the result ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocNameAndDocYearAndMinistryCode(int documentName,
		int documentYear, String ministryCode) throws SystemException {
		for (ResultMinistry resultMinistry : findByDocNameAndDocYearAndMinistryCode(
				documentName, documentYear, ministryCode)) {
			resultMinistryPersistence.remove(resultMinistry);
		}
	}

	/**
	 * Removes all the result ministries where ministryCode = &#63; from the database.
	 *
	 * @param ministryCode the ministry code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMinistryCode(String ministryCode)
		throws SystemException {
		for (ResultMinistry resultMinistry : findByMinistryCode(ministryCode)) {
			resultMinistryPersistence.remove(resultMinistry);
		}
	}

	/**
	 * Removes the result ministry where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; and businessTypeCode = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param businessTypeCode the business type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
		int documentName, int documentYear, String ministryCode,
		int businessTypeCode)
		throws NoSuchResultMinistryException, SystemException {
		ResultMinistry resultMinistry = findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(documentName,
				documentYear, ministryCode, businessTypeCode);

		resultMinistryPersistence.remove(resultMinistry);
	}

	/**
	 * Removes all the result ministries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ResultMinistry resultMinistry : findAll()) {
			resultMinistryPersistence.remove(resultMinistry);
		}
	}

	/**
	 * Returns the number of result ministries where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTMINISTRY_WHERE);

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
	 * Returns the number of result ministries where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYear(int documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTMINISTRY_WHERE);

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
	 * Returns the number of result ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @return the number of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocNameAndDocYearAndMinistryCode(int documentName,
		int documentYear, String ministryCode) throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, ministryCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_RESULTMINISTRY_WHERE);

			query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_DOCUMENTYEAR_2);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCNAMEANDDOCYEARANDMINISTRYCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result ministries where ministryCode = &#63;.
	 *
	 * @param ministryCode the ministry code
	 * @return the number of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMinistryCode(String ministryCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { ministryCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MINISTRYCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTMINISTRY_WHERE);

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
	 * Returns the number of result ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; and businessTypeCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param ministryCode the ministry code
	 * @param businessTypeCode the business type code
	 * @return the number of matching result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
		int documentName, int documentYear, String ministryCode,
		int businessTypeCode) throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, ministryCode, businessTypeCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_RESULTMINISTRY_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_DOCUMENTYEAR_2);

			if (ministryCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_1);
			}
			else {
				if (ministryCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_BUSINESSTYPECODE_2);

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

				qPos.add(businessTypeCode);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result ministries.
	 *
	 * @return the number of result ministries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESULTMINISTRY);

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
	 * Initializes the result ministry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.result.model.ResultMinistry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ResultMinistry>> listenersList = new ArrayList<ModelListener<ResultMinistry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ResultMinistry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ResultMinistryImpl.class.getName());
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
	private static final String _SQL_SELECT_RESULTMINISTRY = "SELECT resultMinistry FROM ResultMinistry resultMinistry";
	private static final String _SQL_SELECT_RESULTMINISTRY_WHERE = "SELECT resultMinistry FROM ResultMinistry resultMinistry WHERE ";
	private static final String _SQL_COUNT_RESULTMINISTRY = "SELECT COUNT(resultMinistry) FROM ResultMinistry resultMinistry";
	private static final String _SQL_COUNT_RESULTMINISTRY_WHERE = "SELECT COUNT(resultMinistry) FROM ResultMinistry resultMinistry WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "resultMinistry.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "resultMinistry.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(resultMinistry.requestCode IS NULL OR resultMinistry.requestCode = ?)";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"resultMinistry.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"resultMinistry.documentYear = ?";
	private static final String _FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_DOCUMENTNAME_2 =
		"resultMinistry.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_DOCUMENTYEAR_2 =
		"resultMinistry.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_1 =
		"resultMinistry.ministryCode IS NULL";
	private static final String _FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_2 =
		"resultMinistry.ministryCode = ?";
	private static final String _FINDER_COLUMN_DOCNAMEANDDOCYEARANDMINISTRYCODE_MINISTRYCODE_3 =
		"(resultMinistry.ministryCode IS NULL OR resultMinistry.ministryCode = ?)";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_1 = "resultMinistry.ministryCode IS NULL";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_2 = "resultMinistry.ministryCode = ?";
	private static final String _FINDER_COLUMN_MINISTRYCODE_MINISTRYCODE_3 = "(resultMinistry.ministryCode IS NULL OR resultMinistry.ministryCode = ?)";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_DOCUMENTNAME_2 =
		"resultMinistry.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_DOCUMENTYEAR_2 =
		"resultMinistry.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_1 =
		"resultMinistry.ministryCode IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_2 =
		"resultMinistry.ministryCode = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_MINISTRYCODE_3 =
		"(resultMinistry.ministryCode IS NULL OR resultMinistry.ministryCode = ?) AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMINISTRYCODEBUSINESSTYPECODE_BUSINESSTYPECODE_2 =
		"resultMinistry.businessTypeCode = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultMinistry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResultMinistry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ResultMinistry exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ResultMinistryPersistenceImpl.class);
	private static ResultMinistry _nullResultMinistry = new ResultMinistryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ResultMinistry> toCacheModel() {
				return _nullResultMinistryCacheModel;
			}
		};

	private static CacheModel<ResultMinistry> _nullResultMinistryCacheModel = new CacheModel<ResultMinistry>() {
			public ResultMinistry toEntityModel() {
				return _nullResultMinistry;
			}
		};
}