package com.gene.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Integer isLogin;

    /**
     * 是否被删除
     */
    private Integer isDisabled;
    /**
     * 性别
     */
    private String sex;
    /**
     * 居住地
     */
    private String hometown;

    /**
     * 创建时间
     */
    @CreatedDate
    private Timestamp createTime;

    /**
     * 更新时间
     */
    @LastModifiedDate
    private Timestamp updateTime;

}
