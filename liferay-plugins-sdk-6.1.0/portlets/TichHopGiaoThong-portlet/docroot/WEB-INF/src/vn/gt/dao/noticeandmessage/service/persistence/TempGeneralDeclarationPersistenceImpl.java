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

import vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException;
import vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration;
import vn.gt.dao.noticeandmessage.model.impl.TempGeneralDeclarationImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempGeneralDeclarationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp general declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempGeneralDeclarationPersistence
 * @see TempGeneralDeclarationUtil
 * @generated
 */
public class TempGeneralDeclarationPersistenceImpl extends BasePersistenceImpl<TempGeneralDeclaration>
	implements TempGeneralDeclarationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempGeneralDeclarationUtil} to access the temp general declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempGeneralDeclarationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempGeneralDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempGeneralDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempGeneralDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempGeneralDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempGeneralDeclarationModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempGeneralDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp general declaration in the entity cache if it is enabled.
	 *
	 * @param tempGeneralDeclaration the temp general declaration
	 */
	public void cacheResult(TempGeneralDeclaration tempGeneralDeclaration) {
		EntityCacheUtil.putResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			tempGeneralDeclaration.getPrimaryKey(), tempGeneralDeclaration);

		tempGeneralDeclaration.resetOriginalValues();
	}

	/**
	 * Caches the temp general declarations in the entity cache if it is enabled.
	 *
	 * @param tempGeneralDeclarations the temp general declarations
	 */
	public void cacheResult(
		List<TempGeneralDeclaration> tempGeneralDeclarations) {
		for (TempGeneralDeclaration tempGeneralDeclaration : tempGeneralDeclarations) {
			if (EntityCacheUtil.getResult(
						TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempGeneralDeclarationImpl.class,
						tempGeneralDeclaration.getPrimaryKey()) == null) {
				cacheResult(tempGeneralDeclaration);
			}
			else {
				tempGeneralDeclaration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp general declarations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempGeneralDeclarationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempGeneralDeclarationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp general declaration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempGeneralDeclaration tempGeneralDeclaration) {
		EntityCacheUtil.removeResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			tempGeneralDeclaration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempGeneralDeclaration> tempGeneralDeclarations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempGeneralDeclaration tempGeneralDeclaration : tempGeneralDeclarations) {
			EntityCacheUtil.removeResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempGeneralDeclarationImpl.class,
				tempGeneralDeclaration.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp general declaration with the primary key. Does not add the temp general declaration to the database.
	 *
	 * @param id the primary key for the new temp general declaration
	 * @return the new temp general declaration
	 */
	public TempGeneralDeclaration create(long id) {
		TempGeneralDeclaration tempGeneralDeclaration = new TempGeneralDeclarationImpl();

		tempGeneralDeclaration.setNew(true);
		tempGeneralDeclaration.setPrimaryKey(id);

		return tempGeneralDeclaration;
	}

	/**
	 * Removes the temp general declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp general declaration
	 * @return the temp general declaration that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration remove(long id)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp general declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp general declaration
	 * @return the temp general declaration that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration remove(Serializable primaryKey)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempGeneralDeclaration tempGeneralDeclaration = (TempGeneralDeclaration)session.get(TempGeneralDeclarationImpl.class,
					primaryKey);

			if (tempGeneralDeclaration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempGeneralDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempGeneralDeclaration);
		}
		catch (NoSuchTempGeneralDeclarationException nsee) {
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
	protected TempGeneralDeclaration removeImpl(
		TempGeneralDeclaration tempGeneralDeclaration)
		throws SystemException {
		tempGeneralDeclaration = toUnwrappedModel(tempGeneralDeclaration);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempGeneralDeclaration);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempGeneralDeclaration);

		return tempGeneralDeclaration;
	}

	@Override
	public TempGeneralDeclaration updateImpl(
		vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration tempGeneralDeclaration,
		boolean merge) throws SystemException {
		tempGeneralDeclaration = toUnwrappedModel(tempGeneralDeclaration);

		boolean isNew = tempGeneralDeclaration.isNew();

		TempGeneralDeclarationModelImpl tempGeneralDeclarationModelImpl = (TempGeneralDeclarationModelImpl)tempGeneralDeclaration;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempGeneralDeclaration, merge);

			tempGeneralDeclaration.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempGeneralDeclarationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempGeneralDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempGeneralDeclarationModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempGeneralDeclarationModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(tempGeneralDeclarationModelImpl.getDocumentName()),
						Integer.valueOf(tempGeneralDeclarationModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempGeneralDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempGeneralDeclarationModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempGeneralDeclarationModelImpl.getOriginalDocumentYear()),
						Integer.valueOf(tempGeneralDeclarationModelImpl.getOriginalRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						Long.valueOf(tempGeneralDeclarationModelImpl.getDocumentName()),
						Integer.valueOf(tempGeneralDeclarationModelImpl.getDocumentYear()),
						Integer.valueOf(tempGeneralDeclarationModelImpl.getRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempGeneralDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempGeneralDeclarationModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempGeneralDeclarationModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			tempGeneralDeclaration.getPrimaryKey(), tempGeneralDeclaration);

		return tempGeneralDeclaration;
	}

	protected TempGeneralDeclaration toUnwrappedModel(
		TempGeneralDeclaration tempGeneralDeclaration) {
		if (tempGeneralDeclaration instanceof TempGeneralDeclarationImpl) {
			return tempGeneralDeclaration;
		}

		TempGeneralDeclarationImpl tempGeneralDeclarationImpl = new TempGeneralDeclarationImpl();

		tempGeneralDeclarationImpl.setNew(tempGeneralDeclaration.isNew());
		tempGeneralDeclarationImpl.setPrimaryKey(tempGeneralDeclaration.getPrimaryKey());

		tempGeneralDeclarationImpl.setId(tempGeneralDeclaration.getId());
		tempGeneralDeclarationImpl.setRequestCode(tempGeneralDeclaration.getRequestCode());
		tempGeneralDeclarationImpl.setRequestState(tempGeneralDeclaration.getRequestState());
		tempGeneralDeclarationImpl.setDocumentName(tempGeneralDeclaration.getDocumentName());
		tempGeneralDeclarationImpl.setDocumentReference(tempGeneralDeclaration.getDocumentReference());
		tempGeneralDeclarationImpl.setDocumentYear(tempGeneralDeclaration.getDocumentYear());
		tempGeneralDeclarationImpl.setUserCreated(tempGeneralDeclaration.getUserCreated());
		tempGeneralDeclarationImpl.setIsArrival(tempGeneralDeclaration.getIsArrival());
		tempGeneralDeclarationImpl.setNameOfShip(tempGeneralDeclaration.getNameOfShip());
		tempGeneralDeclarationImpl.setShipTypeCode(tempGeneralDeclaration.getShipTypeCode());
		tempGeneralDeclarationImpl.setImoNumber(tempGeneralDeclaration.getImoNumber());
		tempGeneralDeclarationImpl.setCallSign(tempGeneralDeclaration.getCallSign());
		tempGeneralDeclarationImpl.setVoyageNumber(tempGeneralDeclaration.getVoyageNumber());
		tempGeneralDeclarationImpl.setPortOfArrivalCode(tempGeneralDeclaration.getPortOfArrivalCode());
		tempGeneralDeclarationImpl.setDateOfArrival(tempGeneralDeclaration.getDateOfArrival());
		tempGeneralDeclarationImpl.setPortHarbourCode(tempGeneralDeclaration.getPortHarbourCode());
		tempGeneralDeclarationImpl.setPortRegionCode(tempGeneralDeclaration.getPortRegionCode());
		tempGeneralDeclarationImpl.setPortWharfCode(tempGeneralDeclaration.getPortWharfCode());
		tempGeneralDeclarationImpl.setFlagStateOfShip(tempGeneralDeclaration.getFlagStateOfShip());
		tempGeneralDeclarationImpl.setNameOfMaster(tempGeneralDeclaration.getNameOfMaster());
		tempGeneralDeclarationImpl.setLastPortOfCallCode(tempGeneralDeclaration.getLastPortOfCallCode());
		tempGeneralDeclarationImpl.setCertificateOfRegistryNumber(tempGeneralDeclaration.getCertificateOfRegistryNumber());
		tempGeneralDeclarationImpl.setCertificateOfRegistryDate(tempGeneralDeclaration.getCertificateOfRegistryDate());
		tempGeneralDeclarationImpl.setCertificateOfRegistryPortName(tempGeneralDeclaration.getCertificateOfRegistryPortName());
		tempGeneralDeclarationImpl.setTaxCodeOfShipownersAgents(tempGeneralDeclaration.getTaxCodeOfShipownersAgents());
		tempGeneralDeclarationImpl.setNameOfShipownersAgents(tempGeneralDeclaration.getNameOfShipownersAgents());
		tempGeneralDeclarationImpl.setShipAgencyAddress(tempGeneralDeclaration.getShipAgencyAddress());
		tempGeneralDeclarationImpl.setShipAgencyPhone(tempGeneralDeclaration.getShipAgencyPhone());
		tempGeneralDeclarationImpl.setShipAgencyFax(tempGeneralDeclaration.getShipAgencyFax());
		tempGeneralDeclarationImpl.setShipAgencyEmail(tempGeneralDeclaration.getShipAgencyEmail());
		tempGeneralDeclarationImpl.setGrossTonnage(tempGeneralDeclaration.getGrossTonnage());
		tempGeneralDeclarationImpl.setNetTonnage(tempGeneralDeclaration.getNetTonnage());
		tempGeneralDeclarationImpl.setPositionOfShipInport(tempGeneralDeclaration.getPositionOfShipInport());
		tempGeneralDeclarationImpl.setBriefParticularsOfVoyage(tempGeneralDeclaration.getBriefParticularsOfVoyage());
		tempGeneralDeclarationImpl.setPreviousPortsOfCall(tempGeneralDeclaration.getPreviousPortsOfCall());
		tempGeneralDeclarationImpl.setSubsequentPortsOfCall(tempGeneralDeclaration.getSubsequentPortsOfCall());
		tempGeneralDeclarationImpl.setDischargedPorts(tempGeneralDeclaration.getDischargedPorts());
		tempGeneralDeclarationImpl.setRemainingCargo(tempGeneralDeclaration.getRemainingCargo());
		tempGeneralDeclarationImpl.setBriefDescriptionOfTheCargo(tempGeneralDeclaration.getBriefDescriptionOfTheCargo());
		tempGeneralDeclarationImpl.setNumberOfCrew(tempGeneralDeclaration.getNumberOfCrew());
		tempGeneralDeclarationImpl.setNumberOfPassengers(tempGeneralDeclaration.getNumberOfPassengers());
		tempGeneralDeclarationImpl.setShipRequirementsInTermsOfWaste(tempGeneralDeclaration.getShipRequirementsInTermsOfWaste());
		tempGeneralDeclarationImpl.setRemarks(tempGeneralDeclaration.getRemarks());
		tempGeneralDeclarationImpl.setNumberCargoDeclaration(tempGeneralDeclaration.getNumberCargoDeclaration());
		tempGeneralDeclarationImpl.setNumberShipStoreDeclaration(tempGeneralDeclaration.getNumberShipStoreDeclaration());
		tempGeneralDeclarationImpl.setNumberCrewList(tempGeneralDeclaration.getNumberCrewList());
		tempGeneralDeclarationImpl.setNumberPassengerList(tempGeneralDeclaration.getNumberPassengerList());
		tempGeneralDeclarationImpl.setNumberCrewEffects(tempGeneralDeclaration.getNumberCrewEffects());
		tempGeneralDeclarationImpl.setNumberHealthMaritime(tempGeneralDeclaration.getNumberHealthMaritime());
		tempGeneralDeclarationImpl.setSignPlace(tempGeneralDeclaration.getSignPlace());
		tempGeneralDeclarationImpl.setSignDate(tempGeneralDeclaration.getSignDate());
		tempGeneralDeclarationImpl.setMasterSigned(tempGeneralDeclaration.getMasterSigned());
		tempGeneralDeclarationImpl.setMasterSignedImage(tempGeneralDeclaration.getMasterSignedImage());
		tempGeneralDeclarationImpl.setCargoOnBoard(tempGeneralDeclaration.getCargoOnBoard());
		tempGeneralDeclarationImpl.setCargo(tempGeneralDeclaration.getCargo());
		tempGeneralDeclarationImpl.setVolumeCargo(tempGeneralDeclaration.getVolumeCargo());
		tempGeneralDeclarationImpl.setCargoUnit(tempGeneralDeclaration.getCargoUnit());
		tempGeneralDeclarationImpl.setCargoDescription(tempGeneralDeclaration.getCargoDescription());
		tempGeneralDeclarationImpl.setRatedPower(tempGeneralDeclaration.getRatedPower());
		tempGeneralDeclarationImpl.setSeatingCapacity(tempGeneralDeclaration.getSeatingCapacity());
		tempGeneralDeclarationImpl.setLyingCapacity(tempGeneralDeclaration.getLyingCapacity());
		tempGeneralDeclarationImpl.setMaritimePortCode(tempGeneralDeclaration.getMaritimePortCode());
		tempGeneralDeclarationImpl.setLastProvinceCode(tempGeneralDeclaration.getLastProvinceCode());
		tempGeneralDeclarationImpl.setNextProvinceCode(tempGeneralDeclaration.getNextProvinceCode());
		tempGeneralDeclarationImpl.setLastMaritimePortCode(tempGeneralDeclaration.getLastMaritimePortCode());
		tempGeneralDeclarationImpl.setLastPortRegionCode(tempGeneralDeclaration.getLastPortRegionCode());
		tempGeneralDeclarationImpl.setLastPortHarbourCode(tempGeneralDeclaration.getLastPortHarbourCode());
		tempGeneralDeclarationImpl.setLastPortWharfCode(tempGeneralDeclaration.getLastPortWharfCode());
		tempGeneralDeclarationImpl.setNextMaritimePortCode(tempGeneralDeclaration.getNextMaritimePortCode());
		tempGeneralDeclarationImpl.setNextPortRegionCode(tempGeneralDeclaration.getNextPortRegionCode());
		tempGeneralDeclarationImpl.setNextPortHarbourCode(tempGeneralDeclaration.getNextPortHarbourCode());
		tempGeneralDeclarationImpl.setNextPortWharfCode(tempGeneralDeclaration.getNextPortWharfCode());
		tempGeneralDeclarationImpl.setLink(tempGeneralDeclaration.getLink());
		tempGeneralDeclarationImpl.setQrCode(tempGeneralDeclaration.getQrCode());
		tempGeneralDeclarationImpl.setPortClearanceNo(tempGeneralDeclaration.getPortClearanceNo());
		tempGeneralDeclarationImpl.setLoa(tempGeneralDeclaration.getLoa());
		tempGeneralDeclarationImpl.setUnitLOA(tempGeneralDeclaration.getUnitLOA());
		tempGeneralDeclarationImpl.setBreadth(tempGeneralDeclaration.getBreadth());
		tempGeneralDeclarationImpl.setUnitBreadth(tempGeneralDeclaration.getUnitBreadth());
		tempGeneralDeclarationImpl.setClearanceHeight(tempGeneralDeclaration.getClearanceHeight());
		tempGeneralDeclarationImpl.setUnitClearanceHeight(tempGeneralDeclaration.getUnitClearanceHeight());
		tempGeneralDeclarationImpl.setShownDraftxF(tempGeneralDeclaration.getShownDraftxF());
		tempGeneralDeclarationImpl.setUnitShownDraftxF(tempGeneralDeclaration.getUnitShownDraftxF());
		tempGeneralDeclarationImpl.setShownDraftxA(tempGeneralDeclaration.getShownDraftxA());
		tempGeneralDeclarationImpl.setUnitShownDraftxA(tempGeneralDeclaration.getUnitShownDraftxA());
		tempGeneralDeclarationImpl.setDwt(tempGeneralDeclaration.getDwt());
		tempGeneralDeclarationImpl.setUnitDWT(tempGeneralDeclaration.getUnitDWT());
		tempGeneralDeclarationImpl.setTimeOfPORTArrival(tempGeneralDeclaration.getTimeOfPORTArrival());
		tempGeneralDeclarationImpl.setTimeOfPilotOnBoard(tempGeneralDeclaration.getTimeOfPilotOnBoard());
		tempGeneralDeclarationImpl.setTugBoat(tempGeneralDeclaration.getTugBoat());
		tempGeneralDeclarationImpl.setDo_(tempGeneralDeclaration.getDo_());
		tempGeneralDeclarationImpl.setFo(tempGeneralDeclaration.getFo());
		tempGeneralDeclarationImpl.setFw(tempGeneralDeclaration.getFw());
		tempGeneralDeclarationImpl.setPlaceOfReception(tempGeneralDeclaration.getPlaceOfReception());
		tempGeneralDeclarationImpl.setNameOfShipOwners(tempGeneralDeclaration.getNameOfShipOwners());
		tempGeneralDeclarationImpl.setAddressOfShipOwners(tempGeneralDeclaration.getAddressOfShipOwners());

		return tempGeneralDeclarationImpl;
	}

	/**
	 * Returns the temp general declaration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp general declaration
	 * @return the temp general declaration
	 * @throws com.liferay.portal.NoSuchModelException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp general declaration with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException} if it could not be found.
	 *
	 * @param id the primary key of the temp general declaration
	 * @return the temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration findByPrimaryKey(long id)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = fetchByPrimaryKey(id);

		if (tempGeneralDeclaration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempGeneralDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempGeneralDeclaration;
	}

	/**
	 * Returns the temp general declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp general declaration
	 * @return the temp general declaration, or <code>null</code> if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp general declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp general declaration
	 * @return the temp general declaration, or <code>null</code> if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration fetchByPrimaryKey(long id)
		throws SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = (TempGeneralDeclaration)EntityCacheUtil.getResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempGeneralDeclarationImpl.class, id);

		if (tempGeneralDeclaration == _nullTempGeneralDeclaration) {
			return null;
		}

		if (tempGeneralDeclaration == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempGeneralDeclaration = (TempGeneralDeclaration)session.get(TempGeneralDeclarationImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempGeneralDeclaration != null) {
					cacheResult(tempGeneralDeclaration);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempGeneralDeclarationImpl.class, id,
						_nullTempGeneralDeclaration);
				}

				closeSession(session);
			}
		}

		return tempGeneralDeclaration;
	}

	/**
	 * Returns all the temp general declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp general declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @return the range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp general declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYear(
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

		List<TempGeneralDeclaration> list = (List<TempGeneralDeclaration>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		List<TempGeneralDeclaration> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempGeneralDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		int count = countByDocumentNameAndDocumentYear(documentName,
				documentYear);

		List<TempGeneralDeclaration> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempGeneralDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp general declarations before and after the current temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp general declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempGeneralDeclaration[] array = new TempGeneralDeclarationImpl[3];

			array[0] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempGeneralDeclaration, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempGeneralDeclaration;

			array[2] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempGeneralDeclaration, documentName, documentYear,
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

	protected TempGeneralDeclaration getByDocumentNameAndDocumentYear_PrevAndNext(
		Session session, TempGeneralDeclaration tempGeneralDeclaration,
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

		query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

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
			query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempGeneralDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempGeneralDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @return the range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] { documentName, documentYear, requestState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] {
					documentName, documentYear, requestState,
					
					start, end, orderByComparator
				};
		}

		List<TempGeneralDeclaration> list = (List<TempGeneralDeclaration>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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

				list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration findByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		List<TempGeneralDeclaration> list = findByDocumentNameAndDocumentYearRequestState(documentName,
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

			throw new NoSuchTempGeneralDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration findByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		int count = countByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState);

		List<TempGeneralDeclaration> list = findByDocumentNameAndDocumentYearRequestState(documentName,
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

			throw new NoSuchTempGeneralDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp general declarations before and after the current temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp general declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration[] findByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempGeneralDeclaration[] array = new TempGeneralDeclarationImpl[3];

			array[0] = getByDocumentNameAndDocumentYearRequestState_PrevAndNext(session,
					tempGeneralDeclaration, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempGeneralDeclaration;

			array[2] = getByDocumentNameAndDocumentYearRequestState_PrevAndNext(session,
					tempGeneralDeclaration, documentName, documentYear,
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

	protected TempGeneralDeclaration getByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		Session session, TempGeneralDeclaration tempGeneralDeclaration,
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

		query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

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
			query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempGeneralDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempGeneralDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp general declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp general declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @return the range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp general declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findByRequestCode(String requestCode,
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

		List<TempGeneralDeclaration> list = (List<TempGeneralDeclaration>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

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
				query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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

				list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp general declaration in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		List<TempGeneralDeclaration> list = findByRequestCode(requestCode, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempGeneralDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp general declaration in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		int count = countByRequestCode(requestCode);

		List<TempGeneralDeclaration> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempGeneralDeclarationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp general declarations before and after the current temp general declaration in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp general declaration
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp general declaration
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempGeneralDeclaration[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempGeneralDeclaration[] array = new TempGeneralDeclarationImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempGeneralDeclaration, requestCode, orderByComparator, true);

			array[1] = tempGeneralDeclaration;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempGeneralDeclaration, requestCode, orderByComparator,
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

	protected TempGeneralDeclaration getByRequestCode_PrevAndNext(
		Session session, TempGeneralDeclaration tempGeneralDeclaration,
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

		query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

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
			query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempGeneralDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempGeneralDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp general declarations.
	 *
	 * @return the temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp general declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @return the range of temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp general declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempGeneralDeclaration> findAll(int start, int end,
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

		List<TempGeneralDeclaration> list = (List<TempGeneralDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPGENERALDECLARATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPGENERALDECLARATION.concat(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
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
	 * Removes all the temp general declarations where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempGeneralDeclaration tempGeneralDeclaration : findByDocumentNameAndDocumentYear(
				documentName, documentYear)) {
			remove(tempGeneralDeclaration);
		}
	}

	/**
	 * Removes all the temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (TempGeneralDeclaration tempGeneralDeclaration : findByDocumentNameAndDocumentYearRequestState(
				documentName, documentYear, requestState)) {
			remove(tempGeneralDeclaration);
		}
	}

	/**
	 * Removes all the temp general declarations where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempGeneralDeclaration tempGeneralDeclaration : findByRequestCode(
				requestCode)) {
			remove(tempGeneralDeclaration);
		}
	}

	/**
	 * Removes all the temp general declarations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempGeneralDeclaration tempGeneralDeclaration : findAll()) {
			remove(tempGeneralDeclaration);
		}
	}

	/**
	 * Returns the number of temp general declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPGENERALDECLARATION_WHERE);

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
	 * Returns the number of temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPGENERALDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp general declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPGENERALDECLARATION_WHERE);

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
	 * Returns the number of temp general declarations.
	 *
	 * @return the number of temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPGENERALDECLARATION);

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
	 * Initializes the temp general declaration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempGeneralDeclaration>> listenersList = new ArrayList<ModelListener<TempGeneralDeclaration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempGeneralDeclaration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempGeneralDeclarationImpl.class.getName());
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
	private static final String _SQL_SELECT_TEMPGENERALDECLARATION = "SELECT tempGeneralDeclaration FROM TempGeneralDeclaration tempGeneralDeclaration";
	private static final String _SQL_SELECT_TEMPGENERALDECLARATION_WHERE = "SELECT tempGeneralDeclaration FROM TempGeneralDeclaration tempGeneralDeclaration WHERE ";
	private static final String _SQL_COUNT_TEMPGENERALDECLARATION = "SELECT COUNT(tempGeneralDeclaration) FROM TempGeneralDeclaration tempGeneralDeclaration";
	private static final String _SQL_COUNT_TEMPGENERALDECLARATION_WHERE = "SELECT COUNT(tempGeneralDeclaration) FROM TempGeneralDeclaration tempGeneralDeclaration WHERE ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"tempGeneralDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempGeneralDeclaration.documentYear = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2 =
		"tempGeneralDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempGeneralDeclaration.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempGeneralDeclaration.requestState = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempGeneralDeclaration.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempGeneralDeclaration.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempGeneralDeclaration.requestCode IS NULL OR tempGeneralDeclaration.requestCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempGeneralDeclaration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempGeneralDeclaration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempGeneralDeclaration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempGeneralDeclarationPersistenceImpl.class);
	private static TempGeneralDeclaration _nullTempGeneralDeclaration = new TempGeneralDeclarationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempGeneralDeclaration> toCacheModel() {
				return _nullTempGeneralDeclarationCacheModel;
			}
		};

	private static CacheModel<TempGeneralDeclaration> _nullTempGeneralDeclarationCacheModel =
		new CacheModel<TempGeneralDeclaration>() {
			public TempGeneralDeclaration toEntityModel() {
				return _nullTempGeneralDeclaration;
			}
		};
}