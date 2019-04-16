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

package vn.gt.dao.common.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;

import vn.gt.dao.common.model.UserPort;
import vn.gt.dao.common.model.UserSign;
import vn.gt.dao.common.service.base.UserSignLocalServiceBaseImpl;
import vn.gt.utils.document.DocumentUtils;

/**
 * The implementation of the user sign local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.common.service.UserSignLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.common.service.base.UserSignLocalServiceBaseImpl
 * @see vn.gt.dao.common.service.UserSignLocalServiceUtil
 */
public class UserSignLocalServiceImpl extends UserSignLocalServiceBaseImpl {
	
	public void deleteUserSignById(long userSignId) throws SystemException {
		UserSign userSign = userSignPersistence.fetchByPrimaryKey(userSignId);
		
		if(userSign != null) {
			long fileChungThuSo = userSign.getFileChungThuSoId();
			long fileChuKy = userSign.getFileChuKyId();
			long fileConDau = userSign.getFileConDauId();
			
			userSignPersistence.remove(userSign);
			
			deleteFile(fileChungThuSo);
			deleteFile(fileChuKy);
			deleteFile(fileConDau);
		}
	}
	
	public UserSign updateUserSign(long userId, long userSignId,
			long accountId, String maritimeCode, String title, String representative,
			String chungThuSoName, File chungThuSoFile,
			boolean deleteFileChungThuSo, String chuKySoName, File chuKySoFile,
			boolean deleteFileChuKySo, String conDauName, File conDauFile,
			boolean deleteFileConDau) 
		throws PortalException, SystemException {
		
		UserSign userSign = null;
		
		if(accountId > 0 && Validator.isNotNull(title)) {
			long chungThuSoId = 0;
			long chuKySoId = 0;
			long conDauId = 0;
			//User user = userPersistence.findByPrimaryKey(userId);
			
			//UserPort userPort = userPortPersistence.findByUserId(userId);
			User user = userPersistence.findByPrimaryKey(accountId);			
			UserPort userPort = userPortPersistence.fetchByUserId(accountId);
			userSign = userSignPersistence.fetchByUserId(accountId);
			
			if(userSign == null) {
				userSign = userSignPersistence.create(
					counterLocalService.increment(UserSign.class.getName()));
				userSign.setFileChungThuSoId(chungThuSoId);
				userSign.setFileChuKyId(chuKySoId);
				userSign.setFileConDauId(conDauId);
			}
			
			userSign.setUserId(accountId);
			
			if(Validator.isNotNull(maritimeCode)) {
				userSign.setPortCode(maritimeCode);
			} else if (userPort != null) {
				userSign.setPortCode(userPort.getPortCode());
			}
			
			userSign.setTitle(title);
			userSign.setRepresentative(representative);
			

			
			if(Validator.isNotNull(chungThuSoName)) {
				byte[] chungThuSoBytes = null;
				
				try {
					chungThuSoBytes = FileUtil.getBytes(chungThuSoFile);
					if (chungThuSoBytes != null) {
						chungThuSoId = DocumentUtils.uploadTaiLieu(chungThuSoBytes, userId, chungThuSoName);
					}
				}
				catch (IOException ioe) {
				}
				
				
			} /* SONVH comment 20170618
			else if (deleteFileChungThuSo){
				chungThuSoId = 0;
				
				deleteFile(userSign.getFileChungThuSoId());
			}*/
			
			if(Validator.isNotNull(chuKySoName)) {
				byte[] chuKySoBytes = null;
		
				try {
					chuKySoBytes = FileUtil.getBytes(chuKySoFile);
					if (chuKySoBytes != null) {
						chuKySoId = DocumentUtils.uploadTaiLieu(chuKySoBytes, userId, chuKySoName);	
					}
				}
				catch (IOException ioe) {
				}
				
				
			} /* SONVH comment 20170618
			else if (deleteFileChuKySo){
				chuKySoId = 0;
				
				deleteFile(userSign.getFileChuKyId());
			}*/
			
			if(Validator.isNotNull(conDauName)) {
				byte[] conDauBytes = null;
		
				try {
					conDauBytes = FileUtil.getBytes(conDauFile);
					if (conDauBytes != null) {
						conDauId = DocumentUtils.uploadTaiLieu(conDauBytes, userId, conDauName);
					}
				}
				catch (IOException ioe) {
				}
				
				
			} /* SONVH comment 20170618
			else if (deleteFileChungThuSo){
				conDauId = 0;
				
				deleteFile(userSign.getFileConDauId());
			}*/
			
			if (chungThuSoId > 0){
				userSign.setFileChungThuSoId(chungThuSoId);
			}
			if (chuKySoId > 0) {
				userSign.setFileChuKyId(chuKySoId);
			}
			if (conDauId > 0) {
				userSign.setFileConDauId(conDauId);
			}
			
			
			userSign.setModifyDate(new Date());
			userSign.setModifyUser(user.getEmailAddress());
			
			userSignPersistence.update(userSign, false);
		}
		
		return userSign;
	}
	
	public UserSign getByUserId(long userId) {
		UserSign userSign = null;
		
		try {
			userSign = userSignPersistence.fetchByUserId(userId);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return userSign;
	}
	
	public List<UserSign> getByPortCode(String portCode, int start, int end) {
		List<UserSign> userSigns = new ArrayList<UserSign>();
		
		try {
			if(Validator.isNotNull(portCode)) {
				userSigns = userSignPersistence.findByPortCode(portCode, start, end);
			} else {
				userSigns = userSignPersistence.findAll(start, end);
			}
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return userSigns;
	}
	
	public int countByPortCode(String portCode) {
		int cnt = 0;
		
		try {
			if(Validator.isNotNull(portCode)) {
				cnt = userSignPersistence.countByPortCode(portCode);
			} else {
				cnt = userSignPersistence.countAll();
			}
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return cnt;
	}
	
	private void deleteFile(long fileEntryId) {
		
		if(fileEntryId > 0) {
			try {
				DLAppLocalServiceUtil.deleteFileEntry(fileEntryId);
			} catch(Exception e) {
				_log.error(e);
			}
		}
	}
	
	private static final Log _log = LogFactoryUtil.getLog(UserSignLocalServiceImpl.class);
}