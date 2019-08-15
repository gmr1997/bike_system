package com.gmd.dao;

import com.gmd.entity.BikeInfo;
import java.util.List;

public interface BikeInfoMapper {
    int deleteByPrimaryKey(Integer thebikeId);

    int insert(BikeInfo record);

    BikeInfo selectByPrimaryKey(Integer thebikeId);

    List<BikeInfo> selectAll();

    int updateByPrimaryKey(BikeInfo record);
}