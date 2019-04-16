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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.gt.dao.result.model.ResultDeclaration;
import vn.gt.dao.result.model.impl.ResultDeclarationImpl;

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
public class ResultDeclarationFinderImpl extends
		BasePersistenceImpl<ResultDeclaration> implements
		ResultDeclarationFinder {
	Log _log = LogFactoryUtil.getLog(ResultDeclarationFinderImpl.class);

	public List<ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(int businessTypeCode, long documentName, int documentYear) {
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM result_declaration ");
			query.append(" WHERE DocumentName = ? ");
			query.append(" and DocumentYear = ? ");
			query.append(" and BusinessTypeCode = ? ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultDeclaration", ResultDeclarationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			qPos.add(businessTypeCode);

			// execute the query and return a list from the db
			
			return (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<ResultDeclaration>();
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearOrderByBusiness(
			long documentName, int documentYear) throws SystemException {
		Session session = null;
		
		List<ResultDeclaration> allResultDeclaration = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM result_declaration ");
			query.append(" WHERE DocumentName = ? ");
			query.append(" and DocumentYear = ? ");
			query.append(" order by BusinessOrder asc");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultDeclaration", ResultDeclarationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db
			
			allResultDeclaration = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allResultDeclaration;
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(
			long documentName, int documentYear) throws SystemException {
		Session session = null;
		
		List<ResultDeclaration> allResultDeclaration = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM result_declaration ");
			query.append(" WHERE DocumentName = ? ");
			query.append(" and DocumentYear = ? ");
			query.append(" and businessTypeCode in (40,42) ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultDeclaration", ResultDeclarationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db
			
			allResultDeclaration = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allResultDeclaration;
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearXcReport(
			long documentName, int documentYear) throws SystemException {
		Session session = null;
		
		List<ResultDeclaration> allResultDeclaration = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM result_declaration ");
			query.append(" WHERE DocumentName = ? ");
			query.append(" and DocumentYear = ? ");
			query.append(" and businessTypeCode =31 ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultDeclaration", ResultDeclarationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db
			
			allResultDeclaration = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allResultDeclaration;
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(
			long documentName, int documentYear) throws SystemException {
		Session session = null;
		
		List<ResultDeclaration> allResultDeclaration = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM result_declaration ");
			query.append(" WHERE DocumentName = ? ");
			query.append(" and DocumentYear = ? ");
			query.append(" and businessTypeCode in (10,50,51,53) ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultDeclaration", ResultDeclarationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db
			
			allResultDeclaration = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allResultDeclaration;
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(
			long documentName, int documentYear) throws SystemException {
		Session session = null;
		
		List<ResultDeclaration> allResultDeclaration = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM result_declaration ");
			query.append(" WHERE DocumentName = ? ");
			query.append(" and DocumentYear = ? ");
			query.append(" and businessTypeCode in (10,50,51,52,53) ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultDeclaration", ResultDeclarationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db
			
			allResultDeclaration = (List<ResultDeclaration>)QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allResultDeclaration;
	}
}