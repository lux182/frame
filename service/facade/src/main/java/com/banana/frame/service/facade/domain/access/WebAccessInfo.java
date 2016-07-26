/**
 *
 */
package com.banana.frame.service.facade.domain.access;


import com.banana.frame.service.facade.domain.enums.AccessInfoType;

import java.io.Serializable;

/**
 * <p>WEB入口信息</p>
 *
 * @author Zhuxiangyu
 * @version $Id: WalletInfo.java, v 0.1 2013-11-14 下午1:33:06 zhuxiangyu Exp $
 */
public class WebAccessInfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4836813547988826463L;

    /**
     * 页面跳转同步通知页面路径
     */
    private String returnUrl;
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
     * 备注
     */
    private String memo;

    public static String accessType() {
        return AccessInfoType.WEB.getCode();
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
