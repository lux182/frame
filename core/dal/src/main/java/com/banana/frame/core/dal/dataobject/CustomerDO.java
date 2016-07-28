package com.banana.frame.core.dal.dataobject;

/**
 * <p>mybatis parameterType</p>
 *
 * @author Louis
 * @version $Id:com.banana.frame.core.dal.entity.user, v 0.1 2016/7/28 15:42 liuxuesi Exp $
 */
public class CustomerDO {
    private long id;
    private String firstName;
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
