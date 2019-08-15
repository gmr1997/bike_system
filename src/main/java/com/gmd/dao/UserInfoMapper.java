package com.gmd.dao;

import com.gmd.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo userInfo);

    UserInfo selectByPrimaryKey(Integer userId);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    /**
     * 用户登录方法
     * @param userName 用户名
     * @param userPassword 用户密码
     * @return
     */
    public abstract UserInfo userLogin(@Param("userName") String userName, @Param("userPassword") String userPassword);

    /**
     * 修改用户头像
     * @param userInfo 用户信息
     * @return
     */
    public abstract Integer updatePhoto(UserInfo userInfo);
}