/**
 * 
 */
package vn.gt.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * @author win_64
 *
 */
public class CheckSessionLoginListener implements HttpSessionListener {

	static Log _log = LogFactoryUtil.getLog(CheckSessionLoginListener.class);

	public void sessionCreated(HttpSessionEvent arg0) {
		try {
			synchronized (this) {
				_log.debug("=====sessionCreated HttpSession=====" + arg0.getSession().getId() + "::" + arg0.getSession());
				System.out.println((ThemeDisplay) arg0.getSession().getAttribute(WebKeys.THEME_DISPLAY) + "===22222==sessionCreated HttpSession=====" + arg0.getSession().getId());
				System.out.println(arg0.getSource() + "===33333==sessionCreated HttpSession=====");
			}
		} catch (Exception es) {
			es.printStackTrace();
		}
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		try {
			synchronized (this) {
				_log.debug("=====sessionDestroyed HttpSession=====" + arg0.getSession().getId() + "::" + arg0.getSession());
				System.out.println("=====sessionDestroyed HttpSession=====" + arg0.getSession().getId() + "::" + arg0.getSession());
			}
		} catch (Exception es) {
			es.printStackTrace();
		}
	}
}
