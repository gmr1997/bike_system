package com.gmd.controller;

import com.gmd.common.UploadUtils;
import com.gmd.entity.BikeInfo;
import com.gmd.entity.UserInfo;
import com.gmd.service.BikeInfoService;
import com.gmd.service.UserInfoService;
import com.gmd.vo.ResultValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 用户模块控制层
 * @Author GanMingRan
 * @Date 2019/6/24 11:32
 **/
//@CrossOrigin //加这个注解可以解决跨域问题，但是这个是允许所有域的请求，所以不安全，工作中一般使用com.gmd.common/CorsConfig.java解决跨域
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 用户登录
     * @param userName 用户名
     * @param userPassword 密码
     * @return
     */
    @RequestMapping(value = "/userLogin")
    public ResultValue userLogin(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword) {
        ResultValue rv = new ResultValue();

        try {
            UserInfo login = this.userInfoService.userLogin(userName, userPassword);
            if (login != null) {
                rv.setCode(0);
                rv.setMessage("登录成功！");
                Map<String, Object> map = new HashMap<>();
                map.put("loginUser", login);
                rv.setDataMap(map);
                return rv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rv.setCode(1);
        rv.setMessage("登录失败！");
        return rv;
    }

    /**
     * 用户注册
     * @param userInfo 用户注册信息
     * @return
     */
    @RequestMapping(value = "/userReg")
    public ResultValue userReg(UserInfo userInfo) {
        ResultValue rv = new ResultValue();

        try {
            Integer reg = this.userInfoService.userReg(userInfo);
            if (reg > 0) {
                rv.setCode(0);
                rv.setMessage("注册成功！");
                return rv;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        rv.setCode(1);
        rv.setMessage("注册失败！");
        return rv;
    }


    @RequestMapping(value = "/updatePhoto")
    public ResultValue updatePhoto(UserInfo userInfo){
        ResultValue rv = new ResultValue();
        try {
            Integer updatePhoto = this.userInfoService.updatePhoto(userInfo);
            if(updatePhoto > 0){
                rv.setCode(0);
                return rv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        rv.setMessage("修改头像失败！");
        rv.setCode(1);
        return rv;
    }

}
