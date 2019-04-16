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

package vn.gt.dao.noticeandmessage.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.gt.dao.noticeandmessage.model.TempShipStoresItems;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestFieldLocalService;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestFieldService;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestLocalService;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestService;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestFieldLocalService;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestFieldService;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalService;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestService;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceForTransitLocalService;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceForTransitService;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalService;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceService;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalService;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitService;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalService;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceService;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderChanelLocalService;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalService;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderService;
import vn.gt.dao.noticeandmessage.service.ModifyLocalService;
import vn.gt.dao.noticeandmessage.service.ModifyService;
import vn.gt.dao.noticeandmessage.service.NoticeShipMessageLocalService;
import vn.gt.dao.noticeandmessage.service.NoticeShipMessageService;
import vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalService;
import vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineService;
import vn.gt.dao.noticeandmessage.service.TempAttachmentDeclarationHealthLocalService;
import vn.gt.dao.noticeandmessage.service.TempAttachmentDeclarationHealthService;
import vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalService;
import vn.gt.dao.noticeandmessage.service.TempCargoDeclarationService;
import vn.gt.dao.noticeandmessage.service.TempCargoItemsLocalService;
import vn.gt.dao.noticeandmessage.service.TempCargoItemsService;
import vn.gt.dao.noticeandmessage.service.TempCrewDetailsLocalService;
import vn.gt.dao.noticeandmessage.service.TempCrewDetailsService;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalService;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationService;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsItemsLocalService;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsItemsService;
import vn.gt.dao.noticeandmessage.service.TempCrewListLocalService;
import vn.gt.dao.noticeandmessage.service.TempCrewListService;
import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsItemsLocalService;
import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsItemsService;
import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalService;
import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestService;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForAnimalQuarantineLocalService;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForAnimalQuarantineService;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForPlantQuarantineLocalService;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForPlantQuarantineService;
import vn.gt.dao.noticeandmessage.service.TempDeclarationOfHealthLocalService;
import vn.gt.dao.noticeandmessage.service.TempDeclarationOfHealthService;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalService;
import vn.gt.dao.noticeandmessage.service.TempDocumentService;
import vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalService;
import vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationService;
import vn.gt.dao.noticeandmessage.service.TempGoodsItemsLocalService;
import vn.gt.dao.noticeandmessage.service.TempGoodsItemsService;
import vn.gt.dao.noticeandmessage.service.TempHealthCrewPassengerListLocalService;
import vn.gt.dao.noticeandmessage.service.TempHealthCrewPassengerListService;
import vn.gt.dao.noticeandmessage.service.TempHealthQuestionLocalService;
import vn.gt.dao.noticeandmessage.service.TempHealthQuestionService;
import vn.gt.dao.noticeandmessage.service.TempMaritimePaymentConfigLocalService;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalService;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageService;
import vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalService;
import vn.gt.dao.noticeandmessage.service.TempPassengerDetailsService;
import vn.gt.dao.noticeandmessage.service.TempPassengerListLocalService;
import vn.gt.dao.noticeandmessage.service.TempPassengerListService;
import vn.gt.dao.noticeandmessage.service.TempPersonListLocalService;
import vn.gt.dao.noticeandmessage.service.TempPlantQuarantineLocalService;
import vn.gt.dao.noticeandmessage.service.TempPlantQuarantineService;
import vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalService;
import vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageService;
import vn.gt.dao.noticeandmessage.service.TempShipSecurityPortItemsLocalService;
import vn.gt.dao.noticeandmessage.service.TempShipSecurityPortItemsService;
import vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationLocalService;
import vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationService;
import vn.gt.dao.noticeandmessage.service.TempShipStoresItemsLocalService;
import vn.gt.dao.noticeandmessage.service.TempShipStoresItemsService;
import vn.gt.dao.noticeandmessage.service.TempUnitGeneralLocalService;
import vn.gt.dao.noticeandmessage.service.TempUnitGeneralService;
import vn.gt.dao.noticeandmessage.service.TempWasteListLocalService;
import vn.gt.dao.noticeandmessage.service.ViewHoanThanhThuTucLocalService;
import vn.gt.dao.noticeandmessage.service.ViewHoanThanhThuTucService;
import vn.gt.dao.noticeandmessage.service.persistence.HistoryInterfaceRequestFieldPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.HistoryInterfaceRequestFinder;
import vn.gt.dao.noticeandmessage.service.persistence.HistoryInterfaceRequestPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.InterfaceRequestFieldPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.InterfaceRequestFinder;
import vn.gt.dao.noticeandmessage.service.persistence.InterfaceRequestPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.IssueAcceptanceFinder;
import vn.gt.dao.noticeandmessage.service.persistence.IssueAcceptanceForTransitPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.IssueAcceptancePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.IssuePermissionForTransitFinder;
import vn.gt.dao.noticeandmessage.service.persistence.IssuePermissionForTransitPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.IssuePortClearanceFinder;
import vn.gt.dao.noticeandmessage.service.persistence.IssuePortClearancePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderFinder;
import vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.ModifyPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.NoticeShipMessagePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempAnimalQuarantineFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempAnimalQuarantinePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempAttachmentDeclarationHealthPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempCargoDeclarationFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempCargoDeclarationPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempCargoItemsPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempCrewDetailsPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempCrewEffectsDeclarationFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempCrewEffectsDeclarationPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempCrewEffectsItemsFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempCrewEffectsItemsPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempCrewListFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempCrewListPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempDangerousGoodsItemsPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempDangerousGoodsNanifestFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempDangerousGoodsNanifestPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempDeclarationForAnimalQuarantinePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempDeclarationForPlantQuarantinePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempDeclarationOfHealthFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempDeclarationOfHealthPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempDocumentFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempDocumentPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempGeneralDeclarationFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempGeneralDeclarationPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempGoodsItemsPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempHealthCrewPassengerListPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempHealthQuestionPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempMaritimePaymentConfigPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempNoTiceShipMessageFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempNoTiceShipMessagePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempPassengerDetailsPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempPassengerListFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempPassengerListPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempPersonListPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempPlantQuarantineFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempPlantQuarantinePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempShipSecurityMessageFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempShipSecurityMessagePersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempShipSecurityPortItemsFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempShipSecurityPortItemsPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempShipStoresDeclarationFinder;
import vn.gt.dao.noticeandmessage.service.persistence.TempShipStoresDeclarationPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempShipStoresItemsPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempUnitGeneralPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.TempWasteListPersistence;
import vn.gt.dao.noticeandmessage.service.persistence.ViewHoanThanhThuTucFinder;
import vn.gt.dao.noticeandmessage.service.persistence.ViewHoanThanhThuTucPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the temp ship stores items local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.gt.dao.noticeandmessage.service.impl.TempShipStoresItemsLocalServiceImpl}.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.impl.TempShipStoresItemsLocalServiceImpl
 * @see vn.gt.dao.noticeandmessage.service.TempShipStoresItemsLocalServiceUtil
 * @generated
 */
