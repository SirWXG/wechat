package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.FootPrint;
import com.fengdi.wxapplet.db.entity.FootPrintExample;
import com.fengdi.wxapplet.db.mapper.FootPrintMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* 用户浏览商品记录
* */
@Service
public class FootPrintService {
   @Autowired
    private FootPrintMapper footPrintMapper;
}