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

import vn.gt.dao.danhmuc.NoSuchDmEnterriseException;
import vn.gt.dao.danhmuc.model.DmEnterrise;
import vn.gt.dao.danhmuc.model.impl.DmEnterriseImpl;
import vn.gt.dao.danhmuc.model.impl.DmEnterriseModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm enterrise service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmEnterrisePersistence
 * @see DmEnterriseUtil
 * @generated
 */
public class DmEnterrisePersistenceImpl extends BasePersistenceImpl<DmEnterrise>
	implements DmEnterrisePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmEnterriseUtil} to access the dm enterrise persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmEnterriseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTERPRISECODE =
		new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, DmEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEnterpriseCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE =
		new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, DmEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEnterpriseCode",
			new String[] { String.class.getName() },
			DmEnterriseModelImpl.ENTERPRISECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTERPRISECODE = new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEnterpriseCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTERPRISETAXCODE =
		new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, DmEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEnterpriseTaxCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE =
		new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, DmEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEnterpriseTaxCode", new String[] { String.class.getName() },
			DmEnterriseModelImpl.ENTERPRISETAXCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE = new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEnterpriseTaxCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, DmEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, DmEnterriseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm enterrise in the entity cache if it is enabled.
	 *
	 * @param dmEnterrise the dm enterrise
	 */
	public void cacheResult(DmEnterrise dmEnterrise) {
		EntityCacheUtil.putResult(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseImpl.class, dmEnterrise.getPrimaryKey(), dmEnterrise);

		dmEnterrise.resetOriginalValues();
	}

	/**
	 * Caches the dm enterrises in the entity cache if it is enabled.
	 *
	 * @param dmEnterrises the dm enterrises
	 */
	public void cacheResult(List<DmEnterrise> dmEnterrises) {
		for (DmEnterrise dmEnterrise : dmEnterrises) {
			if (EntityCacheUtil.getResult(
						DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
						DmEnterriseImpl.class, dmEnterrise.getPrimaryKey()) == null) {
				cacheResult(dmEnterrise);
			}
			else {
				dmEnterrise.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm enterrises.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmEnterriseImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmEnterriseImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm enterrise.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmEnterrise dmEnterrise) {
		EntityCacheUtil.removeResult(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseImpl.class, dmEnterrise.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Creates a new dm enterrise with the primary key. Does not add the dm enterrise to the database.
	 *
	 * @param id the primary key for the new dm enterrise
	 * @return the new dm enterrise
	 */
	public DmEnterrise create(int id) {
		DmEnterrise dmEnterrise = new DmEnterriseImpl();

		dmEnterrise.setNew(true);
		dmEnterrise.setPrimaryKey(id);

		return dmEnterrise;
	}

	/**
	 * Removes the dm enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm enterrise
	 * @return the dm enterrise that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmEnterrise remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Integer)primaryKey).intValue());
	}

	/**
	 * Removes the dm enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm enterrise
	 * @return the dm enterrise that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a dm enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise remove(int id)
		throws NoSuchDmEnterriseException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmEnterrise dmEnterrise = (DmEnterrise)session.get(DmEnterriseImpl.class,
					Integer.valueOf(id));

			if (dmEnterrise == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmEnterriseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmEnterrisePersistence.remove(dmEnterrise);
		}
		catch (NoSuchDmEnterriseException nsee) {
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
	 * Removes the dm enterrise from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmEnterrise the dm enterrise
	 * @return the dm enterrise that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmEnterrise remove(DmEnterrise dmEnterrise)
		throws SystemException {
		return super.remove(dmEnterrise);
	}

	@Override
	protected DmEnterrise removeImpl(DmEnterrise dmEnterrise)
		throws SystemException {
		dmEnterrise = toUnwrappedModel(dmEnterrise);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmEnterrise);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		EntityCacheUtil.removeResult(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseImpl.class, dmEnterrise.getPrimaryKey());

		return dmEnterrise;
	}

	@Override
	public DmEnterrise updateImpl(
		vn.gt.dao.danhmuc.model.DmEnterrise dmEnterrise, boolean merge)
		throws SystemException {
		dmEnterrise = toUnwrappedModel(dmEnterrise);

		boolean isNew = dmEnterrise.isNew();

		DmEnterriseModelImpl dmEnterriseModelImpl = (DmEnterriseModelImpl)dmEnterrise;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmEnterrise, merge);

			dmEnterrise.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmEnterriseModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmEnterriseModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmEnterriseModelImpl.getOriginalEnterpriseCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTERPRISECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE,
					args);

				args = new Object[] { dmEnterriseModelImpl.getEnterpriseCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTERPRISECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE,
					args);
			}

			if ((dmEnterriseModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmEnterriseModelImpl.getOriginalEnterpriseTaxCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE,
					args);

				args = new Object[] { dmEnterriseModelImpl.getEnterpriseTaxCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
			DmEnterriseImpl.class, dmEnterrise.getPrimaryKey(), dmEnterrise);

		return dmEnterrise;
	}

	protected DmEnterrise toUnwrappedModel(DmEnterrise dmEnterrise) {
		if (dmEnterrise instanceof DmEnterriseImpl) {
			return dmEnterrise;
		}

		DmEnterriseImpl dmEnterriseImpl = new DmEnterriseImpl();

		dmEnterriseImpl.setNew(dmEnterrise.isNew());
		dmEnterriseImpl.setPrimaryKey(dmEnterrise.getPrimaryKey());

		dmEnterriseImpl.setId(dmEnterrise.getId());
		dmEnterriseImpl.setEnterpriseCode(dmEnterrise.getEnterpriseCode());
		dmEnterriseImpl.setEnterpriseTaxCode(dmEnterrise.getEnterpriseTaxCode());
		dmEnterriseImpl.setEnterpriseName(dmEnterrise.getEnterpriseName());
		dmEnterriseImpl.setEnterpriseShortName(dmEnterrise.getEnterpriseShortName());
		dmEnterriseImpl.setEnterpriseForeignName(dmEnterrise.getEnterpriseForeignName());
		dmEnterriseImpl.setEnterprisePerson(dmEnterrise.getEnterprisePerson());
		dmEnterriseImpl.setEnterpriseHOAddress(dmEnterrise.getEnterpriseHOAddress());
		dmEnterriseImpl.setStateCode(dmEnterrise.getStateCode());
		dmEnterriseImpl.setCityCode(dmEnterrise.getCityCode());
		dmEnterriseImpl.setDistrictCode(dmEnterrise.getDistrictCode());
		dmEnterriseImpl.setWardCode(dmEnterrise.getWardCode());
		dmEnterriseImpl.setTelephoneNo(dmEnterrise.getTelephoneNo());
		dmEnterriseImpl.setRegistrationCode(dmEnterrise.getRegistrationCode());
		dmEnterriseImpl.setRegistrationAddress(dmEnterrise.getRegistrationAddress());
		dmEnterriseImpl.setRegistrationDate(dmEnterrise.getRegistrationDate());
		dmEnterriseImpl.setIsDelete(dmEnterrise.getIsDelete());
		dmEnterriseImpl.setMarkedAsDelete(dmEnterrise.getMarkedAsDelete());
		dmEnterriseImpl.setModifiedDate(dmEnterrise.getModifiedDate());
		dmEnterriseImpl.setRequestedDate(dmEnterrise.getRequestedDate());
		dmEnterriseImpl.setSyncVersion(dmEnterrise.getSyncVersion());
		dmEnterriseImpl.setModifiedUser(dmEnterrise.getModifiedUser());

		return dmEnterriseImpl;
	}

	/**
	 * Returns the dm enterrise with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm enterrise
	 * @return the dm enterrise
	 * @throws com.liferay.portal.NoSuchModelException if a dm enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmEnterrise findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm enterrise with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmEnterriseException} if it could not be found.
	 *
	 * @param id the primary key of the dm enterrise
	 * @return the dm enterrise
	 * @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a dm enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise findByPrimaryKey(int id)
		throws NoSuchDmEnterriseException, SystemException {
		DmEnterrise dmEnterrise = fetchByPrimaryKey(id);

		if (dmEnterrise == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmEnterriseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmEnterrise;
	}

	/**
	 * Returns the dm enterrise with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm enterrise
	 * @return the dm enterrise, or <code>null</code> if a dm enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmEnterrise fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the dm enterrise with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm enterrise
	 * @return the dm enterrise, or <code>null</code> if a dm enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise fetchByPrimaryKey(int id) throws SystemException {
		DmEnterrise dmEnterrise = (DmEnterrise)EntityCacheUtil.getResult(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
				DmEnterriseImpl.class, id);

		if (dmEnterrise == _nullDmEnterrise) {
			return null;
		}

		if (dmEnterrise == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmEnterrise = (DmEnterrise)session.get(DmEnterriseImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmEnterrise != null) {
					cacheResult(dmEnterrise);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmEnterriseModelImpl.ENTITY_CACHE_ENABLED,
						DmEnterriseImpl.class, id, _nullDmEnterrise);
				}

				closeSession(session);
			}
		}

		return dmEnterrise;
	}

	/**
	 * Returns all the dm enterrises where enterpriseCode = &#63;.
	 *
	 * @param enterpriseCode the enterprise code
	 * @return the matching dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findByEnterpriseCode(String enterpriseCode)
		throws SystemException {
		return findByEnterpriseCode(enterpriseCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm enterrises where enterpriseCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param enterpriseCode the enterprise code
	 * @param start the lower bound of the range of dm enterrises
	 * @param end the upper bound of the range of dm enterrises (not inclusive)
	 * @return the range of matching dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findByEnterpriseCode(String enterpriseCode,
		int start, int end) throws SystemException {
		return findByEnterpriseCode(enterpriseCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm enterrises where enterpriseCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param enterpriseCode the enterprise code
	 * @param start the lower bound of the range of dm enterrises
	 * @param end the upper bound of the range of dm enterrises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findByEnterpriseCode(String enterpriseCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISECODE;
			finderArgs = new Object[] { enterpriseCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTERPRISECODE;
			finderArgs = new Object[] {
					enterpriseCode,
					
					start, end, orderByComparator
				};
		}

		List<DmEnterrise> list = (List<DmEnterrise>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMENTERRISE_WHERE);

			if (enterpriseCode == null) {
				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_1);
			}
			else {
				if (enterpriseCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmEnterriseModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (enterpriseCode != null) {
					qPos.add(enterpriseCode);
				}

				list = (List<DmEnterrise>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm enterrise in the ordered set where enterpriseCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param enterpriseCode the enterprise code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm enterrise
	 * @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a matching dm enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise findByEnterpriseCode_First(String enterpriseCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmEnterriseException, SystemException {
		List<DmEnterrise> list = findByEnterpriseCode(enterpriseCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("enterpriseCode=");
			msg.append(enterpriseCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmEnterriseException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm enterrise in the ordered set where enterpriseCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param enterpriseCode the enterprise code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm enterrise
	 * @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a matching dm enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise findByEnterpriseCode_Last(String enterpriseCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmEnterriseException, SystemException {
		int count = countByEnterpriseCode(enterpriseCode);

		List<DmEnterrise> list = findByEnterpriseCode(enterpriseCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("enterpriseCode=");
			msg.append(enterpriseCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmEnterriseException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm enterrises before and after the current dm enterrise in the ordered set where enterpriseCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm enterrise
	 * @param enterpriseCode the enterprise code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm enterrise
	 * @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a dm enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise[] findByEnterpriseCode_PrevAndNext(int id,
		String enterpriseCode, OrderByComparator orderByComparator)
		throws NoSuchDmEnterriseException, SystemException {
		DmEnterrise dmEnterrise = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmEnterrise[] array = new DmEnterriseImpl[3];

			array[0] = getByEnterpriseCode_PrevAndNext(session, dmEnterrise,
					enterpriseCode, orderByComparator, true);

			array[1] = dmEnterrise;

			array[2] = getByEnterpriseCode_PrevAndNext(session, dmEnterrise,
					enterpriseCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmEnterrise getByEnterpriseCode_PrevAndNext(Session session,
		DmEnterrise dmEnterrise, String enterpriseCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMENTERRISE_WHERE);

		if (enterpriseCode == null) {
			query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_1);
		}
		else {
			if (enterpriseCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_2);
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
			query.append(DmEnterriseModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (enterpriseCode != null) {
			qPos.add(enterpriseCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmEnterrise);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmEnterrise> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm enterrises where enterpriseTaxCode = &#63;.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @return the matching dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findByEnterpriseTaxCode(String enterpriseTaxCode)
		throws SystemException {
		return findByEnterpriseTaxCode(enterpriseTaxCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm enterrises where enterpriseTaxCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param start the lower bound of the range of dm enterrises
	 * @param end the upper bound of the range of dm enterrises (not inclusive)
	 * @return the range of matching dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findByEnterpriseTaxCode(String enterpriseTaxCode,
		int start, int end) throws SystemException {
		return findByEnterpriseTaxCode(enterpriseTaxCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm enterrises where enterpriseTaxCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param start the lower bound of the range of dm enterrises
	 * @param end the upper bound of the range of dm enterrises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findByEnterpriseTaxCode(String enterpriseTaxCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTERPRISETAXCODE;
			finderArgs = new Object[] { enterpriseTaxCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTERPRISETAXCODE;
			finderArgs = new Object[] {
					enterpriseTaxCode,
					
					start, end, orderByComparator
				};
		}

		List<DmEnterrise> list = (List<DmEnterrise>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMENTERRISE_WHERE);

			if (enterpriseTaxCode == null) {
				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_1);
			}
			else {
				if (enterpriseTaxCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmEnterriseModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (enterpriseTaxCode != null) {
					qPos.add(enterpriseTaxCode);
				}

				list = (List<DmEnterrise>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm enterrise in the ordered set where enterpriseTaxCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm enterrise
	 * @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a matching dm enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise findByEnterpriseTaxCode_First(String enterpriseTaxCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmEnterriseException, SystemException {
		List<DmEnterrise> list = findByEnterpriseTaxCode(enterpriseTaxCode, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("enterpriseTaxCode=");
			msg.append(enterpriseTaxCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmEnterriseException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm enterrise in the ordered set where enterpriseTaxCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm enterrise
	 * @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a matching dm enterrise could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise findByEnterpriseTaxCode_Last(String enterpriseTaxCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmEnterriseException, SystemException {
		int count = countByEnterpriseTaxCode(enterpriseTaxCode);

		List<DmEnterrise> list = findByEnterpriseTaxCode(enterpriseTaxCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("enterpriseTaxCode=");
			msg.append(enterpriseTaxCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmEnterriseException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm enterrises before and after the current dm enterrise in the ordered set where enterpriseTaxCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm enterrise
	 * @param enterpriseTaxCode the enterprise tax code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm enterrise
	 * @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a dm enterrise with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmEnterrise[] findByEnterpriseTaxCode_PrevAndNext(int id,
		String enterpriseTaxCode, OrderByComparator orderByComparator)
		throws NoSuchDmEnterriseException, SystemException {
		DmEnterrise dmEnterrise = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmEnterrise[] array = new DmEnterriseImpl[3];

			array[0] = getByEnterpriseTaxCode_PrevAndNext(session, dmEnterrise,
					enterpriseTaxCode, orderByComparator, true);

			array[1] = dmEnterrise;

			array[2] = getByEnterpriseTaxCode_PrevAndNext(session, dmEnterrise,
					enterpriseTaxCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmEnterrise getByEnterpriseTaxCode_PrevAndNext(Session session,
		DmEnterrise dmEnterrise, String enterpriseTaxCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMENTERRISE_WHERE);

		if (enterpriseTaxCode == null) {
			query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_1);
		}
		else {
			if (enterpriseTaxCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_2);
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
			query.append(DmEnterriseModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (enterpriseTaxCode != null) {
			qPos.add(enterpriseTaxCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmEnterrise);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmEnterrise> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm enterrises.
	 *
	 * @return the dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm enterrises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm enterrises
	 * @param end the upper bound of the range of dm enterrises (not inclusive)
	 * @return the range of dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm enterrises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm enterrises
	 * @param end the upper bound of the range of dm enterrises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmEnterrise> findAll(int start, int end,
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

		List<DmEnterrise> list = (List<DmEnterrise>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMENTERRISE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMENTERRISE.concat(DmEnterriseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmEnterrise>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmEnterrise>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm enterrises where enterpriseCode = &#63; from the database.
	 *
	 * @param enterpriseCode the enterprise code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByEnterpriseCode(String enterpriseCode)
		throws SystemException {
		for (DmEnterrise dmEnterrise : findByEnterpriseCode(enterpriseCode)) {
			dmEnterrisePersistence.remove(dmEnterrise);
		}
	}

	/**
	 * Removes all the dm enterrises where enterpriseTaxCode = &#63; from the database.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByEnterpriseTaxCode(String enterpriseTaxCode)
		throws SystemException {
		for (DmEnterrise dmEnterrise : findByEnterpriseTaxCode(
				enterpriseTaxCode)) {
			dmEnterrisePersistence.remove(dmEnterrise);
		}
	}

	/**
	 * Removes all the dm enterrises from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmEnterrise dmEnterrise : findAll()) {
			dmEnterrisePersistence.remove(dmEnterrise);
		}
	}

	/**
	 * Returns the number of dm enterrises where enterpriseCode = &#63;.
	 *
	 * @param enterpriseCode the enterprise code
	 * @return the number of matching dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public int countByEnterpriseCode(String enterpriseCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { enterpriseCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ENTERPRISECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMENTERRISE_WHERE);

			if (enterpriseCode == null) {
				query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_1);
			}
			else {
				if (enterpriseCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (enterpriseCode != null) {
					qPos.add(enterpriseCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTERPRISECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm enterrises where enterpriseTaxCode = &#63;.
	 *
	 * @param enterpriseTaxCode the enterprise tax code
	 * @return the number of matching dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public int countByEnterpriseTaxCode(String enterpriseTaxCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { enterpriseTaxCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMENTERRISE_WHERE);

			if (enterpriseTaxCode == null) {
				query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_1);
			}
			else {
				if (enterpriseTaxCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (enterpriseTaxCode != null) {
					qPos.add(enterpriseTaxCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTERPRISETAXCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm enterrises.
	 *
	 * @return the number of dm enterrises
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMENTERRISE);

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
	 * Initializes the dm enterrise persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmEnterrise")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmEnterrise>> listenersList = new ArrayList<ModelListener<DmEnterrise>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmEnterrise>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmEnterriseImpl.class.getName());
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
	private static final String _SQL_SELECT_DMENTERRISE = "SELECT dmEnterrise FROM DmEnterrise dmEnterrise";
	private static final String _SQL_SELECT_DMENTERRISE_WHERE = "SELECT dmEnterrise FROM DmEnterrise dmEnterrise WHERE ";
	private static final String _SQL_COUNT_DMENTERRISE = "SELECT COUNT(dmEnterrise) FROM DmEnterrise dmEnterrise";
	private static final String _SQL_COUNT_DMENTERRISE_WHERE = "SELECT COUNT(dmEnterrise) FROM DmEnterrise dmEnterrise WHERE ";
	private static final String _FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_1 = "dmEnterrise.enterpriseCode IS NULL";
	private static final String _FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_2 = "dmEnterrise.enterpriseCode = ?";
	private static final String _FINDER_COLUMN_ENTERPRISECODE_ENTERPRISECODE_3 = "(dmEnterrise.enterpriseCode IS NULL OR dmEnterrise.enterpriseCode = ?)";
	private static final String _FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_1 =
		"dmEnterrise.enterpriseTaxCode IS NULL";
	private static final String _FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_2 =
		"dmEnterrise.enterpriseTaxCode = ?";
	private static final String _FINDER_COLUMN_ENTERPRISETAXCODE_ENTERPRISETAXCODE_3 =
		"(dmEnterrise.enterpriseTaxCode IS NULL OR dmEnterrise.enterpriseTaxCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmEnterrise.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmEnterrise exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmEnterrise exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmEnterrisePersistenceImpl.class);
	private static DmEnterrise _nullDmEnterrise = new DmEnterriseImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmEnterrise> toCacheModel() {
				return _nullDmEnterriseCacheModel;
			}
		};

	private static CacheModel<DmEnterrise> _nullDmEnterriseCacheModel = new CacheModel<DmEnterrise>() {
			public DmEnterrise toEntityModel() {
				return _nullDmEnterrise;
			}
		};
}