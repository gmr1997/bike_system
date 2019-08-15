package com.gmd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
  * @Description  BIKE_INFO表对应的实体类，用于封装BIKE_INFO表中对应一行数据
  * @Author GanMingRan
  * @Date   2019/7/2 20:39
  **/
@Data                   //自动生成get/set方法
@NoArgsConstructor      //自动生成无参构造方法
@AllArgsConstructor     //自动生成有参构造方法
public class BikeInfo implements java.io.Serializable {

    private static final long serialVersionUID = 6586161511004276089L;

    /**
     * 单车id
     */
    private Integer thebikeId;

    /**
     * 单车编号
     */
    private String thebikeCode;

    /**
     * 单车地址
     */
    private String thebikeAddress;

    /**
     * 单车部件编号
     */
    private Integer thecomponetId;

    /**
     * 顺坏情况
     */
    private String thebreakage;

    /**
     * 上报时间
     */
    private Date thereportTime;

    /**
     * 维修状态编号
     */
    private Integer thestateId;
}