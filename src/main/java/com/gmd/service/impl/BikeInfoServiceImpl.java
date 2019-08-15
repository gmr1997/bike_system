package com.gmd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmd.dao.BikeInfoMapper;
import com.gmd.entity.BikeInfo;
import com.gmd.service.BikeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 单车模块实现类，用于实现单车模块的方法
 * @Author GanMingRan
 * @Date 2019/7/3 17:58
 **/
@Service
public class BikeInfoServiceImpl implements BikeInfoService {

    @Autowired
    private BikeInfoMapper bikeInfoMapper;

    @Override
    public PageInfo<BikeInfo> selectAll(Integer pageNumber) {
        //设置每页的信息(查询第一页，每页显示十行)
        PageHelper.startPage(pageNumber, 10);
        //调用Mapper层方法进行查询
        List<BikeInfo> list = this.bikeInfoMapper.selectAll();
        return new PageInfo<>(list);
    }
}
