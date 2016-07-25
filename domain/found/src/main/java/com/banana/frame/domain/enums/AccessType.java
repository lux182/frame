/**
 *
 */
package com.banana.frame.domain.enums;

import org.apache.commons.lang.StringUtils;

/**
 * <p>凭证入口类型</p>
 * @author Zhuxiangyu
 * @version $Id: SenderType.java, v 0.1 2013-11-25 下午3:26:28 zhuxiangyu Exp $
 */
public enum AccessType {
    WEB("web","WEB"),
    GATEWAY("gateway","网关"),
    APP("app","移动APP"),
    INTERNAL("internal","内部系统"),
    ;

    /**
     * 代码
     */
    private final String code;
    /**
     * 信息
     */
    private final String message;

    AccessType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据代码获取ENUM
     *
     * @param code
     * @return
     */
    public static AccessType getByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }

        for (AccessType type : AccessType.values()) {
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
