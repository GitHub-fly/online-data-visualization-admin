package com.gene.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @Author xunmi
 * @ClassName DataType
 * @Description TODO
 * @Date 2021/5/22
 * @Version 1.0.0
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_datatype")
public class DataType {

    /**
     * 接入数据类型id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 接入源封面图
     */
    private String cover;

    /**
     * 接入源名称
     */
    private String name;

    /**
     * 是否被删除
     * 0 -> 删除
     * 1 -> 未删除
     */
    private Integer isDisabled;

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
