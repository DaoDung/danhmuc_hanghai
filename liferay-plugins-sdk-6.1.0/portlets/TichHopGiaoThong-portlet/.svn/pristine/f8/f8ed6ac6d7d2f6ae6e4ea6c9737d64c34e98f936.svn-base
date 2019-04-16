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

package vn.gt.dao.result.service.persistence;

import java.util.List;

import vn.gt.dao.result.model.ResultHistoryMinistry;
import vn.gt.dao.result.model.impl.ResultHistoryMinistryImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * The persistence utility for the history interface request service. This
 * utility wraps {@link HistoryInterfaceRequestPersistenceImpl} and provides
 * direct access to the database for CRUD operations. This utility should only
 * be used by the service layer, as it must operate within a transaction. Never
 * access this utility in a JSP, controller, model, or other front-end class.
 * 
 * <p>
 * Caching information and settings can be found in
 * <code>portal.properties</code>
 * </p>
 * 
 * @author win_64
 * @see HistoryInterfaceRequestPersistence
 * @see HistoryInterfaceRequestPersistenceImpl
 * @generated
 */
public class ResultHistoryMinistryFinderImpl extends BasePersistenceImpl<ResultHistoryMinistry> implements ResultHistoryMinistryFinder {
	
	private Log log = LogFactoryUtil.getLog(ResultDeclarationFinderImpl.class);

