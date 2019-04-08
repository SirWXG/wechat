package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.FeedBack;
import com.fengdi.wxapplet.db.entity.FeedBackExample;
import com.fengdi.wxapplet.db.mapper.FeedBackMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* 用户反馈接口
* */
@Service
public class FeedBackService {
  @Autowired
    private FeedBackMapper feedBackMapper;
}