package com.gene.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @Author xunmi
 * @ClassName User
 * @Description TODO
 * @Date 2021/5/20
 * @Version 1.0.0
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_user")
public class User {

    /**
     * 用户id
     */
    @Id
    private Integer userId;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 是否登录
     */
    private Boolean isLogin;

    /**
     * 是否被删除
     */
    private Boolean isDisabled;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

}
