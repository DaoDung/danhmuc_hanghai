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

package vn.gt.dao.danhmuc.service.persistence;

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

import vn.gt.dao.danhmuc.NoSuchDmMaritimeException;
import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl;
import vn.gt.dao.danhmuc.model.impl.DmMaritimeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm maritime service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmMaritimePersistence
 * @see DmMaritimeUtil
 * @generated
 */
public class DmMaritimePersistenceImpl extends BasePersistenceImpl<DmMaritime>
	implements DmMaritimePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmMaritimeUtil} to access the dm maritime persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmMaritimeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_MARITIMECODE = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMaritimeCode",
			new String[] { String.class.getName() },
			DmMaritimeModelImpl.MARITIMECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARITIMECODE = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaritimeCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_MARITIMEREFERENCE = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMaritimeReference",
			new String[] { String.class.getName() },
			DmMaritimeModelImpl.MARITIMEREFERENCE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARITIMEREFERENCE = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMaritimeReference", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELETE = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDelete",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETE =
		new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDelete",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			DmMaritimeModelImpl.ISDELETE_COLUMN_BITMASK |
			DmMaritimeModelImpl.MARKEDASDELETE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELETE = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDelete",
			new String[] { Integer.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm maritime in the entity cache if it is enabled.
	 *
	 * @param dmMaritime the dm maritime
	 */
	public void cacheResult(DmMaritime dmMaritime) {
		EntityCacheUtil.putResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeImpl.class, dmMaritime.getPrimaryKey(), dmMaritime);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
			new Object[] { dmMaritime.getMaritimeCode() }, dmMaritime);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
			new Object[] { dmMaritime.getMaritimeReference() }, dmMaritime);

		dmMaritime.resetOriginalValues();
	}

	/**
	 * Caches the dm maritimes in the entity cache if it is enabled.
	 *
	 * @param dmMaritimes the dm maritimes
	 */
	public void cacheResult(List<DmMaritime> dmMaritimes) {
		for (DmMaritime dmMaritime : dmMaritimes) {
			if (EntityCacheUtil.getResult(
						DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
						DmMaritimeImpl.class, dmMaritime.getPrimaryKey()) == null) {
				cacheResult(dmMaritime);
			}
			else {
				dmMaritime.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm maritimes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmMaritimeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmMaritimeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm maritime.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmMaritime dmMaritime) {
		EntityCacheUtil.removeResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeImpl.class, dmMaritime.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
			new Object[] { dmMaritime.getMaritimeCode() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
			new Object[] { dmMaritime.getMaritimeReference() });
	}

	/**
	 * Creates a new dm maritime with the primary key. Does not add the dm maritime to the database.
	 *
	 * @param id the primary key for the new dm maritime
	 * @return the new dm maritime
	 */
	public DmMaritime create(int id) {
		DmMaritime dmMaritime = new DmMaritimeImpl();

		dmMaritime.setNew(true);
		dmMaritime.setPrimaryKey(id);

		return dmMaritime;
	}

	/**
	 * Removes the dm maritime with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm maritime
	 * @return the dm maritime that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm maritime with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm maritime
	 * @return the dm maritime that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime remove(int id)
		throws NoSuchDmMaritimeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmMaritime dmMaritime = (DmMaritime)session.get(DmMaritimeImpl.class,
					Integer.valueOf(id));

			if (dmMaritime == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmMaritimeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmMaritimePersistence.remove(dmMaritime);
		}
		catch (NoSuchDmMaritimeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Removes the dm maritime from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmMaritime the dm maritime
	 * @return the dm maritime that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime remove(DmMaritime dmMaritime) throws SystemException {
		return super.remove(dmMaritime);
	}

	@Override
	protected DmMaritime removeImpl(DmMaritime dmMaritime)
		throws SystemException {
		dmMaritime = toUnwrappedModel(dmMaritime);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmMaritime);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		DmMaritimeModelImpl dmMaritimeModelImpl = (DmMaritimeModelImpl)dmMaritime;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
			new Object[] { dmMaritimeModelImpl.getMaritimeCode() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
			new Object[] { dmMaritimeModelImpl.getMaritimeReference() });

		EntityCacheUtil.removeResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeImpl.class, dmMaritime.getPrimaryKey());

		return dmMaritime;
	}

	@Override
	public DmMaritime updateImpl(
		vn.gt.dao.danhmuc.model.DmMaritime dmMaritime, boolean merge)
		throws SystemException {
		dmMaritime = toUnwrappedModel(dmMaritime);

		boolean isNew = dmMaritime.isNew();

		DmMaritimeModelImpl dmMaritimeModelImpl = (DmMaritimeModelImpl)dmMaritime;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmMaritime, merge);

			dmMaritime.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmMaritimeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmMaritimeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(dmMaritimeModelImpl.getOriginalIsDelete()),
						Integer.valueOf(dmMaritimeModelImpl.getOriginalMarkedAsDelete())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DELETE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETE,
					args);

				args = new Object[] {
						Integer.valueOf(dmMaritimeModelImpl.getIsDelete()),
						Integer.valueOf(dmMaritimeModelImpl.getMarkedAsDelete())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DELETE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeImpl.class, dmMaritime.getPrimaryKey(), dmMaritime);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
				new Object[] { dmMaritime.getMaritimeCode() }, dmMaritime);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
				new Object[] { dmMaritime.getMaritimeReference() }, dmMaritime);
		}
		else {
			if ((dmMaritimeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MARITIMECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmMaritimeModelImpl.getOriginalMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
					new Object[] { dmMaritime.getMaritimeCode() }, dmMaritime);
			}

			if ((dmMaritimeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MARITIMEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmMaritimeModelImpl.getOriginalMaritimeReference()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
					new Object[] { dmMaritime.getMaritimeReference() },
					dmMaritime);
			}
		}

		return dmMaritime;
	}

	protected DmMaritime toUnwrappedModel(DmMaritime dmMaritime) {
		if (dmMaritime instanceof DmMaritimeImpl) {
			return dmMaritime;
		}

		DmMaritimeImpl dmMaritimeImpl = new DmMaritimeImpl();

		dmMaritimeImpl.setNew(dmMaritime.isNew());
		dmMaritimeImpl.setPrimaryKey(dmMaritime.getPrimaryKey());

		dmMaritimeImpl.setId(dmMaritime.getId());
		dmMaritimeImpl.setMaritimeCode(dmMaritime.getMaritimeCode());
		dmMaritimeImpl.setMaritimeReference(dmMaritime.getMaritimeReference());
		dmMaritimeImpl.setMaritimeOrder(dmMaritime.getMaritimeOrder());
		dmMaritimeImpl.setMaritimeName(dmMaritime.getMaritimeName());
		dmMaritimeImpl.setMaritimeNameVN(dmMaritime.getMaritimeNameVN());
		dmMaritimeImpl.setAddress(dmMaritime.getAddress());
		dmMaritimeImpl.setAddressVN(dmMaritime.getAddressVN());
		dmMaritimeImpl.setStateCode(dmMaritime.getStateCode());
		dmMaritimeImpl.setCitycode(dmMaritime.getCitycode());
		dmMaritimeImpl.setIsDelete(dmMaritime.getIsDelete());
		dmMaritimeImpl.setMarkedAsDelete(dmMaritime.getMarkedAsDelete());
		dmMaritimeImpl.setModifiedDate(dmMaritime.getModifiedDate());
		dmMaritimeImpl.setRequestedDate(dmMaritime.getRequestedDate());
		dmMaritimeImpl.setSyncVersion(dmMaritime.getSyncVersion());

		return dmMaritimeImpl;
	}

	/**
	 * Returns the dm maritime with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm maritime
	 * @return the dm maritime
	 * @throws com.liferay.portal.NoSuchModelException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm maritime with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmMaritimeException} if it could not be found.
	 *
	 * @param id the primary key of the dm maritime
	 * @return the dm maritime
	 * @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime findByPrimaryKey(int id)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = fetchByPrimaryKey(id);

		if (dmMaritime == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmMaritimeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmMaritime;
	}

	/**
	 * Returns the dm maritime with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm maritime
	 * @return the dm maritime, or <code>null</code> if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm maritime with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm maritime
	 * @return the dm maritime, or <code>null</code> if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime fetchByPrimaryKey(int id) throws SystemException {
		DmMaritime dmMaritime = (DmMaritime)EntityCacheUtil.getResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
				DmMaritimeImpl.class, id);

		if (dmMaritime == _nullDmMaritime) {
			return null;
		}

		if (dmMaritime == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmMaritime = (DmMaritime)session.get(DmMaritimeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmMaritime != null) {
					cacheResult(dmMaritime);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
						DmMaritimeImpl.class, id, _nullDmMaritime);
				}

				closeSession(session);
			}
		}

		return dmMaritime;
	}

	/**
	 * Returns the dm maritime where maritimeCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmMaritimeException} if it could not be found.
	 *
	 * @param maritimeCode the maritime code
	 * @return the matching dm maritime
	 * @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime findByMaritimeCode(String maritimeCode)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = fetchByMaritimeCode(maritimeCode);

		if (dmMaritime == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maritimeCode=");
			msg.append(maritimeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmMaritimeException(msg.toString());
		}

		return dmMaritime;
	}

	/**
	 * Returns the dm maritime where maritimeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maritimeCode the maritime code
	 * @return the matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime fetchByMaritimeCode(String maritimeCode)
		throws SystemException {
		return fetchByMaritimeCode(maritimeCode, true);
	}

	/**
	 * Returns the dm maritime where maritimeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maritimeCode the maritime code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime fetchByMaritimeCode(String maritimeCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maritimeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMMARITIME_WHERE);

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
			}
			else {
				if (maritimeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
				}
			}

			query.append(DmMaritimeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (maritimeCode != null) {
					qPos.add(maritimeCode);
				}

				List<DmMaritime> list = q.list();

				result = list;

				DmMaritime dmMaritime = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
						finderArgs, list);
				}
				else {
					dmMaritime = list.get(0);

					cacheResult(dmMaritime);

					if ((dmMaritime.getMaritimeCode() == null) ||
							!dmMaritime.getMaritimeCode().equals(maritimeCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
							finderArgs, dmMaritime);
					}
				}

				return dmMaritime;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMECODE,
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
				return (DmMaritime)result;
			}
		}
	}

	/**
	 * Returns the dm maritime where maritimeReference = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmMaritimeException} if it could not be found.
	 *
	 * @param maritimeReference the maritime reference
	 * @return the matching dm maritime
	 * @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime findByMaritimeReference(String maritimeReference)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = fetchByMaritimeReference(maritimeReference);

		if (dmMaritime == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maritimeReference=");
			msg.append(maritimeReference);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmMaritimeException(msg.toString());
		}

		return dmMaritime;
	}

	/**
	 * Returns the dm maritime where maritimeReference = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maritimeReference the maritime reference
	 * @return the matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime fetchByMaritimeReference(String maritimeReference)
		throws SystemException {
		return fetchByMaritimeReference(maritimeReference, true);
	}

	/**
	 * Returns the dm maritime where maritimeReference = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maritimeReference the maritime reference
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime fetchByMaritimeReference(String maritimeReference,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maritimeReference };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMMARITIME_WHERE);

			if (maritimeReference == null) {
				query.append(_FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_1);
			}
			else {
				if (maritimeReference.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_2);
				}
			}

			query.append(DmMaritimeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (maritimeReference != null) {
					qPos.add(maritimeReference);
				}

				List<DmMaritime> list = q.list();

				result = list;

				DmMaritime dmMaritime = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
						finderArgs, list);
				}
				else {
					dmMaritime = list.get(0);

					cacheResult(dmMaritime);

					if ((dmMaritime.getMaritimeReference() == null) ||
							!dmMaritime.getMaritimeReference()
										   .equals(maritimeReference)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
							finderArgs, dmMaritime);
					}
				}

				return dmMaritime;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MARITIMEREFERENCE,
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
				return (DmMaritime)result;
			}
		}
	}

	/**
	 * Returns all the dm maritimes where isDelete = &#63; and markedAsDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @param markedAsDelete the marked as delete
	 * @return the matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMaritime> findByDelete(int isDelete, int markedAsDelete)
		throws SystemException {
		return findByDelete(isDelete, markedAsDelete, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm maritimes where isDelete = &#63; and markedAsDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param markedAsDelete the marked as delete
	 * @param start the lower bound of the range of dm maritimes
	 * @param end the upper bound of the range of dm maritimes (not inclusive)
	 * @return the range of matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMaritime> findByDelete(int isDelete, int markedAsDelete,
		int start, int end) throws SystemException {
		return findByDelete(isDelete, markedAsDelete, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm maritimes where isDelete = &#63; and markedAsDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param markedAsDelete the marked as delete
	 * @param start the lower bound of the range of dm maritimes
	 * @param end the upper bound of the range of dm maritimes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMaritime> findByDelete(int isDelete, int markedAsDelete,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETE;
			finderArgs = new Object[] { isDelete, markedAsDelete };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DELETE;
			finderArgs = new Object[] {
					isDelete, markedAsDelete,
					
					start, end, orderByComparator
				};
		}

		List<DmMaritime> list = (List<DmMaritime>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMMARITIME_WHERE);

			query.append(_FINDER_COLUMN_DELETE_ISDELETE_2);

			query.append(_FINDER_COLUMN_DELETE_MARKEDASDELETE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmMaritimeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isDelete);

				qPos.add(markedAsDelete);

				list = (List<DmMaritime>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first dm maritime in the ordered set where isDelete = &#63; and markedAsDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param markedAsDelete the marked as delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm maritime
	 * @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime findByDelete_First(int isDelete, int markedAsDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmMaritimeException, SystemException {
		List<DmMaritime> list = findByDelete(isDelete, markedAsDelete, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("isDelete=");
			msg.append(isDelete);

			msg.append(", markedAsDelete=");
			msg.append(markedAsDelete);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmMaritimeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm maritime in the ordered set where isDelete = &#63; and markedAsDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isDelete the is delete
	 * @param markedAsDelete the marked as delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm maritime
	 * @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime findByDelete_Last(int isDelete, int markedAsDelete,
		OrderByComparator orderByComparator)
		throws NoSuchDmMaritimeException, SystemException {
		int count = countByDelete(isDelete, markedAsDelete);

		List<DmMaritime> list = findByDelete(isDelete, markedAsDelete,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("isDelete=");
			msg.append(isDelete);

			msg.append(", markedAsDelete=");
			msg.append(markedAsDelete);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmMaritimeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm maritimes before and after the current dm maritime in the ordered set where isDelete = &#63; and markedAsDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm maritime
	 * @param isDelete the is delete
	 * @param markedAsDelete the marked as delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm maritime
	 * @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmMaritime[] findByDelete_PrevAndNext(int id, int isDelete,
		int markedAsDelete, OrderByComparator orderByComparator)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmMaritime[] array = new DmMaritimeImpl[3];

			array[0] = getByDelete_PrevAndNext(session, dmMaritime, isDelete,
					markedAsDelete, orderByComparator, true);

			array[1] = dmMaritime;

			array[2] = getByDelete_PrevAndNext(session, dmMaritime, isDelete,
					markedAsDelete, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmMaritime getByDelete_PrevAndNext(Session session,
		DmMaritime dmMaritime, int isDelete, int markedAsDelete,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMMARITIME_WHERE);

		query.append(_FINDER_COLUMN_DELETE_ISDELETE_2);

		query.append(_FINDER_COLUMN_DELETE_MARKEDASDELETE_2);

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
			query.append(DmMaritimeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isDelete);

		qPos.add(markedAsDelete);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmMaritime);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmMaritime> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm maritimes.
	 *
	 * @return the dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMaritime> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm maritimes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm maritimes
	 * @param end the upper bound of the range of dm maritimes (not inclusive)
	 * @return the range of dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMaritime> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm maritimes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm maritimes
	 * @param end the upper bound of the range of dm maritimes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmMaritime> findAll(int start, int end,
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

		List<DmMaritime> list = (List<DmMaritime>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMMARITIME);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMMARITIME.concat(DmMaritimeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmMaritime>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmMaritime>)QueryUtil.list(q, getDialect(),
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
	 * Removes the dm maritime where maritimeCode = &#63; from the database.
	 *
	 * @param maritimeCode the maritime code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMaritimeCode(String maritimeCode)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = findByMaritimeCode(maritimeCode);

		dmMaritimePersistence.remove(dmMaritime);
	}

	/**
	 * Removes the dm maritime where maritimeReference = &#63; from the database.
	 *
	 * @param maritimeReference the maritime reference
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMaritimeReference(String maritimeReference)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = findByMaritimeReference(maritimeReference);

		dmMaritimePersistence.remove(dmMaritime);
	}

	/**
	 * Removes all the dm maritimes where isDelete = &#63; and markedAsDelete = &#63; from the database.
	 *
	 * @param isDelete the is delete
	 * @param markedAsDelete the marked as delete
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDelete(int isDelete, int markedAsDelete)
		throws SystemException {
		for (DmMaritime dmMaritime : findByDelete(isDelete, markedAsDelete)) {
			dmMaritimePersistence.remove(dmMaritime);
		}
	}

	/**
	 * Removes all the dm maritimes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmMaritime dmMaritime : findAll()) {
			dmMaritimePersistence.remove(dmMaritime);
		}
	}

	/**
	 * Returns the number of dm maritimes where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @return the number of matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMaritimeCode(String maritimeCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { maritimeCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMMARITIME_WHERE);

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
			}
			else {
				if (maritimeCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm maritimes where maritimeReference = &#63;.
	 *
	 * @param maritimeReference the maritime reference
	 * @return the number of matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMaritimeReference(String maritimeReference)
		throws SystemException {
		Object[] finderArgs = new Object[] { maritimeReference };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MARITIMEREFERENCE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMMARITIME_WHERE);

			if (maritimeReference == null) {
				query.append(_FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_1);
			}
			else {
				if (maritimeReference.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_3);
				}
				else {
					query.append(_FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (maritimeReference != null) {
					qPos.add(maritimeReference);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MARITIMEREFERENCE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm maritimes where isDelete = &#63; and markedAsDelete = &#63;.
	 *
	 * @param isDelete the is delete
	 * @param markedAsDelete the marked as delete
	 * @return the number of matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDelete(int isDelete, int markedAsDelete)
		throws SystemException {
		Object[] finderArgs = new Object[] { isDelete, markedAsDelete };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DELETE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMMARITIME_WHERE);

			query.append(_FINDER_COLUMN_DELETE_ISDELETE_2);

			query.append(_FINDER_COLUMN_DELETE_MARKEDASDELETE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isDelete);

				qPos.add(markedAsDelete);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DELETE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm maritimes.
	 *
	 * @return the number of dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMMARITIME);

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
	 * Initializes the dm maritime persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmMaritime")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmMaritime>> listenersList = new ArrayList<ModelListener<DmMaritime>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmMaritime>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmMaritimeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DmArrivalPurposePersistence.class)
	protected DmArrivalPurposePersistence dmArrivalPurposePersistence;
	@BeanReference(type = DmDataItemPersistence.class)
	protected DmDataItemPersistence dmDataItemPersistence;
	@BeanReference(type = DmDocTypePersistence.class)
	protected DmDocTypePersistence dmDocTypePersistence;
	@BeanReference(type = DmEnterrisePersistence.class)
	protected DmEnterrisePersistence dmEnterrisePersistence;
	@BeanReference(type = DmGoodsPersistence.class)
	protected DmGoodsPersistence dmGoodsPersistence;
	@BeanReference(type = DmGoodsTypePersistence.class)
	protected DmGoodsTypePersistence dmGoodsTypePersistence;
	@BeanReference(type = DmHistoryArrivalPurposePersistence.class)
	protected DmHistoryArrivalPurposePersistence dmHistoryArrivalPurposePersistence;
	@BeanReference(type = DmHistoryDocTypePersistence.class)
	protected DmHistoryDocTypePersistence dmHistoryDocTypePersistence;
	@BeanReference(type = DmHistoryEnterrisePersistence.class)
	protected DmHistoryEnterrisePersistence dmHistoryEnterrisePersistence;
	@BeanReference(type = DmHistoryGoodsPersistence.class)
	protected DmHistoryGoodsPersistence dmHistoryGoodsPersistence;
	@BeanReference(type = DmHistoryGoodsTypePersistence.class)
	protected DmHistoryGoodsTypePersistence dmHistoryGoodsTypePersistence;
	@BeanReference(type = DmHistoryMaritimePersistence.class)
	protected DmHistoryMaritimePersistence dmHistoryMaritimePersistence;
	@BeanReference(type = DmHistoryPackagePersistence.class)
	protected DmHistoryPackagePersistence dmHistoryPackagePersistence;
	@BeanReference(type = DmHistoryPassportTypePersistence.class)
	protected DmHistoryPassportTypePersistence dmHistoryPassportTypePersistence;
	@BeanReference(type = DmHistoryPortPersistence.class)
	protected DmHistoryPortPersistence dmHistoryPortPersistence;
	@BeanReference(type = DmHistoryPortHarbourPersistence.class)
	protected DmHistoryPortHarbourPersistence dmHistoryPortHarbourPersistence;
	@BeanReference(type = DmHistoryPortRegionPersistence.class)
	protected DmHistoryPortRegionPersistence dmHistoryPortRegionPersistence;
	@BeanReference(type = DmHistoryPortWharfPersistence.class)
	protected DmHistoryPortWharfPersistence dmHistoryPortWharfPersistence;
	@BeanReference(type = DmHistoryRankRatingPersistence.class)
	protected DmHistoryRankRatingPersistence dmHistoryRankRatingPersistence;
	@BeanReference(type = DmHistoryRepresentativePersistence.class)
	protected DmHistoryRepresentativePersistence dmHistoryRepresentativePersistence;
	@BeanReference(type = DmHistorySecurityLevelPersistence.class)
	protected DmHistorySecurityLevelPersistence dmHistorySecurityLevelPersistence;
	@BeanReference(type = DmHistoryShipAgencyPersistence.class)
	protected DmHistoryShipAgencyPersistence dmHistoryShipAgencyPersistence;
	@BeanReference(type = DmHistoryShipTypePersistence.class)
	protected DmHistoryShipTypePersistence dmHistoryShipTypePersistence;
	@BeanReference(type = DmHistoryStatePersistence.class)
	protected DmHistoryStatePersistence dmHistoryStatePersistence;
	@BeanReference(type = DmHistoryUnitGeneralPersistence.class)
	protected DmHistoryUnitGeneralPersistence dmHistoryUnitGeneralPersistence;
	@BeanReference(type = DmMaritimePersistence.class)
	protected DmMaritimePersistence dmMaritimePersistence;
	@BeanReference(type = DmPackagePersistence.class)
	protected DmPackagePersistence dmPackagePersistence;
	@BeanReference(type = DmPassportTypePersistence.class)
	protected DmPassportTypePersistence dmPassportTypePersistence;
	@BeanReference(type = DmPortPersistence.class)
	protected DmPortPersistence dmPortPersistence;
	@BeanReference(type = DmPortHarbourPersistence.class)
	protected DmPortHarbourPersistence dmPortHarbourPersistence;
	@BeanReference(type = DmPortRegionPersistence.class)
	protected DmPortRegionPersistence dmPortRegionPersistence;
	@BeanReference(type = DmPortWharfPersistence.class)
	protected DmPortWharfPersistence dmPortWharfPersistence;
	@BeanReference(type = DmRankRatingPersistence.class)
	protected DmRankRatingPersistence dmRankRatingPersistence;
	@BeanReference(type = DmRepresentativePersistence.class)
	protected DmRepresentativePersistence dmRepresentativePersistence;
	@BeanReference(type = DmSecurityLevelPersistence.class)
	protected DmSecurityLevelPersistence dmSecurityLevelPersistence;
	@BeanReference(type = DmShipAgencyPersistence.class)
	protected DmShipAgencyPersistence dmShipAgencyPersistence;
	@BeanReference(type = DmShipTypePersistence.class)
	protected DmShipTypePersistence dmShipTypePersistence;
	@BeanReference(type = DmStatePersistence.class)
	protected DmStatePersistence dmStatePersistence;
	@BeanReference(type = DmSyncCategoryPersistence.class)
	protected DmSyncCategoryPersistence dmSyncCategoryPersistence;
	@BeanReference(type = DmTestN01RequestPersistence.class)
	protected DmTestN01RequestPersistence dmTestN01RequestPersistence;
	@BeanReference(type = DmUnitGeneralPersistence.class)
	protected DmUnitGeneralPersistence dmUnitGeneralPersistence;
	@BeanReference(type = HistoryRmdcShipPersistence.class)
	protected HistoryRmdcShipPersistence historyRmdcShipPersistence;
	@BeanReference(type = HistorySyncVersionPersistence.class)
	protected HistorySyncVersionPersistence historySyncVersionPersistence;
	@BeanReference(type = RmdcShipPersistence.class)
	protected RmdcShipPersistence rmdcShipPersistence;
	@BeanReference(type = ThamSoHeThongPersistence.class)
	protected ThamSoHeThongPersistence thamSoHeThongPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DMMARITIME = "SELECT dmMaritime FROM DmMaritime dmMaritime";
	private static final String _SQL_SELECT_DMMARITIME_WHERE = "SELECT dmMaritime FROM DmMaritime dmMaritime WHERE ";
	private static final String _SQL_COUNT_DMMARITIME = "SELECT COUNT(dmMaritime) FROM DmMaritime dmMaritime";
	private static final String _SQL_COUNT_DMMARITIME_WHERE = "SELECT COUNT(dmMaritime) FROM DmMaritime dmMaritime WHERE ";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1 = "dmMaritime.maritimeCode IS NULL";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2 = "dmMaritime.maritimeCode = ?";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3 = "(dmMaritime.maritimeCode IS NULL OR dmMaritime.maritimeCode = ?)";
	private static final String _FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_1 =
		"dmMaritime.maritimeReference IS NULL";
	private static final String _FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_2 =
		"dmMaritime.maritimeReference = ?";
	private static final String _FINDER_COLUMN_MARITIMEREFERENCE_MARITIMEREFERENCE_3 =
		"(dmMaritime.maritimeReference IS NULL OR dmMaritime.maritimeReference = ?)";
	private static final String _FINDER_COLUMN_DELETE_ISDELETE_2 = "dmMaritime.isDelete = ? AND ";
	private static final String _FINDER_COLUMN_DELETE_MARKEDASDELETE_2 = "dmMaritime.markedAsDelete = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmMaritime.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmMaritime exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmMaritime exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmMaritimePersistenceImpl.class);
	private static DmMaritime _nullDmMaritime = new DmMaritimeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmMaritime> toCacheModel() {
				return _nullDmMaritimeCacheModel;
			}
		};

	private static CacheModel<DmMaritime> _nullDmMaritimeCacheModel = new CacheModel<DmMaritime>() {
			public DmMaritime toEntityModel() {
				return _nullDmMaritime;
			}
		};
}