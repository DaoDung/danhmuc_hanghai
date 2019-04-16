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

import vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceForTransitException;
import vn.gt.dao.noticeandmessage.model.IssueAcceptanceForTransit;
import vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceForTransitImpl;
import vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceForTransitModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the issue acceptance for transit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueAcceptanceForTransitPersistence
 * @see IssueAcceptanceForTransitUtil
 * @generated
 */
public class IssueAcceptanceForTransitPersistenceImpl
	extends BasePersistenceImpl<IssueAcceptanceForTransit>
	implements IssueAcceptanceForTransitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssueAcceptanceForTransitUtil} to access the issue acceptance for transit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssueAcceptanceForTransitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			IssueAcceptanceForTransitModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssueAcceptanceForTransitModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the issue acceptance for transit in the entity cache if it is enabled.
	 *
	 * @param issueAcceptanceForTransit the issue acceptance for transit
	 */
	public void cacheResult(IssueAcceptanceForTransit issueAcceptanceForTransit) {
		EntityCacheUtil.putResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			issueAcceptanceForTransit.getPrimaryKey(), issueAcceptanceForTransit);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
			new Object[] {
				Long.valueOf(issueAcceptanceForTransit.getDocumentName()),
				Integer.valueOf(issueAcceptanceForTransit.getDocumentYear())
			}, issueAcceptanceForTransit);

		issueAcceptanceForTransit.resetOriginalValues();
	}

	/**
	 * Caches the issue acceptance for transits in the entity cache if it is enabled.
	 *
	 * @param issueAcceptanceForTransits the issue acceptance for transits
	 */
	public void cacheResult(
		List<IssueAcceptanceForTransit> issueAcceptanceForTransits) {
		for (IssueAcceptanceForTransit issueAcceptanceForTransit : issueAcceptanceForTransits) {
			if (EntityCacheUtil.getResult(
						IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
						IssueAcceptanceForTransitImpl.class,
						issueAcceptanceForTransit.getPrimaryKey()) == null) {
				cacheResult(issueAcceptanceForTransit);
			}
			else {
				issueAcceptanceForTransit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue acceptance for transits.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssueAcceptanceForTransitImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssueAcceptanceForTransitImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue acceptance for transit.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssueAcceptanceForTransit issueAcceptanceForTransit) {
		EntityCacheUtil.removeResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			issueAcceptanceForTransit.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(issueAcceptanceForTransit);
	}

	@Override
	public void clearCache(
		List<IssueAcceptanceForTransit> issueAcceptanceForTransits) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssueAcceptanceForTransit issueAcceptanceForTransit : issueAcceptanceForTransits) {
			EntityCacheUtil.removeResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
				IssueAcceptanceForTransitImpl.class,
				issueAcceptanceForTransit.getPrimaryKey());

			clearUniqueFindersCache(issueAcceptanceForTransit);
		}
	}

	protected void clearUniqueFindersCache(
		IssueAcceptanceForTransit issueAcceptanceForTransit) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
			new Object[] {
				Long.valueOf(issueAcceptanceForTransit.getDocumentName()),
				Integer.valueOf(issueAcceptanceForTransit.getDocumentYear())
			});
	}

	/**
	 * Creates a new issue acceptance for transit with the primary key. Does not add the issue acceptance for transit to the database.
	 *
	 * @param id the primary key for the new issue acceptance for transit
	 * @return the new issue acceptance for transit
	 */
	public IssueAcceptanceForTransit create(long id) {
		IssueAcceptanceForTransit issueAcceptanceForTransit = new IssueAcceptanceForTransitImpl();

		issueAcceptanceForTransit.setNew(true);
		issueAcceptanceForTransit.setPrimaryKey(id);

		return issueAcceptanceForTransit;
	}

	/**
	 * Removes the issue acceptance for transit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptanceForTransit remove(long id)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the issue acceptance for transit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit remove(Serializable primaryKey)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssueAcceptanceForTransit issueAcceptanceForTransit = (IssueAcceptanceForTransit)session.get(IssueAcceptanceForTransitImpl.class,
					primaryKey);

			if (issueAcceptanceForTransit == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssueAcceptanceForTransitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issueAcceptanceForTransit);
		}
		catch (NoSuchIssueAcceptanceForTransitException nsee) {
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
	protected IssueAcceptanceForTransit removeImpl(
		IssueAcceptanceForTransit issueAcceptanceForTransit)
		throws SystemException {
		issueAcceptanceForTransit = toUnwrappedModel(issueAcceptanceForTransit);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, issueAcceptanceForTransit);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(issueAcceptanceForTransit);

		return issueAcceptanceForTransit;
	}

	@Override
	public IssueAcceptanceForTransit updateImpl(
		vn.gt.dao.noticeandmessage.model.IssueAcceptanceForTransit issueAcceptanceForTransit,
		boolean merge) throws SystemException {
		issueAcceptanceForTransit = toUnwrappedModel(issueAcceptanceForTransit);

		boolean isNew = issueAcceptanceForTransit.isNew();

		IssueAcceptanceForTransitModelImpl issueAcceptanceForTransitModelImpl = (IssueAcceptanceForTransitModelImpl)issueAcceptanceForTransit;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, issueAcceptanceForTransit, merge);

			issueAcceptanceForTransit.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!IssueAcceptanceForTransitModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceForTransitImpl.class,
			issueAcceptanceForTransit.getPrimaryKey(), issueAcceptanceForTransit);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
				new Object[] {
					Long.valueOf(issueAcceptanceForTransit.getDocumentName()),
					Integer.valueOf(issueAcceptanceForTransit.getDocumentYear())
				}, issueAcceptanceForTransit);
		}
		else {
			if ((issueAcceptanceForTransitModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issueAcceptanceForTransitModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issueAcceptanceForTransitModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					new Object[] {
						Long.valueOf(
							issueAcceptanceForTransit.getDocumentName()),
						Integer.valueOf(
							issueAcceptanceForTransit.getDocumentYear())
					}, issueAcceptanceForTransit);
			}
		}

		return issueAcceptanceForTransit;
	}

	protected IssueAcceptanceForTransit toUnwrappedModel(
		IssueAcceptanceForTransit issueAcceptanceForTransit) {
		if (issueAcceptanceForTransit instanceof IssueAcceptanceForTransitImpl) {
			return issueAcceptanceForTransit;
		}

		IssueAcceptanceForTransitImpl issueAcceptanceForTransitImpl = new IssueAcceptanceForTransitImpl();

		issueAcceptanceForTransitImpl.setNew(issueAcceptanceForTransit.isNew());
		issueAcceptanceForTransitImpl.setPrimaryKey(issueAcceptanceForTransit.getPrimaryKey());

		issueAcceptanceForTransitImpl.setId(issueAcceptanceForTransit.getId());
		issueAcceptanceForTransitImpl.setRequestCode(issueAcceptanceForTransit.getRequestCode());
		issueAcceptanceForTransitImpl.setNumberAcceptanceForTransit(issueAcceptanceForTransit.getNumberAcceptanceForTransit());
		issueAcceptanceForTransitImpl.setDocumentName(issueAcceptanceForTransit.getDocumentName());
		issueAcceptanceForTransitImpl.setDocumentYear(issueAcceptanceForTransit.getDocumentYear());
		issueAcceptanceForTransitImpl.setNameOfShip(issueAcceptanceForTransit.getNameOfShip());
		issueAcceptanceForTransitImpl.setFlagStateOfShip(issueAcceptanceForTransit.getFlagStateOfShip());
		issueAcceptanceForTransitImpl.setCallSign(issueAcceptanceForTransit.getCallSign());
		issueAcceptanceForTransitImpl.setNameOfMaster(issueAcceptanceForTransit.getNameOfMaster());
		issueAcceptanceForTransitImpl.setLoa(issueAcceptanceForTransit.getLoa());
		issueAcceptanceForTransitImpl.setUnitLOA(issueAcceptanceForTransit.getUnitLOA());
		issueAcceptanceForTransitImpl.setBreadth(issueAcceptanceForTransit.getBreadth());
		issueAcceptanceForTransitImpl.setUnitBreadth(issueAcceptanceForTransit.getUnitBreadth());
		issueAcceptanceForTransitImpl.setGrossTonnage(issueAcceptanceForTransit.getGrossTonnage());
		issueAcceptanceForTransitImpl.setGrossTonnageUnit(issueAcceptanceForTransit.getGrossTonnageUnit());
		issueAcceptanceForTransitImpl.setNetTonnage(issueAcceptanceForTransit.getNetTonnage());
		issueAcceptanceForTransitImpl.setNetTonnageUnit(issueAcceptanceForTransit.getNetTonnageUnit());
		issueAcceptanceForTransitImpl.setDwt(issueAcceptanceForTransit.getDwt());
		issueAcceptanceForTransitImpl.setUnitDWT(issueAcceptanceForTransit.getUnitDWT());
		issueAcceptanceForTransitImpl.setShownDraftxF(issueAcceptanceForTransit.getShownDraftxF());
		issueAcceptanceForTransitImpl.setUnitShownDraftxF(issueAcceptanceForTransit.getUnitShownDraftxF());
		issueAcceptanceForTransitImpl.setShownDraftxA(issueAcceptanceForTransit.getShownDraftxA());
		issueAcceptanceForTransitImpl.setUnitShownDraftxA(issueAcceptanceForTransit.getUnitShownDraftxA());
		issueAcceptanceForTransitImpl.setClearanceHeight(issueAcceptanceForTransit.getClearanceHeight());
		issueAcceptanceForTransitImpl.setUnitClearanceHeight(issueAcceptanceForTransit.getUnitClearanceHeight());
		issueAcceptanceForTransitImpl.setPermittedTransitFrom(issueAcceptanceForTransit.getPermittedTransitFrom());
		issueAcceptanceForTransitImpl.setPermittedTransitTo(issueAcceptanceForTransit.getPermittedTransitTo());
		issueAcceptanceForTransitImpl.setTimeOfDeparture(issueAcceptanceForTransit.getTimeOfDeparture());

		return issueAcceptanceForTransitImpl;
	}

	/**
	 * Returns the issue acceptance for transit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit
	 * @throws com.liferay.portal.NoSuchModelException if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the issue acceptance for transit with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceForTransitException} if it could not be found.
	 *
	 * @param id the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptanceForTransit findByPrimaryKey(long id)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		IssueAcceptanceForTransit issueAcceptanceForTransit = fetchByPrimaryKey(id);

		if (issueAcceptanceForTransit == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchIssueAcceptanceForTransitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return issueAcceptanceForTransit;
	}

	/**
	 * Returns the issue acceptance for transit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit, or <code>null</code> if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptanceForTransit fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the issue acceptance for transit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue acceptance for transit
	 * @return the issue acceptance for transit, or <code>null</code> if a issue acceptance for transit with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptanceForTransit fetchByPrimaryKey(long id)
		throws SystemException {
		IssueAcceptanceForTransit issueAcceptanceForTransit = (IssueAcceptanceForTransit)EntityCacheUtil.getResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
				IssueAcceptanceForTransitImpl.class, id);

		if (issueAcceptanceForTransit == _nullIssueAcceptanceForTransit) {
			return null;
		}

		if (issueAcceptanceForTransit == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				issueAcceptanceForTransit = (IssueAcceptanceForTransit)session.get(IssueAcceptanceForTransitImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (issueAcceptanceForTransit != null) {
					cacheResult(issueAcceptanceForTransit);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(IssueAcceptanceForTransitModelImpl.ENTITY_CACHE_ENABLED,
						IssueAcceptanceForTransitImpl.class, id,
						_nullIssueAcceptanceForTransit);
				}

				closeSession(session);
			}
		}

		return issueAcceptanceForTransit;
	}

	/**
	 * Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceForTransitException} if it could not be found.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue acceptance for transit
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceForTransitException if a matching issue acceptance for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptanceForTransit findByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		IssueAcceptanceForTransit issueAcceptanceForTransit = fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(documentName,
				documentYear);

		if (issueAcceptanceForTransit == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchIssueAcceptanceForTransitException(msg.toString());
		}

		return issueAcceptanceForTransit;
	}

	/**
	 * Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue acceptance for transit, or <code>null</code> if a matching issue acceptance for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptanceForTransit fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear, true);
	}

	/**
	 * Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching issue acceptance for transit, or <code>null</code> if a matching issue acceptance for transit could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptanceForTransit fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			query.append(IssueAcceptanceForTransitModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				List<IssueAcceptanceForTransit> list = q.list();

				result = list;

				IssueAcceptanceForTransit issueAcceptanceForTransit = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
						finderArgs, list);
				}
				else {
					issueAcceptanceForTransit = list.get(0);

					cacheResult(issueAcceptanceForTransit);

					if ((issueAcceptanceForTransit.getDocumentName() != documentName) ||
							(issueAcceptanceForTransit.getDocumentYear() != documentYear)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
							finderArgs, issueAcceptanceForTransit);
					}
				}

				return issueAcceptanceForTransit;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
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
				return (IssueAcceptanceForTransit)result;
			}
		}
	}

	/**
	 * Returns all the issue acceptance for transits.
	 *
	 * @return the issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptanceForTransit> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue acceptance for transits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue acceptance for transits
	 * @param end the upper bound of the range of issue acceptance for transits (not inclusive)
	 * @return the range of issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptanceForTransit> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue acceptance for transits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue acceptance for transits
	 * @param end the upper bound of the range of issue acceptance for transits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptanceForTransit> findAll(int start, int end,
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

		List<IssueAcceptanceForTransit> list = (List<IssueAcceptanceForTransit>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT.concat(IssueAcceptanceForTransitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<IssueAcceptanceForTransit>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<IssueAcceptanceForTransit>)QueryUtil.list(q,
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
	 * Removes the issue acceptance for transit where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws NoSuchIssueAcceptanceForTransitException, SystemException {
		IssueAcceptanceForTransit issueAcceptanceForTransit = findByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(documentName,
				documentYear);

		remove(issueAcceptanceForTransit);
	}

	/**
	 * Removes all the issue acceptance for transits from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (IssueAcceptanceForTransit issueAcceptanceForTransit : findAll()) {
			remove(issueAcceptanceForTransit);
		}
	}

	/**
	 * Returns the number of issue acceptance for transits where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUEACCEPTANCEFORTRANSIT_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of issue acceptance for transits.
	 *
	 * @return the number of issue acceptance for transits
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISSUEACCEPTANCEFORTRANSIT);

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
	 * Initializes the issue acceptance for transit persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.IssueAcceptanceForTransit")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssueAcceptanceForTransit>> listenersList = new ArrayList<ModelListener<IssueAcceptanceForTransit>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssueAcceptanceForTransit>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssueAcceptanceForTransitImpl.class.getName());
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
	private static final String _SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT = "SELECT issueAcceptanceForTransit FROM IssueAcceptanceForTransit issueAcceptanceForTransit";
	private static final String _SQL_SELECT_ISSUEACCEPTANCEFORTRANSIT_WHERE = "SELECT issueAcceptanceForTransit FROM IssueAcceptanceForTransit issueAcceptanceForTransit WHERE ";
	private static final String _SQL_COUNT_ISSUEACCEPTANCEFORTRANSIT = "SELECT COUNT(issueAcceptanceForTransit) FROM IssueAcceptanceForTransit issueAcceptanceForTransit";
	private static final String _SQL_COUNT_ISSUEACCEPTANCEFORTRANSIT_WHERE = "SELECT COUNT(issueAcceptanceForTransit) FROM IssueAcceptanceForTransit issueAcceptanceForTransit WHERE ";
	private static final String _FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"issueAcceptanceForTransit.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEACCEPTANCEFORTRANSITBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"issueAcceptanceForTransit.documentYear = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issueAcceptanceForTransit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssueAcceptanceForTransit exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssueAcceptanceForTransit exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssueAcceptanceForTransitPersistenceImpl.class);
	private static IssueAcceptanceForTransit _nullIssueAcceptanceForTransit = new IssueAcceptanceForTransitImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssueAcceptanceForTransit> toCacheModel() {
				return _nullIssueAcceptanceForTransitCacheModel;
			}
		};

	private static CacheModel<IssueAcceptanceForTransit> _nullIssueAcceptanceForTransitCacheModel =
		new CacheModel<IssueAcceptanceForTransit>() {
			public IssueAcceptanceForTransit toEntityModel() {
				return _nullIssueAcceptanceForTransit;
			}
		};
}