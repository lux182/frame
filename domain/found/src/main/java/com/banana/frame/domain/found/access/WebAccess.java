/**
 *
 */
package com.banana.frame.domain.found.access;


import com.banana.frame.domain.found.Access;
import com.banana.frame.domain.found.BaseDomain;


/**
 * <p>WEB入口</p>
 *
 * @author Zhuxiangyu
 * @version $Id: WalletSender.java, v 0.1 2013-11-14 下午3:13:09 zhuxiangyu Exp $
 */
public class WebAccess extends BaseDomain implements Access {

    /**
     * 请求IP
     */
    private String requestIp;
    /**
     * MAC地址
     */
    private String mac;
    /**
     * 请求浏览器
     */
    private String browser;
    /**
     * 浏览器版本
     */
    private String browserVersion;
    /**
     * 凭证号
     */
    private String voucherNo;
    /**
     * 页面跳转同步通知页面路径
     */
    private String returnUrl;

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    @Override
    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

}
