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

import vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException;
import vn.gt.dao.noticeandmessage.model.NoticeShipMessage;
import vn.gt.dao.noticeandmessage.model.impl.NoticeShipMessageImpl;
import vn.gt.dao.noticeandmessage.model.impl.NoticeShipMessageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the notice ship message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see NoticeShipMessagePersistence
 * @see NoticeShipMessageUtil
 * @generated
 */
public class NoticeShipMessagePersistenceImpl extends BasePersistenceImpl<NoticeShipMessage>
	implements NoticeShipMessagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NoticeShipMessageUtil} to access the notice ship message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NoticeShipMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			NoticeShipMessageModelImpl.FINDER_CACHE_ENABLED,
			NoticeShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			NoticeShipMessageModelImpl.FINDER_CACHE_ENABLED,
			NoticeShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			NoticeShipMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the notice ship message in the entity cache if it is enabled.
	 *
	 * @param noticeShipMessage the notice ship message
	 */
	public void cacheResult(NoticeShipMessage noticeShipMessage) {
		EntityCacheUtil.putResult(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			NoticeShipMessageImpl.class, noticeShipMessage.getPrimaryKey(),
			noticeShipMessage);

		noticeShipMessage.resetOriginalValues();
	}

	/**
	 * Caches the notice ship messages in the entity cache if it is enabled.
	 *
	 * @param noticeShipMessages the notice ship messages
	 */
	public void cacheResult(List<NoticeShipMessage> noticeShipMessages) {
		for (NoticeShipMessage noticeShipMessage : noticeShipMessages) {
			if (EntityCacheUtil.getResult(
						NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
						NoticeShipMessageImpl.class,
						noticeShipMessage.getPrimaryKey()) == null) {
				cacheResult(noticeShipMessage);
			}
			else {
				noticeShipMessage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all notice ship messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NoticeShipMessageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NoticeShipMessageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the notice ship message.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NoticeShipMessage noticeShipMessage) {
		EntityCacheUtil.removeResult(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			NoticeShipMessageImpl.class, noticeShipMessage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NoticeShipMessage> noticeShipMessages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NoticeShipMessage noticeShipMessage : noticeShipMessages) {
			EntityCacheUtil.removeResult(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
				NoticeShipMessageImpl.class, noticeShipMessage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new notice ship message with the primary key. Does not add the notice ship message to the database.
	 *
	 * @param id the primary key for the new notice ship message
	 * @return the new notice ship message
	 */
	public NoticeShipMessage create(long id) {
		NoticeShipMessage noticeShipMessage = new NoticeShipMessageImpl();

		noticeShipMessage.setNew(true);
		noticeShipMessage.setPrimaryKey(id);

		return noticeShipMessage;
	}

	/**
	 * Removes the notice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the notice ship message
	 * @return the notice ship message that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException if a notice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public NoticeShipMessage remove(long id)
		throws NoSuchNoticeShipMessageException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the notice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the notice ship message
	 * @return the notice ship message that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException if a notice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NoticeShipMessage remove(Serializable primaryKey)
		throws NoSuchNoticeShipMessageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NoticeShipMessage noticeShipMessage = (NoticeShipMessage)session.get(NoticeShipMessageImpl.class,
					primaryKey);

			if (noticeShipMessage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNoticeShipMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(noticeShipMessage);
		}
		catch (NoSuchNoticeShipMessageException nsee) {
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
	protected NoticeShipMessage removeImpl(NoticeShipMessage noticeShipMessage)
		throws SystemException {
		noticeShipMessage = toUnwrappedModel(noticeShipMessage);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, noticeShipMessage);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(noticeShipMessage);

		return noticeShipMessage;
	}

	@Override
	public NoticeShipMessage updateImpl(
		vn.gt.dao.noticeandmessage.model.NoticeShipMessage noticeShipMessage,
		boolean merge) throws SystemException {
		noticeShipMessage = toUnwrappedModel(noticeShipMessage);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, noticeShipMessage, merge);

			noticeShipMessage.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			NoticeShipMessageImpl.class, noticeShipMessage.getPrimaryKey(),
			noticeShipMessage);

		return noticeShipMessage;
	}

	protected NoticeShipMessage toUnwrappedModel(
		NoticeShipMessage noticeShipMessage) {
		if (noticeShipMessage instanceof NoticeShipMessageImpl) {
			return noticeShipMessage;
		}

		NoticeShipMessageImpl noticeShipMessageImpl = new NoticeShipMessageImpl();

		noticeShipMessageImpl.setNew(noticeShipMessage.isNew());
		noticeShipMessageImpl.setPrimaryKey(noticeShipMessage.getPrimaryKey());

		noticeShipMessageImpl.setId(noticeShipMessage.getId());
		noticeShipMessageImpl.setNoticeShipCode(noticeShipMessage.getNoticeShipCode());
		noticeShipMessageImpl.setDocumentName(noticeShipMessage.getDocumentName());
		noticeShipMessageImpl.setUserCreated(noticeShipMessage.getUserCreated());
		noticeShipMessageImpl.setConfirmTime(noticeShipMessage.getConfirmTime());
		noticeShipMessageImpl.setCallSign(noticeShipMessage.getCallSign());
		noticeShipMessageImpl.setArrivalDate(noticeShipMessage.getArrivalDate());
		noticeShipMessageImpl.setArrivalPortCode(noticeShipMessage.getArrivalPortCode());
		noticeShipMessageImpl.setPortGoingToCode(noticeShipMessage.getPortGoingToCode());
		noticeShipMessageImpl.setNameAndAddOfShipOwners(noticeShipMessage.getNameAndAddOfShipOwners());
		noticeShipMessageImpl.setClearanceHeight(noticeShipMessage.getClearanceHeight());
		noticeShipMessageImpl.setShownDraft(noticeShipMessage.getShownDraft());
		noticeShipMessageImpl.setDwt(noticeShipMessage.getDwt());
		noticeShipMessageImpl.setShipAgencyCode(noticeShipMessage.getShipAgencyCode());
		noticeShipMessageImpl.setPurposeCode(noticeShipMessage.getPurposeCode());
		noticeShipMessageImpl.setCrewNumber(noticeShipMessage.getCrewNumber());
		noticeShipMessageImpl.setPassengerNumber(noticeShipMessage.getPassengerNumber());
		noticeShipMessageImpl.setQuantityAndTypeOfCargo(noticeShipMessage.getQuantityAndTypeOfCargo());
		noticeShipMessageImpl.setOtherPersons(noticeShipMessage.getOtherPersons());
		noticeShipMessageImpl.setRemarks(noticeShipMessage.getRemarks());

		return noticeShipMessageImpl;
	}

	/**
	 * Returns the notice ship message with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the notice ship message
	 * @return the notice ship message
	 * @throws com.liferay.portal.NoSuchModelException if a notice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NoticeShipMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the notice ship message with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException} if it could not be found.
	 *
	 * @param id the primary key of the notice ship message
	 * @return the notice ship message
	 * @throws vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException if a notice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public NoticeShipMessage findByPrimaryKey(long id)
		throws NoSuchNoticeShipMessageException, SystemException {
		NoticeShipMessage noticeShipMessage = fetchByPrimaryKey(id);

		if (noticeShipMessage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchNoticeShipMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return noticeShipMessage;
	}

	/**
	 * Returns the notice ship message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the notice ship message
	 * @return the notice ship message, or <code>null</code> if a notice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NoticeShipMessage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the notice ship message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the notice ship message
	 * @return the notice ship message, or <code>null</code> if a notice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public NoticeShipMessage fetchByPrimaryKey(long id)
		throws SystemException {
		NoticeShipMessage noticeShipMessage = (NoticeShipMessage)EntityCacheUtil.getResult(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
				NoticeShipMessageImpl.class, id);

		if (noticeShipMessage == _nullNoticeShipMessage) {
			return null;
		}

		if (noticeShipMessage == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				noticeShipMessage = (NoticeShipMessage)session.get(NoticeShipMessageImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (noticeShipMessage != null) {
					cacheResult(noticeShipMessage);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(NoticeShipMessageModelImpl.ENTITY_CACHE_ENABLED,
						NoticeShipMessageImpl.class, id, _nullNoticeShipMessage);
				}

				closeSession(session);
			}
		}

		return noticeShipMessage;
	}

	/**
	 * Returns all the notice ship messages.
	 *
	 * @return the notice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<NoticeShipMessage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the notice ship messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of notice ship messages
	 * @param end the upper bound of the range of notice ship messages (not inclusive)
	 * @return the range of notice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<NoticeShipMessage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the notice ship messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of notice ship messages
	 * @param end the upper bound of the range of notice ship messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of notice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<NoticeShipMessage> findAll(int start, int end,
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

		List<NoticeShipMessage> list = (List<NoticeShipMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NOTICESHIPMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NOTICESHIPMESSAGE.concat(NoticeShipMessageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<NoticeShipMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<NoticeShipMessage>)QueryUtil.list(q,
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
	 * Removes all the notice ship messages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (NoticeShipMessage noticeShipMessage : findAll()) {
			remove(noticeShipMessage);
		}
	}

	/**
	 * Returns the number of notice ship messages.
	 *
	 * @return the number of notice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NOTICESHIPMESSAGE);

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
	 * Initializes the notice ship message persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.NoticeShipMessage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NoticeShipMessage>> listenersList = new ArrayList<ModelListener<NoticeShipMessage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NoticeShipMessage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NoticeShipMessageImpl.class.getName());
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
	private static final String _SQL_SELECT_NOTICESHIPMESSAGE = "SELECT noticeShipMessage FROM NoticeShipMessage noticeShipMessage";
	private static final String _SQL_COUNT_NOTICESHIPMESSAGE = "SELECT COUNT(noticeShipMessage) FROM NoticeShipMessage noticeShipMessage";
	private static final String _ORDER_BY_ENTITY_ALIAS = "noticeShipMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NoticeShipMessage exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NoticeShipMessagePersistenceImpl.class);
	private static NoticeShipMessage _nullNoticeShipMessage = new NoticeShipMessageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NoticeShipMessage> toCacheModel() {
				return _nullNoticeShipMessageCacheModel;
			}
		};

	private static CacheModel<NoticeShipMessage> _nullNoticeShipMessageCacheModel =
		new CacheModel<NoticeShipMessage>() {
			public NoticeShipMessage toEntityModel() {
				return _nullNoticeShipMessage;
			}
		};
}