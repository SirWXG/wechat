package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.Admin;
import com.fengdi.wxapplet.db.entity.AdminExample;
import com.fengdi.wxapplet.db.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin query(Admin admin) {
        AdminExample adminExample=new AdminExample();
        adminExample.or().andUsernameEqualTo(admin.getUsername()).andPasswordEqualTo(admin.getPassword());
       return adminMapper.queryAdmin(adminExample);
    }
    public void regist(Admin admin){
        adminMapper.insert(admin);
    }

}