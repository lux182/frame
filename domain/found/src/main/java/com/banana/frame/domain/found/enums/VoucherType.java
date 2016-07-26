/**
 *
 */
package com.banana.frame.domain.found.enums;

import org.apache.commons.lang.StringUtils;

/**
 * <p>凭证类型</p>
 *
 * @author Zhuxiangyu
 * @version $Id: VoucherType.java, v 0.1 2013-11-25 下午3:26:06 zhuxiangyu Exp $
 */
public enum VoucherType {
    TRADE("trade", "交易", "101"),
    SIMPLE_ORDER("simpleOrder", "简单交易", "102"),
    REFUND("refund", "退款", "103"),
    CONTROL("control", "控制", "201"),
    PAYMENT("payment", "支付", "301"),;

    /**
     * 代码
     */
    private final String code;
    /**
     * 信息
     */
    private final String message;

    /**
     * 生成凭证号用的标记
     */
    private final String flag;

    VoucherType(String code, String message, String flag) {
        this.code = code;
        this.message = message;
        this.flag = flag;
    }

    /**
     * 根据代码获取ENUM
     *
     * @param code
     * @return
     */
    public static VoucherType getByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }

        for (VoucherType type : VoucherType.values()) {
            if (type.getCode().equalsIgnoreCase(code)) {
                return type;
            }
        }

        return null;
    }

    public String getFlag() {
        return flag;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
