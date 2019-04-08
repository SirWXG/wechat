package com.fengdi.wxapplet.db.mapper;

import com.fengdi.wxapplet.db.entity.FootPrint;
import com.fengdi.wxapplet.db.entity.FootPrintExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FootPrintMapper {
    long countByExample(FootPrintExample example);

    int deleteByExample(FootPrintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FootPrint record);

    int insertSelective(FootPrint record);

    List<FootPrint> selectByExample(FootPrintExample example);

    FootPrint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FootPrint record, @Param("example") FootPrintExample example);

    int updateByExample(@Param("record") FootPrint record, @Param("example") FootPrintExample example);

    int updateByPrimaryKeySelective(FootPrint record);

    int updateByPrimaryKey(FootPrint record);
}