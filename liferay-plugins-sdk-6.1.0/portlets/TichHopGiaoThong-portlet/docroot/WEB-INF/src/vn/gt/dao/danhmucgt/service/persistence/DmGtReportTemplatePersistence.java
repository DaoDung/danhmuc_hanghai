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

package vn.gt.dao.danhmucgt.service.persistence;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmucgt.model.DmGtReportTemplate;

/**
 * The persistence interface for the dm gt report template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtReportTemplatePersistenceImpl
 * @see DmGtReportTemplateUtil
 * @generated
 */
public interface DmGtReportTemplatePersistence extends BasePersistence<DmGtReportTemplate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGtReportTemplateUtil} to access the dm gt report template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm gt report template in the entity cache if it is enabled.
	*
	* @param dmGtReportTemplate the dm gt report template
	*/
	public void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGtReportTemplate dmGtReportTemplate);

	/**
	* Caches the dm gt report templates in the entity cache if it is enabled.
	*
	* @param dmGtReportTemplates the dm gt report templates
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGtReportTemplate> dmGtReportTemplates);

	/**
	* Creates a new dm gt report template with the primary key. Does not add the dm gt report template to the database.
	*
	* @param id the primary key for the new dm gt report template
	* @return the new dm gt report template
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate create(long id);

	/**
	* Removes the dm gt report template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt report template
	* @return the dm gt report template that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException;

	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtReportTemplate dmGtReportTemplate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt report template with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException} if it could not be found.
	*
	* @param id the primary key of the dm gt report template
	* @return the dm gt report template
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException;

	/**
	* Returns the dm gt report template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt report template
	* @return the dm gt report template, or <code>null</code> if a dm gt report template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt report template where reportCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException} if it could not be found.
	*
	* @param reportCode the report code
	* @return the matching dm gt report template
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate findByReportCode(
		int reportCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException;

	/**
	* Returns the dm gt report template where reportCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param reportCode the report code
	* @return the matching dm gt report template, or <code>null</code> if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate fetchByReportCode(
		int reportCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt report template where reportCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param reportCode the report code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm gt report template, or <code>null</code> if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate fetchByReportCode(
		int reportCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt report templates where reportType = &#63;.
	*
	* @param reportType the report type
	* @return the matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtReportTemplate> findByreportType(
		int reportType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt report templates where reportType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param reportType the report type
	* @param start the lower bound of the range of dm gt report templates
	* @param end the upper bound of the range of dm gt report templates (not inclusive)
	* @return the range of matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtReportTemplate> findByreportType(
		int reportType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt report templates where reportType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param reportType the report type
	* @param start the lower bound of the range of dm gt report templates
	* @param end the upper bound of the range of dm gt report templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtReportTemplate> findByreportType(
		int reportType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm gt report template in the ordered set where reportType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param reportType the report type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt report template
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate findByreportType_First(
		int reportType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException;

	/**
	* Returns the last dm gt report template in the ordered set where reportType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param reportType the report type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt report template
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate findByreportType_Last(
		int reportType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException;

	/**
	* Returns the dm gt report templates before and after the current dm gt report template in the ordered set where reportType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm gt report template
	* @param reportType the report type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt report template
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate[] findByreportType_PrevAndNext(
		long id, int reportType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException;

	/**
	* Returns all the dm gt report templates.
	*
	* @return the dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtReportTemplate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt report templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt report templates
	* @param end the upper bound of the range of dm gt report templates (not inclusive)
	* @return the range of dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtReportTemplate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt report templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt report templates
	* @param end the upper bound of the range of dm gt report templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtReportTemplate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm gt report template where reportCode = &#63; from the database.
	*
	* @param reportCode the report code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByReportCode(int reportCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException;

	/**
	* Removes all the dm gt report templates where reportType = &#63; from the database.
	*
	* @param reportType the report type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByreportType(int reportType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt report templates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt report templates where reportCode = &#63;.
	*
	* @param reportCode the report code
	* @return the number of matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public int countByReportCode(int reportCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt report templates where reportType = &#63;.
	*
	* @param reportType the report type
	* @return the number of matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public int countByreportType(int reportType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt report templates.
	*
	* @return the number of dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmGtReportTemplate remove(DmGtReportTemplate dmGtReportTemplate)
		throws SystemException;
}