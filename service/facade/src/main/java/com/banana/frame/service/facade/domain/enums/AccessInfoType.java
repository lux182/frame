/**
 *
 */
package com.banana.frame.service.facade.domain.enums;

import org.apache.commons.lang.StringUtils;


/**
 * <p>凭证入口</p>
 * @author Zhuxiangyu
 * @version $Id: AccessChannelInfo.java, v 0.1 2013-11-25 下午5:22:57 zhuxiangyu Exp $
 */
public enum AccessInfoType {
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

    AccessInfoType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据代码获取ENUM
     *
     * @param code
     * @return
     */
    public static AccessInfoType getByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }

        for (AccessInfoType type : AccessInfoType.values()) {
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
