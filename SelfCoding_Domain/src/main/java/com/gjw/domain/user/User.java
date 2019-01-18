package com.gjw.domain.user;

import com.gjw.domain.base.BaseEntity;

/**
 * @Auther: zz-gjw
 * @Date: 2019/1/15 11:26
 * @Description:
 */
public class User extends BaseEntity {
    private int id;
    private String phone;
    private String password;
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
