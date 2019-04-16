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

import vn.gt.dao.noticeandmessage.NoSuchModifyException;
import vn.gt.dao.noticeandmessage.model.Modify;
import vn.gt.dao.noticeandmessage.model.impl.ModifyImpl;
import vn.gt.dao.noticeandmessage.model.impl.ModifyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the modify service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ModifyPersistence
 * @see ModifyUtil
 * @generated
 */
public class ModifyPersistenceImpl extends BasePersistenceImpl<Modify>
	implements ModifyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ModifyUtil} to access the modify persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ModifyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyModelImpl.FINDER_CACHE_ENABLED, ModifyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyModelImpl.FINDER_CACHE_ENABLED, ModifyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the modify in the entity cache if it is enabled.
	 *
	 * @param modify the modify
	 */
	public void cacheResult(Modify modify) {
		EntityCacheUtil.putResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyImpl.class, modify.getPrimaryKey(), modify);

		modify.resetOriginalValues();
	}

	/**
	 * Caches the modifies in the entity cache if it is enabled.
	 *
	 * @param modifies the modifies
	 */
	public void cacheResult(List<Modify> modifies) {
		for (Modify modify : modifies) {
			if (EntityCacheUtil.getResult(
						ModifyModelImpl.ENTITY_CACHE_ENABLED, ModifyImpl.class,
						modify.getPrimaryKey()) == null) {
				cacheResult(modify);
			}
			else {
				modify.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all modifies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ModifyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ModifyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the modify.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Modify modify) {
		EntityCacheUtil.removeResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyImpl.class, modify.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Modify> modifies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Modify modify : modifies) {
			EntityCacheUtil.removeResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
				ModifyImpl.class, modify.getPrimaryKey());
		}
	}

	/**
	 * Creates a new modify with the primary key. Does not add the modify to the database.
	 *
	 * @param id the primary key for the new modify
	 * @return the new modify
	 */
	public Modify create(long id) {
		Modify modify = new ModifyImpl();

		modify.setNew(true);
		modify.setPrimaryKey(id);

		return modify;
	}

	/**
	 * Removes the modify with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the modify
	 * @return the modify that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchModifyException if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Modify remove(long id) throws NoSuchModifyException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the modify with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the modify
	 * @return the modify that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchModifyException if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify remove(Serializable primaryKey)
		throws NoSuchModifyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Modify modify = (Modify)session.get(ModifyImpl.class, primaryKey);

			if (modify == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchModifyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(modify);
		}
		catch (NoSuchModifyException nsee) {
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
	protected Modify removeImpl(Modify modify) throws SystemException {
		modify = toUnwrappedModel(modify);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, modify);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(modify);

		return modify;
	}

	@Override
	public Modify updateImpl(vn.gt.dao.noticeandmessage.model.Modify modify,
		boolean merge) throws SystemException {
		modify = toUnwrappedModel(modify);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, modify, merge);

			modify.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyImpl.class, modify.getPrimaryKey(), modify);

		return modify;
	}

	protected Modify toUnwrappedModel(Modify modify) {
		if (modify instanceof ModifyImpl) {
			return modify;
		}

		ModifyImpl modifyImpl = new ModifyImpl();

		modifyImpl.setNew(modify.isNew());
		modifyImpl.setPrimaryKey(modify.getPrimaryKey());

		modifyImpl.setId(modify.getId());
		modifyImpl.setModifyCode(modify.getModifyCode());
		modifyImpl.setModifyDesc(modify.getModifyDesc());
		modifyImpl.setOrganization(modify.getOrganization());
		modifyImpl.setDivision(modify.getDivision());
		modifyImpl.setName(modify.getName());
		modifyImpl.setModifyDate(modify.getModifyDate());
		modifyImpl.setDocumentName(modify.getDocumentName());
		modifyImpl.setDocumentYear(modify.getDocumentYear());

		return modifyImpl;
	}

	/**
	 * Returns the modify with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the modify
	 * @return the modify
	 * @throws com.liferay.portal.NoSuchModelException if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the modify with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchModifyException} if it could not be found.
	 *
	 * @param id the primary key of the modify
	 * @return the modify
	 * @throws vn.gt.dao.noticeandmessage.NoSuchModifyException if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Modify findByPrimaryKey(long id)
		throws NoSuchModifyException, SystemException {
		Modify modify = fetchByPrimaryKey(id);

		if (modify == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchModifyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return modify;
	}

	/**
	 * Returns the modify with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the modify
	 * @return the modify, or <code>null</code> if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the modify with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the modify
	 * @return the modify, or <code>null</code> if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Modify fetchByPrimaryKey(long id) throws SystemException {
		Modify modify = (Modify)EntityCacheUtil.getResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
				ModifyImpl.class, id);

		if (modify == _nullModify) {
			return null;
		}

		if (modify == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				modify = (Modify)session.get(ModifyImpl.class, Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (modify != null) {
					cacheResult(modify);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
						ModifyImpl.class, id, _nullModify);
				}

				closeSession(session);
			}
		}

		return modify;
	}

	/**
	 * Returns all the modifies.
	 *
	 * @return the modifies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Modify> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the modifies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of modifies
	 * @param end the upper bound of the range of modifies (not inclusive)
	 * @return the range of modifies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Modify> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the modifies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of modifies
	 * @param end the upper bound of the range of modifies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of modifies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Modify> findAll(int start, int end,
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

		List<Modify> list = (List<Modify>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MODIFY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MODIFY.concat(ModifyModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Modify>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Modify>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the modifies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Modify modify : findAll()) {
			remove(modify);
		}
	}

	/**
	 * Returns the number of modifies.
	 *
	 * @return the number of modifies
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MODIFY);

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
	 * Initializes the modify persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.Modify")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Modify>> listenersList = new ArrayList<ModelListener<Modify>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Modify>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ModifyImpl.class.getName());
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
	private static final String _SQL_SELECT_MODIFY = "SELECT modify FROM Modify modify";
	private static final String _SQL_COUNT_MODIFY = "SELECT COUNT(modify) FROM Modify modify";
	private static final String _ORDER_BY_ENTITY_ALIAS = "modify.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Modify exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ModifyPersistenceImpl.class);
	private static Modify _nullModify = new ModifyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Modify> toCacheModel() {
				return _nullModifyCacheModel;
			}
		};

	private static CacheModel<Modify> _nullModifyCacheModel = new CacheModel<Modify>() {
			public Modify toEntityModel() {
				return _nullModify;
			}
		};
}