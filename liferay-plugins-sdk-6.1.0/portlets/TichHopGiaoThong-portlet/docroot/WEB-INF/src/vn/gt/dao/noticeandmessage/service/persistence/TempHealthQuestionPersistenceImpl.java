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

import vn.gt.dao.noticeandmessage.NoSuchTempHealthQuestionException;
import vn.gt.dao.noticeandmessage.model.TempHealthQuestion;
import vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp health question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempHealthQuestionPersistence
 * @see TempHealthQuestionUtil
 * @generated
 */
public class TempHealthQuestionPersistenceImpl extends BasePersistenceImpl<TempHealthQuestion>
	implements TempHealthQuestionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempHealthQuestionUtil} to access the temp health question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempHealthQuestionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED,
			TempHealthQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED,
			TempHealthQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempHealthQuestionModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED,
			TempHealthQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED,
			TempHealthQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp health question in the entity cache if it is enabled.
	 *
	 * @param tempHealthQuestion the temp health question
	 */
	public void cacheResult(TempHealthQuestion tempHealthQuestion) {
		EntityCacheUtil.putResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionImpl.class, tempHealthQuestion.getPrimaryKey(),
			tempHealthQuestion);

		tempHealthQuestion.resetOriginalValues();
	}

	/**
	 * Caches the temp health questions in the entity cache if it is enabled.
	 *
	 * @param tempHealthQuestions the temp health questions
	 */
	public void cacheResult(List<TempHealthQuestion> tempHealthQuestions) {
		for (TempHealthQuestion tempHealthQuestion : tempHealthQuestions) {
			if (EntityCacheUtil.getResult(
						TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
						TempHealthQuestionImpl.class,
						tempHealthQuestion.getPrimaryKey()) == null) {
				cacheResult(tempHealthQuestion);
			}
			else {
				tempHealthQuestion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp health questions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempHealthQuestionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempHealthQuestionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp health question.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempHealthQuestion tempHealthQuestion) {
		EntityCacheUtil.removeResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionImpl.class, tempHealthQuestion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempHealthQuestion> tempHealthQuestions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempHealthQuestion tempHealthQuestion : tempHealthQuestions) {
			EntityCacheUtil.removeResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
				TempHealthQuestionImpl.class, tempHealthQuestion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp health question with the primary key. Does not add the temp health question to the database.
	 *
	 * @param id the primary key for the new temp health question
	 * @return the new temp health question
	 */
	public TempHealthQuestion create(long id) {
		TempHealthQuestion tempHealthQuestion = new TempHealthQuestionImpl();

		tempHealthQuestion.setNew(true);
		tempHealthQuestion.setPrimaryKey(id);

		return tempHealthQuestion;
	}

	/**
	 * Removes the temp health question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp health question
	 * @return the temp health question that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempHealthQuestion remove(long id)
		throws NoSuchTempHealthQuestionException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the temp health question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp health question
	 * @return the temp health question that was removed
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion remove(Serializable primaryKey)
		throws NoSuchTempHealthQuestionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempHealthQuestion tempHealthQuestion = (TempHealthQuestion)session.get(TempHealthQuestionImpl.class,
					primaryKey);

			if (tempHealthQuestion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempHealthQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempHealthQuestion);
		}
		catch (NoSuchTempHealthQuestionException nsee) {
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
	protected TempHealthQuestion removeImpl(
		TempHealthQuestion tempHealthQuestion) throws SystemException {
		tempHealthQuestion = toUnwrappedModel(tempHealthQuestion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempHealthQuestion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempHealthQuestion);

		return tempHealthQuestion;
	}

	@Override
	public TempHealthQuestion updateImpl(
		vn.gt.dao.noticeandmessage.model.TempHealthQuestion tempHealthQuestion,
		boolean merge) throws SystemException {
		tempHealthQuestion = toUnwrappedModel(tempHealthQuestion);

		boolean isNew = tempHealthQuestion.isNew();

		TempHealthQuestionModelImpl tempHealthQuestionModelImpl = (TempHealthQuestionModelImpl)tempHealthQuestion;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempHealthQuestion, merge);

			tempHealthQuestion.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempHealthQuestionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempHealthQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempHealthQuestionModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempHealthQuestionModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionImpl.class, tempHealthQuestion.getPrimaryKey(),
			tempHealthQuestion);

		return tempHealthQuestion;
	}

	protected TempHealthQuestion toUnwrappedModel(
		TempHealthQuestion tempHealthQuestion) {
		if (tempHealthQuestion instanceof TempHealthQuestionImpl) {
			return tempHealthQuestion;
		}

		TempHealthQuestionImpl tempHealthQuestionImpl = new TempHealthQuestionImpl();

		tempHealthQuestionImpl.setNew(tempHealthQuestion.isNew());
		tempHealthQuestionImpl.setPrimaryKey(tempHealthQuestion.getPrimaryKey());

		tempHealthQuestionImpl.setId(tempHealthQuestion.getId());
		tempHealthQuestionImpl.setRequestCode(tempHealthQuestion.getRequestCode());
		tempHealthQuestionImpl.setHealthQuestionCode(tempHealthQuestion.getHealthQuestionCode());
		tempHealthQuestionImpl.setPersonDied(tempHealthQuestion.getPersonDied());
		tempHealthQuestionImpl.setPersonDiedNo(tempHealthQuestion.getPersonDiedNo());
		tempHealthQuestionImpl.setPersonDiedReport(tempHealthQuestion.getPersonDiedReport());
		tempHealthQuestionImpl.setIsinfectious(tempHealthQuestion.getIsinfectious());
		tempHealthQuestionImpl.setInfectiousReport(tempHealthQuestion.getInfectiousReport());
		tempHealthQuestionImpl.setIllPassengersGreaterNomal(tempHealthQuestion.getIllPassengersGreaterNomal());
		tempHealthQuestionImpl.setIllPassengersNo(tempHealthQuestion.getIllPassengersNo());
		tempHealthQuestionImpl.setIllPersonsOnBoard(tempHealthQuestion.getIllPersonsOnBoard());
		tempHealthQuestionImpl.setIllPersonsReport(tempHealthQuestion.getIllPersonsReport());
		tempHealthQuestionImpl.setMedicalPractitionerConsulted(tempHealthQuestion.getMedicalPractitionerConsulted());
		tempHealthQuestionImpl.setMedicalTreatmentOrAdvice(tempHealthQuestion.getMedicalTreatmentOrAdvice());
		tempHealthQuestionImpl.setInfectionOrSpreadOfDisease(tempHealthQuestion.getInfectionOrSpreadOfDisease());
		tempHealthQuestionImpl.setInfectionsReport(tempHealthQuestion.getInfectionsReport());
		tempHealthQuestionImpl.setIsSanitary(tempHealthQuestion.getIsSanitary());
		tempHealthQuestionImpl.setSanitaryDes(tempHealthQuestion.getSanitaryDes());
		tempHealthQuestionImpl.setIsStowaways(tempHealthQuestion.getIsStowaways());
		tempHealthQuestionImpl.setJoinShip(tempHealthQuestion.getJoinShip());
		tempHealthQuestionImpl.setIsAnimal(tempHealthQuestion.getIsAnimal());

		return tempHealthQuestionImpl;
	}

	/**
	 * Returns the temp health question with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp health question
	 * @return the temp health question
	 * @throws com.liferay.portal.NoSuchModelException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp health question with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempHealthQuestionException} if it could not be found.
	 *
	 * @param id the primary key of the temp health question
	 * @return the temp health question
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempHealthQuestion findByPrimaryKey(long id)
		throws NoSuchTempHealthQuestionException, SystemException {
		TempHealthQuestion tempHealthQuestion = fetchByPrimaryKey(id);

		if (tempHealthQuestion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTempHealthQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tempHealthQuestion;
	}

	/**
	 * Returns the temp health question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp health question
	 * @return the temp health question, or <code>null</code> if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the temp health question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp health question
	 * @return the temp health question, or <code>null</code> if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempHealthQuestion fetchByPrimaryKey(long id)
		throws SystemException {
		TempHealthQuestion tempHealthQuestion = (TempHealthQuestion)EntityCacheUtil.getResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
				TempHealthQuestionImpl.class, id);

		if (tempHealthQuestion == _nullTempHealthQuestion) {
			return null;
		}

		if (tempHealthQuestion == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempHealthQuestion = (TempHealthQuestion)session.get(TempHealthQuestionImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempHealthQuestion != null) {
					cacheResult(tempHealthQuestion);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
						TempHealthQuestionImpl.class, id,
						_nullTempHealthQuestion);
				}

				closeSession(session);
			}
		}

		return tempHealthQuestion;
	}

	/**
	 * Returns all the temp health questions where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempHealthQuestion> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp health questions where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp health questions
	 * @param end the upper bound of the range of temp health questions (not inclusive)
	 * @return the range of matching temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempHealthQuestion> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp health questions where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp health questions
	 * @param end the upper bound of the range of temp health questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempHealthQuestion> findByRequestCode(String requestCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<TempHealthQuestion> list = (List<TempHealthQuestion>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_TEMPHEALTHQUESTION_WHERE);

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
				query.append(TempHealthQuestionModelImpl.ORDER_BY_JPQL);
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

				list = (List<TempHealthQuestion>)QueryUtil.list(q,
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
	 * Returns the first temp health question in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp health question
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempHealthQuestionException if a matching temp health question could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempHealthQuestion findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempHealthQuestionException, SystemException {
		List<TempHealthQuestion> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempHealthQuestionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last temp health question in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp health question
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempHealthQuestionException if a matching temp health question could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempHealthQuestion findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempHealthQuestionException, SystemException {
		int count = countByRequestCode(requestCode);

		List<TempHealthQuestion> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTempHealthQuestionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the temp health questions before and after the current temp health question in the ordered set where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current temp health question
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp health question
	 * @throws vn.gt.dao.noticeandmessage.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempHealthQuestion[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempHealthQuestionException, SystemException {
		TempHealthQuestion tempHealthQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempHealthQuestion[] array = new TempHealthQuestionImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempHealthQuestion, requestCode, orderByComparator, true);

			array[1] = tempHealthQuestion;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempHealthQuestion, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempHealthQuestion getByRequestCode_PrevAndNext(Session session,
		TempHealthQuestion tempHealthQuestion, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPHEALTHQUESTION_WHERE);

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
			query.append(TempHealthQuestionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempHealthQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempHealthQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp health questions.
	 *
	 * @return the temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempHealthQuestion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp health questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp health questions
	 * @param end the upper bound of the range of temp health questions (not inclusive)
	 * @return the range of temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempHealthQuestion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp health questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp health questions
	 * @param end the upper bound of the range of temp health questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempHealthQuestion> findAll(int start, int end,
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

		List<TempHealthQuestion> list = (List<TempHealthQuestion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPHEALTHQUESTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPHEALTHQUESTION.concat(TempHealthQuestionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempHealthQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempHealthQuestion>)QueryUtil.list(q,
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
	 * Removes all the temp health questions where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempHealthQuestion tempHealthQuestion : findByRequestCode(
				requestCode)) {
			remove(tempHealthQuestion);
		}
	}

	/**
	 * Removes all the temp health questions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempHealthQuestion tempHealthQuestion : findAll()) {
			remove(tempHealthQuestion);
		}
	}

	/**
	 * Returns the number of temp health questions where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRequestCode(String requestCode) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPHEALTHQUESTION_WHERE);

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
	 * Returns the number of temp health questions.
	 *
	 * @return the number of temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPHEALTHQUESTION);

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
	 * Initializes the temp health question persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.noticeandmessage.model.TempHealthQuestion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempHealthQuestion>> listenersList = new ArrayList<ModelListener<TempHealthQuestion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempHealthQuestion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempHealthQuestionImpl.class.getName());
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
	private static final String _SQL_SELECT_TEMPHEALTHQUESTION = "SELECT tempHealthQuestion FROM TempHealthQuestion tempHealthQuestion";
	private static final String _SQL_SELECT_TEMPHEALTHQUESTION_WHERE = "SELECT tempHealthQuestion FROM TempHealthQuestion tempHealthQuestion WHERE ";
	private static final String _SQL_COUNT_TEMPHEALTHQUESTION = "SELECT COUNT(tempHealthQuestion) FROM TempHealthQuestion tempHealthQuestion";
	private static final String _SQL_COUNT_TEMPHEALTHQUESTION_WHERE = "SELECT COUNT(tempHealthQuestion) FROM TempHealthQuestion tempHealthQuestion WHERE ";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempHealthQuestion.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempHealthQuestion.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempHealthQuestion.requestCode IS NULL OR tempHealthQuestion.requestCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempHealthQuestion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempHealthQuestion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempHealthQuestion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempHealthQuestionPersistenceImpl.class);
	private static TempHealthQuestion _nullTempHealthQuestion = new TempHealthQuestionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempHealthQuestion> toCacheModel() {
				return _nullTempHealthQuestionCacheModel;
			}
		};

	private static CacheModel<TempHealthQuestion> _nullTempHealthQuestionCacheModel =
		new CacheModel<TempHealthQuestion>() {
			public TempHealthQuestion toEntityModel() {
				return _nullTempHealthQuestion;
			}
		};
}