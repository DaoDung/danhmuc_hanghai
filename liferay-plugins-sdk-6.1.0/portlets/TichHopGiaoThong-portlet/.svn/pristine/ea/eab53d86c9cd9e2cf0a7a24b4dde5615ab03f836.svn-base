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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author win_64
 */
public class TempDocumentLocalServiceClp implements TempDocumentLocalService {
	public TempDocumentLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addTempDocumentMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addTempDocument",
				vn.gt.dao.noticeandmessage.model.TempDocument.class);

		_createTempDocumentMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createTempDocument", long.class);

		_deleteTempDocumentMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteTempDocument", long.class);

		_deleteTempDocumentMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteTempDocument",
				vn.gt.dao.noticeandmessage.model.TempDocument.class);

		_dynamicQueryMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class);

		_dynamicQueryMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class,
				int.class, int.class);

		_dynamicQueryMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class,
				int.class, int.class,
				com.liferay.portal.kernel.util.OrderByComparator.class);

		_dynamicQueryCountMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQueryCount",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class);

		_fetchTempDocumentMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchTempDocument", long.class);

		_getTempDocumentMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempDocument", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getTempDocumentsMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempDocuments", int.class, int.class);

		_getTempDocumentsCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempDocumentsCount");

		_updateTempDocumentMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateTempDocument",
				vn.gt.dao.noticeandmessage.model.TempDocument.class);

		_updateTempDocumentMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateTempDocument",
				vn.gt.dao.noticeandmessage.model.TempDocument.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_getTemDocumentByRequestCodeMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTemDocumentByRequestCode", java.lang.String.class);

		_getByDocumentNameAndDocumentYearMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByDocumentNameAndDocumentYear", long.class, int.class);

		_getCallSignByDocumentNameAndDocumentYearMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"getCallSignByDocumentNameAndDocumentYear", long.class,
				int.class);

		_findTemDocumentByDocumentNameAndDocumentYearMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTemDocumentByDocumentNameAndDocumentYear", long.class,
				int.class);

		_findTempDocumentArivalByMaritimeCodeAndDateFromAndDateToMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDocumentArivalByMaritimeCodeAndDateFromAndDateTo",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_findTempDocumentLeaveByMaritimeCodeAndDateFromAndDateToMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDocumentLeaveByMaritimeCodeAndDateFromAndDateTo",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_countTempDocumentForStatisticsReportMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentForStatisticsReport", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentCompletionForStatisticsReportMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentCompletionForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_countTempDocumentForStatisticsByDateMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentForStatisticsByDate", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentJoinIssueShiftingOrderForStatisticsReportMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentJoinIssueShiftingOrderForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentJoinIssuePermissionTransitForStatisticsReportMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentJoinIssuePermissionTransitForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentJoinIssuePortClearanceForStatisticsReportMethodKey28 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentJoinIssuePortClearanceForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentJoinIssueAcceptanceForStatisticsReportMethodKey29 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentJoinIssueAcceptanceForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentSignedIssueShiftingOrderForStatisticsReportMethodKey30 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentSignedIssueShiftingOrderForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentSignedIssuePermissionTransitForStatisticsReportMethodKey31 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentSignedIssuePermissionTransitForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentSignedIssuePortClearanceForStatisticsReportMethodKey32 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentSignedIssuePortClearanceForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_countTempDocumentSignedIssueAcceptanceForStatisticsReportMethodKey33 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentSignedIssueAcceptanceForStatisticsReport",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findTemDocumentByDocumentNameDocumentYearMethodKey34 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTemDocumentByDocumentNameDocumentYear", long.class,
				int.class);

		_findTempDocumentByRequestStateMethodKey35 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDocumentByRequestState", java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countTempDocumentByRequestStateMethodKey36 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentByRequestState", java.lang.String.class,
				java.lang.String.class);

		_findTempDocumentByDocumentStatusCodeMethodKey37 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDocumentByDocumentStatusCode", java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countTempDocumentByDocumentStatusCodeMethodKey38 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentByDocumentStatusCode",
				java.lang.String.class, java.lang.String.class);

		_findTempDocumentByKeHoachMethodKey39 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDocumentByKeHoach", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countTempDocumentByKeHoachMethodKey40 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentByKeHoach", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findTempDocumentByKeHoachMethodKey41 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDocumentByKeHoach", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countTempDocumentByKeHoachMethodKey42 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentByKeHoach", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findAllMethodKey43 = new MethodKey(_classLoaderProxy.getClassName(),
				"findAll", int.class, int.class);

		_countAllMethodKey44 = new MethodKey(_classLoaderProxy.getClassName(),
				"countAll");

		_findTempDocumentByThuTucMethodKey45 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDocumentByThuTuc", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countTempDocumentByThuTucMethodKey46 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentByThuTuc", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findDanhSachHoSoRoleThuTucMethodKey47 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachHoSoRoleThuTuc", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class, boolean.class,
				boolean.class);

		_countDanhSachHoSoRoleThuTucMethodKey48 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachHoSoRoleThuTuc", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, boolean.class, boolean.class);

		_findDanhSachHoSoRoleThuTucMethodKey49 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachHoSoRoleThuTuc", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class, boolean.class,
				boolean.class);

		_countDanhSachHoSoRoleThuTucMethodKey50 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachHoSoRoleThuTuc", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, boolean.class, boolean.class);

		_findTempDocumentInfoMethodKey51 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDocumentInfo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);

		_countTempDocumentInfoMethodKey52 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDocumentInfo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_findKeHoachYCBSMethodKey53 = new MethodKey(_classLoaderProxy.getClassName(),
				"findKeHoachYCBS");

		_fetchByF_B_N_Y_TYPEMethodKey54 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchByF_B_N_Y_TYPE", long.class, int.class,
				java.lang.String.class);

		_findByTempDocumentByShipNameSMSAndDocumentTypeCodeMethodKey55 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByTempDocumentByShipNameSMSAndDocumentTypeCode",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, java.lang.String.class);

		_findDanhSachHoSoVanThuChoDongDauMethodKey56 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachHoSoVanThuChoDongDau", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countDanhSachHoSoVanThuChoDongDauMethodKey57 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachHoSoVanThuChoDongDau", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findDanhSachHoSoVanThuChoDongDauMethodKey58 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachHoSoVanThuChoDongDau", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countDanhSachHoSoVanThuChoDongDauMethodKey59 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachHoSoVanThuChoDongDau", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findDanhSachHoSoLanhDaoChoKySoMethodKey60 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachHoSoLanhDaoChoKySo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);

		_countDanhSachHoSoLanhDaoChoKySoMethodKey61 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachHoSoLanhDaoChoKySo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_findDanhSachHoSoLanhDaoChoKySoMethodKey62 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachHoSoLanhDaoChoKySo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);

		_countDanhSachHoSoLanhDaoChoKySoMethodKey63 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachHoSoLanhDaoChoKySo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_countByF_documentTypeCode_maritimeCodeMethodKey64 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByF_documentTypeCode_maritimeCode",
				java.lang.String.class, java.lang.String.class);

		_countByF_documentTypeCode_maritimeCodeFinderMethodKey65 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByF_documentTypeCode_maritimeCodeFinder",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findTempDebitNoteMethodKey66 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempDebitNote", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class,
				java.lang.String.class, java.lang.String.class);

		_countTempDebitNoteMethodKey67 = new MethodKey(_classLoaderProxy.getClassName(),
				"countTempDebitNote", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class,
				java.lang.String.class, java.lang.String.class);

		_isValid_ShipAgencyCode_IMO_MaritimeCodeMethodKey68 = new MethodKey(_classLoaderProxy.getClassName(),
				"isValid_ShipAgencyCode_IMO_MaritimeCode", long.class,
				int.class, java.lang.String.class, java.lang.String.class,
				java.lang.String.class);
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument addTempDocument(
		vn.gt.dao.noticeandmessage.model.TempDocument tempDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addTempDocumentMethodKey0,
				ClpSerializer.translateInput(tempDocument));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument createTempDocument(
		long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createTempDocumentMethodKey1,
				id);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteTempDocument(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTempDocumentMethodKey2,
				id);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deleteTempDocument(
		vn.gt.dao.noticeandmessage.model.TempDocument tempDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTempDocumentMethodKey3,
				ClpSerializer.translateInput(tempDocument));

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey4,
				ClpSerializer.translateInput(dynamicQuery));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey5,
				ClpSerializer.translateInput(dynamicQuery), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey6,
				ClpSerializer.translateInput(dynamicQuery), start, end,
				ClpSerializer.translateInput(orderByComparator));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryCountMethodKey7,
				ClpSerializer.translateInput(dynamicQuery));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument fetchTempDocument(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchTempDocumentMethodKey8,
				id);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument getTempDocument(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempDocumentMethodKey9,
				id);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPersistedModelMethodKey10,
				ClpSerializer.translateInput(primaryKeyObj));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> getTempDocuments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempDocumentsMethodKey11,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int getTempDocumentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempDocumentsCountMethodKey12);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument updateTempDocument(
		vn.gt.dao.noticeandmessage.model.TempDocument tempDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTempDocumentMethodKey13,
				ClpSerializer.translateInput(tempDocument));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument updateTempDocument(
		vn.gt.dao.noticeandmessage.model.TempDocument tempDocument,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTempDocumentMethodKey14,
				ClpSerializer.translateInput(tempDocument), merge);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getBeanIdentifierMethodKey15);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		MethodHandler methodHandler = new MethodHandler(_setBeanIdentifierMethodKey16,
				ClpSerializer.translateInput(beanIdentifier));

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument getTemDocumentByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTemDocumentByRequestCodeMethodKey17,
				ClpSerializer.translateInput(requestCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument getByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws java.lang.Exception {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByDocumentNameAndDocumentYearMethodKey18,
				documentName, documentYear);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public java.lang.String getCallSignByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getCallSignByDocumentNameAndDocumentYearMethodKey19,
				documentName, documentYear);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTemDocumentByDocumentNameAndDocumentYearMethodKey20,
				documentName, documentYear);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTempDocumentArivalByMaritimeCodeAndDateFromAndDateTo(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDocumentArivalByMaritimeCodeAndDateFromAndDateToMethodKey21,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTempDocumentLeaveByMaritimeCodeAndDateFromAndDateTo(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDocumentLeaveByMaritimeCodeAndDateFromAndDateToMethodKey22,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public long countTempDocumentForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentForStatisticsReportMethodKey23,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countTempDocumentCompletionForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentCompletionForStatisticsReportMethodKey24,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public java.util.List<vn.gt.portlet.baocaotichhop.thongke.dvcong.FlowChartDataByDate> countTempDocumentForStatisticsByDate(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentForStatisticsByDateMethodKey25,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.portlet.baocaotichhop.thongke.dvcong.FlowChartDataByDate>)ClpSerializer.translateOutput(returnObj);
	}

	public long countTempDocumentJoinIssueShiftingOrderForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String issRequestState,
		java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentJoinIssueShiftingOrderForStatisticsReportMethodKey26,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(issRequestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countTempDocumentJoinIssuePermissionTransitForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String issRequestState,
		java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentJoinIssuePermissionTransitForStatisticsReportMethodKey27,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(issRequestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countTempDocumentJoinIssuePortClearanceForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String issRequestState,
		java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentJoinIssuePortClearanceForStatisticsReportMethodKey28,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(issRequestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countTempDocumentJoinIssueAcceptanceForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String issRequestState,
		java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentJoinIssueAcceptanceForStatisticsReportMethodKey29,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(issRequestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countTempDocumentSignedIssueShiftingOrderForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String issRequestState,
		java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentSignedIssueShiftingOrderForStatisticsReportMethodKey30,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(issRequestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countTempDocumentSignedIssuePermissionTransitForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String issRequestState,
		java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentSignedIssuePermissionTransitForStatisticsReportMethodKey31,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(issRequestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countTempDocumentSignedIssuePortClearanceForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String issRequestState,
		java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentSignedIssuePortClearanceForStatisticsReportMethodKey32,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(issRequestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countTempDocumentSignedIssueAcceptanceForStatisticsReport(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo, java.lang.String documentTypeCode,
		java.lang.String requestState, java.lang.String issRequestState,
		java.lang.String documentStatusCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentSignedIssueAcceptanceForStatisticsReportMethodKey33,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(dateFrom),
				ClpSerializer.translateInput(dateTo),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(issRequestState),
				ClpSerializer.translateInput(documentStatusCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument findTemDocumentByDocumentNameDocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTemDocumentByDocumentNameDocumentYearMethodKey34,
				documentName, documentYear);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTempDocumentByRequestState(
		java.lang.String requestState, java.lang.String documentTypeCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDocumentByRequestStateMethodKey35,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentTypeCode), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countTempDocumentByRequestState(java.lang.String requestState,
		java.lang.String documentTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentByRequestStateMethodKey36,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentTypeCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTempDocumentByDocumentStatusCode(
		java.lang.String documentStatusCode, java.lang.String documentTypeCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDocumentByDocumentStatusCodeMethodKey37,
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(documentTypeCode), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countTempDocumentByDocumentStatusCode(
		java.lang.String documentStatusCode, java.lang.String documentTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentByDocumentStatusCodeMethodKey38,
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(documentTypeCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTempDocumentByKeHoach(
		java.lang.String requestState, java.lang.String documentTypeCode,
		java.lang.String maritimeCode, java.lang.String shipName,
		java.lang.String positionCode, java.lang.String portRegionCode,
		java.lang.String mabankhai, java.lang.String stateCode,
		java.lang.String shipDateFromStart, java.lang.String shipDateFromEnd,
		java.lang.String shipDateToStart, java.lang.String shipDateToEnd,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String ngayLamThuTucFrom, java.lang.String ngayLamThuTucTo,
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDocumentByKeHoachMethodKey39,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(positionCode),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(mabankhai),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countTempDocumentByKeHoach(java.lang.String requestState,
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String shipName, java.lang.String positionCode,
		java.lang.String portRegionCode, java.lang.String mabankhai,
		java.lang.String stateCode, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String callSign,
		java.lang.String imo, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentByKeHoachMethodKey40,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(positionCode),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(mabankhai),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTempDocumentByKeHoach(
		java.lang.String requestState, java.lang.String documentTypeCode,
		java.lang.String maritimeCode, java.lang.String shipName,
		java.lang.String positionCode, java.lang.String portRegionCode,
		java.lang.String mabankhai, java.lang.String stateCode,
		java.lang.String shipDateFromStart, java.lang.String shipDateFromEnd,
		java.lang.String shipDateToStart, java.lang.String shipDateToEnd,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String ngayLamThuTucFrom, java.lang.String ngayLamThuTucTo,
		java.lang.String nameOfShipownersAgents,
		java.lang.String portRegionCodeNext, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDocumentByKeHoachMethodKey41,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(positionCode),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(mabankhai),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(nameOfShipownersAgents),
				ClpSerializer.translateInput(portRegionCodeNext), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countTempDocumentByKeHoach(java.lang.String requestState,
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String shipName, java.lang.String positionCode,
		java.lang.String portRegionCode, java.lang.String mabankhai,
		java.lang.String stateCode, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String callSign,
		java.lang.String imo, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo,
		java.lang.String nameOfShipownersAgents,
		java.lang.String portRegionCodeNext) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentByKeHoachMethodKey42,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(positionCode),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(mabankhai),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(nameOfShipownersAgents),
				ClpSerializer.translateInput(portRegionCodeNext));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findAll(
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findAllMethodKey43,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countAll() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countAllMethodKey44);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTempDocumentByThuTuc(
		java.lang.String documentTypeCode, java.lang.String documentName,
		java.lang.String documentYear, java.lang.String maLoaiHoSo,
		java.lang.String shipName, java.lang.String shipTypeCode,
		java.lang.String stateCode, java.lang.String shipCaptain,
		java.lang.String callSign, java.lang.String userCreated, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDocumentByThuTucMethodKey45,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(documentName),
				ClpSerializer.translateInput(documentYear),
				ClpSerializer.translateInput(maLoaiHoSo),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(shipTypeCode),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(shipCaptain),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(userCreated), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countTempDocumentByThuTuc(java.lang.String documentTypeCode,
		java.lang.String documentName, java.lang.String documentYear,
		java.lang.String maLoaiHoSo, java.lang.String shipName,
		java.lang.String shipTypeCode, java.lang.String stateCode,
		java.lang.String shipCaptain, java.lang.String callSign,
		java.lang.String userCreated)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentByThuTucMethodKey46,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(documentName),
				ClpSerializer.translateInput(documentYear),
				ClpSerializer.translateInput(maLoaiHoSo),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(shipTypeCode),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(shipCaptain),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(userCreated));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findDanhSachHoSoRoleThuTuc(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		int start, int end, boolean isDTND, boolean isDTNDCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachHoSoRoleThuTucMethodKey47,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai), start, end, isDTND,
				isDTNDCam);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachHoSoRoleThuTuc(java.lang.String documentTypeCode,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String lastPortCode, java.lang.String shipName,
		java.lang.String stateCode, java.lang.String callSign,
		java.lang.String imo, java.lang.String shipPosition,
		java.lang.String shipDateFromStart, java.lang.String shipDateFromEnd,
		java.lang.String shipDateToStart, java.lang.String shipDateToEnd,
		java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		boolean isDTND, boolean isDTNDCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachHoSoRoleThuTucMethodKey48,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai), isDTND, isDTNDCam);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findDanhSachHoSoRoleThuTuc(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		java.lang.String nameOfShipownersAgents,
		java.lang.String maritimeCodeNext, int start, int end, boolean isDTND,
		boolean isDTNDCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachHoSoRoleThuTucMethodKey49,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai),
				ClpSerializer.translateInput(nameOfShipownersAgents),
				ClpSerializer.translateInput(maritimeCodeNext), start, end,
				isDTND, isDTNDCam);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachHoSoRoleThuTuc(java.lang.String documentTypeCode,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String lastPortCode, java.lang.String shipName,
		java.lang.String stateCode, java.lang.String callSign,
		java.lang.String imo, java.lang.String shipPosition,
		java.lang.String shipDateFromStart, java.lang.String shipDateFromEnd,
		java.lang.String shipDateToStart, java.lang.String shipDateToEnd,
		java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		java.lang.String nameOfShipownersAgents,
		java.lang.String maritimeCodeNext, boolean isDTND, boolean isDTNDCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachHoSoRoleThuTucMethodKey50,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai),
				ClpSerializer.translateInput(nameOfShipownersAgents),
				ClpSerializer.translateInput(maritimeCodeNext), isDTND,
				isDTNDCam);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findTempDocumentInfo(
		java.lang.String documentStatusCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDocumentInfoMethodKey51,
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipDateFrom),
				ClpSerializer.translateInput(shipDateTo), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countTempDocumentInfo(java.lang.String documentStatusCode,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipDateFrom, java.lang.String shipDateTo)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDocumentInfoMethodKey52,
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipDateFrom),
				ClpSerializer.translateInput(shipDateTo));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findKeHoachYCBS()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findKeHoachYCBSMethodKey53);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempDocument fetchByF_B_N_Y_TYPE(
		long documentName, int documentYear, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchByF_B_N_Y_TYPEMethodKey54,
				documentName, documentYear,
				ClpSerializer.translateInput(documentTypeCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.noticeandmessage.model.TempDocument)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTempDocumentByShipNameSMSAndDocumentTypeCode(
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByTempDocumentByShipNameSMSAndDocumentTypeCodeMethodKey55,
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipTypeCode), documentYear,
				ClpSerializer.translateInput(documentTypeCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findDanhSachHoSoVanThuChoDongDau(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachHoSoVanThuChoDongDauMethodKey56,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachHoSoVanThuChoDongDau(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachHoSoVanThuChoDongDauMethodKey57,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findDanhSachHoSoVanThuChoDongDau(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		java.lang.String nameOfShipownersAgents,
		java.lang.String maritimeCodeNext, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachHoSoVanThuChoDongDauMethodKey58,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai),
				ClpSerializer.translateInput(nameOfShipownersAgents),
				ClpSerializer.translateInput(maritimeCodeNext), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachHoSoVanThuChoDongDau(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		java.lang.String nameOfShipownersAgents,
		java.lang.String maritimeCodeNext)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachHoSoVanThuChoDongDauMethodKey59,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai),
				ClpSerializer.translateInput(nameOfShipownersAgents),
				ClpSerializer.translateInput(maritimeCodeNext));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findDanhSachHoSoLanhDaoChoKySo(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		java.lang.String representative, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachHoSoLanhDaoChoKySoMethodKey60,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai),
				ClpSerializer.translateInput(representative), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachHoSoLanhDaoChoKySo(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		java.lang.String representative)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachHoSoLanhDaoChoKySoMethodKey61,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai),
				ClpSerializer.translateInput(representative));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findDanhSachHoSoLanhDaoChoKySo(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		java.lang.String representative,
		java.lang.String nameOfShipownersAgents,
		java.lang.String maritimeCodeNext, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachHoSoLanhDaoChoKySoMethodKey62,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai),
				ClpSerializer.translateInput(representative),
				ClpSerializer.translateInput(nameOfShipownersAgents),
				ClpSerializer.translateInput(maritimeCodeNext), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachHoSoLanhDaoChoKySo(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String lastPortCode,
		java.lang.String shipName, java.lang.String stateCode,
		java.lang.String callSign, java.lang.String imo,
		java.lang.String shipPosition, java.lang.String shipDateFromStart,
		java.lang.String shipDateFromEnd, java.lang.String shipDateToStart,
		java.lang.String shipDateToEnd, java.lang.String documentStatusCode,
		java.lang.String arrivalShipAgency,
		java.lang.String nameArrivalShipAgency,
		java.lang.String departureShipAgency,
		java.lang.String nameDepartureShipAgency,
		java.lang.String portRegionCode, java.lang.String ngayLamThuTucFrom,
		java.lang.String ngayLamThuTucTo, java.lang.String maBanKhai,
		java.lang.String representative,
		java.lang.String nameOfShipownersAgents,
		java.lang.String maritimeCodeNext)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachHoSoLanhDaoChoKySoMethodKey63,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(lastPortCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(shipPosition),
				ClpSerializer.translateInput(shipDateFromStart),
				ClpSerializer.translateInput(shipDateFromEnd),
				ClpSerializer.translateInput(shipDateToStart),
				ClpSerializer.translateInput(shipDateToEnd),
				ClpSerializer.translateInput(documentStatusCode),
				ClpSerializer.translateInput(arrivalShipAgency),
				ClpSerializer.translateInput(nameArrivalShipAgency),
				ClpSerializer.translateInput(departureShipAgency),
				ClpSerializer.translateInput(nameDepartureShipAgency),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(ngayLamThuTucFrom),
				ClpSerializer.translateInput(ngayLamThuTucTo),
				ClpSerializer.translateInput(maBanKhai),
				ClpSerializer.translateInput(representative),
				ClpSerializer.translateInput(nameOfShipownersAgents),
				ClpSerializer.translateInput(maritimeCodeNext));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public long countByF_documentTypeCode_maritimeCode(
		java.lang.String documentTypeCode, java.lang.String maritimeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByF_documentTypeCode_maritimeCodeMethodKey64,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public long countByF_documentTypeCode_maritimeCodeFinder(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		java.lang.String shipName, java.lang.String documentName,
		java.lang.String callSign) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByF_documentTypeCode_maritimeCodeFinderMethodKey65,
				ClpSerializer.translateInput(documentTypeCode),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(documentName),
				ClpSerializer.translateInput(callSign));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findTempDebitNote(
		java.lang.String maritimeCode, java.lang.String positionCode,
		java.lang.String portRegionCode, java.lang.String mabankhai,
		java.lang.String stateCode, java.lang.String imo,
		java.lang.String markasdelted, java.lang.String lastPortCode,
		int start, int end, java.lang.String shipName, java.lang.String callSign)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempDebitNoteMethodKey66,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(positionCode),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(mabankhai),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(markasdelted),
				ClpSerializer.translateInput(lastPortCode), start, end,
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.result.model.TempDebitNote>)ClpSerializer.translateOutput(returnObj);
	}

	public long countTempDebitNote(java.lang.String maritimeCode,
		java.lang.String positionCode, java.lang.String portRegionCode,
		java.lang.String mabankhai, java.lang.String stateCode,
		java.lang.String imo, java.lang.String markasdelted,
		java.lang.String lastPortCode, int start, int end,
		java.lang.String shipName, java.lang.String callSign)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countTempDebitNoteMethodKey67,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(positionCode),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(mabankhai),
				ClpSerializer.translateInput(stateCode),
				ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(markasdelted),
				ClpSerializer.translateInput(lastPortCode), start, end,
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public boolean isValid_ShipAgencyCode_IMO_MaritimeCode(long documentName,
		int documentYear, java.lang.String imo, java.lang.String maritimeCode,
		java.lang.String ShipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_isValid_ShipAgencyCode_IMO_MaritimeCodeMethodKey68,
				documentName, documentYear, ClpSerializer.translateInput(imo),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(ShipAgencyCode));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Boolean)returnObj).booleanValue();
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addTempDocumentMethodKey0;
	private MethodKey _createTempDocumentMethodKey1;
	private MethodKey _deleteTempDocumentMethodKey2;
	private MethodKey _deleteTempDocumentMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchTempDocumentMethodKey8;
	private MethodKey _getTempDocumentMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getTempDocumentsMethodKey11;
	private MethodKey _getTempDocumentsCountMethodKey12;
	private MethodKey _updateTempDocumentMethodKey13;
	private MethodKey _updateTempDocumentMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _getTemDocumentByRequestCodeMethodKey17;
	private MethodKey _getByDocumentNameAndDocumentYearMethodKey18;
	private MethodKey _getCallSignByDocumentNameAndDocumentYearMethodKey19;
	private MethodKey _findTemDocumentByDocumentNameAndDocumentYearMethodKey20;
	private MethodKey _findTempDocumentArivalByMaritimeCodeAndDateFromAndDateToMethodKey21;
	private MethodKey _findTempDocumentLeaveByMaritimeCodeAndDateFromAndDateToMethodKey22;
	private MethodKey _countTempDocumentForStatisticsReportMethodKey23;
	private MethodKey _countTempDocumentCompletionForStatisticsReportMethodKey24;
	private MethodKey _countTempDocumentForStatisticsByDateMethodKey25;
	private MethodKey _countTempDocumentJoinIssueShiftingOrderForStatisticsReportMethodKey26;
	private MethodKey _countTempDocumentJoinIssuePermissionTransitForStatisticsReportMethodKey27;
	private MethodKey _countTempDocumentJoinIssuePortClearanceForStatisticsReportMethodKey28;
	private MethodKey _countTempDocumentJoinIssueAcceptanceForStatisticsReportMethodKey29;
	private MethodKey _countTempDocumentSignedIssueShiftingOrderForStatisticsReportMethodKey30;
	private MethodKey _countTempDocumentSignedIssuePermissionTransitForStatisticsReportMethodKey31;
	private MethodKey _countTempDocumentSignedIssuePortClearanceForStatisticsReportMethodKey32;
	private MethodKey _countTempDocumentSignedIssueAcceptanceForStatisticsReportMethodKey33;
	private MethodKey _findTemDocumentByDocumentNameDocumentYearMethodKey34;
	private MethodKey _findTempDocumentByRequestStateMethodKey35;
	private MethodKey _countTempDocumentByRequestStateMethodKey36;
	private MethodKey _findTempDocumentByDocumentStatusCodeMethodKey37;
	private MethodKey _countTempDocumentByDocumentStatusCodeMethodKey38;
	private MethodKey _findTempDocumentByKeHoachMethodKey39;
	private MethodKey _countTempDocumentByKeHoachMethodKey40;
	private MethodKey _findTempDocumentByKeHoachMethodKey41;
	private MethodKey _countTempDocumentByKeHoachMethodKey42;
	private MethodKey _findAllMethodKey43;
	private MethodKey _countAllMethodKey44;
	private MethodKey _findTempDocumentByThuTucMethodKey45;
	private MethodKey _countTempDocumentByThuTucMethodKey46;
	private MethodKey _findDanhSachHoSoRoleThuTucMethodKey47;
	private MethodKey _countDanhSachHoSoRoleThuTucMethodKey48;
	private MethodKey _findDanhSachHoSoRoleThuTucMethodKey49;
	private MethodKey _countDanhSachHoSoRoleThuTucMethodKey50;
	private MethodKey _findTempDocumentInfoMethodKey51;
	private MethodKey _countTempDocumentInfoMethodKey52;
	private MethodKey _findKeHoachYCBSMethodKey53;
	private MethodKey _fetchByF_B_N_Y_TYPEMethodKey54;
	private MethodKey _findByTempDocumentByShipNameSMSAndDocumentTypeCodeMethodKey55;
	private MethodKey _findDanhSachHoSoVanThuChoDongDauMethodKey56;
	private MethodKey _countDanhSachHoSoVanThuChoDongDauMethodKey57;
	private MethodKey _findDanhSachHoSoVanThuChoDongDauMethodKey58;
	private MethodKey _countDanhSachHoSoVanThuChoDongDauMethodKey59;
	private MethodKey _findDanhSachHoSoLanhDaoChoKySoMethodKey60;
	private MethodKey _countDanhSachHoSoLanhDaoChoKySoMethodKey61;
	private MethodKey _findDanhSachHoSoLanhDaoChoKySoMethodKey62;
	private MethodKey _countDanhSachHoSoLanhDaoChoKySoMethodKey63;
	private MethodKey _countByF_documentTypeCode_maritimeCodeMethodKey64;
	private MethodKey _countByF_documentTypeCode_maritimeCodeFinderMethodKey65;
	private MethodKey _findTempDebitNoteMethodKey66;
	private MethodKey _countTempDebitNoteMethodKey67;
	private MethodKey _isValid_ShipAgencyCode_IMO_MaritimeCodeMethodKey68;
}