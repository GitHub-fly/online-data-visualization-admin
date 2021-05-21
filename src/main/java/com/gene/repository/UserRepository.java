package com.gene.repository;

import com.gene.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author xunmi
 * @ClassName UserRepository
 * @Description TODO
 * @Date 2021/5/20
 * @Version 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
