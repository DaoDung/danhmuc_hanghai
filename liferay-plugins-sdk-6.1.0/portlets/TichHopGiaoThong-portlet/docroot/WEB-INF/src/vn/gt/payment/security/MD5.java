
package vn.gt.payment.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class MD5 {
    private static final Log log = LogFactoryUtil.getLog(MD5.class);

    public String getMD5Hash(String value)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        log.info("String input secure : " + value);
        final StringBuilder sbMd5Hash = new StringBuilder();
        final MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(value.getBytes("UTF-8"));

        final byte data[] = m.digest();

        for (byte element : data) {
            sbMd5Hash.append(Character.forDigit((element >> 4) & 0xf, 16));
            sbMd5Hash.append(Character.forDigit(element & 0xf, 16));
        }        
        return sbMd5Hash.toString();
    }
}
