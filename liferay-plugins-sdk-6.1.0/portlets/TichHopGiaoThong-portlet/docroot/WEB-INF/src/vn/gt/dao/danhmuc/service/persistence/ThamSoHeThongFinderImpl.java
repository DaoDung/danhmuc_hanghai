package vn.gt.dao.danhmuc.service.persistence;

import java.util.List;
import java.util.Date;
import java.util.Iterator;

import vn.gt.utils.validation.*;
import vn.gt.utils.FormatData;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.dao.orm.Type;

import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl;
import vn.gt.dao.danhmuc.model.ThamSoHeThong;
import vn.gt.dao.danhmuc.model.impl.ThamSoHeThongImpl;
import vn.gt.dao.danhmuc.service.ThamSoHeThongLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ThamSoHeThongFinderImpl extends BasePersistenceImpl<ThamSoHeThong> implements ThamSoHeThongFinder {
	private Log _log = LogFactoryUtil.getLog(ThamSoHeThongFinderImpl.class);

	
	
}
