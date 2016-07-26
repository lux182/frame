/**
 *
 */
package com.banana.frame.domain.found;


import com.banana.frame.domain.found.enums.AccessType;
import com.banana.frame.domain.found.enums.VoucherType;

import javax.persistence.Entity;

/**
 * <p>凭证</p>
 *
 * @author Louis
 * @version $Id:com.banana.frame.domain.found.enums, v 0.1 2016/7/26 15:08 liuxuesi Exp $
 */
@Entity
    public abstract class Voucher extends BaseDomain {

    /**
     * 凭证号
     */
    private String voucherNo;
    /**
     * 原始凭证号
     */
    private String sourceVoucherNo;
    /**
     * 来源
     */
    private String source;
    /**
     * 关联原始凭证号
     */
    private String relatedSourceVoucherNo;
    /**
     * 发起方
     */
    private Access access;
    /**
     * 发起方类型
     */
    private AccessType accessType;
    /**
     * 产品码
     */
    private String productCode;
    /**
     * 扩展信息
     */
    private String extension;

    public abstract VoucherType getVoucherType();

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    public String getSourceVoucherNo() {
        return sourceVoucherNo;
    }

    public void setSourceVoucherNo(String sourceVoucherNo) {
        this.sourceVoucherNo = sourceVoucherNo;
    }

    public String getRelatedSourceVoucherNo() {
        return relatedSourceVoucherNo;
    }

    public void setRelatedSourceVoucherNo(String relatedSourceVoucherNo) {
        this.relatedSourceVoucherNo = relatedSourceVoucherNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

}
