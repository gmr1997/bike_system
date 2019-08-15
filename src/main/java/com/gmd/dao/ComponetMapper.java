package com.gmd.dao;

import com.gmd.entity.Componet;
import java.util.List;

public interface ComponetMapper {
    int deleteByPrimaryKey(Integer componetId);

    int insert(Componet record);

    Componet selectByPrimaryKey(Integer componetId);

    List<Componet> selectAll();

    int updateByPrimaryKey(Componet record);
}