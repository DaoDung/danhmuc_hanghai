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

import vn.gt.dao.danhmucgt.NoSuchDmCertificateException;
import vn.gt.dao.danhmucgt.model.DmCertificate;
import vn.gt.dao.danhmucgt.model.impl.DmCertificateImpl;
import vn.gt.dao.danhmucgt.model.impl.DmCertificateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmCertificatePersistence
 * @see DmCertificateUtil
 * @generated
 */
public class DmCertificatePersistenceImpl extends BasePersistenceImpl<DmCertificate>
	implements DmCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmCertificateUtil} to access the dm certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATECODE =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateCode", new String[] { String.class.getName() },
			DmCertificateModelImpl.CERTIFICATECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATECODE = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateCode", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateCodeAndCertificateName",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateCodeAndCertificateName",
			new String[] { String.class.getName(), String.class.getName() },
			DmCertificateModelImpl.CERTIFICATECODE_COLUMN_BITMASK |
			DmCertificateModelImpl.CERTIFICATENAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateCodeAndCertificateName",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_LCODE_GT =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_LCODE_GT",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_GT =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_LCODE_GT", new String[] { String.class.getName() },
			DmCertificateModelImpl.CERTIFICATECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_LCODE_GT = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_LCODE_GT",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_LCODE_LT =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_LCODE_LT",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_LT =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_LCODE_LT", new String[] { String.class.getName() },
			DmCertificateModelImpl.CERTIFICATECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_LCODE_LT = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_LCODE_LT",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm certificate in the entity cache if it is enabled.
	 *
	 * @param dmCertificate the dm certificate
	 */
	public void cacheResult(DmCertificate dmCertificate) {
		EntityCacheUtil.putResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateImpl.class, dmCertificate.getPrimaryKey(),
			dmCertificate);

		dmCertificate.resetOriginalValues();
	}

	/**
	 * Caches the dm certificates in the entity cache if it is enabled.
	 *
	 * @param dmCertificates the dm certificates
	 */
	public void cacheResult(List<DmCertificate> dmCertificates) {
		for (DmCertificate dmCertificate : dmCertificates) {
			if (EntityCacheUtil.getResult(
						DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
						DmCertificateImpl.class, dmCertificate.getPrimaryKey()) == null) {
				cacheResult(dmCertificate);
			}
			else {
				dmCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm certificates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmCertificateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmCertificateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm certificate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmCertificate dmCertificate) {
		EntityCacheUtil.removeResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateImpl.class, dmCertificate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Creates a new dm certificate with the primary key. Does not add the dm certificate to the database.
	 *
	 * @param id the primary key for the new dm certificate
	 * @return the new dm certificate
	 */
	public DmCertificate create(long id) {
		DmCertificate dmCertificate = new DmCertificateImpl();

		dmCertificate.setNew(true);
		dmCertificate.setPrimaryKey(id);

		return dmCertificate;
	}

	/**
	 * Removes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm certificate
	 * @return the dm certificate that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm certificate
	 * @return the dm certificate that was removed
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate remove(long id)
		throws NoSuchDmCertificateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmCertificate dmCertificate = (DmCertificate)session.get(DmCertificateImpl.class,
					Long.valueOf(id));

			if (dmCertificate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchDmCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return dmCertificatePersistence.remove(dmCertificate);
		}
		catch (NoSuchDmCertificateException nsee) {
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
	 * Removes the dm certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dmCertificate the dm certificate
	 * @return the dm certificate that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate remove(DmCertificate dmCertificate)
		throws SystemException {
		return super.remove(dmCertificate);
	}

	@Override
	protected DmCertificate removeImpl(DmCertificate dmCertificate)
		throws SystemException {
		dmCertificate = toUnwrappedModel(dmCertificate);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmCertificate);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		EntityCacheUtil.removeResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateImpl.class, dmCertificate.getPrimaryKey());

		return dmCertificate;
	}

	@Override
	public DmCertificate updateImpl(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate, boolean merge)
		throws SystemException {
		dmCertificate = toUnwrappedModel(dmCertificate);

		boolean isNew = dmCertificate.isNew();

		DmCertificateModelImpl dmCertificateModelImpl = (DmCertificateModelImpl)dmCertificate;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmCertificate, merge);

			dmCertificate.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmCertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmCertificateModelImpl.getOriginalCertificateCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE,
					args);

				args = new Object[] { dmCertificateModelImpl.getCertificateCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE,
					args);
			}

			if ((dmCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmCertificateModelImpl.getOriginalCertificateCode(),
						
						dmCertificateModelImpl.getOriginalCertificateName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME,
					args);

				args = new Object[] {
						dmCertificateModelImpl.getCertificateCode(),
						
						dmCertificateModelImpl.getCertificateName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME,
					args);
			}

			if ((dmCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_GT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmCertificateModelImpl.getOriginalCertificateCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_LCODE_GT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_GT,
					args);

				args = new Object[] { dmCertificateModelImpl.getCertificateCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_LCODE_GT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_GT,
					args);
			}

			if ((dmCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_LT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmCertificateModelImpl.getOriginalCertificateCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_LCODE_LT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_LT,
					args);

				args = new Object[] { dmCertificateModelImpl.getCertificateCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_LCODE_LT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_LT,
					args);
			}
		}

		EntityCacheUtil.putResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateImpl.class, dmCertificate.getPrimaryKey(),
			dmCertificate);

		return dmCertificate;
	}

	protected DmCertificate toUnwrappedModel(DmCertificate dmCertificate) {
		if (dmCertificate instanceof DmCertificateImpl) {
			return dmCertificate;
		}

		DmCertificateImpl dmCertificateImpl = new DmCertificateImpl();

		dmCertificateImpl.setNew(dmCertificate.isNew());
		dmCertificateImpl.setPrimaryKey(dmCertificate.getPrimaryKey());

		dmCertificateImpl.setId(dmCertificate.getId());
		dmCertificateImpl.setCertificateCode(dmCertificate.getCertificateCode());
		dmCertificateImpl.setCertificateName(dmCertificate.getCertificateName());
		dmCertificateImpl.setCertificateNameVN(dmCertificate.getCertificateNameVN());
		dmCertificateImpl.setCertificateOrder(dmCertificate.getCertificateOrder());
		dmCertificateImpl.setIsDelete(dmCertificate.getIsDelete());
		dmCertificateImpl.setMarkedAsDelete(dmCertificate.getMarkedAsDelete());
		dmCertificateImpl.setModifiedDate(dmCertificate.getModifiedDate());
		dmCertificateImpl.setRequestedDate(dmCertificate.getRequestedDate());
		dmCertificateImpl.setSyncVersion(dmCertificate.getSyncVersion());

		return dmCertificateImpl;
	}

	/**
	 * Returns the dm certificate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm certificate
	 * @return the dm certificate
	 * @throws com.liferay.portal.NoSuchModelException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm certificate with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the dm certificate
	 * @return the dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByPrimaryKey(long id)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = fetchByPrimaryKey(id);

		if (dmCertificate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDmCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return dmCertificate;
	}

	/**
	 * Returns the dm certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm certificate
	 * @return the dm certificate, or <code>null</code> if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm certificate
	 * @return the dm certificate, or <code>null</code> if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate fetchByPrimaryKey(long id) throws SystemException {
		DmCertificate dmCertificate = (DmCertificate)EntityCacheUtil.getResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
				DmCertificateImpl.class, id);

		if (dmCertificate == _nullDmCertificate) {
			return null;
		}

		if (dmCertificate == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmCertificate = (DmCertificate)session.get(DmCertificateImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmCertificate != null) {
					cacheResult(dmCertificate);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
						DmCertificateImpl.class, id, _nullDmCertificate);
				}

				closeSession(session);
			}
		}

		return dmCertificate;
	}

	/**
	 * Returns all the dm certificates where certificateCode = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @return the matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByCertificateCode(String certificateCode)
		throws SystemException {
		return findByCertificateCode(certificateCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm certificates where certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @return the range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByCertificateCode(String certificateCode,
		int start, int end) throws SystemException {
		return findByCertificateCode(certificateCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm certificates where certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByCertificateCode(String certificateCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE;
			finderArgs = new Object[] { certificateCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATECODE;
			finderArgs = new Object[] {
					certificateCode,
					
					start, end, orderByComparator
				};
		}

		List<DmCertificate> list = (List<DmCertificate>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_1);
			}
			else {
				if (certificateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (certificateCode != null) {
					qPos.add(certificateCode);
				}

				list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm certificate in the ordered set where certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByCertificateCode_First(String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		List<DmCertificate> list = findByCertificateCode(certificateCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateCode=");
			msg.append(certificateCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmCertificateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm certificate in the ordered set where certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByCertificateCode_Last(String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		int count = countByCertificateCode(certificateCode);

		List<DmCertificate> list = findByCertificateCode(certificateCode,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateCode=");
			msg.append(certificateCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmCertificateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm certificate
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate[] findByCertificateCode_PrevAndNext(long id,
		String certificateCode, OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmCertificate[] array = new DmCertificateImpl[3];

			array[0] = getByCertificateCode_PrevAndNext(session, dmCertificate,
					certificateCode, orderByComparator, true);

			array[1] = dmCertificate;

			array[2] = getByCertificateCode_PrevAndNext(session, dmCertificate,
					certificateCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmCertificate getByCertificateCode_PrevAndNext(Session session,
		DmCertificate dmCertificate, String certificateCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

		if (certificateCode == null) {
			query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_1);
		}
		else {
			if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_2);
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
			query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (certificateCode != null) {
			qPos.add(certificateCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @return the matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName)
		throws SystemException {
		return findByCertificateCodeAndCertificateName(certificateCode,
			certificateName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @return the range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName, int start, int end)
		throws SystemException {
		return findByCertificateCodeAndCertificateName(certificateCode,
			certificateName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME;
			finderArgs = new Object[] { certificateCode, certificateName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME;
			finderArgs = new Object[] {
					certificateCode, certificateName,
					
					start, end, orderByComparator
				};
		}

		List<DmCertificate> list = (List<DmCertificate>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_1);
			}
			else {
				if (certificateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_2);
				}
			}

			if (certificateName == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_1);
			}
			else {
				if (certificateName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (certificateCode != null) {
					qPos.add(certificateCode);
				}

				if (certificateName != null) {
					qPos.add(certificateName);
				}

				list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByCertificateCodeAndCertificateName_First(
		String certificateCode, String certificateName,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		List<DmCertificate> list = findByCertificateCodeAndCertificateName(certificateCode,
				certificateName, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateCode=");
			msg.append(certificateCode);

			msg.append(", certificateName=");
			msg.append(certificateName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmCertificateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByCertificateCodeAndCertificateName_Last(
		String certificateCode, String certificateName,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		int count = countByCertificateCodeAndCertificateName(certificateCode,
				certificateName);

		List<DmCertificate> list = findByCertificateCodeAndCertificateName(certificateCode,
				certificateName, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateCode=");
			msg.append(certificateCode);

			msg.append(", certificateName=");
			msg.append(certificateName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmCertificateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm certificate
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate[] findByCertificateCodeAndCertificateName_PrevAndNext(
		long id, String certificateCode, String certificateName,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmCertificate[] array = new DmCertificateImpl[3];

			array[0] = getByCertificateCodeAndCertificateName_PrevAndNext(session,
					dmCertificate, certificateCode, certificateName,
					orderByComparator, true);

			array[1] = dmCertificate;

			array[2] = getByCertificateCodeAndCertificateName_PrevAndNext(session,
					dmCertificate, certificateCode, certificateName,
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

	protected DmCertificate getByCertificateCodeAndCertificateName_PrevAndNext(
		Session session, DmCertificate dmCertificate, String certificateCode,
		String certificateName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

		if (certificateCode == null) {
			query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_1);
		}
		else {
			if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_2);
			}
		}

		if (certificateName == null) {
			query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_1);
		}
		else {
			if (certificateName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_2);
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
			query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (certificateCode != null) {
			qPos.add(certificateCode);
		}

		if (certificateName != null) {
			qPos.add(certificateName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm certificates where certificateCode &gt; &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @return the matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByF_LCODE_GT(String certificateCode)
		throws SystemException {
		return findByF_LCODE_GT(certificateCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm certificates where certificateCode &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @return the range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByF_LCODE_GT(String certificateCode,
		int start, int end) throws SystemException {
		return findByF_LCODE_GT(certificateCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm certificates where certificateCode &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByF_LCODE_GT(String certificateCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_GT;
			finderArgs = new Object[] { certificateCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_LCODE_GT;
			finderArgs = new Object[] {
					certificateCode,
					
					start, end, orderByComparator
				};
		}

		List<DmCertificate> list = (List<DmCertificate>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_1);
			}
			else {
				if (certificateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (certificateCode != null) {
					qPos.add(certificateCode);
				}

				list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm certificate in the ordered set where certificateCode &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByF_LCODE_GT_First(String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		List<DmCertificate> list = findByF_LCODE_GT(certificateCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateCode=");
			msg.append(certificateCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmCertificateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm certificate in the ordered set where certificateCode &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByF_LCODE_GT_Last(String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		int count = countByF_LCODE_GT(certificateCode);

		List<DmCertificate> list = findByF_LCODE_GT(certificateCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateCode=");
			msg.append(certificateCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmCertificateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm certificate
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate[] findByF_LCODE_GT_PrevAndNext(long id,
		String certificateCode, OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmCertificate[] array = new DmCertificateImpl[3];

			array[0] = getByF_LCODE_GT_PrevAndNext(session, dmCertificate,
					certificateCode, orderByComparator, true);

			array[1] = dmCertificate;

			array[2] = getByF_LCODE_GT_PrevAndNext(session, dmCertificate,
					certificateCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmCertificate getByF_LCODE_GT_PrevAndNext(Session session,
		DmCertificate dmCertificate, String certificateCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

		if (certificateCode == null) {
			query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_1);
		}
		else {
			if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_2);
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
			query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (certificateCode != null) {
			qPos.add(certificateCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm certificates where certificateCode &lt; &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @return the matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByF_LCODE_LT(String certificateCode)
		throws SystemException {
		return findByF_LCODE_LT(certificateCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm certificates where certificateCode &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @return the range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByF_LCODE_LT(String certificateCode,
		int start, int end) throws SystemException {
		return findByF_LCODE_LT(certificateCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm certificates where certificateCode &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findByF_LCODE_LT(String certificateCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_LCODE_LT;
			finderArgs = new Object[] { certificateCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_LCODE_LT;
			finderArgs = new Object[] {
					certificateCode,
					
					start, end, orderByComparator
				};
		}

		List<DmCertificate> list = (List<DmCertificate>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_1);
			}
			else {
				if (certificateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (certificateCode != null) {
					qPos.add(certificateCode);
				}

				list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm certificate in the ordered set where certificateCode &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByF_LCODE_LT_First(String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		List<DmCertificate> list = findByF_LCODE_LT(certificateCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateCode=");
			msg.append(certificateCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmCertificateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm certificate in the ordered set where certificateCode &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate findByF_LCODE_LT_Last(String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		int count = countByF_LCODE_LT(certificateCode);

		List<DmCertificate> list = findByF_LCODE_LT(certificateCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateCode=");
			msg.append(certificateCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmCertificateException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current dm certificate
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm certificate
	 * @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmCertificate[] findByF_LCODE_LT_PrevAndNext(long id,
		String certificateCode, OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmCertificate[] array = new DmCertificateImpl[3];

			array[0] = getByF_LCODE_LT_PrevAndNext(session, dmCertificate,
					certificateCode, orderByComparator, true);

			array[1] = dmCertificate;

			array[2] = getByF_LCODE_LT_PrevAndNext(session, dmCertificate,
					certificateCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmCertificate getByF_LCODE_LT_PrevAndNext(Session session,
		DmCertificate dmCertificate, String certificateCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

		if (certificateCode == null) {
			query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_1);
		}
		else {
			if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_2);
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
			query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (certificateCode != null) {
			qPos.add(certificateCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm certificates.
	 *
	 * @return the dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @return the range of dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmCertificate> findAll(int start, int end,
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

		List<DmCertificate> list = (List<DmCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMCERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMCERTIFICATE.concat(DmCertificateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm certificates where certificateCode = &#63; from the database.
	 *
	 * @param certificateCode the certificate code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCertificateCode(String certificateCode)
		throws SystemException {
		for (DmCertificate dmCertificate : findByCertificateCode(
				certificateCode)) {
			dmCertificatePersistence.remove(dmCertificate);
		}
	}

	/**
	 * Removes all the dm certificates where certificateCode = &#63; and certificateName = &#63; from the database.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName)
		throws SystemException {
		for (DmCertificate dmCertificate : findByCertificateCodeAndCertificateName(
				certificateCode, certificateName)) {
			dmCertificatePersistence.remove(dmCertificate);
		}
	}

	/**
	 * Removes all the dm certificates where certificateCode &gt; &#63; from the database.
	 *
	 * @param certificateCode the certificate code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_LCODE_GT(String certificateCode)
		throws SystemException {
		for (DmCertificate dmCertificate : findByF_LCODE_GT(certificateCode)) {
			dmCertificatePersistence.remove(dmCertificate);
		}
	}

	/**
	 * Removes all the dm certificates where certificateCode &lt; &#63; from the database.
	 *
	 * @param certificateCode the certificate code
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_LCODE_LT(String certificateCode)
		throws SystemException {
		for (DmCertificate dmCertificate : findByF_LCODE_LT(certificateCode)) {
			dmCertificatePersistence.remove(dmCertificate);
		}
	}

	/**
	 * Removes all the dm certificates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmCertificate dmCertificate : findAll()) {
			dmCertificatePersistence.remove(dmCertificate);
		}
	}

	/**
	 * Returns the number of dm certificates where certificateCode = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @return the number of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCertificateCode(String certificateCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { certificateCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CERTIFICATECODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMCERTIFICATE_WHERE);

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_1);
			}
			else {
				if (certificateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (certificateCode != null) {
					qPos.add(certificateCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CERTIFICATECODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm certificates where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @return the number of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName)
		throws SystemException {
		Object[] finderArgs = new Object[] { certificateCode, certificateName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMCERTIFICATE_WHERE);

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_1);
			}
			else {
				if (certificateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_2);
				}
			}

			if (certificateName == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_1);
			}
			else {
				if (certificateName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (certificateCode != null) {
					qPos.add(certificateCode);
				}

				if (certificateName != null) {
					qPos.add(certificateName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm certificates where certificateCode &gt; &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @return the number of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_LCODE_GT(String certificateCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { certificateCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_LCODE_GT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMCERTIFICATE_WHERE);

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_1);
			}
			else {
				if (certificateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (certificateCode != null) {
					qPos.add(certificateCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_LCODE_GT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm certificates where certificateCode &lt; &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @return the number of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_LCODE_LT(String certificateCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { certificateCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_LCODE_LT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMCERTIFICATE_WHERE);

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_1);
			}
			else {
				if (certificateCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (certificateCode != null) {
					qPos.add(certificateCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_LCODE_LT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm certificates.
	 *
	 * @return the number of dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMCERTIFICATE);

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
	 * Initializes the dm certificate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmucgt.model.DmCertificate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmCertificate>> listenersList = new ArrayList<ModelListener<DmCertificate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmCertificate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmCertificateImpl.class.getName());
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
	private static final String _SQL_SELECT_DMCERTIFICATE = "SELECT dmCertificate FROM DmCertificate dmCertificate";
	private static final String _SQL_SELECT_DMCERTIFICATE_WHERE = "SELECT dmCertificate FROM DmCertificate dmCertificate WHERE ";
	private static final String _SQL_COUNT_DMCERTIFICATE = "SELECT COUNT(dmCertificate) FROM DmCertificate dmCertificate";
	private static final String _SQL_COUNT_DMCERTIFICATE_WHERE = "SELECT COUNT(dmCertificate) FROM DmCertificate dmCertificate WHERE ";
	private static final String _FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_1 =
		"dmCertificate.certificateCode IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_2 =
		"dmCertificate.certificateCode = ?";
	private static final String _FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_3 =
		"(dmCertificate.certificateCode IS NULL OR dmCertificate.certificateCode = ?)";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_1 =
		"dmCertificate.certificateCode IS NULL AND ";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_2 =
		"dmCertificate.certificateCode = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_3 =
		"(dmCertificate.certificateCode IS NULL OR dmCertificate.certificateCode = ?) AND ";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_1 =
		"dmCertificate.certificateName IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_2 =
		"dmCertificate.certificateName = ?";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_3 =
		"(dmCertificate.certificateName IS NULL OR dmCertificate.certificateName = ?)";
	private static final String _FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_1 = "dmCertificate.certificateCode > NULL AND  ( dmCertificate.certificateCode != 39) ";
	private static final String _FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_2 = "dmCertificate.certificateCode > ? AND  ( dmCertificate.certificateCode != 39) ";
	private static final String _FINDER_COLUMN_F_LCODE_GT_CERTIFICATECODE_3 = "(dmCertificate.certificateCode IS NULL OR dmCertificate.certificateCode > ?) AND  ( dmCertificate.certificateCode != 39) ";
	private static final String _FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_1 = "dmCertificate.certificateCode < NULL AND  ( dmCertificate.certificateCode != 39) ";
	private static final String _FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_2 = "dmCertificate.certificateCode < ? AND  ( dmCertificate.certificateCode != 39) ";
	private static final String _FINDER_COLUMN_F_LCODE_LT_CERTIFICATECODE_3 = "(dmCertificate.certificateCode IS NULL OR dmCertificate.certificateCode < ?) AND  ( dmCertificate.certificateCode != 39) ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmCertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmCertificate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmCertificatePersistenceImpl.class);
	private static DmCertificate _nullDmCertificate = new DmCertificateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmCertificate> toCacheModel() {
				return _nullDmCertificateCacheModel;
			}
		};

	private static CacheModel<DmCertificate> _nullDmCertificateCacheModel = new CacheModel<DmCertificate>() {
			public DmCertificate toEntityModel() {
				return _nullDmCertificate;
			}
		};
}