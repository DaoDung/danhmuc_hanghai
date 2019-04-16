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

import vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException;
import vn.gt.dao.noticeandmessage.model.IssueAcceptance;
import vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceImpl;
import vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the issue acceptance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueAcceptancePersistence
 * @see IssueAcceptanceUtil
 * @generated
 */
public class IssueAcceptancePersistenceImpl extends BasePersistenceImpl<IssueAcceptance>
	implements IssueAcceptancePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssueAcceptanceUtil} to access the issue acceptance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssueAcceptanceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			IssueAcceptanceModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssueAcceptanceModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			IssueAcceptanceModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssueAcceptanceModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			IssueAcceptanceModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			IssueAcceptanceModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED,
			IssueAcceptanceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the issue acceptance in the entity cache if it is enabled.
	 *
	 * @param issueAcceptance the issue acceptance
	 */
	public void cacheResult(IssueAcceptance issueAcceptance) {
		EntityCacheUtil.putResult(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceImpl.class, issueAcceptance.getPrimaryKey(),
			issueAcceptance);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { issueAcceptance.getRequestCode() }, issueAcceptance);

		issueAcceptance.resetOriginalValues();
	}

	/**
	 * Caches the issue acceptances in the entity cache if it is enabled.
	 *
	 * @param issueAcceptances the issue acceptances
	 */
	public void cacheResult(List<IssueAcceptance> issueAcceptances) {
		for (IssueAcceptance issueAcceptance : issueAcceptances) {
			if (EntityCacheUtil.getResult(
						IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
						IssueAcceptanceImpl.class,
						issueAcceptance.getPrimaryKey()) == null) {
				cacheResult(issueAcceptance);
			}
			else {
				issueAcceptance.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue acceptances.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssueAcceptanceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssueAcceptanceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue acceptance.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssueAcceptance issueAcceptance) {
		EntityCacheUtil.removeResult(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceImpl.class, issueAcceptance.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(issueAcceptance);
	}

	@Override
	public void clearCache(List<IssueAcceptance> issueAcceptances) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssueAcceptance issueAcceptance : issueAcceptances) {
			EntityCacheUtil.removeResult(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
				IssueAcceptanceImpl.class, issueAcceptance.getPrimaryKey());

			clearUniqueFindersCache(issueAcceptance);
		}
	}

	protected void clearUniqueFindersCache(IssueAcceptance issueAcceptance) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { issueAcceptance.getRequestCode() });
	}

	/**
	 * Creates a new issue acceptance with the primary key. Does not add the issue acceptance to the database.
	 *
	 * @param id the primary key for the new issue acceptance
	 * @return the new issue acceptance
	 */
	public IssueAcceptance create(long id) {
		IssueAcceptance issueAcceptance = new IssueAcceptanceImpl();

		issueAcceptance.setNew(true);
		issueAcceptance.setPrimaryKey(id);

		return issueAcceptance;
	}

	/**
	 * Removes the issue acceptance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue acceptance
	 * @return the issue acceptance that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a issue acceptance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance remove(long id)
		throws NoSuchIssueAcceptanceException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the issue acceptance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue acceptance
	 * @return the issue acceptance that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a issue acceptance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptance remove(Serializable primaryKey)
		throws NoSuchIssueAcceptanceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssueAcceptance issueAcceptance = (IssueAcceptance)session.get(IssueAcceptanceImpl.class,
					primaryKey);

			if (issueAcceptance == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssueAcceptanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issueAcceptance);
		}
		catch (NoSuchIssueAcceptanceException nsee) {
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
	protected IssueAcceptance removeImpl(IssueAcceptance issueAcceptance)
		throws SystemException {
		issueAcceptance = toUnwrappedModel(issueAcceptance);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, issueAcceptance);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(issueAcceptance);

		return issueAcceptance;
	}

	@Override
	public IssueAcceptance updateImpl(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance,
		boolean merge) throws SystemException {
		issueAcceptance = toUnwrappedModel(issueAcceptance);

		boolean isNew = issueAcceptance.isNew();

		IssueAcceptanceModelImpl issueAcceptanceModelImpl = (IssueAcceptanceModelImpl)issueAcceptance;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, issueAcceptance, merge);

			issueAcceptance.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IssueAcceptanceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((issueAcceptanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issueAcceptanceModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issueAcceptanceModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(issueAcceptanceModelImpl.getDocumentName()),
						Integer.valueOf(issueAcceptanceModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
			}

			if ((issueAcceptanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issueAcceptanceModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issueAcceptanceModelImpl.getOriginalDocumentYear()),
						Integer.valueOf(issueAcceptanceModelImpl.getOriginalRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);

				args = new Object[] {
						Long.valueOf(issueAcceptanceModelImpl.getDocumentName()),
						Integer.valueOf(issueAcceptanceModelImpl.getDocumentYear()),
						Integer.valueOf(issueAcceptanceModelImpl.getRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
			}
		}

		EntityCacheUtil.putResult(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
			IssueAcceptanceImpl.class, issueAcceptance.getPrimaryKey(),
			issueAcceptance);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
				new Object[] { issueAcceptance.getRequestCode() },
				issueAcceptance);
		}
		else {
			if ((issueAcceptanceModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueAcceptanceModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					new Object[] { issueAcceptance.getRequestCode() },
					issueAcceptance);
			}
		}

		return issueAcceptance;
	}

	protected IssueAcceptance toUnwrappedModel(IssueAcceptance issueAcceptance) {
		if (issueAcceptance instanceof IssueAcceptanceImpl) {
			return issueAcceptance;
		}

		IssueAcceptanceImpl issueAcceptanceImpl = new IssueAcceptanceImpl();

		issueAcceptanceImpl.setNew(issueAcceptance.isNew());
		issueAcceptanceImpl.setPrimaryKey(issueAcceptance.getPrimaryKey());

		issueAcceptanceImpl.setId(issueAcceptance.getId());
		issueAcceptanceImpl.setRequestCode(issueAcceptance.getRequestCode());
		issueAcceptanceImpl.setNumberPortClearance(issueAcceptance.getNumberPortClearance());
		issueAcceptanceImpl.setDocumentName(issueAcceptance.getDocumentName());
		issueAcceptanceImpl.setDocumentYear(issueAcceptance.getDocumentYear());
		issueAcceptanceImpl.setPortofAuthority(issueAcceptance.getPortofAuthority());
		issueAcceptanceImpl.setNameOfShip(issueAcceptance.getNameOfShip());
		issueAcceptanceImpl.setFlagStateOfShip(issueAcceptance.getFlagStateOfShip());
		issueAcceptanceImpl.setNumberOfCrews(issueAcceptance.getNumberOfCrews());
		issueAcceptanceImpl.setNumberOfPassengers(issueAcceptance.getNumberOfPassengers());
		issueAcceptanceImpl.setCallSign(issueAcceptance.getCallSign());
		issueAcceptanceImpl.setNameOfMaster(issueAcceptance.getNameOfMaster());
		issueAcceptanceImpl.setCargo(issueAcceptance.getCargo());
		issueAcceptanceImpl.setVolumeCargo(issueAcceptance.getVolumeCargo());
		issueAcceptanceImpl.setCargoUnit(issueAcceptance.getCargoUnit());
		issueAcceptanceImpl.setCargoDescription(issueAcceptance.getCargoDescription());
		issueAcceptanceImpl.setTransitCargo(issueAcceptance.getTransitCargo());
		issueAcceptanceImpl.setVolumeTransitCargo(issueAcceptance.getVolumeTransitCargo());
		issueAcceptanceImpl.setTransitCargoUnit(issueAcceptance.getTransitCargoUnit());
		issueAcceptanceImpl.setTimeOfDeparture(issueAcceptance.getTimeOfDeparture());
		issueAcceptanceImpl.setPortCode(issueAcceptance.getPortCode());
		issueAcceptanceImpl.setPortWharfCode(issueAcceptance.getPortWharfCode());
		issueAcceptanceImpl.setPortHarbourCode(issueAcceptance.getPortHarbourCode());
		issueAcceptanceImpl.setNextPortOfCallCode(issueAcceptance.getNextPortOfCallCode());
		issueAcceptanceImpl.setValidUntil(issueAcceptance.getValidUntil());
		issueAcceptanceImpl.setIssueDate(issueAcceptance.getIssueDate());
		issueAcceptanceImpl.setDirectorOfMaritime(issueAcceptance.getDirectorOfMaritime());
		issueAcceptanceImpl.setCertificateNo(issueAcceptance.getCertificateNo());
		issueAcceptanceImpl.setRequestState(issueAcceptance.getRequestState());
		issueAcceptanceImpl.setGt(issueAcceptance.getGt());
		issueAcceptanceImpl.setDwt(issueAcceptance.getDwt());
		issueAcceptanceImpl.setVersionNo(issueAcceptance.getVersionNo());
		issueAcceptanceImpl.setIsApproval(issueAcceptance.getIsApproval());
		issueAcceptanceImpl.setApprovalDate(issueAcceptance.getApprovalDate());
		issueAcceptanceImpl.setApprovalName(issueAcceptance.getApprovalName());
		issueAcceptanceImpl.setRemarks(issueAcceptance.getRemarks());
		issueAcceptanceImpl.setIsCancel(issueAcceptance.getIsCancel());
		issueAcceptanceImpl.setCancelDate(issueAcceptance.getCancelDate());
		issueAcceptanceImpl.setCancelName(issueAcceptance.getCancelName());
		issueAcceptanceImpl.setCancelNote(issueAcceptance.getCancelNote());
		issueAcceptanceImpl.setRepresentative(issueAcceptance.getRepresentative());
		issueAcceptanceImpl.setSignDate(issueAcceptance.getSignDate());
		issueAcceptanceImpl.setSignName(issueAcceptance.getSignName());
		issueAcceptanceImpl.setSignTitle(issueAcceptance.getSignTitle());
		issueAcceptanceImpl.setSignPlace(issueAcceptance.getSignPlace());
		issueAcceptanceImpl.setStampStatus(issueAcceptance.getStampStatus());
		issueAcceptanceImpl.setAttachedFile(issueAcceptance.getAttachedFile());

		return issueAcceptanceImpl;
	}

	/**
	 * Returns the issue acceptance with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue acceptance
	 * @return the issue acceptance
	 * @throws com.liferay.portal.NoSuchModelException if a issue acceptance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the issue acceptance with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException} if it could not be found.
	 *
	 * @param id the primary key of the issue acceptance
	 * @return the issue acceptance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a issue acceptance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance findByPrimaryKey(long id)
		throws NoSuchIssueAcceptanceException, SystemException {
		IssueAcceptance issueAcceptance = fetchByPrimaryKey(id);

		if (issueAcceptance == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchIssueAcceptanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return issueAcceptance;
	}

	/**
	 * Returns the issue acceptance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue acceptance
	 * @return the issue acceptance, or <code>null</code> if a issue acceptance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueAcceptance fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the issue acceptance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue acceptance
	 * @return the issue acceptance, or <code>null</code> if a issue acceptance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance fetchByPrimaryKey(long id) throws SystemException {
		IssueAcceptance issueAcceptance = (IssueAcceptance)EntityCacheUtil.getResult(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
				IssueAcceptanceImpl.class, id);

		if (issueAcceptance == _nullIssueAcceptance) {
			return null;
		}

		if (issueAcceptance == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				issueAcceptance = (IssueAcceptance)session.get(IssueAcceptanceImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (issueAcceptance != null) {
					cacheResult(issueAcceptance);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(IssueAcceptanceModelImpl.ENTITY_CACHE_ENABLED,
						IssueAcceptanceImpl.class, id, _nullIssueAcceptance);
				}

				closeSession(session);
			}
		}

		return issueAcceptance;
	}

	/**
	 * Returns all the issue acceptances where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue acceptances where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue acceptances
	 * @param end the upper bound of the range of issue acceptances (not inclusive)
	 * @return the range of matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue acceptances where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue acceptances
	 * @param end the upper bound of the range of issue acceptances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<IssueAcceptance> list = (List<IssueAcceptance>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEACCEPTANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssueAcceptanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<IssueAcceptance>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first issue acceptance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue acceptance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a matching issue acceptance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance findByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssueAcceptanceException, SystemException {
		List<IssueAcceptance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueAcceptanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue acceptance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue acceptance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a matching issue acceptance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance findByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssueAcceptanceException, SystemException {
		int count = countByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear);

		List<IssueAcceptance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueAcceptanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue acceptances before and after the current issue acceptance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue acceptance
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue acceptance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a issue acceptance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance[] findByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchIssueAcceptanceException, SystemException {
		IssueAcceptance issueAcceptance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueAcceptance[] array = new IssueAcceptanceImpl[3];

			array[0] = getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(session,
					issueAcceptance, documentName, documentYear,
					orderByComparator, true);

			array[1] = issueAcceptance;

			array[2] = getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(session,
					issueAcceptance, documentName, documentYear,
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

	protected IssueAcceptance getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(
		Session session, IssueAcceptance issueAcceptance, long documentName,
		int documentYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUEACCEPTANCE_WHERE);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(IssueAcceptanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueAcceptance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueAcceptance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the issue acceptances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the issue acceptances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of issue acceptances
	 * @param end the upper bound of the range of issue acceptances (not inclusive)
	 * @return the range of matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue acceptances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of issue acceptances
	 * @param end the upper bound of the range of issue acceptances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE;
			finderArgs = new Object[] { documentName, documentYear, requestState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE;
			finderArgs = new Object[] {
					documentName, documentYear, requestState,
					
					start, end, orderByComparator
				};
		}

		List<IssueAcceptance> list = (List<IssueAcceptance>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEACCEPTANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssueAcceptanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

				list = (List<IssueAcceptance>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first issue acceptance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue acceptance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a matching issue acceptance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssueAcceptanceException, SystemException {
		List<IssueAcceptance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestState=");
			msg.append(requestState);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueAcceptanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue acceptance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue acceptance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a matching issue acceptance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssueAcceptanceException, SystemException {
		int count = countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState);

		List<IssueAcceptance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestState=");
			msg.append(requestState);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueAcceptanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue acceptances before and after the current issue acceptance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue acceptance
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue acceptance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a issue acceptance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance[] findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssueAcceptanceException, SystemException {
		IssueAcceptance issueAcceptance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueAcceptance[] array = new IssueAcceptanceImpl[3];

			array[0] = getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(session,
					issueAcceptance, documentName, documentYear, requestState,
					orderByComparator, true);

			array[1] = issueAcceptance;

			array[2] = getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(session,
					issueAcceptance, documentName, documentYear, requestState,
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

	protected IssueAcceptance getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		Session session, IssueAcceptance issueAcceptance, long documentName,
		int documentYear, int requestState,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUEACCEPTANCE_WHERE);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

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
			query.append(IssueAcceptanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		qPos.add(requestState);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueAcceptance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueAcceptance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the issue acceptance where requestCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching issue acceptance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueAcceptanceException if a matching issue acceptance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance findByRequestCode(String requestCode)
		throws NoSuchIssueAcceptanceException, SystemException {
		IssueAcceptance issueAcceptance = fetchByRequestCode(requestCode);

		if (issueAcceptance == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchIssueAcceptanceException(msg.toString());
		}

		return issueAcceptance;
	}

	/**
	 * Returns the issue acceptance where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching issue acceptance, or <code>null</code> if a matching issue acceptance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the issue acceptance where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching issue acceptance, or <code>null</code> if a matching issue acceptance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueAcceptance fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ISSUEACCEPTANCE_WHERE);

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

			query.append(IssueAcceptanceModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				List<IssueAcceptance> list = q.list();

				result = list;

				IssueAcceptance issueAcceptance = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					issueAcceptance = list.get(0);

					cacheResult(issueAcceptance);

					if ((issueAcceptance.getRequestCode() == null) ||
							!issueAcceptance.getRequestCode().equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, issueAcceptance);
					}
				}

				return issueAcceptance;
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
				return (IssueAcceptance)result;
			}
		}
	}

	/**
	 * Returns all the issue acceptances.
	 *
	 * @return the issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue acceptances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue acceptances
	 * @param end the upper bound of the range of issue acceptances (not inclusive)
	 * @return the range of issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue acceptances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue acceptances
	 * @param end the upper bound of the range of issue acceptances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueAcceptance> findAll(int start, int end,
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

		List<IssueAcceptance> list = (List<IssueAcceptance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUEACCEPTANCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUEACCEPTANCE.concat(IssueAcceptanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<IssueAcceptance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<IssueAcceptance>)QueryUtil.list(q,
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
	 * Removes all the issue acceptances where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		for (IssueAcceptance issueAcceptance : findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
				documentName, documentYear)) {
			remove(issueAcceptance);
		}
	}

	/**
	 * Removes all the issue acceptances where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (IssueAcceptance issueAcceptance : findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
				documentName, documentYear, requestState)) {
			remove(issueAcceptance);
		}
	}

	/**
	 * Removes the issue acceptance where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws NoSuchIssueAcceptanceException, SystemException {
		IssueAcceptance issueAcceptance = findByRequestCode(requestCode);

		remove(issueAcceptance);
	}

	/**
	 * Removes all the issue acceptances from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (IssueAcceptance issueAcceptance : findAll()) {
			remove(issueAcceptance);
		}
	}

	/**
	 * Returns the number of issue acceptances where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUEACCEPTANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of issue acceptances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUEACCEPTANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of issue acceptances where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUEACCEPTANCE_WHERE);

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
	 * Returns the number of issue acceptances.
	 *
	 * @return the number of issue acceptances
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISSUEACCEPTANCE);

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
	 * Initializes the issue acceptance persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.IssueAcceptance")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssueAcceptance>> listenersList = new ArrayList<ModelListener<IssueAcceptance>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssueAcceptance>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssueAcceptanceImpl.class.getName());
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
	private static final String _SQL_SELECT_ISSUEACCEPTANCE = "SELECT issueAcceptance FROM IssueAcceptance issueAcceptance";
	private static final String _SQL_SELECT_ISSUEACCEPTANCE_WHERE = "SELECT issueAcceptance FROM IssueAcceptance issueAcceptance WHERE ";
	private static final String _SQL_COUNT_ISSUEACCEPTANCE = "SELECT COUNT(issueAcceptance) FROM IssueAcceptance issueAcceptance";
	private static final String _SQL_COUNT_ISSUEACCEPTANCE_WHERE = "SELECT COUNT(issueAcceptance) FROM IssueAcceptance issueAcceptance WHERE ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"issueAcceptance.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"issueAcceptance.documentYear = ?";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2 =
		"issueAcceptance.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2 =
		"issueAcceptance.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2 =
		"issueAcceptance.requestState = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "issueAcceptance.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "issueAcceptance.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(issueAcceptance.requestCode IS NULL OR issueAcceptance.requestCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issueAcceptance.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssueAcceptance exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssueAcceptance exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssueAcceptancePersistenceImpl.class);
	private static IssueAcceptance _nullIssueAcceptance = new IssueAcceptanceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssueAcceptance> toCacheModel() {
				return _nullIssueAcceptanceCacheModel;
			}
		};

	private static CacheModel<IssueAcceptance> _nullIssueAcceptanceCacheModel = new CacheModel<IssueAcceptance>() {
			public IssueAcceptance toEntityModel() {
				return _nullIssueAcceptance;
			}
		};
}