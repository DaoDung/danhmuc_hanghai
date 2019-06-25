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

import vn.gt.dao.result.NoSuchTempDebitNoteException;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.model.impl.TempDebitNoteImpl;
import vn.gt.dao.result.model.impl.TempDebitNoteModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp debit note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempDebitNotePersistence
 * @see TempDebitNoteUtil
 * @generated
 */
public class TempDebitNotePersistenceImpl extends BasePersistenceImpl<TempDebitNote>
	implements TempDebitNotePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempDebitNoteUtil} to access the temp debit note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempDebitNoteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYearDone",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYearDone",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempDebitNoteModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDebitNoteModelImpl.MARKASDELETED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYearDone",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempDebitNoteModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYearMarkasdeleted",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYearMarkasdeleted",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			},
			TempDebitNoteModelImpl.MARITIMECODE_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDebitNoteModelImpl.MARKASDELETED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYearMarkasdeleted",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameSearch",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameSearch",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName()
			},
			TempDebitNoteModelImpl.MARITIMECODE_COLUMN_BITMASK |
			TempDebitNoteModelImpl.MARKASDELETED_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMESEARCH = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameSearch",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydebitnotenumberSearch",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydebitnotenumberSearch",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName(), String.class.getName()
			},
			TempDebitNoteModelImpl.MARITIMECODE_COLUMN_BITMASK |
			TempDebitNoteModelImpl.MARKASDELETED_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DEBITNOTENUMBER_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEBITNOTENUMBERSEARCH = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydebitnotenumberSearch",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MARKASDELETED =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByMarkasdeleted",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByMarkasdeleted",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			TempDebitNoteModelImpl.MARKASDELETED_COLUMN_BITMASK |
			TempDebitNoteModelImpl.MARITIMECODE_COLUMN_BITMASK |
			TempDebitNoteModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARKASDELETED = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMarkasdeleted",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MARKASDELETEDALL =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByMarkasdeletedAll",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETEDALL =
		new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByMarkasdeletedAll", new String[] { Integer.class.getName() },
			TempDebitNoteModelImpl.MARKASDELETED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARKASDELETEDALL = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMarkasdeletedAll", new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_debitnotenumber",
			new String[] { String.class.getName() },
			TempDebitNoteModelImpl.DEBITNOTENUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DEBITNOTENUMBER = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_debitnotenumber", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_TRANSACTIONID = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByTransactionId", new String[] { String.class.getName() },
			TempDebitNoteModelImpl.TRANSACTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANSACTIONID = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTransactionId",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED,
			TempDebitNoteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp debit note in the entity cache if it is enabled.
	 *
	 * @param tempDebitNote the temp debit note
	 */
	public void cacheResult(TempDebitNote tempDebitNote) {
		EntityCacheUtil.putResult(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteImpl.class, tempDebitNote.getPrimaryKey(),
			tempDebitNote);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
			new Object[] { tempDebitNote.getDebitnotenumber() }, tempDebitNote);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
			new Object[] { tempDebitNote.getTransactionid() }, tempDebitNote);

		tempDebitNote.resetOriginalValues();
	}

	/**
	 * Caches the temp debit notes in the entity cache if it is enabled.
	 *
	 * @param tempDebitNotes the temp debit notes
	 */
	public void cacheResult(List<TempDebitNote> tempDebitNotes) {
		for (TempDebitNote tempDebitNote : tempDebitNotes) {
			if (EntityCacheUtil.getResult(
						TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
						TempDebitNoteImpl.class, tempDebitNote.getPrimaryKey()) == null) {
				cacheResult(tempDebitNote);
			}
			else {
				tempDebitNote.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp debit notes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempDebitNoteImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempDebitNoteImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp debit note.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempDebitNote tempDebitNote) {
		EntityCacheUtil.removeResult(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteImpl.class, tempDebitNote.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tempDebitNote);
	}

	@Override
	public void clearCache(List<TempDebitNote> tempDebitNotes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempDebitNote tempDebitNote : tempDebitNotes) {
			EntityCacheUtil.removeResult(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
				TempDebitNoteImpl.class, tempDebitNote.getPrimaryKey());

			clearUniqueFindersCache(tempDebitNote);
		}
	}

	protected void clearUniqueFindersCache(TempDebitNote tempDebitNote) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
			new Object[] { tempDebitNote.getDebitnotenumber() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
			new Object[] { tempDebitNote.getTransactionid() });
	}

	/**
	 * Creates a new temp debit note with the primary key. Does not add the temp debit note to the database.
	 *
	 * @param id the primary key for the new temp debit note
	 * @return the new temp debit note
	 */
	public TempDebitNote create(long id) {
		TempDebitNote tempDebitNote = new TempDebitNoteImpl();

		tempDebitNote.setNew(true);
		tempDebitNote.setPrimaryKey(id);

		return tempDebitNote;
	}

	/**
	 * Removes the temp debit note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp debit note
	 * @return the temp debit note that was removed
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote remove(long id)
		throws NoSuchTempDebitNoteException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp debit note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp debit note
	 * @return the temp debit note that was removed
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDebitNote remove(Serializable primaryKey)
		throws NoSuchTempDebitNoteException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempDebitNote tempDebitNote = (TempDebitNote)session.get(TempDebitNoteImpl.class,
					primaryKey);

			if (tempDebitNote == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempDebitNoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempDebitNote);
		}
		catch (NoSuchTempDebitNoteException nsee) {
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
	protected TempDebitNote removeImpl(TempDebitNote tempDebitNote)
		throws SystemException {
		tempDebitNote = toUnwrappedModel(tempDebitNote);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempDebitNote);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempDebitNote);

		return tempDebitNote;
	}

	@Override
	public TempDebitNote updateImpl(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote, boolean merge)
		throws SystemException {
		tempDebitNote = toUnwrappedModel(tempDebitNote);

		boolean isNew = tempDebitNote.isNew();

		TempDebitNoteModelImpl tempDebitNoteModelImpl = (TempDebitNoteModelImpl)tempDebitNote;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempDebitNote, merge);

			tempDebitNote.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempDebitNoteModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempDebitNoteModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalDocumentYear()),
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMarkasdeleted())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE,
					args);

				args = new Object[] {
						Long.valueOf(tempDebitNoteModelImpl.getDocumentName()),
						Integer.valueOf(tempDebitNoteModelImpl.getDocumentYear()),
						Integer.valueOf(tempDebitNoteModelImpl.getMarkasdeleted())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE,
					args);
			}

			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempDebitNoteModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						Long.valueOf(tempDebitNoteModelImpl.getDocumentName()),
						Integer.valueOf(tempDebitNoteModelImpl.getDocumentYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMariTimeCode()),
						Long.valueOf(tempDebitNoteModelImpl.getOriginalDocumentName()),
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalDocumentYear()),
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMarkasdeleted())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED,
					args);

				args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getMariTimeCode()),
						Long.valueOf(tempDebitNoteModelImpl.getDocumentName()),
						Integer.valueOf(tempDebitNoteModelImpl.getDocumentYear()),
						Integer.valueOf(tempDebitNoteModelImpl.getMarkasdeleted())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED,
					args);
			}

			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMariTimeCode()),
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMarkasdeleted()),
						Long.valueOf(tempDebitNoteModelImpl.getOriginalDocumentName()),
						
						tempDebitNoteModelImpl.getOriginalDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMESEARCH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH,
					args);

				args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getMariTimeCode()),
						Integer.valueOf(tempDebitNoteModelImpl.getMarkasdeleted()),
						Long.valueOf(tempDebitNoteModelImpl.getDocumentName()),
						
						tempDebitNoteModelImpl.getDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMESEARCH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH,
					args);
			}

			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMariTimeCode()),
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMarkasdeleted()),
						
						tempDebitNoteModelImpl.getOriginalDebitnotenumber(),
						
						tempDebitNoteModelImpl.getOriginalDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBERSEARCH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH,
					args);

				args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getMariTimeCode()),
						Integer.valueOf(tempDebitNoteModelImpl.getMarkasdeleted()),
						
						tempDebitNoteModelImpl.getDebitnotenumber(),
						
						tempDebitNoteModelImpl.getDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBERSEARCH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH,
					args);
			}

			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMarkasdeleted()),
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMariTimeCode()),
						
						tempDebitNoteModelImpl.getOriginalDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARKASDELETED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED,
					args);

				args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getMarkasdeleted()),
						Integer.valueOf(tempDebitNoteModelImpl.getMariTimeCode()),
						
						tempDebitNoteModelImpl.getDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARKASDELETED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED,
					args);
			}

			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETEDALL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getOriginalMarkasdeleted())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARKASDELETEDALL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETEDALL,
					args);

				args = new Object[] {
						Integer.valueOf(tempDebitNoteModelImpl.getMarkasdeleted())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARKASDELETEDALL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETEDALL,
					args);
			}
		}

		EntityCacheUtil.putResult(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			TempDebitNoteImpl.class, tempDebitNote.getPrimaryKey(),
			tempDebitNote);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
				new Object[] { tempDebitNote.getDebitnotenumber() },
				tempDebitNote);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
				new Object[] { tempDebitNote.getTransactionid() }, tempDebitNote);
		}
		else {
			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDebitNoteModelImpl.getOriginalDebitnotenumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_DEBITNOTENUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
					new Object[] { tempDebitNote.getDebitnotenumber() },
					tempDebitNote);
			}

			if ((tempDebitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TRANSACTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDebitNoteModelImpl.getOriginalTransactionid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANSACTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
					new Object[] { tempDebitNote.getTransactionid() },
					tempDebitNote);
			}
		}

		return tempDebitNote;
	}

	protected TempDebitNote toUnwrappedModel(TempDebitNote tempDebitNote) {
		if (tempDebitNote instanceof TempDebitNoteImpl) {
			return tempDebitNote;
		}

		TempDebitNoteImpl tempDebitNoteImpl = new TempDebitNoteImpl();

		tempDebitNoteImpl.setNew(tempDebitNote.isNew());
		tempDebitNoteImpl.setPrimaryKey(tempDebitNote.getPrimaryKey());

		tempDebitNoteImpl.setId(tempDebitNote.getId());
		tempDebitNoteImpl.setATTACHEDFILE(tempDebitNote.getATTACHEDFILE());
		tempDebitNoteImpl.setCorporationid(tempDebitNote.getCorporationid());
		tempDebitNoteImpl.setDebitnotenumber(tempDebitNote.getDebitnotenumber());
		tempDebitNoteImpl.setDivision(tempDebitNote.getDivision());
		tempDebitNoteImpl.setDocumentName(tempDebitNote.getDocumentName());
		tempDebitNoteImpl.setDocumentYear(tempDebitNote.getDocumentYear());
		tempDebitNoteImpl.setFinancialaccountant(tempDebitNote.getFinancialaccountant());
		tempDebitNoteImpl.setFromdate(tempDebitNote.getFromdate());
		tempDebitNoteImpl.setMarkasdeleted(tempDebitNote.getMarkasdeleted());
		tempDebitNoteImpl.setOrganization(tempDebitNote.getOrganization());
		tempDebitNoteImpl.setPaymenttype(tempDebitNote.getPaymenttype());
		tempDebitNoteImpl.setReportby(tempDebitNote.getReportby());
		tempDebitNoteImpl.setReportdate(tempDebitNote.getReportdate());
		tempDebitNoteImpl.setTodate(tempDebitNote.getTodate());
		tempDebitNoteImpl.setTotalpayment(tempDebitNote.getTotalpayment());
		tempDebitNoteImpl.setTransactionid(tempDebitNote.getTransactionid());
		tempDebitNoteImpl.setMariTimeCode(tempDebitNote.getMariTimeCode());
		tempDebitNoteImpl.setComments(tempDebitNote.getComments());
		tempDebitNoteImpl.setDocumentTypeCode(tempDebitNote.getDocumentTypeCode());
		tempDebitNoteImpl.setKeypayGoodCode(tempDebitNote.getKeypayGoodCode());
		tempDebitNoteImpl.setKeypayMerchantCode(tempDebitNote.getKeypayMerchantCode());
		tempDebitNoteImpl.setPaymentGateStatusCode(tempDebitNote.getPaymentGateStatusCode());
		tempDebitNoteImpl.setPaymentGateResponseData(tempDebitNote.getPaymentGateResponseData());
		tempDebitNoteImpl.setPaymentGateCheckCode(tempDebitNote.getPaymentGateCheckCode());
		tempDebitNoteImpl.setPaymentGateCheckResponseData(tempDebitNote.getPaymentGateCheckResponseData());
		tempDebitNoteImpl.setKeypayURL(tempDebitNote.getKeypayURL());
		tempDebitNoteImpl.setCurrency(tempDebitNote.getCurrency());

		return tempDebitNoteImpl;
	}

	/**
	 * Returns the temp debit note with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp debit note
	 * @return the temp debit note
	 * @throws com.liferay.portal.NoSuchModelException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDebitNote findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp debit note with the primary key or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	 *
	 * @param id the primary key of the temp debit note
	 * @return the temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByPrimaryKey(long id)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = fetchByPrimaryKey(id);

		if (tempDebitNote == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempDebitNoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempDebitNote;
	}

	/**
	 * Returns the temp debit note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp debit note
	 * @return the temp debit note, or <code>null</code> if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDebitNote fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp debit note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp debit note
	 * @return the temp debit note, or <code>null</code> if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote fetchByPrimaryKey(long id) throws SystemException {
		TempDebitNote tempDebitNote = (TempDebitNote)EntityCacheUtil.getResult(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
				TempDebitNoteImpl.class, id);

		if (tempDebitNote == _nullTempDebitNote) {
			return null;
		}

		if (tempDebitNote == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempDebitNote = (TempDebitNote)session.get(TempDebitNoteImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempDebitNote != null) {
					cacheResult(tempDebitNote);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempDebitNoteModelImpl.ENTITY_CACHE_ENABLED,
						TempDebitNoteImpl.class, id, _nullTempDebitNote);
				}

				closeSession(session);
			}
		}

		return tempDebitNote;
	}

	/**
	 * Returns all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted)
		throws SystemException {
		return findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleted, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted, int start,
		int end) throws SystemException {
		return findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleted, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE;
			finderArgs = new Object[] { documentName, documentYear, markasdeleted };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE;
			finderArgs = new Object[] {
					documentName, documentYear, markasdeleted,
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_MARKASDELETED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(markasdeleted);

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp debit note in the ordered set where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByDocumentNameAnddocumentYearDone_First(
		long documentName, int documentYear, int markasdeleted,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		List<TempDebitNote> list = findByDocumentNameAnddocumentYearDone(documentName,
				documentYear, markasdeleted, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", markasdeleted=");
			msg.append(markasdeleted);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp debit note in the ordered set where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByDocumentNameAnddocumentYearDone_Last(
		long documentName, int documentYear, int markasdeleted,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		int count = countByDocumentNameAnddocumentYearDone(documentName,
				documentYear, markasdeleted);

		List<TempDebitNote> list = findByDocumentNameAnddocumentYearDone(documentName,
				documentYear, markasdeleted, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", markasdeleted=");
			msg.append(markasdeleted);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp debit notes before and after the current temp debit note in the ordered set where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp debit note
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote[] findByDocumentNameAnddocumentYearDone_PrevAndNext(
		long id, long documentName, int documentYear, int markasdeleted,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDebitNote[] array = new TempDebitNoteImpl[3];

			array[0] = getByDocumentNameAnddocumentYearDone_PrevAndNext(session,
					tempDebitNote, documentName, documentYear, markasdeleted,
					orderByComparator, true);

			array[1] = tempDebitNote;

			array[2] = getByDocumentNameAnddocumentYearDone_PrevAndNext(session,
					tempDebitNote, documentName, documentYear, markasdeleted,
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

	protected TempDebitNote getByDocumentNameAnddocumentYearDone_PrevAndNext(
		Session session, TempDebitNote tempDebitNote, long documentName,
		int documentYear, int markasdeleted,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_MARKASDELETED_2);

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
			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		qPos.add(markasdeleted);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDebitNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDebitNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleteds the markasdeleteds
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds)
		throws SystemException {
		return findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleteds, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleteds the markasdeleteds
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds, int start,
		int end) throws SystemException {
		return findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleteds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleteds the markasdeleteds
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE;
			finderArgs = new Object[] {
					documentName, documentYear, StringUtil.merge(markasdeleteds)
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE;
			finderArgs = new Object[] {
					documentName, documentYear, StringUtil.merge(markasdeleteds),
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTNAME_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTYEAR_5);

			conjunctionable = true;

			if ((markasdeleteds == null) || (markasdeleteds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < markasdeleteds.length; i++) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_MARKASDELETED_5);

					if ((i + 1) < markasdeleteds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (markasdeleteds != null) {
					qPos.add(markasdeleteds);
				}

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns all the temp debit notes where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp debit note in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		List<TempDebitNote> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp debit note in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		int count = countByDocumentNameAnddocumentYear(documentName,
				documentYear);

		List<TempDebitNote> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp debit notes before and after the current temp debit note in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp debit note
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDebitNote[] array = new TempDebitNoteImpl[3];

			array[0] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					tempDebitNote, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempDebitNote;

			array[2] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					tempDebitNote, documentName, documentYear,
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

	protected TempDebitNote getByDocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempDebitNote tempDebitNote, long documentName,
		int documentYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDebitNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDebitNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * @param mariTimeCode the mari time code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws SystemException {
		return findByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
			documentName, documentYear, markasdeleted, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, int start, int end) throws SystemException {
		return findByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
			documentName, documentYear, markasdeleted, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED;
			finderArgs = new Object[] {
					mariTimeCode, documentName, documentYear, markasdeleted
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED;
			finderArgs = new Object[] {
					mariTimeCode, documentName, documentYear, markasdeleted,
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_MARITIMECODE_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_MARKASDELETED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(markasdeleted);

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp debit note in the ordered set where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByDocumentNameAnddocumentYearMarkasdeleted_First(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		List<TempDebitNote> list = findByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
				documentName, documentYear, markasdeleted, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mariTimeCode=");
			msg.append(mariTimeCode);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", markasdeleted=");
			msg.append(markasdeleted);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp debit note in the ordered set where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByDocumentNameAnddocumentYearMarkasdeleted_Last(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		int count = countByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
				documentName, documentYear, markasdeleted);

		List<TempDebitNote> list = findByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
				documentName, documentYear, markasdeleted, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mariTimeCode=");
			msg.append(mariTimeCode);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentYear=");
			msg.append(documentYear);

			msg.append(", markasdeleted=");
			msg.append(markasdeleted);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp debit notes before and after the current temp debit note in the ordered set where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp debit note
	 * @param mariTimeCode the mari time code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote[] findByDocumentNameAnddocumentYearMarkasdeleted_PrevAndNext(
		long id, int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDebitNote[] array = new TempDebitNoteImpl[3];

			array[0] = getByDocumentNameAnddocumentYearMarkasdeleted_PrevAndNext(session,
					tempDebitNote, mariTimeCode, documentName, documentYear,
					markasdeleted, orderByComparator, true);

			array[1] = tempDebitNote;

			array[2] = getByDocumentNameAnddocumentYearMarkasdeleted_PrevAndNext(session,
					tempDebitNote, mariTimeCode, documentName, documentYear,
					markasdeleted, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDebitNote getByDocumentNameAnddocumentYearMarkasdeleted_PrevAndNext(
		Session session, TempDebitNote tempDebitNote, int mariTimeCode,
		long documentName, int documentYear, int markasdeleted,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_MARITIMECODE_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_MARKASDELETED_2);

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
			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mariTimeCode);

		qPos.add(documentName);

		qPos.add(documentYear);

		qPos.add(markasdeleted);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDebitNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDebitNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCode the document type code
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName, String documentTypeCode)
		throws SystemException {
		return findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName, String documentTypeCode,
		int start, int end) throws SystemException {
		return findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName, String documentTypeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH;
			finderArgs = new Object[] {
					mariTimeCode, markasdeleted, documentName, documentTypeCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH;
			finderArgs = new Object[] {
					mariTimeCode, markasdeleted, documentName, documentTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARITIMECODE_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARKASDELETED_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTNAME_2);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(markasdeleted);

				qPos.add(documentName);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findBydocumentNameSearch_First(int mariTimeCode,
		int markasdeleted, long documentName, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		List<TempDebitNote> list = findBydocumentNameSearch(mariTimeCode,
				markasdeleted, documentName, documentTypeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mariTimeCode=");
			msg.append(mariTimeCode);

			msg.append(", markasdeleted=");
			msg.append(markasdeleted);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findBydocumentNameSearch_Last(int mariTimeCode,
		int markasdeleted, long documentName, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		int count = countBydocumentNameSearch(mariTimeCode, markasdeleted,
				documentName, documentTypeCode);

		List<TempDebitNote> list = findBydocumentNameSearch(mariTimeCode,
				markasdeleted, documentName, documentTypeCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mariTimeCode=");
			msg.append(mariTimeCode);

			msg.append(", markasdeleted=");
			msg.append(markasdeleted);

			msg.append(", documentName=");
			msg.append(documentName);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp debit notes before and after the current temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp debit note
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote[] findBydocumentNameSearch_PrevAndNext(long id,
		int mariTimeCode, int markasdeleted, long documentName,
		String documentTypeCode, OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDebitNote[] array = new TempDebitNoteImpl[3];

			array[0] = getBydocumentNameSearch_PrevAndNext(session,
					tempDebitNote, mariTimeCode, markasdeleted, documentName,
					documentTypeCode, orderByComparator, true);

			array[1] = tempDebitNote;

			array[2] = getBydocumentNameSearch_PrevAndNext(session,
					tempDebitNote, mariTimeCode, markasdeleted, documentName,
					documentTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDebitNote getBydocumentNameSearch_PrevAndNext(
		Session session, TempDebitNote tempDebitNote, int mariTimeCode,
		int markasdeleted, long documentName, String documentTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARITIMECODE_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARKASDELETED_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTNAME_2);

		if (documentTypeCode == null) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_1);
		}
		else {
			if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_2);
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
			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mariTimeCode);

		qPos.add(markasdeleted);

		qPos.add(documentName);

		if (documentTypeCode != null) {
			qPos.add(documentTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDebitNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDebitNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCodes the document type codes
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName, String[] documentTypeCodes)
		throws SystemException {
		return findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCodes, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCodes the document type codes
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName, String[] documentTypeCodes,
		int start, int end) throws SystemException {
		return findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCodes, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCodes the document type codes
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName, String[] documentTypeCodes,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH;
			finderArgs = new Object[] {
					mariTimeCode, markasdeleted, documentName,
					StringUtil.merge(documentTypeCodes)
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMESEARCH;
			finderArgs = new Object[] {
					mariTimeCode, markasdeleted, documentName,
					StringUtil.merge(documentTypeCodes),
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARITIMECODE_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARKASDELETED_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTNAME_5);

			conjunctionable = true;

			if ((documentTypeCodes == null) || (documentTypeCodes.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < documentTypeCodes.length; i++) {
					String documentTypeCode = documentTypeCodes[i];

					if (documentTypeCode == null) {
						query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_4);
					}
					else {
						if (documentTypeCode.equals(StringPool.BLANK)) {
							query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_6);
						}
						else {
							query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_5);
						}
					}

					if ((i + 1) < documentTypeCodes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(markasdeleted);

				qPos.add(documentName);

				if (documentTypeCodes != null) {
					qPos.add(documentTypeCodes);
				}

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCode the document type code
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String documentTypeCode)
		throws SystemException {
		return findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String documentTypeCode,
		int start, int end) throws SystemException {
		return findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String documentTypeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH;
			finderArgs = new Object[] {
					mariTimeCode, markasdeleted, debitnotenumber,
					documentTypeCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH;
			finderArgs = new Object[] {
					mariTimeCode, markasdeleted, debitnotenumber,
					documentTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARITIMECODE_2);

			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARKASDELETED_2);

			if (debitnotenumber == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_1);
			}
			else {
				if (debitnotenumber.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_3);
				}
				else {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_2);
				}
			}

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(markasdeleted);

				if (debitnotenumber != null) {
					qPos.add(debitnotenumber);
				}

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findBydebitnotenumberSearch_First(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		List<TempDebitNote> list = findBydebitnotenumberSearch(mariTimeCode,
				markasdeleted, debitnotenumber, documentTypeCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mariTimeCode=");
			msg.append(mariTimeCode);

			msg.append(", markasdeleted=");
			msg.append(markasdeleted);

			msg.append(", debitnotenumber=");
			msg.append(debitnotenumber);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findBydebitnotenumberSearch_Last(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		int count = countBydebitnotenumberSearch(mariTimeCode, markasdeleted,
				debitnotenumber, documentTypeCode);

		List<TempDebitNote> list = findBydebitnotenumberSearch(mariTimeCode,
				markasdeleted, debitnotenumber, documentTypeCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mariTimeCode=");
			msg.append(mariTimeCode);

			msg.append(", markasdeleted=");
			msg.append(markasdeleted);

			msg.append(", debitnotenumber=");
			msg.append(debitnotenumber);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp debit notes before and after the current temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp debit note
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote[] findBydebitnotenumberSearch_PrevAndNext(long id,
		int mariTimeCode, int markasdeleted, String debitnotenumber,
		String documentTypeCode, OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDebitNote[] array = new TempDebitNoteImpl[3];

			array[0] = getBydebitnotenumberSearch_PrevAndNext(session,
					tempDebitNote, mariTimeCode, markasdeleted,
					debitnotenumber, documentTypeCode, orderByComparator, true);

			array[1] = tempDebitNote;

			array[2] = getBydebitnotenumberSearch_PrevAndNext(session,
					tempDebitNote, mariTimeCode, markasdeleted,
					debitnotenumber, documentTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDebitNote getBydebitnotenumberSearch_PrevAndNext(
		Session session, TempDebitNote tempDebitNote, int mariTimeCode,
		int markasdeleted, String debitnotenumber, String documentTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

		query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARITIMECODE_2);

		query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARKASDELETED_2);

		if (debitnotenumber == null) {
			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_1);
		}
		else {
			if (debitnotenumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_3);
			}
			else {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_2);
			}
		}

		if (documentTypeCode == null) {
			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_1);
		}
		else {
			if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_2);
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
			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mariTimeCode);

		qPos.add(markasdeleted);

		if (debitnotenumber != null) {
			qPos.add(debitnotenumber);
		}

		if (documentTypeCode != null) {
			qPos.add(documentTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDebitNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDebitNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCodes the document type codes
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String[] documentTypeCodes)
		throws SystemException {
		return findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCodes, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCodes the document type codes
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String[] documentTypeCodes,
		int start, int end) throws SystemException {
		return findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCodes, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCodes the document type codes
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String[] documentTypeCodes,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH;
			finderArgs = new Object[] {
					mariTimeCode, markasdeleted, debitnotenumber,
					StringUtil.merge(documentTypeCodes)
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTENUMBERSEARCH;
			finderArgs = new Object[] {
					mariTimeCode, markasdeleted, debitnotenumber,
					StringUtil.merge(documentTypeCodes),
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARITIMECODE_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARKASDELETED_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			if (debitnotenumber == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_4);
			}
			else {
				if (debitnotenumber.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_6);
				}
				else {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_5);
				}
			}

			conjunctionable = true;

			if ((documentTypeCodes == null) || (documentTypeCodes.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < documentTypeCodes.length; i++) {
					String documentTypeCode = documentTypeCodes[i];

					if (documentTypeCode == null) {
						query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_4);
					}
					else {
						if (documentTypeCode.equals(StringPool.BLANK)) {
							query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_6);
						}
						else {
							query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_5);
						}
					}

					if ((i + 1) < documentTypeCodes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(markasdeleted);

				if (debitnotenumber != null) {
					qPos.add(debitnotenumber);
				}

				if (documentTypeCodes != null) {
					qPos.add(documentTypeCodes);
				}

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCode the document type code
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeleted(int markasdeleted,
		int mariTimeCode, String documentTypeCode) throws SystemException {
		return findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeleted(int markasdeleted,
		int mariTimeCode, String documentTypeCode, int start, int end)
		throws SystemException {
		return findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeleted(int markasdeleted,
		int mariTimeCode, String documentTypeCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED;
			finderArgs = new Object[] {
					markasdeleted, mariTimeCode, documentTypeCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MARKASDELETED;
			finderArgs = new Object[] {
					markasdeleted, mariTimeCode, documentTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2);

			query.append(_FINDER_COLUMN_MARKASDELETED_MARITIMECODE_2);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(markasdeleted);

				qPos.add(mariTimeCode);

				if (documentTypeCode != null) {
					qPos.add(documentTypeCode);
				}

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp debit note in the ordered set where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByMarkasdeleted_First(int markasdeleted,
		int mariTimeCode, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		List<TempDebitNote> list = findByMarkasdeleted(markasdeleted,
				mariTimeCode, documentTypeCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("markasdeleted=");
			msg.append(markasdeleted);

			msg.append(", mariTimeCode=");
			msg.append(mariTimeCode);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp debit note in the ordered set where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByMarkasdeleted_Last(int markasdeleted,
		int mariTimeCode, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		int count = countByMarkasdeleted(markasdeleted, mariTimeCode,
				documentTypeCode);

		List<TempDebitNote> list = findByMarkasdeleted(markasdeleted,
				mariTimeCode, documentTypeCode, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("markasdeleted=");
			msg.append(markasdeleted);

			msg.append(", mariTimeCode=");
			msg.append(mariTimeCode);

			msg.append(", documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp debit notes before and after the current temp debit note in the ordered set where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp debit note
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote[] findByMarkasdeleted_PrevAndNext(long id,
		int markasdeleted, int mariTimeCode, String documentTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDebitNote[] array = new TempDebitNoteImpl[3];

			array[0] = getByMarkasdeleted_PrevAndNext(session, tempDebitNote,
					markasdeleted, mariTimeCode, documentTypeCode,
					orderByComparator, true);

			array[1] = tempDebitNote;

			array[2] = getByMarkasdeleted_PrevAndNext(session, tempDebitNote,
					markasdeleted, mariTimeCode, documentTypeCode,
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

	protected TempDebitNote getByMarkasdeleted_PrevAndNext(Session session,
		TempDebitNote tempDebitNote, int markasdeleted, int mariTimeCode,
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

		query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

		query.append(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2);

		query.append(_FINDER_COLUMN_MARKASDELETED_MARITIMECODE_2);

		if (documentTypeCode == null) {
			query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_1);
		}
		else {
			if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_2);
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
			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(markasdeleted);

		qPos.add(mariTimeCode);

		if (documentTypeCode != null) {
			qPos.add(documentTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDebitNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDebitNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCodes the document type codes
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeleted(int markasdeleted,
		int mariTimeCode, String[] documentTypeCodes) throws SystemException {
		return findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCodes, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCodes the document type codes
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeleted(int markasdeleted,
		int mariTimeCode, String[] documentTypeCodes, int start, int end)
		throws SystemException {
		return findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCodes, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCodes the document type codes
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeleted(int markasdeleted,
		int mariTimeCode, String[] documentTypeCodes, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED;
			finderArgs = new Object[] {
					markasdeleted, mariTimeCode,
					StringUtil.merge(documentTypeCodes)
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MARKASDELETED;
			finderArgs = new Object[] {
					markasdeleted, mariTimeCode,
					StringUtil.merge(documentTypeCodes),
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_MARKASDELETED_MARITIMECODE_5);

			conjunctionable = true;

			if ((documentTypeCodes == null) || (documentTypeCodes.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < documentTypeCodes.length; i++) {
					String documentTypeCode = documentTypeCodes[i];

					if (documentTypeCode == null) {
						query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_4);
					}
					else {
						if (documentTypeCode.equals(StringPool.BLANK)) {
							query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_6);
						}
						else {
							query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_5);
						}
					}

					if ((i + 1) < documentTypeCodes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(markasdeleted);

				qPos.add(mariTimeCode);

				if (documentTypeCodes != null) {
					qPos.add(documentTypeCodes);
				}

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns all the temp debit notes where markasdeleted = &#63;.
	 *
	 * @param markasdeleted the markasdeleted
	 * @return the matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeletedAll(int markasdeleted)
		throws SystemException {
		return findByMarkasdeletedAll(markasdeleted, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes where markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeletedAll(int markasdeleted,
		int start, int end) throws SystemException {
		return findByMarkasdeletedAll(markasdeleted, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes where markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findByMarkasdeletedAll(int markasdeleted,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETEDALL;
			finderArgs = new Object[] { markasdeleted };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MARKASDELETEDALL;
			finderArgs = new Object[] {
					markasdeleted,
					
					start, end, orderByComparator
				};
		}

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_MARKASDELETEDALL_MARKASDELETED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(markasdeleted);

				list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first temp debit note in the ordered set where markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByMarkasdeletedAll_First(int markasdeleted,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		List<TempDebitNote> list = findByMarkasdeletedAll(markasdeleted, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("markasdeleted=");
			msg.append(markasdeleted);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp debit note in the ordered set where markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByMarkasdeletedAll_Last(int markasdeleted,
		OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		int count = countByMarkasdeletedAll(markasdeleted);

		List<TempDebitNote> list = findByMarkasdeletedAll(markasdeleted,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("markasdeleted=");
			msg.append(markasdeleted);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempDebitNoteException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp debit notes before and after the current temp debit note in the ordered set where markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp debit note
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote[] findByMarkasdeletedAll_PrevAndNext(long id,
		int markasdeleted, OrderByComparator orderByComparator)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDebitNote[] array = new TempDebitNoteImpl[3];

			array[0] = getByMarkasdeletedAll_PrevAndNext(session,
					tempDebitNote, markasdeleted, orderByComparator, true);

			array[1] = tempDebitNote;

			array[2] = getByMarkasdeletedAll_PrevAndNext(session,
					tempDebitNote, markasdeleted, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDebitNote getByMarkasdeletedAll_PrevAndNext(Session session,
		TempDebitNote tempDebitNote, int markasdeleted,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

		query.append(_FINDER_COLUMN_MARKASDELETEDALL_MARKASDELETED_2);

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
			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(markasdeleted);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDebitNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDebitNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the temp debit note where debitnotenumber = &#63; or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	 *
	 * @param debitnotenumber the debitnotenumber
	 * @return the matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByF_debitnotenumber(String debitnotenumber)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = fetchByF_debitnotenumber(debitnotenumber);

		if (tempDebitNote == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("debitnotenumber=");
			msg.append(debitnotenumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTempDebitNoteException(msg.toString());
		}

		return tempDebitNote;
	}

	/**
	 * Returns the temp debit note where debitnotenumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param debitnotenumber the debitnotenumber
	 * @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote fetchByF_debitnotenumber(String debitnotenumber)
		throws SystemException {
		return fetchByF_debitnotenumber(debitnotenumber, true);
	}

	/**
	 * Returns the temp debit note where debitnotenumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param debitnotenumber the debitnotenumber
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote fetchByF_debitnotenumber(String debitnotenumber,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { debitnotenumber };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			if (debitnotenumber == null) {
				query.append(_FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_1);
			}
			else {
				if (debitnotenumber.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_2);
				}
			}

			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (debitnotenumber != null) {
					qPos.add(debitnotenumber);
				}

				List<TempDebitNote> list = q.list();

				result = list;

				TempDebitNote tempDebitNote = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
						finderArgs, list);
				}
				else {
					tempDebitNote = list.get(0);

					cacheResult(tempDebitNote);

					if ((tempDebitNote.getDebitnotenumber() == null) ||
							!tempDebitNote.getDebitnotenumber()
											  .equals(debitnotenumber)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
							finderArgs, tempDebitNote);
					}
				}

				return tempDebitNote;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_DEBITNOTENUMBER,
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
				return (TempDebitNote)result;
			}
		}
	}

	/**
	 * Returns the temp debit note where transactionid = &#63; or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	 *
	 * @param transactionid the transactionid
	 * @return the matching temp debit note
	 * @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote findByTransactionId(String transactionid)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = fetchByTransactionId(transactionid);

		if (tempDebitNote == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("transactionid=");
			msg.append(transactionid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTempDebitNoteException(msg.toString());
		}

		return tempDebitNote;
	}

	/**
	 * Returns the temp debit note where transactionid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param transactionid the transactionid
	 * @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote fetchByTransactionId(String transactionid)
		throws SystemException {
		return fetchByTransactionId(transactionid, true);
	}

	/**
	 * Returns the temp debit note where transactionid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param transactionid the transactionid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempDebitNote fetchByTransactionId(String transactionid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { transactionid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TEMPDEBITNOTE_WHERE);

			if (transactionid == null) {
				query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_1);
			}
			else {
				if (transactionid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_3);
				}
				else {
					query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_2);
				}
			}

			query.append(TempDebitNoteModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (transactionid != null) {
					qPos.add(transactionid);
				}

				List<TempDebitNote> list = q.list();

				result = list;

				TempDebitNote tempDebitNote = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
						finderArgs, list);
				}
				else {
					tempDebitNote = list.get(0);

					cacheResult(tempDebitNote);

					if ((tempDebitNote.getTransactionid() == null) ||
							!tempDebitNote.getTransactionid()
											  .equals(transactionid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
							finderArgs, tempDebitNote);
					}
				}

				return tempDebitNote;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
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
				return (TempDebitNote)result;
			}
		}
	}

	/**
	 * Returns all the temp debit notes.
	 *
	 * @return the temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp debit notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @return the range of temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp debit notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp debit notes
	 * @param end the upper bound of the range of temp debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempDebitNote> findAll(int start, int end,
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

		List<TempDebitNote> list = (List<TempDebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPDEBITNOTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPDEBITNOTE.concat(TempDebitNoteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempDebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAnddocumentYearDone(long documentName,
		int documentYear, int markasdeleted) throws SystemException {
		for (TempDebitNote tempDebitNote : findByDocumentNameAnddocumentYearDone(
				documentName, documentYear, markasdeleted)) {
			remove(tempDebitNote);
		}
	}

	/**
	 * Removes all the temp debit notes where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempDebitNote tempDebitNote : findByDocumentNameAnddocumentYear(
				documentName, documentYear)) {
			remove(tempDebitNote);
		}
	}

	/**
	 * Removes all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63; from the database.
	 *
	 * @param mariTimeCode the mari time code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws SystemException {
		for (TempDebitNote tempDebitNote : findByDocumentNameAnddocumentYearMarkasdeleted(
				mariTimeCode, documentName, documentYear, markasdeleted)) {
			remove(tempDebitNote);
		}
	}

	/**
	 * Removes all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63; from the database.
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCode the document type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBydocumentNameSearch(int mariTimeCode, int markasdeleted,
		long documentName, String documentTypeCode) throws SystemException {
		for (TempDebitNote tempDebitNote : findBydocumentNameSearch(
				mariTimeCode, markasdeleted, documentName, documentTypeCode)) {
			remove(tempDebitNote);
		}
	}

	/**
	 * Removes all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63; from the database.
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCode the document type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String documentTypeCode)
		throws SystemException {
		for (TempDebitNote tempDebitNote : findBydebitnotenumberSearch(
				mariTimeCode, markasdeleted, debitnotenumber, documentTypeCode)) {
			remove(tempDebitNote);
		}
	}

	/**
	 * Removes all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63; from the database.
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCode the document type code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMarkasdeleted(int markasdeleted, int mariTimeCode,
		String documentTypeCode) throws SystemException {
		for (TempDebitNote tempDebitNote : findByMarkasdeleted(markasdeleted,
				mariTimeCode, documentTypeCode)) {
			remove(tempDebitNote);
		}
	}

	/**
	 * Removes all the temp debit notes where markasdeleted = &#63; from the database.
	 *
	 * @param markasdeleted the markasdeleted
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMarkasdeletedAll(int markasdeleted)
		throws SystemException {
		for (TempDebitNote tempDebitNote : findByMarkasdeletedAll(markasdeleted)) {
			remove(tempDebitNote);
		}
	}

	/**
	 * Removes the temp debit note where debitnotenumber = &#63; from the database.
	 *
	 * @param debitnotenumber the debitnotenumber
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_debitnotenumber(String debitnotenumber)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByF_debitnotenumber(debitnotenumber);

		remove(tempDebitNote);
	}

	/**
	 * Removes the temp debit note where transactionid = &#63; from the database.
	 *
	 * @param transactionid the transactionid
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByTransactionId(String transactionid)
		throws NoSuchTempDebitNoteException, SystemException {
		TempDebitNote tempDebitNote = findByTransactionId(transactionid);

		remove(tempDebitNote);
	}

	/**
	 * Removes all the temp debit notes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempDebitNote tempDebitNote : findAll()) {
			remove(tempDebitNote);
		}
	}

	/**
	 * Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYearDone(long documentName,
		int documentYear, int markasdeleted) throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, markasdeleted
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_MARKASDELETED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(markasdeleted);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleteds the markasdeleteds
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYearDone(long documentName,
		int documentYear, int[] markasdeleteds) throws SystemException {
		Object[] finderArgs = new Object[] {
				documentName, documentYear, StringUtil.merge(markasdeleteds)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTNAME_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTYEAR_5);

			conjunctionable = true;

			if ((markasdeleteds == null) || (markasdeleteds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < markasdeleteds.length; i++) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_MARKASDELETED_5);

					if ((i + 1) < markasdeleteds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (markasdeleteds != null) {
					qPos.add(markasdeleteds);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARDONE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	 *
	 * @param mariTimeCode the mari time code
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param markasdeleted the markasdeleted
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				mariTimeCode, documentName, documentYear, markasdeleted
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_MARITIMECODE_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_MARKASDELETED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(markasdeleted);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCode the document type code
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countBydocumentNameSearch(int mariTimeCode, int markasdeleted,
		long documentName, String documentTypeCode) throws SystemException {
		Object[] finderArgs = new Object[] {
				mariTimeCode, markasdeleted, documentName, documentTypeCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMESEARCH,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARITIMECODE_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARKASDELETED_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTNAME_2);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(markasdeleted);

				qPos.add(documentName);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMESEARCH,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = any &#63;.
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param documentName the document name
	 * @param documentTypeCodes the document type codes
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countBydocumentNameSearch(int mariTimeCode, int markasdeleted,
		long documentName, String[] documentTypeCodes)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				mariTimeCode, markasdeleted, documentName,
				StringUtil.merge(documentTypeCodes)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMESEARCH,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARITIMECODE_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARKASDELETED_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTNAME_5);

			conjunctionable = true;

			if ((documentTypeCodes == null) || (documentTypeCodes.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < documentTypeCodes.length; i++) {
					String documentTypeCode = documentTypeCodes[i];

					if (documentTypeCode == null) {
						query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_4);
					}
					else {
						if (documentTypeCode.equals(StringPool.BLANK)) {
							query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_6);
						}
						else {
							query.append(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_5);
						}
					}

					if ((i + 1) < documentTypeCodes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(markasdeleted);

				qPos.add(documentName);

				if (documentTypeCodes != null) {
					qPos.add(documentTypeCodes);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMESEARCH,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCode the document type code
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String documentTypeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				mariTimeCode, markasdeleted, debitnotenumber, documentTypeCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBERSEARCH,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARITIMECODE_2);

			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARKASDELETED_2);

			if (debitnotenumber == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_1);
			}
			else {
				if (debitnotenumber.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_3);
				}
				else {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_2);
				}
			}

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(markasdeleted);

				if (debitnotenumber != null) {
					qPos.add(debitnotenumber);
				}

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBERSEARCH,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = any &#63;.
	 *
	 * @param mariTimeCode the mari time code
	 * @param markasdeleted the markasdeleted
	 * @param debitnotenumber the debitnotenumber
	 * @param documentTypeCodes the document type codes
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, String debitnotenumber, String[] documentTypeCodes)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				mariTimeCode, markasdeleted, debitnotenumber,
				StringUtil.merge(documentTypeCodes)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBERSEARCH,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARITIMECODE_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARKASDELETED_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			if (debitnotenumber == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_4);
			}
			else {
				if (debitnotenumber.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_6);
				}
				else {
					query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_5);
				}
			}

			conjunctionable = true;

			if ((documentTypeCodes == null) || (documentTypeCodes.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < documentTypeCodes.length; i++) {
					String documentTypeCode = documentTypeCodes[i];

					if (documentTypeCode == null) {
						query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_4);
					}
					else {
						if (documentTypeCode.equals(StringPool.BLANK)) {
							query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_6);
						}
						else {
							query.append(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_5);
						}
					}

					if ((i + 1) < documentTypeCodes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mariTimeCode);

				qPos.add(markasdeleted);

				if (debitnotenumber != null) {
					qPos.add(debitnotenumber);
				}

				if (documentTypeCodes != null) {
					qPos.add(documentTypeCodes);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBERSEARCH,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCode the document type code
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		String documentTypeCode) throws SystemException {
		Object[] finderArgs = new Object[] {
				markasdeleted, mariTimeCode, documentTypeCode
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MARKASDELETED,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2);

			query.append(_FINDER_COLUMN_MARKASDELETED_MARITIMECODE_2);

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_1);
			}
			else {
				if (documentTypeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(markasdeleted);

				qPos.add(mariTimeCode);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MARKASDELETED,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	 *
	 * @param markasdeleted the markasdeleted
	 * @param mariTimeCode the mari time code
	 * @param documentTypeCodes the document type codes
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		String[] documentTypeCodes) throws SystemException {
		Object[] finderArgs = new Object[] {
				markasdeleted, mariTimeCode, StringUtil.merge(documentTypeCodes)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MARKASDELETED,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_5);

			conjunctionable = true;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_MARKASDELETED_MARITIMECODE_5);

			conjunctionable = true;

			if ((documentTypeCodes == null) || (documentTypeCodes.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < documentTypeCodes.length; i++) {
					String documentTypeCode = documentTypeCodes[i];

					if (documentTypeCode == null) {
						query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_4);
					}
					else {
						if (documentTypeCode.equals(StringPool.BLANK)) {
							query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_6);
						}
						else {
							query.append(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_5);
						}
					}

					if ((i + 1) < documentTypeCodes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(markasdeleted);

				qPos.add(mariTimeCode);

				if (documentTypeCodes != null) {
					qPos.add(documentTypeCodes);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MARKASDELETED,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where markasdeleted = &#63;.
	 *
	 * @param markasdeleted the markasdeleted
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMarkasdeletedAll(int markasdeleted)
		throws SystemException {
		Object[] finderArgs = new Object[] { markasdeleted };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MARKASDELETEDALL,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_MARKASDELETEDALL_MARKASDELETED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(markasdeleted);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MARKASDELETEDALL,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where debitnotenumber = &#63;.
	 *
	 * @param debitnotenumber the debitnotenumber
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_debitnotenumber(String debitnotenumber)
		throws SystemException {
		Object[] finderArgs = new Object[] { debitnotenumber };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_DEBITNOTENUMBER,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			if (debitnotenumber == null) {
				query.append(_FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_1);
			}
			else {
				if (debitnotenumber.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (debitnotenumber != null) {
					qPos.add(debitnotenumber);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_DEBITNOTENUMBER,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes where transactionid = &#63;.
	 *
	 * @param transactionid the transactionid
	 * @return the number of matching temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByTransactionId(String transactionid)
		throws SystemException {
		Object[] finderArgs = new Object[] { transactionid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TRANSACTIONID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPDEBITNOTE_WHERE);

			if (transactionid == null) {
				query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_1);
			}
			else {
				if (transactionid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_3);
				}
				else {
					query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (transactionid != null) {
					qPos.add(transactionid);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TRANSACTIONID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp debit notes.
	 *
	 * @return the number of temp debit notes
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPDEBITNOTE);

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
	 * Initializes the temp debit note persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.result.model.TempDebitNote")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempDebitNote>> listenersList = new ArrayList<ModelListener<TempDebitNote>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempDebitNote>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempDebitNoteImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = ResultCertificatePersistence.class)
	protected ResultCertificatePersistence resultCertificatePersistence;
	@BeanReference(type = ResultCompetionPersistence.class)
	protected ResultCompetionPersistence resultCompetionPersistence;
	@BeanReference(type = ResultDeclarationPersistence.class)
	protected ResultDeclarationPersistence resultDeclarationPersistence;
	@BeanReference(type = ResultHistoryMinistryPersistence.class)
	protected ResultHistoryMinistryPersistence resultHistoryMinistryPersistence;
	@BeanReference(type = ResultMinistryPersistence.class)
	protected ResultMinistryPersistence resultMinistryPersistence;
	@BeanReference(type = ResultNotificationPersistence.class)
	protected ResultNotificationPersistence resultNotificationPersistence;
	@BeanReference(type = TempDebitNotePersistence.class)
	protected TempDebitNotePersistence tempDebitNotePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TEMPDEBITNOTE = "SELECT tempDebitNote FROM TempDebitNote tempDebitNote";
	private static final String _SQL_SELECT_TEMPDEBITNOTE_WHERE = "SELECT tempDebitNote FROM TempDebitNote tempDebitNote WHERE ";
	private static final String _SQL_COUNT_TEMPDEBITNOTE = "SELECT COUNT(tempDebitNote) FROM TempDebitNote tempDebitNote";
	private static final String _SQL_COUNT_TEMPDEBITNOTE_WHERE = "SELECT COUNT(tempDebitNote) FROM TempDebitNote tempDebitNote WHERE ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTNAME_2 =
		"tempDebitNote.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTNAME_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTNAME_2) +
		")";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTYEAR_2 =
		"tempDebitNote.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTYEAR_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_DOCUMENTYEAR_2) +
		")";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_MARKASDELETED_2 =
		"tempDebitNote.markasdeleted = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_MARKASDELETED_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARDONE_MARKASDELETED_2) +
		")";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"tempDebitNote.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempDebitNote.documentYear = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_MARITIMECODE_2 =
		"tempDebitNote.mariTimeCode = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_DOCUMENTNAME_2 =
		"tempDebitNote.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_DOCUMENTYEAR_2 =
		"tempDebitNote.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARMARKASDELETED_MARKASDELETED_2 =
		"tempDebitNote.markasdeleted = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_MARITIMECODE_2 =
		"tempDebitNote.mariTimeCode = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_MARITIMECODE_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARITIMECODE_2) +
		")";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_MARKASDELETED_2 =
		"tempDebitNote.markasdeleted = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_MARKASDELETED_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMESEARCH_MARKASDELETED_2) +
		")";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTNAME_2 =
		"tempDebitNote.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTNAME_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTNAME_2) +
		")";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_1 =
		"tempDebitNote.documentTypeCode IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_2 =
		"tempDebitNote.documentTypeCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_3 =
		"(tempDebitNote.documentTypeCode IS NULL OR tempDebitNote.documentTypeCode = ?)";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_4 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_1) +
		")";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_2) +
		")";
	private static final String _FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_6 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DOCUMENTNAMESEARCH_DOCUMENTTYPECODE_3) +
		")";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARITIMECODE_2 =
		"tempDebitNote.mariTimeCode = ? AND ";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARITIMECODE_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARITIMECODE_2) +
		")";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARKASDELETED_2 =
		"tempDebitNote.markasdeleted = ? AND ";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARKASDELETED_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_MARKASDELETED_2) +
		")";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_1 =
		"tempDebitNote.debitnotenumber IS NULL AND ";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_2 =
		"tempDebitNote.debitnotenumber = ? AND ";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_3 =
		"(tempDebitNote.debitnotenumber IS NULL OR tempDebitNote.debitnotenumber = ?) AND ";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_4 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_1) +
		")";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_2) +
		")";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_6 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DEBITNOTENUMBER_3) +
		")";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_1 =
		"tempDebitNote.documentTypeCode IS NULL";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_2 =
		"tempDebitNote.documentTypeCode = ?";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_3 =
		"(tempDebitNote.documentTypeCode IS NULL OR tempDebitNote.documentTypeCode = ?)";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_4 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_1) +
		")";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_5 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_2) +
		")";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_6 =
		"(" +
		_removeConjunction(_FINDER_COLUMN_DEBITNOTENUMBERSEARCH_DOCUMENTTYPECODE_3) +
		")";
	private static final String _FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2 = "tempDebitNote.markasdeleted = ? AND ";
	private static final String _FINDER_COLUMN_MARKASDELETED_MARKASDELETED_5 = "(" +
		_removeConjunction(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2) + ")";
	private static final String _FINDER_COLUMN_MARKASDELETED_MARITIMECODE_2 = "tempDebitNote.mariTimeCode = ? AND ";
	private static final String _FINDER_COLUMN_MARKASDELETED_MARITIMECODE_5 = "(" +
		_removeConjunction(_FINDER_COLUMN_MARKASDELETED_MARITIMECODE_2) + ")";
	private static final String _FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_1 = "tempDebitNote.documentTypeCode IS NULL";
	private static final String _FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_2 = "tempDebitNote.documentTypeCode = ?";
	private static final String _FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_3 = "(tempDebitNote.documentTypeCode IS NULL OR tempDebitNote.documentTypeCode = ?)";
	private static final String _FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_4 = "(" +
		_removeConjunction(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_1) +
		")";
	private static final String _FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_5 = "(" +
		_removeConjunction(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_2) +
		")";
	private static final String _FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_6 = "(" +
		_removeConjunction(_FINDER_COLUMN_MARKASDELETED_DOCUMENTTYPECODE_3) +
		")";
	private static final String _FINDER_COLUMN_MARKASDELETEDALL_MARKASDELETED_2 = "tempDebitNote.markasdeleted = ?";
	private static final String _FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_1 =
		"tempDebitNote.debitnotenumber IS NULL";
	private static final String _FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_2 =
		"tempDebitNote.debitnotenumber = ?";
	private static final String _FINDER_COLUMN_F_DEBITNOTENUMBER_DEBITNOTENUMBER_3 =
		"(tempDebitNote.debitnotenumber IS NULL OR tempDebitNote.debitnotenumber = ?)";
	private static final String _FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_1 = "tempDebitNote.transactionid IS NULL";
	private static final String _FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_2 = "tempDebitNote.transactionid = ?";
	private static final String _FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_3 = "(tempDebitNote.transactionid IS NULL OR tempDebitNote.transactionid = ?)";

	private static String _removeConjunction(String sql) {
		int pos = sql.indexOf(" AND ");

		if (pos != -1) {
			sql = sql.substring(0, pos);
		}

		return sql;
	}

	private static final String _ORDER_BY_ENTITY_ALIAS = "tempDebitNote.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempDebitNote exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempDebitNote exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempDebitNotePersistenceImpl.class);
	private static TempDebitNote _nullTempDebitNote = new TempDebitNoteImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempDebitNote> toCacheModel() {
				return _nullTempDebitNoteCacheModel;
			}
		};

	private static CacheModel<TempDebitNote> _nullTempDebitNoteCacheModel = new CacheModel<TempDebitNote>() {
			public TempDebitNote toEntityModel() {
				return _nullTempDebitNote;
			}
		};
}