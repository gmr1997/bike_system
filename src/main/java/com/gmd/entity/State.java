package com.gmd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @Description STATE表对应的实体类，用于封装STATE表对应的一行数据
  * @Author GanMingRan
  * @Date   2019/7/2 20:41
  **/
@Data                   //自动生成get/set方法
@NoArgsConstructor      //自动生成无参构造方法
@AllArgsConstructor     //自动生成有参构造方法
public class State implements java.io.Serializable {

    private static final long serialVersionUID = -8368570991714304047L;
    /**
     * 维修状态编号
     */
    private Integer stateId;

    /**
     * 状态名称
     */
    private String stateName;
}