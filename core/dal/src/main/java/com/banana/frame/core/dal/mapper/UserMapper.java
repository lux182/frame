package com.banana.frame.core.dal.mapper;

import com.banana.frame.core.dal.dataobject.CustomerDO;
import com.banana.frame.core.dal.entity.user.Customer;

import java.util.List;

/**
 * <p></p>
 *
 * @author Louis
 * @version $Id:com.banana.frame.core.dal.mapper, v 0.1 2016/7/28 16:52 liuxuesi Exp $
 */
public interface UserMapper {

    List<Customer> findCustomerList(CustomerDO customerDO);
}
