package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.Review;
import com.fengdi.wxapplet.db.entity.ReviewExample;
import com.fengdi.wxapplet.db.mapper.ReviewMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
 *商品，专题接口
 * */
@Service
public class ReviewService {
  @Autowired
    private ReviewMapper reviewMapper;
}