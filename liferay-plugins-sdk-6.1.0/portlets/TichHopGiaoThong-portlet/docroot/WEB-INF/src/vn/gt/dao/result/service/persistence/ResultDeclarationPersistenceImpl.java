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

import vn.gt.dao.result.NoSuchResultDeclarationException;
import vn.gt.dao.result.model.ResultDeclaration;
import vn.gt.dao.result.model.impl.ResultDeclarationImpl;
import vn.gt.dao.result.model.impl.ResultDeclarationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the result declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultDeclarationPersistence
 * @see ResultDeclarationUtil
 * @generated
 */
public class ResultDeclarationPersistenceImpl extends BasePersistenceImpl<ResultDeclaration>
	implements ResultDeclarationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultDeclarationUtil} to access the result declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultDeclarationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			ResultDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BUSINESSTYPECODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBusinessTypeCode",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBusinessTypeCode", new String[] { Integer.class.getName() },
			ResultDeclarationModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BUSINESSTYPECODE = new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBusinessTypeCode", new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndBusinessTypeCodeAndDocumentYear",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndBusinessTypeCodeAndDocumentYear",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			ResultDeclarationModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK |
			ResultDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndBusinessTypeCodeAndDocumentYear",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName()
			},
			ResultDeclarationModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK |
			ResultDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			ResultDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName()
			},
			ResultDeclarationModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK |
			ResultDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			ResultDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			ResultDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODEANDBUSINESSTYPECODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRequestCodeAndBusinessTypeCode",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODEANDBUSINESSTYPECODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRequestCodeAndBusinessTypeCode",
			new String[] { String.class.getName(), Integer.class.getName() },
			ResultDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK |
			ResultDeclarationModelImpl.BUSINESSTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODEANDBUSINESSTYPECODE =
		new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCodeAndBusinessTypeCode",
			new String[] { String.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED,
			ResultDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the result declaration in the entity cache if it is enabled.
	 *
	 * @param resultDeclaration the result declaration
	 */
	public void cacheResult(ResultDeclaration resultDeclaration) {
		EntityCacheUtil.putResult(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationImpl.class, resultDeclaration.getPrimaryKey(),
			resultDeclaration);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultDeclaration.getRequestCode() },
			resultDeclaration);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
			new Object[] {
				Integer.valueOf(resultDeclaration.getBusinessTypeCode()),
				Long.valueOf(resultDeclaration.getDocumentName()),
				Integer.valueOf(resultDeclaration.getDocumentYear()),
				
			resultDeclaration.getRequestCode()
			}, resultDeclaration);

		resultDeclaration.resetOriginalValues();
	}

	/**
	 * Caches the result declarations in the entity cache if it is enabled.
	 *
	 * @param resultDeclarations the result declarations
	 */
	public void cacheResult(List<ResultDeclaration> resultDeclarations) {
		for (ResultDeclaration resultDeclaration : resultDeclarations) {
			if (EntityCacheUtil.getResult(
						ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						ResultDeclarationImpl.class,
						resultDeclaration.getPrimaryKey()) == null) {
				cacheResult(resultDeclaration);
			}
			else {
				resultDeclaration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all result declarations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ResultDeclarationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ResultDeclarationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the result declaration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResultDeclaration resultDeclaration) {
		EntityCacheUtil.removeResult(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationImpl.class, resultDeclaration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(resultDeclaration);
	}

	@Override
	public void clearCache(List<ResultDeclaration> resultDeclarations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ResultDeclaration resultDeclaration : resultDeclarations) {
			EntityCacheUtil.removeResult(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				ResultDeclarationImpl.class, resultDeclaration.getPrimaryKey());

			clearUniqueFindersCache(resultDeclaration);
		}
	}

	protected void clearUniqueFindersCache(ResultDeclaration resultDeclaration) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { resultDeclaration.getRequestCode() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
			new Object[] {
				Integer.valueOf(resultDeclaration.getBusinessTypeCode()),
				Long.valueOf(resultDeclaration.getDocumentName()),
				Integer.valueOf(resultDeclaration.getDocumentYear()),
				
			resultDeclaration.getRequestCode()
			});
	}

	/**
	 * Creates a new result declaration with the primary key. Does not add the result declaration to the database.
	 *
	 * @param id the primary key for the new result declaration
	 * @return the new result declaration
	 */
	public ResultDeclaration create(long id) {
		ResultDeclaration resultDeclaration = new ResultDeclarationImpl();

		resultDeclaration.setNew(true);
		resultDeclaration.setPrimaryKey(id);

		return resultDeclaration;
	}

	/**
	 * Removes the result declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the result declaration
	 * @return the result declaration that was removed
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration remove(long id)
		throws NoSuchResultDeclarationException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the result declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the result declaration
	 * @return the result declaration that was removed
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultDeclaration remove(Serializable primaryKey)
		throws NoSuchResultDeclarationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ResultDeclaration resultDeclaration = (ResultDeclaration)session.get(ResultDeclarationImpl.class,
					primaryKey);

			if (resultDeclaration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchResultDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(resultDeclaration);
		}
		catch (NoSuchResultDeclarationException nsee) {
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
	protected ResultDeclaration removeImpl(ResultDeclaration resultDeclaration)
		throws SystemException {
		resultDeclaration = toUnwrappedModel(resultDeclaration);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, resultDeclaration);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(resultDeclaration);

		return resultDeclaration;
	}

	@Override
	public ResultDeclaration updateImpl(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration,
		boolean merge) throws SystemException {
		resultDeclaration = toUnwrappedModel(resultDeclaration);

		boolean isNew = resultDeclaration.isNew();

		ResultDeclarationModelImpl resultDeclarationModelImpl = (ResultDeclarationModelImpl)resultDeclaration;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, resultDeclaration, merge);

			resultDeclaration.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ResultDeclarationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((resultDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(resultDeclarationModelImpl.getOriginalBusinessTypeCode())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE,
					args);

				args = new Object[] {
						Integer.valueOf(resultDeclarationModelImpl.getBusinessTypeCode())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE,
					args);
			}

			if ((resultDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(resultDeclarationModelImpl.getOriginalBusinessTypeCode()),
						Long.valueOf(resultDeclarationModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultDeclarationModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Integer.valueOf(resultDeclarationModelImpl.getBusinessTypeCode()),
						Long.valueOf(resultDeclarationModelImpl.getDocumentName()),
						Integer.valueOf(resultDeclarationModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR,
					args);
			}

			if ((resultDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(resultDeclarationModelImpl.getOriginalBusinessTypeCode()),
						Long.valueOf(resultDeclarationModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultDeclarationModelImpl.getOriginalDocumentYear()),
						
						resultDeclarationModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					args);

				args = new Object[] {
						Integer.valueOf(resultDeclarationModelImpl.getBusinessTypeCode()),
						Long.valueOf(resultDeclarationModelImpl.getDocumentName()),
						Integer.valueOf(resultDeclarationModelImpl.getDocumentYear()),
						
						resultDeclarationModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					args);
			}

			if ((resultDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(resultDeclarationModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultDeclarationModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(resultDeclarationModelImpl.getDocumentName()),
						Integer.valueOf(resultDeclarationModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((resultDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODEANDBUSINESSTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultDeclarationModelImpl.getOriginalRequestCode(),
						Integer.valueOf(resultDeclarationModelImpl.getOriginalBusinessTypeCode())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODEANDBUSINESSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODEANDBUSINESSTYPECODE,
					args);

				args = new Object[] {
						resultDeclarationModelImpl.getRequestCode(),
						Integer.valueOf(resultDeclarationModelImpl.getBusinessTypeCode())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODEANDBUSINESSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODEANDBUSINESSTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			ResultDeclarationImpl.class, resultDeclaration.getPrimaryKey(),
			resultDeclaration);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
				new Object[] { resultDeclaration.getRequestCode() },
				resultDeclaration);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
				new Object[] {
					Integer.valueOf(resultDeclaration.getBusinessTypeCode()),
					Long.valueOf(resultDeclaration.getDocumentName()),
					Integer.valueOf(resultDeclaration.getDocumentYear()),
					
				resultDeclaration.getRequestCode()
				}, resultDeclaration);
		}
		else {
			if ((resultDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultDeclarationModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					new Object[] { resultDeclaration.getRequestCode() },
					resultDeclaration);
			}

			if ((resultDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(resultDeclarationModelImpl.getOriginalBusinessTypeCode()),
						Long.valueOf(resultDeclarationModelImpl.getOriginalDocumentName()),
						Integer.valueOf(resultDeclarationModelImpl.getOriginalDocumentYear()),
						
						resultDeclarationModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					new Object[] {
						Integer.valueOf(resultDeclaration.getBusinessTypeCode()),
						Long.valueOf(resultDeclaration.getDocumentName()),
						Integer.valueOf(resultDeclaration.getDocumentYear()),
						
					resultDeclaration.getRequestCode()
					}, resultDeclaration);
			}
		}

		return resultDeclaration;
	}

	protected ResultDeclaration toUnwrappedModel(
		ResultDeclaration resultDeclaration) {
		if (resultDeclaration instanceof ResultDeclarationImpl) {
			return resultDeclaration;
		}

		ResultDeclarationImpl resultDeclarationImpl = new ResultDeclarationImpl();

		resultDeclarationImpl.setNew(resultDeclaration.isNew());
		resultDeclarationImpl.setPrimaryKey(resultDeclaration.getPrimaryKey());

		resultDeclarationImpl.setId(resultDeclaration.getId());
		resultDeclarationImpl.setRequestCode(resultDeclaration.getRequestCode());
		resultDeclarationImpl.setRequestState(resultDeclaration.getRequestState());
		resultDeclarationImpl.setDocumentName(resultDeclaration.getDocumentName());
		resultDeclarationImpl.setDocumentYear(resultDeclaration.getDocumentYear());
		resultDeclarationImpl.setBusinessOrder(resultDeclaration.getBusinessOrder());
		resultDeclarationImpl.setBusinessTypeCode(resultDeclaration.getBusinessTypeCode());
		resultDeclarationImpl.setLatestSend(resultDeclaration.getLatestSend());
		resultDeclarationImpl.setDeclarationTime(resultDeclaration.getDeclarationTime());
		resultDeclarationImpl.setArrivalDepartureTime(resultDeclaration.getArrivalDepartureTime());
		resultDeclarationImpl.setRemainingTime(resultDeclaration.getRemainingTime());
		resultDeclarationImpl.setRemarks(resultDeclaration.getRemarks());

		return resultDeclarationImpl;
	}

	/**
	 * Returns the result declaration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the result declaration
	 * @return the result declaration
	 * @throws com.liferay.portal.NoSuchModelException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result declaration with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultDeclarationException} if it could not be found.
	 *
	 * @param id the primary key of the result declaration
	 * @return the result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByPrimaryKey(long id)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = fetchByPrimaryKey(id);

		if (resultDeclaration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchResultDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return resultDeclaration;
	}

	/**
	 * Returns the result declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the result declaration
	 * @return the result declaration, or <code>null</code> if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultDeclaration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the result declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the result declaration
	 * @return the result declaration, or <code>null</code> if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration fetchByPrimaryKey(long id)
		throws SystemException {
		ResultDeclaration resultDeclaration = (ResultDeclaration)EntityCacheUtil.getResult(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				ResultDeclarationImpl.class, id);

		if (resultDeclaration == _nullResultDeclaration) {
			return null;
		}

		if (resultDeclaration == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				resultDeclaration = (ResultDeclaration)session.get(ResultDeclarationImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (resultDeclaration != null) {
					cacheResult(resultDeclaration);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ResultDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						ResultDeclarationImpl.class, id, _nullResultDeclaration);
				}

				closeSession(session);
			}
		}

		return resultDeclaration;
	}

	/**
	 * Returns the result declaration where requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultDeclarationException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByRequestCode(String requestCode)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = fetchByRequestCode(requestCode);

		if (resultDeclaration == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchResultDeclarationException(msg.toString());
		}

		return resultDeclaration;
	}

	/**
	 * Returns the result declaration where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the result declaration where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

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

			query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				List<ResultDeclaration> list = q.list();

				result = list;

				ResultDeclaration resultDeclaration = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					resultDeclaration = list.get(0);

					cacheResult(resultDeclaration);

					if ((resultDeclaration.getRequestCode() == null) ||
							!resultDeclaration.getRequestCode()
												  .equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, resultDeclaration);
					}
				}

				return resultDeclaration;
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
				return (ResultDeclaration)result;
			}
		}
	}

	/**
	 * Returns all the result declarations where businessTypeCode = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @return the matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByBusinessTypeCode(int businessTypeCode)
		throws SystemException {
		return findByBusinessTypeCode(businessTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result declarations where businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @return the range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByBusinessTypeCode(
		int businessTypeCode, int start, int end) throws SystemException {
		return findByBusinessTypeCode(businessTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result declarations where businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByBusinessTypeCode(
		int businessTypeCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESSTYPECODE;
			finderArgs = new Object[] { businessTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BUSINESSTYPECODE;
			finderArgs = new Object[] {
					businessTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<ResultDeclaration> list = (List<ResultDeclaration>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessTypeCode);

				list = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result declaration in the ordered set where businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByBusinessTypeCode_First(
		int businessTypeCode, OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		List<ResultDeclaration> list = findByBusinessTypeCode(businessTypeCode,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result declaration in the ordered set where businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByBusinessTypeCode_Last(int businessTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		int count = countByBusinessTypeCode(businessTypeCode);

		List<ResultDeclaration> list = findByBusinessTypeCode(businessTypeCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result declaration
	 * @param businessTypeCode the business type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration[] findByBusinessTypeCode_PrevAndNext(long id,
		int businessTypeCode, OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultDeclaration[] array = new ResultDeclarationImpl[3];

			array[0] = getByBusinessTypeCode_PrevAndNext(session,
					resultDeclaration, businessTypeCode, orderByComparator, true);

			array[1] = resultDeclaration;

			array[2] = getByBusinessTypeCode_PrevAndNext(session,
					resultDeclaration, businessTypeCode, orderByComparator,
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

	protected ResultDeclaration getByBusinessTypeCode_PrevAndNext(
		Session session, ResultDeclaration resultDeclaration,
		int businessTypeCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

		query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

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
			query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(businessTypeCode);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws SystemException {
		return findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @return the range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end) throws SystemException {
		return findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					businessTypeCode, documentName, documentYear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					businessTypeCode, documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<ResultDeclaration> list = (List<ResultDeclaration>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_BUSINESSTYPECODE_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
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

				list = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYear_First(
		int businessTypeCode, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		List<ResultDeclaration> list = findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
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

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYear_Last(
		int businessTypeCode, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		int count = countByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
				documentName, documentYear);

		List<ResultDeclaration> list = findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
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

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result declaration
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration[] findByDocumentNameAndBusinessTypeCodeAndDocumentYear_PrevAndNext(
		long id, int businessTypeCode, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultDeclaration[] array = new ResultDeclarationImpl[3];

			array[0] = getByDocumentNameAndBusinessTypeCodeAndDocumentYear_PrevAndNext(session,
					resultDeclaration, businessTypeCode, documentName,
					documentYear, orderByComparator, true);

			array[1] = resultDeclaration;

			array[2] = getByDocumentNameAndBusinessTypeCodeAndDocumentYear_PrevAndNext(session,
					resultDeclaration, businessTypeCode, documentName,
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

	protected ResultDeclaration getByDocumentNameAndBusinessTypeCodeAndDocumentYear_PrevAndNext(
		Session session, ResultDeclaration resultDeclaration,
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

		query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_BUSINESSTYPECODE_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(resultDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @return the matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode) throws SystemException {
		return findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @return the range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode, int start, int end) throws SystemException {
		return findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE;
			finderArgs = new Object[] {
					businessTypeCode, documentName, documentYear, requestCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE;
			finderArgs = new Object[] {
					businessTypeCode, documentName, documentYear, requestCode,
					
					start, end, orderByComparator
				};
		}

		List<ResultDeclaration> list = (List<ResultDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_BUSINESSTYPECODE_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTYEAR_2);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
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

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				list = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_First(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		List<ResultDeclaration> list = findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
				documentName, documentYear, requestCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_Last(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		int count = countByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
				documentName, documentYear, requestCode);

		List<ResultDeclaration> list = findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
				documentName, documentYear, requestCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result declaration
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration[] findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_PrevAndNext(
		long id, int businessTypeCode, long documentName, int documentYear,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultDeclaration[] array = new ResultDeclarationImpl[3];

			array[0] = getByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_PrevAndNext(session,
					resultDeclaration, businessTypeCode, documentName,
					documentYear, requestCode, orderByComparator, true);

			array[1] = resultDeclaration;

			array[2] = getByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_PrevAndNext(session,
					resultDeclaration, businessTypeCode, documentName,
					documentYear, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ResultDeclaration getByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_PrevAndNext(
		Session session, ResultDeclaration resultDeclaration,
		int businessTypeCode, long documentName, int documentYear,
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

		query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_BUSINESSTYPECODE_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTYEAR_2);

		if (requestCode == null) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_1);
		}
		else {
			if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_2);
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
			query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(businessTypeCode);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (requestCode != null) {
			qPos.add(requestCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultDeclarationException} if it could not be found.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @return the matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
				documentName, documentYear, requestCode);

		if (resultDeclaration == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchResultDeclarationException(msg.toString());
		}

		return resultDeclaration;
	}

	/**
	 * Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode) throws SystemException {
		return fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode, true);
	}

	/**
	 * Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				businessTypeCode, documentName, documentYear, requestCode
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_BUSINESSTYPECODE_2);

			query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTYEAR_2);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_2);
				}
			}

			query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessTypeCode);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				List<ResultDeclaration> list = q.list();

				result = list;

				ResultDeclaration resultDeclaration = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
						finderArgs, list);
				}
				else {
					resultDeclaration = list.get(0);

					cacheResult(resultDeclaration);

					if ((resultDeclaration.getBusinessTypeCode() != businessTypeCode) ||
							(resultDeclaration.getDocumentName() != documentName) ||
							(resultDeclaration.getDocumentYear() != documentYear) ||
							(resultDeclaration.getRequestCode() == null) ||
							!resultDeclaration.getRequestCode()
												  .equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
							finderArgs, resultDeclaration);
					}
				}

				return resultDeclaration;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
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
				return (ResultDeclaration)result;
			}
		}
	}

	/**
	 * Returns all the result declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @return the range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the result declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByDocumentNameAndDocumentYear(
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

		List<ResultDeclaration> list = (List<ResultDeclaration>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		List<ResultDeclaration> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		int count = countByDocumentNameAndDocumentYear(documentName,
				documentYear);

		List<ResultDeclaration> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result declarations before and after the current result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultDeclaration[] array = new ResultDeclarationImpl[3];

			array[0] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					resultDeclaration, documentName, documentYear,
					orderByComparator, true);

			array[1] = resultDeclaration;

			array[2] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					resultDeclaration, documentName, documentYear,
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

	protected ResultDeclaration getByDocumentNameAndDocumentYear_PrevAndNext(
		Session session, ResultDeclaration resultDeclaration,
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

		query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

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
			query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param businessTypeCode the business type code
	 * @return the matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		String requestCode, int businessTypeCode) throws SystemException {
		return findByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param businessTypeCode the business type code
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @return the range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		String requestCode, int businessTypeCode, int start, int end)
		throws SystemException {
		return findByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param businessTypeCode the business type code
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		String requestCode, int businessTypeCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODEANDBUSINESSTYPECODE;
			finderArgs = new Object[] { requestCode, businessTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODEANDBUSINESSTYPECODE;
			finderArgs = new Object[] {
					requestCode, businessTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<ResultDeclaration> list = (List<ResultDeclaration>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_2);
				}
			}

			query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_BUSINESSTYPECODE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
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

				qPos.add(businessTypeCode);

				list = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param businessTypeCode the business type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByRequestCodeAndBusinessTypeCode_First(
		String requestCode, int businessTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		List<ResultDeclaration> list = findByRequestCodeAndBusinessTypeCode(requestCode,
				businessTypeCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(", businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param businessTypeCode the business type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration findByRequestCodeAndBusinessTypeCode_Last(
		String requestCode, int businessTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		int count = countByRequestCodeAndBusinessTypeCode(requestCode,
				businessTypeCode);

		List<ResultDeclaration> list = findByRequestCodeAndBusinessTypeCode(requestCode,
				businessTypeCode, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(", businessTypeCode=");
			msg.append(businessTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchResultDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the result declarations before and after the current result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current result declaration
	 * @param requestCode the request code
	 * @param businessTypeCode the business type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result declaration
	 * @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ResultDeclaration[] findByRequestCodeAndBusinessTypeCode_PrevAndNext(
		long id, String requestCode, int businessTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultDeclaration[] array = new ResultDeclarationImpl[3];

			array[0] = getByRequestCodeAndBusinessTypeCode_PrevAndNext(session,
					resultDeclaration, requestCode, businessTypeCode,
					orderByComparator, true);

			array[1] = resultDeclaration;

			array[2] = getByRequestCodeAndBusinessTypeCode_PrevAndNext(session,
					resultDeclaration, requestCode, businessTypeCode,
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

	protected ResultDeclaration getByRequestCodeAndBusinessTypeCode_PrevAndNext(
		Session session, ResultDeclaration resultDeclaration,
		String requestCode, int businessTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTDECLARATION_WHERE);

		if (requestCode == null) {
			query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_1);
		}
		else {
			if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_2);
			}
		}

		query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_BUSINESSTYPECODE_2);

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
			query.append(ResultDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (requestCode != null) {
			qPos.add(requestCode);
		}

		qPos.add(businessTypeCode);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the result declarations.
	 *
	 * @return the result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @return the range of result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the result declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of result declarations
	 * @param end the upper bound of the range of result declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<ResultDeclaration> findAll(int start, int end,
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

		List<ResultDeclaration> list = (List<ResultDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESULTDECLARATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTDECLARATION.concat(ResultDeclarationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ResultDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ResultDeclaration>)QueryUtil.list(q,
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
	 * Removes the result declaration where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = findByRequestCode(requestCode);

		remove(resultDeclaration);
	}

	/**
	 * Removes all the result declarations where businessTypeCode = &#63; from the database.
	 *
	 * @param businessTypeCode the business type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByBusinessTypeCode(int businessTypeCode)
		throws SystemException {
		for (ResultDeclaration resultDeclaration : findByBusinessTypeCode(
				businessTypeCode)) {
			remove(resultDeclaration);
		}
	}

	/**
	 * Removes all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws SystemException {
		for (ResultDeclaration resultDeclaration : findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
				businessTypeCode, documentName, documentYear)) {
			remove(resultDeclaration);
		}
	}

	/**
	 * Removes all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; from the database.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode) throws SystemException {
		for (ResultDeclaration resultDeclaration : findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
				businessTypeCode, documentName, documentYear, requestCode)) {
			remove(resultDeclaration);
		}
	}

	/**
	 * Removes the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; from the database.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode)
		throws NoSuchResultDeclarationException, SystemException {
		ResultDeclaration resultDeclaration = findByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
				documentName, documentYear, requestCode);

		remove(resultDeclaration);
	}

	/**
	 * Removes all the result declarations where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (ResultDeclaration resultDeclaration : findByDocumentNameAndDocumentYear(
				documentName, documentYear)) {
			remove(resultDeclaration);
		}
	}

	/**
	 * Removes all the result declarations where requestCode = &#63; and businessTypeCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @param businessTypeCode the business type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCodeAndBusinessTypeCode(String requestCode,
		int businessTypeCode) throws SystemException {
		for (ResultDeclaration resultDeclaration : findByRequestCodeAndBusinessTypeCode(
				requestCode, businessTypeCode)) {
			remove(resultDeclaration);
		}
	}

	/**
	 * Removes all the result declarations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ResultDeclaration resultDeclaration : findAll()) {
			remove(resultDeclaration);
		}
	}

	/**
	 * Returns the number of result declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTDECLARATION_WHERE);

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
	 * Returns the number of result declarations where businessTypeCode = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @return the number of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByBusinessTypeCode(int businessTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { businessTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BUSINESSTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				businessTypeCode, documentName, documentYear
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_BUSINESSTYPECODE_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @return the number of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] {
				businessTypeCode, documentName, documentYear, requestCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_BUSINESSTYPECODE_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTYEAR_2);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_2);
				}
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	 *
	 * @param businessTypeCode the business type code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestCode the request code
	 * @return the number of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] {
				businessTypeCode, documentName, documentYear, requestCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_RESULTDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_BUSINESSTYPECODE_2);

			query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTYEAR_2);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_2);
				}
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTDECLARATION_WHERE);

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
	 * Returns the number of result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param businessTypeCode the business type code
	 * @return the number of matching result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCodeAndBusinessTypeCode(String requestCode,
		int businessTypeCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode, businessTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODEANDBUSINESSTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTDECLARATION_WHERE);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_2);
				}
			}

			query.append(_FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_BUSINESSTYPECODE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODEANDBUSINESSTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of result declarations.
	 *
	 * @return the number of result declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESULTDECLARATION);

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
	 * Initializes the result declaration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.result.model.ResultDeclaration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ResultDeclaration>> listenersList = new ArrayList<ModelListener<ResultDeclaration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ResultDeclaration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ResultDeclarationImpl.class.getName());
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
	private static final String _SQL_SELECT_RESULTDECLARATION = "SELECT resultDeclaration FROM ResultDeclaration resultDeclaration";
	private static final String _SQL_SELECT_RESULTDECLARATION_WHERE = "SELECT resultDeclaration FROM ResultDeclaration resultDeclaration WHERE ";
	private static final String _SQL_COUNT_RESULTDECLARATION = "SELECT COUNT(resultDeclaration) FROM ResultDeclaration resultDeclaration";
	private static final String _SQL_COUNT_RESULTDECLARATION_WHERE = "SELECT COUNT(resultDeclaration) FROM ResultDeclaration resultDeclaration WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "resultDeclaration.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "resultDeclaration.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(resultDeclaration.requestCode IS NULL OR resultDeclaration.requestCode = ?)";
	private static final String _FINDER_COLUMN_BUSINESSTYPECODE_BUSINESSTYPECODE_2 =
		"resultDeclaration.businessTypeCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_BUSINESSTYPECODE_2 =
		"resultDeclaration.businessTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"resultDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"resultDeclaration.documentYear = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_BUSINESSTYPECODE_2 =
		"resultDeclaration.businessTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTNAME_2 =
		"resultDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTYEAR_2 =
		"resultDeclaration.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_1 =
		"resultDeclaration.requestCode IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_2 =
		"resultDeclaration.requestCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_3 =
		"(resultDeclaration.requestCode IS NULL OR resultDeclaration.requestCode = ?)";
	private static final String _FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_BUSINESSTYPECODE_2 =
		"resultDeclaration.businessTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTNAME_2 =
		"resultDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_DOCUMENTYEAR_2 =
		"resultDeclaration.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_1 =
		"resultDeclaration.requestCode IS NULL";
	private static final String _FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_2 =
		"resultDeclaration.requestCode = ?";
	private static final String _FINDER_COLUMN_FNDDOCUMENTNAMEANDBUSINESSTYPECODEANDDOCUMENTYEARREQUESTCODE_REQUESTCODE_3 =
		"(resultDeclaration.requestCode IS NULL OR resultDeclaration.requestCode = ?)";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"resultDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"resultDeclaration.documentYear = ?";
	private static final String _FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_1 =
		"resultDeclaration.requestCode IS NULL AND ";
	private static final String _FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_2 =
		"resultDeclaration.requestCode = ? AND ";
	private static final String _FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_REQUESTCODE_3 =
		"(resultDeclaration.requestCode IS NULL OR resultDeclaration.requestCode = ?) AND ";
	private static final String _FINDER_COLUMN_REQUESTCODEANDBUSINESSTYPECODE_BUSINESSTYPECODE_2 =
		"resultDeclaration.businessTypeCode = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultDeclaration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResultDeclaration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ResultDeclaration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ResultDeclarationPersistenceImpl.class);
	private static ResultDeclaration _nullResultDeclaration = new ResultDeclarationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ResultDeclaration> toCacheModel() {
				return _nullResultDeclarationCacheModel;
			}
		};

	private static CacheModel<ResultDeclaration> _nullResultDeclarationCacheModel =
		new CacheModel<ResultDeclaration>() {
			public ResultDeclaration toEntityModel() {
				return _nullResultDeclaration;
			}
		};
}