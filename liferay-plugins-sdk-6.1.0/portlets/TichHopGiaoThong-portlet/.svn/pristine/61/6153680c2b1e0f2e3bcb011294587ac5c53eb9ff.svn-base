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

package vn.gt.dao.danhmuc.service.base;

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

import vn.gt.dao.danhmuc.model.DmRankRating;
import vn.gt.dao.danhmuc.service.DmArrivalPurposeLocalService;
import vn.gt.dao.danhmuc.service.DmDataItemLocalService;
import vn.gt.dao.danhmuc.service.DmDocTypeLocalService;
import vn.gt.dao.danhmuc.service.DmEnterriseLocalService;
import vn.gt.dao.danhmuc.service.DmGoodsLocalService;
import vn.gt.dao.danhmuc.service.DmGoodsTypeLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryArrivalPurposeLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryEnterriseLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryGoodsLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryGoodsTypeLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryMaritimeLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryPackageLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryPassportTypeLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryPortHarbourLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryPortLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryPortRegionLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryPortWharfLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryRankRatingLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryRepresentativeLocalService;
import vn.gt.dao.danhmuc.service.DmHistorySecurityLevelLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryShipAgencyLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryShipTypeLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryStateLocalService;
import vn.gt.dao.danhmuc.service.DmHistoryUnitGeneralLocalService;
import vn.gt.dao.danhmuc.service.DmMaritimeLocalService;
import vn.gt.dao.danhmuc.service.DmPackageLocalService;
import vn.gt.dao.danhmuc.service.DmPassportTypeLocalService;
import vn.gt.dao.danhmuc.service.DmPortHarbourLocalService;
import vn.gt.dao.danhmuc.service.DmPortLocalService;
import vn.gt.dao.danhmuc.service.DmPortRegionLocalService;
import vn.gt.dao.danhmuc.service.DmPortWharfLocalService;
import vn.gt.dao.danhmuc.service.DmRankRatingLocalService;
import vn.gt.dao.danhmuc.service.DmRepresentativeLocalService;
import vn.gt.dao.danhmuc.service.DmSecurityLevelLocalService;
import vn.gt.dao.danhmuc.service.DmShipAgencyLocalService;
import vn.gt.dao.danhmuc.service.DmShipTypeLocalService;
import vn.gt.dao.danhmuc.service.DmStateLocalService;
import vn.gt.dao.danhmuc.service.DmSyncCategoryLocalService;
import vn.gt.dao.danhmuc.service.DmTestN01RequestLocalService;
import vn.gt.dao.danhmuc.service.DmUnitGeneralLocalService;
import vn.gt.dao.danhmuc.service.HistoryRmdcShipLocalService;
import vn.gt.dao.danhmuc.service.HistoryRmdcShipService;
import vn.gt.dao.danhmuc.service.HistorySyncVersionLocalService;
import vn.gt.dao.danhmuc.service.RmdcShipLocalService;
import vn.gt.dao.danhmuc.service.RmdcShipService;
import vn.gt.dao.danhmuc.service.ThamSoHeThongLocalService;
import vn.gt.dao.danhmuc.service.ThamSoHeThongService;
import vn.gt.dao.danhmuc.service.persistence.DmArrivalPurposePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmDataItemFinder;
import vn.gt.dao.danhmuc.service.persistence.DmDataItemPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmDocTypePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmEnterrisePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmGoodsPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmGoodsTypePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryArrivalPurposePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryDocTypePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryEnterrisePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryGoodsPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryGoodsTypePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryMaritimeFinder;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryMaritimePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryPackagePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryPassportTypePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryPortHarbourPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryPortPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryPortRegionPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryPortWharfPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryRankRatingPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryRepresentativePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistorySecurityLevelPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryShipAgencyPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryShipTypePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryStatePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmHistoryUnitGeneralPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmMaritimeFinder;
import vn.gt.dao.danhmuc.service.persistence.DmMaritimePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmPackagePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmPassportTypePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmPortHarbourFinder;
import vn.gt.dao.danhmuc.service.persistence.DmPortHarbourPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmPortPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmPortRegionFinder;
import vn.gt.dao.danhmuc.service.persistence.DmPortRegionPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmPortWharfFinder;
import vn.gt.dao.danhmuc.service.persistence.DmPortWharfPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmRankRatingPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmRepresentativeFinder;
import vn.gt.dao.danhmuc.service.persistence.DmRepresentativePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmSecurityLevelPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmShipAgencyPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmShipTypePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmStateFinder;
import vn.gt.dao.danhmuc.service.persistence.DmStatePersistence;
import vn.gt.dao.danhmuc.service.persistence.DmSyncCategoryPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmTestN01RequestPersistence;
import vn.gt.dao.danhmuc.service.persistence.DmUnitGeneralPersistence;
import vn.gt.dao.danhmuc.service.persistence.HistoryRmdcShipPersistence;
import vn.gt.dao.danhmuc.service.persistence.HistorySyncVersionFinder;
import vn.gt.dao.danhmuc.service.persistence.HistorySyncVersionPersistence;
import vn.gt.dao.danhmuc.service.persistence.RmdcShipPersistence;
import vn.gt.dao.danhmuc.service.persistence.ThamSoHeThongFinder;
import vn.gt.dao.danhmuc.service.persistence.ThamSoHeThongPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the dm rank rating local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.gt.dao.danhmuc.service.impl.DmRankRatingLocalServiceImpl}.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.impl.DmRankRatingLocalServiceImpl
 * @see vn.gt.dao.danhmuc.service.DmRankRatingLocalServiceUtil
 * @generated
 */
