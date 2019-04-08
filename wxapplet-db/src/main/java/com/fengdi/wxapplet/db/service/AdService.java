package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.Ad;
import com.fengdi.wxapplet.db.entity.AdExample;
import com.fengdi.wxapplet.db.mapper.AdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/3/20.
 */
@Service
public class AdService {
    @Autowired
    private AdMapper adMapper;
    public List<Ad> queryAll(){
        AdExample adExample=new AdExample();
        return adMapper.selectByExample(adExample);
    }
}
