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

package vn.gt.dao.danhmucgt.service.persistence;

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

import vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException;
import vn.gt.dao.danhmucgt.model.DmGtOrganization;
import vn.gt.dao.danhmucgt.model.impl.DmGtOrganizationImpl;
import vn.gt.dao.danhmucgt.model.impl.DmGtOrganizationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm gt organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtOrganizationPersistence
 * @see DmGtOrganizationUtil
 * @generated
 */
public class DmGtOrganizationPersistenceImpl extends BasePersistenceImpl<DmGtOrganization>
	implements DmGtOrganizationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtOrganizationUtil} to access the dm gt organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtOrganizationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_ORGANIZATIONCODE = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED,
			DmGtOrganizationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByOrganizationCode", new String[] { String.class.getName() },
			DmGtOrganizationModelImpl.ORGANIZATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONCODE = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOrganizationCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED,
			DmGtOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED,
			DmGtOrganizationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm gt organization in the entity cache if it is enabled.
	 *
	 * @param dmGtOrganization the dm gt organization
	 */
	public void cacheResult(DmGtOrganization dmGtOrganization) {
		EntityCacheUtil.putResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationImpl.class, dmGtOrganization.getPrimaryKey(),
			dmGtOrganization);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
			new Object[] { dmGtOrganization.getOrganizationCode() },
			dmGtOrganization);

		dmGtOrganization.resetOriginalValues();
	}

	/**
	 * Caches the dm gt organizations in the entity cache if it is enabled.
	 *
	 * @param dmGtOrganizations the dm gt organizations
	 */
	public void cacheResult(List<DmGtOrganization> dmGtOrganizations) {
		for (DmGtOrganization dmGtOrganization : dmGtOrganizations) {
			if (EntityCacheUtil.getResult(
						DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
						DmGtOrganizationImpl.class,
						dmGtOrganization.getPrimaryKey()) == null) {
				cacheResult(dmGtOrganization);
			}
			else {
				dmGtOrganization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt organizations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtOrganizationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtOrganizationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt organization.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtOrganization dmGtOrganization) {
		EntityCacheUtil.removeResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationImpl.class, dmGtOrganization.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmGtOrganization);
	}

	@Override
	public void clearCache(List<DmGtOrganization> dmGtOrganizations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGtOrganization dmGtOrganization : dmGtOrganizations) {
			EntityCacheUtil.removeResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
				DmGtOrganizationImpl.class, dmGtOrganization.getPrimaryKey());

			clearUniqueFindersCache(dmGtOrganization);
		}
	}

	protected void clearUniqueFindersCache(DmGtOrganization dmGtOrganization) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
			new Object[] { dmGtOrganization.getOrganizationCode() });
	}

	/**
	 * Creates a new dm gt organization with the primary key. Does not add the dm gt organization to the database.
	 *
	 * @param id the primary key for the new dm gt organization
	 * @return the new dm gt organization
	 */
	public DmGtOrganization create(long id) {
		DmGtOrganization dmGtOrganization = new DmGtOrganizationImpl();

		dmGtOrganization.setNew(true);
		dmGtOrganization.setPrimaryKey(id);

		return dmGtOrganization;
	}

	/**
	 * Removes the dm gt organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt organization
	 * @return the dm gt organization that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtOrganization remove(long id)
		throws NoSuchDmGtOrganizationException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the dm gt organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt organization
	 * @return the dm gt organization that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization remove(Serializable primaryKey)
		throws NoSuchDmGtOrganizationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtOrganization dmGtOrganization = (DmGtOrganization)session.get(DmGtOrganizationImpl.class,
					primaryKey);

			if (dmGtOrganization == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGtOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGtOrganization);
		}
		catch (NoSuchDmGtOrganizationException nsee) {
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
	protected DmGtOrganization removeImpl(DmGtOrganization dmGtOrganization)
		throws SystemException {
		dmGtOrganization = toUnwrappedModel(dmGtOrganization);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGtOrganization);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmGtOrganization);

		return dmGtOrganization;
	}

	@Override
	public DmGtOrganization updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtOrganization dmGtOrganization,
		boolean merge) throws SystemException {
		dmGtOrganization = toUnwrappedModel(dmGtOrganization);

		boolean isNew = dmGtOrganization.isNew();

		DmGtOrganizationModelImpl dmGtOrganizationModelImpl = (DmGtOrganizationModelImpl)dmGtOrganization;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGtOrganization, merge);

			dmGtOrganization.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGtOrganizationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			DmGtOrganizationImpl.class, dmGtOrganization.getPrimaryKey(),
			dmGtOrganization);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
				new Object[] { dmGtOrganization.getOrganizationCode() },
				dmGtOrganization);
		}
		else {
			if ((dmGtOrganizationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ORGANIZATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGtOrganizationModelImpl.getOriginalOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
					new Object[] { dmGtOrganization.getOrganizationCode() },
					dmGtOrganization);
			}
		}

		return dmGtOrganization;
	}

	protected DmGtOrganization toUnwrappedModel(
		DmGtOrganization dmGtOrganization) {
		if (dmGtOrganization instanceof DmGtOrganizationImpl) {
			return dmGtOrganization;
		}

		DmGtOrganizationImpl dmGtOrganizationImpl = new DmGtOrganizationImpl();

		dmGtOrganizationImpl.setNew(dmGtOrganization.isNew());
		dmGtOrganizationImpl.setPrimaryKey(dmGtOrganization.getPrimaryKey());

		dmGtOrganizationImpl.setId(dmGtOrganization.getId());
		dmGtOrganizationImpl.setOrganizationCode(dmGtOrganization.getOrganizationCode());
		dmGtOrganizationImpl.setOrganizationName(dmGtOrganization.getOrganizationName());
		dmGtOrganizationImpl.setOrganizationNameVN(dmGtOrganization.getOrganizationNameVN());
		dmGtOrganizationImpl.setOrganizationorder(dmGtOrganization.getOrganizationorder());
		dmGtOrganizationImpl.setIsDelete(dmGtOrganization.getIsDelete());
		dmGtOrganizationImpl.setMarkedAsDelete(dmGtOrganization.getMarkedAsDelete());
		dmGtOrganizationImpl.setModifiedDate(dmGtOrganization.getModifiedDate());
		dmGtOrganizationImpl.setRequestedDate(dmGtOrganization.getRequestedDate());
		dmGtOrganizationImpl.setSyncVersion(dmGtOrganization.getSyncVersion());

		return dmGtOrganizationImpl;
	}

	/**
	 * Returns the dm gt organization with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt organization
	 * @return the dm gt organization
	 * @throws com.liferay.portal.NoSuchModelException if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm gt organization with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt organization
	 * @return the dm gt organization
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtOrganization findByPrimaryKey(long id)
		throws NoSuchDmGtOrganizationException, SystemException {
		DmGtOrganization dmGtOrganization = fetchByPrimaryKey(id);

		if (dmGtOrganization == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGtOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGtOrganization;
	}

	/**
	 * Returns the dm gt organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt organization
	 * @return the dm gt organization, or <code>null</code> if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtOrganization fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm gt organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt organization
	 * @return the dm gt organization, or <code>null</code> if a dm gt organization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtOrganization fetchByPrimaryKey(long id)
		throws SystemException {
		DmGtOrganization dmGtOrganization = (DmGtOrganization)EntityCacheUtil.getResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
				DmGtOrganizationImpl.class, id);

		if (dmGtOrganization == _nullDmGtOrganization) {
			return null;
		}

		if (dmGtOrganization == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGtOrganization = (DmGtOrganization)session.get(DmGtOrganizationImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGtOrganization != null) {
					cacheResult(dmGtOrganization);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGtOrganizationModelImpl.ENTITY_CACHE_ENABLED,
						DmGtOrganizationImpl.class, id, _nullDmGtOrganization);
				}

				closeSession(session);
			}
		}

		return dmGtOrganization;
	}

	/**
	 * Returns the dm gt organization where organizationCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException} if it could not be found.
	 *
	 * @param organizationCode the organization code
	 * @return the matching dm gt organization
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException if a matching dm gt organization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtOrganization findByOrganizationCode(String organizationCode)
		throws NoSuchDmGtOrganizationException, SystemException {
		DmGtOrganization dmGtOrganization = fetchByOrganizationCode(organizationCode);

		if (dmGtOrganization == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("organizationCode=");
			msg.append(organizationCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmGtOrganizationException(msg.toString());
		}

		return dmGtOrganization;
	}

	/**
	 * Returns the dm gt organization where organizationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param organizationCode the organization code
	 * @return the matching dm gt organization, or <code>null</code> if a matching dm gt organization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtOrganization fetchByOrganizationCode(String organizationCode)
		throws SystemException {
		return fetchByOrganizationCode(organizationCode, true);
	}

	/**
	 * Returns the dm gt organization where organizationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param organizationCode the organization code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm gt organization, or <code>null</code> if a matching dm gt organization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtOrganization fetchByOrganizationCode(String organizationCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { organizationCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMGTORGANIZATION_WHERE);

			if (organizationCode == null) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
			}
			else {
				if (organizationCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
				}
			}

			query.append(DmGtOrganizationModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (organizationCode != null) {
					qPos.add(organizationCode);
				}

				List<DmGtOrganization> list = q.list();

				result = list;

				DmGtOrganization dmGtOrganization = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
						finderArgs, list);
				}
				else {
					dmGtOrganization = list.get(0);

					cacheResult(dmGtOrganization);

					if ((dmGtOrganization.getOrganizationCode() == null) ||
							!dmGtOrganization.getOrganizationCode()
												 .equals(organizationCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
							finderArgs, dmGtOrganization);
					}
				}

				return dmGtOrganization;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ORGANIZATIONCODE,
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
				return (DmGtOrganization)result;
			}
		}
	}

	/**
	 * Returns all the dm gt organizations.
	 *
	 * @return the dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtOrganization> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt organizations
	 * @param end the upper bound of the range of dm gt organizations (not inclusive)
	 * @return the range of dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtOrganization> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt organizations
	 * @param end the upper bound of the range of dm gt organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtOrganization> findAll(int start, int end,
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

		List<DmGtOrganization> list = (List<DmGtOrganization>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTORGANIZATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTORGANIZATION.concat(DmGtOrganizationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGtOrganization>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGtOrganization>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes the dm gt organization where organizationCode = &#63; from the database.
	 *
	 * @param organizationCode the organization code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByOrganizationCode(String organizationCode)
		throws NoSuchDmGtOrganizationException, SystemException {
		DmGtOrganization dmGtOrganization = findByOrganizationCode(organizationCode);

		remove(dmGtOrganization);
	}

	/**
	 * Removes all the dm gt organizations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGtOrganization dmGtOrganization : findAll()) {
			remove(dmGtOrganization);
		}
	}

	/**
	 * Returns the number of dm gt organizations where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the number of matching dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByOrganizationCode(String organizationCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { organizationCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTORGANIZATION_WHERE);

			if (organizationCode == null) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
			}
			else {
				if (organizationCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (organizationCode != null) {
					qPos.add(organizationCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm gt organizations.
	 *
	 * @return the number of dm gt organizations
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGTORGANIZATION);

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
	 * Initializes the dm gt organization persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmGtOrganization")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtOrganization>> listenersList = new ArrayList<ModelListener<DmGtOrganization>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtOrganization>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtOrganizationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DmCertificatePersistence.class)
	protected DmCertificatePersistence dmCertificatePersistence;
	@BeanReference(type = DmGTBusinessTypePersistence.class)
	protected DmGTBusinessTypePersistence dmGTBusinessTypePersistence;
	@BeanReference(type = DmGTFunctionTypePersistence.class)
	protected DmGTFunctionTypePersistence dmGTFunctionTypePersistence;
	@BeanReference(type = DmGtOrganizationPersistence.class)
	protected DmGtOrganizationPersistence dmGtOrganizationPersistence;
	@BeanReference(type = DmGtReportCategoryPersistence.class)
	protected DmGtReportCategoryPersistence dmGtReportCategoryPersistence;
	@BeanReference(type = DmGtReportTemplatePersistence.class)
	protected DmGtReportTemplatePersistence dmGtReportTemplatePersistence;
	@BeanReference(type = DmGtRouteConfigPersistence.class)
	protected DmGtRouteConfigPersistence dmGtRouteConfigPersistence;
	@BeanReference(type = DmGTShipPositionPersistence.class)
	protected DmGTShipPositionPersistence dmGTShipPositionPersistence;
	@BeanReference(type = DmGtStatusPersistence.class)
	protected DmGtStatusPersistence dmGtStatusPersistence;
	@BeanReference(type = DmGtVersionPersistence.class)
	protected DmGtVersionPersistence dmGtVersionPersistence;
	@BeanReference(type = DmHistoryMinistryPersistence.class)
	protected DmHistoryMinistryPersistence dmHistoryMinistryPersistence;
	@BeanReference(type = DmMinistryPersistence.class)
	protected DmMinistryPersistence dmMinistryPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DMGTORGANIZATION = "SELECT dmGtOrganization FROM DmGtOrganization dmGtOrganization";
	private static final String _SQL_SELECT_DMGTORGANIZATION_WHERE = "SELECT dmGtOrganization FROM DmGtOrganization dmGtOrganization WHERE ";
	private static final String _SQL_COUNT_DMGTORGANIZATION = "SELECT COUNT(dmGtOrganization) FROM DmGtOrganization dmGtOrganization";
	private static final String _SQL_COUNT_DMGTORGANIZATION_WHERE = "SELECT COUNT(dmGtOrganization) FROM DmGtOrganization dmGtOrganization WHERE ";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1 =
		"dmGtOrganization.organizationCode IS NULL";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2 =
		"dmGtOrganization.organizationCode = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3 =
		"(dmGtOrganization.organizationCode IS NULL OR dmGtOrganization.organizationCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtOrganization.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtOrganization exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGtOrganization exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtOrganizationPersistenceImpl.class);
	private static DmGtOrganization _nullDmGtOrganization = new DmGtOrganizationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtOrganization> toCacheModel() {
				return _nullDmGtOrganizationCacheModel;
			}
		};

	private static CacheModel<DmGtOrganization> _nullDmGtOrganizationCacheModel = new CacheModel<DmGtOrganization>() {
			public DmGtOrganization toEntityModel() {
				return _nullDmGtOrganization;
			}
		};
}