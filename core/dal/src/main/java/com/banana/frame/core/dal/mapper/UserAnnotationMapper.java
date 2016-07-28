/**
 *
 */
package com.banana.frame.core.dal.mapper;

import com.banana.frame.core.dal.dataobject.CustomerDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * @author Siva
 */
public interface UserAnnotationMapper {
    @Insert("insert into users(name,email) values(#{name},#{email})")
    @SelectKey(statement = "call identity()", keyProperty = "id", before = false, resultType = Integer.class)
    void insertUser(CustomerDO customerDOustomerDO);

    @Select("select id, name, email from users WHERE id=#{id}")
    CustomerDO findUserById(Integer id);

    @Select("select id, name, email from users")
    List<CustomerDO> findAllUsers();

}
