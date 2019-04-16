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

import vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException;
import vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel;
import vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderChanelImpl;
import vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderChanelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the issue shifting order chanel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueShiftingOrderChanelPersistence
 * @see IssueShiftingOrderChanelUtil
 * @generated
 */
public class IssueShiftingOrderChanelPersistenceImpl extends BasePersistenceImpl<IssueShiftingOrderChanel>
	implements IssueShiftingOrderChanelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssueShiftingOrderChanelUtil} to access the issue shifting order chanel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssueShiftingOrderChanelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIFTINGORDERID =
		new FinderPath(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderChanelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByShiftingOrderId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIFTINGORDERID =
		new FinderPath(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderChanelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByShiftingOrderId",
			new String[] { Long.class.getName() },
			IssueShiftingOrderChanelModelImpl.SHIFTINGORDERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIFTINGORDERID = new FinderPath(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByShiftingOrderId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderChanelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderChanelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the issue shifting order chanel in the entity cache if it is enabled.
	 *
	 * @param issueShiftingOrderChanel the issue shifting order chanel
	 */
	public void cacheResult(IssueShiftingOrderChanel issueShiftingOrderChanel) {
		EntityCacheUtil.putResult(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelImpl.class,
			issueShiftingOrderChanel.getPrimaryKey(), issueShiftingOrderChanel);

		issueShiftingOrderChanel.resetOriginalValues();
	}

	/**
	 * Caches the issue shifting order chanels in the entity cache if it is enabled.
	 *
	 * @param issueShiftingOrderChanels the issue shifting order chanels
	 */
	public void cacheResult(
		List<IssueShiftingOrderChanel> issueShiftingOrderChanels) {
		for (IssueShiftingOrderChanel issueShiftingOrderChanel : issueShiftingOrderChanels) {
			if (EntityCacheUtil.getResult(
						IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
						IssueShiftingOrderChanelImpl.class,
						issueShiftingOrderChanel.getPrimaryKey()) == null) {
				cacheResult(issueShiftingOrderChanel);
			}
			else {
				issueShiftingOrderChanel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue shifting order chanels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssueShiftingOrderChanelImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssueShiftingOrderChanelImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue shifting order chanel.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssueShiftingOrderChanel issueShiftingOrderChanel) {
		EntityCacheUtil.removeResult(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelImpl.class,
			issueShiftingOrderChanel.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<IssueShiftingOrderChanel> issueShiftingOrderChanels) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssueShiftingOrderChanel issueShiftingOrderChanel : issueShiftingOrderChanels) {
			EntityCacheUtil.removeResult(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
				IssueShiftingOrderChanelImpl.class,
				issueShiftingOrderChanel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new issue shifting order chanel with the primary key. Does not add the issue shifting order chanel to the database.
	 *
	 * @param issueShiftingOrderChanelPK the primary key for the new issue shifting order chanel
	 * @return the new issue shifting order chanel
	 */
	public IssueShiftingOrderChanel create(
		IssueShiftingOrderChanelPK issueShiftingOrderChanelPK) {
		IssueShiftingOrderChanel issueShiftingOrderChanel = new IssueShiftingOrderChanelImpl();

		issueShiftingOrderChanel.setNew(true);
		issueShiftingOrderChanel.setPrimaryKey(issueShiftingOrderChanelPK);

		return issueShiftingOrderChanel;
	}

	/**
	 * Removes the issue shifting order chanel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issueShiftingOrderChanelPK the primary key of the issue shifting order chanel
	 * @return the issue shifting order chanel that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a issue shifting order chanel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueShiftingOrderChanel remove(
		IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws NoSuchIssueShiftingOrderChanelException, SystemException {
		return remove((Serializable)issueShiftingOrderChanelPK);
	}

	/**
	 * Removes the issue shifting order chanel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue shifting order chanel
	 * @return the issue shifting order chanel that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a issue shifting order chanel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrderChanel remove(Serializable primaryKey)
		throws NoSuchIssueShiftingOrderChanelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssueShiftingOrderChanel issueShiftingOrderChanel = (IssueShiftingOrderChanel)session.get(IssueShiftingOrderChanelImpl.class,
					primaryKey);

			if (issueShiftingOrderChanel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssueShiftingOrderChanelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issueShiftingOrderChanel);
		}
		catch (NoSuchIssueShiftingOrderChanelException nsee) {
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
	protected IssueShiftingOrderChanel removeImpl(
		IssueShiftingOrderChanel issueShiftingOrderChanel)
		throws SystemException {
		issueShiftingOrderChanel = toUnwrappedModel(issueShiftingOrderChanel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, issueShiftingOrderChanel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(issueShiftingOrderChanel);

		return issueShiftingOrderChanel;
	}

	@Override
	public IssueShiftingOrderChanel updateImpl(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel issueShiftingOrderChanel,
		boolean merge) throws SystemException {
		issueShiftingOrderChanel = toUnwrappedModel(issueShiftingOrderChanel);

		boolean isNew = issueShiftingOrderChanel.isNew();

		IssueShiftingOrderChanelModelImpl issueShiftingOrderChanelModelImpl = (IssueShiftingOrderChanelModelImpl)issueShiftingOrderChanel;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, issueShiftingOrderChanel, merge);

			issueShiftingOrderChanel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IssueShiftingOrderChanelModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((issueShiftingOrderChanelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIFTINGORDERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(issueShiftingOrderChanelModelImpl.getOriginalShiftingOrderId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIFTINGORDERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIFTINGORDERID,
					args);

				args = new Object[] {
						Long.valueOf(issueShiftingOrderChanelModelImpl.getShiftingOrderId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIFTINGORDERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIFTINGORDERID,
					args);
			}
		}

		EntityCacheUtil.putResult(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderChanelImpl.class,
			issueShiftingOrderChanel.getPrimaryKey(), issueShiftingOrderChanel);

		return issueShiftingOrderChanel;
	}

	protected IssueShiftingOrderChanel toUnwrappedModel(
		IssueShiftingOrderChanel issueShiftingOrderChanel) {
		if (issueShiftingOrderChanel instanceof IssueShiftingOrderChanelImpl) {
			return issueShiftingOrderChanel;
		}

		IssueShiftingOrderChanelImpl issueShiftingOrderChanelImpl = new IssueShiftingOrderChanelImpl();

		issueShiftingOrderChanelImpl.setNew(issueShiftingOrderChanel.isNew());
		issueShiftingOrderChanelImpl.setPrimaryKey(issueShiftingOrderChanel.getPrimaryKey());

		issueShiftingOrderChanelImpl.setShiftingOrderId(issueShiftingOrderChanel.getShiftingOrderId());
		issueShiftingOrderChanelImpl.setChanelCode(issueShiftingOrderChanel.getChanelCode());
		issueShiftingOrderChanelImpl.setChanelName(issueShiftingOrderChanel.getChanelName());
		issueShiftingOrderChanelImpl.setOrder(issueShiftingOrderChanel.getOrder());

		return issueShiftingOrderChanelImpl;
	}

	/**
	 * Returns the issue shifting order chanel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue shifting order chanel
	 * @return the issue shifting order chanel
	 * @throws com.liferay.portal.NoSuchModelException if a issue shifting order chanel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrderChanel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((IssueShiftingOrderChanelPK)primaryKey);
	}

	/**
	 * Returns the issue shifting order chanel with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException} if it could not be found.
	 *
	 * @param issueShiftingOrderChanelPK the primary key of the issue shifting order chanel
	 * @return the issue shifting order chanel
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a issue shifting order chanel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueShiftingOrderChanel findByPrimaryKey(
		IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws NoSuchIssueShiftingOrderChanelException, SystemException {
		IssueShiftingOrderChanel issueShiftingOrderChanel = fetchByPrimaryKey(issueShiftingOrderChanelPK);

		if (issueShiftingOrderChanel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					issueShiftingOrderChanelPK);
			}

			throw new NoSuchIssueShiftingOrderChanelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				issueShiftingOrderChanelPK);
		}

		return issueShiftingOrderChanel;
	}

	/**
	 * Returns the issue shifting order chanel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue shifting order chanel
	 * @return the issue shifting order chanel, or <code>null</code> if a issue shifting order chanel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrderChanel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((IssueShiftingOrderChanelPK)primaryKey);
	}

	/**
	 * Returns the issue shifting order chanel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issueShiftingOrderChanelPK the primary key of the issue shifting order chanel
	 * @return the issue shifting order chanel, or <code>null</code> if a issue shifting order chanel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueShiftingOrderChanel fetchByPrimaryKey(
		IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws SystemException {
		IssueShiftingOrderChanel issueShiftingOrderChanel = (IssueShiftingOrderChanel)EntityCacheUtil.getResult(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
				IssueShiftingOrderChanelImpl.class, issueShiftingOrderChanelPK);

		if (issueShiftingOrderChanel == _nullIssueShiftingOrderChanel) {
			return null;
		}

		if (issueShiftingOrderChanel == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				issueShiftingOrderChanel = (IssueShiftingOrderChanel)session.get(IssueShiftingOrderChanelImpl.class,
						issueShiftingOrderChanelPK);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (issueShiftingOrderChanel != null) {
					cacheResult(issueShiftingOrderChanel);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(IssueShiftingOrderChanelModelImpl.ENTITY_CACHE_ENABLED,
						IssueShiftingOrderChanelImpl.class,
						issueShiftingOrderChanelPK,
						_nullIssueShiftingOrderChanel);
				}

				closeSession(session);
			}
		}

		return issueShiftingOrderChanel;
	}

	/**
	 * Returns all the issue shifting order chanels where shiftingOrderId = &#63;.
	 *
	 * @param shiftingOrderId the shifting order ID
	 * @return the matching issue shifting order chanels
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueShiftingOrderChanel> findByShiftingOrderId(
		long shiftingOrderId) throws SystemException {
		return findByShiftingOrderId(shiftingOrderId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue shifting order chanels where shiftingOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shiftingOrderId the shifting order ID
	 * @param start the lower bound of the range of issue shifting order chanels
	 * @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	 * @return the range of matching issue shifting order chanels
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueShiftingOrderChanel> findByShiftingOrderId(
		long shiftingOrderId, int start, int end) throws SystemException {
		return findByShiftingOrderId(shiftingOrderId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue shifting order chanels where shiftingOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shiftingOrderId the shifting order ID
	 * @param start the lower bound of the range of issue shifting order chanels
	 * @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue shifting order chanels
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueShiftingOrderChanel> findByShiftingOrderId(
		long shiftingOrderId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIFTINGORDERID;
			finderArgs = new Object[] { shiftingOrderId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIFTINGORDERID;
			finderArgs = new Object[] {
					shiftingOrderId,
					
					start, end, orderByComparator
				};
		}

		List<IssueShiftingOrderChanel> list = (List<IssueShiftingOrderChanel>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_ISSUESHIFTINGORDERCHANEL_WHERE);

			query.append(_FINDER_COLUMN_SHIFTINGORDERID_SHIFTINGORDERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IssueShiftingOrderChanelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(shiftingOrderId);

				list = (List<IssueShiftingOrderChanel>)QueryUtil.list(q,
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
	 * Returns the first issue shifting order chanel in the ordered set where shiftingOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shiftingOrderId the shifting order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order chanel
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a matching issue shifting order chanel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueShiftingOrderChanel findByShiftingOrderId_First(
		long shiftingOrderId, OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderChanelException, SystemException {
		List<IssueShiftingOrderChanel> list = findByShiftingOrderId(shiftingOrderId,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shiftingOrderId=");
			msg.append(shiftingOrderId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueShiftingOrderChanelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last issue shifting order chanel in the ordered set where shiftingOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param shiftingOrderId the shifting order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order chanel
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a matching issue shifting order chanel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueShiftingOrderChanel findByShiftingOrderId_Last(
		long shiftingOrderId, OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderChanelException, SystemException {
		int count = countByShiftingOrderId(shiftingOrderId);

		List<IssueShiftingOrderChanel> list = findByShiftingOrderId(shiftingOrderId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("shiftingOrderId=");
			msg.append(shiftingOrderId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueShiftingOrderChanelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the issue shifting order chanels before and after the current issue shifting order chanel in the ordered set where shiftingOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param issueShiftingOrderChanelPK the primary key of the current issue shifting order chanel
	 * @param shiftingOrderId the shifting order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue shifting order chanel
	 * @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a issue shifting order chanel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IssueShiftingOrderChanel[] findByShiftingOrderId_PrevAndNext(
		IssueShiftingOrderChanelPK issueShiftingOrderChanelPK,
		long shiftingOrderId, OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderChanelException, SystemException {
		IssueShiftingOrderChanel issueShiftingOrderChanel = findByPrimaryKey(issueShiftingOrderChanelPK);

		Session session = null;

		try {
			session = openSession();

			IssueShiftingOrderChanel[] array = new IssueShiftingOrderChanelImpl[3];

			array[0] = getByShiftingOrderId_PrevAndNext(session,
					issueShiftingOrderChanel, shiftingOrderId,
					orderByComparator, true);

			array[1] = issueShiftingOrderChanel;

			array[2] = getByShiftingOrderId_PrevAndNext(session,
					issueShiftingOrderChanel, shiftingOrderId,
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

	protected IssueShiftingOrderChanel getByShiftingOrderId_PrevAndNext(
		Session session, IssueShiftingOrderChanel issueShiftingOrderChanel,
		long shiftingOrderId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUESHIFTINGORDERCHANEL_WHERE);

		query.append(_FINDER_COLUMN_SHIFTINGORDERID_SHIFTINGORDERID_2);

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
			query.append(IssueShiftingOrderChanelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(shiftingOrderId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueShiftingOrderChanel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueShiftingOrderChanel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the issue shifting order chanels.
	 *
	 * @return the issue shifting order chanels
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueShiftingOrderChanel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue shifting order chanels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue shifting order chanels
	 * @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	 * @return the range of issue shifting order chanels
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueShiftingOrderChanel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue shifting order chanels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue shifting order chanels
	 * @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue shifting order chanels
	 * @throws SystemException if a system exception occurred
	 */
	public List<IssueShiftingOrderChanel> findAll(int start, int end,
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

		List<IssueShiftingOrderChanel> list = (List<IssueShiftingOrderChanel>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUESHIFTINGORDERCHANEL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUESHIFTINGORDERCHANEL.concat(IssueShiftingOrderChanelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<IssueShiftingOrderChanel>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<IssueShiftingOrderChanel>)QueryUtil.list(q,
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
	 * Removes all the issue shifting order chanels where shiftingOrderId = &#63; from the database.
	 *
	 * @param shiftingOrderId the shifting order ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByShiftingOrderId(long shiftingOrderId)
		throws SystemException {
		for (IssueShiftingOrderChanel issueShiftingOrderChanel : findByShiftingOrderId(
				shiftingOrderId)) {
			remove(issueShiftingOrderChanel);
		}
	}

	/**
	 * Removes all the issue shifting order chanels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (IssueShiftingOrderChanel issueShiftingOrderChanel : findAll()) {
			remove(issueShiftingOrderChanel);
		}
	}

	/**
	 * Returns the number of issue shifting order chanels where shiftingOrderId = &#63;.
	 *
	 * @param shiftingOrderId the shifting order ID
	 * @return the number of matching issue shifting order chanels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByShiftingOrderId(long shiftingOrderId)
		throws SystemException {
		Object[] finderArgs = new Object[] { shiftingOrderId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SHIFTINGORDERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUESHIFTINGORDERCHANEL_WHERE);

			query.append(_FINDER_COLUMN_SHIFTINGORDERID_SHIFTINGORDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(shiftingOrderId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SHIFTINGORDERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of issue shifting order chanels.
	 *
	 * @return the number of issue shifting order chanels
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISSUESHIFTINGORDERCHANEL);

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
	 * Initializes the issue shifting order chanel persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssueShiftingOrderChanel>> listenersList = new ArrayList<ModelListener<IssueShiftingOrderChanel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssueShiftingOrderChanel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssueShiftingOrderChanelImpl.class.getName());
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
	private static final String _SQL_SELECT_ISSUESHIFTINGORDERCHANEL = "SELECT issueShiftingOrderChanel FROM IssueShiftingOrderChanel issueShiftingOrderChanel";
	private static final String _SQL_SELECT_ISSUESHIFTINGORDERCHANEL_WHERE = "SELECT issueShiftingOrderChanel FROM IssueShiftingOrderChanel issueShiftingOrderChanel WHERE ";
	private static final String _SQL_COUNT_ISSUESHIFTINGORDERCHANEL = "SELECT COUNT(issueShiftingOrderChanel) FROM IssueShiftingOrderChanel issueShiftingOrderChanel";
	private static final String _SQL_COUNT_ISSUESHIFTINGORDERCHANEL_WHERE = "SELECT COUNT(issueShiftingOrderChanel) FROM IssueShiftingOrderChanel issueShiftingOrderChanel WHERE ";
	private static final String _FINDER_COLUMN_SHIFTINGORDERID_SHIFTINGORDERID_2 =
		"issueShiftingOrderChanel.id.shiftingOrderId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issueShiftingOrderChanel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssueShiftingOrderChanel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssueShiftingOrderChanel exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssueShiftingOrderChanelPersistenceImpl.class);
	private static IssueShiftingOrderChanel _nullIssueShiftingOrderChanel = new IssueShiftingOrderChanelImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssueShiftingOrderChanel> toCacheModel() {
				return _nullIssueShiftingOrderChanelCacheModel;
			}
		};

	private static CacheModel<IssueShiftingOrderChanel> _nullIssueShiftingOrderChanelCacheModel =
		new CacheModel<IssueShiftingOrderChanel>() {
			public IssueShiftingOrderChanel toEntityModel() {
				return _nullIssueShiftingOrderChanel;
			}
		};
}