package com.fengdi.wxapplet.db.mapper;

import com.fengdi.wxapplet.db.entity.HotKeyWord;
import com.fengdi.wxapplet.db.entity.HotKeyWordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotKeyWordMapper {
    long countByExample(HotKeyWordExample example);

    int deleteByExample(HotKeyWordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotKeyWord record);

    int insertSelective(HotKeyWord record);

    List<HotKeyWord> selectByExample(HotKeyWordExample example);

    HotKeyWord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotKeyWord record, @Param("example") HotKeyWordExample example);

    int updateByExample(@Param("record") HotKeyWord record, @Param("example") HotKeyWordExample example);

    int updateByPrimaryKeySelective(HotKeyWord record);

    int updateByPrimaryKey(HotKeyWord record);
}