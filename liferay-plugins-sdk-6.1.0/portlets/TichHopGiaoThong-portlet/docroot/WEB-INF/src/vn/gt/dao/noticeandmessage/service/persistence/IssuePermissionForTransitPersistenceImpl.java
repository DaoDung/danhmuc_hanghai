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

import vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException;
import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit;
import vn.gt.dao.noticeandmessage.model.impl.IssuePermissionForTransitImpl;
import vn.gt.dao.noticeandmessage.model.impl.IssuePermissionForTransitModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the issue permission for transit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssuePermissionForTransitPersistence
 * @see IssuePermissionForTransitUtil
 * @generated
 */
public class IssuePermissionForTransitPersistenceImpl
	extends BasePersistenceImpl<IssuePermissionForTransit>
	implements IssuePermissionForTransitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssuePermissionForTransitUtil} to access the issue permission for transit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssuePermissionForTransitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			IssuePermissionForTransitModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePermissionForTransitModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssuePermissionForTransitByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			IssuePermissionForTransitModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePermissionForTransitModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			IssuePermissionForTransitModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByrequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByrequestCode",
			new String[] { String.class.getName() },
			IssuePermissionForTransitModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByrequestCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			IssuePermissionForTransitModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePermissionForTransitModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDocumentNameAndDocumentYearAndVersionNo",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			IssuePermissionForTransitModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePermissionForTransitModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			IssuePermissionForTransitModelImpl.VERSIONNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYearAndVersionNo",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_LAST_numberPortClearance",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_LAST_numberPortClearance",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			IssuePermissionForTransitModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePermissionForTransitModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			IssuePermissionForTransitModelImpl.NUMBERPERMISSIONFORTRANSIT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE =
		new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_LAST_numberPortClearance",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the issue permission for transit in the entity cache if it is enabled.
	 *
	 * @param issuePermissionForTransit the issue permission for transit
	 */
	public void cacheResult(IssuePermissionForTransit issuePermissionForTransit) {
		EntityCacheUtil.putResult(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			issuePermissionForTransit.getPrimaryKey(), issuePermissionForTransit);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
			new Object[] {
				Long.valueOf(issuePermissionForTransit.getDocumentName()),
				Integer.valueOf(issuePermissionForTransit.getDocumentYear()),
				Integer.valueOf(issuePermissionForTransit.getRequestState())
			}, issuePermissionForTransit);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
			new Object[] {
				Long.valueOf(issuePermissionForTransit.getDocumentName()),
				Integer.valueOf(issuePermissionForTransit.getDocumentYear()),
				
			issuePermissionForTransit.getVersionNo()
			}, issuePermissionForTransit);

		issuePermissionForTransit.resetOriginalValues();
	}

	/**
	 * Caches the issue permission for transits in the entity cache if it is enabled.
	 *
	 * @param issuePermissionForTransits the issue permission for transits
	 */
	public void cacheResult(
		List<IssuePermissionForTransit> issuePermissionForTransits) {
		for (IssuePermissionForTransit issuePermissionForTransit : issuePermissionForTransits) {
			if (EntityCacheUtil.getResult(
						IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
						IssuePermissionForTransitImpl.class,
						issuePermissionForTransit.getPrimaryKey()) == null) {
				cacheResult(issuePermissionForTransit);
			}
			else {
				issuePermissionForTransit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue permission for transits.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssuePermissionForTransitImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssuePermissionForTransitImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue permission for transit.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssuePermissionForTransit issuePermissionForTransit) {
		EntityCacheUtil.removeResult(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			issuePermissionForTransit.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(issuePermissionForTransit);
	}

	@Override
	public void clearCache(
		List<IssuePermissionForTransit> issuePermissionForTransits) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssuePermissionForTransit issuePermissionForTransit : issuePermissionForTransits) {
			EntityCacheUtil.removeResult(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
				IssuePermissionForTransitImpl.class,
				issuePermissionForTransit.getPrimaryKey());

			clearUniqueFindersCache(issuePermissionForTransit);
		}
	}

	protected void clearUniqueFindersCache(
		IssuePermissionForTransit issuePermissionForTransit) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
			new Object[] {
				Long.valueOf(issuePermissionForTransit.getDocumentName()),
				Integer.valueOf(issuePermissionForTransit.getDocumentYear()),
				Integer.valueOf(issuePermissionForTransit.getRequestState())
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
			new Object[] {
				Long.valueOf(issuePermissionForTransit.getDocumentName()),
				Integer.valueOf(issuePermissionForTransit.getDocumentYear()),
				
			issuePermissionForTransit.getVersionNo()
			});
	}

	/**
	 * Creates a new issue permission for transit with the primary key. Does not add the issue permission for transit to the database.
	 *
	 * @param id the primary key for the new issue permission for transit
	 * @return the new issue permission for transit
	 */
	public IssuePermissionForTransit create(long id) {
		IssuePermissionForTransit issuePermissionForTransit = new IssuePermissionForTransitImpl();

		issuePermissionForTransit.setNew(true);
		issuePermissionForTransit.setPrimaryKey(id);

		return issuePermissionForTransit;
	}

	/**
	 * Removes the issue permission for transit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue permission for transit
	 * @return the issue permission for transit that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit remove(long id)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the issue permission for transit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue permission for transit
	 * @return the issue permission for transit that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePermissionForTransit remove(Serializable primaryKey)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssuePermissionForTransit issuePermissionForTransit = (IssuePermissionForTransit)session.get(IssuePermissionForTransitImpl.class,
					primaryKey);

			if (issuePermissionForTransit == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssuePermissionForTransitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issuePermissionForTransit);
		}
		catch (NoSuchIssuePermissionForTransitException nsee) {
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
	protected IssuePermissionForTransit removeImpl(
		IssuePermissionForTransit issuePermissionForTransit)
		throws SystemException {
		issuePermissionForTransit = toUnwrappedModel(issuePermissionForTransit);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, issuePermissionForTransit);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(issuePermissionForTransit);

		return issuePermissionForTransit;
	}

	@Override
	public IssuePermissionForTransit updateImpl(
		vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit issuePermissionForTransit,
		boolean merge) throws SystemException {
		issuePermissionForTransit = toUnwrappedModel(issuePermissionForTransit);

		boolean isNew = issuePermissionForTransit.isNew();

		IssuePermissionForTransitModelImpl issuePermissionForTransitModelImpl = (IssuePermissionForTransitModelImpl)issuePermissionForTransit;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, issuePermissionForTransit, merge);

			issuePermissionForTransit.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!IssuePermissionForTransitModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((issuePermissionForTransitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(issuePermissionForTransitModelImpl.getDocumentName()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
			}

			if ((issuePermissionForTransitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issuePermissionForTransitModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						issuePermissionForTransitModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}

			if ((issuePermissionForTransitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(issuePermissionForTransitModelImpl.getDocumentName()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((issuePermissionForTransitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentYear()),
						
						issuePermissionForTransitModelImpl.getOriginalNumberPermissionForTransit()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE,
					args);

				args = new Object[] {
						Long.valueOf(issuePermissionForTransitModelImpl.getDocumentName()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getDocumentYear()),
						
						issuePermissionForTransitModelImpl.getNumberPermissionForTransit()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE,
					args);
			}
		}

		EntityCacheUtil.putResult(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssuePermissionForTransitImpl.class,
			issuePermissionForTransit.getPrimaryKey(), issuePermissionForTransit);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
				new Object[] {
					Long.valueOf(issuePermissionForTransit.getDocumentName()),
					Integer.valueOf(issuePermissionForTransit.getDocumentYear()),
					Integer.valueOf(issuePermissionForTransit.getRequestState())
				}, issuePermissionForTransit);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
				new Object[] {
					Long.valueOf(issuePermissionForTransit.getDocumentName()),
					Integer.valueOf(issuePermissionForTransit.getDocumentYear()),
					
				issuePermissionForTransit.getVersionNo()
				}, issuePermissionForTransit);
		}
		else {
			if ((issuePermissionForTransitModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentYear()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getOriginalRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					new Object[] {
						Long.valueOf(
							issuePermissionForTransit.getDocumentName()),
						Integer.valueOf(
							issuePermissionForTransit.getDocumentYear()),
						Integer.valueOf(
							issuePermissionForTransit.getRequestState())
					}, issuePermissionForTransit);
			}

			if ((issuePermissionForTransitModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issuePermissionForTransitModelImpl.getOriginalDocumentYear()),
						
						issuePermissionForTransitModelImpl.getOriginalVersionNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					new Object[] {
						Long.valueOf(
							issuePermissionForTransit.getDocumentName()),
						Integer.valueOf(
							issuePermissionForTransit.getDocumentYear()),
						
					issuePermissionForTransit.getVersionNo()
					}, issuePermissionForTransit);
			}
		}

		return issuePermissionForTransit;
	}

	protected IssuePermissionForTransit toUnwrappedModel(
		IssuePermissionForTransit issuePermissionForTransit) {
		if (issuePermissionForTransit instanceof IssuePermissionForTransitImpl) {
			return issuePermissionForTransit;
		}

		IssuePermissionForTransitImpl issuePermissionForTransitImpl = new IssuePermissionForTransitImpl();

		issuePermissionForTransitImpl.setNew(issuePermissionForTransit.isNew());
		issuePermissionForTransitImpl.setPrimaryKey(issuePermissionForTransit.getPrimaryKey());

		issuePermissionForTransitImpl.setId(issuePermissionForTransit.getId());
		issuePermissionForTransitImpl.setRequestCode(issuePermissionForTransit.getRequestCode());
		issuePermissionForTransitImpl.setNumberPermissionForTransit(issuePermissionForTransit.getNumberPermissionForTransit());
		issuePermissionForTransitImpl.setDocumentName(issuePermissionForTransit.getDocumentName());
		issuePermissionForTransitImpl.setDocumentYear(issuePermissionForTransit.getDocumentYear());
		issuePermissionForTransitImpl.setRequestState(issuePermissionForTransit.getRequestState());
		issuePermissionForTransitImpl.setPortofAuthority(issuePermissionForTransit.getPortofAuthority());
		issuePermissionForTransitImpl.setNameOfShip(issuePermissionForTransit.getNameOfShip());
		issuePermissionForTransitImpl.setFlagStateOfShip(issuePermissionForTransit.getFlagStateOfShip());
		issuePermissionForTransitImpl.setGt(issuePermissionForTransit.getGt());
		issuePermissionForTransitImpl.setNumberOfCrews(issuePermissionForTransit.getNumberOfCrews());
		issuePermissionForTransitImpl.setNumberOfPassengers(issuePermissionForTransit.getNumberOfPassengers());
		issuePermissionForTransitImpl.setCallSign(issuePermissionForTransit.getCallSign());
		issuePermissionForTransitImpl.setNameOfMaster(issuePermissionForTransit.getNameOfMaster());
		issuePermissionForTransitImpl.setTransitCargo(issuePermissionForTransit.getTransitCargo());
		issuePermissionForTransitImpl.setVolumeCargo(issuePermissionForTransit.getVolumeCargo());
		issuePermissionForTransitImpl.setCargoUnit(issuePermissionForTransit.getCargoUnit());
		issuePermissionForTransitImpl.setCargoDescription(issuePermissionForTransit.getCargoDescription());
		issuePermissionForTransitImpl.setPermittedTransitFrom(issuePermissionForTransit.getPermittedTransitFrom());
		issuePermissionForTransitImpl.setPermittedTransitTo(issuePermissionForTransit.getPermittedTransitTo());
		issuePermissionForTransitImpl.setTimeOfDeparture(issuePermissionForTransit.getTimeOfDeparture());
		issuePermissionForTransitImpl.setValidUntil(issuePermissionForTransit.getValidUntil());
		issuePermissionForTransitImpl.setDateOfSign(issuePermissionForTransit.getDateOfSign());
		issuePermissionForTransitImpl.setUserCreated(issuePermissionForTransit.getUserCreated());
		issuePermissionForTransitImpl.setDirectorOfMaritime(issuePermissionForTransit.getDirectorOfMaritime());
		issuePermissionForTransitImpl.setCreatedDate(issuePermissionForTransit.getCreatedDate());
		issuePermissionForTransitImpl.setCertificateNo(issuePermissionForTransit.getCertificateNo());
		issuePermissionForTransitImpl.setVersionNo(issuePermissionForTransit.getVersionNo());
		issuePermissionForTransitImpl.setIsApproval(issuePermissionForTransit.getIsApproval());
		issuePermissionForTransitImpl.setApprovalDate(issuePermissionForTransit.getApprovalDate());
		issuePermissionForTransitImpl.setApprovalName(issuePermissionForTransit.getApprovalName());
		issuePermissionForTransitImpl.setRemarks(issuePermissionForTransit.getRemarks());
		issuePermissionForTransitImpl.setIsCancel(issuePermissionForTransit.getIsCancel());
		issuePermissionForTransitImpl.setCancelDate(issuePermissionForTransit.getCancelDate());
		issuePermissionForTransitImpl.setCancelName(issuePermissionForTransit.getCancelName());
		issuePermissionForTransitImpl.setCancelNote(issuePermissionForTransit.getCancelNote());
		issuePermissionForTransitImpl.setRepresentative(issuePermissionForTransit.getRepresentative());
		issuePermissionForTransitImpl.setDigitalAttachedFile(issuePermissionForTransit.getDigitalAttachedFile());
		issuePermissionForTransitImpl.setSignDate(issuePermissionForTransit.getSignDate());
		issuePermissionForTransitImpl.setSignName(issuePermissionForTransit.getSignName());
		issuePermissionForTransitImpl.setSignTitle(issuePermissionForTransit.getSignTitle());
		issuePermissionForTransitImpl.setSignPlace(issuePermissionForTransit.getSignPlace());
		issuePermissionForTransitImpl.setStampStatus(issuePermissionForTransit.getStampStatus());
		issuePermissionForTransitImpl.setAttachedFile(issuePermissionForTransit.getAttachedFile());

		return issuePermissionForTransitImpl;
	}

	/**
	 * Returns the issue permission for transit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue permission for transit
	 * @return the issue permission for transit
	 * @throws com.liferay.portal.NoSuchModelException if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePermissionForTransit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the issue permission for transit with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException} if it could not be found.
	 *
	 * @param id the primary key of the issue permission for transit
	 * @return the issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByPrimaryKey(long id)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = fetchByPrimaryKey(id);

		if (issuePermissionForTransit == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchIssuePermissionForTransitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return issuePermissionForTransit;
	}

	/**
	 * Returns the issue permission for transit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue permission for transit
	 * @return the issue permission for transit, or <code>null</code> if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePermissionForTransit fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the issue permission for transit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue permission for transit
	 * @return the issue permission for transit, or <code>null</code> if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit fetchByPrimaryKey(long id)
		throws SystemException {
		IssuePermissionForTransit issuePermissionForTransit = (IssuePermissionForTransit)EntityCacheUtil.getResult(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
				IssuePermissionForTransitImpl.class, id);

		if (issuePermissionForTransit == _nullIssuePermissionForTransit) {
			return null;
		}

		if (issuePermissionForTransit == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				issuePermissionForTransit = (IssuePermissionForTransit)session.get(IssuePermissionForTransitImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (issuePermissionForTransit != null) {
					cacheResult(issuePermissionForTransit);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(IssuePermissionForTransitModelImpl.ENTITY_CACHE_ENABLED,
						IssuePermissionForTransitImpl.class, id,
						_nullIssuePermissionForTransit);
				}

				closeSession(session);
			}
		}

		return issuePermissionForTransit;
	}

	/**
	 * Returns all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @return the range of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<IssuePermissionForTransit> list = (List<IssuePermissionForTransit>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<IssuePermissionForTransit>)QueryUtil.list(q,
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
	 * Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		List<IssuePermissionForTransit> list = findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		int count = countByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
				documentYear);

		List<IssuePermissionForTransit> list = findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue permission for transit
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit[] findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePermissionForTransit[] array = new IssuePermissionForTransitImpl[3];

			array[0] = getByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_PrevAndNext(session,
					issuePermissionForTransit, documentName, documentYear,
					orderByComparator, true);

			array[1] = issuePermissionForTransit;

			array[2] = getByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_PrevAndNext(session,
					issuePermissionForTransit, documentName, documentYear,
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

	protected IssuePermissionForTransit getByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_PrevAndNext(
		Session session, IssuePermissionForTransit issuePermissionForTransit,
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

		query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

		query.append(_FINDER_COLUMN_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issuePermissionForTransit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePermissionForTransit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException} if it could not be found.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState);

		if (issuePermissionForTransit == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestState=");
			msg.append(requestState);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}

		return issuePermissionForTransit;
	}

	/**
	 * Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, true);
	}

	/**
	 * Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

			query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

				List<IssuePermissionForTransit> list = q.list();

				result = list;

				IssuePermissionForTransit issuePermissionForTransit = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
						finderArgs, list);
				}
				else {
					issuePermissionForTransit = list.get(0);

					cacheResult(issuePermissionForTransit);

					if ((issuePermissionForTransit.getDocumentName() != documentName) ||
							(issuePermissionForTransit.getDocumentYear() != documentYear) ||
							(issuePermissionForTransit.getRequestState() != requestState)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
							finderArgs, issuePermissionForTransit);
					}
				}

				return issuePermissionForTransit;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
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
				return (IssuePermissionForTransit)result;
			}
		}
	}

	/**
	 * Returns all the issue permission for transits where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByrequestCode(String requestCode)
		throws SystemException {
		return findByrequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue permission for transits where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @return the range of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByrequestCode(
		String requestCode, int start, int end) throws SystemException {
		return findByrequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue permission for transits where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByrequestCode(
		String requestCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<IssuePermissionForTransit> list = (List<IssuePermissionForTransit>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

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
				query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
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

				list = (List<IssuePermissionForTransit>)QueryUtil.list(q,
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
	 * Returns the first issue permission for transit in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByrequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		List<IssuePermissionForTransit> list = findByrequestCode(requestCode,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue permission for transit in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByrequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		int count = countByrequestCode(requestCode);

		List<IssuePermissionForTransit> list = findByrequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue permission for transit
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit[] findByrequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePermissionForTransit[] array = new IssuePermissionForTransitImpl[3];

			array[0] = getByrequestCode_PrevAndNext(session,
					issuePermissionForTransit, requestCode, orderByComparator,
					true);

			array[1] = issuePermissionForTransit;

			array[2] = getByrequestCode_PrevAndNext(session,
					issuePermissionForTransit, requestCode, orderByComparator,
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

	protected IssuePermissionForTransit getByrequestCode_PrevAndNext(
		Session session, IssuePermissionForTransit issuePermissionForTransit,
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

		query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

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
			query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(issuePermissionForTransit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePermissionForTransit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAndDocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @return the range of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAndDocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
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

		List<IssuePermissionForTransit> list = (List<IssuePermissionForTransit>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<IssuePermissionForTransit>)QueryUtil.list(q,
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
	 * Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findBydocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		List<IssuePermissionForTransit> list = findBydocumentNameAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findBydocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		int count = countBydocumentNameAndDocumentYear(documentName,
				documentYear);

		List<IssuePermissionForTransit> list = findBydocumentNameAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue permission for transit
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit[] findBydocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePermissionForTransit[] array = new IssuePermissionForTransitImpl[3];

			array[0] = getBydocumentNameAndDocumentYear_PrevAndNext(session,
					issuePermissionForTransit, documentName, documentYear,
					orderByComparator, true);

			array[1] = issuePermissionForTransit;

			array[2] = getBydocumentNameAndDocumentYear_PrevAndNext(session,
					issuePermissionForTransit, documentName, documentYear,
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

	protected IssuePermissionForTransit getBydocumentNameAndDocumentYear_PrevAndNext(
		Session session, IssuePermissionForTransit issuePermissionForTransit,
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

		query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

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
			query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issuePermissionForTransit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePermissionForTransit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException} if it could not be found.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @return the matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = fetchByDocumentNameAndDocumentYearAndVersionNo(documentName,
				documentYear, versionNo);

		if (issuePermissionForTransit == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", versionNo=");
			msg.append(versionNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}

		return issuePermissionForTransit;
	}

	/**
	 * Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit fetchByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo)
		throws SystemException {
		return fetchByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo, true);
	}

	/**
	 * Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit fetchByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear, versionNo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTYEAR_2);

			if (versionNo == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_1);
			}
			else {
				if (versionNo.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_2);
				}
			}

			query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (versionNo != null) {
					qPos.add(versionNo);
				}

				List<IssuePermissionForTransit> list = q.list();

				result = list;

				IssuePermissionForTransit issuePermissionForTransit = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
						finderArgs, list);
				}
				else {
					issuePermissionForTransit = list.get(0);

					cacheResult(issuePermissionForTransit);

					if ((issuePermissionForTransit.getDocumentName() != documentName) ||
							(issuePermissionForTransit.getDocumentYear() != documentYear) ||
							(issuePermissionForTransit.getVersionNo() == null) ||
							!issuePermissionForTransit.getVersionNo()
														  .equals(versionNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
							finderArgs, issuePermissionForTransit);
					}
				}

				return issuePermissionForTransit;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
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
				return (IssuePermissionForTransit)result;
			}
		}
	}

	/**
	 * Returns all the issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param numberPermissionForTransit the number permission for transit
	 * @return the matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByF_LAST_numberPortClearance(
		long documentName, int documentYear, String numberPermissionForTransit)
		throws SystemException {
		return findByF_LAST_numberPortClearance(documentName, documentYear,
			numberPermissionForTransit, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param numberPermissionForTransit the number permission for transit
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @return the range of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByF_LAST_numberPortClearance(
		long documentName, int documentYear, String numberPermissionForTransit,
		int start, int end) throws SystemException {
		return findByF_LAST_numberPortClearance(documentName, documentYear,
			numberPermissionForTransit, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param numberPermissionForTransit the number permission for transit
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findByF_LAST_numberPortClearance(
		long documentName, int documentYear, String numberPermissionForTransit,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE;
			finderArgs = new Object[] {
					documentName, documentYear, numberPermissionForTransit
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE;
			finderArgs = new Object[] {
					documentName, documentYear, numberPermissionForTransit,
					
					start, end, orderByComparator
				};
		}

		List<IssuePermissionForTransit> list = (List<IssuePermissionForTransit>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_DOCUMENTYEAR_2);

			if (numberPermissionForTransit == null) {
				query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_1);
			}
			else {
				if (numberPermissionForTransit.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (numberPermissionForTransit != null) {
					qPos.add(numberPermissionForTransit);
				}

				list = (List<IssuePermissionForTransit>)QueryUtil.list(q,
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
	 * Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param numberPermissionForTransit the number permission for transit
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByF_LAST_numberPortClearance_First(
		long documentName, int documentYear, String numberPermissionForTransit,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		List<IssuePermissionForTransit> list = findByF_LAST_numberPortClearance(documentName,
				documentYear, numberPermissionForTransit, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", numberPermissionForTransit=");
			msg.append(numberPermissionForTransit);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param numberPermissionForTransit the number permission for transit
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit findByF_LAST_numberPortClearance_Last(
		long documentName, int documentYear, String numberPermissionForTransit,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		int count = countByF_LAST_numberPortClearance(documentName,
				documentYear, numberPermissionForTransit);

		List<IssuePermissionForTransit> list = findByF_LAST_numberPortClearance(documentName,
				documentYear, numberPermissionForTransit, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", numberPermissionForTransit=");
			msg.append(numberPermissionForTransit);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePermissionForTransitException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue permission for transit
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param numberPermissionForTransit the number permission for transit
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue permission for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePermissionForTransit[] findByF_LAST_numberPortClearance_PrevAndNext(
		long id, long documentName, int documentYear,
		String numberPermissionForTransit, OrderByComparator orderByComparator)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePermissionForTransit[] array = new IssuePermissionForTransitImpl[3];

			array[0] = getByF_LAST_numberPortClearance_PrevAndNext(session,
					issuePermissionForTransit, documentName, documentYear,
					numberPermissionForTransit, orderByComparator, true);

			array[1] = issuePermissionForTransit;

			array[2] = getByF_LAST_numberPortClearance_PrevAndNext(session,
					issuePermissionForTransit, documentName, documentYear,
					numberPermissionForTransit, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssuePermissionForTransit getByF_LAST_numberPortClearance_PrevAndNext(
		Session session, IssuePermissionForTransit issuePermissionForTransit,
		long documentName, int documentYear, String numberPermissionForTransit,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE);

		query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_DOCUMENTYEAR_2);

		if (numberPermissionForTransit == null) {
			query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_1);
		}
		else {
			if (numberPermissionForTransit.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_3);
			}
			else {
				query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_2);
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
			query.append(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (numberPermissionForTransit != null) {
			qPos.add(numberPermissionForTransit);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issuePermissionForTransit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePermissionForTransit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the issue permission for transits.
	 *
	 * @return the issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue permission for transits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @return the range of issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue permission for transits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue permission for transits
	 * @param end the upper bound of the range of issue permission for transits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePermissionForTransit> findAll(int start, int end,
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

		List<IssuePermissionForTransit> list = (List<IssuePermissionForTransit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUEPERMISSIONFORTRANSIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUEPERMISSIONFORTRANSIT.concat(IssuePermissionForTransitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<IssuePermissionForTransit>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<IssuePermissionForTransit>)QueryUtil.list(q,
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
	 * Removes all the issue permission for transits where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		for (IssuePermissionForTransit issuePermissionForTransit : findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
				documentName, documentYear)) {
			remove(issuePermissionForTransit);
		}
	}

	/**
	 * Removes the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = findByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState);

		remove(issuePermissionForTransit);
	}

	/**
	 * Removes all the issue permission for transits where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByrequestCode(String requestCode)
		throws SystemException {
		for (IssuePermissionForTransit issuePermissionForTransit : findByrequestCode(
				requestCode)) {
			remove(issuePermissionForTransit);
		}
	}

	/**
	 * Removes all the issue permission for transits where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBydocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (IssuePermissionForTransit issuePermissionForTransit : findBydocumentNameAndDocumentYear(
				documentName, documentYear)) {
			remove(issuePermissionForTransit);
		}
	}

	/**
	 * Removes the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo)
		throws NoSuchIssuePermissionForTransitException, SystemException {
		IssuePermissionForTransit issuePermissionForTransit = findByDocumentNameAndDocumentYearAndVersionNo(documentName,
				documentYear, versionNo);

		remove(issuePermissionForTransit);
	}

	/**
	 * Removes all the issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param numberPermissionForTransit the number permission for transit
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_LAST_numberPortClearance(long documentName,
		int documentYear, String numberPermissionForTransit)
		throws SystemException {
		for (IssuePermissionForTransit issuePermissionForTransit : findByF_LAST_numberPortClearance(
				documentName, documentYear, numberPermissionForTransit)) {
			remove(issuePermissionForTransit);
		}
	}

	/**
	 * Removes all the issue permission for transits from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (IssuePermissionForTransit issuePermissionForTransit : findAll()) {
			remove(issuePermissionForTransit);
		}
	}

	/**
	 * Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of issue permission for transits where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countByrequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUEPERMISSIONFORTRANSIT_WHERE);

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
	 * Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countBydocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUEPERMISSIONFORTRANSIT_WHERE);

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
	 * Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @return the number of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo)
		throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear, versionNo };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTYEAR_2);

			if (versionNo == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_1);
			}
			else {
				if (versionNo.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_2);
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

				if (versionNo != null) {
					qPos.add(versionNo);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param numberPermissionForTransit the number permission for transit
	 * @return the number of matching issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_LAST_numberPortClearance(long documentName,
		int documentYear, String numberPermissionForTransit)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, numberPermissionForTransit
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUEPERMISSIONFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_DOCUMENTYEAR_2);

			if (numberPermissionForTransit == null) {
				query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_1);
			}
			else {
				if (numberPermissionForTransit.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_2);
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

				if (numberPermissionForTransit != null) {
					qPos.add(numberPermissionForTransit);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of issue permission for transits.
	 *
	 * @return the number of issue permission for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISSUEPERMISSIONFORTRANSIT);

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
	 * Initializes the issue permission for transit persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssuePermissionForTransit>> listenersList = new ArrayList<ModelListener<IssuePermissionForTransit>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssuePermissionForTransit>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssuePermissionForTransitImpl.class.getName());
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
	private static final String _SQL_SELECT_ISSUEPERMISSIONFORTRANSIT = "SELECT issuePermissionForTransit FROM IssuePermissionForTransit issuePermissionForTransit";
	private static final String _SQL_SELECT_ISSUEPERMISSIONFORTRANSIT_WHERE = "SELECT issuePermissionForTransit FROM IssuePermissionForTransit issuePermissionForTransit WHERE ";
	private static final String _SQL_COUNT_ISSUEPERMISSIONFORTRANSIT = "SELECT COUNT(issuePermissionForTransit) FROM IssuePermissionForTransit issuePermissionForTransit";
	private static final String _SQL_COUNT_ISSUEPERMISSIONFORTRANSIT_WHERE = "SELECT COUNT(issuePermissionForTransit) FROM IssuePermissionForTransit issuePermissionForTransit WHERE ";
	private static final String _FINDER_COLUMN_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"issuePermissionForTransit.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"issuePermissionForTransit.documentYear = ?";
	private static final String _FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2 =
		"issuePermissionForTransit.documentName = ? AND ";
	private static final String _FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2 =
		"issuePermissionForTransit.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_ISSUEPERMISSIONFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2 =
		"issuePermissionForTransit.requestState = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "issuePermissionForTransit.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "issuePermissionForTransit.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(issuePermissionForTransit.requestCode IS NULL OR issuePermissionForTransit.requestCode = ?)";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"issuePermissionForTransit.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"issuePermissionForTransit.documentYear = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTNAME_2 =
		"issuePermissionForTransit.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTYEAR_2 =
		"issuePermissionForTransit.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_1 =
		"issuePermissionForTransit.versionNo IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_2 =
		"issuePermissionForTransit.versionNo = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_3 =
		"(issuePermissionForTransit.versionNo IS NULL OR issuePermissionForTransit.versionNo = ?)";
	private static final String _FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_DOCUMENTNAME_2 =
		"issuePermissionForTransit.documentName = ? AND ";
	private static final String _FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_DOCUMENTYEAR_2 =
		"issuePermissionForTransit.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_1 =
		"issuePermissionForTransit.numberPermissionForTransit IS NULL";
	private static final String _FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_2 =
		"issuePermissionForTransit.numberPermissionForTransit = ?";
	private static final String _FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPERMISSIONFORTRANSIT_3 =
		"(issuePermissionForTransit.numberPermissionForTransit IS NULL OR issuePermissionForTransit.numberPermissionForTransit = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issuePermissionForTransit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssuePermissionForTransit exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssuePermissionForTransit exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssuePermissionForTransitPersistenceImpl.class);
	private static IssuePermissionForTransit _nullIssuePermissionForTransit = new IssuePermissionForTransitImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssuePermissionForTransit> toCacheModel() {
				return _nullIssuePermissionForTransitCacheModel;
			}
		};

	private static CacheModel<IssuePermissionForTransit> _nullIssuePermissionForTransitCacheModel =
		new CacheModel<IssuePermissionForTransit>() {
			public IssuePermissionForTransit toEntityModel() {
				return _nullIssuePermissionForTransit;
			}
		};
}