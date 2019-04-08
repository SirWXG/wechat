package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.Order;
import com.fengdi.wxapplet.db.entity.OrderExample;
import com.fengdi.wxapplet.db.mapper.OrderMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
   @Autowired
    private OrderMapper orderMapper;
}