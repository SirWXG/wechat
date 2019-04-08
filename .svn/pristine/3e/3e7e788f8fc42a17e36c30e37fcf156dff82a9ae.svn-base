package com.fengdi.wxapplet.master.controller;

import com.fengdi.wxapplet.db.entity.Admin;
import com.fengdi.wxapplet.db.service.AdminService;
import com.fengdi.wxapplet.master.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2019/3/23.
 */
@Controller
@RequestMapping("/admin")
public class ManagerController {
    @Autowired
    private AdminService adminService;
    //通过用户名密码校验管理员用户
    @RequestMapping("login")
    @ResponseBody
    public Object login(Admin admin, HttpSession session){
        Admin dbAdmin=new Admin();
        try{
            dbAdmin=adminService.query(admin);
        }catch (Exception e){
            e.printStackTrace();
        }
       if(dbAdmin==null && dbAdmin.getUsername()==null){
           return ResponseUtil.fail(505,"管理员用户名或密码错误");
       }
       session.setAttribute("admin",dbAdmin);
       return ResponseUtil.ok();
    }
    @RequestMapping("regist")
    @ResponseBody
    public Object regist(Admin admin, HttpSession session){
        Admin dbAdmin=new Admin();
        try{
            dbAdmin=adminService.query(admin);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(dbAdmin!=null && dbAdmin.getUsername()!=null){
            return ResponseUtil.fail(505,"该管理员用已存在！");
        }
        try {
            adminService.regist(admin);
        }catch (Exception e){
            e.printStackTrace();
        }
        session.setAttribute("admin",admin);
        return ResponseUtil.ok("管理员注册成功",admin);
    }


}
