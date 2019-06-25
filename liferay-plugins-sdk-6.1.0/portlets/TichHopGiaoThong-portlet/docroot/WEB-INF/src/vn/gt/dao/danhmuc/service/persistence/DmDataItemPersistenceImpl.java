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

import vn.gt.dao.danhmuc.NoSuchDmDataItemException;
import vn.gt.dao.danhmuc.model.DmDataItem;
import vn.gt.dao.danhmuc.model.impl.DmDataItemImpl;
import vn.gt.dao.danhmuc.model.impl.DmDataItemModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dm data item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataItemPersistence
 * @see DmDataItemUtil
 * @generated
 */
public class DmDataItemPersistenceImpl extends BasePersistenceImpl<DmDataItem>
	implements DmDataItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmDataItemUtil} to access the dm data item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmDataItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0 = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDataGroupIdAndCode0",
			new String[] { Long.class.getName(), String.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.CODE0_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE0 = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndCode0",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDNODE1 =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndNode1",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE1 =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndNode1",
			new String[] { Long.class.getName(), String.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.NODE1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE1 = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndNode1",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDNODE2 =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndNode2",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE2 =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndNode2",
			new String[] { Long.class.getName(), String.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.NODE2_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE2 = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndNode2",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELANDSHORTNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndLevelandShortName",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELANDSHORTNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndLevelandShortName",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.LEVEL_COLUMN_BITMASK |
			DmDataItemModelImpl.SHORTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELANDSHORTNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndLevelandShortName",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndLevel",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndLevel",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.LEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndLevel",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPID =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDataGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDataGroupId",
			new String[] { Long.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPID = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDataGroupId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDSHORTNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndShortName",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDSHORTNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndShortName",
			new String[] { Long.class.getName(), String.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.SHORTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDSHORTNAME = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndShortName",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the dm data item in the entity cache if it is enabled.
	 *
	 * @param dmDataItem the dm data item
	 */
	public void cacheResult(DmDataItem dmDataItem) {
		EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey(), dmDataItem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
			new Object[] {
				Long.valueOf(dmDataItem.getDataGroupId()),
				
			dmDataItem.getCode0()
			}, dmDataItem);

		dmDataItem.resetOriginalValues();
	}

	/**
	 * Caches the dm data items in the entity cache if it is enabled.
	 *
	 * @param dmDataItems the dm data items
	 */
	public void cacheResult(List<DmDataItem> dmDataItems) {
		for (DmDataItem dmDataItem : dmDataItems) {
			if (EntityCacheUtil.getResult(
						DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
						DmDataItemImpl.class, dmDataItem.getPrimaryKey()) == null) {
				cacheResult(dmDataItem);
			}
			else {
				dmDataItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm data items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmDataItemImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmDataItemImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm data item.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmDataItem dmDataItem) {
		EntityCacheUtil.removeResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmDataItem);
	}

	@Override
	public void clearCache(List<DmDataItem> dmDataItems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmDataItem dmDataItem : dmDataItems) {
			EntityCacheUtil.removeResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
				DmDataItemImpl.class, dmDataItem.getPrimaryKey());

			clearUniqueFindersCache(dmDataItem);
		}
	}

	protected void clearUniqueFindersCache(DmDataItem dmDataItem) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
			new Object[] {
				Long.valueOf(dmDataItem.getDataGroupId()),
				
			dmDataItem.getCode0()
			});
	}

	/**
	 * Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	 *
	 * @param Id the primary key for the new dm data item
	 * @return the new dm data item
	 */
	public DmDataItem create(long Id) {
		DmDataItem dmDataItem = new DmDataItemImpl();

		dmDataItem.setNew(true);
		dmDataItem.setPrimaryKey(Id);

		return dmDataItem;
	}

	/**
	 * Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the dm data item
	 * @return the dm data item that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem remove(long Id)
		throws NoSuchDmDataItemException, SystemException {
		return remove(Long.valueOf(Id));
	}

	/**
	 * Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item that was removed
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem remove(Serializable primaryKey)
		throws NoSuchDmDataItemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmDataItem dmDataItem = (DmDataItem)session.get(DmDataItemImpl.class,
					primaryKey);

			if (dmDataItem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmDataItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmDataItem);
		}
		catch (NoSuchDmDataItemException nsee) {
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
	protected DmDataItem removeImpl(DmDataItem dmDataItem)
		throws SystemException {
		dmDataItem = toUnwrappedModel(dmDataItem);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, dmDataItem);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(dmDataItem);

		return dmDataItem;
	}

	@Override
	public DmDataItem updateImpl(
		vn.gt.dao.danhmuc.model.DmDataItem dmDataItem, boolean merge)
		throws SystemException {
		dmDataItem = toUnwrappedModel(dmDataItem);

		boolean isNew = dmDataItem.isNew();

		DmDataItemModelImpl dmDataItemModelImpl = (DmDataItemModelImpl)dmDataItem;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, dmDataItem, merge);

			dmDataItem.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmDataItemModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getOriginalDataGroupId()),
						
						dmDataItemModelImpl.getOriginalNode1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE1,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE1,
					args);

				args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getDataGroupId()),
						
						dmDataItemModelImpl.getNode1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE1,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE1,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getOriginalDataGroupId()),
						
						dmDataItemModelImpl.getOriginalNode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE2,
					args);

				args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getDataGroupId()),
						
						dmDataItemModelImpl.getNode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE2,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELANDSHORTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getOriginalDataGroupId()),
						Integer.valueOf(dmDataItemModelImpl.getOriginalLevel()),
						
						dmDataItemModelImpl.getOriginalShortName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELANDSHORTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELANDSHORTNAME,
					args);

				args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getDataGroupId()),
						Integer.valueOf(dmDataItemModelImpl.getLevel()),
						
						dmDataItemModelImpl.getShortName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELANDSHORTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELANDSHORTNAME,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getOriginalDataGroupId()),
						Integer.valueOf(dmDataItemModelImpl.getOriginalLevel())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL,
					args);

				args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getDataGroupId()),
						Integer.valueOf(dmDataItemModelImpl.getLevel())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getOriginalDataGroupId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID,
					args);

				args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getDataGroupId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDSHORTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getOriginalDataGroupId()),
						
						dmDataItemModelImpl.getOriginalShortName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDSHORTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDSHORTNAME,
					args);

				args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getDataGroupId()),
						
						dmDataItemModelImpl.getShortName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDSHORTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDSHORTNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey(), dmDataItem);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
				new Object[] {
					Long.valueOf(dmDataItem.getDataGroupId()),
					
				dmDataItem.getCode0()
				}, dmDataItem);
		}
		else {
			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(dmDataItemModelImpl.getOriginalDataGroupId()),
						
						dmDataItemModelImpl.getOriginalCode0()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE0,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
					new Object[] {
						Long.valueOf(dmDataItem.getDataGroupId()),
						
					dmDataItem.getCode0()
					}, dmDataItem);
			}
		}

		return dmDataItem;
	}

	protected DmDataItem toUnwrappedModel(DmDataItem dmDataItem) {
		if (dmDataItem instanceof DmDataItemImpl) {
			return dmDataItem;
		}

		DmDataItemImpl dmDataItemImpl = new DmDataItemImpl();

		dmDataItemImpl.setNew(dmDataItem.isNew());
		dmDataItemImpl.setPrimaryKey(dmDataItem.getPrimaryKey());

		dmDataItemImpl.setId(dmDataItem.getId());
		dmDataItemImpl.setDataGroupId(dmDataItem.getDataGroupId());
		dmDataItemImpl.setCode0(dmDataItem.getCode0());
		dmDataItemImpl.setNode1(dmDataItem.getNode1());
		dmDataItemImpl.setNode2(dmDataItem.getNode2());
		dmDataItemImpl.setNode3(dmDataItem.getNode3());
		dmDataItemImpl.setNode4(dmDataItem.getNode4());
		dmDataItemImpl.setLevel(dmDataItem.getLevel());
		dmDataItemImpl.setName(dmDataItem.getName());
		dmDataItemImpl.setShortName(dmDataItem.getShortName());
		dmDataItemImpl.setDescription(dmDataItem.getDescription());
		dmDataItemImpl.setValidatedFrom(dmDataItem.getValidatedFrom());
		dmDataItemImpl.setValidatedTo(dmDataItem.getValidatedTo());
		dmDataItemImpl.setOrder(dmDataItem.getOrder());
		dmDataItemImpl.setStatus(dmDataItem.getStatus());

		return dmDataItemImpl;
	}

	/**
	 * Returns the dm data item with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item
	 * @throws com.liferay.portal.NoSuchModelException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm data item with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param Id the primary key of the dm data item
	 * @return the dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByPrimaryKey(long Id)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByPrimaryKey(Id);

		if (dmDataItem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + Id);
			}

			throw new NoSuchDmDataItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				Id);
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the dm data item
	 * @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem fetchByPrimaryKey(long Id) throws SystemException {
		DmDataItem dmDataItem = (DmDataItem)EntityCacheUtil.getResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
				DmDataItemImpl.class, Id);

		if (dmDataItem == _nullDmDataItem) {
			return null;
		}

		if (dmDataItem == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				dmDataItem = (DmDataItem)session.get(DmDataItemImpl.class,
						Long.valueOf(Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (dmDataItem != null) {
					cacheResult(dmDataItem);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
						DmDataItemImpl.class, Id, _nullDmDataItem);
				}

				closeSession(session);
			}
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @return the matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndCode0(long DataGroupId, String Code0)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndCode0(DataGroupId, Code0);

		if (dmDataItem == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Code0=");
			msg.append(Code0);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmDataItemException(msg.toString());
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem fetchByDataGroupIdAndCode0(long DataGroupId, String Code0)
		throws SystemException {
		return fetchByDataGroupIdAndCode0(DataGroupId, Code0, true);
	}

	/**
	 * Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem fetchByDataGroupIdAndCode0(long DataGroupId,
		String Code0, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { DataGroupId, Code0 };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_DATAGROUPID_2);

			if (Code0 == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_1);
			}
			else {
				if (Code0.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_2);
				}
			}

			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (Code0 != null) {
					qPos.add(Code0);
				}

				List<DmDataItem> list = q.list();

				result = list;

				DmDataItem dmDataItem = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
						finderArgs, list);
				}
				else {
					dmDataItem = list.get(0);

					cacheResult(dmDataItem);

					if ((dmDataItem.getDataGroupId() != DataGroupId) ||
							(dmDataItem.getCode0() == null) ||
							!dmDataItem.getCode0().equals(Code0)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
							finderArgs, dmDataItem);
					}
				}

				return dmDataItem;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE0,
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
				return (DmDataItem)result;
			}
		}
	}

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and Node1 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Node1 the node1
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndNode1(long DataGroupId,
		String Node1) throws SystemException {
		return findByDataGroupIdAndNode1(DataGroupId, Node1, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and Node1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Node1 the node1
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndNode1(long DataGroupId,
		String Node1, int start, int end) throws SystemException {
		return findByDataGroupIdAndNode1(DataGroupId, Node1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and Node1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Node1 the node1
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndNode1(long DataGroupId,
		String Node1, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE1;
			finderArgs = new Object[] { DataGroupId, Node1 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDNODE1;
			finderArgs = new Object[] {
					DataGroupId, Node1,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_DATAGROUPID_2);

			if (Node1 == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_1);
			}
			else {
				if (Node1.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (Node1 != null) {
					qPos.add(Node1);
				}

				list = (List<DmDataItem>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Node1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Node1 the node1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndNode1_First(long DataGroupId,
		String Node1, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		List<DmDataItem> list = findByDataGroupIdAndNode1(DataGroupId, Node1,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Node1=");
			msg.append(Node1);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Node1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Node1 the node1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndNode1_Last(long DataGroupId,
		String Node1, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		int count = countByDataGroupIdAndNode1(DataGroupId, Node1);

		List<DmDataItem> list = findByDataGroupIdAndNode1(DataGroupId, Node1,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Node1=");
			msg.append(Node1);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Node1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param Node1 the node1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem[] findByDataGroupIdAndNode1_PrevAndNext(long Id,
		long DataGroupId, String Node1, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndNode1_PrevAndNext(session,
					dmDataItem, DataGroupId, Node1, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndNode1_PrevAndNext(session,
					dmDataItem, DataGroupId, Node1, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupIdAndNode1_PrevAndNext(Session session,
		DmDataItem dmDataItem, long DataGroupId, String Node1,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_DATAGROUPID_2);

		if (Node1 == null) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_1);
		}
		else {
			if (Node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_3);
			}
			else {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_2);
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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		if (Node1 != null) {
			qPos.add(Node1);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and Node2 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Node2 the node2
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndNode2(long DataGroupId,
		String Node2) throws SystemException {
		return findByDataGroupIdAndNode2(DataGroupId, Node2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and Node2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Node2 the node2
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndNode2(long DataGroupId,
		String Node2, int start, int end) throws SystemException {
		return findByDataGroupIdAndNode2(DataGroupId, Node2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and Node2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Node2 the node2
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndNode2(long DataGroupId,
		String Node2, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDNODE2;
			finderArgs = new Object[] { DataGroupId, Node2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDNODE2;
			finderArgs = new Object[] {
					DataGroupId, Node2,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_DATAGROUPID_2);

			if (Node2 == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_1);
			}
			else {
				if (Node2.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (Node2 != null) {
					qPos.add(Node2);
				}

				list = (List<DmDataItem>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Node2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Node2 the node2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndNode2_First(long DataGroupId,
		String Node2, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		List<DmDataItem> list = findByDataGroupIdAndNode2(DataGroupId, Node2,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Node2=");
			msg.append(Node2);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Node2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Node2 the node2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndNode2_Last(long DataGroupId,
		String Node2, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		int count = countByDataGroupIdAndNode2(DataGroupId, Node2);

		List<DmDataItem> list = findByDataGroupIdAndNode2(DataGroupId, Node2,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Node2=");
			msg.append(Node2);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Node2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param Node2 the node2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem[] findByDataGroupIdAndNode2_PrevAndNext(long Id,
		long DataGroupId, String Node2, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndNode2_PrevAndNext(session,
					dmDataItem, DataGroupId, Node2, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndNode2_PrevAndNext(session,
					dmDataItem, DataGroupId, Node2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupIdAndNode2_PrevAndNext(Session session,
		DmDataItem dmDataItem, long DataGroupId, String Node2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_DATAGROUPID_2);

		if (Node2 == null) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_1);
		}
		else {
			if (Node2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_3);
			}
			else {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_2);
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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		if (Node2 != null) {
			qPos.add(Node2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param ShortName the short name
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, String ShortName)
		throws SystemException {
		return findByDataGroupIdAndLevelandShortName(DataGroupId, Level,
			ShortName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param ShortName the short name
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, String ShortName, int start, int end)
		throws SystemException {
		return findByDataGroupIdAndLevelandShortName(DataGroupId, Level,
			ShortName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param ShortName the short name
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, String ShortName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELANDSHORTNAME;
			finderArgs = new Object[] { DataGroupId, Level, ShortName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELANDSHORTNAME;
			finderArgs = new Object[] {
					DataGroupId, Level, ShortName,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_LEVEL_2);

			if (ShortName == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_1);
			}
			else {
				if (ShortName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				qPos.add(Level);

				if (ShortName != null) {
					qPos.add(ShortName);
				}

				list = (List<DmDataItem>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param ShortName the short name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndLevelandShortName_First(
		long DataGroupId, int Level, String ShortName,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		List<DmDataItem> list = findByDataGroupIdAndLevelandShortName(DataGroupId,
				Level, ShortName, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Level=");
			msg.append(Level);

			msg.append(", ShortName=");
			msg.append(ShortName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param ShortName the short name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndLevelandShortName_Last(
		long DataGroupId, int Level, String ShortName,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		int count = countByDataGroupIdAndLevelandShortName(DataGroupId, Level,
				ShortName);

		List<DmDataItem> list = findByDataGroupIdAndLevelandShortName(DataGroupId,
				Level, ShortName, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Level=");
			msg.append(Level);

			msg.append(", ShortName=");
			msg.append(ShortName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param ShortName the short name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem[] findByDataGroupIdAndLevelandShortName_PrevAndNext(
		long Id, long DataGroupId, int Level, String ShortName,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndLevelandShortName_PrevAndNext(session,
					dmDataItem, DataGroupId, Level, ShortName,
					orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndLevelandShortName_PrevAndNext(session,
					dmDataItem, DataGroupId, Level, ShortName,
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

	protected DmDataItem getByDataGroupIdAndLevelandShortName_PrevAndNext(
		Session session, DmDataItem dmDataItem, long DataGroupId, int Level,
		String ShortName, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_DATAGROUPID_2);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_LEVEL_2);

		if (ShortName == null) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_1);
		}
		else {
			if (ShortName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_2);
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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		qPos.add(Level);

		if (ShortName != null) {
			qPos.add(ShortName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndLevel(long DataGroupId,
		int Level) throws SystemException {
		return findByDataGroupIdAndLevel(DataGroupId, Level, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and Level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndLevel(long DataGroupId,
		int Level, int start, int end) throws SystemException {
		return findByDataGroupIdAndLevel(DataGroupId, Level, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and Level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndLevel(long DataGroupId,
		int Level, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL;
			finderArgs = new Object[] { DataGroupId, Level };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL;
			finderArgs = new Object[] {
					DataGroupId, Level,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				qPos.add(Level);

				list = (List<DmDataItem>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndLevel_First(long DataGroupId,
		int Level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		List<DmDataItem> list = findByDataGroupIdAndLevel(DataGroupId, Level,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Level=");
			msg.append(Level);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndLevel_Last(long DataGroupId,
		int Level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		int count = countByDataGroupIdAndLevel(DataGroupId, Level);

		List<DmDataItem> list = findByDataGroupIdAndLevel(DataGroupId, Level,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", Level=");
			msg.append(Level);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem[] findByDataGroupIdAndLevel_PrevAndNext(long Id,
		long DataGroupId, int Level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndLevel_PrevAndNext(session,
					dmDataItem, DataGroupId, Level, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndLevel_PrevAndNext(session,
					dmDataItem, DataGroupId, Level, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupIdAndLevel_PrevAndNext(Session session,
		DmDataItem dmDataItem, long DataGroupId, int Level,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		qPos.add(Level);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm data items where DataGroupId = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupId(long DataGroupId)
		throws SystemException {
		return findByDataGroupId(DataGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupId(long DataGroupId, int start,
		int end) throws SystemException {
		return findByDataGroupId(DataGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupId(long DataGroupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID;
			finderArgs = new Object[] { DataGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPID;
			finderArgs = new Object[] { DataGroupId, start, end, orderByComparator };
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				list = (List<DmDataItem>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupId_First(long DataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		List<DmDataItem> list = findByDataGroupId(DataGroupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupId_Last(long DataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		int count = countByDataGroupId(DataGroupId);

		List<DmDataItem> list = findByDataGroupId(DataGroupId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem[] findByDataGroupId_PrevAndNext(long Id,
		long DataGroupId, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupId_PrevAndNext(session, dmDataItem,
					DataGroupId, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupId_PrevAndNext(session, dmDataItem,
					DataGroupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupId_PrevAndNext(Session session,
		DmDataItem dmDataItem, long DataGroupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and ShortName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param ShortName the short name
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndShortName(long DataGroupId,
		String ShortName) throws SystemException {
		return findByDataGroupIdAndShortName(DataGroupId, ShortName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param ShortName the short name
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndShortName(long DataGroupId,
		String ShortName, int start, int end) throws SystemException {
		return findByDataGroupIdAndShortName(DataGroupId, ShortName, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param ShortName the short name
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findByDataGroupIdAndShortName(long DataGroupId,
		String ShortName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDSHORTNAME;
			finderArgs = new Object[] { DataGroupId, ShortName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDSHORTNAME;
			finderArgs = new Object[] {
					DataGroupId, ShortName,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_DATAGROUPID_2);

			if (ShortName == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_1);
			}
			else {
				if (ShortName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (ShortName != null) {
					qPos.add(ShortName);
				}

				list = (List<DmDataItem>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param ShortName the short name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndShortName_First(long DataGroupId,
		String ShortName, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		List<DmDataItem> list = findByDataGroupIdAndShortName(DataGroupId,
				ShortName, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", ShortName=");
			msg.append(ShortName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param ShortName the short name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem findByDataGroupIdAndShortName_Last(long DataGroupId,
		String ShortName, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		int count = countByDataGroupIdAndShortName(DataGroupId, ShortName);

		List<DmDataItem> list = findByDataGroupIdAndShortName(DataGroupId,
				ShortName, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("DataGroupId=");
			msg.append(DataGroupId);

			msg.append(", ShortName=");
			msg.append(ShortName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDmDataItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and ShortName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param ShortName the short name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DmDataItem[] findByDataGroupIdAndShortName_PrevAndNext(long Id,
		long DataGroupId, String ShortName, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndShortName_PrevAndNext(session,
					dmDataItem, DataGroupId, ShortName, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndShortName_PrevAndNext(session,
					dmDataItem, DataGroupId, ShortName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupIdAndShortName_PrevAndNext(
		Session session, DmDataItem dmDataItem, long DataGroupId,
		String ShortName, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_DATAGROUPID_2);

		if (ShortName == null) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_1);
		}
		else {
			if (ShortName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_2);
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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		if (ShortName != null) {
			qPos.add(ShortName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dm data items.
	 *
	 * @return the dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public List<DmDataItem> findAll(int start, int end,
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

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMDATAITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMDATAITEM.concat(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Removes the dm data item where DataGroupId = &#63; and Code0 = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDataGroupIdAndCode0(long DataGroupId, String Code0)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByDataGroupIdAndCode0(DataGroupId, Code0);

		remove(dmDataItem);
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and Node1 = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param Node1 the node1
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDataGroupIdAndNode1(long DataGroupId, String Node1)
		throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndNode1(DataGroupId,
				Node1)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and Node2 = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param Node2 the node2
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDataGroupIdAndNode2(long DataGroupId, String Node2)
		throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndNode2(DataGroupId,
				Node2)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param ShortName the short name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDataGroupIdAndLevelandShortName(long DataGroupId,
		int Level, String ShortName) throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndLevelandShortName(
				DataGroupId, Level, ShortName)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and Level = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndLevel(DataGroupId,
				Level)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDataGroupId(long DataGroupId) throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupId(DataGroupId)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and ShortName = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param ShortName the short name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDataGroupIdAndShortName(long DataGroupId,
		String ShortName) throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndShortName(
				DataGroupId, ShortName)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Removes all the dm data items from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DmDataItem dmDataItem : findAll()) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDataGroupIdAndCode0(long DataGroupId, String Code0)
		throws SystemException {
		Object[] finderArgs = new Object[] { DataGroupId, Code0 };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE0,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_DATAGROUPID_2);

			if (Code0 == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_1);
			}
			else {
				if (Code0.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (Code0 != null) {
					qPos.add(Code0);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE0,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and Node1 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Node1 the node1
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDataGroupIdAndNode1(long DataGroupId, String Node1)
		throws SystemException {
		Object[] finderArgs = new Object[] { DataGroupId, Node1 };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE1,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_DATAGROUPID_2);

			if (Node1 == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_1);
			}
			else {
				if (Node1.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (Node1 != null) {
					qPos.add(Node1);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE1,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and Node2 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Node2 the node2
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDataGroupIdAndNode2(long DataGroupId, String Node2)
		throws SystemException {
		Object[] finderArgs = new Object[] { DataGroupId, Node2 };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE2,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_DATAGROUPID_2);

			if (Node2 == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_1);
			}
			else {
				if (Node2.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (Node2 != null) {
					qPos.add(Node2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDNODE2,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param ShortName the short name
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDataGroupIdAndLevelandShortName(long DataGroupId,
		int Level, String ShortName) throws SystemException {
		Object[] finderArgs = new Object[] { DataGroupId, Level, ShortName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELANDSHORTNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_LEVEL_2);

			if (ShortName == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_1);
			}
			else {
				if (ShortName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				qPos.add(Level);

				if (ShortName != null) {
					qPos.add(ShortName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELANDSHORTNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws SystemException {
		Object[] finderArgs = new Object[] { DataGroupId, Level };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				qPos.add(Level);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDataGroupId(long DataGroupId) throws SystemException {
		Object[] finderArgs = new Object[] { DataGroupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DATAGROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and ShortName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param ShortName the short name
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDataGroupIdAndShortName(long DataGroupId, String ShortName)
		throws SystemException {
		Object[] finderArgs = new Object[] { DataGroupId, ShortName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDSHORTNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_DATAGROUPID_2);

			if (ShortName == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_1);
			}
			else {
				if (ShortName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (ShortName != null) {
					qPos.add(ShortName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDSHORTNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm data items.
	 *
	 * @return the number of dm data items
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMDATAITEM);

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
	 * Initializes the dm data item persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.gt.dao.danhmuc.model.DmDataItem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmDataItem>> listenersList = new ArrayList<ModelListener<DmDataItem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmDataItem>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmDataItemImpl.class.getName());
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
	private static final String _SQL_SELECT_DMDATAITEM = "SELECT dmDataItem FROM DmDataItem dmDataItem";
	private static final String _SQL_SELECT_DMDATAITEM_WHERE = "SELECT dmDataItem FROM DmDataItem dmDataItem WHERE ";
	private static final String _SQL_COUNT_DMDATAITEM = "SELECT COUNT(dmDataItem) FROM DmDataItem dmDataItem";
	private static final String _SQL_COUNT_DMDATAITEM_WHERE = "SELECT COUNT(dmDataItem) FROM DmDataItem dmDataItem WHERE ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE0_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_1 = "dmDataItem.Code0 IS NULL";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_2 = "dmDataItem.Code0 = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_3 = "(dmDataItem.Code0 IS NULL OR dmDataItem.Code0 = ?)";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDNODE1_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_1 = "dmDataItem.Node1 IS NULL";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_2 = "dmDataItem.Node1 = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDNODE1_NODE1_3 = "(dmDataItem.Node1 IS NULL OR dmDataItem.Node1 = ?)";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDNODE2_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_1 = "dmDataItem.Node2 IS NULL";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_2 = "dmDataItem.Node2 = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDNODE2_NODE2_3 = "(dmDataItem.Node2 IS NULL OR dmDataItem.Node2 = ?)";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_LEVEL_2 =
		"dmDataItem.Level = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_1 =
		"dmDataItem.ShortName IS NULL";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_2 =
		"dmDataItem.ShortName = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELANDSHORTNAME_SHORTNAME_3 =
		"(dmDataItem.ShortName IS NULL OR dmDataItem.ShortName = ?)";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2 = "dmDataItem.Level = ?";
	private static final String _FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2 = "dmDataItem.DataGroupId = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_1 =
		"dmDataItem.ShortName IS NULL";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_2 =
		"dmDataItem.ShortName = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDSHORTNAME_SHORTNAME_3 =
		"(dmDataItem.ShortName IS NULL OR dmDataItem.ShortName = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmDataItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmDataItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmDataItem exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmDataItemPersistenceImpl.class);
	private static DmDataItem _nullDmDataItem = new DmDataItemImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmDataItem> toCacheModel() {
				return _nullDmDataItemCacheModel;
			}
		};

	private static CacheModel<DmDataItem> _nullDmDataItemCacheModel = new CacheModel<DmDataItem>() {
			public DmDataItem toEntityModel() {
				return _nullDmDataItem;
			}
		};
}