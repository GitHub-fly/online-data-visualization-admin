package com.gene.repository;

import com.gene.model.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author xunmi
 * @ClassName RecordRepository
 * @Description TODO
 * @Date 2021/5/23
 * @Version 1.0.0
 */
public interface RecordRepository extends JpaRepository<Record, Integer> {

    /**
     * 根据上传类型 id，查询条数
     *
     * @param type
     * @return
     */
    int countByUploadType(Integer type);

}
