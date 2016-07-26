package com.banana.frame.service.facade.request;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Louis
 * @version v 0.1 2016/7/2614:03
 */
public class FoundRequest implements Serializable {

    private static final long serialVersionUID = 372673984535024824L;


    private String foundType;

    public String getFoundType() {
        return foundType;
    }

    public void setFoundType(String foundType) {
        this.foundType = foundType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
