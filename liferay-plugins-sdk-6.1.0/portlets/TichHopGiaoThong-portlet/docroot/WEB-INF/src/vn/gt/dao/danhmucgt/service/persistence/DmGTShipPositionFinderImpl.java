package vn.gt.dao.danhmucgt.service.persistence;

import java.util.List;

import vn.gt.dao.danhmucgt.model.DmGTShipPosition;
import vn.gt.dao.danhmucgt.model.impl.DmGTShipPositionImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DmGTShipPositionFinderImpl extends BasePersistenceImpl<DmGTShipPosition> implements DmGTShipPositionFinder {

	public List<DmGTShipPosition> findByRoleAndThuTuc(String positionCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_gt_ship_position WHERE 1=1 ");
			
			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0 ) {
				query.append("AND PositionCode IN ("+positionCode+")");
			}
			
			String sql = query.toString();
			//System.out.println("=========findByRoleAndThuTuc========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmGTShipPosition",DmGTShipPositionImpl.class);
						// execute the query and return a list from the db
			return (List<DmGTShipPosition>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
