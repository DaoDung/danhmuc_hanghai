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

package vn.gt.dao.danhmucgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the dm gt report category remote service. This utility wraps {@link vn.gt.dao.danhmucgt.service.impl.DmGtReportCategoryServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author win_64
 * @see DmGtReportCategoryService
 * @see vn.gt.dao.danhmucgt.service.base.DmGtReportCategoryServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.impl.DmGtReportCategoryServiceImpl
 * @generated
 */
public class DmGtReportCategoryServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmucgt.service.impl.DmGtReportCategoryServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static void clearService() {
		_service = null;
	}

	public static DmGtReportCategoryService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmGtReportCategoryService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmGtReportCategoryService.class.getName(),
					portletClassLoader);

			_service = new DmGtReportCategoryServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmGtReportCategoryServiceUtil.class,
				"_service");
			MethodCache.remove(DmGtReportCategoryService.class);
		}

		return _service;
	}

	public void setService(DmGtReportCategoryService service) {
		MethodCache.remove(DmGtReportCategoryService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmGtReportCategoryServiceUtil.class,
			"_service");
		MethodCache.remove(DmGtReportCategoryService.class);
	}

	private static DmGtReportCategoryService _service;
}