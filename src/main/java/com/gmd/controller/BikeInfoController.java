package com.gmd.controller;

import com.github.pagehelper.PageInfo;
import com.gmd.entity.BikeInfo;
import com.gmd.service.BikeInfoService;
import com.gmd.vo.ResultValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 单车模块控制层
 * @Author GanMingRan
 * @Date 2019/7/3 19:02
 **/
@RestController
public class BikeInfoController {

    @Autowired
    private BikeInfoService bikeInfoService;

    /**
     * 查询所有单车信息
     * @param pageNumber 查询第几页的单车信息
     * @return
     */
    @RequestMapping(value = "/selectAll")
    public ResultValue selectAll(@RequestParam("pageNumber") Integer pageNumber){

        ResultValue rv = new ResultValue();

        try {
            PageInfo<BikeInfo> pageInfo = this.bikeInfoService.selectAll(pageNumber);
//          List<BikeInfo> list = pageInfo.getList();
            if (pageInfo.getList() != null && pageInfo.getList().size() > 0){
                rv.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("pageInfo", pageInfo);
                rv.setDataMap(map);
                return rv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        rv.setCode(1);
        rv.setMessage("查询失败！");
        return rv;
    }
}
