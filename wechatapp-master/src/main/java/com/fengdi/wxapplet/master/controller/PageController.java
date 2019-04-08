package com.fengdi.wxapplet.master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lks on 2019/3/27.
 */
@Controller
@RequestMapping("/admin")
public class PageController {

    @RequestMapping("loginpage")
    public String login(){
        return "login";
    }
}
