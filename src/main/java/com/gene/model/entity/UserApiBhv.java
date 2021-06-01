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
 * @ClassName UserApiBhv
 * @Description TODO
 * @Date 2021/5/31
 * @Version 1.0.0
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_api_bhv")
public class UserApiBhv {

    /**
     * 接入数据类型id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户 id
     */
    private Integer userId;

    /**
     * 操纵的数据行数
     */
    private Integer dataCount;

    /**
     * 所调接口名
     */
    private String apiName;

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
