package com.fengdi.wxapplet.db.mapper;

import com.fengdi.wxapplet.db.entity.Groupon;
import com.fengdi.wxapplet.db.entity.GrouponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GrouponMapper {
    long countByExample(GrouponExample example);

    int deleteByExample(GrouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Groupon record);

    int insertSelective(Groupon record);

    List<Groupon> selectByExample(GrouponExample example);

    Groupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Groupon record, @Param("example") GrouponExample example);

    int updateByExample(@Param("record") Groupon record, @Param("example") GrouponExample example);

    int updateByPrimaryKeySelective(Groupon record);

    int updateByPrimaryKey(Groupon record);
}