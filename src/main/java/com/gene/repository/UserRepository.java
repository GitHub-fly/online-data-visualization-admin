package com.gene.repository;

import com.gene.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author xunmi
 * @ClassName UserRepository
 * @Description TODO
 * @Date 2021/5/20
 * @Version 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * 根据就角色 id 查询用户的基本信息
     * @param roleId 角色 id
     * @return List<User>
     */
    List<User> findByRoleId(Integer roleId);
}
