package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.CouponUser;
import com.fengdi.wxapplet.db.entity.CouponUserExample;
import com.fengdi.wxapplet.db.mapper.CouponUserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* 用户优惠券接口
* */
@Service
public class CouponUserService {
    @Autowired
    private CouponUserMapper couponUserMapper;
}