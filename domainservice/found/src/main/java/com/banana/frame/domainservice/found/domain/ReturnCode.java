/**
 *
 */
package com.banana.frame.domainservice.found.domain;

import org.apache.commons.lang.StringUtils;

/**
 * <p>返回码</p>
 *
 */
public enum ReturnCode {

    SUCCESS("S0001", "操作成功"),
    FAILED("F0001", "操作失败"),
    ILLEGAL_ARGUMENT("F0002", "参数校验失败"),
    UNKOWN_EXCEPTION("E9999", "未知异常"),
    VOUCHER_EXISTED("F0010", "凭证号已存在"),
    DIFFERENT_NO_VOUCHER_EXISTED("F0011", "凭证已存在但凭证号与传入凭证号不符"),;

    private String code;

    private String name;

    private ReturnCode(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public static ReturnCode getByCode(String code) {
        for (ReturnCode value : ReturnCode.values()) {
            if (StringUtils.equals(value.getCode(), code)) {
                return value;
            }
        }
        return null;
    }

}
