package com.gmd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
  * @Description USERS_INFO表对应的实体类，用于封装USERS_INFO表中的一行信息
  * @Author GanMingRan
  * @Date   2019/6/23 23:04
  **/
@Data                   //自动生成get/set方法
@NoArgsConstructor      //自动生成无参构造方法
@AllArgsConstructor     //自动生成有参构造方法
public class UserInfo implements java.io.Serializable{

    private static final long serialVersionUID = -7333058567132357663L;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户性别
     */
    private Integer userSex;

    /**
     * 用户电话
     */
    private String userTel;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户头像
     */
    private String userPic;

    /**
     * 注册时间
     */
    private Date regTime;

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSex=" + userSex +
                ", userTel='" + userTel + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPic='" + userPic + '\'' +
                ", regTime=" + regTime +
                '}';
    }
}