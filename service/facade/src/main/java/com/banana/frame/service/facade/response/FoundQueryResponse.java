/**
 *
 */
package com.banana.frame.service.facade.response;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * <p>Access查询结果</p>
 *
 * @author Louis
 * @version v 0.1 2016/7/26
 */
public class FoundQueryResponse extends BaseResponse {

    /**
     *
     */
    private static final long serialVersionUID = 5549499806566661825L;

    /**
     * AccessInfo的JSON
     */
    private String access;

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
