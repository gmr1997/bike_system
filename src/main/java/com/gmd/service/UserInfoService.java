package com.gmd.service;

import com.gmd.entity.UserInfo;

/**
 * @Description
 * @Author GanMingRan
 * @Date 2019/6/24 8:13
 **/
public interface UserInfoService {

    /**
     * 用户登录方法
     * @param userName 用户名
     * @param userPassword 用户密码
     * @return 成功返回com.gmd.entity.UserInfo类型的实例，否则返回null
     */
    public abstract UserInfo userLogin(String userName, String userPassword);

    /**
     * 用户注册方法
     * @param userInfo 注册用户的用户信息
     * @return 成功返回大于0的整数，否则返回0
     */
    public abstract Integer userReg(UserInfo userInfo);

    /**
     * 修改用户头像
     * @param userInfo 用户信息
     * @return
     */
    public abstract Integer updatePhoto(UserInfo userInfo);
}
