package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.OrderItem;
import com.fengdi.wxapplet.db.entity.OrderItemExample;
import com.fengdi.wxapplet.db.mapper.OrderItemMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderItemService {
    @Autowired
    private OrderItemMapper orderItemMapper;
}