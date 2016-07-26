/**
 *
 */
package com.banana.frame.service.facade.response;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * <p>基础返回对象</p>
 *
 * @author Louis
 * @version v 0.1 2016/7/26
 */
public class BaseResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6747497471597051328L;

    /**
     * 返回码
     */
    private String returnCode;
    /**
     * 返回描述
     */
    private String returnMessage;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
