package com.fengdi.wxapplet.hsgj.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fengdi.wxapplet.db.common.WxappletType;
import com.fengdi.wxapplet.db.entity.User;
import com.fengdi.wxapplet.db.service.UserService;
import com.fengdi.wxapplet.hsgj.util.ResponseUtil;
import com.mysql.fabric.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.awt.List;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author LZP
 * @Created by Administrator on 2019/3/22 0022.
 */
@Controller
@RequestMapping("/wx/userinfo")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/getuserinfo")
    public Object user(User user){
        //判断用户是否存在
        if (userService.queryUser(user)!=null){
            ExecutorService executorService= Executors.newFixedThreadPool(10);
            Map<String,Object> data = new HashMap<>();
            Callable<List> listCallable =()-> (List) userService.findUserByIdAndLevel(user);
            FutureTask<List> futureTask = new FutureTask<List>(listCallable);
            executorService.submit(futureTask);
            try {
                data.put("userList",futureTask.get());
            }catch (Exception e){
                e.printStackTrace();
            }
            return ResponseUtil.ok(data);
        }
        else {
            System.out.println("用户不存在，请注册！！！！");
            return  null;    }
    }
}
