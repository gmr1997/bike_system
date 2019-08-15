package com.gmd.service;

import com.github.pagehelper.PageInfo;
import com.gmd.entity.BikeInfo;

/**
 * @Description 单车模块接口，用于定义单车模块的方法
 * @Author GanMingRan
 * @Date 2019/7/3 17:54
 **/
public interface BikeInfoService {

    /**
     * 查询所有单车信息
     * @param pageNumber 查询的页数（第几页）
     * @return 返回com.github.pagehelper.PageInfo<BikeInfo>类型的实例
     */
    public abstract PageInfo<BikeInfo> selectAll(Integer pageNumber);
}
