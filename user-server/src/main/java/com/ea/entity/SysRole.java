package com.ea.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 角色
 */
@Data
//@Entity
public class SysRole implements Serializable {
//    @Id
    private Integer rid; // 编号
    private String role; // 角色标识程序中判断使用,如"admin",这个是唯一的:
    private String description; // 角色描述,UI界面显示使用
    private Boolean available = Boolean.FALSE; // 是否可用,如果不可用将不会添加给用户

//    @ManyToMany(fetch= FetchType.EAGER)
//    @JoinTable(name="SysRolePermission",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="permissionId")})
    private List<SysPermission> permissions;// 角色和权限关系

    // 用户 - 角色关系定义;
//    @ManyToMany
//    @JoinTable(name="SysUserRole",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="uid")})
    private List<User> userInfos;// 一个角色对应多个用户

}
