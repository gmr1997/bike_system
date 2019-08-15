package com.gmd.vo;

import lombok.Data;

import java.util.Map;

/**
 * @Description 定义本项目所有的Contorller返回的结果
 * @Author GanMingRan
 * @Date 2019/6/24 12:02
 **/
@Data
public class ResultValue implements java.io.Serializable{

    private static final long serialVersionUID = 2839742582653883114L;

    /**
     * 设置当前返回结果的状态：0表示成功，1表示失败
     */
    private Integer code;

    /**
     * 设置返回的信息
     */
    private String message;

    /**
     * 设置返回的数据
     */
    private Map<String, Object> dataMap;
}

