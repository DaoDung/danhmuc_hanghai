package vn.gt.payment.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.gt.payment.keypay.model.KeyPay;
import vn.gt.payment.util.PaymentMgtUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class KeyPayServlet extends HttpServlet {

	private static Log _log = LogFactoryUtil.getLog(KeyPayServlet.class);

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		_log.info("=====KeyPayServlet===doGet()");

		KeyPay keyPay = new KeyPay(request);
		
		PaymentMgtUtil.runKeyPayGateData(request, response, keyPay);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		_log.info("=====KeyPayServlet===doPost():" + request);
		
		KeyPay keyPay = new KeyPay(request);
		
		PaymentMgtUtil.runKeyPayGateData(request, response, keyPay);

	}
}