public abstract class DmRankRatingLocalServiceBaseImpl
	implements DmRankRatingLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.gt.dao.danhmuc.service.DmRankRatingLocalServiceUtil} to access the dm rank rating local service.
	 */

	/**
	 * Adds the dm rank rating to the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmRankRating the dm rank rating
	 * @return the dm rank rating that was added
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating addDmRankRating(DmRankRating dmRankRating)
		throws SystemException {
		dmRankRating.setNew(true);

		dmRankRating = dmRankRatingPersistence.update(dmRankRating, false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(dmRankRating);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return dmRankRating;
	}

	/**
	 * Creates a new dm rank rating with the primary key. Does not add the dm rank rating to the database.
	 *
	 * @param id the primary key for the new dm rank rating
	 * @return the new dm rank rating
	 */
	public DmRankRating createDmRankRating(int id) {
		return dmRankRatingPersistence.create(id);
	}

	/**
	 * Deletes the dm rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm rank rating
	 * @throws PortalException if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteDmRankRating(int id)
		throws PortalException, SystemException {
		DmRankRating dmRankRating = dmRankRatingPersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(dmRankRating);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the dm rank rating from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmRankRating the dm rank rating
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteDmRankRating(DmRankRating dmRankRating)
		throws SystemException {
		dmRankRatingPersistence.remove(dmRankRating);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(dmRankRating);
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
		return dmRankRatingPersistence.findWithDynamicQuery(dynamicQuery);
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
		return dmRankRatingPersistence.findWithDynamicQuery(dynamicQuery,
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
		return dmRankRatingPersistence.findWithDynamicQuery(dynamicQuery,
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
		return dmRankRatingPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public DmRankRating fetchDmRankRating(int id) throws SystemException {
		return dmRankRatingPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the dm rank rating with the primary key.
	 *
	 * @param id the primary key of the dm rank rating
	 * @return the dm rank rating
	 * @throws PortalException if a dm rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating getDmRankRating(int id)
		throws PortalException, SystemException {
		return dmRankRatingPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return dmRankRatingPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the dm rank ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm rank ratings
	 * @param end the upper bound of the range of dm rank ratings (not inclusive)
	 * @return the range of dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmRankRating> getDmRankRatings(int start, int end)
		throws SystemException {
		return dmRankRatingPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of dm rank ratings.
	 *
	 * @return the number of dm rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	public int getDmRankRatingsCount() throws SystemException {
		return dmRankRatingPersistence.countAll();
	}

	/**
	 * Updates the dm rank rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param dmRankRating the dm rank rating
	 * @return the dm rank rating that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating updateDmRankRating(DmRankRating dmRankRating)
		throws SystemException {
		return updateDmRankRating(dmRankRating, true);
	}

	/**
	 * Updates the dm rank rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param dmRankRating the dm rank rating
	 * @param merge whether to merge the dm rank rating with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the dm rank rating that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public DmRankRating updateDmRankRating(DmRankRating dmRankRating,
		boolean merge) throws SystemException {
		dmRankRating.setNew(false);

		dmRankRating = dmRankRatingPersistence.update(dmRankRating, merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(dmRankRating);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return dmRankRating;
	}

	/**
	 * Returns the dm arrival purpose local service.
	 *
	 * @return the dm arrival purpose local service
	 */
	public DmArrivalPurposeLocalService getDmArrivalPurposeLocalService() {
		return dmArrivalPurposeLocalService;
	}

	/**
	 * Sets the dm arrival purpose local service.
	 *
	 * @param dmArrivalPurposeLocalService the dm arrival purpose local service
	 */
	public void setDmArrivalPurposeLocalService(
		DmArrivalPurposeLocalService dmArrivalPurposeLocalService) {
		this.dmArrivalPurposeLocalService = dmArrivalPurposeLocalService;
	}

	/**
	 * Returns the dm arrival purpose persistence.
	 *
	 * @return the dm arrival purpose persistence
	 */
	public DmArrivalPurposePersistence getDmArrivalPurposePersistence() {
		return dmArrivalPurposePersistence;
	}

	/**
	 * Sets the dm arrival purpose persistence.
	 *
	 * @param dmArrivalPurposePersistence the dm arrival purpose persistence
	 */
	public void setDmArrivalPurposePersistence(
		DmArrivalPurposePersistence dmArrivalPurposePersistence) {
		this.dmArrivalPurposePersistence = dmArrivalPurposePersistence;
	}

	/**
	 * Returns the dm data item local service.
	 *
	 * @return the dm data item local service
	 */
	public DmDataItemLocalService getDmDataItemLocalService() {
		return dmDataItemLocalService;
	}

	/**
	 * Sets the dm data item local service.
	 *
	 * @param dmDataItemLocalService the dm data item local service
	 */
	public void setDmDataItemLocalService(
		DmDataItemLocalService dmDataItemLocalService) {
		this.dmDataItemLocalService = dmDataItemLocalService;
	}

	/**
	 * Returns the dm data item persistence.
	 *
	 * @return the dm data item persistence
	 */
	public DmDataItemPersistence getDmDataItemPersistence() {
		return dmDataItemPersistence;
	}

	/**
	 * Sets the dm data item persistence.
	 *
	 * @param dmDataItemPersistence the dm data item persistence
	 */
	public void setDmDataItemPersistence(
		DmDataItemPersistence dmDataItemPersistence) {
		this.dmDataItemPersistence = dmDataItemPersistence;
	}

	/**
	 * Returns the dm data item finder.
	 *
	 * @return the dm data item finder
	 */
	public DmDataItemFinder getDmDataItemFinder() {
		return dmDataItemFinder;
	}

	/**
	 * Sets the dm data item finder.
	 *
	 * @param dmDataItemFinder the dm data item finder
	 */
	public void setDmDataItemFinder(DmDataItemFinder dmDataItemFinder) {
		this.dmDataItemFinder = dmDataItemFinder;
	}

	/**
	 * Returns the dm doc type local service.
	 *
	 * @return the dm doc type local service
	 */
	public DmDocTypeLocalService getDmDocTypeLocalService() {
		return dmDocTypeLocalService;
	}

	/**
	 * Sets the dm doc type local service.
	 *
	 * @param dmDocTypeLocalService the dm doc type local service
	 */
	public void setDmDocTypeLocalService(
		DmDocTypeLocalService dmDocTypeLocalService) {
		this.dmDocTypeLocalService = dmDocTypeLocalService;
	}

	/**
	 * Returns the dm doc type persistence.
	 *
	 * @return the dm doc type persistence
	 */
	public DmDocTypePersistence getDmDocTypePersistence() {
		return dmDocTypePersistence;
	}

	/**
	 * Sets the dm doc type persistence.
	 *
	 * @param dmDocTypePersistence the dm doc type persistence
	 */
	public void setDmDocTypePersistence(
		DmDocTypePersistence dmDocTypePersistence) {
		this.dmDocTypePersistence = dmDocTypePersistence;
	}

	/**
	 * Returns the dm enterrise local service.
	 *
	 * @return the dm enterrise local service
	 */
	public DmEnterriseLocalService getDmEnterriseLocalService() {
		return dmEnterriseLocalService;
	}

	/**
	 * Sets the dm enterrise local service.
	 *
	 * @param dmEnterriseLocalService the dm enterrise local service
	 */
	public void setDmEnterriseLocalService(
		DmEnterriseLocalService dmEnterriseLocalService) {
		this.dmEnterriseLocalService = dmEnterriseLocalService;
	}

	/**
	 * Returns the dm enterrise persistence.
	 *
	 * @return the dm enterrise persistence
	 */
	public DmEnterrisePersistence getDmEnterrisePersistence() {
		return dmEnterrisePersistence;
	}

	/**
	 * Sets the dm enterrise persistence.
	 *
	 * @param dmEnterrisePersistence the dm enterrise persistence
	 */
	public void setDmEnterrisePersistence(
		DmEnterrisePersistence dmEnterrisePersistence) {
		this.dmEnterrisePersistence = dmEnterrisePersistence;
	}

	/**
	 * Returns the dm goods local service.
	 *
	 * @return the dm goods local service
	 */
	public DmGoodsLocalService getDmGoodsLocalService() {
		return dmGoodsLocalService;
	}

	/**
	 * Sets the dm goods local service.
	 *
	 * @param dmGoodsLocalService the dm goods local service
	 */
	public void setDmGoodsLocalService(DmGoodsLocalService dmGoodsLocalService) {
		this.dmGoodsLocalService = dmGoodsLocalService;
	}

	/**
	 * Returns the dm goods persistence.
	 *
	 * @return the dm goods persistence
	 */
	public DmGoodsPersistence getDmGoodsPersistence() {
		return dmGoodsPersistence;
	}

	/**
	 * Sets the dm goods persistence.
	 *
	 * @param dmGoodsPersistence the dm goods persistence
	 */
	public void setDmGoodsPersistence(DmGoodsPersistence dmGoodsPersistence) {
		this.dmGoodsPersistence = dmGoodsPersistence;
	}

	/**
	 * Returns the dm goods type local service.
	 *
	 * @return the dm goods type local service
	 */
	public DmGoodsTypeLocalService getDmGoodsTypeLocalService() {
		return dmGoodsTypeLocalService;
	}

	/**
	 * Sets the dm goods type local service.
	 *
	 * @param dmGoodsTypeLocalService the dm goods type local service
	 */
	public void setDmGoodsTypeLocalService(
		DmGoodsTypeLocalService dmGoodsTypeLocalService) {
		this.dmGoodsTypeLocalService = dmGoodsTypeLocalService;
	}

	/**
	 * Returns the dm goods type persistence.
	 *
	 * @return the dm goods type persistence
	 */
	public DmGoodsTypePersistence getDmGoodsTypePersistence() {
		return dmGoodsTypePersistence;
	}

	/**
	 * Sets the dm goods type persistence.
	 *
	 * @param dmGoodsTypePersistence the dm goods type persistence
	 */
	public void setDmGoodsTypePersistence(
		DmGoodsTypePersistence dmGoodsTypePersistence) {
		this.dmGoodsTypePersistence = dmGoodsTypePersistence;
	}

	/**
	 * Returns the dm history arrival purpose local service.
	 *
	 * @return the dm history arrival purpose local service
	 */
	public DmHistoryArrivalPurposeLocalService getDmHistoryArrivalPurposeLocalService() {
		return dmHistoryArrivalPurposeLocalService;
	}

	/**
	 * Sets the dm history arrival purpose local service.
	 *
	 * @param dmHistoryArrivalPurposeLocalService the dm history arrival purpose local service
	 */
	public void setDmHistoryArrivalPurposeLocalService(
		DmHistoryArrivalPurposeLocalService dmHistoryArrivalPurposeLocalService) {
		this.dmHistoryArrivalPurposeLocalService = dmHistoryArrivalPurposeLocalService;
	}

	/**
	 * Returns the dm history arrival purpose persistence.
	 *
	 * @return the dm history arrival purpose persistence
	 */
	public DmHistoryArrivalPurposePersistence getDmHistoryArrivalPurposePersistence() {
		return dmHistoryArrivalPurposePersistence;
	}

	/**
	 * Sets the dm history arrival purpose persistence.
	 *
	 * @param dmHistoryArrivalPurposePersistence the dm history arrival purpose persistence
	 */
	public void setDmHistoryArrivalPurposePersistence(
		DmHistoryArrivalPurposePersistence dmHistoryArrivalPurposePersistence) {
		this.dmHistoryArrivalPurposePersistence = dmHistoryArrivalPurposePersistence;
	}

	/**
	 * Returns the dm history doc type local service.
	 *
	 * @return the dm history doc type local service
	 */
	public DmHistoryDocTypeLocalService getDmHistoryDocTypeLocalService() {
		return dmHistoryDocTypeLocalService;
	}

	/**
	 * Sets the dm history doc type local service.
	 *
	 * @param dmHistoryDocTypeLocalService the dm history doc type local service
	 */
	public void setDmHistoryDocTypeLocalService(
		DmHistoryDocTypeLocalService dmHistoryDocTypeLocalService) {
		this.dmHistoryDocTypeLocalService = dmHistoryDocTypeLocalService;
	}

	/**
	 * Returns the dm history doc type persistence.
	 *
	 * @return the dm history doc type persistence
	 */
	public DmHistoryDocTypePersistence getDmHistoryDocTypePersistence() {
		return dmHistoryDocTypePersistence;
	}

	/**
	 * Sets the dm history doc type persistence.
	 *
	 * @param dmHistoryDocTypePersistence the dm history doc type persistence
	 */
	public void setDmHistoryDocTypePersistence(
		DmHistoryDocTypePersistence dmHistoryDocTypePersistence) {
		this.dmHistoryDocTypePersistence = dmHistoryDocTypePersistence;
	}

	/**
	 * Returns the dm history enterrise local service.
	 *
	 * @return the dm history enterrise local service
	 */
	public DmHistoryEnterriseLocalService getDmHistoryEnterriseLocalService() {
		return dmHistoryEnterriseLocalService;
	}

	/**
	 * Sets the dm history enterrise local service.
	 *
	 * @param dmHistoryEnterriseLocalService the dm history enterrise local service
	 */
	public void setDmHistoryEnterriseLocalService(
		DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService) {
		this.dmHistoryEnterriseLocalService = dmHistoryEnterriseLocalService;
	}

	/**
	 * Returns the dm history enterrise persistence.
	 *
	 * @return the dm history enterrise persistence
	 */
	public DmHistoryEnterrisePersistence getDmHistoryEnterrisePersistence() {
		return dmHistoryEnterrisePersistence;
	}

	/**
	 * Sets the dm history enterrise persistence.
	 *
	 * @param dmHistoryEnterrisePersistence the dm history enterrise persistence
	 */
	public void setDmHistoryEnterrisePersistence(
		DmHistoryEnterrisePersistence dmHistoryEnterrisePersistence) {
		this.dmHistoryEnterrisePersistence = dmHistoryEnterrisePersistence;
	}

	/**
	 * Returns the dm history goods local service.
	 *
	 * @return the dm history goods local service
	 */
	public DmHistoryGoodsLocalService getDmHistoryGoodsLocalService() {
		return dmHistoryGoodsLocalService;
	}

	/**
	 * Sets the dm history goods local service.
	 *
	 * @param dmHistoryGoodsLocalService the dm history goods local service
	 */
	public void setDmHistoryGoodsLocalService(
		DmHistoryGoodsLocalService dmHistoryGoodsLocalService) {
		this.dmHistoryGoodsLocalService = dmHistoryGoodsLocalService;
	}

	/**
	 * Returns the dm history goods persistence.
	 *
	 * @return the dm history goods persistence
	 */
	public DmHistoryGoodsPersistence getDmHistoryGoodsPersistence() {
		return dmHistoryGoodsPersistence;
	}

	/**
	 * Sets the dm history goods persistence.
	 *
	 * @param dmHistoryGoodsPersistence the dm history goods persistence
	 */
	public void setDmHistoryGoodsPersistence(
		DmHistoryGoodsPersistence dmHistoryGoodsPersistence) {
		this.dmHistoryGoodsPersistence = dmHistoryGoodsPersistence;
	}

	/**
	 * Returns the dm history goods type local service.
	 *
	 * @return the dm history goods type local service
	 */
	public DmHistoryGoodsTypeLocalService getDmHistoryGoodsTypeLocalService() {
		return dmHistoryGoodsTypeLocalService;
	}

	/**
	 * Sets the dm history goods type local service.
	 *
	 * @param dmHistoryGoodsTypeLocalService the dm history goods type local service
	 */
	public void setDmHistoryGoodsTypeLocalService(
		DmHistoryGoodsTypeLocalService dmHistoryGoodsTypeLocalService) {
		this.dmHistoryGoodsTypeLocalService = dmHistoryGoodsTypeLocalService;
	}

	/**
	 * Returns the dm history goods type persistence.
	 *
	 * @return the dm history goods type persistence
	 */
	public DmHistoryGoodsTypePersistence getDmHistoryGoodsTypePersistence() {
		return dmHistoryGoodsTypePersistence;
	}

	/**
	 * Sets the dm history goods type persistence.
	 *
	 * @param dmHistoryGoodsTypePersistence the dm history goods type persistence
	 */
	public void setDmHistoryGoodsTypePersistence(
		DmHistoryGoodsTypePersistence dmHistoryGoodsTypePersistence) {
		this.dmHistoryGoodsTypePersistence = dmHistoryGoodsTypePersistence;
	}

	/**
	 * Returns the dm history maritime local service.
	 *
	 * @return the dm history maritime local service
	 */
	public DmHistoryMaritimeLocalService getDmHistoryMaritimeLocalService() {
		return dmHistoryMaritimeLocalService;
	}

	/**
	 * Sets the dm history maritime local service.
	 *
	 * @param dmHistoryMaritimeLocalService the dm history maritime local service
	 */
	public void setDmHistoryMaritimeLocalService(
		DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService) {
		this.dmHistoryMaritimeLocalService = dmHistoryMaritimeLocalService;
	}

	/**
	 * Returns the dm history maritime persistence.
	 *
	 * @return the dm history maritime persistence
	 */
	public DmHistoryMaritimePersistence getDmHistoryMaritimePersistence() {
		return dmHistoryMaritimePersistence;
	}

	/**
	 * Sets the dm history maritime persistence.
	 *
	 * @param dmHistoryMaritimePersistence the dm history maritime persistence
	 */
	public void setDmHistoryMaritimePersistence(
		DmHistoryMaritimePersistence dmHistoryMaritimePersistence) {
		this.dmHistoryMaritimePersistence = dmHistoryMaritimePersistence;
	}

	/**
	 * Returns the dm history maritime finder.
	 *
	 * @return the dm history maritime finder
	 */
	public DmHistoryMaritimeFinder getDmHistoryMaritimeFinder() {
		return dmHistoryMaritimeFinder;
	}

	/**
	 * Sets the dm history maritime finder.
	 *
	 * @param dmHistoryMaritimeFinder the dm history maritime finder
	 */
	public void setDmHistoryMaritimeFinder(
		DmHistoryMaritimeFinder dmHistoryMaritimeFinder) {
		this.dmHistoryMaritimeFinder = dmHistoryMaritimeFinder;
	}

	/**
	 * Returns the dm history package local service.
	 *
	 * @return the dm history package local service
	 */
	public DmHistoryPackageLocalService getDmHistoryPackageLocalService() {
		return dmHistoryPackageLocalService;
	}

	/**
	 * Sets the dm history package local service.
	 *
	 * @param dmHistoryPackageLocalService the dm history package local service
	 */
	public void setDmHistoryPackageLocalService(
		DmHistoryPackageLocalService dmHistoryPackageLocalService) {
		this.dmHistoryPackageLocalService = dmHistoryPackageLocalService;
	}

	/**
	 * Returns the dm history package persistence.
	 *
	 * @return the dm history package persistence
	 */
	public DmHistoryPackagePersistence getDmHistoryPackagePersistence() {
		return dmHistoryPackagePersistence;
	}

	/**
	 * Sets the dm history package persistence.
	 *
	 * @param dmHistoryPackagePersistence the dm history package persistence
	 */
	public void setDmHistoryPackagePersistence(
		DmHistoryPackagePersistence dmHistoryPackagePersistence) {
		this.dmHistoryPackagePersistence = dmHistoryPackagePersistence;
	}

	/**
	 * Returns the dm history passport type local service.
	 *
	 * @return the dm history passport type local service
	 */
	public DmHistoryPassportTypeLocalService getDmHistoryPassportTypeLocalService() {
		return dmHistoryPassportTypeLocalService;
	}

	/**
	 * Sets the dm history passport type local service.
	 *
	 * @param dmHistoryPassportTypeLocalService the dm history passport type local service
	 */
	public void setDmHistoryPassportTypeLocalService(
		DmHistoryPassportTypeLocalService dmHistoryPassportTypeLocalService) {
		this.dmHistoryPassportTypeLocalService = dmHistoryPassportTypeLocalService;
	}

	/**
	 * Returns the dm history passport type persistence.
	 *
	 * @return the dm history passport type persistence
	 */
	public DmHistoryPassportTypePersistence getDmHistoryPassportTypePersistence() {
		return dmHistoryPassportTypePersistence;
	}

	/**
	 * Sets the dm history passport type persistence.
	 *
	 * @param dmHistoryPassportTypePersistence the dm history passport type persistence
	 */
	public void setDmHistoryPassportTypePersistence(
		DmHistoryPassportTypePersistence dmHistoryPassportTypePersistence) {
		this.dmHistoryPassportTypePersistence = dmHistoryPassportTypePersistence;
	}

	/**
	 * Returns the dm history port local service.
	 *
	 * @return the dm history port local service
	 */
	public DmHistoryPortLocalService getDmHistoryPortLocalService() {
		return dmHistoryPortLocalService;
	}

	/**
	 * Sets the dm history port local service.
	 *
	 * @param dmHistoryPortLocalService the dm history port local service
	 */
	public void setDmHistoryPortLocalService(
		DmHistoryPortLocalService dmHistoryPortLocalService) {
		this.dmHistoryPortLocalService = dmHistoryPortLocalService;
	}

	/**
	 * Returns the dm history port persistence.
	 *
	 * @return the dm history port persistence
	 */
	public DmHistoryPortPersistence getDmHistoryPortPersistence() {
		return dmHistoryPortPersistence;
	}

	/**
	 * Sets the dm history port persistence.
	 *
	 * @param dmHistoryPortPersistence the dm history port persistence
	 */
	public void setDmHistoryPortPersistence(
		DmHistoryPortPersistence dmHistoryPortPersistence) {
		this.dmHistoryPortPersistence = dmHistoryPortPersistence;
	}

	/**
	 * Returns the dm history port harbour local service.
	 *
	 * @return the dm history port harbour local service
	 */
	public DmHistoryPortHarbourLocalService getDmHistoryPortHarbourLocalService() {
		return dmHistoryPortHarbourLocalService;
	}

	/**
	 * Sets the dm history port harbour local service.
	 *
	 * @param dmHistoryPortHarbourLocalService the dm history port harbour local service
	 */
	public void setDmHistoryPortHarbourLocalService(
		DmHistoryPortHarbourLocalService dmHistoryPortHarbourLocalService) {
		this.dmHistoryPortHarbourLocalService = dmHistoryPortHarbourLocalService;
	}

	/**
	 * Returns the dm history port harbour persistence.
	 *
	 * @return the dm history port harbour persistence
	 */
	public DmHistoryPortHarbourPersistence getDmHistoryPortHarbourPersistence() {
		return dmHistoryPortHarbourPersistence;
	}

	/**
	 * Sets the dm history port harbour persistence.
	 *
	 * @param dmHistoryPortHarbourPersistence the dm history port harbour persistence
	 */
	public void setDmHistoryPortHarbourPersistence(
		DmHistoryPortHarbourPersistence dmHistoryPortHarbourPersistence) {
		this.dmHistoryPortHarbourPersistence = dmHistoryPortHarbourPersistence;
	}

	/**
	 * Returns the dm history port region local service.
	 *
	 * @return the dm history port region local service
	 */
	public DmHistoryPortRegionLocalService getDmHistoryPortRegionLocalService() {
		return dmHistoryPortRegionLocalService;
	}

	/**
	 * Sets the dm history port region local service.
	 *
	 * @param dmHistoryPortRegionLocalService the dm history port region local service
	 */
	public void setDmHistoryPortRegionLocalService(
		DmHistoryPortRegionLocalService dmHistoryPortRegionLocalService) {
		this.dmHistoryPortRegionLocalService = dmHistoryPortRegionLocalService;
	}

	/**
	 * Returns the dm history port region persistence.
	 *
	 * @return the dm history port region persistence
	 */
	public DmHistoryPortRegionPersistence getDmHistoryPortRegionPersistence() {
		return dmHistoryPortRegionPersistence;
	}

	/**
	 * Sets the dm history port region persistence.
	 *
	 * @param dmHistoryPortRegionPersistence the dm history port region persistence
	 */
	public void setDmHistoryPortRegionPersistence(
		DmHistoryPortRegionPersistence dmHistoryPortRegionPersistence) {
		this.dmHistoryPortRegionPersistence = dmHistoryPortRegionPersistence;
	}

	/**
	 * Returns the dm history port wharf local service.
	 *
	 * @return the dm history port wharf local service
	 */
	public DmHistoryPortWharfLocalService getDmHistoryPortWharfLocalService() {
		return dmHistoryPortWharfLocalService;
	}

	/**
	 * Sets the dm history port wharf local service.
	 *
	 * @param dmHistoryPortWharfLocalService the dm history port wharf local service
	 */
	public void setDmHistoryPortWharfLocalService(
		DmHistoryPortWharfLocalService dmHistoryPortWharfLocalService) {
		this.dmHistoryPortWharfLocalService = dmHistoryPortWharfLocalService;
	}

	/**
	 * Returns the dm history port wharf persistence.
	 *
	 * @return the dm history port wharf persistence
	 */
	public DmHistoryPortWharfPersistence getDmHistoryPortWharfPersistence() {
		return dmHistoryPortWharfPersistence;
	}

	/**
	 * Sets the dm history port wharf persistence.
	 *
	 * @param dmHistoryPortWharfPersistence the dm history port wharf persistence
	 */
	public void setDmHistoryPortWharfPersistence(
		DmHistoryPortWharfPersistence dmHistoryPortWharfPersistence) {
		this.dmHistoryPortWharfPersistence = dmHistoryPortWharfPersistence;
	}

	/**
	 * Returns the dm history rank rating local service.
	 *
	 * @return the dm history rank rating local service
	 */
	public DmHistoryRankRatingLocalService getDmHistoryRankRatingLocalService() {
		return dmHistoryRankRatingLocalService;
	}

	/**
	 * Sets the dm history rank rating local service.
	 *
	 * @param dmHistoryRankRatingLocalService the dm history rank rating local service
	 */
	public void setDmHistoryRankRatingLocalService(
		DmHistoryRankRatingLocalService dmHistoryRankRatingLocalService) {
		this.dmHistoryRankRatingLocalService = dmHistoryRankRatingLocalService;
	}

	/**
	 * Returns the dm history rank rating persistence.
	 *
	 * @return the dm history rank rating persistence
	 */
	public DmHistoryRankRatingPersistence getDmHistoryRankRatingPersistence() {
		return dmHistoryRankRatingPersistence;
	}

	/**
	 * Sets the dm history rank rating persistence.
	 *
	 * @param dmHistoryRankRatingPersistence the dm history rank rating persistence
	 */
	public void setDmHistoryRankRatingPersistence(
		DmHistoryRankRatingPersistence dmHistoryRankRatingPersistence) {
		this.dmHistoryRankRatingPersistence = dmHistoryRankRatingPersistence;
	}

	/**
	 * Returns the dm history representative local service.
	 *
	 * @return the dm history representative local service
	 */
	public DmHistoryRepresentativeLocalService getDmHistoryRepresentativeLocalService() {
		return dmHistoryRepresentativeLocalService;
	}

	/**
	 * Sets the dm history representative local service.
	 *
	 * @param dmHistoryRepresentativeLocalService the dm history representative local service
	 */
	public void setDmHistoryRepresentativeLocalService(
		DmHistoryRepresentativeLocalService dmHistoryRepresentativeLocalService) {
		this.dmHistoryRepresentativeLocalService = dmHistoryRepresentativeLocalService;
	}

	/**
	 * Returns the dm history representative persistence.
	 *
	 * @return the dm history representative persistence
	 */
	public DmHistoryRepresentativePersistence getDmHistoryRepresentativePersistence() {
		return dmHistoryRepresentativePersistence;
	}

	/**
	 * Sets the dm history representative persistence.
	 *
	 * @param dmHistoryRepresentativePersistence the dm history representative persistence
	 */
	public void setDmHistoryRepresentativePersistence(
		DmHistoryRepresentativePersistence dmHistoryRepresentativePersistence) {
		this.dmHistoryRepresentativePersistence = dmHistoryRepresentativePersistence;
	}

	/**
	 * Returns the dm history security level local service.
	 *
	 * @return the dm history security level local service
	 */
	public DmHistorySecurityLevelLocalService getDmHistorySecurityLevelLocalService() {
		return dmHistorySecurityLevelLocalService;
	}

	/**
	 * Sets the dm history security level local service.
	 *
	 * @param dmHistorySecurityLevelLocalService the dm history security level local service
	 */
	public void setDmHistorySecurityLevelLocalService(
		DmHistorySecurityLevelLocalService dmHistorySecurityLevelLocalService) {
		this.dmHistorySecurityLevelLocalService = dmHistorySecurityLevelLocalService;
	}

	/**
	 * Returns the dm history security level persistence.
	 *
	 * @return the dm history security level persistence
	 */
	public DmHistorySecurityLevelPersistence getDmHistorySecurityLevelPersistence() {
		return dmHistorySecurityLevelPersistence;
	}

	/**
	 * Sets the dm history security level persistence.
	 *
	 * @param dmHistorySecurityLevelPersistence the dm history security level persistence
	 */
	public void setDmHistorySecurityLevelPersistence(
		DmHistorySecurityLevelPersistence dmHistorySecurityLevelPersistence) {
		this.dmHistorySecurityLevelPersistence = dmHistorySecurityLevelPersistence;
	}

	/**
	 * Returns the dm history ship agency local service.
	 *
	 * @return the dm history ship agency local service
	 */
	public DmHistoryShipAgencyLocalService getDmHistoryShipAgencyLocalService() {
		return dmHistoryShipAgencyLocalService;
	}

	/**
	 * Sets the dm history ship agency local service.
	 *
	 * @param dmHistoryShipAgencyLocalService the dm history ship agency local service
	 */
	public void setDmHistoryShipAgencyLocalService(
		DmHistoryShipAgencyLocalService dmHistoryShipAgencyLocalService) {
		this.dmHistoryShipAgencyLocalService = dmHistoryShipAgencyLocalService;
	}

	/**
	 * Returns the dm history ship agency persistence.
	 *
	 * @return the dm history ship agency persistence
	 */
	public DmHistoryShipAgencyPersistence getDmHistoryShipAgencyPersistence() {
		return dmHistoryShipAgencyPersistence;
	}

	/**
	 * Sets the dm history ship agency persistence.
	 *
	 * @param dmHistoryShipAgencyPersistence the dm history ship agency persistence
	 */
	public void setDmHistoryShipAgencyPersistence(
		DmHistoryShipAgencyPersistence dmHistoryShipAgencyPersistence) {
		this.dmHistoryShipAgencyPersistence = dmHistoryShipAgencyPersistence;
	}

	/**
	 * Returns the dm history ship type local service.
	 *
	 * @return the dm history ship type local service
	 */
	public DmHistoryShipTypeLocalService getDmHistoryShipTypeLocalService() {
		return dmHistoryShipTypeLocalService;
	}

	/**
	 * Sets the dm history ship type local service.
	 *
	 * @param dmHistoryShipTypeLocalService the dm history ship type local service
	 */
	public void setDmHistoryShipTypeLocalService(
		DmHistoryShipTypeLocalService dmHistoryShipTypeLocalService) {
		this.dmHistoryShipTypeLocalService = dmHistoryShipTypeLocalService;
	}

	/**
	 * Returns the dm history ship type persistence.
	 *
	 * @return the dm history ship type persistence
	 */
	public DmHistoryShipTypePersistence getDmHistoryShipTypePersistence() {
		return dmHistoryShipTypePersistence;
	}

	/**
	 * Sets the dm history ship type persistence.
	 *
	 * @param dmHistoryShipTypePersistence the dm history ship type persistence
	 */
	public void setDmHistoryShipTypePersistence(
		DmHistoryShipTypePersistence dmHistoryShipTypePersistence) {
		this.dmHistoryShipTypePersistence = dmHistoryShipTypePersistence;
	}

	/**
	 * Returns the dm history state local service.
	 *
	 * @return the dm history state local service
	 */
	public DmHistoryStateLocalService getDmHistoryStateLocalService() {
		return dmHistoryStateLocalService;
	}

	/**
	 * Sets the dm history state local service.
	 *
	 * @param dmHistoryStateLocalService the dm history state local service
	 */
	public void setDmHistoryStateLocalService(
		DmHistoryStateLocalService dmHistoryStateLocalService) {
		this.dmHistoryStateLocalService = dmHistoryStateLocalService;
	}

	/**
	 * Returns the dm history state persistence.
	 *
	 * @return the dm history state persistence
	 */
	public DmHistoryStatePersistence getDmHistoryStatePersistence() {
		return dmHistoryStatePersistence;
	}

	/**
	 * Sets the dm history state persistence.
	 *
	 * @param dmHistoryStatePersistence the dm history state persistence
	 */
	public void setDmHistoryStatePersistence(
		DmHistoryStatePersistence dmHistoryStatePersistence) {
		this.dmHistoryStatePersistence = dmHistoryStatePersistence;
	}

	/**
	 * Returns the dm history unit general local service.
	 *
	 * @return the dm history unit general local service
	 */
	public DmHistoryUnitGeneralLocalService getDmHistoryUnitGeneralLocalService() {
		return dmHistoryUnitGeneralLocalService;
	}

	/**
	 * Sets the dm history unit general local service.
	 *
	 * @param dmHistoryUnitGeneralLocalService the dm history unit general local service
	 */
	public void setDmHistoryUnitGeneralLocalService(
		DmHistoryUnitGeneralLocalService dmHistoryUnitGeneralLocalService) {
		this.dmHistoryUnitGeneralLocalService = dmHistoryUnitGeneralLocalService;
	}

	/**
	 * Returns the dm history unit general persistence.
	 *
	 * @return the dm history unit general persistence
	 */
	public DmHistoryUnitGeneralPersistence getDmHistoryUnitGeneralPersistence() {
		return dmHistoryUnitGeneralPersistence;
	}

	/**
	 * Sets the dm history unit general persistence.
	 *
	 * @param dmHistoryUnitGeneralPersistence the dm history unit general persistence
	 */
	public void setDmHistoryUnitGeneralPersistence(
		DmHistoryUnitGeneralPersistence dmHistoryUnitGeneralPersistence) {
		this.dmHistoryUnitGeneralPersistence = dmHistoryUnitGeneralPersistence;
	}

	/**
	 * Returns the dm maritime local service.
	 *
	 * @return the dm maritime local service
	 */
	public DmMaritimeLocalService getDmMaritimeLocalService() {
		return dmMaritimeLocalService;
	}

	/**
	 * Sets the dm maritime local service.
	 *
	 * @param dmMaritimeLocalService the dm maritime local service
	 */
	public void setDmMaritimeLocalService(
		DmMaritimeLocalService dmMaritimeLocalService) {
		this.dmMaritimeLocalService = dmMaritimeLocalService;
	}

	/**
	 * Returns the dm maritime persistence.
	 *
	 * @return the dm maritime persistence
	 */
	public DmMaritimePersistence getDmMaritimePersistence() {
		return dmMaritimePersistence;
	}

	/**
	 * Sets the dm maritime persistence.
	 *
	 * @param dmMaritimePersistence the dm maritime persistence
	 */
	public void setDmMaritimePersistence(
		DmMaritimePersistence dmMaritimePersistence) {
		this.dmMaritimePersistence = dmMaritimePersistence;
	}

	/**
	 * Returns the dm maritime finder.
	 *
	 * @return the dm maritime finder
	 */
	public DmMaritimeFinder getDmMaritimeFinder() {
		return dmMaritimeFinder;
	}

	/**
	 * Sets the dm maritime finder.
	 *
	 * @param dmMaritimeFinder the dm maritime finder
	 */
	public void setDmMaritimeFinder(DmMaritimeFinder dmMaritimeFinder) {
		this.dmMaritimeFinder = dmMaritimeFinder;
	}

	/**
	 * Returns the dm package local service.
	 *
	 * @return the dm package local service
	 */
	public DmPackageLocalService getDmPackageLocalService() {
		return dmPackageLocalService;
	}

	/**
	 * Sets the dm package local service.
	 *
	 * @param dmPackageLocalService the dm package local service
	 */
	public void setDmPackageLocalService(
		DmPackageLocalService dmPackageLocalService) {
		this.dmPackageLocalService = dmPackageLocalService;
	}

	/**
	 * Returns the dm package persistence.
	 *
	 * @return the dm package persistence
	 */
	public DmPackagePersistence getDmPackagePersistence() {
		return dmPackagePersistence;
	}

	/**
	 * Sets the dm package persistence.
	 *
	 * @param dmPackagePersistence the dm package persistence
	 */
	public void setDmPackagePersistence(
		DmPackagePersistence dmPackagePersistence) {
		this.dmPackagePersistence = dmPackagePersistence;
	}

	/**
	 * Returns the dm passport type local service.
	 *
	 * @return the dm passport type local service
	 */
	public DmPassportTypeLocalService getDmPassportTypeLocalService() {
		return dmPassportTypeLocalService;
	}

	/**
	 * Sets the dm passport type local service.
	 *
	 * @param dmPassportTypeLocalService the dm passport type local service
	 */
	public void setDmPassportTypeLocalService(
		DmPassportTypeLocalService dmPassportTypeLocalService) {
		this.dmPassportTypeLocalService = dmPassportTypeLocalService;
	}

	/**
	 * Returns the dm passport type persistence.
	 *
	 * @return the dm passport type persistence
	 */
	public DmPassportTypePersistence getDmPassportTypePersistence() {
		return dmPassportTypePersistence;
	}

	/**
	 * Sets the dm passport type persistence.
	 *
	 * @param dmPassportTypePersistence the dm passport type persistence
	 */
	public void setDmPassportTypePersistence(
		DmPassportTypePersistence dmPassportTypePersistence) {
		this.dmPassportTypePersistence = dmPassportTypePersistence;
	}

	/**
	 * Returns the dm port local service.
	 *
	 * @return the dm port local service
	 */
	public DmPortLocalService getDmPortLocalService() {
		return dmPortLocalService;
	}

	/**
	 * Sets the dm port local service.
	 *
	 * @param dmPortLocalService the dm port local service
	 */
	public void setDmPortLocalService(DmPortLocalService dmPortLocalService) {
		this.dmPortLocalService = dmPortLocalService;
	}

	/**
	 * Returns the dm port persistence.
	 *
	 * @return the dm port persistence
	 */
	public DmPortPersistence getDmPortPersistence() {
		return dmPortPersistence;
	}

	/**
	 * Sets the dm port persistence.
	 *
	 * @param dmPortPersistence the dm port persistence
	 */
	public void setDmPortPersistence(DmPortPersistence dmPortPersistence) {
		this.dmPortPersistence = dmPortPersistence;
	}

	/**
	 * Returns the dm port harbour local service.
	 *
	 * @return the dm port harbour local service
	 */
	public DmPortHarbourLocalService getDmPortHarbourLocalService() {
		return dmPortHarbourLocalService;
	}

	/**
	 * Sets the dm port harbour local service.
	 *
	 * @param dmPortHarbourLocalService the dm port harbour local service
	 */
	public void setDmPortHarbourLocalService(
		DmPortHarbourLocalService dmPortHarbourLocalService) {
		this.dmPortHarbourLocalService = dmPortHarbourLocalService;
	}

	/**
	 * Returns the dm port harbour persistence.
	 *
	 * @return the dm port harbour persistence
	 */
	public DmPortHarbourPersistence getDmPortHarbourPersistence() {
		return dmPortHarbourPersistence;
	}

	/**
	 * Sets the dm port harbour persistence.
	 *
	 * @param dmPortHarbourPersistence the dm port harbour persistence
	 */
	public void setDmPortHarbourPersistence(
		DmPortHarbourPersistence dmPortHarbourPersistence) {
		this.dmPortHarbourPersistence = dmPortHarbourPersistence;
	}

	/**
	 * Returns the dm port harbour finder.
	 *
	 * @return the dm port harbour finder
	 */
	public DmPortHarbourFinder getDmPortHarbourFinder() {
		return dmPortHarbourFinder;
	}

	/**
	 * Sets the dm port harbour finder.
	 *
	 * @param dmPortHarbourFinder the dm port harbour finder
	 */
	public void setDmPortHarbourFinder(DmPortHarbourFinder dmPortHarbourFinder) {
		this.dmPortHarbourFinder = dmPortHarbourFinder;
	}

	/**
	 * Returns the dm port region local service.
	 *
	 * @return the dm port region local service
	 */
	public DmPortRegionLocalService getDmPortRegionLocalService() {
		return dmPortRegionLocalService;
	}

	/**
	 * Sets the dm port region local service.
	 *
	 * @param dmPortRegionLocalService the dm port region local service
	 */
	public void setDmPortRegionLocalService(
		DmPortRegionLocalService dmPortRegionLocalService) {
		this.dmPortRegionLocalService = dmPortRegionLocalService;
	}

	/**
	 * Returns the dm port region persistence.
	 *
	 * @return the dm port region persistence
	 */
	public DmPortRegionPersistence getDmPortRegionPersistence() {
		return dmPortRegionPersistence;
	}

	/**
	 * Sets the dm port region persistence.
	 *
	 * @param dmPortRegionPersistence the dm port region persistence
	 */
	public void setDmPortRegionPersistence(
		DmPortRegionPersistence dmPortRegionPersistence) {
		this.dmPortRegionPersistence = dmPortRegionPersistence;
	}

	/**
	 * Returns the dm port region finder.
	 *
	 * @return the dm port region finder
	 */
	public DmPortRegionFinder getDmPortRegionFinder() {
		return dmPortRegionFinder;
	}

	/**
	 * Sets the dm port region finder.
	 *
	 * @param dmPortRegionFinder the dm port region finder
	 */
	public void setDmPortRegionFinder(DmPortRegionFinder dmPortRegionFinder) {
		this.dmPortRegionFinder = dmPortRegionFinder;
	}

	/**
	 * Returns the dm port wharf local service.
	 *
	 * @return the dm port wharf local service
	 */
	public DmPortWharfLocalService getDmPortWharfLocalService() {
		return dmPortWharfLocalService;
	}

	/**
	 * Sets the dm port wharf local service.
	 *
	 * @param dmPortWharfLocalService the dm port wharf local service
	 */
	public void setDmPortWharfLocalService(
		DmPortWharfLocalService dmPortWharfLocalService) {
		this.dmPortWharfLocalService = dmPortWharfLocalService;
	}

	/**
	 * Returns the dm port wharf persistence.
	 *
	 * @return the dm port wharf persistence
	 */
	public DmPortWharfPersistence getDmPortWharfPersistence() {
		return dmPortWharfPersistence;
	}

	/**
	 * Sets the dm port wharf persistence.
	 *
	 * @param dmPortWharfPersistence the dm port wharf persistence
	 */
	public void setDmPortWharfPersistence(
		DmPortWharfPersistence dmPortWharfPersistence) {
		this.dmPortWharfPersistence = dmPortWharfPersistence;
	}

	/**
	 * Returns the dm port wharf finder.
	 *
	 * @return the dm port wharf finder
	 */
	public DmPortWharfFinder getDmPortWharfFinder() {
		return dmPortWharfFinder;
	}

	/**
	 * Sets the dm port wharf finder.
	 *
	 * @param dmPortWharfFinder the dm port wharf finder
	 */
	public void setDmPortWharfFinder(DmPortWharfFinder dmPortWharfFinder) {
		this.dmPortWharfFinder = dmPortWharfFinder;
	}

	/**
	 * Returns the dm rank rating local service.
	 *
	 * @return the dm rank rating local service
	 */
	public DmRankRatingLocalService getDmRankRatingLocalService() {
		return dmRankRatingLocalService;
	}

	/**
	 * Sets the dm rank rating local service.
	 *
	 * @param dmRankRatingLocalService the dm rank rating local service
	 */
	public void setDmRankRatingLocalService(
		DmRankRatingLocalService dmRankRatingLocalService) {
		this.dmRankRatingLocalService = dmRankRatingLocalService;
	}

	/**
	 * Returns the dm rank rating persistence.
	 *
	 * @return the dm rank rating persistence
	 */
	public DmRankRatingPersistence getDmRankRatingPersistence() {
		return dmRankRatingPersistence;
	}

	/**
	 * Sets the dm rank rating persistence.
	 *
	 * @param dmRankRatingPersistence the dm rank rating persistence
	 */
	public void setDmRankRatingPersistence(
		DmRankRatingPersistence dmRankRatingPersistence) {
		this.dmRankRatingPersistence = dmRankRatingPersistence;
	}

	/**
	 * Returns the dm representative local service.
	 *
	 * @return the dm representative local service
	 */
	public DmRepresentativeLocalService getDmRepresentativeLocalService() {
		return dmRepresentativeLocalService;
	}

	/**
	 * Sets the dm representative local service.
	 *
	 * @param dmRepresentativeLocalService the dm representative local service
	 */
	public void setDmRepresentativeLocalService(
		DmRepresentativeLocalService dmRepresentativeLocalService) {
		this.dmRepresentativeLocalService = dmRepresentativeLocalService;
	}

	/**
	 * Returns the dm representative persistence.
	 *
	 * @return the dm representative persistence
	 */
	public DmRepresentativePersistence getDmRepresentativePersistence() {
		return dmRepresentativePersistence;
	}

	/**
	 * Sets the dm representative persistence.
	 *
	 * @param dmRepresentativePersistence the dm representative persistence
	 */
	public void setDmRepresentativePersistence(
		DmRepresentativePersistence dmRepresentativePersistence) {
		this.dmRepresentativePersistence = dmRepresentativePersistence;
	}

	/**
	 * Returns the dm representative finder.
	 *
	 * @return the dm representative finder
	 */
	public DmRepresentativeFinder getDmRepresentativeFinder() {
		return dmRepresentativeFinder;
	}

	/**
	 * Sets the dm representative finder.
	 *
	 * @param dmRepresentativeFinder the dm representative finder
	 */
	public void setDmRepresentativeFinder(
		DmRepresentativeFinder dmRepresentativeFinder) {
		this.dmRepresentativeFinder = dmRepresentativeFinder;
	}

	/**
	 * Returns the dm security level local service.
	 *
	 * @return the dm security level local service
	 */
	public DmSecurityLevelLocalService getDmSecurityLevelLocalService() {
		return dmSecurityLevelLocalService;
	}

	/**
	 * Sets the dm security level local service.
	 *
	 * @param dmSecurityLevelLocalService the dm security level local service
	 */
	public void setDmSecurityLevelLocalService(
		DmSecurityLevelLocalService dmSecurityLevelLocalService) {
		this.dmSecurityLevelLocalService = dmSecurityLevelLocalService;
	}

	/**
	 * Returns the dm security level persistence.
	 *
	 * @return the dm security level persistence
	 */
	public DmSecurityLevelPersistence getDmSecurityLevelPersistence() {
		return dmSecurityLevelPersistence;
	}

	/**
	 * Sets the dm security level persistence.
	 *
	 * @param dmSecurityLevelPersistence the dm security level persistence
	 */
	public void setDmSecurityLevelPersistence(
		DmSecurityLevelPersistence dmSecurityLevelPersistence) {
		this.dmSecurityLevelPersistence = dmSecurityLevelPersistence;
	}

	/**
	 * Returns the dm ship agency local service.
	 *
	 * @return the dm ship agency local service
	 */
	public DmShipAgencyLocalService getDmShipAgencyLocalService() {
		return dmShipAgencyLocalService;
	}

	/**
	 * Sets the dm ship agency local service.
	 *
	 * @param dmShipAgencyLocalService the dm ship agency local service
	 */
	public void setDmShipAgencyLocalService(
		DmShipAgencyLocalService dmShipAgencyLocalService) {
		this.dmShipAgencyLocalService = dmShipAgencyLocalService;
	}

	/**
	 * Returns the dm ship agency persistence.
	 *
	 * @return the dm ship agency persistence
	 */
	public DmShipAgencyPersistence getDmShipAgencyPersistence() {
		return dmShipAgencyPersistence;
	}

	/**
	 * Sets the dm ship agency persistence.
	 *
	 * @param dmShipAgencyPersistence the dm ship agency persistence
	 */
	public void setDmShipAgencyPersistence(
		DmShipAgencyPersistence dmShipAgencyPersistence) {
		this.dmShipAgencyPersistence = dmShipAgencyPersistence;
	}

	/**
	 * Returns the dm ship type local service.
	 *
	 * @return the dm ship type local service
	 */
	public DmShipTypeLocalService getDmShipTypeLocalService() {
		return dmShipTypeLocalService;
	}

	/**
	 * Sets the dm ship type local service.
	 *
	 * @param dmShipTypeLocalService the dm ship type local service
	 */
	public void setDmShipTypeLocalService(
		DmShipTypeLocalService dmShipTypeLocalService) {
		this.dmShipTypeLocalService = dmShipTypeLocalService;
	}

	/**
	 * Returns the dm ship type persistence.
	 *
	 * @return the dm ship type persistence
	 */
	public DmShipTypePersistence getDmShipTypePersistence() {
		return dmShipTypePersistence;
	}

	/**
	 * Sets the dm ship type persistence.
	 *
	 * @param dmShipTypePersistence the dm ship type persistence
	 */
	public void setDmShipTypePersistence(
		DmShipTypePersistence dmShipTypePersistence) {
		this.dmShipTypePersistence = dmShipTypePersistence;
	}

	/**
	 * Returns the dm state local service.
	 *
	 * @return the dm state local service
	 */
	public DmStateLocalService getDmStateLocalService() {
		return dmStateLocalService;
	}

	/**
	 * Sets the dm state local service.
	 *
	 * @param dmStateLocalService the dm state local service
	 */
	public void setDmStateLocalService(DmStateLocalService dmStateLocalService) {
		this.dmStateLocalService = dmStateLocalService;
	}

	/**
	 * Returns the dm state persistence.
	 *
	 * @return the dm state persistence
	 */
	public DmStatePersistence getDmStatePersistence() {
		return dmStatePersistence;
	}

	/**
	 * Sets the dm state persistence.
	 *
	 * @param dmStatePersistence the dm state persistence
	 */
	public void setDmStatePersistence(DmStatePersistence dmStatePersistence) {
		this.dmStatePersistence = dmStatePersistence;
	}

	/**
	 * Returns the dm state finder.
	 *
	 * @return the dm state finder
	 */
	public DmStateFinder getDmStateFinder() {
		return dmStateFinder;
	}

	/**
	 * Sets the dm state finder.
	 *
	 * @param dmStateFinder the dm state finder
	 */
	public void setDmStateFinder(DmStateFinder dmStateFinder) {
		this.dmStateFinder = dmStateFinder;
	}

	/**
	 * Returns the dm sync category local service.
	 *
	 * @return the dm sync category local service
	 */
	public DmSyncCategoryLocalService getDmSyncCategoryLocalService() {
		return dmSyncCategoryLocalService;
	}

	/**
	 * Sets the dm sync category local service.
	 *
	 * @param dmSyncCategoryLocalService the dm sync category local service
	 */
	public void setDmSyncCategoryLocalService(
		DmSyncCategoryLocalService dmSyncCategoryLocalService) {
		this.dmSyncCategoryLocalService = dmSyncCategoryLocalService;
	}

	/**
	 * Returns the dm sync category persistence.
	 *
	 * @return the dm sync category persistence
	 */
	public DmSyncCategoryPersistence getDmSyncCategoryPersistence() {
		return dmSyncCategoryPersistence;
	}

	/**
	 * Sets the dm sync category persistence.
	 *
	 * @param dmSyncCategoryPersistence the dm sync category persistence
	 */
	public void setDmSyncCategoryPersistence(
		DmSyncCategoryPersistence dmSyncCategoryPersistence) {
		this.dmSyncCategoryPersistence = dmSyncCategoryPersistence;
	}

	/**
	 * Returns the dm test n01 request local service.
	 *
	 * @return the dm test n01 request local service
	 */
	public DmTestN01RequestLocalService getDmTestN01RequestLocalService() {
		return dmTestN01RequestLocalService;
	}

	/**
	 * Sets the dm test n01 request local service.
	 *
	 * @param dmTestN01RequestLocalService the dm test n01 request local service
	 */
	public void setDmTestN01RequestLocalService(
		DmTestN01RequestLocalService dmTestN01RequestLocalService) {
		this.dmTestN01RequestLocalService = dmTestN01RequestLocalService;
	}

	/**
	 * Returns the dm test n01 request persistence.
	 *
	 * @return the dm test n01 request persistence
	 */
	public DmTestN01RequestPersistence getDmTestN01RequestPersistence() {
		return dmTestN01RequestPersistence;
	}

	/**
	 * Sets the dm test n01 request persistence.
	 *
	 * @param dmTestN01RequestPersistence the dm test n01 request persistence
	 */
	public void setDmTestN01RequestPersistence(
		DmTestN01RequestPersistence dmTestN01RequestPersistence) {
		this.dmTestN01RequestPersistence = dmTestN01RequestPersistence;
	}

	/**
	 * Returns the dm unit general local service.
	 *
	 * @return the dm unit general local service
	 */
	public DmUnitGeneralLocalService getDmUnitGeneralLocalService() {
		return dmUnitGeneralLocalService;
	}

	/**
	 * Sets the dm unit general local service.
	 *
	 * @param dmUnitGeneralLocalService the dm unit general local service
	 */
	public void setDmUnitGeneralLocalService(
		DmUnitGeneralLocalService dmUnitGeneralLocalService) {
		this.dmUnitGeneralLocalService = dmUnitGeneralLocalService;
	}

	/**
	 * Returns the dm unit general persistence.
	 *
	 * @return the dm unit general persistence
	 */
	public DmUnitGeneralPersistence getDmUnitGeneralPersistence() {
		return dmUnitGeneralPersistence;
	}

	/**
	 * Sets the dm unit general persistence.
	 *
	 * @param dmUnitGeneralPersistence the dm unit general persistence
	 */
	public void setDmUnitGeneralPersistence(
		DmUnitGeneralPersistence dmUnitGeneralPersistence) {
		this.dmUnitGeneralPersistence = dmUnitGeneralPersistence;
	}

	/**
	 * Returns the history rmdc ship local service.
	 *
	 * @return the history rmdc ship local service
	 */
	public HistoryRmdcShipLocalService getHistoryRmdcShipLocalService() {
		return historyRmdcShipLocalService;
	}

	/**
	 * Sets the history rmdc ship local service.
	 *
	 * @param historyRmdcShipLocalService the history rmdc ship local service
	 */
	public void setHistoryRmdcShipLocalService(
		HistoryRmdcShipLocalService historyRmdcShipLocalService) {
		this.historyRmdcShipLocalService = historyRmdcShipLocalService;
	}

	/**
	 * Returns the history rmdc ship remote service.
	 *
	 * @return the history rmdc ship remote service
	 */
	public HistoryRmdcShipService getHistoryRmdcShipService() {
		return historyRmdcShipService;
	}

	/**
	 * Sets the history rmdc ship remote service.
	 *
	 * @param historyRmdcShipService the history rmdc ship remote service
	 */
	public void setHistoryRmdcShipService(
		HistoryRmdcShipService historyRmdcShipService) {
		this.historyRmdcShipService = historyRmdcShipService;
	}

	/**
	 * Returns the history rmdc ship persistence.
	 *
	 * @return the history rmdc ship persistence
	 */
	public HistoryRmdcShipPersistence getHistoryRmdcShipPersistence() {
		return historyRmdcShipPersistence;
	}

	/**
	 * Sets the history rmdc ship persistence.
	 *
	 * @param historyRmdcShipPersistence the history rmdc ship persistence
	 */
	public void setHistoryRmdcShipPersistence(
		HistoryRmdcShipPersistence historyRmdcShipPersistence) {
		this.historyRmdcShipPersistence = historyRmdcShipPersistence;
	}

	/**
	 * Returns the history sync version local service.
	 *
	 * @return the history sync version local service
	 */
	public HistorySyncVersionLocalService getHistorySyncVersionLocalService() {
		return historySyncVersionLocalService;
	}

	/**
	 * Sets the history sync version local service.
	 *
	 * @param historySyncVersionLocalService the history sync version local service
	 */
	public void setHistorySyncVersionLocalService(
		HistorySyncVersionLocalService historySyncVersionLocalService) {
		this.historySyncVersionLocalService = historySyncVersionLocalService;
	}

	/**
	 * Returns the history sync version persistence.
	 *
	 * @return the history sync version persistence
	 */
	public HistorySyncVersionPersistence getHistorySyncVersionPersistence() {
		return historySyncVersionPersistence;
	}

	/**
	 * Sets the history sync version persistence.
	 *
	 * @param historySyncVersionPersistence the history sync version persistence
	 */
	public void setHistorySyncVersionPersistence(
		HistorySyncVersionPersistence historySyncVersionPersistence) {
		this.historySyncVersionPersistence = historySyncVersionPersistence;
	}

	/**
	 * Returns the history sync version finder.
	 *
	 * @return the history sync version finder
	 */
	public HistorySyncVersionFinder getHistorySyncVersionFinder() {
		return historySyncVersionFinder;
	}

	/**
	 * Sets the history sync version finder.
	 *
	 * @param historySyncVersionFinder the history sync version finder
	 */
	public void setHistorySyncVersionFinder(
		HistorySyncVersionFinder historySyncVersionFinder) {
		this.historySyncVersionFinder = historySyncVersionFinder;
	}

	/**
	 * Returns the rmdc ship local service.
	 *
	 * @return the rmdc ship local service
	 */
	public RmdcShipLocalService getRmdcShipLocalService() {
		return rmdcShipLocalService;
	}

	/**
	 * Sets the rmdc ship local service.
	 *
	 * @param rmdcShipLocalService the rmdc ship local service
	 */
	public void setRmdcShipLocalService(
		RmdcShipLocalService rmdcShipLocalService) {
		this.rmdcShipLocalService = rmdcShipLocalService;
	}

	/**
	 * Returns the rmdc ship remote service.
	 *
	 * @return the rmdc ship remote service
	 */
	public RmdcShipService getRmdcShipService() {
		return rmdcShipService;
	}

	/**
	 * Sets the rmdc ship remote service.
	 *
	 * @param rmdcShipService the rmdc ship remote service
	 */
	public void setRmdcShipService(RmdcShipService rmdcShipService) {
		this.rmdcShipService = rmdcShipService;
	}

	/**
	 * Returns the rmdc ship persistence.
	 *
	 * @return the rmdc ship persistence
	 */
	public RmdcShipPersistence getRmdcShipPersistence() {
		return rmdcShipPersistence;
	}

	/**
	 * Sets the rmdc ship persistence.
	 *
	 * @param rmdcShipPersistence the rmdc ship persistence
	 */
	public void setRmdcShipPersistence(RmdcShipPersistence rmdcShipPersistence) {
		this.rmdcShipPersistence = rmdcShipPersistence;
	}

	/**
	 * Returns the tham so he thong local service.
	 *
	 * @return the tham so he thong local service
	 */
	public ThamSoHeThongLocalService getThamSoHeThongLocalService() {
		return thamSoHeThongLocalService;
	}

	/**
	 * Sets the tham so he thong local service.
	 *
	 * @param thamSoHeThongLocalService the tham so he thong local service
	 */
	public void setThamSoHeThongLocalService(
		ThamSoHeThongLocalService thamSoHeThongLocalService) {
		this.thamSoHeThongLocalService = thamSoHeThongLocalService;
	}

	/**
	 * Returns the tham so he thong remote service.
	 *
	 * @return the tham so he thong remote service
	 */
	public ThamSoHeThongService getThamSoHeThongService() {
		return thamSoHeThongService;
	}

	/**
	 * Sets the tham so he thong remote service.
	 *
	 * @param thamSoHeThongService the tham so he thong remote service
	 */
	public void setThamSoHeThongService(
		ThamSoHeThongService thamSoHeThongService) {
		this.thamSoHeThongService = thamSoHeThongService;
	}

	/**
	 * Returns the tham so he thong persistence.
	 *
	 * @return the tham so he thong persistence
	 */
	public ThamSoHeThongPersistence getThamSoHeThongPersistence() {
		return thamSoHeThongPersistence;
	}

	/**
	 * Sets the tham so he thong persistence.
	 *
	 * @param thamSoHeThongPersistence the tham so he thong persistence
	 */
	public void setThamSoHeThongPersistence(
		ThamSoHeThongPersistence thamSoHeThongPersistence) {
		this.thamSoHeThongPersistence = thamSoHeThongPersistence;
	}

	/**
	 * Returns the tham so he thong finder.
	 *
	 * @return the tham so he thong finder
	 */
	public ThamSoHeThongFinder getThamSoHeThongFinder() {
		return thamSoHeThongFinder;
	}

	/**
	 * Sets the tham so he thong finder.
	 *
	 * @param thamSoHeThongFinder the tham so he thong finder
	 */
	public void setThamSoHeThongFinder(ThamSoHeThongFinder thamSoHeThongFinder) {
		this.thamSoHeThongFinder = thamSoHeThongFinder;
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
		PersistedModelLocalServiceRegistryUtil.register("vn.gt.dao.danhmuc.model.DmRankRating",
			dmRankRatingLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.gt.dao.danhmuc.model.DmRankRating");
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
		return DmRankRating.class;
	}

	protected String getModelClassName() {
		return DmRankRating.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dmRankRatingPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = DmArrivalPurposeLocalService.class)
	protected DmArrivalPurposeLocalService dmArrivalPurposeLocalService;
	@BeanReference(type = DmArrivalPurposePersistence.class)
	protected DmArrivalPurposePersistence dmArrivalPurposePersistence;
	@BeanReference(type = DmDataItemLocalService.class)
	protected DmDataItemLocalService dmDataItemLocalService;
	@BeanReference(type = DmDataItemPersistence.class)
	protected DmDataItemPersistence dmDataItemPersistence;
	@BeanReference(type = DmDataItemFinder.class)
	protected DmDataItemFinder dmDataItemFinder;
	@BeanReference(type = DmDocTypeLocalService.class)
	protected DmDocTypeLocalService dmDocTypeLocalService;
	@BeanReference(type = DmDocTypePersistence.class)
	protected DmDocTypePersistence dmDocTypePersistence;
	@BeanReference(type = DmEnterriseLocalService.class)
	protected DmEnterriseLocalService dmEnterriseLocalService;
	@BeanReference(type = DmEnterrisePersistence.class)
	protected DmEnterrisePersistence dmEnterrisePersistence;
	@BeanReference(type = DmGoodsLocalService.class)
	protected DmGoodsLocalService dmGoodsLocalService;
	@BeanReference(type = DmGoodsPersistence.class)
	protected DmGoodsPersistence dmGoodsPersistence;
	@BeanReference(type = DmGoodsTypeLocalService.class)
	protected DmGoodsTypeLocalService dmGoodsTypeLocalService;
	@BeanReference(type = DmGoodsTypePersistence.class)
	protected DmGoodsTypePersistence dmGoodsTypePersistence;
	@BeanReference(type = DmHistoryArrivalPurposeLocalService.class)
	protected DmHistoryArrivalPurposeLocalService dmHistoryArrivalPurposeLocalService;
	@BeanReference(type = DmHistoryArrivalPurposePersistence.class)
	protected DmHistoryArrivalPurposePersistence dmHistoryArrivalPurposePersistence;
	@BeanReference(type = DmHistoryDocTypeLocalService.class)
	protected DmHistoryDocTypeLocalService dmHistoryDocTypeLocalService;
	@BeanReference(type = DmHistoryDocTypePersistence.class)
	protected DmHistoryDocTypePersistence dmHistoryDocTypePersistence;
	@BeanReference(type = DmHistoryEnterriseLocalService.class)
	protected DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService;
	@BeanReference(type = DmHistoryEnterrisePersistence.class)
	protected DmHistoryEnterrisePersistence dmHistoryEnterrisePersistence;
	@BeanReference(type = DmHistoryGoodsLocalService.class)
	protected DmHistoryGoodsLocalService dmHistoryGoodsLocalService;
	@BeanReference(type = DmHistoryGoodsPersistence.class)
	protected DmHistoryGoodsPersistence dmHistoryGoodsPersistence;
	@BeanReference(type = DmHistoryGoodsTypeLocalService.class)
	protected DmHistoryGoodsTypeLocalService dmHistoryGoodsTypeLocalService;
	@BeanReference(type = DmHistoryGoodsTypePersistence.class)
	protected DmHistoryGoodsTypePersistence dmHistoryGoodsTypePersistence;
	@BeanReference(type = DmHistoryMaritimeLocalService.class)
	protected DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService;
	@BeanReference(type = DmHistoryMaritimePersistence.class)
	protected DmHistoryMaritimePersistence dmHistoryMaritimePersistence;
	@BeanReference(type = DmHistoryMaritimeFinder.class)
	protected DmHistoryMaritimeFinder dmHistoryMaritimeFinder;
	@BeanReference(type = DmHistoryPackageLocalService.class)
	protected DmHistoryPackageLocalService dmHistoryPackageLocalService;
	@BeanReference(type = DmHistoryPackagePersistence.class)
	protected DmHistoryPackagePersistence dmHistoryPackagePersistence;
	@BeanReference(type = DmHistoryPassportTypeLocalService.class)
	protected DmHistoryPassportTypeLocalService dmHistoryPassportTypeLocalService;
	@BeanReference(type = DmHistoryPassportTypePersistence.class)
	protected DmHistoryPassportTypePersistence dmHistoryPassportTypePersistence;
	@BeanReference(type = DmHistoryPortLocalService.class)
	protected DmHistoryPortLocalService dmHistoryPortLocalService;
	@BeanReference(type = DmHistoryPortPersistence.class)
	protected DmHistoryPortPersistence dmHistoryPortPersistence;
	@BeanReference(type = DmHistoryPortHarbourLocalService.class)
	protected DmHistoryPortHarbourLocalService dmHistoryPortHarbourLocalService;
	@BeanReference(type = DmHistoryPortHarbourPersistence.class)
	protected DmHistoryPortHarbourPersistence dmHistoryPortHarbourPersistence;
	@BeanReference(type = DmHistoryPortRegionLocalService.class)
	protected DmHistoryPortRegionLocalService dmHistoryPortRegionLocalService;
	@BeanReference(type = DmHistoryPortRegionPersistence.class)
	protected DmHistoryPortRegionPersistence dmHistoryPortRegionPersistence;
	@BeanReference(type = DmHistoryPortWharfLocalService.class)
	protected DmHistoryPortWharfLocalService dmHistoryPortWharfLocalService;
	@BeanReference(type = DmHistoryPortWharfPersistence.class)
	protected DmHistoryPortWharfPersistence dmHistoryPortWharfPersistence;
	@BeanReference(type = DmHistoryRankRatingLocalService.class)
	protected DmHistoryRankRatingLocalService dmHistoryRankRatingLocalService;
	@BeanReference(type = DmHistoryRankRatingPersistence.class)
	protected DmHistoryRankRatingPersistence dmHistoryRankRatingPersistence;
	@BeanReference(type = DmHistoryRepresentativeLocalService.class)
	protected DmHistoryRepresentativeLocalService dmHistoryRepresentativeLocalService;
	@BeanReference(type = DmHistoryRepresentativePersistence.class)
	protected DmHistoryRepresentativePersistence dmHistoryRepresentativePersistence;
	@BeanReference(type = DmHistorySecurityLevelLocalService.class)
	protected DmHistorySecurityLevelLocalService dmHistorySecurityLevelLocalService;
	@BeanReference(type = DmHistorySecurityLevelPersistence.class)
	protected DmHistorySecurityLevelPersistence dmHistorySecurityLevelPersistence;
	@BeanReference(type = DmHistoryShipAgencyLocalService.class)
	protected DmHistoryShipAgencyLocalService dmHistoryShipAgencyLocalService;
	@BeanReference(type = DmHistoryShipAgencyPersistence.class)
	protected DmHistoryShipAgencyPersistence dmHistoryShipAgencyPersistence;
	@BeanReference(type = DmHistoryShipTypeLocalService.class)
	protected DmHistoryShipTypeLocalService dmHistoryShipTypeLocalService;
	@BeanReference(type = DmHistoryShipTypePersistence.class)
	protected DmHistoryShipTypePersistence dmHistoryShipTypePersistence;
	@BeanReference(type = DmHistoryStateLocalService.class)
	protected DmHistoryStateLocalService dmHistoryStateLocalService;
	@BeanReference(type = DmHistoryStatePersistence.class)
	protected DmHistoryStatePersistence dmHistoryStatePersistence;
	@BeanReference(type = DmHistoryUnitGeneralLocalService.class)
	protected DmHistoryUnitGeneralLocalService dmHistoryUnitGeneralLocalService;
	@BeanReference(type = DmHistoryUnitGeneralPersistence.class)
	protected DmHistoryUnitGeneralPersistence dmHistoryUnitGeneralPersistence;
	@BeanReference(type = DmMaritimeLocalService.class)
	protected DmMaritimeLocalService dmMaritimeLocalService;
	@BeanReference(type = DmMaritimePersistence.class)
	protected DmMaritimePersistence dmMaritimePersistence;
	@BeanReference(type = DmMaritimeFinder.class)
	protected DmMaritimeFinder dmMaritimeFinder;
	@BeanReference(type = DmPackageLocalService.class)
	protected DmPackageLocalService dmPackageLocalService;
	@BeanReference(type = DmPackagePersistence.class)
	protected DmPackagePersistence dmPackagePersistence;
	@BeanReference(type = DmPassportTypeLocalService.class)
	protected DmPassportTypeLocalService dmPassportTypeLocalService;
	@BeanReference(type = DmPassportTypePersistence.class)
	protected DmPassportTypePersistence dmPassportTypePersistence;
	@BeanReference(type = DmPortLocalService.class)
	protected DmPortLocalService dmPortLocalService;
	@BeanReference(type = DmPortPersistence.class)
	protected DmPortPersistence dmPortPersistence;
	@BeanReference(type = DmPortHarbourLocalService.class)
	protected DmPortHarbourLocalService dmPortHarbourLocalService;
	@BeanReference(type = DmPortHarbourPersistence.class)
	protected DmPortHarbourPersistence dmPortHarbourPersistence;
	@BeanReference(type = DmPortHarbourFinder.class)
	protected DmPortHarbourFinder dmPortHarbourFinder;
	@BeanReference(type = DmPortRegionLocalService.class)
	protected DmPortRegionLocalService dmPortRegionLocalService;
	@BeanReference(type = DmPortRegionPersistence.class)
	protected DmPortRegionPersistence dmPortRegionPersistence;
	@BeanReference(type = DmPortRegionFinder.class)
	protected DmPortRegionFinder dmPortRegionFinder;
	@BeanReference(type = DmPortWharfLocalService.class)
	protected DmPortWharfLocalService dmPortWharfLocalService;
	@BeanReference(type = DmPortWharfPersistence.class)
	protected DmPortWharfPersistence dmPortWharfPersistence;
	@BeanReference(type = DmPortWharfFinder.class)
	protected DmPortWharfFinder dmPortWharfFinder;
	@BeanReference(type = DmRankRatingLocalService.class)
	protected DmRankRatingLocalService dmRankRatingLocalService;
	@BeanReference(type = DmRankRatingPersistence.class)
	protected DmRankRatingPersistence dmRankRatingPersistence;
	@BeanReference(type = DmRepresentativeLocalService.class)
	protected DmRepresentativeLocalService dmRepresentativeLocalService;
	@BeanReference(type = DmRepresentativePersistence.class)
	protected DmRepresentativePersistence dmRepresentativePersistence;
	@BeanReference(type = DmRepresentativeFinder.class)
	protected DmRepresentativeFinder dmRepresentativeFinder;
	@BeanReference(type = DmSecurityLevelLocalService.class)
	protected DmSecurityLevelLocalService dmSecurityLevelLocalService;
	@BeanReference(type = DmSecurityLevelPersistence.class)
	protected DmSecurityLevelPersistence dmSecurityLevelPersistence;
	@BeanReference(type = DmShipAgencyLocalService.class)
	protected DmShipAgencyLocalService dmShipAgencyLocalService;
	@BeanReference(type = DmShipAgencyPersistence.class)
	protected DmShipAgencyPersistence dmShipAgencyPersistence;
	@BeanReference(type = DmShipTypeLocalService.class)
	protected DmShipTypeLocalService dmShipTypeLocalService;
	@BeanReference(type = DmShipTypePersistence.class)
	protected DmShipTypePersistence dmShipTypePersistence;
	@BeanReference(type = DmStateLocalService.class)
	protected DmStateLocalService dmStateLocalService;
	@BeanReference(type = DmStatePersistence.class)
	protected DmStatePersistence dmStatePersistence;
	@BeanReference(type = DmStateFinder.class)
	protected DmStateFinder dmStateFinder;
	@BeanReference(type = DmSyncCategoryLocalService.class)
	protected DmSyncCategoryLocalService dmSyncCategoryLocalService;
	@BeanReference(type = DmSyncCategoryPersistence.class)
	protected DmSyncCategoryPersistence dmSyncCategoryPersistence;
	@BeanReference(type = DmTestN01RequestLocalService.class)
	protected DmTestN01RequestLocalService dmTestN01RequestLocalService;
	@BeanReference(type = DmTestN01RequestPersistence.class)
	protected DmTestN01RequestPersistence dmTestN01RequestPersistence;
	@BeanReference(type = DmUnitGeneralLocalService.class)
	protected DmUnitGeneralLocalService dmUnitGeneralLocalService;
	@BeanReference(type = DmUnitGeneralPersistence.class)
	protected DmUnitGeneralPersistence dmUnitGeneralPersistence;
	@BeanReference(type = HistoryRmdcShipLocalService.class)
	protected HistoryRmdcShipLocalService historyRmdcShipLocalService;
	@BeanReference(type = HistoryRmdcShipService.class)
	protected HistoryRmdcShipService historyRmdcShipService;
	@BeanReference(type = HistoryRmdcShipPersistence.class)
	protected HistoryRmdcShipPersistence historyRmdcShipPersistence;
	@BeanReference(type = HistorySyncVersionLocalService.class)
	protected HistorySyncVersionLocalService historySyncVersionLocalService;
	@BeanReference(type = HistorySyncVersionPersistence.class)
	protected HistorySyncVersionPersistence historySyncVersionPersistence;
	@BeanReference(type = HistorySyncVersionFinder.class)
	protected HistorySyncVersionFinder historySyncVersionFinder;
	@BeanReference(type = RmdcShipLocalService.class)
	protected RmdcShipLocalService rmdcShipLocalService;
	@BeanReference(type = RmdcShipService.class)
	protected RmdcShipService rmdcShipService;
	@BeanReference(type = RmdcShipPersistence.class)
	protected RmdcShipPersistence rmdcShipPersistence;
	@BeanReference(type = ThamSoHeThongLocalService.class)
	protected ThamSoHeThongLocalService thamSoHeThongLocalService;
	@BeanReference(type = ThamSoHeThongService.class)
	protected ThamSoHeThongService thamSoHeThongService;
	@BeanReference(type = ThamSoHeThongPersistence.class)
	protected ThamSoHeThongPersistence thamSoHeThongPersistence;
	@BeanReference(type = ThamSoHeThongFinder.class)
	protected ThamSoHeThongFinder thamSoHeThongFinder;
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
	private static Log _log = LogFactoryUtil.getLog(DmRankRatingLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}