package com.fengdi.wxapplet.hsgj.controller;

import com.fengdi.wxapplet.hsgj.service.WxCacheManager;
import com.fengdi.wxapplet.hsgj.util.SSMSend;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/21.
 */
@Controller
@RequestMapping("wx/ssm")
public class SSMessageController {

    @RequestMapping("/sendCode")
    public void queryCode(String mobile){
         //生成6位随机数字
         Integer code= (int) ((Math.random()*9+1)*100000);
        System.out.println(code+"!!!!!!!!!!!!!!!");
        Map templeteMap=new HashMap<>();
        templeteMap.put("#code#",code);
        WxCacheManager.loadData("ssmCode",templeteMap);
        SSMSend.sendMessage(mobile,templeteMap);
    }


}
