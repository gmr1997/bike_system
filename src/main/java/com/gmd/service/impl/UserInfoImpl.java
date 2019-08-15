package com.gmd.service.impl;

import com.gmd.dao.UserInfoMapper;
import com.gmd.entity.UserInfo;
import com.gmd.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author GanMingRan
 * @Date 2019/6/24 11:05
 **/
@Service
public class UserInfoImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo userLogin(String userName, String userPassword) {
        return this.userInfoMapper.userLogin(userName, userPassword);
    }

    @Override
    public Integer userReg(UserInfo userInfo) {
        return this.userInfoMapper.insert(userInfo);
    }

    @Override
    public Integer updatePhoto(UserInfo userInfo) {
        return this.userInfoMapper.updatePhoto(userInfo);
    }
}