	public ResultHistoryMinistry findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(long documentName, int documentYear,
			String ministryCode, String businessTypeCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM result_history_ministry ");
			query.append(" WHERE DocumentName = ? ");
			query.append(" and DocumentYear = ? ");
			query.append(" and ministryCode = '" + ministryCode + "'");
			query.append(" and businessTypeCode in (" + businessTypeCode + ")");

			String sql = query.toString();
			log.debug("=========findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("ResultHistoryMinistry", ResultHistoryMinistryImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			return (ResultHistoryMinistry) q.uniqueResult();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<ResultHistoryMinistry> findDistinctMinistryCode(long documentName, int documentYear) throws SystemException {
		Session session = null;

		List<ResultHistoryMinistry> allResultHistoryMinistry = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			if (documentName > 0 && documentYear > 0) {
				query.append("SELECT DISTINCT MinistryCode FROM result_history_ministry");
				query.append(" WHERE DocumentName = ? ");
				query.append(" and DocumentYear = ? ");
				query.append(" order by id asc");
			}
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db

			allResultHistoryMinistry = (List<ResultHistoryMinistry>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allResultHistoryMinistry;
	}

	// public List<ResultHistoryMinistry> findLeftJoinMinistryCode(long
	// documentName, int documentYear) throws SystemException {
	// Session session = null;
	//
	// List<ResultHistoryMinistry> allResultHistoryMinistry = null;
	// try {
	// session = openSession();
	// StringBuilder query = new StringBuilder();
	// if(documentName >0 && documentYear >0){
	// query.append(" SELECT DISTINCT rMy.MinistryCode, rMy.DocumentName, rMy.DocumentYear,Thongbao.BusinessTypeCode, Thongbao.Thongbao_Response ,Xacbao.BusinessTypeCode, Xacbao.Xacbao_Response,Hoso.BusinessTypeCode, Hoso.Hoso_Response ");
	// query.append(" FROM result_history_ministry as rMy LEFT JOIN (SELECT DISTINCT MinistryCode, DocumentName, DocumentYear FROM result_history_ministry ) as res ON res.DocumentName = rMy.DocumentName AND res.DocumentYear = rMy.DocumentYear ");
	// query.append(" LEFT JOIN (SELECT DISTINCT MinistryCode, DocumentName, DocumentYear, Response as Thongbao_Response, BusinessTypeCode FROM result_history_ministry ) as Thongbao ON Thongbao.DocumentName = rMy.DocumentName AND Thongbao.DocumentYear = rMy.DocumentYear AND Thongbao.MinistryCode = rMy.MinistryCode and Thongbao.BusinessTypeCode IN ('30', '31', '32') ");
	// query.append(" LEFT JOIN (SELECT DISTINCT MinistryCode, DocumentName, DocumentYear, Response as Xacbao_Response, BusinessTypeCode FROM result_history_ministry ) as Xacbao ON Xacbao.DocumentName = rMy.DocumentName AND Xacbao.DocumentYear = rMy.DocumentYear  AND Xacbao.MinistryCode = rMy.MinistryCode AND Xacbao.BusinessTypeCode IN ('40', '42')");
	// query.append(" LEFT JOIN (SELECT DISTINCT MinistryCode, DocumentName, DocumentYear, Response as Hoso_Response, BusinessTypeCode FROM result_history_ministry ) as Hoso ON Hoso.DocumentName = rMy.DocumentName AND Hoso.DocumentYear = rMy.DocumentYear AND Hoso.MinistryCode = rMy.MinistryCode AND Hoso.BusinessTypeCode IN ('99')");
	// query.append(" WHERE rMy.DocumentName = ?");
	// query.append(" and rMy.DocumentYear = ?");
	// query.append(" order by id asc");
	// }
	//
	// // SELECT DISTINCT rMy.MinistryCode, rMy.DocumentName, rMy.DocumentYear,
	// // Thongbao.BusinessTypeCode, Thongbao.Thongbao_Response ,
	// // Xacbao.BusinessTypeCode, Xacbao.Xacbao_Response,
	// // Hoso.BusinessTypeCode, Hoso.Hoso_Response
	// //
	// // FROM result_history_ministry as rMy
	// // LEFT JOIN (SELECT DISTINCT MinistryCode, DocumentName, DocumentYear
	// FROM result_history_ministry ) as res
	// // ON res.DocumentName = rMy.DocumentName AND res.DocumentYear =
	// rMy.DocumentYear
	// //
	// // LEFT JOIN (SELECT DISTINCT MinistryCode, DocumentName, DocumentYear,
	// Response as Thongbao_Response, BusinessTypeCode FROM
	// result_history_ministry ) as Thongbao
	// // ON Thongbao.DocumentName = rMy.DocumentName AND Thongbao.DocumentYear
	// = rMy.DocumentYear
	// // AND Thongbao.MinistryCode = rMy.MinistryCode and
	// Thongbao.BusinessTypeCode IN ('30', '31', '32')
	// //
	// // LEFT JOIN (SELECT DISTINCT MinistryCode, DocumentName, DocumentYear,
	// Response as Xacbao_Response, BusinessTypeCode FROM
	// result_history_ministry ) as Xacbao
	// // ON Xacbao.DocumentName = rMy.DocumentName AND Xacbao.DocumentYear =
	// rMy.DocumentYear
	// // AND Xacbao.MinistryCode = rMy.MinistryCode AND Xacbao.BusinessTypeCode
	// IN ('40', '42')
	// //
	// // LEFT JOIN (SELECT DISTINCT MinistryCode, DocumentName, DocumentYear,
	// Response as Hoso_Response, BusinessTypeCode FROM result_history_ministry
	// ) as Hoso
	// // ON Hoso.DocumentName = rMy.DocumentName AND Hoso.DocumentYear =
	// rMy.DocumentYear
	// // AND Hoso.MinistryCode = rMy.MinistryCode AND Hoso.BusinessTypeCode IN
	// ('99')
	// //
	// // WHERE rMy.DocumentName = '15010' and rMy.DocumentYear = 2014 order by
	// id desc;
	//
	//
	// SQLQuery q = session.createSQLQuery(query.toString());
	//
	// _log.debug("=========findTemDocumentByDocumentNameAndDocumentYear========"
	// + q+query.toString());
	// q.setCacheable(false);
	// QueryPos qPos = QueryPos.getInstance(q);
	// qPos.add(documentName);
	// qPos.add(documentYear);
	//
	// // execute the query and return a list from the db
	//
	// allResultHistoryMinistry = (List<ResultHistoryMinistry>)QueryUtil.list(q,
	// getDialect(),
	// QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	//
	//
	// } catch (Exception e) {
	// throw new SystemException(e);
	// } finally {
	// closeSession(session);
	// }
	// return allResultHistoryMinistry;
	// }

}
