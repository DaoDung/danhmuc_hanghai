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

import vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException;
import vn.gt.dao.noticeandmessage.model.IssuePortClearance;
import vn.gt.dao.noticeandmessage.model.impl.IssuePortClearanceImpl;
import vn.gt.dao.noticeandmessage.model.impl.IssuePortClearanceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the issue port clearance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssuePortClearancePersistence
 * @see IssuePortClearanceUtil
 * @generated
 */
public class IssuePortClearancePersistenceImpl extends BasePersistenceImpl<IssuePortClearance>
	implements IssuePortClearancePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssuePortClearanceUtil} to access the issue port clearance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssuePortClearanceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			IssuePortClearanceModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePortClearanceModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			IssuePortClearanceModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePortClearanceModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			IssuePortClearanceModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			IssuePortClearanceModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_LAST_numberPortClearance",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_LAST_numberPortClearance",
			new String[] { String.class.getName() },
			IssuePortClearanceModelImpl.NUMBERPORTCLEARANCE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_LAST_numberPortClearance",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the issue port clearance in the entity cache if it is enabled.
	 *
	 * @param issuePortClearance the issue port clearance
	 */
	public void cacheResult(IssuePortClearance issuePortClearance) {
		EntityCacheUtil.putResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceImpl.class, issuePortClearance.getPrimaryKey(),
			issuePortClearance);

		issuePortClearance.resetOriginalValues();
	}

	/**
	 * Caches the issue port clearances in the entity cache if it is enabled.
	 *
	 * @param issuePortClearances the issue port clearances
	 */
	public void cacheResult(List<IssuePortClearance> issuePortClearances) {
		for (IssuePortClearance issuePortClearance : issuePortClearances) {
			if (EntityCacheUtil.getResult(
						IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
						IssuePortClearanceImpl.class,
						issuePortClearance.getPrimaryKey()) == null) {
				cacheResult(issuePortClearance);
			}
			else {
				issuePortClearance.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue port clearances.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssuePortClearanceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssuePortClearanceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue port clearance.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssuePortClearance issuePortClearance) {
		EntityCacheUtil.removeResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceImpl.class, issuePortClearance.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<IssuePortClearance> issuePortClearances) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssuePortClearance issuePortClearance : issuePortClearances) {
			EntityCacheUtil.removeResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
				IssuePortClearanceImpl.class, issuePortClearance.getPrimaryKey());
		}
	}

	/**
	 * Creates a new issue port clearance with the primary key. Does not add the issue port clearance to the database.
	 *
	 * @param id the primary key for the new issue port clearance
	 * @return the new issue port clearance
	 */
	public IssuePortClearance create(long id) {
		IssuePortClearance issuePortClearance = new IssuePortClearanceImpl();

		issuePortClearance.setNew(true);
		issuePortClearance.setPrimaryKey(id);

		return issuePortClearance;
	}

	/**
	 * Removes the issue port clearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue port clearance
	 * @return the issue port clearance that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance remove(long id)
		throws NoSuchIssuePortClearanceException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the issue port clearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue port clearance
	 * @return the issue port clearance that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance remove(Serializable primaryKey)
		throws NoSuchIssuePortClearanceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssuePortClearance issuePortClearance = (IssuePortClearance)session.get(IssuePortClearanceImpl.class,
					primaryKey);

			if (issuePortClearance == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssuePortClearanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issuePortClearance);
		}
		catch (NoSuchIssuePortClearanceException nsee) {
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
	protected IssuePortClearance removeImpl(
		IssuePortClearance issuePortClearance) throws SystemException {
		issuePortClearance = toUnwrappedModel(issuePortClearance);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, issuePortClearance);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(issuePortClearance);

		return issuePortClearance;
	}

	@Override
	public IssuePortClearance updateImpl(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance,
		boolean merge) throws SystemException {
		issuePortClearance = toUnwrappedModel(issuePortClearance);

		boolean isNew = issuePortClearance.isNew();

		IssuePortClearanceModelImpl issuePortClearanceModelImpl = (IssuePortClearanceModelImpl)issuePortClearance;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, issuePortClearance, merge);

			issuePortClearance.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IssuePortClearanceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((issuePortClearanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issuePortClearanceModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issuePortClearanceModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(issuePortClearanceModelImpl.getDocumentName()),
						Integer.valueOf(issuePortClearanceModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
			}

			if ((issuePortClearanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issuePortClearanceModelImpl.getOriginalDocumentName()),
						Integer.valueOf(issuePortClearanceModelImpl.getOriginalDocumentYear()),
						Integer.valueOf(issuePortClearanceModelImpl.getOriginalRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);

				args = new Object[] {
						Long.valueOf(issuePortClearanceModelImpl.getDocumentName()),
						Integer.valueOf(issuePortClearanceModelImpl.getDocumentYear()),
						Integer.valueOf(issuePortClearanceModelImpl.getRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
			}

			if ((issuePortClearanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issuePortClearanceModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { issuePortClearanceModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}

			if ((issuePortClearanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issuePortClearanceModelImpl.getOriginalNumberPortClearance()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE,
					args);

				args = new Object[] {
						issuePortClearanceModelImpl.getNumberPortClearance()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE,
					args);
			}
		}

		EntityCacheUtil.putResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceImpl.class, issuePortClearance.getPrimaryKey(),
			issuePortClearance);

		return issuePortClearance;
	}

	protected IssuePortClearance toUnwrappedModel(
		IssuePortClearance issuePortClearance) {
		if (issuePortClearance instanceof IssuePortClearanceImpl) {
			return issuePortClearance;
		}

		IssuePortClearanceImpl issuePortClearanceImpl = new IssuePortClearanceImpl();

		issuePortClearanceImpl.setNew(issuePortClearance.isNew());
		issuePortClearanceImpl.setPrimaryKey(issuePortClearance.getPrimaryKey());

		issuePortClearanceImpl.setId(issuePortClearance.getId());
		issuePortClearanceImpl.setRequestCode(issuePortClearance.getRequestCode());
		issuePortClearanceImpl.setNumberPortClearance(issuePortClearance.getNumberPortClearance());
		issuePortClearanceImpl.setDocumentName(issuePortClearance.getDocumentName());
		issuePortClearanceImpl.setDocumentYear(issuePortClearance.getDocumentYear());
		issuePortClearanceImpl.setPortofAuthority(issuePortClearance.getPortofAuthority());
		issuePortClearanceImpl.setNameOfShip(issuePortClearance.getNameOfShip());
		issuePortClearanceImpl.setFlagStateOfShip(issuePortClearance.getFlagStateOfShip());
		issuePortClearanceImpl.setNumberOfCrews(issuePortClearance.getNumberOfCrews());
		issuePortClearanceImpl.setNumberOfPassengers(issuePortClearance.getNumberOfPassengers());
		issuePortClearanceImpl.setCallSign(issuePortClearance.getCallSign());
		issuePortClearanceImpl.setNameOfMaster(issuePortClearance.getNameOfMaster());
		issuePortClearanceImpl.setCargo(issuePortClearance.getCargo());
		issuePortClearanceImpl.setVolumeCargo(issuePortClearance.getVolumeCargo());
		issuePortClearanceImpl.setCargoUnit(issuePortClearance.getCargoUnit());
		issuePortClearanceImpl.setCargoDescription(issuePortClearance.getCargoDescription());
		issuePortClearanceImpl.setTransitCargo(issuePortClearance.getTransitCargo());
		issuePortClearanceImpl.setVolumeTransitCargo(issuePortClearance.getVolumeTransitCargo());
		issuePortClearanceImpl.setTransitCargoUnit(issuePortClearance.getTransitCargoUnit());
		issuePortClearanceImpl.setTimeOfDeparture(issuePortClearance.getTimeOfDeparture());
		issuePortClearanceImpl.setNextProvinceCode(issuePortClearance.getNextProvinceCode());
		issuePortClearanceImpl.setNextPortOfCallCode(issuePortClearance.getNextPortOfCallCode());
		issuePortClearanceImpl.setMaritimePortCode(issuePortClearance.getMaritimePortCode());
		issuePortClearanceImpl.setPortCode(issuePortClearance.getPortCode());
		issuePortClearanceImpl.setPortHarbourCode(issuePortClearance.getPortHarbourCode());
		issuePortClearanceImpl.setValidUntil(issuePortClearance.getValidUntil());
		issuePortClearanceImpl.setIssueDate(issuePortClearance.getIssueDate());
		issuePortClearanceImpl.setDirectorOfMaritime(issuePortClearance.getDirectorOfMaritime());
		issuePortClearanceImpl.setCertificateNo(issuePortClearance.getCertificateNo());
		issuePortClearanceImpl.setRequestState(issuePortClearance.getRequestState());
		issuePortClearanceImpl.setGt(issuePortClearance.getGt());
		issuePortClearanceImpl.setDwt(issuePortClearance.getDwt());
		issuePortClearanceImpl.setNextMaritimePortCode(issuePortClearance.getNextMaritimePortCode());
		issuePortClearanceImpl.setNextPortRegionCode(issuePortClearance.getNextPortRegionCode());
		issuePortClearanceImpl.setNextPortHarbourCode(issuePortClearance.getNextPortHarbourCode());
		issuePortClearanceImpl.setNextPortWharfCode(issuePortClearance.getNextPortWharfCode());
		issuePortClearanceImpl.setVersionNo(issuePortClearance.getVersionNo());
		issuePortClearanceImpl.setIsApproval(issuePortClearance.getIsApproval());
		issuePortClearanceImpl.setApprovalDate(issuePortClearance.getApprovalDate());
		issuePortClearanceImpl.setApprovalName(issuePortClearance.getApprovalName());
		issuePortClearanceImpl.setRemarks(issuePortClearance.getRemarks());
		issuePortClearanceImpl.setIsCancel(issuePortClearance.getIsCancel());
		issuePortClearanceImpl.setCancelDate(issuePortClearance.getCancelDate());
		issuePortClearanceImpl.setCancelName(issuePortClearance.getCancelName());
		issuePortClearanceImpl.setCancelNote(issuePortClearance.getCancelNote());
		issuePortClearanceImpl.setRepresentative(issuePortClearance.getRepresentative());
		issuePortClearanceImpl.setSignDate(issuePortClearance.getSignDate());
		issuePortClearanceImpl.setSignName(issuePortClearance.getSignName());
		issuePortClearanceImpl.setSignTitle(issuePortClearance.getSignTitle());
		issuePortClearanceImpl.setSignPlace(issuePortClearance.getSignPlace());
		issuePortClearanceImpl.setStampStatus(issuePortClearance.getStampStatus());
		issuePortClearanceImpl.setAttachedFile(issuePortClearance.getAttachedFile());

		return issuePortClearanceImpl;
	}

	/**
	 * Returns the issue port clearance with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue port clearance
	 * @return the issue port clearance
	 * @throws com.liferay.portal.NoSuchModelException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the issue port clearance with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException} if it could not be found.
	 *
	 * @param id the primary key of the issue port clearance
	 * @return the issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByPrimaryKey(long id)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = fetchByPrimaryKey(id);

		if (issuePortClearance == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchIssuePortClearanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return issuePortClearance;
	}

	/**
	 * Returns the issue port clearance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue port clearance
	 * @return the issue port clearance, or <code>null</code> if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the issue port clearance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue port clearance
	 * @return the issue port clearance, or <code>null</code> if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance fetchByPrimaryKey(long id)
		throws SystemException {
		IssuePortClearance issuePortClearance = (IssuePortClearance)EntityCacheUtil.getResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
				IssuePortClearanceImpl.class, id);

		if (issuePortClearance == _nullIssuePortClearance) {
			return null;
		}

		if (issuePortClearance == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				issuePortClearance = (IssuePortClearance)session.get(IssuePortClearanceImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (issuePortClearance != null) {
					cacheResult(issuePortClearance);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
						IssuePortClearanceImpl.class, id,
						_nullIssuePortClearance);
				}

				closeSession(session);
			}
		}

		return issuePortClearance;
	}

	/**
	 * Returns all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
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

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		List<IssuePortClearance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePortClearanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		int count = countByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear);

		List<IssuePortClearance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePortClearanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue port clearances before and after the current issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue port clearance
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance[] findByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePortClearance[] array = new IssuePortClearanceImpl[3];

			array[0] = getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(session,
					issuePortClearance, documentName, documentYear,
					orderByComparator, true);

			array[1] = issuePortClearance;

			array[2] = getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(session,
					issuePortClearance, documentName, documentYear,
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

	protected IssuePortClearance getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(
		Session session, IssuePortClearance issuePortClearance,
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

		query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

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
			query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issuePortClearance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePortClearance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
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

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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

				list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		List<IssuePortClearance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
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

			throw new NoSuchIssuePortClearanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		int count = countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState);

		List<IssuePortClearance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
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

			throw new NoSuchIssuePortClearanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue port clearances before and after the current issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue port clearance
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance[] findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePortClearance[] array = new IssuePortClearanceImpl[3];

			array[0] = getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(session,
					issuePortClearance, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = issuePortClearance;

			array[2] = getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(session,
					issuePortClearance, documentName, documentYear,
					requestState, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssuePortClearance getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		Session session, IssuePortClearance issuePortClearance,
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

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
			query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(issuePortClearance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePortClearance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the issue port clearances where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue port clearances where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByRequestCode(String requestCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

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
				query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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

				list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Returns the first issue port clearance in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		List<IssuePortClearance> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePortClearanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue port clearance in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		int count = countByRequestCode(requestCode);

		List<IssuePortClearance> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePortClearanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue port clearances before and after the current issue port clearance in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue port clearance
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePortClearance[] array = new IssuePortClearanceImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					issuePortClearance, requestCode, orderByComparator, true);

			array[1] = issuePortClearance;

			array[2] = getByRequestCode_PrevAndNext(session,
					issuePortClearance, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssuePortClearance getByRequestCode_PrevAndNext(Session session,
		IssuePortClearance issuePortClearance, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

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
			query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(issuePortClearance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePortClearance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the issue port clearances where numberPortClearance = &#63;.
	 *
	 * @param numberPortClearance the number port clearance
	 * @return the matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByF_LAST_numberPortClearance(
		String numberPortClearance) throws SystemException {
		return findByF_LAST_numberPortClearance(numberPortClearance,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue port clearances where numberPortClearance = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param numberPortClearance the number port clearance
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByF_LAST_numberPortClearance(
		String numberPortClearance, int start, int end)
		throws SystemException {
		return findByF_LAST_numberPortClearance(numberPortClearance, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances where numberPortClearance = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param numberPortClearance the number port clearance
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findByF_LAST_numberPortClearance(
		String numberPortClearance, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE;
			finderArgs = new Object[] { numberPortClearance };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_LAST_NUMBERPORTCLEARANCE;
			finderArgs = new Object[] {
					numberPortClearance,
					
					start, end, orderByComparator
				};
		}

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

			if (numberPortClearance == null) {
				query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_1);
			}
			else {
				if (numberPortClearance.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (numberPortClearance != null) {
					qPos.add(numberPortClearance);
				}

				list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Returns the first issue port clearance in the ordered set where numberPortClearance = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param numberPortClearance the number port clearance
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByF_LAST_numberPortClearance_First(
		String numberPortClearance, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		List<IssuePortClearance> list = findByF_LAST_numberPortClearance(numberPortClearance,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("numberPortClearance=");
			msg.append(numberPortClearance);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePortClearanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue port clearance in the ordered set where numberPortClearance = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param numberPortClearance the number port clearance
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance findByF_LAST_numberPortClearance_Last(
		String numberPortClearance, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		int count = countByF_LAST_numberPortClearance(numberPortClearance);

		List<IssuePortClearance> list = findByF_LAST_numberPortClearance(numberPortClearance,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("numberPortClearance=");
			msg.append(numberPortClearance);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssuePortClearanceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue port clearances before and after the current issue port clearance in the ordered set where numberPortClearance = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current issue port clearance
	 * @param numberPortClearance the number port clearance
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue port clearance
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssuePortClearance[] findByF_LAST_numberPortClearance_PrevAndNext(
		long id, String numberPortClearance, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePortClearance[] array = new IssuePortClearanceImpl[3];

			array[0] = getByF_LAST_numberPortClearance_PrevAndNext(session,
					issuePortClearance, numberPortClearance, orderByComparator,
					true);

			array[1] = issuePortClearance;

			array[2] = getByF_LAST_numberPortClearance_PrevAndNext(session,
					issuePortClearance, numberPortClearance, orderByComparator,
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

	protected IssuePortClearance getByF_LAST_numberPortClearance_PrevAndNext(
		Session session, IssuePortClearance issuePortClearance,
		String numberPortClearance, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

		if (numberPortClearance == null) {
			query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_1);
		}
		else {
			if (numberPortClearance.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_3);
			}
			else {
				query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_2);
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
			query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (numberPortClearance != null) {
			qPos.add(numberPortClearance);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issuePortClearance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePortClearance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the issue port clearances.
	 *
	 * @return the issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue port clearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssuePortClearance> findAll(int start, int end,
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

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUEPORTCLEARANCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUEPORTCLEARANCE.concat(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<IssuePortClearance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Removes all the issue port clearances where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		for (IssuePortClearance issuePortClearance : findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
				documentName, documentYear)) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Removes all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (IssuePortClearance issuePortClearance : findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
				documentName, documentYear, requestState)) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Removes all the issue port clearances where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (IssuePortClearance issuePortClearance : findByRequestCode(
				requestCode)) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Removes all the issue port clearances where numberPortClearance = &#63; from the database.
	 *
	 * @param numberPortClearance the number port clearance
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_LAST_numberPortClearance(String numberPortClearance)
		throws SystemException {
		for (IssuePortClearance issuePortClearance : findByF_LAST_numberPortClearance(
				numberPortClearance)) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Removes all the issue port clearances from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (IssuePortClearance issuePortClearance : findAll()) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Returns the number of issue port clearances where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public int countByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUEPORTCLEARANCE_WHERE);

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
	 * Returns the number of issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching issue port clearances
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

			query.append(_SQL_COUNT_ISSUEPORTCLEARANCE_WHERE);

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
	 * Returns the number of issue port clearances where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUEPORTCLEARANCE_WHERE);

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
	 * Returns the number of issue port clearances where numberPortClearance = &#63;.
	 *
	 * @param numberPortClearance the number port clearance
	 * @return the number of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_LAST_numberPortClearance(String numberPortClearance)
		throws SystemException {
		Object[] finderArgs = new Object[] { numberPortClearance };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_LAST_NUMBERPORTCLEARANCE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUEPORTCLEARANCE_WHERE);

			if (numberPortClearance == null) {
				query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_1);
			}
			else {
				if (numberPortClearance.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (numberPortClearance != null) {
					qPos.add(numberPortClearance);
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
	 * Returns the number of issue port clearances.
	 *
	 * @return the number of issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISSUEPORTCLEARANCE);

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
	 * Initializes the issue port clearance persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.IssuePortClearance")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssuePortClearance>> listenersList = new ArrayList<ModelListener<IssuePortClearance>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssuePortClearance>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssuePortClearanceImpl.class.getName());
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
	private static final String _SQL_SELECT_ISSUEPORTCLEARANCE = "SELECT issuePortClearance FROM IssuePortClearance issuePortClearance";
	private static final String _SQL_SELECT_ISSUEPORTCLEARANCE_WHERE = "SELECT issuePortClearance FROM IssuePortClearance issuePortClearance WHERE ";
	private static final String _SQL_COUNT_ISSUEPORTCLEARANCE = "SELECT COUNT(issuePortClearance) FROM IssuePortClearance issuePortClearance";
	private static final String _SQL_COUNT_ISSUEPORTCLEARANCE_WHERE = "SELECT COUNT(issuePortClearance) FROM IssuePortClearance issuePortClearance WHERE ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"issuePortClearance.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"issuePortClearance.documentYear = ?";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2 =
		"issuePortClearance.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2 =
		"issuePortClearance.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2 =
		"issuePortClearance.requestState = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "issuePortClearance.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "issuePortClearance.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(issuePortClearance.requestCode IS NULL OR issuePortClearance.requestCode = ?)";
	private static final String _FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_1 =
		"issuePortClearance.numberPortClearance IS NULL";
	private static final String _FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_2 =
		"issuePortClearance.numberPortClearance = ?";
	private static final String _FINDER_COLUMN_F_LAST_NUMBERPORTCLEARANCE_NUMBERPORTCLEARANCE_3 =
		"(issuePortClearance.numberPortClearance IS NULL OR issuePortClearance.numberPortClearance = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issuePortClearance.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssuePortClearance exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssuePortClearance exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssuePortClearancePersistenceImpl.class);
	private static IssuePortClearance _nullIssuePortClearance = new IssuePortClearanceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssuePortClearance> toCacheModel() {
				return _nullIssuePortClearanceCacheModel;
			}
		};

	private static CacheModel<IssuePortClearance> _nullIssuePortClearanceCacheModel =
		new CacheModel<IssuePortClearance>() {
			public IssuePortClearance toEntityModel() {
				return _nullIssuePortClearance;
			}
		};
}