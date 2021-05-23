package com.gene.model.dto;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserBehaviorDto {
    /**
     * 账号
     */
    private String account;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 是否登录
     */
    private Integer isLogin;
    /**
     * 用户文件上传次数
     */
    private Integer fileUploadNumber;
    /**
     * 数据库连接次数
     */
    private Integer connNumber;
}
