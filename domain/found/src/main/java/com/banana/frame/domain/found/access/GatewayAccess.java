/**
 *
 */
package com.banana.frame.domain.found.access;


import com.banana.frame.domain.found.Access;
import com.banana.frame.domain.found.BaseDomain;


/**
 * <p>网关入口</p>
 *
 * @author Zhuxiangyu
 * @version $Id: GatewaySender.java, v 0.1 2013-11-14 下午3:11:44 zhuxiangyu Exp $
 */
public class GatewayAccess extends BaseDomain implements Access {

    /**
     * 凭证号
     */
    private String voucherNo;
    /**
     * 接口名称
     */
    private String service;
    /**
     * 合作者ID
     */
    private String partnerId;
    /**
     * 参数编码字符集
     */
    private String inputCharset;
    /**
     * 签名
     */
    private String sign;
    /**
     * 签名方式
     */
    private String signType;
    /**
     * 页面跳转同步通知页面路径
     */
    private String returnUrl;
    /**
     * 原始参与方信息
     */
    private String sourceParty;
    /**
     * 操作员Id
     */
    private String operatorId;
    /**
     * 买方IP
     */
    private String buyerIp;
    /**
     * 请求网关的链接
     */
    private String referUrl;
    /**
     * 服务器异步通知页面路径
     */
    private String notifyUrl;

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReferUrl() {
        return referUrl;
    }

    public void setReferUrl(String referUrl) {
        this.referUrl = referUrl;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    @Override
    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getInputCharset() {
        return inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getSourceParty() {
        return sourceParty;
    }

    public void setSourceParty(String sourceParty) {
        this.sourceParty = sourceParty;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getBuyerIp() {
        return buyerIp;
    }

    public void setBuyerIp(String buyerIp) {
        this.buyerIp = buyerIp;
    }

}
