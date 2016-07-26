/**
 *
 */
package com.banana.frame.service.facade.domain.enums;

import org.apache.commons.lang.StringUtils;

/**
 * <p>凭证信息类型</p>
 * @author Zhuxiangyu
 * @version $Id: VoucherInfo.java, v 0.1 2013-11-25 下午5:22:46 zhuxiangyu Exp $
 */
public enum VoucherInfoType {


    TRADE("trade","交易"),
    SIMPLE_ORDER("simpleOrder","简单交易"),
    PAYMENT("payment","支付"),
    REFUND("refund","退款"),
    CONTROL("control","控制"),
    ;

    /**
     * 代码
     */
    private final String code;
    /**
     * 信息
     */
    private final String message;

    VoucherInfoType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据代码获取ENUM
     *
     * @param code
     * @return
     */
    public static VoucherInfoType getByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }

        for (VoucherInfoType type : VoucherInfoType.values()) {
            if (type.getCode().equalsIgnoreCase(code)) {
                return type;
            }
        }

        return null;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
