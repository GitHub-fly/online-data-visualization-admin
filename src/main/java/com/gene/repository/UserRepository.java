package com.gene.repository;

import com.gene.model.dto.UserBehaviorDto;
import com.gene.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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
     *
     * @param roleId 角色 id
     * @return List<User>
     */
    List<User> findByRoleId(Integer roleId);

    /**
     * 根据账号查找用户信息
     *
     * @param account
     * @return
     */
    List<User> findByAccount(String account);


    /**
     * 查询用户基本行为信息
     *
     * @return
     */
    @Query(value = "SELECT NEW com.gene.model.dto.UserBehaviorDto " +
            "(u.account,u.nickname,u.isLogin,b.fileUploadNumber,b.connNumber )" +
            "FROM User u,UserBehavior b where u.userId = b.userId")
    List<UserBehaviorDto> queryUserBehavior();

    /**
     * 根据上传文件数排序
     *
     * @return
     */
    @Query(value = "SELECT NEW com.gene.model.dto.UserBehaviorDto " +
            "(u.account,u.nickname,u.isLogin,b.fileUploadNumber,b.connNumber )" +
            "FROM User u,UserBehavior b where u.userId = b.userId ORDER BY b.fileUploadNumber desc ")
    List<UserBehaviorDto> orderByFileNumber();

    /**
     * 根据连接数据库次数排序
     *
     * @return
     */
    @Query(value = "SELECT NEW com.gene.model.dto.UserBehaviorDto " +
            "(u.account,u.nickname,u.isLogin,b.fileUploadNumber,b.connNumber )" +
            "FROM User u,UserBehavior b where u.userId = b.userId ORDER BY b.connNumber desc ")
    List<UserBehaviorDto> orderByConnNumber();
}
