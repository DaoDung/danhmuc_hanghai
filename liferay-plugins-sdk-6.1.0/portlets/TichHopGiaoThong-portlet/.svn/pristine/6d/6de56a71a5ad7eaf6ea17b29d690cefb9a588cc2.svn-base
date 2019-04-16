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

import vn.gt.dao.nhapcanh.NoSuchCrewListException;
import vn.gt.dao.nhapcanh.model.CrewList;
import vn.gt.dao.nhapcanh.model.impl.CrewListImpl;
import vn.gt.dao.nhapcanh.model.impl.CrewListModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the crew list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CrewListPersistence
 * @see CrewListUtil
 * @generated
 */
public class CrewListPersistenceImpl extends BasePersistenceImpl<CrewList>
	implements CrewListPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CrewListUtil} to access the crew list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CrewListImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CrewListModelImpl.ENTITY_CACHE_ENABLED,
			CrewListModelImpl.FINDER_CACHE_ENABLED, CrewListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CrewListModelImpl.ENTITY_CACHE_ENABLED,
			CrewListModelImpl.FINDER_CACHE_ENABLED, CrewListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CrewListModelImpl.ENTITY_CACHE_ENABLED,
			CrewListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the crew list in the entity cache if it is enabled.
	 *
	 * @param crewList the crew list
	 */
	public void cacheResult(CrewList crewList) {
		EntityCacheUtil.putResult(CrewListModelImpl.ENTITY_CACHE_ENABLED,
			CrewListImpl.class, crewList.getPrimaryKey(), crewList);

		crewList.resetOriginalValues();
	}

	/**
	 * Caches the crew lists in the entity cache if it is enabled.
	 *
	 * @param crewLists the crew lists
	 */
	public void cacheResult(List<CrewList> crewLists) {
		for (CrewList crewList : crewLists) {
			if (EntityCacheUtil.getResult(
						CrewListModelImpl.ENTITY_CACHE_ENABLED,
						CrewListImpl.class, crewList.getPrimaryKey()) == null) {
				cacheResult(crewList);
			}
			else {
				crewList.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all crew lists.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CrewListImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CrewListImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the crew list.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CrewList crewList) {
		EntityCacheUtil.removeResult(CrewListModelImpl.ENTITY_CACHE_ENABLED,
			CrewListImpl.class, crewList.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Creates a new crew list with the primary key. Does not add the crew list to the database.
	 *
	 * @param id the primary key for the new crew list
	 * @return the new crew list
	 */
	public CrewList create(long id) {
		CrewList crewList = new CrewListImpl();

		crewList.setNew(true);
		crewList.setPrimaryKey(id);

		return crewList;
	}

	/**
	 * Removes the crew list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the crew list
	 * @return the crew list that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a crew list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CrewList remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the crew list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the crew list
	 * @return the crew list that was removed
	 * @throws vn.gt.dao.nhapcanh.NoSuchCrewListException if a crew list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CrewList remove(long id)
		throws NoSuchCrewListException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CrewList crewList = (CrewList)session.get(CrewListImpl.class,
					Long.valueOf(id));

			if (crewList == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchCrewListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return crewListPersistence.remove(crewList);
		}
		catch (NoSuchCrewListException nsee) {
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
	 * Removes the crew list from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crewList the crew list
	 * @return the crew list that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CrewList remove(CrewList crewList) throws SystemException {
		return super.remove(crewList);
	}

	@Override
	protected CrewList removeImpl(CrewList crewList) throws SystemException {
		crewList = toUnwrappedModel(crewList);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, crewList);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		EntityCacheUtil.removeResult(CrewListModelImpl.ENTITY_CACHE_ENABLED,
			CrewListImpl.class, crewList.getPrimaryKey());

		return crewList;
	}

	@Override
	public CrewList updateImpl(vn.gt.dao.nhapcanh.model.CrewList crewList,
		boolean merge) throws SystemException {
		crewList = toUnwrappedModel(crewList);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, crewList, merge);

			crewList.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(CrewListModelImpl.ENTITY_CACHE_ENABLED,
			CrewListImpl.class, crewList.getPrimaryKey(), crewList);

		return crewList;
	}

	protected CrewList toUnwrappedModel(CrewList crewList) {
		if (crewList instanceof CrewListImpl) {
			return crewList;
		}

		CrewListImpl crewListImpl = new CrewListImpl();

		crewListImpl.setNew(crewList.isNew());
		crewListImpl.setPrimaryKey(crewList.getPrimaryKey());

		crewListImpl.setId(crewList.getId());
		crewListImpl.setCrewCode(crewList.getCrewCode());
		crewListImpl.setDocumentNo(crewList.getDocumentNo());
		crewListImpl.setStateCode(crewList.getStateCode());
		crewListImpl.setBirthDay(crewList.getBirthDay());
		crewListImpl.setBirthPlace(crewList.getBirthPlace());
		crewListImpl.setFamilyName(crewList.getFamilyName());
		crewListImpl.setFullName(crewList.getFullName());
		crewListImpl.setGivenName(crewList.getGivenName());
		crewListImpl.setPassportNumber(crewList.getPassportNumber());
		crewListImpl.setPassportType(crewList.getPassportType());
		crewListImpl.setRankCode(crewList.getRankCode());
		crewListImpl.setCreateDate(crewList.getCreateDate());
		crewListImpl.setModifyDate(crewList.getModifyDate());

		return crewListImpl;
	}

	/**
	 * Returns the crew list with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the crew list
	 * @return the crew list
	 * @throws com.liferay.portal.NoSuchModelException if a crew list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CrewList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the crew list with the primary key or throws a {@link vn.gt.dao.nhapcanh.NoSuchCrewListException} if it could not be found.
	 *
	 * @param id the primary key of the crew list
	 * @return the crew list
	 * @throws vn.gt.dao.nhapcanh.NoSuchCrewListException if a crew list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CrewList findByPrimaryKey(long id)
		throws NoSuchCrewListException, SystemException {
		CrewList crewList = fetchByPrimaryKey(id);

		if (crewList == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchCrewListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return crewList;
	}

	/**
	 * Returns the crew list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the crew list
	 * @return the crew list, or <code>null</code> if a crew list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CrewList fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the crew list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the crew list
	 * @return the crew list, or <code>null</code> if a crew list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CrewList fetchByPrimaryKey(long id) throws SystemException {
		CrewList crewList = (CrewList)EntityCacheUtil.getResult(CrewListModelImpl.ENTITY_CACHE_ENABLED,
				CrewListImpl.class, id);

		if (crewList == _nullCrewList) {
			return null;
		}

		if (crewList == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				crewList = (CrewList)session.get(CrewListImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (crewList != null) {
					cacheResult(crewList);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(CrewListModelImpl.ENTITY_CACHE_ENABLED,
						CrewListImpl.class, id, _nullCrewList);
				}

				closeSession(session);
			}
		}

		return crewList;
	}

	/**
	 * Returns all the crew lists.
	 *
	 * @return the crew lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<CrewList> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the crew lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of crew lists
	 * @param end the upper bound of the range of crew lists (not inclusive)
	 * @return the range of crew lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<CrewList> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the crew lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of crew lists
	 * @param end the upper bound of the range of crew lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of crew lists
	 * @throws SystemException if a system exception occurred
	 */
	public List<CrewList> findAll(int start, int end,
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

		List<CrewList> list = (List<CrewList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CREWLIST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CREWLIST.concat(CrewListModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<CrewList>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<CrewList>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the crew lists from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (CrewList crewList : findAll()) {
			crewListPersistence.remove(crewList);
		}
	}

	/**
	 * Returns the number of crew lists.
	 *
	 * @return the number of crew lists
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CREWLIST);

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
	 * Initializes the crew list persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.nhapcanh.model.CrewList")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CrewList>> listenersList = new ArrayList<ModelListener<CrewList>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CrewList>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CrewListImpl.class.getName());
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
	private static final String _SQL_SELECT_CREWLIST = "SELECT crewList FROM CrewList crewList";
	private static final String _SQL_COUNT_CREWLIST = "SELECT COUNT(crewList) FROM CrewList crewList";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crewList.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CrewList exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CrewListPersistenceImpl.class);
	private static CrewList _nullCrewList = new CrewListImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CrewList> toCacheModel() {
				return _nullCrewListCacheModel;
			}
		};

	private static CacheModel<CrewList> _nullCrewListCacheModel = new CacheModel<CrewList>() {
			public CrewList toEntityModel() {
				return _nullCrewList;
			}
		};
}