/**
 * 
 */
package vn.gt.tichhop.message;

import java.util.Date;
import java.util.UUID;

import vn.nsw.Header;
import vn.nsw.Header.Subject;
import vn.nsw.model.XacNhanHuyLenhDieuDong;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * @author win_64
 *
 */
public class HuyLenhDieuDongUtils {

	static Log _log = LogFactoryUtil.getLog(HuyLenhDieuDongUtils.class);

	public String huyLenhDieuDongHQMC(Header header, String dataInput, String data) {
		BusinessUtils businessUtils = new BusinessUtils();
		try {

			// Insert history.
			businessUtils.insertHistory(header, dataInput, BusinessUtils.HqmcToBoGiaoThong,
					TrangThaiHoSo.HISTORY_REQUEST_STATE_MOI_YEU_CAU, null);

			Object obj = MessageFactory.convertXmltoObject(MessageType.HUY_LENH_DIEU_DONG, data);
			if (obj instanceof XacNhanHuyLenhDieuDong) {
				
				
				Subject subject = header.getSubject();
				subject.setType(MessageType.HUY_LENH_DIEU_DONG);
				header.setSubject(subject);
				businessUtils.sendMessageHuyHoLenhDieuDong(header, "Bo Giao Thong Van Tai", "Ke Hoach", header.getFrom().getName(), "System", new Date(),new Integer(((XacNhanHuyLenhDieuDong) obj).getIsApprove()), null);
			}
			// Cap nhat trang thai la tiep nhan voi truong hop da tiep nhan ban khai.
			if (header != null && header.getReference() != null) {
				businessUtils.updateHistory(header.getReference().getMessageId(), TrangThaiHoSo.HISTORY_REQUEST_STATE_GHI_NHAN);
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}

		// Ban tin tra ve dung.
		String xmlResult = businessUtils.createReturnContentAfterParserDataReceiverFromNSW(header);
		businessUtils.insertHistory(header, xmlResult, BusinessUtils.BoGiaoThongToHqmc,
				TrangThaiHoSo.DA_GHI_NHO_YEU_CAU, UUID.randomUUID().toString());

		return xmlResult;
	}
}
