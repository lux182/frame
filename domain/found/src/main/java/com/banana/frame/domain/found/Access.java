/**
 *
 */
package com.banana.frame.domain.found;

/**
 * <p>凭证入口</p>
 */
public interface Access {

    /**
     * 设置凭证号
     *
     * @param voucherNo
     */
    void setVoucherNo(String voucherNo);

    String getReturnUrl();

}
