package com.ea.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户
 */
@Data
public class User implements Serializable {

    private Long uid;
    private String username;
    private String password;
    private String salt;//加密密码的盐
    private byte state;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
    private String phone;
    private String email;
    private Date created;
    private Date updated;
    private List<SysRole> roleList;// 一个用户具有多个角色

    public User() {}

    /**
     * @param username username
     * @param password password
     * @param phone phone
     * @param email email
     */
    public User(String username, String password, String phone, String email) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    /**
     * 密码盐:  重新对盐重新进行了定义，用户名+salt，这样就更加不容易被破解
     */
    public String getCredentialsSalt(){
        return this.username+this.salt;
    }

    public String show() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", state=" + state +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", roleList=" + roleList +
                '}';
    }
}