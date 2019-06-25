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

package vn.gt.dao.nhapcanh.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.gt.dao.nhapcanh.NoSuchDocumentException;
import vn.gt.dao.nhapcanh.model.Document;
import vn.gt.dao.nhapcanh.model.impl.DocumentImpl;
import vn.gt.dao.nhapcanh.model.impl.DocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DocumentPersistence
 * @see DocumentUtil
 * @generated
 */
public class DocumentPersistenceImpl extends BasePersistenceImpl<Document>
	implements DocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocumentUtil} to access the document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the document in the entity cache if it is enabled.
	 *
	 * @param document the document
	 */
	public void cacheResult(Document document) {
		EntityCacheUtil.putResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentImpl.class, document.getPrimaryKey(), document);

		document.resetOriginalValues();
	}

	/**
	 * Caches the documents in the entity cache if it is enabled.
	 *
	 * @param documents the documents
	 */
	public void cacheResult(List<Document> documents) {
		for (Document document : documents) {
			if (EntityCacheUtil.getResult(
						DocumentModelImpl.ENTITY_CACHE_ENABLED,
						DocumentImpl.class, document.getPrimaryKey()) == null) {
				cacheResult(document);
			}
			else {
				document.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocumentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocumentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Document document) {
		EntityCacheUtil.removeResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentImpl.class, document.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Document> documents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Document document : documents) {
			EntityCacheUtil.removeResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
				DocumentImpl.class, document.getPrimaryKey());
		}
	}

	/**
	 * Creates a new document with the primary key. Does not add the document to the database.
	 *
	 * @param id the primary key for the new document
	 * @return the new document
	 */
	public Document create(long id) {
		Document document = new DocumentImpl();

		document.setNew(true);
		document.setPrimaryKey(id);

		return document;
	}

	/**
	 * Removes the document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the document
	 * @return the document that was removed
	 * @throws vn.gt.dao.nhapcanh.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Document remove(long id)
		throws NoSuchDocumentException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document
	 * @return the document that was removed
	 * @throws vn.gt.dao.nhapcanh.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document remove(Serializable primaryKey)
		throws NoSuchDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Document document = (Document)session.get(DocumentImpl.class,
					primaryKey);

			if (document == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(document);
		}
		catch (NoSuchDocumentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Document removeImpl(Document document) throws SystemException {
		document = toUnwrappedModel(document);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, document);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(document);

		return document;
	}

	@Override
	public Document updateImpl(vn.gt.dao.nhapcanh.model.Document document,
		boolean merge) throws SystemException {
		document = toUnwrappedModel(document);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, document, merge);

			document.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentImpl.class, document.getPrimaryKey(), document);

		return document;
	}

	protected Document toUnwrappedModel(Document document) {
		if (document instanceof DocumentImpl) {
			return document;
		}

		DocumentImpl documentImpl = new DocumentImpl();

		documentImpl.setNew(document.isNew());
		documentImpl.setPrimaryKey(document.getPrimaryKey());

		documentImpl.setId(document.getId());
		documentImpl.setDocumentName(document.getDocumentName());
		documentImpl.setUserCreated(document.getUserCreated());
		documentImpl.setDocumentTypeCode(document.getDocumentTypeCode());
		documentImpl.setCallSign(document.getCallSign());
		documentImpl.setPreDocumentName(document.getPreDocumentName());
		documentImpl.setCreatedDate(document.getCreatedDate());
		documentImpl.setLastModifiedDate(document.getLastModifiedDate());

		return documentImpl;
	}

	/**
	 * Returns the document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the document
	 * @return the document
	 * @throws com.liferay.portal.NoSuchModelException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the document with the primary key or throws a {@link vn.gt.dao.nhapcanh.NoSuchDocumentException} if it could not be found.
	 *
	 * @param id the primary key of the document
	 * @return the document
	 * @throws vn.gt.dao.nhapcanh.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Document findByPrimaryKey(long id)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByPrimaryKey(id);

		if (document == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return document;
	}

	/**
	 * Returns the document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document
	 * @return the document, or <code>null</code> if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the document
	 * @return the document, or <code>null</code> if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Document fetchByPrimaryKey(long id) throws SystemException {
		Document document = (Document)EntityCacheUtil.getResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
				DocumentImpl.class, id);

		if (document == _nullDocument) {
			return null;
		}

		if (document == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				document = (Document)session.get(DocumentImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (document != null) {
					cacheResult(document);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
						DocumentImpl.class, id, _nullDocument);
				}

				closeSession(session);
			}
		}

		return document;
	}

	/**
	 * Returns all the documents.
	 *
	 * @return the documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<Document> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @return the range of documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<Document> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<Document> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Document> list = (List<Document>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Document document : findAll()) {
			remove(document);
		}
	}

	/**
	 * Returns the number of documents.
	 *
	 * @return the number of documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOCUMENT);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.nhapcanh.model.Document")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Document>> listenersList = new ArrayList<ModelListener<Document>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Document>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DocumentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CrewListPersistence.class)
	protected CrewListPersistence crewListPersistence;
	@BeanReference(type = DocumentPersistence.class)
	protected DocumentPersistence documentPersistence;
	@BeanReference(type = DocumentGeneralPersistence.class)
	protected DocumentGeneralPersistence documentGeneralPersistence;
	@BeanReference(type = PassengerListPersistence.class)
	protected PassengerListPersistence passengerListPersistence;
	@BeanReference(type = ResponseBoPersistence.class)
	protected ResponseBoPersistence responseBoPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DOCUMENT = "SELECT document FROM Document document";
	private static final String _SQL_COUNT_DOCUMENT = "SELECT COUNT(document) FROM Document document";
	private static final String _ORDER_BY_ENTITY_ALIAS = "document.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Document exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocumentPersistenceImpl.class);
	private static Document _nullDocument = new DocumentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Document> toCacheModel() {
				return _nullDocumentCacheModel;
			}
		};

	private static CacheModel<Document> _nullDocumentCacheModel = new CacheModel<Document>() {
			public Document toEntityModel() {
				return _nullDocument;
			}
		};
}