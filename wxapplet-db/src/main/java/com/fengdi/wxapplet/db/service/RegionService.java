package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.Region;
import com.fengdi.wxapplet.db.entity.RegionExample;
import com.fengdi.wxapplet.db.mapper.RegionMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* 省市地区接口
* */
@Service
public class RegionService {
    @Autowired
    private RegionMapper regionMapper;

    //通过父id查询对应的地区
    public List<Region> queryRegionByPid(Integer pid){
        RegionExample example=new RegionExample();
        example.or().andPidEqualTo(pid);
        return regionMapper.selectByExample(example);
    }
}