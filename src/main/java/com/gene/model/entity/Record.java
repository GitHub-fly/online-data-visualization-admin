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
 * @ClassName Recode
 * @Description TODO
 * @Date 2021/5/23
 * @Version 1.0.0
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_record")
public class Record {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户 id
     */
    private Integer userId;

    /**
     * 父级 id
     */
    private Integer parentId;


    /**
     * 名字
     */
    private String name;

    /**
     * 文件上传类型
     * 0 -> csv
     * 1 -> excel
     * 2 -> 数据库表
     */
    private Integer uploadType;

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
