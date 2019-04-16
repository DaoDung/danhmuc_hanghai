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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.gt.dao.noticeandmessage.NoSuchTempDocumentException;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempDocumentPersistence
 * @see TempDocumentUtil
 * @generated
 */
public class TempDocumentPersistenceImpl extends BasePersistenceImpl<TempDocument>
	implements TempDocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempDocumentUtil} to access the temp document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTemDocumentByDocumentNameAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTemDocumentByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempDocumentModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDocumentModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTemDocumentByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTemDocumentByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTemDocumentByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempDocumentModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDocumentModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDocumentModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTemDocumentByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByF_B_N_Y_TYPE",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			TempDocumentModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDocumentModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDocumentModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_B_N_Y_TYPE = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_B_N_Y_TYPE",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempDocumentModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTempDocumentByShipNameSMSAndDocumentTypeCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTempDocumentByShipNameSMSAndDocumentTypeCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			TempDocumentModelImpl.SHIPNAME_COLUMN_BITMASK |
			TempDocumentModelImpl.CALLSIGN_COLUMN_BITMASK |
			TempDocumentModelImpl.SHIPTYPECODE_COLUMN_BITMASK |
			TempDocumentModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDocumentModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTempDocumentByShipNameSMSAndDocumentTypeCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOCUMENTTYPECODE_MARITIMECODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_documentTypeCode_maritimeCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOCUMENTTYPECODE_MARITIMECODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_documentTypeCode_maritimeCode",
			new String[] { String.class.getName(), String.class.getName() },
			TempDocumentModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK |
			TempDocumentModelImpl.MARITIMECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DOCUMENTTYPECODE_MARITIMECODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_documentTypeCode_maritimeCode",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp document in the entity cache if it is enabled.
	 *
	 * @param tempDocument the temp document
	 */
	public void cacheResult(TempDocument tempDocument) {
		EntityCacheUtil.putResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentImpl.class, tempDocument.getPrimaryKey(), tempDocument);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
			new Object[] {
				Long.valueOf(tempDocument.getDocumentName()),
				Integer.valueOf(tempDocument.getDocumentYear()),
				
			tempDocument.getDocumentTypeCode()
			}, tempDocument);

		tempDocument.resetOriginalValues();
	}

	/**
	 * Caches the temp documents in the entity cache if it is enabled.
	 *
	 * @param tempDocuments the temp documents
	 */
	public void cacheResult(List<TempDocument> tempDocuments) {
		for (TempDocument tempDocument : tempDocuments) {
			if (EntityCacheUtil.getResult(
						TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
						TempDocumentImpl.class, tempDocument.getPrimaryKey()) == null) {
				cacheResult(tempDocument);
			}
			else {
				tempDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempDocumentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempDocumentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempDocument tempDocument) {
		EntityCacheUtil.removeResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentImpl.class, tempDocument.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tempDocument);
	}

	@Override
	public void clearCache(List<TempDocument> tempDocuments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempDocument tempDocument : tempDocuments) {
			EntityCacheUtil.removeResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
				TempDocumentImpl.class, tempDocument.getPrimaryKey());

			clearUniqueFindersCache(tempDocument);
		}
	}

	protected void clearUniqueFindersCache(TempDocument tempDocument) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
			new Object[] {
				Long.valueOf(tempDocument.getDocumentName()),
				Integer.valueOf(tempDocument.getDocumentYear()),
				
			tempDocument.getDocumentTypeCode()
			});
	}

	/**
	 * Creates a new temp document with the primary key. Does not add the temp document to the database.
	 *
	 * @param id the primary key for the new temp document
	 * @return the new temp document
	 */
	public TempDocument create(long id) {
		TempDocument tempDocument = new TempDocumentImpl();

		tempDocument.setNew(true);
		tempDocument.setPrimaryKey(id);

		return tempDocument;
	}

	/**
	 * Removes the temp document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp document
	 * @return the temp document that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument remove(long id)
		throws NoSuchTempDocumentException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp document
	 * @return the temp document that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument remove(Serializable primaryKey)
		throws NoSuchTempDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempDocument tempDocument = (TempDocument)session.get(TempDocumentImpl.class,
					primaryKey);

			if (tempDocument == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempDocument);
		}
		catch (NoSuchTempDocumentException nsee) {
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
	protected TempDocument removeImpl(TempDocument tempDocument)
		throws SystemException {
		tempDocument = toUnwrappedModel(tempDocument);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempDocument);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempDocument);

		return tempDocument;
	}

	@Override
	public TempDocument updateImpl(
		vn.gt.dao.noticeandmessage.model.TempDocument tempDocument,
		boolean merge) throws SystemException {
		tempDocument = toUnwrappedModel(tempDocument);

		boolean isNew = tempDocument.isNew();

		TempDocumentModelImpl tempDocumentModelImpl = (TempDocumentModelImpl)tempDocument;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempDocument, merge);

			tempDocument.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempDocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempDocumentModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempDocumentModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(tempDocumentModelImpl.getDocumentName()),
						Integer.valueOf(tempDocumentModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempDocumentModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempDocumentModelImpl.getOriginalDocumentYear()),
						Integer.valueOf(tempDocumentModelImpl.getOriginalRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						Long.valueOf(tempDocumentModelImpl.getDocumentName()),
						Integer.valueOf(tempDocumentModelImpl.getDocumentYear()),
						Integer.valueOf(tempDocumentModelImpl.getRequestState())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDocumentModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempDocumentModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}

			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDocumentModelImpl.getOriginalShipName(),
						
						tempDocumentModelImpl.getOriginalCallSign(),
						
						tempDocumentModelImpl.getOriginalShipTypeCode(),
						Integer.valueOf(tempDocumentModelImpl.getOriginalDocumentYear()),
						
						tempDocumentModelImpl.getOriginalDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE,
					args);

				args = new Object[] {
						tempDocumentModelImpl.getShipName(),
						
						tempDocumentModelImpl.getCallSign(),
						
						tempDocumentModelImpl.getShipTypeCode(),
						Integer.valueOf(tempDocumentModelImpl.getDocumentYear()),
						
						tempDocumentModelImpl.getDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE,
					args);
			}

			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOCUMENTTYPECODE_MARITIMECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDocumentModelImpl.getOriginalDocumentTypeCode(),
						
						tempDocumentModelImpl.getOriginalMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_DOCUMENTTYPECODE_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOCUMENTTYPECODE_MARITIMECODE,
					args);

				args = new Object[] {
						tempDocumentModelImpl.getDocumentTypeCode(),
						
						tempDocumentModelImpl.getMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_DOCUMENTTYPECODE_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOCUMENTTYPECODE_MARITIMECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentImpl.class, tempDocument.getPrimaryKey(), tempDocument);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
				new Object[] {
					Long.valueOf(tempDocument.getDocumentName()),
					Integer.valueOf(tempDocument.getDocumentYear()),
					
				tempDocument.getDocumentTypeCode()
				}, tempDocument);
		}
		else {
			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempDocumentModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempDocumentModelImpl.getOriginalDocumentYear()),
						
						tempDocumentModelImpl.getOriginalDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_B_N_Y_TYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
					new Object[] {
						Long.valueOf(tempDocument.getDocumentName()),
						Integer.valueOf(tempDocument.getDocumentYear()),
						
					tempDocument.getDocumentTypeCode()
					}, tempDocument);
			}
		}

		return tempDocument;
	}

	protected TempDocument toUnwrappedModel(TempDocument tempDocument) {
		if (tempDocument instanceof TempDocumentImpl) {
			return tempDocument;
		}

		TempDocumentImpl tempDocumentImpl = new TempDocumentImpl();

		tempDocumentImpl.setNew(tempDocument.isNew());
		tempDocumentImpl.setPrimaryKey(tempDocument.getPrimaryKey());

		tempDocumentImpl.setId(tempDocument.getId());
		tempDocumentImpl.setRequestCode(tempDocument.getRequestCode());
		tempDocumentImpl.setRequestState(tempDocument.getRequestState());
		tempDocumentImpl.setDocumentName(tempDocument.getDocumentName());
		tempDocumentImpl.setDocumentYear(tempDocument.getDocumentYear());
		tempDocumentImpl.setDocumentTypeCode(tempDocument.getDocumentTypeCode());
		tempDocumentImpl.setUserCreated(tempDocument.getUserCreated());
		tempDocumentImpl.setShipAgencyCode(tempDocument.getShipAgencyCode());
		tempDocumentImpl.setShipName(tempDocument.getShipName());
		tempDocumentImpl.setShipTypeCode(tempDocument.getShipTypeCode());
		tempDocumentImpl.setStateCode(tempDocument.getStateCode());
		tempDocumentImpl.setShipCaptain(tempDocument.getShipCaptain());
		tempDocumentImpl.setImo(tempDocument.getImo());
		tempDocumentImpl.setGrt(tempDocument.getGrt());
		tempDocumentImpl.setNt(tempDocument.getNt());
		tempDocumentImpl.setDwt(tempDocument.getDwt());
		tempDocumentImpl.setUnitGRT(tempDocument.getUnitGRT());
		tempDocumentImpl.setUnitNT(tempDocument.getUnitNT());
		tempDocumentImpl.setUnitDWT(tempDocument.getUnitDWT());
		tempDocumentImpl.setCallSign(tempDocument.getCallSign());
		tempDocumentImpl.setPreDocumentName(tempDocument.getPreDocumentName());
		tempDocumentImpl.setCreatedDate(tempDocument.getCreatedDate());
		tempDocumentImpl.setLastModifiedDate(tempDocument.getLastModifiedDate());
		tempDocumentImpl.setFlowFlag(tempDocument.getFlowFlag());
		tempDocumentImpl.setDocumentStatusCode(tempDocument.getDocumentStatusCode());
		tempDocumentImpl.setLocationCode(tempDocument.getLocationCode());
		tempDocumentImpl.setMaritimeCode(tempDocument.getMaritimeCode());
		tempDocumentImpl.setPortRegionCode(tempDocument.getPortRegionCode());
		tempDocumentImpl.setPortCode(tempDocument.getPortCode());
		tempDocumentImpl.setLastPortCode(tempDocument.getLastPortCode());
		tempDocumentImpl.setShipPosition(tempDocument.getShipPosition());
		tempDocumentImpl.setShipOwnerCode(tempDocument.getShipOwnerCode());
		tempDocumentImpl.setArrivalShipAgency(tempDocument.getArrivalShipAgency());
		tempDocumentImpl.setDepartureShipAgency(tempDocument.getDepartureShipAgency());
		tempDocumentImpl.setShipDateFrom(tempDocument.getShipDateFrom());
		tempDocumentImpl.setShipDateTo(tempDocument.getShipDateTo());
		tempDocumentImpl.setUpgradeVersion(tempDocument.getUpgradeVersion());
		tempDocumentImpl.setNameOfShipownersAgents(tempDocument.getNameOfShipownersAgents());

		return tempDocumentImpl;
	}

	/**
	 * Returns the temp document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp document
	 * @return the temp document
	 * @throws com.liferay.portal.NoSuchModelException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp document with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempDocumentException} if it could not be found.
	 *
	 * @param id the primary key of the temp document
	 * @return the temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByPrimaryKey(long id)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByPrimaryKey(id);

		if (tempDocument == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempDocument;
	}

	/**
	 * Returns the temp document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp document
	 * @return the temp document, or <code>null</code> if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp document
	 * @return the temp document, or <code>null</code> if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument fetchByPrimaryKey(long id) throws SystemException {
		TempDocument tempDocument = (TempDocument)EntityCacheUtil.getResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
				TempDocumentImpl.class, id);

		if (tempDocument == _nullTempDocument) {
			return null;
		}

		if (tempDocument == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempDocument = (TempDocument)session.get(TempDocumentImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempDocument != null) {
					cacheResult(tempDocument);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
						TempDocumentImpl.class, id, _nullTempDocument);
				}

				closeSession(session);
			}
		}

		return tempDocument;
	}

	/**
	 * Returns all the temp documents where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp documents where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByTemDocumentByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		List<TempDocument> list = findByTemDocumentByDocumentNameAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByTemDocumentByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		int count = countByTemDocumentByDocumentNameAndDocumentYear(documentName,
				documentYear);

		List<TempDocument> list = findByTemDocumentByDocumentNameAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp documents before and after the current temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp document
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument[] findByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDocument[] array = new TempDocumentImpl[3];

			array[0] = getByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempDocument, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempDocument;

			array[2] = getByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempDocument, documentName, documentYear,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDocument getByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(
		Session session, TempDocument tempDocument, long documentName,
		int documentYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] { documentName, documentYear, requestState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] {
					documentName, documentYear, requestState,
					
					start, end, orderByComparator
				};
		}

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

				list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByTemDocumentByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		List<TempDocument> list = findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestState=");
			msg.append(requestState);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		int count = countByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState);

		List<TempDocument> list = findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", requestState=");
			msg.append(requestState);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp documents before and after the current temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp document
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument[] findByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDocument[] array = new TempDocumentImpl[3];

			array[0] = getByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(session,
					tempDocument, documentName, documentYear, requestState,
					orderByComparator, true);

			array[1] = tempDocument;

			array[2] = getByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(session,
					tempDocument, documentName, documentYear, requestState,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDocument getByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		Session session, TempDocument tempDocument, long documentName,
		int documentYear, int requestState,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		qPos.add(requestState);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the temp document where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempDocumentException} if it could not be found.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @return the matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByF_B_N_Y_TYPE(long documentName, int documentYear,
		String documentTypeCode)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByF_B_N_Y_TYPE(documentName,
				documentYear, documentTypeCode);

		if (tempDocument == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTempDocumentException(msg.toString());
		}

		return tempDocument;
	}

	/**
	 * Returns the temp document where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @return the matching temp document, or <code>null</code> if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument fetchByF_B_N_Y_TYPE(long documentName,
		int documentYear, String documentTypeCode) throws SystemException {
		return fetchByF_B_N_Y_TYPE(documentName, documentYear,
			documentTypeCode, true);
	}

	/**
	 * Returns the temp document where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching temp document, or <code>null</code> if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument fetchByF_B_N_Y_TYPE(long documentName,
		int documentYear, String documentTypeCode, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, documentTypeCode
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTYEAR_2);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_2);
				}
			}

			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				List<TempDocument> list = q.list();

				result = list;

				TempDocument tempDocument = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
						finderArgs, list);
				}
				else {
					tempDocument = list.get(0);

					cacheResult(tempDocument);

					if ((tempDocument.getDocumentName() != documentName) ||
							(tempDocument.getDocumentYear() != documentYear) ||
							(tempDocument.getDocumentTypeCode() == null) ||
							!tempDocument.getDocumentTypeCode()
											 .equals(documentTypeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
							finderArgs, tempDocument);
					}
				}

				return tempDocument;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_B_N_Y_TYPE,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (TempDocument)result;
			}
		}
	}

	/**
	 * Returns all the temp documents where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp documents where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByRequestCode(String requestCode, int start,
		int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByRequestCode(String requestCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode, start, end, orderByComparator };
		}

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first temp document in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		List<TempDocument> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp document in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		int count = countByRequestCode(requestCode);

		List<TempDocument> list = findByRequestCode(requestCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp documents before and after the current temp document in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp document
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDocument[] array = new TempDocumentImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session, tempDocument,
					requestCode, orderByComparator, true);

			array[1] = tempDocument;

			array[2] = getByRequestCode_PrevAndNext(session, tempDocument,
					requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDocument getByRequestCode_PrevAndNext(Session session,
		TempDocument tempDocument, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

		if (requestCode == null) {
			query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
		}
		else {
			if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (requestCode != null) {
			qPos.add(requestCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	 *
	 * @param shipName the ship name
	 * @param callSign the call sign
	 * @param shipTypeCode the ship type code
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @return the matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTempDocumentByShipNameSMSAndDocumentTypeCode(
		String shipName, String callSign, String shipTypeCode,
		int documentYear, String documentTypeCode) throws SystemException {
		return findByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipName the ship name
	 * @param callSign the call sign
	 * @param shipTypeCode the ship type code
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTempDocumentByShipNameSMSAndDocumentTypeCode(
		String shipName, String callSign, String shipTypeCode,
		int documentYear, String documentTypeCode, int start, int end)
		throws SystemException {
		return findByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipName the ship name
	 * @param callSign the call sign
	 * @param shipTypeCode the ship type code
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByTempDocumentByShipNameSMSAndDocumentTypeCode(
		String shipName, String callSign, String shipTypeCode,
		int documentYear, String documentTypeCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE;
			finderArgs = new Object[] {
					shipName, callSign, shipTypeCode, documentYear,
					documentTypeCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE;
			finderArgs = new Object[] {
					shipName, callSign, shipTypeCode, documentYear,
					documentTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

			if (shipName == null) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_1);
			}
			else {
				if (shipName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_2);
				}
			}

			if (callSign == null) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_1);
			}
			else {
				if (callSign.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_3);
				}
				else {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_2);
				}
			}

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_1);
			}
			else {
				if (shipTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_2);
				}
			}

			query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTYEAR_2);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipName != null) {
					qPos.add(shipName);
				}

				if (callSign != null) {
					qPos.add(callSign);
				}

				if (shipTypeCode != null) {
					qPos.add(shipTypeCode);
				}

				qPos.add(documentYear);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first temp document in the ordered set where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipName the ship name
	 * @param callSign the call sign
	 * @param shipTypeCode the ship type code
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByTempDocumentByShipNameSMSAndDocumentTypeCode_First(
		String shipName, String callSign, String shipTypeCode,
		int documentYear, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		List<TempDocument> list = findByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
				callSign, shipTypeCode, documentYear, documentTypeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipName=");
			msg.append(shipName);

			msg.append(", callSign=");
			msg.append(callSign);

			msg.append(", shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp document in the ordered set where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shipName the ship name
	 * @param callSign the call sign
	 * @param shipTypeCode the ship type code
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByTempDocumentByShipNameSMSAndDocumentTypeCode_Last(
		String shipName, String callSign, String shipTypeCode,
		int documentYear, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		int count = countByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
				callSign, shipTypeCode, documentYear, documentTypeCode);

		List<TempDocument> list = findByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
				callSign, shipTypeCode, documentYear, documentTypeCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shipName=");
			msg.append(shipName);

			msg.append(", callSign=");
			msg.append(callSign);

			msg.append(", shipTypeCode=");
			msg.append(shipTypeCode);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp documents before and after the current temp document in the ordered set where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp document
	 * @param shipName the ship name
	 * @param callSign the call sign
	 * @param shipTypeCode the ship type code
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument[] findByTempDocumentByShipNameSMSAndDocumentTypeCode_PrevAndNext(
		long id, String shipName, String callSign, String shipTypeCode,
		int documentYear, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDocument[] array = new TempDocumentImpl[3];

			array[0] = getByTempDocumentByShipNameSMSAndDocumentTypeCode_PrevAndNext(session,
					tempDocument, shipName, callSign, shipTypeCode,
					documentYear, documentTypeCode, orderByComparator, true);

			array[1] = tempDocument;

			array[2] = getByTempDocumentByShipNameSMSAndDocumentTypeCode_PrevAndNext(session,
					tempDocument, shipName, callSign, shipTypeCode,
					documentYear, documentTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDocument getByTempDocumentByShipNameSMSAndDocumentTypeCode_PrevAndNext(
		Session session, TempDocument tempDocument, String shipName,
		String callSign, String shipTypeCode, int documentYear,
		String documentTypeCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

		if (shipName == null) {
			query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_1);
		}
		else {
			if (shipName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_2);
			}
		}

		if (callSign == null) {
			query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_1);
		}
		else {
			if (callSign.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_3);
			}
			else {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_2);
			}
		}

		if (shipTypeCode == null) {
			query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_1);
		}
		else {
			if (shipTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_2);
			}
		}

		query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTYEAR_2);

		if (documentTypeCode == null) {
			query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
		}
		else {
			if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (shipName != null) {
			qPos.add(shipName);
		}

		if (callSign != null) {
			qPos.add(callSign);
		}

		if (shipTypeCode != null) {
			qPos.add(shipTypeCode);
		}

		qPos.add(documentYear);

		if (documentTypeCode != null) {
			qPos.add(documentTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp documents where documentTypeCode = &#63; and maritimeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @param maritimeCode the maritime code
	 * @return the matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByF_documentTypeCode_maritimeCode(
		String documentTypeCode, String maritimeCode) throws SystemException {
		return findByF_documentTypeCode_maritimeCode(documentTypeCode,
			maritimeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp documents where documentTypeCode = &#63; and maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByF_documentTypeCode_maritimeCode(
		String documentTypeCode, String maritimeCode, int start, int end)
		throws SystemException {
		return findByF_documentTypeCode_maritimeCode(documentTypeCode,
			maritimeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents where documentTypeCode = &#63; and maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findByF_documentTypeCode_maritimeCode(
		String documentTypeCode, String maritimeCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOCUMENTTYPECODE_MARITIMECODE;
			finderArgs = new Object[] { documentTypeCode, maritimeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOCUMENTTYPECODE_MARITIMECODE;
			finderArgs = new Object[] {
					documentTypeCode, maritimeCode,
					
					start, end, orderByComparator
				};
		}

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_2);
				}
			}

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_1);
			}
			else {
				if (maritimeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				if (maritimeCode != null) {
					qPos.add(maritimeCode);
				}

				list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first temp document in the ordered set where documentTypeCode = &#63; and maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByF_documentTypeCode_maritimeCode_First(
		String documentTypeCode, String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		List<TempDocument> list = findByF_documentTypeCode_maritimeCode(documentTypeCode,
				maritimeCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(", maritimeCode=");
			msg.append(maritimeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp document in the ordered set where documentTypeCode = &#63; and maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument findByF_documentTypeCode_maritimeCode_Last(
		String documentTypeCode, String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		int count = countByF_documentTypeCode_maritimeCode(documentTypeCode,
				maritimeCode);

		List<TempDocument> list = findByF_documentTypeCode_maritimeCode(documentTypeCode,
				maritimeCode, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(", maritimeCode=");
			msg.append(maritimeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp documents before and after the current temp document in the ordered set where documentTypeCode = &#63; and maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp document
	 * @param documentTypeCode the document type code
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp document
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDocument[] findByF_documentTypeCode_maritimeCode_PrevAndNext(
		long id, String documentTypeCode, String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDocument[] array = new TempDocumentImpl[3];

			array[0] = getByF_documentTypeCode_maritimeCode_PrevAndNext(session,
					tempDocument, documentTypeCode, maritimeCode,
					orderByComparator, true);

			array[1] = tempDocument;

			array[2] = getByF_documentTypeCode_maritimeCode_PrevAndNext(session,
					tempDocument, documentTypeCode, maritimeCode,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDocument getByF_documentTypeCode_maritimeCode_PrevAndNext(
		Session session, TempDocument tempDocument, String documentTypeCode,
		String maritimeCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

		if (documentTypeCode == null) {
			query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_1);
		}
		else {
			if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_2);
			}
		}

		if (maritimeCode == null) {
			query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_1);
		}
		else {
			if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (documentTypeCode != null) {
			qPos.add(documentTypeCode);
		}

		if (maritimeCode != null) {
			qPos.add(maritimeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp documents.
	 *
	 * @return the temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDocument> findAll(int start, int end,
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

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPDOCUMENT.concat(TempDocumentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the temp documents where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		for (TempDocument tempDocument : findByTemDocumentByDocumentNameAndDocumentYear(
				documentName, documentYear)) {
			remove(tempDocument);
		}
	}

	/**
	 * Removes all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (TempDocument tempDocument : findByTemDocumentByDocumentNameAndDocumentYearRequestState(
				documentName, documentYear, requestState)) {
			remove(tempDocument);
		}
	}

	/**
	 * Removes the temp document where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_B_N_Y_TYPE(long documentName, int documentYear,
		String documentTypeCode)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByF_B_N_Y_TYPE(documentName,
				documentYear, documentTypeCode);

		remove(tempDocument);
	}

	/**
	 * Removes all the temp documents where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempDocument tempDocument : findByRequestCode(requestCode)) {
			remove(tempDocument);
		}
	}

	/**
	 * Removes all the temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63; from the database.
	 *
	 * @param shipName the ship name
	 * @param callSign the call sign
	 * @param shipTypeCode the ship type code
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByTempDocumentByShipNameSMSAndDocumentTypeCode(
		String shipName, String callSign, String shipTypeCode,
		int documentYear, String documentTypeCode) throws SystemException {
		for (TempDocument tempDocument : findByTempDocumentByShipNameSMSAndDocumentTypeCode(
				shipName, callSign, shipTypeCode, documentYear, documentTypeCode)) {
			remove(tempDocument);
		}
	}

	/**
	 * Removes all the temp documents where documentTypeCode = &#63; and maritimeCode = &#63; from the database.
	 *
	 * @param documentTypeCode the document type code
	 * @param maritimeCode the maritime code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_documentTypeCode_maritimeCode(
		String documentTypeCode, String maritimeCode) throws SystemException {
		for (TempDocument tempDocument : findByF_documentTypeCode_maritimeCode(
				documentTypeCode, maritimeCode)) {
			remove(tempDocument);
		}
	}

	/**
	 * Removes all the temp documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempDocument tempDocument : findAll()) {
			remove(tempDocument);
		}
	}

	/**
	 * Returns the number of temp documents where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp documents where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @return the number of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_B_N_Y_TYPE(long documentName, int documentYear,
		String documentTypeCode) throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, documentTypeCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_B_N_Y_TYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTYEAR_2);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_B_N_Y_TYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp documents where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else {
				if (requestCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (requestCode != null) {
					qPos.add(requestCode);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	 *
	 * @param shipName the ship name
	 * @param callSign the call sign
	 * @param shipTypeCode the ship type code
	 * @param documentYear the document year
	 * @param documentTypeCode the document type code
	 * @return the number of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByTempDocumentByShipNameSMSAndDocumentTypeCode(
		String shipName, String callSign, String shipTypeCode,
		int documentYear, String documentTypeCode) throws SystemException {
		Object[] finderArgs = new Object[] {
				shipName, callSign, shipTypeCode, documentYear, documentTypeCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

			if (shipName == null) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_1);
			}
			else {
				if (shipName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_2);
				}
			}

			if (callSign == null) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_1);
			}
			else {
				if (callSign.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_3);
				}
				else {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_2);
				}
			}

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_1);
			}
			else {
				if (shipTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_2);
				}
			}

			query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTYEAR_2);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (shipName != null) {
					qPos.add(shipName);
				}

				if (callSign != null) {
					qPos.add(callSign);
				}

				if (shipTypeCode != null) {
					qPos.add(shipTypeCode);
				}

				qPos.add(documentYear);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp documents where documentTypeCode = &#63; and maritimeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @param maritimeCode the maritime code
	 * @return the number of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_documentTypeCode_maritimeCode(String documentTypeCode,
		String maritimeCode) throws SystemException {
		Object[] finderArgs = new Object[] { documentTypeCode, maritimeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_DOCUMENTTYPECODE_MARITIMECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_2);
				}
			}

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_1);
			}
			else {
				if (maritimeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				if (maritimeCode != null) {
					qPos.add(maritimeCode);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_DOCUMENTTYPECODE_MARITIMECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp documents.
	 *
	 * @return the number of temp documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPDOCUMENT);

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
	 * Initializes the temp document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempDocument")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempDocument>> listenersList = new ArrayList<ModelListener<TempDocument>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempDocument>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempDocumentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = HistoryInterfaceRequestPersistence.class)
	protected HistoryInterfaceRequestPersistence historyInterfaceRequestPersistence;
	@BeanReference(type = HistoryInterfaceRequestFieldPersistence.class)
	protected HistoryInterfaceRequestFieldPersistence historyInterfaceRequestFieldPersistence;
	@BeanReference(type = InterfaceRequestPersistence.class)
	protected InterfaceRequestPersistence interfaceRequestPersistence;
	@BeanReference(type = InterfaceRequestFieldPersistence.class)
	protected InterfaceRequestFieldPersistence interfaceRequestFieldPersistence;
	@BeanReference(type = IssueAcceptancePersistence.class)
	protected IssueAcceptancePersistence issueAcceptancePersistence;
	@BeanReference(type = IssueAcceptanceForTransitPersistence.class)
	protected IssueAcceptanceForTransitPersistence issueAcceptanceForTransitPersistence;
	@BeanReference(type = IssuePermissionForTransitPersistence.class)
	protected IssuePermissionForTransitPersistence issuePermissionForTransitPersistence;
	@BeanReference(type = IssuePortClearancePersistence.class)
	protected IssuePortClearancePersistence issuePortClearancePersistence;
	@BeanReference(type = IssueShiftingOrderPersistence.class)
	protected IssueShiftingOrderPersistence issueShiftingOrderPersistence;
	@BeanReference(type = IssueShiftingOrderChanelPersistence.class)
	protected IssueShiftingOrderChanelPersistence issueShiftingOrderChanelPersistence;
	@BeanReference(type = ModifyPersistence.class)
	protected ModifyPersistence modifyPersistence;
	@BeanReference(type = NoticeShipMessagePersistence.class)
	protected NoticeShipMessagePersistence noticeShipMessagePersistence;
	@BeanReference(type = TempAnimalQuarantinePersistence.class)
	protected TempAnimalQuarantinePersistence tempAnimalQuarantinePersistence;
	@BeanReference(type = TempAttachmentDeclarationHealthPersistence.class)
	protected TempAttachmentDeclarationHealthPersistence tempAttachmentDeclarationHealthPersistence;
	@BeanReference(type = TempCargoDeclarationPersistence.class)
	protected TempCargoDeclarationPersistence tempCargoDeclarationPersistence;
	@BeanReference(type = TempCargoItemsPersistence.class)
	protected TempCargoItemsPersistence tempCargoItemsPersistence;
	@BeanReference(type = TempCrewDetailsPersistence.class)
	protected TempCrewDetailsPersistence tempCrewDetailsPersistence;
	@BeanReference(type = TempCrewEffectsDeclarationPersistence.class)
	protected TempCrewEffectsDeclarationPersistence tempCrewEffectsDeclarationPersistence;
	@BeanReference(type = TempCrewEffectsItemsPersistence.class)
	protected TempCrewEffectsItemsPersistence tempCrewEffectsItemsPersistence;
	@BeanReference(type = TempCrewListPersistence.class)
	protected TempCrewListPersistence tempCrewListPersistence;
	@BeanReference(type = TempDangerousGoodsItemsPersistence.class)
	protected TempDangerousGoodsItemsPersistence tempDangerousGoodsItemsPersistence;
	@BeanReference(type = TempDangerousGoodsNanifestPersistence.class)
	protected TempDangerousGoodsNanifestPersistence tempDangerousGoodsNanifestPersistence;
	@BeanReference(type = TempDeclarationForAnimalQuarantinePersistence.class)
	protected TempDeclarationForAnimalQuarantinePersistence tempDeclarationForAnimalQuarantinePersistence;
	@BeanReference(type = TempDeclarationForPlantQuarantinePersistence.class)
	protected TempDeclarationForPlantQuarantinePersistence tempDeclarationForPlantQuarantinePersistence;
	@BeanReference(type = TempDeclarationOfHealthPersistence.class)
	protected TempDeclarationOfHealthPersistence tempDeclarationOfHealthPersistence;
	@BeanReference(type = TempDocumentPersistence.class)
	protected TempDocumentPersistence tempDocumentPersistence;
	@BeanReference(type = TempGeneralDeclarationPersistence.class)
	protected TempGeneralDeclarationPersistence tempGeneralDeclarationPersistence;
	@BeanReference(type = TempGoodsItemsPersistence.class)
	protected TempGoodsItemsPersistence tempGoodsItemsPersistence;
	@BeanReference(type = TempHealthCrewPassengerListPersistence.class)
	protected TempHealthCrewPassengerListPersistence tempHealthCrewPassengerListPersistence;
	@BeanReference(type = TempHealthQuestionPersistence.class)
	protected TempHealthQuestionPersistence tempHealthQuestionPersistence;
	@BeanReference(type = TempMaritimePaymentConfigPersistence.class)
	protected TempMaritimePaymentConfigPersistence tempMaritimePaymentConfigPersistence;
	@BeanReference(type = TempNoTiceShipMessagePersistence.class)
	protected TempNoTiceShipMessagePersistence tempNoTiceShipMessagePersistence;
	@BeanReference(type = TempPassengerDetailsPersistence.class)
	protected TempPassengerDetailsPersistence tempPassengerDetailsPersistence;
	@BeanReference(type = TempPassengerListPersistence.class)
	protected TempPassengerListPersistence tempPassengerListPersistence;
	@BeanReference(type = TempPersonListPersistence.class)
	protected TempPersonListPersistence tempPersonListPersistence;
	@BeanReference(type = TempPlantQuarantinePersistence.class)
	protected TempPlantQuarantinePersistence tempPlantQuarantinePersistence;
	@BeanReference(type = TempShipSecurityMessagePersistence.class)
	protected TempShipSecurityMessagePersistence tempShipSecurityMessagePersistence;
	@BeanReference(type = TempShipSecurityPortItemsPersistence.class)
	protected TempShipSecurityPortItemsPersistence tempShipSecurityPortItemsPersistence;
	@BeanReference(type = TempShipStoresDeclarationPersistence.class)
	protected TempShipStoresDeclarationPersistence tempShipStoresDeclarationPersistence;
	@BeanReference(type = TempShipStoresItemsPersistence.class)
	protected TempShipStoresItemsPersistence tempShipStoresItemsPersistence;
	@BeanReference(type = TempUnitGeneralPersistence.class)
	protected TempUnitGeneralPersistence tempUnitGeneralPersistence;
	@BeanReference(type = TempWasteListPersistence.class)
	protected TempWasteListPersistence tempWasteListPersistence;
	@BeanReference(type = ViewHoanThanhThuTucPersistence.class)
	protected ViewHoanThanhThuTucPersistence viewHoanThanhThuTucPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TEMPDOCUMENT = "SELECT tempDocument FROM TempDocument tempDocument";
	private static final String _SQL_SELECT_TEMPDOCUMENT_WHERE = "SELECT tempDocument FROM TempDocument tempDocument WHERE ";
	private static final String _SQL_COUNT_TEMPDOCUMENT = "SELECT COUNT(tempDocument) FROM TempDocument tempDocument";
	private static final String _SQL_COUNT_TEMPDOCUMENT_WHERE = "SELECT COUNT(tempDocument) FROM TempDocument tempDocument WHERE ";
	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"tempDocument.documentName = ? AND ";
	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempDocument.documentYear = ?";
	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2 =
		"tempDocument.documentName = ? AND ";
	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempDocument.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempDocument.requestState = ?";
	private static final String _FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTNAME_2 = "tempDocument.documentName = ? AND ";
	private static final String _FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTYEAR_2 = "tempDocument.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_1 = "tempDocument.documentTypeCode IS NULL";
	private static final String _FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_2 = "tempDocument.documentTypeCode = ?";
	private static final String _FINDER_COLUMN_F_B_N_Y_TYPE_DOCUMENTTYPECODE_3 = "(tempDocument.documentTypeCode IS NULL OR tempDocument.documentTypeCode = ?)";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempDocument.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempDocument.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempDocument.requestCode IS NULL OR tempDocument.requestCode = ?)";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_1 =
		"tempDocument.shipName IS NULL AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_2 =
		"tempDocument.shipName = ? AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPNAME_3 =
		"(tempDocument.shipName IS NULL OR tempDocument.shipName = ?) AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_1 =
		"tempDocument.callSign IS NULL AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_2 =
		"tempDocument.callSign = ? AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_CALLSIGN_3 =
		"(tempDocument.callSign IS NULL OR tempDocument.callSign = ?) AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_1 =
		"tempDocument.shipTypeCode IS NULL AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_2 =
		"tempDocument.shipTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_SHIPTYPECODE_3 =
		"(tempDocument.shipTypeCode IS NULL OR tempDocument.shipTypeCode = ?) AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTYEAR_2 =
		"tempDocument.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_1 =
		"tempDocument.documentTypeCode IS NULL";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_2 =
		"tempDocument.documentTypeCode = ?";
	private static final String _FINDER_COLUMN_TEMPDOCUMENTBYSHIPNAMESMSANDDOCUMENTTYPECODE_DOCUMENTTYPECODE_3 =
		"(tempDocument.documentTypeCode IS NULL OR tempDocument.documentTypeCode = ?)";
	private static final String _FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_1 =
		"tempDocument.documentTypeCode IS NULL AND ";
	private static final String _FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_2 =
		"tempDocument.documentTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_DOCUMENTTYPECODE_3 =
		"(tempDocument.documentTypeCode IS NULL OR tempDocument.documentTypeCode = ?) AND ";
	private static final String _FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_1 =
		"tempDocument.maritimeCode IS NULL";
	private static final String _FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_2 =
		"tempDocument.maritimeCode = ?";
	private static final String _FINDER_COLUMN_F_DOCUMENTTYPECODE_MARITIMECODE_MARITIMECODE_3 =
		"(tempDocument.maritimeCode IS NULL OR tempDocument.maritimeCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempDocument exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempDocumentPersistenceImpl.class);
	private static TempDocument _nullTempDocument = new TempDocumentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempDocument> toCacheModel() {
				return _nullTempDocumentCacheModel;
			}
		};

	private static CacheModel<TempDocument> _nullTempDocumentCacheModel = new CacheModel<TempDocument>() {
			public TempDocument toEntityModel() {
				return _nullTempDocument;
			}
		};
}