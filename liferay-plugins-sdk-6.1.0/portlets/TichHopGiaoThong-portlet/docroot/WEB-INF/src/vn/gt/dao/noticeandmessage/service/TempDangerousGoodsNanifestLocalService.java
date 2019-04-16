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

package vn.gt.dao.noticeandmessage.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the temp dangerous goods nanifest local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempDangerousGoodsNanifestLocalServiceUtil
 * @see vn.gt.dao.noticeandmessage.service.base.TempDangerousGoodsNanifestLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempDangerousGoodsNanifestLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TempDangerousGoodsNanifestLocalService
	extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempDangerousGoodsNanifestLocalServiceUtil} to access the temp dangerous goods nanifest local service. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempDangerousGoodsNanifestLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the temp dangerous goods nanifest to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsNanifest the temp dangerous goods nanifest
	* @return the temp dangerous goods nanifest that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest addTempDangerousGoodsNanifest(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new temp dangerous goods nanifest with the primary key. Does not add the temp dangerous goods nanifest to the database.
	*
	* @param id the primary key for the new temp dangerous goods nanifest
	* @return the new temp dangerous goods nanifest
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest createTempDangerousGoodsNanifest(
		long id);

	/**
	* Deletes the temp dangerous goods nanifest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp dangerous goods nanifest
	* @throws PortalException if a temp dangerous goods nanifest with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDangerousGoodsNanifest(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the temp dangerous goods nanifest from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsNanifest the temp dangerous goods nanifest
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDangerousGoodsNanifest(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest fetchTempDangerousGoodsNanifest(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp dangerous goods nanifest with the primary key.
	*
	* @param id the primary key of the temp dangerous goods nanifest
	* @return the temp dangerous goods nanifest
	* @throws PortalException if a temp dangerous goods nanifest with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest getTempDangerousGoodsNanifest(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp dangerous goods nanifests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp dangerous goods nanifests
	* @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	* @return the range of temp dangerous goods nanifests
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest> getTempDangerousGoodsNanifests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp dangerous goods nanifests.
	*
	* @return the number of temp dangerous goods nanifests
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTempDangerousGoodsNanifestsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the temp dangerous goods nanifest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsNanifest the temp dangerous goods nanifest
	* @return the temp dangerous goods nanifest that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest updateTempDangerousGoodsNanifest(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the temp dangerous goods nanifest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsNanifest the temp dangerous goods nanifest
	* @param merge whether to merge the temp dangerous goods nanifest with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp dangerous goods nanifest that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest updateTempDangerousGoodsNanifest(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState);

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear);

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear);

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear);
}