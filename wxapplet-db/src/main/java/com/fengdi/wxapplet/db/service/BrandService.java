package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/3/20.
 * 品牌商接口
 */
@Service
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;
}