public abstract class TempShipStoresItemsLocalServiceBaseImpl
	implements TempShipStoresItemsLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.gt.dao.noticeandmessage.service.TempShipStoresItemsLocalServiceUtil} to access the temp ship stores items local service.
	 */

	/**
	 * Adds the temp ship stores items to the database. Also notifies the appropriate model listeners.
	 *
	 * @param tempShipStoresItems the temp ship stores items
	 * @return the temp ship stores items that was added
	 * @throws SystemException if a system exception occurred
	 */
	public TempShipStoresItems addTempShipStoresItems(
		TempShipStoresItems tempShipStoresItems) throws SystemException {
		tempShipStoresItems.setNew(true);

		tempShipStoresItems = tempShipStoresItemsPersistence.update(tempShipStoresItems,
				false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(tempShipStoresItems);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return tempShipStoresItems;
	}

	/**
	 * Creates a new temp ship stores items with the primary key. Does not add the temp ship stores items to the database.
	 *
	 * @param id the primary key for the new temp ship stores items
	 * @return the new temp ship stores items
	 */
	public TempShipStoresItems createTempShipStoresItems(long id) {
		return tempShipStoresItemsPersistence.create(id);
	}

	/**
	 * Deletes the temp ship stores items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp ship stores items
	 * @throws PortalException if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteTempShipStoresItems(long id)
		throws PortalException, SystemException {
		TempShipStoresItems tempShipStoresItems = tempShipStoresItemsPersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(tempShipStoresItems);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the temp ship stores items from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tempShipStoresItems the temp ship stores items
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteTempShipStoresItems(
		TempShipStoresItems tempShipStoresItems) throws SystemException {
		tempShipStoresItemsPersistence.remove(tempShipStoresItems);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(tempShipStoresItems);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return tempShipStoresItemsPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return tempShipStoresItemsPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return tempShipStoresItemsPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return tempShipStoresItemsPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public TempShipStoresItems fetchTempShipStoresItems(long id)
		throws SystemException {
		return tempShipStoresItemsPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the temp ship stores items with the primary key.
	 *
	 * @param id the primary key of the temp ship stores items
	 * @return the temp ship stores items
	 * @throws PortalException if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempShipStoresItems getTempShipStoresItems(long id)
		throws PortalException, SystemException {
		return tempShipStoresItemsPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return tempShipStoresItemsPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the temp ship stores itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship stores itemses
	 * @param end the upper bound of the range of temp ship stores itemses (not inclusive)
	 * @return the range of temp ship stores itemses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempShipStoresItems> getTempShipStoresItemses(int start, int end)
		throws SystemException {
		return tempShipStoresItemsPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of temp ship stores itemses.
	 *
	 * @return the number of temp ship stores itemses
	 * @throws SystemException if a system exception occurred
	 */
	public int getTempShipStoresItemsesCount() throws SystemException {
		return tempShipStoresItemsPersistence.countAll();
	}

	/**
	 * Updates the temp ship stores items in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param tempShipStoresItems the temp ship stores items
	 * @return the temp ship stores items that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public TempShipStoresItems updateTempShipStoresItems(
		TempShipStoresItems tempShipStoresItems) throws SystemException {
		return updateTempShipStoresItems(tempShipStoresItems, true);
	}

	/**
	 * Updates the temp ship stores items in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param tempShipStoresItems the temp ship stores items
	 * @param merge whether to merge the temp ship stores items with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the temp ship stores items that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public TempShipStoresItems updateTempShipStoresItems(
		TempShipStoresItems tempShipStoresItems, boolean merge)
		throws SystemException {
		tempShipStoresItems.setNew(false);

		tempShipStoresItems = tempShipStoresItemsPersistence.update(tempShipStoresItems,
				merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(tempShipStoresItems);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return tempShipStoresItems;
	}

	/**
	 * Returns the history interface request local service.
	 *
	 * @return the history interface request local service
	 */
	public HistoryInterfaceRequestLocalService getHistoryInterfaceRequestLocalService() {
		return historyInterfaceRequestLocalService;
	}

	/**
	 * Sets the history interface request local service.
	 *
	 * @param historyInterfaceRequestLocalService the history interface request local service
	 */
	public void setHistoryInterfaceRequestLocalService(
		HistoryInterfaceRequestLocalService historyInterfaceRequestLocalService) {
		this.historyInterfaceRequestLocalService = historyInterfaceRequestLocalService;
	}

	/**
	 * Returns the history interface request remote service.
	 *
	 * @return the history interface request remote service
	 */
	public HistoryInterfaceRequestService getHistoryInterfaceRequestService() {
		return historyInterfaceRequestService;
	}

	/**
	 * Sets the history interface request remote service.
	 *
	 * @param historyInterfaceRequestService the history interface request remote service
	 */
	public void setHistoryInterfaceRequestService(
		HistoryInterfaceRequestService historyInterfaceRequestService) {
		this.historyInterfaceRequestService = historyInterfaceRequestService;
	}

	/**
	 * Returns the history interface request persistence.
	 *
	 * @return the history interface request persistence
	 */
	public HistoryInterfaceRequestPersistence getHistoryInterfaceRequestPersistence() {
		return historyInterfaceRequestPersistence;
	}

	/**
	 * Sets the history interface request persistence.
	 *
	 * @param historyInterfaceRequestPersistence the history interface request persistence
	 */
	public void setHistoryInterfaceRequestPersistence(
		HistoryInterfaceRequestPersistence historyInterfaceRequestPersistence) {
		this.historyInterfaceRequestPersistence = historyInterfaceRequestPersistence;
	}

	/**
	 * Returns the history interface request finder.
	 *
	 * @return the history interface request finder
	 */
	public HistoryInterfaceRequestFinder getHistoryInterfaceRequestFinder() {
		return historyInterfaceRequestFinder;
	}

	/**
	 * Sets the history interface request finder.
	 *
	 * @param historyInterfaceRequestFinder the history interface request finder
	 */
	public void setHistoryInterfaceRequestFinder(
		HistoryInterfaceRequestFinder historyInterfaceRequestFinder) {
		this.historyInterfaceRequestFinder = historyInterfaceRequestFinder;
	}

	/**
	 * Returns the history interface request field local service.
	 *
	 * @return the history interface request field local service
	 */
	public HistoryInterfaceRequestFieldLocalService getHistoryInterfaceRequestFieldLocalService() {
		return historyInterfaceRequestFieldLocalService;
	}

	/**
	 * Sets the history interface request field local service.
	 *
	 * @param historyInterfaceRequestFieldLocalService the history interface request field local service
	 */
	public void setHistoryInterfaceRequestFieldLocalService(
		HistoryInterfaceRequestFieldLocalService historyInterfaceRequestFieldLocalService) {
		this.historyInterfaceRequestFieldLocalService = historyInterfaceRequestFieldLocalService;
	}

	/**
	 * Returns the history interface request field remote service.
	 *
	 * @return the history interface request field remote service
	 */
	public HistoryInterfaceRequestFieldService getHistoryInterfaceRequestFieldService() {
		return historyInterfaceRequestFieldService;
	}

	/**
	 * Sets the history interface request field remote service.
	 *
	 * @param historyInterfaceRequestFieldService the history interface request field remote service
	 */
	public void setHistoryInterfaceRequestFieldService(
		HistoryInterfaceRequestFieldService historyInterfaceRequestFieldService) {
		this.historyInterfaceRequestFieldService = historyInterfaceRequestFieldService;
	}

	/**
	 * Returns the history interface request field persistence.
	 *
	 * @return the history interface request field persistence
	 */
	public HistoryInterfaceRequestFieldPersistence getHistoryInterfaceRequestFieldPersistence() {
		return historyInterfaceRequestFieldPersistence;
	}

	/**
	 * Sets the history interface request field persistence.
	 *
	 * @param historyInterfaceRequestFieldPersistence the history interface request field persistence
	 */
	public void setHistoryInterfaceRequestFieldPersistence(
		HistoryInterfaceRequestFieldPersistence historyInterfaceRequestFieldPersistence) {
		this.historyInterfaceRequestFieldPersistence = historyInterfaceRequestFieldPersistence;
	}

	/**
	 * Returns the interface request local service.
	 *
	 * @return the interface request local service
	 */
	public InterfaceRequestLocalService getInterfaceRequestLocalService() {
		return interfaceRequestLocalService;
	}

	/**
	 * Sets the interface request local service.
	 *
	 * @param interfaceRequestLocalService the interface request local service
	 */
	public void setInterfaceRequestLocalService(
		InterfaceRequestLocalService interfaceRequestLocalService) {
		this.interfaceRequestLocalService = interfaceRequestLocalService;
	}

	/**
	 * Returns the interface request remote service.
	 *
	 * @return the interface request remote service
	 */
	public InterfaceRequestService getInterfaceRequestService() {
		return interfaceRequestService;
	}

	/**
	 * Sets the interface request remote service.
	 *
	 * @param interfaceRequestService the interface request remote service
	 */
	public void setInterfaceRequestService(
		InterfaceRequestService interfaceRequestService) {
		this.interfaceRequestService = interfaceRequestService;
	}

	/**
	 * Returns the interface request persistence.
	 *
	 * @return the interface request persistence
	 */
	public InterfaceRequestPersistence getInterfaceRequestPersistence() {
		return interfaceRequestPersistence;
	}

	/**
	 * Sets the interface request persistence.
	 *
	 * @param interfaceRequestPersistence the interface request persistence
	 */
	public void setInterfaceRequestPersistence(
		InterfaceRequestPersistence interfaceRequestPersistence) {
		this.interfaceRequestPersistence = interfaceRequestPersistence;
	}

	/**
	 * Returns the interface request finder.
	 *
	 * @return the interface request finder
	 */
	public InterfaceRequestFinder getInterfaceRequestFinder() {
		return interfaceRequestFinder;
	}

	/**
	 * Sets the interface request finder.
	 *
	 * @param interfaceRequestFinder the interface request finder
	 */
	public void setInterfaceRequestFinder(
		InterfaceRequestFinder interfaceRequestFinder) {
		this.interfaceRequestFinder = interfaceRequestFinder;
	}

	/**
	 * Returns the interface request field local service.
	 *
	 * @return the interface request field local service
	 */
	public InterfaceRequestFieldLocalService getInterfaceRequestFieldLocalService() {
		return interfaceRequestFieldLocalService;
	}

	/**
	 * Sets the interface request field local service.
	 *
	 * @param interfaceRequestFieldLocalService the interface request field local service
	 */
	public void setInterfaceRequestFieldLocalService(
		InterfaceRequestFieldLocalService interfaceRequestFieldLocalService) {
		this.interfaceRequestFieldLocalService = interfaceRequestFieldLocalService;
	}

	/**
	 * Returns the interface request field remote service.
	 *
	 * @return the interface request field remote service
	 */
	public InterfaceRequestFieldService getInterfaceRequestFieldService() {
		return interfaceRequestFieldService;
	}

	/**
	 * Sets the interface request field remote service.
	 *
	 * @param interfaceRequestFieldService the interface request field remote service
	 */
	public void setInterfaceRequestFieldService(
		InterfaceRequestFieldService interfaceRequestFieldService) {
		this.interfaceRequestFieldService = interfaceRequestFieldService;
	}

	/**
	 * Returns the interface request field persistence.
	 *
	 * @return the interface request field persistence
	 */
	public InterfaceRequestFieldPersistence getInterfaceRequestFieldPersistence() {
		return interfaceRequestFieldPersistence;
	}

	/**
	 * Sets the interface request field persistence.
	 *
	 * @param interfaceRequestFieldPersistence the interface request field persistence
	 */
	public void setInterfaceRequestFieldPersistence(
		InterfaceRequestFieldPersistence interfaceRequestFieldPersistence) {
		this.interfaceRequestFieldPersistence = interfaceRequestFieldPersistence;
	}

	/**
	 * Returns the issue acceptance local service.
	 *
	 * @return the issue acceptance local service
	 */
	public IssueAcceptanceLocalService getIssueAcceptanceLocalService() {
		return issueAcceptanceLocalService;
	}

	/**
	 * Sets the issue acceptance local service.
	 *
	 * @param issueAcceptanceLocalService the issue acceptance local service
	 */
	public void setIssueAcceptanceLocalService(
		IssueAcceptanceLocalService issueAcceptanceLocalService) {
		this.issueAcceptanceLocalService = issueAcceptanceLocalService;
	}

	/**
	 * Returns the issue acceptance remote service.
	 *
	 * @return the issue acceptance remote service
	 */
	public IssueAcceptanceService getIssueAcceptanceService() {
		return issueAcceptanceService;
	}

	/**
	 * Sets the issue acceptance remote service.
	 *
	 * @param issueAcceptanceService the issue acceptance remote service
	 */
	public void setIssueAcceptanceService(
		IssueAcceptanceService issueAcceptanceService) {
		this.issueAcceptanceService = issueAcceptanceService;
	}

	/**
	 * Returns the issue acceptance persistence.
	 *
	 * @return the issue acceptance persistence
	 */
	public IssueAcceptancePersistence getIssueAcceptancePersistence() {
		return issueAcceptancePersistence;
	}

	/**
	 * Sets the issue acceptance persistence.
	 *
	 * @param issueAcceptancePersistence the issue acceptance persistence
	 */
	public void setIssueAcceptancePersistence(
		IssueAcceptancePersistence issueAcceptancePersistence) {
		this.issueAcceptancePersistence = issueAcceptancePersistence;
	}

	/**
	 * Returns the issue acceptance finder.
	 *
	 * @return the issue acceptance finder
	 */
	public IssueAcceptanceFinder getIssueAcceptanceFinder() {
		return issueAcceptanceFinder;
	}

	/**
	 * Sets the issue acceptance finder.
	 *
	 * @param issueAcceptanceFinder the issue acceptance finder
	 */
	public void setIssueAcceptanceFinder(
		IssueAcceptanceFinder issueAcceptanceFinder) {
		this.issueAcceptanceFinder = issueAcceptanceFinder;
	}

	/**
	 * Returns the issue acceptance for transit local service.
	 *
	 * @return the issue acceptance for transit local service
	 */
	public IssueAcceptanceForTransitLocalService getIssueAcceptanceForTransitLocalService() {
		return issueAcceptanceForTransitLocalService;
	}

	/**
	 * Sets the issue acceptance for transit local service.
	 *
	 * @param issueAcceptanceForTransitLocalService the issue acceptance for transit local service
	 */
	public void setIssueAcceptanceForTransitLocalService(
		IssueAcceptanceForTransitLocalService issueAcceptanceForTransitLocalService) {
		this.issueAcceptanceForTransitLocalService = issueAcceptanceForTransitLocalService;
	}

	/**
	 * Returns the issue acceptance for transit remote service.
	 *
	 * @return the issue acceptance for transit remote service
	 */
	public IssueAcceptanceForTransitService getIssueAcceptanceForTransitService() {
		return issueAcceptanceForTransitService;
	}

	/**
	 * Sets the issue acceptance for transit remote service.
	 *
	 * @param issueAcceptanceForTransitService the issue acceptance for transit remote service
	 */
	public void setIssueAcceptanceForTransitService(
		IssueAcceptanceForTransitService issueAcceptanceForTransitService) {
		this.issueAcceptanceForTransitService = issueAcceptanceForTransitService;
	}

	/**
	 * Returns the issue acceptance for transit persistence.
	 *
	 * @return the issue acceptance for transit persistence
	 */
	public IssueAcceptanceForTransitPersistence getIssueAcceptanceForTransitPersistence() {
		return issueAcceptanceForTransitPersistence;
	}

	/**
	 * Sets the issue acceptance for transit persistence.
	 *
	 * @param issueAcceptanceForTransitPersistence the issue acceptance for transit persistence
	 */
	public void setIssueAcceptanceForTransitPersistence(
		IssueAcceptanceForTransitPersistence issueAcceptanceForTransitPersistence) {
		this.issueAcceptanceForTransitPersistence = issueAcceptanceForTransitPersistence;
	}

	/**
	 * Returns the issue permission for transit local service.
	 *
	 * @return the issue permission for transit local service
	 */
	public IssuePermissionForTransitLocalService getIssuePermissionForTransitLocalService() {
		return issuePermissionForTransitLocalService;
	}

	/**
	 * Sets the issue permission for transit local service.
	 *
	 * @param issuePermissionForTransitLocalService the issue permission for transit local service
	 */
	public void setIssuePermissionForTransitLocalService(
		IssuePermissionForTransitLocalService issuePermissionForTransitLocalService) {
		this.issuePermissionForTransitLocalService = issuePermissionForTransitLocalService;
	}

	/**
	 * Returns the issue permission for transit remote service.
	 *
	 * @return the issue permission for transit remote service
	 */
	public IssuePermissionForTransitService getIssuePermissionForTransitService() {
		return issuePermissionForTransitService;
	}

	/**
	 * Sets the issue permission for transit remote service.
	 *
	 * @param issuePermissionForTransitService the issue permission for transit remote service
	 */
	public void setIssuePermissionForTransitService(
		IssuePermissionForTransitService issuePermissionForTransitService) {
		this.issuePermissionForTransitService = issuePermissionForTransitService;
	}

	/**
	 * Returns the issue permission for transit persistence.
	 *
	 * @return the issue permission for transit persistence
	 */
	public IssuePermissionForTransitPersistence getIssuePermissionForTransitPersistence() {
		return issuePermissionForTransitPersistence;
	}

	/**
	 * Sets the issue permission for transit persistence.
	 *
	 * @param issuePermissionForTransitPersistence the issue permission for transit persistence
	 */
	public void setIssuePermissionForTransitPersistence(
		IssuePermissionForTransitPersistence issuePermissionForTransitPersistence) {
		this.issuePermissionForTransitPersistence = issuePermissionForTransitPersistence;
	}

	/**
	 * Returns the issue permission for transit finder.
	 *
	 * @return the issue permission for transit finder
	 */
	public IssuePermissionForTransitFinder getIssuePermissionForTransitFinder() {
		return issuePermissionForTransitFinder;
	}

	/**
	 * Sets the issue permission for transit finder.
	 *
	 * @param issuePermissionForTransitFinder the issue permission for transit finder
	 */
	public void setIssuePermissionForTransitFinder(
		IssuePermissionForTransitFinder issuePermissionForTransitFinder) {
		this.issuePermissionForTransitFinder = issuePermissionForTransitFinder;
	}

	/**
	 * Returns the issue port clearance local service.
	 *
	 * @return the issue port clearance local service
	 */
	public IssuePortClearanceLocalService getIssuePortClearanceLocalService() {
		return issuePortClearanceLocalService;
	}

	/**
	 * Sets the issue port clearance local service.
	 *
	 * @param issuePortClearanceLocalService the issue port clearance local service
	 */
	public void setIssuePortClearanceLocalService(
		IssuePortClearanceLocalService issuePortClearanceLocalService) {
		this.issuePortClearanceLocalService = issuePortClearanceLocalService;
	}

	/**
	 * Returns the issue port clearance remote service.
	 *
	 * @return the issue port clearance remote service
	 */
	public IssuePortClearanceService getIssuePortClearanceService() {
		return issuePortClearanceService;
	}

	/**
	 * Sets the issue port clearance remote service.
	 *
	 * @param issuePortClearanceService the issue port clearance remote service
	 */
	public void setIssuePortClearanceService(
		IssuePortClearanceService issuePortClearanceService) {
		this.issuePortClearanceService = issuePortClearanceService;
	}

	/**
	 * Returns the issue port clearance persistence.
	 *
	 * @return the issue port clearance persistence
	 */
	public IssuePortClearancePersistence getIssuePortClearancePersistence() {
		return issuePortClearancePersistence;
	}

	/**
	 * Sets the issue port clearance persistence.
	 *
	 * @param issuePortClearancePersistence the issue port clearance persistence
	 */
	public void setIssuePortClearancePersistence(
		IssuePortClearancePersistence issuePortClearancePersistence) {
		this.issuePortClearancePersistence = issuePortClearancePersistence;
	}

	/**
	 * Returns the issue port clearance finder.
	 *
	 * @return the issue port clearance finder
	 */
	public IssuePortClearanceFinder getIssuePortClearanceFinder() {
		return issuePortClearanceFinder;
	}

	/**
	 * Sets the issue port clearance finder.
	 *
	 * @param issuePortClearanceFinder the issue port clearance finder
	 */
	public void setIssuePortClearanceFinder(
		IssuePortClearanceFinder issuePortClearanceFinder) {
		this.issuePortClearanceFinder = issuePortClearanceFinder;
	}

	/**
	 * Returns the issue shifting order local service.
	 *
	 * @return the issue shifting order local service
	 */
	public IssueShiftingOrderLocalService getIssueShiftingOrderLocalService() {
		return issueShiftingOrderLocalService;
	}

	/**
	 * Sets the issue shifting order local service.
	 *
	 * @param issueShiftingOrderLocalService the issue shifting order local service
	 */
	public void setIssueShiftingOrderLocalService(
		IssueShiftingOrderLocalService issueShiftingOrderLocalService) {
		this.issueShiftingOrderLocalService = issueShiftingOrderLocalService;
	}

	/**
	 * Returns the issue shifting order remote service.
	 *
	 * @return the issue shifting order remote service
	 */
	public IssueShiftingOrderService getIssueShiftingOrderService() {
		return issueShiftingOrderService;
	}

	/**
	 * Sets the issue shifting order remote service.
	 *
	 * @param issueShiftingOrderService the issue shifting order remote service
	 */
	public void setIssueShiftingOrderService(
		IssueShiftingOrderService issueShiftingOrderService) {
		this.issueShiftingOrderService = issueShiftingOrderService;
	}

	/**
	 * Returns the issue shifting order persistence.
	 *
	 * @return the issue shifting order persistence
	 */
	public IssueShiftingOrderPersistence getIssueShiftingOrderPersistence() {
		return issueShiftingOrderPersistence;
	}

	/**
	 * Sets the issue shifting order persistence.
	 *
	 * @param issueShiftingOrderPersistence the issue shifting order persistence
	 */
	public void setIssueShiftingOrderPersistence(
		IssueShiftingOrderPersistence issueShiftingOrderPersistence) {
		this.issueShiftingOrderPersistence = issueShiftingOrderPersistence;
	}

	/**
	 * Returns the issue shifting order finder.
	 *
	 * @return the issue shifting order finder
	 */
	public IssueShiftingOrderFinder getIssueShiftingOrderFinder() {
		return issueShiftingOrderFinder;
	}

	/**
	 * Sets the issue shifting order finder.
	 *
	 * @param issueShiftingOrderFinder the issue shifting order finder
	 */
	public void setIssueShiftingOrderFinder(
		IssueShiftingOrderFinder issueShiftingOrderFinder) {
		this.issueShiftingOrderFinder = issueShiftingOrderFinder;
	}

	/**
	 * Returns the issue shifting order chanel local service.
	 *
	 * @return the issue shifting order chanel local service
	 */
	public IssueShiftingOrderChanelLocalService getIssueShiftingOrderChanelLocalService() {
		return issueShiftingOrderChanelLocalService;
	}

	/**
	 * Sets the issue shifting order chanel local service.
	 *
	 * @param issueShiftingOrderChanelLocalService the issue shifting order chanel local service
	 */
	public void setIssueShiftingOrderChanelLocalService(
		IssueShiftingOrderChanelLocalService issueShiftingOrderChanelLocalService) {
		this.issueShiftingOrderChanelLocalService = issueShiftingOrderChanelLocalService;
	}

	/**
	 * Returns the issue shifting order chanel persistence.
	 *
	 * @return the issue shifting order chanel persistence
	 */
	public IssueShiftingOrderChanelPersistence getIssueShiftingOrderChanelPersistence() {
		return issueShiftingOrderChanelPersistence;
	}

	/**
	 * Sets the issue shifting order chanel persistence.
	 *
	 * @param issueShiftingOrderChanelPersistence the issue shifting order chanel persistence
	 */
	public void setIssueShiftingOrderChanelPersistence(
		IssueShiftingOrderChanelPersistence issueShiftingOrderChanelPersistence) {
		this.issueShiftingOrderChanelPersistence = issueShiftingOrderChanelPersistence;
	}

	/**
	 * Returns the modify local service.
	 *
	 * @return the modify local service
	 */
	public ModifyLocalService getModifyLocalService() {
		return modifyLocalService;
	}

	/**
	 * Sets the modify local service.
	 *
	 * @param modifyLocalService the modify local service
	 */
	public void setModifyLocalService(ModifyLocalService modifyLocalService) {
		this.modifyLocalService = modifyLocalService;
	}

	/**
	 * Returns the modify remote service.
	 *
	 * @return the modify remote service
	 */
	public ModifyService getModifyService() {
		return modifyService;
	}

	/**
	 * Sets the modify remote service.
	 *
	 * @param modifyService the modify remote service
	 */
	public void setModifyService(ModifyService modifyService) {
		this.modifyService = modifyService;
	}

	/**
	 * Returns the modify persistence.
	 *
	 * @return the modify persistence
	 */
	public ModifyPersistence getModifyPersistence() {
		return modifyPersistence;
	}

	/**
	 * Sets the modify persistence.
	 *
	 * @param modifyPersistence the modify persistence
	 */
	public void setModifyPersistence(ModifyPersistence modifyPersistence) {
		this.modifyPersistence = modifyPersistence;
	}

	/**
	 * Returns the notice ship message local service.
	 *
	 * @return the notice ship message local service
	 */
	public NoticeShipMessageLocalService getNoticeShipMessageLocalService() {
		return noticeShipMessageLocalService;
	}

	/**
	 * Sets the notice ship message local service.
	 *
	 * @param noticeShipMessageLocalService the notice ship message local service
	 */
	public void setNoticeShipMessageLocalService(
		NoticeShipMessageLocalService noticeShipMessageLocalService) {
		this.noticeShipMessageLocalService = noticeShipMessageLocalService;
	}

	/**
	 * Returns the notice ship message remote service.
	 *
	 * @return the notice ship message remote service
	 */
	public NoticeShipMessageService getNoticeShipMessageService() {
		return noticeShipMessageService;
	}

	/**
	 * Sets the notice ship message remote service.
	 *
	 * @param noticeShipMessageService the notice ship message remote service
	 */
	public void setNoticeShipMessageService(
		NoticeShipMessageService noticeShipMessageService) {
		this.noticeShipMessageService = noticeShipMessageService;
	}

	/**
	 * Returns the notice ship message persistence.
	 *
	 * @return the notice ship message persistence
	 */
	public NoticeShipMessagePersistence getNoticeShipMessagePersistence() {
		return noticeShipMessagePersistence;
	}

	/**
	 * Sets the notice ship message persistence.
	 *
	 * @param noticeShipMessagePersistence the notice ship message persistence
	 */
	public void setNoticeShipMessagePersistence(
		NoticeShipMessagePersistence noticeShipMessagePersistence) {
		this.noticeShipMessagePersistence = noticeShipMessagePersistence;
	}

	/**
	 * Returns the temp animal quarantine local service.
	 *
	 * @return the temp animal quarantine local service
	 */
	public TempAnimalQuarantineLocalService getTempAnimalQuarantineLocalService() {
		return tempAnimalQuarantineLocalService;
	}

	/**
	 * Sets the temp animal quarantine local service.
	 *
	 * @param tempAnimalQuarantineLocalService the temp animal quarantine local service
	 */
	public void setTempAnimalQuarantineLocalService(
		TempAnimalQuarantineLocalService tempAnimalQuarantineLocalService) {
		this.tempAnimalQuarantineLocalService = tempAnimalQuarantineLocalService;
	}

	/**
	 * Returns the temp animal quarantine remote service.
	 *
	 * @return the temp animal quarantine remote service
	 */
	public TempAnimalQuarantineService getTempAnimalQuarantineService() {
		return tempAnimalQuarantineService;
	}

	/**
	 * Sets the temp animal quarantine remote service.
	 *
	 * @param tempAnimalQuarantineService the temp animal quarantine remote service
	 */
	public void setTempAnimalQuarantineService(
		TempAnimalQuarantineService tempAnimalQuarantineService) {
		this.tempAnimalQuarantineService = tempAnimalQuarantineService;
	}

	/**
	 * Returns the temp animal quarantine persistence.
	 *
	 * @return the temp animal quarantine persistence
	 */
	public TempAnimalQuarantinePersistence getTempAnimalQuarantinePersistence() {
		return tempAnimalQuarantinePersistence;
	}

	/**
	 * Sets the temp animal quarantine persistence.
	 *
	 * @param tempAnimalQuarantinePersistence the temp animal quarantine persistence
	 */
	public void setTempAnimalQuarantinePersistence(
		TempAnimalQuarantinePersistence tempAnimalQuarantinePersistence) {
		this.tempAnimalQuarantinePersistence = tempAnimalQuarantinePersistence;
	}

	/**
	 * Returns the temp animal quarantine finder.
	 *
	 * @return the temp animal quarantine finder
	 */
	public TempAnimalQuarantineFinder getTempAnimalQuarantineFinder() {
		return tempAnimalQuarantineFinder;
	}

	/**
	 * Sets the temp animal quarantine finder.
	 *
	 * @param tempAnimalQuarantineFinder the temp animal quarantine finder
	 */
	public void setTempAnimalQuarantineFinder(
		TempAnimalQuarantineFinder tempAnimalQuarantineFinder) {
		this.tempAnimalQuarantineFinder = tempAnimalQuarantineFinder;
	}

	/**
	 * Returns the temp attachment declaration health local service.
	 *
	 * @return the temp attachment declaration health local service
	 */
	public TempAttachmentDeclarationHealthLocalService getTempAttachmentDeclarationHealthLocalService() {
		return tempAttachmentDeclarationHealthLocalService;
	}

	/**
	 * Sets the temp attachment declaration health local service.
	 *
	 * @param tempAttachmentDeclarationHealthLocalService the temp attachment declaration health local service
	 */
	public void setTempAttachmentDeclarationHealthLocalService(
		TempAttachmentDeclarationHealthLocalService tempAttachmentDeclarationHealthLocalService) {
		this.tempAttachmentDeclarationHealthLocalService = tempAttachmentDeclarationHealthLocalService;
	}

	/**
	 * Returns the temp attachment declaration health remote service.
	 *
	 * @return the temp attachment declaration health remote service
	 */
	public TempAttachmentDeclarationHealthService getTempAttachmentDeclarationHealthService() {
		return tempAttachmentDeclarationHealthService;
	}

	/**
	 * Sets the temp attachment declaration health remote service.
	 *
	 * @param tempAttachmentDeclarationHealthService the temp attachment declaration health remote service
	 */
	public void setTempAttachmentDeclarationHealthService(
		TempAttachmentDeclarationHealthService tempAttachmentDeclarationHealthService) {
		this.tempAttachmentDeclarationHealthService = tempAttachmentDeclarationHealthService;
	}

	/**
	 * Returns the temp attachment declaration health persistence.
	 *
	 * @return the temp attachment declaration health persistence
	 */
	public TempAttachmentDeclarationHealthPersistence getTempAttachmentDeclarationHealthPersistence() {
		return tempAttachmentDeclarationHealthPersistence;
	}

	/**
	 * Sets the temp attachment declaration health persistence.
	 *
	 * @param tempAttachmentDeclarationHealthPersistence the temp attachment declaration health persistence
	 */
	public void setTempAttachmentDeclarationHealthPersistence(
		TempAttachmentDeclarationHealthPersistence tempAttachmentDeclarationHealthPersistence) {
		this.tempAttachmentDeclarationHealthPersistence = tempAttachmentDeclarationHealthPersistence;
	}

	/**
	 * Returns the temp cargo declaration local service.
	 *
	 * @return the temp cargo declaration local service
	 */
	public TempCargoDeclarationLocalService getTempCargoDeclarationLocalService() {
		return tempCargoDeclarationLocalService;
	}

	/**
	 * Sets the temp cargo declaration local service.
	 *
	 * @param tempCargoDeclarationLocalService the temp cargo declaration local service
	 */
	public void setTempCargoDeclarationLocalService(
		TempCargoDeclarationLocalService tempCargoDeclarationLocalService) {
		this.tempCargoDeclarationLocalService = tempCargoDeclarationLocalService;
	}

	/**
	 * Returns the temp cargo declaration remote service.
	 *
	 * @return the temp cargo declaration remote service
	 */
	public TempCargoDeclarationService getTempCargoDeclarationService() {
		return tempCargoDeclarationService;
	}

	/**
	 * Sets the temp cargo declaration remote service.
	 *
	 * @param tempCargoDeclarationService the temp cargo declaration remote service
	 */
	public void setTempCargoDeclarationService(
		TempCargoDeclarationService tempCargoDeclarationService) {
		this.tempCargoDeclarationService = tempCargoDeclarationService;
	}

	/**
	 * Returns the temp cargo declaration persistence.
	 *
	 * @return the temp cargo declaration persistence
	 */
	public TempCargoDeclarationPersistence getTempCargoDeclarationPersistence() {
		return tempCargoDeclarationPersistence;
	}

	/**
	 * Sets the temp cargo declaration persistence.
	 *
	 * @param tempCargoDeclarationPersistence the temp cargo declaration persistence
	 */
	public void setTempCargoDeclarationPersistence(
		TempCargoDeclarationPersistence tempCargoDeclarationPersistence) {
		this.tempCargoDeclarationPersistence = tempCargoDeclarationPersistence;
	}

	/**
	 * Returns the temp cargo declaration finder.
	 *
	 * @return the temp cargo declaration finder
	 */
	public TempCargoDeclarationFinder getTempCargoDeclarationFinder() {
		return tempCargoDeclarationFinder;
	}

	/**
	 * Sets the temp cargo declaration finder.
	 *
	 * @param tempCargoDeclarationFinder the temp cargo declaration finder
	 */
	public void setTempCargoDeclarationFinder(
		TempCargoDeclarationFinder tempCargoDeclarationFinder) {
		this.tempCargoDeclarationFinder = tempCargoDeclarationFinder;
	}

	/**
	 * Returns the temp cargo items local service.
	 *
	 * @return the temp cargo items local service
	 */
	public TempCargoItemsLocalService getTempCargoItemsLocalService() {
		return tempCargoItemsLocalService;
	}

	/**
	 * Sets the temp cargo items local service.
	 *
	 * @param tempCargoItemsLocalService the temp cargo items local service
	 */
	public void setTempCargoItemsLocalService(
		TempCargoItemsLocalService tempCargoItemsLocalService) {
		this.tempCargoItemsLocalService = tempCargoItemsLocalService;
	}

	/**
	 * Returns the temp cargo items remote service.
	 *
	 * @return the temp cargo items remote service
	 */
	public TempCargoItemsService getTempCargoItemsService() {
		return tempCargoItemsService;
	}

	/**
	 * Sets the temp cargo items remote service.
	 *
	 * @param tempCargoItemsService the temp cargo items remote service
	 */
	public void setTempCargoItemsService(
		TempCargoItemsService tempCargoItemsService) {
		this.tempCargoItemsService = tempCargoItemsService;
	}

	/**
	 * Returns the temp cargo items persistence.
	 *
	 * @return the temp cargo items persistence
	 */
	public TempCargoItemsPersistence getTempCargoItemsPersistence() {
		return tempCargoItemsPersistence;
	}

	/**
	 * Sets the temp cargo items persistence.
	 *
	 * @param tempCargoItemsPersistence the temp cargo items persistence
	 */
	public void setTempCargoItemsPersistence(
		TempCargoItemsPersistence tempCargoItemsPersistence) {
		this.tempCargoItemsPersistence = tempCargoItemsPersistence;
	}

	/**
	 * Returns the temp crew details local service.
	 *
	 * @return the temp crew details local service
	 */
	public TempCrewDetailsLocalService getTempCrewDetailsLocalService() {
		return tempCrewDetailsLocalService;
	}

	/**
	 * Sets the temp crew details local service.
	 *
	 * @param tempCrewDetailsLocalService the temp crew details local service
	 */
	public void setTempCrewDetailsLocalService(
		TempCrewDetailsLocalService tempCrewDetailsLocalService) {
		this.tempCrewDetailsLocalService = tempCrewDetailsLocalService;
	}

	/**
	 * Returns the temp crew details remote service.
	 *
	 * @return the temp crew details remote service
	 */
	public TempCrewDetailsService getTempCrewDetailsService() {
		return tempCrewDetailsService;
	}

	/**
	 * Sets the temp crew details remote service.
	 *
	 * @param tempCrewDetailsService the temp crew details remote service
	 */
	public void setTempCrewDetailsService(
		TempCrewDetailsService tempCrewDetailsService) {
		this.tempCrewDetailsService = tempCrewDetailsService;
	}

	/**
	 * Returns the temp crew details persistence.
	 *
	 * @return the temp crew details persistence
	 */
	public TempCrewDetailsPersistence getTempCrewDetailsPersistence() {
		return tempCrewDetailsPersistence;
	}

	/**
	 * Sets the temp crew details persistence.
	 *
	 * @param tempCrewDetailsPersistence the temp crew details persistence
	 */
	public void setTempCrewDetailsPersistence(
		TempCrewDetailsPersistence tempCrewDetailsPersistence) {
		this.tempCrewDetailsPersistence = tempCrewDetailsPersistence;
	}

	/**
	 * Returns the temp crew effects declaration local service.
	 *
	 * @return the temp crew effects declaration local service
	 */
	public TempCrewEffectsDeclarationLocalService getTempCrewEffectsDeclarationLocalService() {
		return tempCrewEffectsDeclarationLocalService;
	}

	/**
	 * Sets the temp crew effects declaration local service.
	 *
	 * @param tempCrewEffectsDeclarationLocalService the temp crew effects declaration local service
	 */
	public void setTempCrewEffectsDeclarationLocalService(
		TempCrewEffectsDeclarationLocalService tempCrewEffectsDeclarationLocalService) {
		this.tempCrewEffectsDeclarationLocalService = tempCrewEffectsDeclarationLocalService;
	}

	/**
	 * Returns the temp crew effects declaration remote service.
	 *
	 * @return the temp crew effects declaration remote service
	 */
	public TempCrewEffectsDeclarationService getTempCrewEffectsDeclarationService() {
		return tempCrewEffectsDeclarationService;
	}

	/**
	 * Sets the temp crew effects declaration remote service.
	 *
	 * @param tempCrewEffectsDeclarationService the temp crew effects declaration remote service
	 */
	public void setTempCrewEffectsDeclarationService(
		TempCrewEffectsDeclarationService tempCrewEffectsDeclarationService) {
		this.tempCrewEffectsDeclarationService = tempCrewEffectsDeclarationService;
	}

	/**
	 * Returns the temp crew effects declaration persistence.
	 *
	 * @return the temp crew effects declaration persistence
	 */
	public TempCrewEffectsDeclarationPersistence getTempCrewEffectsDeclarationPersistence() {
		return tempCrewEffectsDeclarationPersistence;
	}

	/**
	 * Sets the temp crew effects declaration persistence.
	 *
	 * @param tempCrewEffectsDeclarationPersistence the temp crew effects declaration persistence
	 */
	public void setTempCrewEffectsDeclarationPersistence(
		TempCrewEffectsDeclarationPersistence tempCrewEffectsDeclarationPersistence) {
		this.tempCrewEffectsDeclarationPersistence = tempCrewEffectsDeclarationPersistence;
	}

	/**
	 * Returns the temp crew effects declaration finder.
	 *
	 * @return the temp crew effects declaration finder
	 */
	public TempCrewEffectsDeclarationFinder getTempCrewEffectsDeclarationFinder() {
		return tempCrewEffectsDeclarationFinder;
	}

	/**
	 * Sets the temp crew effects declaration finder.
	 *
	 * @param tempCrewEffectsDeclarationFinder the temp crew effects declaration finder
	 */
	public void setTempCrewEffectsDeclarationFinder(
		TempCrewEffectsDeclarationFinder tempCrewEffectsDeclarationFinder) {
		this.tempCrewEffectsDeclarationFinder = tempCrewEffectsDeclarationFinder;
	}

	/**
	 * Returns the temp crew effects items local service.
	 *
	 * @return the temp crew effects items local service
	 */
	public TempCrewEffectsItemsLocalService getTempCrewEffectsItemsLocalService() {
		return tempCrewEffectsItemsLocalService;
	}

	/**
	 * Sets the temp crew effects items local service.
	 *
	 * @param tempCrewEffectsItemsLocalService the temp crew effects items local service
	 */
	public void setTempCrewEffectsItemsLocalService(
		TempCrewEffectsItemsLocalService tempCrewEffectsItemsLocalService) {
		this.tempCrewEffectsItemsLocalService = tempCrewEffectsItemsLocalService;
	}

	/**
	 * Returns the temp crew effects items remote service.
	 *
	 * @return the temp crew effects items remote service
	 */
	public TempCrewEffectsItemsService getTempCrewEffectsItemsService() {
		return tempCrewEffectsItemsService;
	}

	/**
	 * Sets the temp crew effects items remote service.
	 *
	 * @param tempCrewEffectsItemsService the temp crew effects items remote service
	 */
	public void setTempCrewEffectsItemsService(
		TempCrewEffectsItemsService tempCrewEffectsItemsService) {
		this.tempCrewEffectsItemsService = tempCrewEffectsItemsService;
	}

	/**
	 * Returns the temp crew effects items persistence.
	 *
	 * @return the temp crew effects items persistence
	 */
	public TempCrewEffectsItemsPersistence getTempCrewEffectsItemsPersistence() {
		return tempCrewEffectsItemsPersistence;
	}

	/**
	 * Sets the temp crew effects items persistence.
	 *
	 * @param tempCrewEffectsItemsPersistence the temp crew effects items persistence
	 */
	public void setTempCrewEffectsItemsPersistence(
		TempCrewEffectsItemsPersistence tempCrewEffectsItemsPersistence) {
		this.tempCrewEffectsItemsPersistence = tempCrewEffectsItemsPersistence;
	}

	/**
	 * Returns the temp crew effects items finder.
	 *
	 * @return the temp crew effects items finder
	 */
	public TempCrewEffectsItemsFinder getTempCrewEffectsItemsFinder() {
		return tempCrewEffectsItemsFinder;
	}

	/**
	 * Sets the temp crew effects items finder.
	 *
	 * @param tempCrewEffectsItemsFinder the temp crew effects items finder
	 */
	public void setTempCrewEffectsItemsFinder(
		TempCrewEffectsItemsFinder tempCrewEffectsItemsFinder) {
		this.tempCrewEffectsItemsFinder = tempCrewEffectsItemsFinder;
	}

	/**
	 * Returns the temp crew list local service.
	 *
	 * @return the temp crew list local service
	 */
	public TempCrewListLocalService getTempCrewListLocalService() {
		return tempCrewListLocalService;
	}

	/**
	 * Sets the temp crew list local service.
	 *
	 * @param tempCrewListLocalService the temp crew list local service
	 */
	public void setTempCrewListLocalService(
		TempCrewListLocalService tempCrewListLocalService) {
		this.tempCrewListLocalService = tempCrewListLocalService;
	}

	/**
	 * Returns the temp crew list remote service.
	 *
	 * @return the temp crew list remote service
	 */
	public TempCrewListService getTempCrewListService() {
		return tempCrewListService;
	}

	/**
	 * Sets the temp crew list remote service.
	 *
	 * @param tempCrewListService the temp crew list remote service
	 */
	public void setTempCrewListService(TempCrewListService tempCrewListService) {
		this.tempCrewListService = tempCrewListService;
	}

	/**
	 * Returns the temp crew list persistence.
	 *
	 * @return the temp crew list persistence
	 */
	public TempCrewListPersistence getTempCrewListPersistence() {
		return tempCrewListPersistence;
	}

	/**
	 * Sets the temp crew list persistence.
	 *
	 * @param tempCrewListPersistence the temp crew list persistence
	 */
	public void setTempCrewListPersistence(
		TempCrewListPersistence tempCrewListPersistence) {
		this.tempCrewListPersistence = tempCrewListPersistence;
	}

	/**
	 * Returns the temp crew list finder.
	 *
	 * @return the temp crew list finder
	 */
	public TempCrewListFinder getTempCrewListFinder() {
		return tempCrewListFinder;
	}

	/**
	 * Sets the temp crew list finder.
	 *
	 * @param tempCrewListFinder the temp crew list finder
	 */
	public void setTempCrewListFinder(TempCrewListFinder tempCrewListFinder) {
		this.tempCrewListFinder = tempCrewListFinder;
	}

	/**
	 * Returns the temp dangerous goods items local service.
	 *
	 * @return the temp dangerous goods items local service
	 */
	public TempDangerousGoodsItemsLocalService getTempDangerousGoodsItemsLocalService() {
		return tempDangerousGoodsItemsLocalService;
	}

	/**
	 * Sets the temp dangerous goods items local service.
	 *
	 * @param tempDangerousGoodsItemsLocalService the temp dangerous goods items local service
	 */
	public void setTempDangerousGoodsItemsLocalService(
		TempDangerousGoodsItemsLocalService tempDangerousGoodsItemsLocalService) {
		this.tempDangerousGoodsItemsLocalService = tempDangerousGoodsItemsLocalService;
	}

	/**
	 * Returns the temp dangerous goods items remote service.
	 *
	 * @return the temp dangerous goods items remote service
	 */
	public TempDangerousGoodsItemsService getTempDangerousGoodsItemsService() {
		return tempDangerousGoodsItemsService;
	}

	/**
	 * Sets the temp dangerous goods items remote service.
	 *
	 * @param tempDangerousGoodsItemsService the temp dangerous goods items remote service
	 */
	public void setTempDangerousGoodsItemsService(
		TempDangerousGoodsItemsService tempDangerousGoodsItemsService) {
		this.tempDangerousGoodsItemsService = tempDangerousGoodsItemsService;
	}

	/**
	 * Returns the temp dangerous goods items persistence.
	 *
	 * @return the temp dangerous goods items persistence
	 */
	public TempDangerousGoodsItemsPersistence getTempDangerousGoodsItemsPersistence() {
		return tempDangerousGoodsItemsPersistence;
	}

	/**
	 * Sets the temp dangerous goods items persistence.
	 *
	 * @param tempDangerousGoodsItemsPersistence the temp dangerous goods items persistence
	 */
	public void setTempDangerousGoodsItemsPersistence(
		TempDangerousGoodsItemsPersistence tempDangerousGoodsItemsPersistence) {
		this.tempDangerousGoodsItemsPersistence = tempDangerousGoodsItemsPersistence;
	}

	/**
	 * Returns the temp dangerous goods nanifest local service.
	 *
	 * @return the temp dangerous goods nanifest local service
	 */
	public TempDangerousGoodsNanifestLocalService getTempDangerousGoodsNanifestLocalService() {
		return tempDangerousGoodsNanifestLocalService;
	}

	/**
	 * Sets the temp dangerous goods nanifest local service.
	 *
	 * @param tempDangerousGoodsNanifestLocalService the temp dangerous goods nanifest local service
	 */
	public void setTempDangerousGoodsNanifestLocalService(
		TempDangerousGoodsNanifestLocalService tempDangerousGoodsNanifestLocalService) {
		this.tempDangerousGoodsNanifestLocalService = tempDangerousGoodsNanifestLocalService;
	}

	/**
	 * Returns the temp dangerous goods nanifest remote service.
	 *
	 * @return the temp dangerous goods nanifest remote service
	 */
	public TempDangerousGoodsNanifestService getTempDangerousGoodsNanifestService() {
		return tempDangerousGoodsNanifestService;
	}

	/**
	 * Sets the temp dangerous goods nanifest remote service.
	 *
	 * @param tempDangerousGoodsNanifestService the temp dangerous goods nanifest remote service
	 */
	public void setTempDangerousGoodsNanifestService(
		TempDangerousGoodsNanifestService tempDangerousGoodsNanifestService) {
		this.tempDangerousGoodsNanifestService = tempDangerousGoodsNanifestService;
	}

	/**
	 * Returns the temp dangerous goods nanifest persistence.
	 *
	 * @return the temp dangerous goods nanifest persistence
	 */
	public TempDangerousGoodsNanifestPersistence getTempDangerousGoodsNanifestPersistence() {
		return tempDangerousGoodsNanifestPersistence;
	}

	/**
	 * Sets the temp dangerous goods nanifest persistence.
	 *
	 * @param tempDangerousGoodsNanifestPersistence the temp dangerous goods nanifest persistence
	 */
	public void setTempDangerousGoodsNanifestPersistence(
		TempDangerousGoodsNanifestPersistence tempDangerousGoodsNanifestPersistence) {
		this.tempDangerousGoodsNanifestPersistence = tempDangerousGoodsNanifestPersistence;
	}

	/**
	 * Returns the temp dangerous goods nanifest finder.
	 *
	 * @return the temp dangerous goods nanifest finder
	 */
	public TempDangerousGoodsNanifestFinder getTempDangerousGoodsNanifestFinder() {
		return tempDangerousGoodsNanifestFinder;
	}

	/**
	 * Sets the temp dangerous goods nanifest finder.
	 *
	 * @param tempDangerousGoodsNanifestFinder the temp dangerous goods nanifest finder
	 */
	public void setTempDangerousGoodsNanifestFinder(
		TempDangerousGoodsNanifestFinder tempDangerousGoodsNanifestFinder) {
		this.tempDangerousGoodsNanifestFinder = tempDangerousGoodsNanifestFinder;
	}

	/**
	 * Returns the temp declaration for animal quarantine local service.
	 *
	 * @return the temp declaration for animal quarantine local service
	 */
	public TempDeclarationForAnimalQuarantineLocalService getTempDeclarationForAnimalQuarantineLocalService() {
		return tempDeclarationForAnimalQuarantineLocalService;
	}

	/**
	 * Sets the temp declaration for animal quarantine local service.
	 *
	 * @param tempDeclarationForAnimalQuarantineLocalService the temp declaration for animal quarantine local service
	 */
	public void setTempDeclarationForAnimalQuarantineLocalService(
		TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService) {
		this.tempDeclarationForAnimalQuarantineLocalService = tempDeclarationForAnimalQuarantineLocalService;
	}

	/**
	 * Returns the temp declaration for animal quarantine remote service.
	 *
	 * @return the temp declaration for animal quarantine remote service
	 */
	public TempDeclarationForAnimalQuarantineService getTempDeclarationForAnimalQuarantineService() {
		return tempDeclarationForAnimalQuarantineService;
	}

	/**
	 * Sets the temp declaration for animal quarantine remote service.
	 *
	 * @param tempDeclarationForAnimalQuarantineService the temp declaration for animal quarantine remote service
	 */
	public void setTempDeclarationForAnimalQuarantineService(
		TempDeclarationForAnimalQuarantineService tempDeclarationForAnimalQuarantineService) {
		this.tempDeclarationForAnimalQuarantineService = tempDeclarationForAnimalQuarantineService;
	}

	/**
	 * Returns the temp declaration for animal quarantine persistence.
	 *
	 * @return the temp declaration for animal quarantine persistence
	 */
	public TempDeclarationForAnimalQuarantinePersistence getTempDeclarationForAnimalQuarantinePersistence() {
		return tempDeclarationForAnimalQuarantinePersistence;
	}

	/**
	 * Sets the temp declaration for animal quarantine persistence.
	 *
	 * @param tempDeclarationForAnimalQuarantinePersistence the temp declaration for animal quarantine persistence
	 */
	public void setTempDeclarationForAnimalQuarantinePersistence(
		TempDeclarationForAnimalQuarantinePersistence tempDeclarationForAnimalQuarantinePersistence) {
		this.tempDeclarationForAnimalQuarantinePersistence = tempDeclarationForAnimalQuarantinePersistence;
	}

	/**
	 * Returns the temp declaration for plant quarantine local service.
	 *
	 * @return the temp declaration for plant quarantine local service
	 */
	public TempDeclarationForPlantQuarantineLocalService getTempDeclarationForPlantQuarantineLocalService() {
		return tempDeclarationForPlantQuarantineLocalService;
	}

	/**
	 * Sets the temp declaration for plant quarantine local service.
	 *
	 * @param tempDeclarationForPlantQuarantineLocalService the temp declaration for plant quarantine local service
	 */
	public void setTempDeclarationForPlantQuarantineLocalService(
		TempDeclarationForPlantQuarantineLocalService tempDeclarationForPlantQuarantineLocalService) {
		this.tempDeclarationForPlantQuarantineLocalService = tempDeclarationForPlantQuarantineLocalService;
	}

	/**
	 * Returns the temp declaration for plant quarantine remote service.
	 *
	 * @return the temp declaration for plant quarantine remote service
	 */
	public TempDeclarationForPlantQuarantineService getTempDeclarationForPlantQuarantineService() {
		return tempDeclarationForPlantQuarantineService;
	}

	/**
	 * Sets the temp declaration for plant quarantine remote service.
	 *
	 * @param tempDeclarationForPlantQuarantineService the temp declaration for plant quarantine remote service
	 */
	public void setTempDeclarationForPlantQuarantineService(
		TempDeclarationForPlantQuarantineService tempDeclarationForPlantQuarantineService) {
		this.tempDeclarationForPlantQuarantineService = tempDeclarationForPlantQuarantineService;
	}

	/**
	 * Returns the temp declaration for plant quarantine persistence.
	 *
	 * @return the temp declaration for plant quarantine persistence
	 */
	public TempDeclarationForPlantQuarantinePersistence getTempDeclarationForPlantQuarantinePersistence() {
		return tempDeclarationForPlantQuarantinePersistence;
	}

	/**
	 * Sets the temp declaration for plant quarantine persistence.
	 *
	 * @param tempDeclarationForPlantQuarantinePersistence the temp declaration for plant quarantine persistence
	 */
	public void setTempDeclarationForPlantQuarantinePersistence(
		TempDeclarationForPlantQuarantinePersistence tempDeclarationForPlantQuarantinePersistence) {
		this.tempDeclarationForPlantQuarantinePersistence = tempDeclarationForPlantQuarantinePersistence;
	}

	/**
	 * Returns the temp declaration of health local service.
	 *
	 * @return the temp declaration of health local service
	 */
	public TempDeclarationOfHealthLocalService getTempDeclarationOfHealthLocalService() {
		return tempDeclarationOfHealthLocalService;
	}

	/**
	 * Sets the temp declaration of health local service.
	 *
	 * @param tempDeclarationOfHealthLocalService the temp declaration of health local service
	 */
	public void setTempDeclarationOfHealthLocalService(
		TempDeclarationOfHealthLocalService tempDeclarationOfHealthLocalService) {
		this.tempDeclarationOfHealthLocalService = tempDeclarationOfHealthLocalService;
	}

	/**
	 * Returns the temp declaration of health remote service.
	 *
	 * @return the temp declaration of health remote service
	 */
	public TempDeclarationOfHealthService getTempDeclarationOfHealthService() {
		return tempDeclarationOfHealthService;
	}

	/**
	 * Sets the temp declaration of health remote service.
	 *
	 * @param tempDeclarationOfHealthService the temp declaration of health remote service
	 */
	public void setTempDeclarationOfHealthService(
		TempDeclarationOfHealthService tempDeclarationOfHealthService) {
		this.tempDeclarationOfHealthService = tempDeclarationOfHealthService;
	}

	/**
	 * Returns the temp declaration of health persistence.
	 *
	 * @return the temp declaration of health persistence
	 */
	public TempDeclarationOfHealthPersistence getTempDeclarationOfHealthPersistence() {
		return tempDeclarationOfHealthPersistence;
	}

	/**
	 * Sets the temp declaration of health persistence.
	 *
	 * @param tempDeclarationOfHealthPersistence the temp declaration of health persistence
	 */
	public void setTempDeclarationOfHealthPersistence(
		TempDeclarationOfHealthPersistence tempDeclarationOfHealthPersistence) {
		this.tempDeclarationOfHealthPersistence = tempDeclarationOfHealthPersistence;
	}

	/**
	 * Returns the temp declaration of health finder.
	 *
	 * @return the temp declaration of health finder
	 */
	public TempDeclarationOfHealthFinder getTempDeclarationOfHealthFinder() {
		return tempDeclarationOfHealthFinder;
	}

	/**
	 * Sets the temp declaration of health finder.
	 *
	 * @param tempDeclarationOfHealthFinder the temp declaration of health finder
	 */
	public void setTempDeclarationOfHealthFinder(
		TempDeclarationOfHealthFinder tempDeclarationOfHealthFinder) {
		this.tempDeclarationOfHealthFinder = tempDeclarationOfHealthFinder;
	}

	/**
	 * Returns the temp document local service.
	 *
	 * @return the temp document local service
	 */
	public TempDocumentLocalService getTempDocumentLocalService() {
		return tempDocumentLocalService;
	}

	/**
	 * Sets the temp document local service.
	 *
	 * @param tempDocumentLocalService the temp document local service
	 */
	public void setTempDocumentLocalService(
		TempDocumentLocalService tempDocumentLocalService) {
		this.tempDocumentLocalService = tempDocumentLocalService;
	}

	/**
	 * Returns the temp document remote service.
	 *
	 * @return the temp document remote service
	 */
	public TempDocumentService getTempDocumentService() {
		return tempDocumentService;
	}

	/**
	 * Sets the temp document remote service.
	 *
	 * @param tempDocumentService the temp document remote service
	 */
	public void setTempDocumentService(TempDocumentService tempDocumentService) {
		this.tempDocumentService = tempDocumentService;
	}

	/**
	 * Returns the temp document persistence.
	 *
	 * @return the temp document persistence
	 */
	public TempDocumentPersistence getTempDocumentPersistence() {
		return tempDocumentPersistence;
	}

	/**
	 * Sets the temp document persistence.
	 *
	 * @param tempDocumentPersistence the temp document persistence
	 */
	public void setTempDocumentPersistence(
		TempDocumentPersistence tempDocumentPersistence) {
		this.tempDocumentPersistence = tempDocumentPersistence;
	}

	/**
	 * Returns the temp document finder.
	 *
	 * @return the temp document finder
	 */
	public TempDocumentFinder getTempDocumentFinder() {
		return tempDocumentFinder;
	}

	/**
	 * Sets the temp document finder.
	 *
	 * @param tempDocumentFinder the temp document finder
	 */
	public void setTempDocumentFinder(TempDocumentFinder tempDocumentFinder) {
		this.tempDocumentFinder = tempDocumentFinder;
	}

	/**
	 * Returns the temp general declaration local service.
	 *
	 * @return the temp general declaration local service
	 */
	public TempGeneralDeclarationLocalService getTempGeneralDeclarationLocalService() {
		return tempGeneralDeclarationLocalService;
	}

	/**
	 * Sets the temp general declaration local service.
	 *
	 * @param tempGeneralDeclarationLocalService the temp general declaration local service
	 */
	public void setTempGeneralDeclarationLocalService(
		TempGeneralDeclarationLocalService tempGeneralDeclarationLocalService) {
		this.tempGeneralDeclarationLocalService = tempGeneralDeclarationLocalService;
	}

	/**
	 * Returns the temp general declaration remote service.
	 *
	 * @return the temp general declaration remote service
	 */
	public TempGeneralDeclarationService getTempGeneralDeclarationService() {
		return tempGeneralDeclarationService;
	}

	/**
	 * Sets the temp general declaration remote service.
	 *
	 * @param tempGeneralDeclarationService the temp general declaration remote service
	 */
	public void setTempGeneralDeclarationService(
		TempGeneralDeclarationService tempGeneralDeclarationService) {
		this.tempGeneralDeclarationService = tempGeneralDeclarationService;
	}

	/**
	 * Returns the temp general declaration persistence.
	 *
	 * @return the temp general declaration persistence
	 */
	public TempGeneralDeclarationPersistence getTempGeneralDeclarationPersistence() {
		return tempGeneralDeclarationPersistence;
	}

	/**
	 * Sets the temp general declaration persistence.
	 *
	 * @param tempGeneralDeclarationPersistence the temp general declaration persistence
	 */
	public void setTempGeneralDeclarationPersistence(
		TempGeneralDeclarationPersistence tempGeneralDeclarationPersistence) {
		this.tempGeneralDeclarationPersistence = tempGeneralDeclarationPersistence;
	}

	/**
	 * Returns the temp general declaration finder.
	 *
	 * @return the temp general declaration finder
	 */
	public TempGeneralDeclarationFinder getTempGeneralDeclarationFinder() {
		return tempGeneralDeclarationFinder;
	}

	/**
	 * Sets the temp general declaration finder.
	 *
	 * @param tempGeneralDeclarationFinder the temp general declaration finder
	 */
	public void setTempGeneralDeclarationFinder(
		TempGeneralDeclarationFinder tempGeneralDeclarationFinder) {
		this.tempGeneralDeclarationFinder = tempGeneralDeclarationFinder;
	}

	/**
	 * Returns the temp goods items local service.
	 *
	 * @return the temp goods items local service
	 */
	public TempGoodsItemsLocalService getTempGoodsItemsLocalService() {
		return tempGoodsItemsLocalService;
	}

	/**
	 * Sets the temp goods items local service.
	 *
	 * @param tempGoodsItemsLocalService the temp goods items local service
	 */
	public void setTempGoodsItemsLocalService(
		TempGoodsItemsLocalService tempGoodsItemsLocalService) {
		this.tempGoodsItemsLocalService = tempGoodsItemsLocalService;
	}

	/**
	 * Returns the temp goods items remote service.
	 *
	 * @return the temp goods items remote service
	 */
	public TempGoodsItemsService getTempGoodsItemsService() {
		return tempGoodsItemsService;
	}

	/**
	 * Sets the temp goods items remote service.
	 *
	 * @param tempGoodsItemsService the temp goods items remote service
	 */
	public void setTempGoodsItemsService(
		TempGoodsItemsService tempGoodsItemsService) {
		this.tempGoodsItemsService = tempGoodsItemsService;
	}

	/**
	 * Returns the temp goods items persistence.
	 *
	 * @return the temp goods items persistence
	 */
	public TempGoodsItemsPersistence getTempGoodsItemsPersistence() {
		return tempGoodsItemsPersistence;
	}

	/**
	 * Sets the temp goods items persistence.
	 *
	 * @param tempGoodsItemsPersistence the temp goods items persistence
	 */
	public void setTempGoodsItemsPersistence(
		TempGoodsItemsPersistence tempGoodsItemsPersistence) {
		this.tempGoodsItemsPersistence = tempGoodsItemsPersistence;
	}

	/**
	 * Returns the temp health crew passenger list local service.
	 *
	 * @return the temp health crew passenger list local service
	 */
	public TempHealthCrewPassengerListLocalService getTempHealthCrewPassengerListLocalService() {
		return tempHealthCrewPassengerListLocalService;
	}

	/**
	 * Sets the temp health crew passenger list local service.
	 *
	 * @param tempHealthCrewPassengerListLocalService the temp health crew passenger list local service
	 */
	public void setTempHealthCrewPassengerListLocalService(
		TempHealthCrewPassengerListLocalService tempHealthCrewPassengerListLocalService) {
		this.tempHealthCrewPassengerListLocalService = tempHealthCrewPassengerListLocalService;
	}

	/**
	 * Returns the temp health crew passenger list remote service.
	 *
	 * @return the temp health crew passenger list remote service
	 */
	public TempHealthCrewPassengerListService getTempHealthCrewPassengerListService() {
		return tempHealthCrewPassengerListService;
	}

	/**
	 * Sets the temp health crew passenger list remote service.
	 *
	 * @param tempHealthCrewPassengerListService the temp health crew passenger list remote service
	 */
	public void setTempHealthCrewPassengerListService(
		TempHealthCrewPassengerListService tempHealthCrewPassengerListService) {
		this.tempHealthCrewPassengerListService = tempHealthCrewPassengerListService;
	}

	/**
	 * Returns the temp health crew passenger list persistence.
	 *
	 * @return the temp health crew passenger list persistence
	 */
	public TempHealthCrewPassengerListPersistence getTempHealthCrewPassengerListPersistence() {
		return tempHealthCrewPassengerListPersistence;
	}

	/**
	 * Sets the temp health crew passenger list persistence.
	 *
	 * @param tempHealthCrewPassengerListPersistence the temp health crew passenger list persistence
	 */
	public void setTempHealthCrewPassengerListPersistence(
		TempHealthCrewPassengerListPersistence tempHealthCrewPassengerListPersistence) {
		this.tempHealthCrewPassengerListPersistence = tempHealthCrewPassengerListPersistence;
	}

	/**
	 * Returns the temp health question local service.
	 *
	 * @return the temp health question local service
	 */
	public TempHealthQuestionLocalService getTempHealthQuestionLocalService() {
		return tempHealthQuestionLocalService;
	}

	/**
	 * Sets the temp health question local service.
	 *
	 * @param tempHealthQuestionLocalService the temp health question local service
	 */
	public void setTempHealthQuestionLocalService(
		TempHealthQuestionLocalService tempHealthQuestionLocalService) {
		this.tempHealthQuestionLocalService = tempHealthQuestionLocalService;
	}

	/**
	 * Returns the temp health question remote service.
	 *
	 * @return the temp health question remote service
	 */
	public TempHealthQuestionService getTempHealthQuestionService() {
		return tempHealthQuestionService;
	}

	/**
	 * Sets the temp health question remote service.
	 *
	 * @param tempHealthQuestionService the temp health question remote service
	 */
	public void setTempHealthQuestionService(
		TempHealthQuestionService tempHealthQuestionService) {
		this.tempHealthQuestionService = tempHealthQuestionService;
	}

	/**
	 * Returns the temp health question persistence.
	 *
	 * @return the temp health question persistence
	 */
	public TempHealthQuestionPersistence getTempHealthQuestionPersistence() {
		return tempHealthQuestionPersistence;
	}

	/**
	 * Sets the temp health question persistence.
	 *
	 * @param tempHealthQuestionPersistence the temp health question persistence
	 */
	public void setTempHealthQuestionPersistence(
		TempHealthQuestionPersistence tempHealthQuestionPersistence) {
		this.tempHealthQuestionPersistence = tempHealthQuestionPersistence;
	}

	/**
	 * Returns the temp maritime payment config local service.
	 *
	 * @return the temp maritime payment config local service
	 */
	public TempMaritimePaymentConfigLocalService getTempMaritimePaymentConfigLocalService() {
		return tempMaritimePaymentConfigLocalService;
	}

	/**
	 * Sets the temp maritime payment config local service.
	 *
	 * @param tempMaritimePaymentConfigLocalService the temp maritime payment config local service
	 */
	public void setTempMaritimePaymentConfigLocalService(
		TempMaritimePaymentConfigLocalService tempMaritimePaymentConfigLocalService) {
		this.tempMaritimePaymentConfigLocalService = tempMaritimePaymentConfigLocalService;
	}

	/**
	 * Returns the temp maritime payment config persistence.
	 *
	 * @return the temp maritime payment config persistence
	 */
	public TempMaritimePaymentConfigPersistence getTempMaritimePaymentConfigPersistence() {
		return tempMaritimePaymentConfigPersistence;
	}

	/**
	 * Sets the temp maritime payment config persistence.
	 *
	 * @param tempMaritimePaymentConfigPersistence the temp maritime payment config persistence
	 */
	public void setTempMaritimePaymentConfigPersistence(
		TempMaritimePaymentConfigPersistence tempMaritimePaymentConfigPersistence) {
		this.tempMaritimePaymentConfigPersistence = tempMaritimePaymentConfigPersistence;
	}

	/**
	 * Returns the temp no tice ship message local service.
	 *
	 * @return the temp no tice ship message local service
	 */
	public TempNoTiceShipMessageLocalService getTempNoTiceShipMessageLocalService() {
		return tempNoTiceShipMessageLocalService;
	}

	/**
	 * Sets the temp no tice ship message local service.
	 *
	 * @param tempNoTiceShipMessageLocalService the temp no tice ship message local service
	 */
	public void setTempNoTiceShipMessageLocalService(
		TempNoTiceShipMessageLocalService tempNoTiceShipMessageLocalService) {
		this.tempNoTiceShipMessageLocalService = tempNoTiceShipMessageLocalService;
	}

	/**
	 * Returns the temp no tice ship message remote service.
	 *
	 * @return the temp no tice ship message remote service
	 */
	public TempNoTiceShipMessageService getTempNoTiceShipMessageService() {
		return tempNoTiceShipMessageService;
	}

	/**
	 * Sets the temp no tice ship message remote service.
	 *
	 * @param tempNoTiceShipMessageService the temp no tice ship message remote service
	 */
	public void setTempNoTiceShipMessageService(
		TempNoTiceShipMessageService tempNoTiceShipMessageService) {
		this.tempNoTiceShipMessageService = tempNoTiceShipMessageService;
	}

	/**
	 * Returns the temp no tice ship message persistence.
	 *
	 * @return the temp no tice ship message persistence
	 */
	public TempNoTiceShipMessagePersistence getTempNoTiceShipMessagePersistence() {
		return tempNoTiceShipMessagePersistence;
	}

	/**
	 * Sets the temp no tice ship message persistence.
	 *
	 * @param tempNoTiceShipMessagePersistence the temp no tice ship message persistence
	 */
	public void setTempNoTiceShipMessagePersistence(
		TempNoTiceShipMessagePersistence tempNoTiceShipMessagePersistence) {
		this.tempNoTiceShipMessagePersistence = tempNoTiceShipMessagePersistence;
	}

	/**
	 * Returns the temp no tice ship message finder.
	 *
	 * @return the temp no tice ship message finder
	 */
	public TempNoTiceShipMessageFinder getTempNoTiceShipMessageFinder() {
		return tempNoTiceShipMessageFinder;
	}

	/**
	 * Sets the temp no tice ship message finder.
	 *
	 * @param tempNoTiceShipMessageFinder the temp no tice ship message finder
	 */
	public void setTempNoTiceShipMessageFinder(
		TempNoTiceShipMessageFinder tempNoTiceShipMessageFinder) {
		this.tempNoTiceShipMessageFinder = tempNoTiceShipMessageFinder;
	}

	/**
	 * Returns the temp passenger details local service.
	 *
	 * @return the temp passenger details local service
	 */
	public TempPassengerDetailsLocalService getTempPassengerDetailsLocalService() {
		return tempPassengerDetailsLocalService;
	}

	/**
	 * Sets the temp passenger details local service.
	 *
	 * @param tempPassengerDetailsLocalService the temp passenger details local service
	 */
	public void setTempPassengerDetailsLocalService(
		TempPassengerDetailsLocalService tempPassengerDetailsLocalService) {
		this.tempPassengerDetailsLocalService = tempPassengerDetailsLocalService;
	}

	/**
	 * Returns the temp passenger details remote service.
	 *
	 * @return the temp passenger details remote service
	 */
	public TempPassengerDetailsService getTempPassengerDetailsService() {
		return tempPassengerDetailsService;
	}

	/**
	 * Sets the temp passenger details remote service.
	 *
	 * @param tempPassengerDetailsService the temp passenger details remote service
	 */
	public void setTempPassengerDetailsService(
		TempPassengerDetailsService tempPassengerDetailsService) {
		this.tempPassengerDetailsService = tempPassengerDetailsService;
	}

	/**
	 * Returns the temp passenger details persistence.
	 *
	 * @return the temp passenger details persistence
	 */
	public TempPassengerDetailsPersistence getTempPassengerDetailsPersistence() {
		return tempPassengerDetailsPersistence;
	}

	/**
	 * Sets the temp passenger details persistence.
	 *
	 * @param tempPassengerDetailsPersistence the temp passenger details persistence
	 */
	public void setTempPassengerDetailsPersistence(
		TempPassengerDetailsPersistence tempPassengerDetailsPersistence) {
		this.tempPassengerDetailsPersistence = tempPassengerDetailsPersistence;
	}

	/**
	 * Returns the temp passenger list local service.
	 *
	 * @return the temp passenger list local service
	 */
	public TempPassengerListLocalService getTempPassengerListLocalService() {
		return tempPassengerListLocalService;
	}

	/**
	 * Sets the temp passenger list local service.
	 *
	 * @param tempPassengerListLocalService the temp passenger list local service
	 */
	public void setTempPassengerListLocalService(
		TempPassengerListLocalService tempPassengerListLocalService) {
		this.tempPassengerListLocalService = tempPassengerListLocalService;
	}

	/**
	 * Returns the temp passenger list remote service.
	 *
	 * @return the temp passenger list remote service
	 */
	public TempPassengerListService getTempPassengerListService() {
		return tempPassengerListService;
	}

	/**
	 * Sets the temp passenger list remote service.
	 *
	 * @param tempPassengerListService the temp passenger list remote service
	 */
	public void setTempPassengerListService(
		TempPassengerListService tempPassengerListService) {
		this.tempPassengerListService = tempPassengerListService;
	}

	/**
	 * Returns the temp passenger list persistence.
	 *
	 * @return the temp passenger list persistence
	 */
	public TempPassengerListPersistence getTempPassengerListPersistence() {
		return tempPassengerListPersistence;
	}

	/**
	 * Sets the temp passenger list persistence.
	 *
	 * @param tempPassengerListPersistence the temp passenger list persistence
	 */
	public void setTempPassengerListPersistence(
		TempPassengerListPersistence tempPassengerListPersistence) {
		this.tempPassengerListPersistence = tempPassengerListPersistence;
	}

	/**
	 * Returns the temp passenger list finder.
	 *
	 * @return the temp passenger list finder
	 */
	public TempPassengerListFinder getTempPassengerListFinder() {
		return tempPassengerListFinder;
	}

	/**
	 * Sets the temp passenger list finder.
	 *
	 * @param tempPassengerListFinder the temp passenger list finder
	 */
	public void setTempPassengerListFinder(
		TempPassengerListFinder tempPassengerListFinder) {
		this.tempPassengerListFinder = tempPassengerListFinder;
	}

	/**
	 * Returns the temp person list local service.
	 *
	 * @return the temp person list local service
	 */
	public TempPersonListLocalService getTempPersonListLocalService() {
		return tempPersonListLocalService;
	}

	/**
	 * Sets the temp person list local service.
	 *
	 * @param tempPersonListLocalService the temp person list local service
	 */
	public void setTempPersonListLocalService(
		TempPersonListLocalService tempPersonListLocalService) {
		this.tempPersonListLocalService = tempPersonListLocalService;
	}

	/**
	 * Returns the temp person list persistence.
	 *
	 * @return the temp person list persistence
	 */
	public TempPersonListPersistence getTempPersonListPersistence() {
		return tempPersonListPersistence;
	}

	/**
	 * Sets the temp person list persistence.
	 *
	 * @param tempPersonListPersistence the temp person list persistence
	 */
	public void setTempPersonListPersistence(
		TempPersonListPersistence tempPersonListPersistence) {
		this.tempPersonListPersistence = tempPersonListPersistence;
	}

	/**
	 * Returns the temp plant quarantine local service.
	 *
	 * @return the temp plant quarantine local service
	 */
	public TempPlantQuarantineLocalService getTempPlantQuarantineLocalService() {
		return tempPlantQuarantineLocalService;
	}

	/**
	 * Sets the temp plant quarantine local service.
	 *
	 * @param tempPlantQuarantineLocalService the temp plant quarantine local service
	 */
	public void setTempPlantQuarantineLocalService(
		TempPlantQuarantineLocalService tempPlantQuarantineLocalService) {
		this.tempPlantQuarantineLocalService = tempPlantQuarantineLocalService;
	}

	/**
	 * Returns the temp plant quarantine remote service.
	 *
	 * @return the temp plant quarantine remote service
	 */
	public TempPlantQuarantineService getTempPlantQuarantineService() {
		return tempPlantQuarantineService;
	}

	/**
	 * Sets the temp plant quarantine remote service.
	 *
	 * @param tempPlantQuarantineService the temp plant quarantine remote service
	 */
	public void setTempPlantQuarantineService(
		TempPlantQuarantineService tempPlantQuarantineService) {
		this.tempPlantQuarantineService = tempPlantQuarantineService;
	}

	/**
	 * Returns the temp plant quarantine persistence.
	 *
	 * @return the temp plant quarantine persistence
	 */
	public TempPlantQuarantinePersistence getTempPlantQuarantinePersistence() {
		return tempPlantQuarantinePersistence;
	}

	/**
	 * Sets the temp plant quarantine persistence.
	 *
	 * @param tempPlantQuarantinePersistence the temp plant quarantine persistence
	 */
	public void setTempPlantQuarantinePersistence(
		TempPlantQuarantinePersistence tempPlantQuarantinePersistence) {
		this.tempPlantQuarantinePersistence = tempPlantQuarantinePersistence;
	}

	/**
	 * Returns the temp plant quarantine finder.
	 *
	 * @return the temp plant quarantine finder
	 */
	public TempPlantQuarantineFinder getTempPlantQuarantineFinder() {
		return tempPlantQuarantineFinder;
	}

	/**
	 * Sets the temp plant quarantine finder.
	 *
	 * @param tempPlantQuarantineFinder the temp plant quarantine finder
	 */
	public void setTempPlantQuarantineFinder(
		TempPlantQuarantineFinder tempPlantQuarantineFinder) {
		this.tempPlantQuarantineFinder = tempPlantQuarantineFinder;
	}

	/**
	 * Returns the temp ship security message local service.
	 *
	 * @return the temp ship security message local service
	 */
	public TempShipSecurityMessageLocalService getTempShipSecurityMessageLocalService() {
		return tempShipSecurityMessageLocalService;
	}

	/**
	 * Sets the temp ship security message local service.
	 *
	 * @param tempShipSecurityMessageLocalService the temp ship security message local service
	 */
	public void setTempShipSecurityMessageLocalService(
		TempShipSecurityMessageLocalService tempShipSecurityMessageLocalService) {
		this.tempShipSecurityMessageLocalService = tempShipSecurityMessageLocalService;
	}

	/**
	 * Returns the temp ship security message remote service.
	 *
	 * @return the temp ship security message remote service
	 */
	public TempShipSecurityMessageService getTempShipSecurityMessageService() {
		return tempShipSecurityMessageService;
	}

	/**
	 * Sets the temp ship security message remote service.
	 *
	 * @param tempShipSecurityMessageService the temp ship security message remote service
	 */
	public void setTempShipSecurityMessageService(
		TempShipSecurityMessageService tempShipSecurityMessageService) {
		this.tempShipSecurityMessageService = tempShipSecurityMessageService;
	}

	/**
	 * Returns the temp ship security message persistence.
	 *
	 * @return the temp ship security message persistence
	 */
	public TempShipSecurityMessagePersistence getTempShipSecurityMessagePersistence() {
		return tempShipSecurityMessagePersistence;
	}

	/**
	 * Sets the temp ship security message persistence.
	 *
	 * @param tempShipSecurityMessagePersistence the temp ship security message persistence
	 */
	public void setTempShipSecurityMessagePersistence(
		TempShipSecurityMessagePersistence tempShipSecurityMessagePersistence) {
		this.tempShipSecurityMessagePersistence = tempShipSecurityMessagePersistence;
	}

	/**
	 * Returns the temp ship security message finder.
	 *
	 * @return the temp ship security message finder
	 */
	public TempShipSecurityMessageFinder getTempShipSecurityMessageFinder() {
		return tempShipSecurityMessageFinder;
	}

	/**
	 * Sets the temp ship security message finder.
	 *
	 * @param tempShipSecurityMessageFinder the temp ship security message finder
	 */
	public void setTempShipSecurityMessageFinder(
		TempShipSecurityMessageFinder tempShipSecurityMessageFinder) {
		this.tempShipSecurityMessageFinder = tempShipSecurityMessageFinder;
	}

	/**
	 * Returns the temp ship security port items local service.
	 *
	 * @return the temp ship security port items local service
	 */
	public TempShipSecurityPortItemsLocalService getTempShipSecurityPortItemsLocalService() {
		return tempShipSecurityPortItemsLocalService;
	}

	/**
	 * Sets the temp ship security port items local service.
	 *
	 * @param tempShipSecurityPortItemsLocalService the temp ship security port items local service
	 */
	public void setTempShipSecurityPortItemsLocalService(
		TempShipSecurityPortItemsLocalService tempShipSecurityPortItemsLocalService) {
		this.tempShipSecurityPortItemsLocalService = tempShipSecurityPortItemsLocalService;
	}

	/**
	 * Returns the temp ship security port items remote service.
	 *
	 * @return the temp ship security port items remote service
	 */
	public TempShipSecurityPortItemsService getTempShipSecurityPortItemsService() {
		return tempShipSecurityPortItemsService;
	}

	/**
	 * Sets the temp ship security port items remote service.
	 *
	 * @param tempShipSecurityPortItemsService the temp ship security port items remote service
	 */
	public void setTempShipSecurityPortItemsService(
		TempShipSecurityPortItemsService tempShipSecurityPortItemsService) {
		this.tempShipSecurityPortItemsService = tempShipSecurityPortItemsService;
	}

	/**
	 * Returns the temp ship security port items persistence.
	 *
	 * @return the temp ship security port items persistence
	 */
	public TempShipSecurityPortItemsPersistence getTempShipSecurityPortItemsPersistence() {
		return tempShipSecurityPortItemsPersistence;
	}

	/**
	 * Sets the temp ship security port items persistence.
	 *
	 * @param tempShipSecurityPortItemsPersistence the temp ship security port items persistence
	 */
	public void setTempShipSecurityPortItemsPersistence(
		TempShipSecurityPortItemsPersistence tempShipSecurityPortItemsPersistence) {
		this.tempShipSecurityPortItemsPersistence = tempShipSecurityPortItemsPersistence;
	}

	/**
	 * Returns the temp ship security port items finder.
	 *
	 * @return the temp ship security port items finder
	 */
	public TempShipSecurityPortItemsFinder getTempShipSecurityPortItemsFinder() {
		return tempShipSecurityPortItemsFinder;
	}

	/**
	 * Sets the temp ship security port items finder.
	 *
	 * @param tempShipSecurityPortItemsFinder the temp ship security port items finder
	 */
	public void setTempShipSecurityPortItemsFinder(
		TempShipSecurityPortItemsFinder tempShipSecurityPortItemsFinder) {
		this.tempShipSecurityPortItemsFinder = tempShipSecurityPortItemsFinder;
	}

	/**
	 * Returns the temp ship stores declaration local service.
	 *
	 * @return the temp ship stores declaration local service
	 */
	public TempShipStoresDeclarationLocalService getTempShipStoresDeclarationLocalService() {
		return tempShipStoresDeclarationLocalService;
	}

	/**
	 * Sets the temp ship stores declaration local service.
	 *
	 * @param tempShipStoresDeclarationLocalService the temp ship stores declaration local service
	 */
	public void setTempShipStoresDeclarationLocalService(
		TempShipStoresDeclarationLocalService tempShipStoresDeclarationLocalService) {
		this.tempShipStoresDeclarationLocalService = tempShipStoresDeclarationLocalService;
	}

	/**
	 * Returns the temp ship stores declaration remote service.
	 *
	 * @return the temp ship stores declaration remote service
	 */
	public TempShipStoresDeclarationService getTempShipStoresDeclarationService() {
		return tempShipStoresDeclarationService;
	}

	/**
	 * Sets the temp ship stores declaration remote service.
	 *
	 * @param tempShipStoresDeclarationService the temp ship stores declaration remote service
	 */
	public void setTempShipStoresDeclarationService(
		TempShipStoresDeclarationService tempShipStoresDeclarationService) {
		this.tempShipStoresDeclarationService = tempShipStoresDeclarationService;
	}

	/**
	 * Returns the temp ship stores declaration persistence.
	 *
	 * @return the temp ship stores declaration persistence
	 */
	public TempShipStoresDeclarationPersistence getTempShipStoresDeclarationPersistence() {
		return tempShipStoresDeclarationPersistence;
	}

	/**
	 * Sets the temp ship stores declaration persistence.
	 *
	 * @param tempShipStoresDeclarationPersistence the temp ship stores declaration persistence
	 */
	public void setTempShipStoresDeclarationPersistence(
		TempShipStoresDeclarationPersistence tempShipStoresDeclarationPersistence) {
		this.tempShipStoresDeclarationPersistence = tempShipStoresDeclarationPersistence;
	}

	/**
	 * Returns the temp ship stores declaration finder.
	 *
	 * @return the temp ship stores declaration finder
	 */
	public TempShipStoresDeclarationFinder getTempShipStoresDeclarationFinder() {
		return tempShipStoresDeclarationFinder;
	}

	/**
	 * Sets the temp ship stores declaration finder.
	 *
	 * @param tempShipStoresDeclarationFinder the temp ship stores declaration finder
	 */
	public void setTempShipStoresDeclarationFinder(
		TempShipStoresDeclarationFinder tempShipStoresDeclarationFinder) {
		this.tempShipStoresDeclarationFinder = tempShipStoresDeclarationFinder;
	}

	/**
	 * Returns the temp ship stores items local service.
	 *
	 * @return the temp ship stores items local service
	 */
	public TempShipStoresItemsLocalService getTempShipStoresItemsLocalService() {
		return tempShipStoresItemsLocalService;
	}

	/**
	 * Sets the temp ship stores items local service.
	 *
	 * @param tempShipStoresItemsLocalService the temp ship stores items local service
	 */
	public void setTempShipStoresItemsLocalService(
		TempShipStoresItemsLocalService tempShipStoresItemsLocalService) {
		this.tempShipStoresItemsLocalService = tempShipStoresItemsLocalService;
	}

	/**
	 * Returns the temp ship stores items remote service.
	 *
	 * @return the temp ship stores items remote service
	 */
	public TempShipStoresItemsService getTempShipStoresItemsService() {
		return tempShipStoresItemsService;
	}

	/**
	 * Sets the temp ship stores items remote service.
	 *
	 * @param tempShipStoresItemsService the temp ship stores items remote service
	 */
	public void setTempShipStoresItemsService(
		TempShipStoresItemsService tempShipStoresItemsService) {
		this.tempShipStoresItemsService = tempShipStoresItemsService;
	}

	/**
	 * Returns the temp ship stores items persistence.
	 *
	 * @return the temp ship stores items persistence
	 */
	public TempShipStoresItemsPersistence getTempShipStoresItemsPersistence() {
		return tempShipStoresItemsPersistence;
	}

	/**
	 * Sets the temp ship stores items persistence.
	 *
	 * @param tempShipStoresItemsPersistence the temp ship stores items persistence
	 */
	public void setTempShipStoresItemsPersistence(
		TempShipStoresItemsPersistence tempShipStoresItemsPersistence) {
		this.tempShipStoresItemsPersistence = tempShipStoresItemsPersistence;
	}

	/**
	 * Returns the temp unit general local service.
	 *
	 * @return the temp unit general local service
	 */
	public TempUnitGeneralLocalService getTempUnitGeneralLocalService() {
		return tempUnitGeneralLocalService;
	}

	/**
	 * Sets the temp unit general local service.
	 *
	 * @param tempUnitGeneralLocalService the temp unit general local service
	 */
	public void setTempUnitGeneralLocalService(
		TempUnitGeneralLocalService tempUnitGeneralLocalService) {
		this.tempUnitGeneralLocalService = tempUnitGeneralLocalService;
	}

	/**
	 * Returns the temp unit general remote service.
	 *
	 * @return the temp unit general remote service
	 */
	public TempUnitGeneralService getTempUnitGeneralService() {
		return tempUnitGeneralService;
	}

	/**
	 * Sets the temp unit general remote service.
	 *
	 * @param tempUnitGeneralService the temp unit general remote service
	 */
	public void setTempUnitGeneralService(
		TempUnitGeneralService tempUnitGeneralService) {
		this.tempUnitGeneralService = tempUnitGeneralService;
	}

	/**
	 * Returns the temp unit general persistence.
	 *
	 * @return the temp unit general persistence
	 */
	public TempUnitGeneralPersistence getTempUnitGeneralPersistence() {
		return tempUnitGeneralPersistence;
	}

	/**
	 * Sets the temp unit general persistence.
	 *
	 * @param tempUnitGeneralPersistence the temp unit general persistence
	 */
	public void setTempUnitGeneralPersistence(
		TempUnitGeneralPersistence tempUnitGeneralPersistence) {
		this.tempUnitGeneralPersistence = tempUnitGeneralPersistence;
	}

	/**
	 * Returns the temp waste list local service.
	 *
	 * @return the temp waste list local service
	 */
	public TempWasteListLocalService getTempWasteListLocalService() {
		return tempWasteListLocalService;
	}

	/**
	 * Sets the temp waste list local service.
	 *
	 * @param tempWasteListLocalService the temp waste list local service
	 */
	public void setTempWasteListLocalService(
		TempWasteListLocalService tempWasteListLocalService) {
		this.tempWasteListLocalService = tempWasteListLocalService;
	}

	/**
	 * Returns the temp waste list persistence.
	 *
	 * @return the temp waste list persistence
	 */
	public TempWasteListPersistence getTempWasteListPersistence() {
		return tempWasteListPersistence;
	}

	/**
	 * Sets the temp waste list persistence.
	 *
	 * @param tempWasteListPersistence the temp waste list persistence
	 */
	public void setTempWasteListPersistence(
		TempWasteListPersistence tempWasteListPersistence) {
		this.tempWasteListPersistence = tempWasteListPersistence;
	}

	/**
	 * Returns the view hoan thanh thu tuc local service.
	 *
	 * @return the view hoan thanh thu tuc local service
	 */
	public ViewHoanThanhThuTucLocalService getViewHoanThanhThuTucLocalService() {
		return viewHoanThanhThuTucLocalService;
	}

	/**
	 * Sets the view hoan thanh thu tuc local service.
	 *
	 * @param viewHoanThanhThuTucLocalService the view hoan thanh thu tuc local service
	 */
	public void setViewHoanThanhThuTucLocalService(
		ViewHoanThanhThuTucLocalService viewHoanThanhThuTucLocalService) {
		this.viewHoanThanhThuTucLocalService = viewHoanThanhThuTucLocalService;
	}

	/**
	 * Returns the view hoan thanh thu tuc remote service.
	 *
	 * @return the view hoan thanh thu tuc remote service
	 */
	public ViewHoanThanhThuTucService getViewHoanThanhThuTucService() {
		return viewHoanThanhThuTucService;
	}

	/**
	 * Sets the view hoan thanh thu tuc remote service.
	 *
	 * @param viewHoanThanhThuTucService the view hoan thanh thu tuc remote service
	 */
	public void setViewHoanThanhThuTucService(
		ViewHoanThanhThuTucService viewHoanThanhThuTucService) {
		this.viewHoanThanhThuTucService = viewHoanThanhThuTucService;
	}

	/**
	 * Returns the view hoan thanh thu tuc persistence.
	 *
	 * @return the view hoan thanh thu tuc persistence
	 */
	public ViewHoanThanhThuTucPersistence getViewHoanThanhThuTucPersistence() {
		return viewHoanThanhThuTucPersistence;
	}

	/**
	 * Sets the view hoan thanh thu tuc persistence.
	 *
	 * @param viewHoanThanhThuTucPersistence the view hoan thanh thu tuc persistence
	 */
	public void setViewHoanThanhThuTucPersistence(
		ViewHoanThanhThuTucPersistence viewHoanThanhThuTucPersistence) {
		this.viewHoanThanhThuTucPersistence = viewHoanThanhThuTucPersistence;
	}

	/**
	 * Returns the view hoan thanh thu tuc finder.
	 *
	 * @return the view hoan thanh thu tuc finder
	 */
	public ViewHoanThanhThuTucFinder getViewHoanThanhThuTucFinder() {
		return viewHoanThanhThuTucFinder;
	}

	/**
	 * Sets the view hoan thanh thu tuc finder.
	 *
	 * @param viewHoanThanhThuTucFinder the view hoan thanh thu tuc finder
	 */
	public void setViewHoanThanhThuTucFinder(
		ViewHoanThanhThuTucFinder viewHoanThanhThuTucFinder) {
		this.viewHoanThanhThuTucFinder = viewHoanThanhThuTucFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("vn.gt.dao.noticeandmessage.model.TempShipStoresItems",
			tempShipStoresItemsLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.gt.dao.noticeandmessage.model.TempShipStoresItems");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	protected Class<?> getModelClass() {
		return TempShipStoresItems.class;
	}

	protected String getModelClassName() {
		return TempShipStoresItems.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = tempShipStoresItemsPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = HistoryInterfaceRequestLocalService.class)
	protected HistoryInterfaceRequestLocalService historyInterfaceRequestLocalService;
	@BeanReference(type = HistoryInterfaceRequestService.class)
	protected HistoryInterfaceRequestService historyInterfaceRequestService;
	@BeanReference(type = HistoryInterfaceRequestPersistence.class)
	protected HistoryInterfaceRequestPersistence historyInterfaceRequestPersistence;
	@BeanReference(type = HistoryInterfaceRequestFinder.class)
	protected HistoryInterfaceRequestFinder historyInterfaceRequestFinder;
	@BeanReference(type = HistoryInterfaceRequestFieldLocalService.class)
	protected HistoryInterfaceRequestFieldLocalService historyInterfaceRequestFieldLocalService;
	@BeanReference(type = HistoryInterfaceRequestFieldService.class)
	protected HistoryInterfaceRequestFieldService historyInterfaceRequestFieldService;
	@BeanReference(type = HistoryInterfaceRequestFieldPersistence.class)
	protected HistoryInterfaceRequestFieldPersistence historyInterfaceRequestFieldPersistence;
	@BeanReference(type = InterfaceRequestLocalService.class)
	protected InterfaceRequestLocalService interfaceRequestLocalService;
	@BeanReference(type = InterfaceRequestService.class)
	protected InterfaceRequestService interfaceRequestService;
	@BeanReference(type = InterfaceRequestPersistence.class)
	protected InterfaceRequestPersistence interfaceRequestPersistence;
	@BeanReference(type = InterfaceRequestFinder.class)
	protected InterfaceRequestFinder interfaceRequestFinder;
	@BeanReference(type = InterfaceRequestFieldLocalService.class)
	protected InterfaceRequestFieldLocalService interfaceRequestFieldLocalService;
	@BeanReference(type = InterfaceRequestFieldService.class)
	protected InterfaceRequestFieldService interfaceRequestFieldService;
	@BeanReference(type = InterfaceRequestFieldPersistence.class)
	protected InterfaceRequestFieldPersistence interfaceRequestFieldPersistence;
	@BeanReference(type = IssueAcceptanceLocalService.class)
	protected IssueAcceptanceLocalService issueAcceptanceLocalService;
	@BeanReference(type = IssueAcceptanceService.class)
	protected IssueAcceptanceService issueAcceptanceService;
	@BeanReference(type = IssueAcceptancePersistence.class)
	protected IssueAcceptancePersistence issueAcceptancePersistence;
	@BeanReference(type = IssueAcceptanceFinder.class)
	protected IssueAcceptanceFinder issueAcceptanceFinder;
	@BeanReference(type = IssueAcceptanceForTransitLocalService.class)
	protected IssueAcceptanceForTransitLocalService issueAcceptanceForTransitLocalService;
	@BeanReference(type = IssueAcceptanceForTransitService.class)
	protected IssueAcceptanceForTransitService issueAcceptanceForTransitService;
	@BeanReference(type = IssueAcceptanceForTransitPersistence.class)
	protected IssueAcceptanceForTransitPersistence issueAcceptanceForTransitPersistence;
	@BeanReference(type = IssuePermissionForTransitLocalService.class)
	protected IssuePermissionForTransitLocalService issuePermissionForTransitLocalService;
	@BeanReference(type = IssuePermissionForTransitService.class)
	protected IssuePermissionForTransitService issuePermissionForTransitService;
	@BeanReference(type = IssuePermissionForTransitPersistence.class)
	protected IssuePermissionForTransitPersistence issuePermissionForTransitPersistence;
	@BeanReference(type = IssuePermissionForTransitFinder.class)
	protected IssuePermissionForTransitFinder issuePermissionForTransitFinder;
	@BeanReference(type = IssuePortClearanceLocalService.class)
	protected IssuePortClearanceLocalService issuePortClearanceLocalService;
	@BeanReference(type = IssuePortClearanceService.class)
	protected IssuePortClearanceService issuePortClearanceService;
	@BeanReference(type = IssuePortClearancePersistence.class)
	protected IssuePortClearancePersistence issuePortClearancePersistence;
	@BeanReference(type = IssuePortClearanceFinder.class)
	protected IssuePortClearanceFinder issuePortClearanceFinder;
	@BeanReference(type = IssueShiftingOrderLocalService.class)
	protected IssueShiftingOrderLocalService issueShiftingOrderLocalService;
	@BeanReference(type = IssueShiftingOrderService.class)
	protected IssueShiftingOrderService issueShiftingOrderService;
	@BeanReference(type = IssueShiftingOrderPersistence.class)
	protected IssueShiftingOrderPersistence issueShiftingOrderPersistence;
	@BeanReference(type = IssueShiftingOrderFinder.class)
	protected IssueShiftingOrderFinder issueShiftingOrderFinder;
	@BeanReference(type = IssueShiftingOrderChanelLocalService.class)
	protected IssueShiftingOrderChanelLocalService issueShiftingOrderChanelLocalService;
	@BeanReference(type = IssueShiftingOrderChanelPersistence.class)
	protected IssueShiftingOrderChanelPersistence issueShiftingOrderChanelPersistence;
	@BeanReference(type = ModifyLocalService.class)
	protected ModifyLocalService modifyLocalService;
	@BeanReference(type = ModifyService.class)
	protected ModifyService modifyService;
	@BeanReference(type = ModifyPersistence.class)
	protected ModifyPersistence modifyPersistence;
	@BeanReference(type = NoticeShipMessageLocalService.class)
	protected NoticeShipMessageLocalService noticeShipMessageLocalService;
	@BeanReference(type = NoticeShipMessageService.class)
	protected NoticeShipMessageService noticeShipMessageService;
	@BeanReference(type = NoticeShipMessagePersistence.class)
	protected NoticeShipMessagePersistence noticeShipMessagePersistence;
	@BeanReference(type = TempAnimalQuarantineLocalService.class)
	protected TempAnimalQuarantineLocalService tempAnimalQuarantineLocalService;
	@BeanReference(type = TempAnimalQuarantineService.class)
	protected TempAnimalQuarantineService tempAnimalQuarantineService;
	@BeanReference(type = TempAnimalQuarantinePersistence.class)
	protected TempAnimalQuarantinePersistence tempAnimalQuarantinePersistence;
	@BeanReference(type = TempAnimalQuarantineFinder.class)
	protected TempAnimalQuarantineFinder tempAnimalQuarantineFinder;
	@BeanReference(type = TempAttachmentDeclarationHealthLocalService.class)
	protected TempAttachmentDeclarationHealthLocalService tempAttachmentDeclarationHealthLocalService;
	@BeanReference(type = TempAttachmentDeclarationHealthService.class)
	protected TempAttachmentDeclarationHealthService tempAttachmentDeclarationHealthService;
	@BeanReference(type = TempAttachmentDeclarationHealthPersistence.class)
	protected TempAttachmentDeclarationHealthPersistence tempAttachmentDeclarationHealthPersistence;
	@BeanReference(type = TempCargoDeclarationLocalService.class)
	protected TempCargoDeclarationLocalService tempCargoDeclarationLocalService;
	@BeanReference(type = TempCargoDeclarationService.class)
	protected TempCargoDeclarationService tempCargoDeclarationService;
	@BeanReference(type = TempCargoDeclarationPersistence.class)
	protected TempCargoDeclarationPersistence tempCargoDeclarationPersistence;
	@BeanReference(type = TempCargoDeclarationFinder.class)
	protected TempCargoDeclarationFinder tempCargoDeclarationFinder;
	@BeanReference(type = TempCargoItemsLocalService.class)
	protected TempCargoItemsLocalService tempCargoItemsLocalService;
	@BeanReference(type = TempCargoItemsService.class)
	protected TempCargoItemsService tempCargoItemsService;
	@BeanReference(type = TempCargoItemsPersistence.class)
	protected TempCargoItemsPersistence tempCargoItemsPersistence;
	@BeanReference(type = TempCrewDetailsLocalService.class)
	protected TempCrewDetailsLocalService tempCrewDetailsLocalService;
	@BeanReference(type = TempCrewDetailsService.class)
	protected TempCrewDetailsService tempCrewDetailsService;
	@BeanReference(type = TempCrewDetailsPersistence.class)
	protected TempCrewDetailsPersistence tempCrewDetailsPersistence;
	@BeanReference(type = TempCrewEffectsDeclarationLocalService.class)
	protected TempCrewEffectsDeclarationLocalService tempCrewEffectsDeclarationLocalService;
	@BeanReference(type = TempCrewEffectsDeclarationService.class)
	protected TempCrewEffectsDeclarationService tempCrewEffectsDeclarationService;
	@BeanReference(type = TempCrewEffectsDeclarationPersistence.class)
	protected TempCrewEffectsDeclarationPersistence tempCrewEffectsDeclarationPersistence;
	@BeanReference(type = TempCrewEffectsDeclarationFinder.class)
	protected TempCrewEffectsDeclarationFinder tempCrewEffectsDeclarationFinder;
	@BeanReference(type = TempCrewEffectsItemsLocalService.class)
	protected TempCrewEffectsItemsLocalService tempCrewEffectsItemsLocalService;
	@BeanReference(type = TempCrewEffectsItemsService.class)
	protected TempCrewEffectsItemsService tempCrewEffectsItemsService;
	@BeanReference(type = TempCrewEffectsItemsPersistence.class)
	protected TempCrewEffectsItemsPersistence tempCrewEffectsItemsPersistence;
	@BeanReference(type = TempCrewEffectsItemsFinder.class)
	protected TempCrewEffectsItemsFinder tempCrewEffectsItemsFinder;
	@BeanReference(type = TempCrewListLocalService.class)
	protected TempCrewListLocalService tempCrewListLocalService;
	@BeanReference(type = TempCrewListService.class)
	protected TempCrewListService tempCrewListService;
	@BeanReference(type = TempCrewListPersistence.class)
	protected TempCrewListPersistence tempCrewListPersistence;
	@BeanReference(type = TempCrewListFinder.class)
	protected TempCrewListFinder tempCrewListFinder;
	@BeanReference(type = TempDangerousGoodsItemsLocalService.class)
	protected TempDangerousGoodsItemsLocalService tempDangerousGoodsItemsLocalService;
	@BeanReference(type = TempDangerousGoodsItemsService.class)
	protected TempDangerousGoodsItemsService tempDangerousGoodsItemsService;
	@BeanReference(type = TempDangerousGoodsItemsPersistence.class)
	protected TempDangerousGoodsItemsPersistence tempDangerousGoodsItemsPersistence;
	@BeanReference(type = TempDangerousGoodsNanifestLocalService.class)
	protected TempDangerousGoodsNanifestLocalService tempDangerousGoodsNanifestLocalService;
	@BeanReference(type = TempDangerousGoodsNanifestService.class)
	protected TempDangerousGoodsNanifestService tempDangerousGoodsNanifestService;
	@BeanReference(type = TempDangerousGoodsNanifestPersistence.class)
	protected TempDangerousGoodsNanifestPersistence tempDangerousGoodsNanifestPersistence;
	@BeanReference(type = TempDangerousGoodsNanifestFinder.class)
	protected TempDangerousGoodsNanifestFinder tempDangerousGoodsNanifestFinder;
	@BeanReference(type = TempDeclarationForAnimalQuarantineLocalService.class)
	protected TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService;
	@BeanReference(type = TempDeclarationForAnimalQuarantineService.class)
	protected TempDeclarationForAnimalQuarantineService tempDeclarationForAnimalQuarantineService;
	@BeanReference(type = TempDeclarationForAnimalQuarantinePersistence.class)
	protected TempDeclarationForAnimalQuarantinePersistence tempDeclarationForAnimalQuarantinePersistence;
	@BeanReference(type = TempDeclarationForPlantQuarantineLocalService.class)
	protected TempDeclarationForPlantQuarantineLocalService tempDeclarationForPlantQuarantineLocalService;
	@BeanReference(type = TempDeclarationForPlantQuarantineService.class)
	protected TempDeclarationForPlantQuarantineService tempDeclarationForPlantQuarantineService;
	@BeanReference(type = TempDeclarationForPlantQuarantinePersistence.class)
	protected TempDeclarationForPlantQuarantinePersistence tempDeclarationForPlantQuarantinePersistence;
	@BeanReference(type = TempDeclarationOfHealthLocalService.class)
	protected TempDeclarationOfHealthLocalService tempDeclarationOfHealthLocalService;
	@BeanReference(type = TempDeclarationOfHealthService.class)
	protected TempDeclarationOfHealthService tempDeclarationOfHealthService;
	@BeanReference(type = TempDeclarationOfHealthPersistence.class)
	protected TempDeclarationOfHealthPersistence tempDeclarationOfHealthPersistence;
	@BeanReference(type = TempDeclarationOfHealthFinder.class)
	protected TempDeclarationOfHealthFinder tempDeclarationOfHealthFinder;
	@BeanReference(type = TempDocumentLocalService.class)
	protected TempDocumentLocalService tempDocumentLocalService;
	@BeanReference(type = TempDocumentService.class)
	protected TempDocumentService tempDocumentService;
	@BeanReference(type = TempDocumentPersistence.class)
	protected TempDocumentPersistence tempDocumentPersistence;
	@BeanReference(type = TempDocumentFinder.class)
	protected TempDocumentFinder tempDocumentFinder;
	@BeanReference(type = TempGeneralDeclarationLocalService.class)
	protected TempGeneralDeclarationLocalService tempGeneralDeclarationLocalService;
	@BeanReference(type = TempGeneralDeclarationService.class)
	protected TempGeneralDeclarationService tempGeneralDeclarationService;
	@BeanReference(type = TempGeneralDeclarationPersistence.class)
	protected TempGeneralDeclarationPersistence tempGeneralDeclarationPersistence;
	@BeanReference(type = TempGeneralDeclarationFinder.class)
	protected TempGeneralDeclarationFinder tempGeneralDeclarationFinder;
	@BeanReference(type = TempGoodsItemsLocalService.class)
	protected TempGoodsItemsLocalService tempGoodsItemsLocalService;
	@BeanReference(type = TempGoodsItemsService.class)
	protected TempGoodsItemsService tempGoodsItemsService;
	@BeanReference(type = TempGoodsItemsPersistence.class)
	protected TempGoodsItemsPersistence tempGoodsItemsPersistence;
	@BeanReference(type = TempHealthCrewPassengerListLocalService.class)
	protected TempHealthCrewPassengerListLocalService tempHealthCrewPassengerListLocalService;
	@BeanReference(type = TempHealthCrewPassengerListService.class)
	protected TempHealthCrewPassengerListService tempHealthCrewPassengerListService;
	@BeanReference(type = TempHealthCrewPassengerListPersistence.class)
	protected TempHealthCrewPassengerListPersistence tempHealthCrewPassengerListPersistence;
	@BeanReference(type = TempHealthQuestionLocalService.class)
	protected TempHealthQuestionLocalService tempHealthQuestionLocalService;
	@BeanReference(type = TempHealthQuestionService.class)
	protected TempHealthQuestionService tempHealthQuestionService;
	@BeanReference(type = TempHealthQuestionPersistence.class)
	protected TempHealthQuestionPersistence tempHealthQuestionPersistence;
	@BeanReference(type = TempMaritimePaymentConfigLocalService.class)
	protected TempMaritimePaymentConfigLocalService tempMaritimePaymentConfigLocalService;
	@BeanReference(type = TempMaritimePaymentConfigPersistence.class)
	protected TempMaritimePaymentConfigPersistence tempMaritimePaymentConfigPersistence;
	@BeanReference(type = TempNoTiceShipMessageLocalService.class)
	protected TempNoTiceShipMessageLocalService tempNoTiceShipMessageLocalService;
	@BeanReference(type = TempNoTiceShipMessageService.class)
	protected TempNoTiceShipMessageService tempNoTiceShipMessageService;
	@BeanReference(type = TempNoTiceShipMessagePersistence.class)
	protected TempNoTiceShipMessagePersistence tempNoTiceShipMessagePersistence;
	@BeanReference(type = TempNoTiceShipMessageFinder.class)
	protected TempNoTiceShipMessageFinder tempNoTiceShipMessageFinder;
	@BeanReference(type = TempPassengerDetailsLocalService.class)
	protected TempPassengerDetailsLocalService tempPassengerDetailsLocalService;
	@BeanReference(type = TempPassengerDetailsService.class)
	protected TempPassengerDetailsService tempPassengerDetailsService;
	@BeanReference(type = TempPassengerDetailsPersistence.class)
	protected TempPassengerDetailsPersistence tempPassengerDetailsPersistence;
	@BeanReference(type = TempPassengerListLocalService.class)
	protected TempPassengerListLocalService tempPassengerListLocalService;
	@BeanReference(type = TempPassengerListService.class)
	protected TempPassengerListService tempPassengerListService;
	@BeanReference(type = TempPassengerListPersistence.class)
	protected TempPassengerListPersistence tempPassengerListPersistence;
	@BeanReference(type = TempPassengerListFinder.class)
	protected TempPassengerListFinder tempPassengerListFinder;
	@BeanReference(type = TempPersonListLocalService.class)
	protected TempPersonListLocalService tempPersonListLocalService;
	@BeanReference(type = TempPersonListPersistence.class)
	protected TempPersonListPersistence tempPersonListPersistence;
	@BeanReference(type = TempPlantQuarantineLocalService.class)
	protected TempPlantQuarantineLocalService tempPlantQuarantineLocalService;
	@BeanReference(type = TempPlantQuarantineService.class)
	protected TempPlantQuarantineService tempPlantQuarantineService;
	@BeanReference(type = TempPlantQuarantinePersistence.class)
	protected TempPlantQuarantinePersistence tempPlantQuarantinePersistence;
	@BeanReference(type = TempPlantQuarantineFinder.class)
	protected TempPlantQuarantineFinder tempPlantQuarantineFinder;
	@BeanReference(type = TempShipSecurityMessageLocalService.class)
	protected TempShipSecurityMessageLocalService tempShipSecurityMessageLocalService;
	@BeanReference(type = TempShipSecurityMessageService.class)
	protected TempShipSecurityMessageService tempShipSecurityMessageService;
	@BeanReference(type = TempShipSecurityMessagePersistence.class)
	protected TempShipSecurityMessagePersistence tempShipSecurityMessagePersistence;
	@BeanReference(type = TempShipSecurityMessageFinder.class)
	protected TempShipSecurityMessageFinder tempShipSecurityMessageFinder;
	@BeanReference(type = TempShipSecurityPortItemsLocalService.class)
	protected TempShipSecurityPortItemsLocalService tempShipSecurityPortItemsLocalService;
	@BeanReference(type = TempShipSecurityPortItemsService.class)
	protected TempShipSecurityPortItemsService tempShipSecurityPortItemsService;
	@BeanReference(type = TempShipSecurityPortItemsPersistence.class)
	protected TempShipSecurityPortItemsPersistence tempShipSecurityPortItemsPersistence;
	@BeanReference(type = TempShipSecurityPortItemsFinder.class)
	protected TempShipSecurityPortItemsFinder tempShipSecurityPortItemsFinder;
	@BeanReference(type = TempShipStoresDeclarationLocalService.class)
	protected TempShipStoresDeclarationLocalService tempShipStoresDeclarationLocalService;
	@BeanReference(type = TempShipStoresDeclarationService.class)
	protected TempShipStoresDeclarationService tempShipStoresDeclarationService;
	@BeanReference(type = TempShipStoresDeclarationPersistence.class)
	protected TempShipStoresDeclarationPersistence tempShipStoresDeclarationPersistence;
	@BeanReference(type = TempShipStoresDeclarationFinder.class)
	protected TempShipStoresDeclarationFinder tempShipStoresDeclarationFinder;
	@BeanReference(type = TempShipStoresItemsLocalService.class)
	protected TempShipStoresItemsLocalService tempShipStoresItemsLocalService;
	@BeanReference(type = TempShipStoresItemsService.class)
	protected TempShipStoresItemsService tempShipStoresItemsService;
	@BeanReference(type = TempShipStoresItemsPersistence.class)
	protected TempShipStoresItemsPersistence tempShipStoresItemsPersistence;
	@BeanReference(type = TempUnitGeneralLocalService.class)
	protected TempUnitGeneralLocalService tempUnitGeneralLocalService;
	@BeanReference(type = TempUnitGeneralService.class)
	protected TempUnitGeneralService tempUnitGeneralService;
	@BeanReference(type = TempUnitGeneralPersistence.class)
	protected TempUnitGeneralPersistence tempUnitGeneralPersistence;
	@BeanReference(type = TempWasteListLocalService.class)
	protected TempWasteListLocalService tempWasteListLocalService;
	@BeanReference(type = TempWasteListPersistence.class)
	protected TempWasteListPersistence tempWasteListPersistence;
	@BeanReference(type = ViewHoanThanhThuTucLocalService.class)
	protected ViewHoanThanhThuTucLocalService viewHoanThanhThuTucLocalService;
	@BeanReference(type = ViewHoanThanhThuTucService.class)
	protected ViewHoanThanhThuTucService viewHoanThanhThuTucService;
	@BeanReference(type = ViewHoanThanhThuTucPersistence.class)
	protected ViewHoanThanhThuTucPersistence viewHoanThanhThuTucPersistence;
	@BeanReference(type = ViewHoanThanhThuTucFinder.class)
	protected ViewHoanThanhThuTucFinder viewHoanThanhThuTucFinder;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static Log _log = LogFactoryUtil.getLog(TempShipStoresItemsLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}