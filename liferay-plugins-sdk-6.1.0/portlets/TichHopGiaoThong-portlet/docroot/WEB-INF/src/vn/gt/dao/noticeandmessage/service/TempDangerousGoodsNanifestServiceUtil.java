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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the temp dangerous goods nanifest remote service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempDangerousGoodsNanifestServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author win_64
 * @see TempDangerousGoodsNanifestService
 * @see vn.gt.dao.noticeandmessage.service.base.TempDangerousGoodsNanifestServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempDangerousGoodsNanifestServiceImpl
 * @generated
 */
public class TempDangerousGoodsNanifestServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempDangerousGoodsNanifestServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static void clearService() {
		_service = null;
	}

	public static TempDangerousGoodsNanifestService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempDangerousGoodsNanifestService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempDangerousGoodsNanifestService.class.getName(),
					portletClassLoader);

			_service = new TempDangerousGoodsNanifestServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempDangerousGoodsNanifestServiceUtil.class,
				"_service");
			MethodCache.remove(TempDangerousGoodsNanifestService.class);
		}

		return _service;
	}

	public void setService(TempDangerousGoodsNanifestService service) {
		MethodCache.remove(TempDangerousGoodsNanifestService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempDangerousGoodsNanifestServiceUtil.class,
			"_service");
		MethodCache.remove(TempDangerousGoodsNanifestService.class);
	}

	private static TempDangerousGoodsNanifestService _service;
}