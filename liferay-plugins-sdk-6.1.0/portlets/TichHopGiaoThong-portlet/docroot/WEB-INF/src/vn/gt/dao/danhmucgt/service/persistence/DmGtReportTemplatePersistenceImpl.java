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

import vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException;
import vn.gt.dao.danhmucgt.model.DmGtReportTemplate;
import vn.gt.dao.danhmucgt.model.impl.DmGtReportTemplateImpl;
import vn.gt.dao.danhmucgt.model.impl.DmGtReportTemplateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm gt report template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtReportTemplatePersistence
 * @see DmGtReportTemplateUtil
 * @generated
 */
public class DmGtReportTemplatePersistenceImpl extends BasePersistenceImpl<DmGtReportTemplate>
	implements DmGtReportTemplatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtReportTemplateUtil} to access the dm gt report template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtReportTemplateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_REPORTCODE = new FinderPath(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportTemplateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByReportCode", new String[] { Integer.class.getName() },
			DmGtReportTemplateModelImpl.REPORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPORTCODE = new FinderPath(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReportCode",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REPORTTYPE =
		new FinderPath(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByreportType",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORTTYPE =
		new FinderPath(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByreportType",
			new String[] { Integer.class.getName() },
			DmGtReportTemplateModelImpl.REPORTTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPORTTYPE = new FinderPath(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByreportType",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm gt report template in the entity cache if it is enabled.
	 *
	 * @param dmGtReportTemplate the dm gt report template
	 */
	public void cacheResult(DmGtReportTemplate dmGtReportTemplate) {
		EntityCacheUtil.putResult(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateImpl.class, dmGtReportTemplate.getPrimaryKey(),
			dmGtReportTemplate);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTCODE,
			new Object[] { Integer.valueOf(dmGtReportTemplate.getReportCode()) },
			dmGtReportTemplate);

		dmGtReportTemplate.resetOriginalValues();
	}

	/**
	 * Caches the dm gt report templates in the entity cache if it is enabled.
	 *
	 * @param dmGtReportTemplates the dm gt report templates
	 */
	public void cacheResult(List<DmGtReportTemplate> dmGtReportTemplates) {
		for (DmGtReportTemplate dmGtReportTemplate : dmGtReportTemplates) {
			if (EntityCacheUtil.getResult(
						DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
						DmGtReportTemplateImpl.class,
						dmGtReportTemplate.getPrimaryKey()) == null) {
				cacheResult(dmGtReportTemplate);
			}
			else {
				dmGtReportTemplate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt report templates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtReportTemplateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtReportTemplateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt report template.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtReportTemplate dmGtReportTemplate) {
		EntityCacheUtil.removeResult(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateImpl.class, dmGtReportTemplate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmGtReportTemplate);
	}

	@Override
	public void clearCache(List<DmGtReportTemplate> dmGtReportTemplates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGtReportTemplate dmGtReportTemplate : dmGtReportTemplates) {
			EntityCacheUtil.removeResult(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
				DmGtReportTemplateImpl.class, dmGtReportTemplate.getPrimaryKey());

			clearUniqueFindersCache(dmGtReportTemplate);
		}
	}

	protected void clearUniqueFindersCache(
		DmGtReportTemplate dmGtReportTemplate) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTCODE,
			new Object[] { Integer.valueOf(dmGtReportTemplate.getReportCode()) });
	}

	/**
	 * Creates a new dm gt report template with the primary key. Does not add the dm gt report template to the database.
	 *
	 * @param id the primary key for the new dm gt report template
	 * @return the new dm gt report template
	 */
	public DmGtReportTemplate create(long id) {
		DmGtReportTemplate dmGtReportTemplate = new DmGtReportTemplateImpl();

		dmGtReportTemplate.setNew(true);
		dmGtReportTemplate.setPrimaryKey(id);

		return dmGtReportTemplate;
	}

	/**
	 * Removes the dm gt report template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt report template
	 * @return the dm gt report template that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate remove(long id)
		throws NoSuchDmGtReportTemplateException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the dm gt report template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt report template
	 * @return the dm gt report template that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportTemplate remove(Serializable primaryKey)
		throws NoSuchDmGtReportTemplateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtReportTemplate dmGtReportTemplate = (DmGtReportTemplate)session.get(DmGtReportTemplateImpl.class,
					primaryKey);

			if (dmGtReportTemplate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGtReportTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGtReportTemplate);
		}
		catch (NoSuchDmGtReportTemplateException nsee) {
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
	protected DmGtReportTemplate removeImpl(
		DmGtReportTemplate dmGtReportTemplate) throws SystemException {
		dmGtReportTemplate = toUnwrappedModel(dmGtReportTemplate);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmGtReportTemplate);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmGtReportTemplate);

		return dmGtReportTemplate;
	}

	@Override
	public DmGtReportTemplate updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtReportTemplate dmGtReportTemplate,
		boolean merge) throws SystemException {
		dmGtReportTemplate = toUnwrappedModel(dmGtReportTemplate);

		boolean isNew = dmGtReportTemplate.isNew();

		DmGtReportTemplateModelImpl dmGtReportTemplateModelImpl = (DmGtReportTemplateModelImpl)dmGtReportTemplate;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmGtReportTemplate, merge);

			dmGtReportTemplate.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGtReportTemplateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmGtReportTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORTTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(dmGtReportTemplateModelImpl.getOriginalReportType())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPORTTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORTTYPE,
					args);

				args = new Object[] {
						Integer.valueOf(dmGtReportTemplateModelImpl.getReportType())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPORTTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORTTYPE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportTemplateImpl.class, dmGtReportTemplate.getPrimaryKey(),
			dmGtReportTemplate);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTCODE,
				new Object[] { Integer.valueOf(
						dmGtReportTemplate.getReportCode()) },
				dmGtReportTemplate);
		}
		else {
			if ((dmGtReportTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REPORTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(dmGtReportTemplateModelImpl.getOriginalReportCode())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPORTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTCODE,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTCODE,
					new Object[] {
						Integer.valueOf(dmGtReportTemplate.getReportCode())
					}, dmGtReportTemplate);
			}
		}

		return dmGtReportTemplate;
	}

	protected DmGtReportTemplate toUnwrappedModel(
		DmGtReportTemplate dmGtReportTemplate) {
		if (dmGtReportTemplate instanceof DmGtReportTemplateImpl) {
			return dmGtReportTemplate;
		}

		DmGtReportTemplateImpl dmGtReportTemplateImpl = new DmGtReportTemplateImpl();

		dmGtReportTemplateImpl.setNew(dmGtReportTemplate.isNew());
		dmGtReportTemplateImpl.setPrimaryKey(dmGtReportTemplate.getPrimaryKey());

		dmGtReportTemplateImpl.setId(dmGtReportTemplate.getId());
		dmGtReportTemplateImpl.setReportCode(dmGtReportTemplate.getReportCode());
		dmGtReportTemplateImpl.setReportName(dmGtReportTemplate.getReportName());
		dmGtReportTemplateImpl.setReportType(dmGtReportTemplate.getReportType());
		dmGtReportTemplateImpl.setCategory(dmGtReportTemplate.getCategory());
		dmGtReportTemplateImpl.setDescription(dmGtReportTemplate.getDescription());
		dmGtReportTemplateImpl.setIsDelete(dmGtReportTemplate.getIsDelete());
		dmGtReportTemplateImpl.setMarkedAsDelete(dmGtReportTemplate.getMarkedAsDelete());
		dmGtReportTemplateImpl.setModifiedDate(dmGtReportTemplate.getModifiedDate());
		dmGtReportTemplateImpl.setRequestedDate(dmGtReportTemplate.getRequestedDate());
		dmGtReportTemplateImpl.setSyncVersion(dmGtReportTemplate.getSyncVersion());

		return dmGtReportTemplateImpl;
	}

	/**
	 * Returns the dm gt report template with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt report template
	 * @return the dm gt report template
	 * @throws com.liferay.portal.NoSuchModelException if a dm gt report template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportTemplate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm gt report template with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt report template
	 * @return the dm gt report template
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate findByPrimaryKey(long id)
		throws NoSuchDmGtReportTemplateException, SystemException {
		DmGtReportTemplate dmGtReportTemplate = fetchByPrimaryKey(id);

		if (dmGtReportTemplate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmGtReportTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmGtReportTemplate;
	}

	/**
	 * Returns the dm gt report template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt report template
	 * @return the dm gt report template, or <code>null</code> if a dm gt report template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportTemplate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm gt report template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt report template
	 * @return the dm gt report template, or <code>null</code> if a dm gt report template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate fetchByPrimaryKey(long id)
		throws SystemException {
		DmGtReportTemplate dmGtReportTemplate = (DmGtReportTemplate)EntityCacheUtil.getResult(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
				DmGtReportTemplateImpl.class, id);

		if (dmGtReportTemplate == _nullDmGtReportTemplate) {
			return null;
		}

		if (dmGtReportTemplate == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmGtReportTemplate = (DmGtReportTemplate)session.get(DmGtReportTemplateImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmGtReportTemplate != null) {
					cacheResult(dmGtReportTemplate);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmGtReportTemplateModelImpl.ENTITY_CACHE_ENABLED,
						DmGtReportTemplateImpl.class, id,
						_nullDmGtReportTemplate);
				}

				closeSession(session);
			}
		}

		return dmGtReportTemplate;
	}

	/**
	 * Returns the dm gt report template where reportCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException} if it could not be found.
	 *
	 * @param reportCode the report code
	 * @return the matching dm gt report template
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate findByReportCode(int reportCode)
		throws NoSuchDmGtReportTemplateException, SystemException {
		DmGtReportTemplate dmGtReportTemplate = fetchByReportCode(reportCode);

		if (dmGtReportTemplate == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("reportCode=");
			msg.append(reportCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmGtReportTemplateException(msg.toString());
		}

		return dmGtReportTemplate;
	}

	/**
	 * Returns the dm gt report template where reportCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param reportCode the report code
	 * @return the matching dm gt report template, or <code>null</code> if a matching dm gt report template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate fetchByReportCode(int reportCode)
		throws SystemException {
		return fetchByReportCode(reportCode, true);
	}

	/**
	 * Returns the dm gt report template where reportCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param reportCode the report code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm gt report template, or <code>null</code> if a matching dm gt report template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate fetchByReportCode(int reportCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { reportCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPORTCODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMGTREPORTTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_REPORTCODE_REPORTCODE_2);

			query.append(DmGtReportTemplateModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reportCode);

				List<DmGtReportTemplate> list = q.list();

				result = list;

				DmGtReportTemplate dmGtReportTemplate = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTCODE,
						finderArgs, list);
				}
				else {
					dmGtReportTemplate = list.get(0);

					cacheResult(dmGtReportTemplate);

					if ((dmGtReportTemplate.getReportCode() != reportCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTCODE,
							finderArgs, dmGtReportTemplate);
					}
				}

				return dmGtReportTemplate;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTCODE,
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
				return (DmGtReportTemplate)result;
			}
		}
	}

	/**
	 * Returns all the dm gt report templates where reportType = &#63;.
	 *
	 * @param reportType the report type
	 * @return the matching dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportTemplate> findByreportType(int reportType)
		throws SystemException {
		return findByreportType(reportType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt report templates where reportType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param reportType the report type
	 * @param start the lower bound of the range of dm gt report templates
	 * @param end the upper bound of the range of dm gt report templates (not inclusive)
	 * @return the range of matching dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportTemplate> findByreportType(int reportType, int start,
		int end) throws SystemException {
		return findByreportType(reportType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt report templates where reportType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param reportType the report type
	 * @param start the lower bound of the range of dm gt report templates
	 * @param end the upper bound of the range of dm gt report templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportTemplate> findByreportType(int reportType, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORTTYPE;
			finderArgs = new Object[] { reportType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REPORTTYPE;
			finderArgs = new Object[] { reportType, start, end, orderByComparator };
		}

		List<DmGtReportTemplate> list = (List<DmGtReportTemplate>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMGTREPORTTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_REPORTTYPE_REPORTTYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmGtReportTemplateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reportType);

				list = (List<DmGtReportTemplate>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Returns the first dm gt report template in the ordered set where reportType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param reportType the report type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt report template
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate findByreportType_First(int reportType,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtReportTemplateException, SystemException {
		List<DmGtReportTemplate> list = findByreportType(reportType, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("reportType=");
			msg.append(reportType);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGtReportTemplateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm gt report template in the ordered set where reportType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param reportType the report type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt report template
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate findByreportType_Last(int reportType,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtReportTemplateException, SystemException {
		int count = countByreportType(reportType);

		List<DmGtReportTemplate> list = findByreportType(reportType, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("reportType=");
			msg.append(reportType);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmGtReportTemplateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm gt report templates before and after the current dm gt report template in the ordered set where reportType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm gt report template
	 * @param reportType the report type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm gt report template
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmGtReportTemplate[] findByreportType_PrevAndNext(long id,
		int reportType, OrderByComparator orderByComparator)
		throws NoSuchDmGtReportTemplateException, SystemException {
		DmGtReportTemplate dmGtReportTemplate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGtReportTemplate[] array = new DmGtReportTemplateImpl[3];

			array[0] = getByreportType_PrevAndNext(session, dmGtReportTemplate,
					reportType, orderByComparator, true);

			array[1] = dmGtReportTemplate;

			array[2] = getByreportType_PrevAndNext(session, dmGtReportTemplate,
					reportType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGtReportTemplate getByreportType_PrevAndNext(Session session,
		DmGtReportTemplate dmGtReportTemplate, int reportType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGTREPORTTEMPLATE_WHERE);

		query.append(_FINDER_COLUMN_REPORTTYPE_REPORTTYPE_2);

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
			query.append(DmGtReportTemplateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(reportType);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGtReportTemplate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGtReportTemplate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm gt report templates.
	 *
	 * @return the dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportTemplate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt report templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt report templates
	 * @param end the upper bound of the range of dm gt report templates (not inclusive)
	 * @return the range of dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportTemplate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt report templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt report templates
	 * @param end the upper bound of the range of dm gt report templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmGtReportTemplate> findAll(int start, int end,
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

		List<DmGtReportTemplate> list = (List<DmGtReportTemplate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTREPORTTEMPLATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTREPORTTEMPLATE.concat(DmGtReportTemplateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmGtReportTemplate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmGtReportTemplate>)QueryUtil.list(q,
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
	 * Removes the dm gt report template where reportCode = &#63; from the database.
	 *
	 * @param reportCode the report code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByReportCode(int reportCode)
		throws NoSuchDmGtReportTemplateException, SystemException {
		DmGtReportTemplate dmGtReportTemplate = findByReportCode(reportCode);

		remove(dmGtReportTemplate);
	}

	/**
	 * Removes all the dm gt report templates where reportType = &#63; from the database.
	 *
	 * @param reportType the report type
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByreportType(int reportType) throws SystemException {
		for (DmGtReportTemplate dmGtReportTemplate : findByreportType(
				reportType)) {
			remove(dmGtReportTemplate);
		}
	}

	/**
	 * Removes all the dm gt report templates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmGtReportTemplate dmGtReportTemplate : findAll()) {
			remove(dmGtReportTemplate);
		}
	}

	/**
	 * Returns the number of dm gt report templates where reportCode = &#63;.
	 *
	 * @param reportCode the report code
	 * @return the number of matching dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public int countByReportCode(int reportCode) throws SystemException {
		Object[] finderArgs = new Object[] { reportCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REPORTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTREPORTTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_REPORTCODE_REPORTCODE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reportCode);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPORTCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm gt report templates where reportType = &#63;.
	 *
	 * @param reportType the report type
	 * @return the number of matching dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public int countByreportType(int reportType) throws SystemException {
		Object[] finderArgs = new Object[] { reportType };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REPORTTYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTREPORTTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_REPORTTYPE_REPORTTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reportType);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPORTTYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm gt report templates.
	 *
	 * @return the number of dm gt report templates
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMGTREPORTTEMPLATE);

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
	 * Initializes the dm gt report template persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmGtReportTemplate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtReportTemplate>> listenersList = new ArrayList<ModelListener<DmGtReportTemplate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtReportTemplate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtReportTemplateImpl.class.getName());
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
	private static final String _SQL_SELECT_DMGTREPORTTEMPLATE = "SELECT dmGtReportTemplate FROM DmGtReportTemplate dmGtReportTemplate";
	private static final String _SQL_SELECT_DMGTREPORTTEMPLATE_WHERE = "SELECT dmGtReportTemplate FROM DmGtReportTemplate dmGtReportTemplate WHERE ";
	private static final String _SQL_COUNT_DMGTREPORTTEMPLATE = "SELECT COUNT(dmGtReportTemplate) FROM DmGtReportTemplate dmGtReportTemplate";
	private static final String _SQL_COUNT_DMGTREPORTTEMPLATE_WHERE = "SELECT COUNT(dmGtReportTemplate) FROM DmGtReportTemplate dmGtReportTemplate WHERE ";
	private static final String _FINDER_COLUMN_REPORTCODE_REPORTCODE_2 = "dmGtReportTemplate.reportCode = ?";
	private static final String _FINDER_COLUMN_REPORTTYPE_REPORTTYPE_2 = "dmGtReportTemplate.reportType = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtReportTemplate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtReportTemplate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGtReportTemplate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtReportTemplatePersistenceImpl.class);
	private static DmGtReportTemplate _nullDmGtReportTemplate = new DmGtReportTemplateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtReportTemplate> toCacheModel() {
				return _nullDmGtReportTemplateCacheModel;
			}
		};

	private static CacheModel<DmGtReportTemplate> _nullDmGtReportTemplateCacheModel =
		new CacheModel<DmGtReportTemplate>() {
			public DmGtReportTemplate toEntityModel() {
				return _nullDmGtReportTemplate;
			}
		};
}