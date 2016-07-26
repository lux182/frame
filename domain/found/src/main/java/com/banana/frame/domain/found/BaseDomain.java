/**
 *
 */
package com.banana.frame.domain.found;

import java.util.Date;

/**
 * <p>基础DOMAIN</p>
 *
 * @author Zhuxiangyu
 * @version $Id: BaseDomain.java, v 0.1 2013-11-14 下午3:06:25 zhuxiangyu Exp $
 */
public class BaseDomain {

    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 最后更新时间
     */
    private Date gmtModified;
    /**
     * 备注
     */
    private String memo;

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

}
