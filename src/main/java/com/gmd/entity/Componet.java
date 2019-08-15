package com.gmd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @Description COMPONET表对应的实体类，用于封装COMPONET表对应的一行数据
  * @Author GanMingRan
  * @Date   2019/7/2 20:42
  **/
@Data                   //自动生成get/set方法
@NoArgsConstructor      //自动生成无参构造方法
@AllArgsConstructor     //自动生成有参构造方法
public class Componet implements java.io.Serializable{

    private static final long serialVersionUID = -4146587346700397938L;
    /**
     * 部件编号
     */
    private Integer componetId;

    /**
     * 部件名称
     */
    private String componetName;
}