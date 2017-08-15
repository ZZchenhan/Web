package com.ch.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86936
 * Date: 2017-08-15
 * Time: 14:44
 */
public class AccountEntity implements Serializable{
    private long id;
    private String userName;
    private String psw;
    private String email;
    private String mobile;

    public AccountEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
