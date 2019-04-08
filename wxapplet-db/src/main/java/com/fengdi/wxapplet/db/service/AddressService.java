package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.Address;
import com.fengdi.wxapplet.db.entity.AddressExample;
import com.fengdi.wxapplet.db.mapper.AddressMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {
   @Autowired
    private AddressMapper addressMapper;
}