package vn.gt.utils;

import org.tempuri.IMTService;
import org.tempuri.MTService;
import org.tempuri.MTServiceLocator;

import vn.dtt.duongbo.ws.MessageAndResponseImpl;
import vn.dtt.duongbo.ws.MessageAndResponseImplService;
import vn.dtt.duongbo.ws.MessageAndResponseImplServiceLocator;

public class CallWs2HaiQuan {
	
	public static IMTService getIMTSercice() {
		try {
			// MTServiceLocator mtServiceLocator = new MTServiceLocator();
			MTService mtService = new MTServiceLocator();
			IMTService imtService = mtService.getBasicHttpBinding_IMTService();
			return imtService;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * webserivce url v2 04/2018
	 * 
	 * @return
	 *//*
	public static IMTextService getIMTextSercice() {
		try {
			MTextService mtService = new MTextServiceLocator();
			IMTextService imtService = mtService.getBasicHttpBinding_IMTextService();
			return imtService;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}*/
	
	public static MessageAndResponseImpl getMessageAndResponseImpl() {
		try {
			// MTServiceLocator mtServiceLocator = new MTServiceLocator();
			MessageAndResponseImplService mtService = new MessageAndResponseImplServiceLocator();
			MessageAndResponseImpl imtService = mtService.getMessageAndResponseImpl();
			return imtService;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
