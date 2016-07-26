/**
 *
 */
package com.banana.frame.service.facade.domain.enums;

import org.apache.commons.lang.StringUtils;

/**
 * <p>控制凭证类型</p>
 * @author Zhuxiangyu
 * @version $Id: ControlType.java, v 0.1 2013-11-28 下午4:20:19 zhuxiangyu Exp $
 */
public enum ControlType {

    SETTLE("settle",""),
    MODIFY_AMOUNT("modifyAmount",""),
    TRADE_CANCEL("tradeCancel",""),
    FROZEN("frozen",""),
    BATCH_WITHDRAW("batchWithdraw",""),
    ;


    /**
     * 代码
     */
    private final String code;
    /**
     * 信息
     */
    private final String message;

    ControlType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据代码获取ENUM
     *
     * @param code
     * @return
     */
    public static ControlType getByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }

        for (ControlType type : ControlType.values()) {
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
