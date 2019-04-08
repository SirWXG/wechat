package com.fengdi.wxapplet.hsgj.controller;

import com.fengdi.wxapplet.db.common.WxappletType;
import com.fengdi.wxapplet.db.service.RegionService;
import com.fengdi.wxapplet.hsgj.service.WxCacheManager;
import com.fengdi.wxapplet.hsgj.util.ResponseUtil;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2019/3/20.
 * 小程序地区接口
 */
@Controller
@RequestMapping("wx/region")
public class WxRegionController {
    @Autowired
    private RegionService regionService;


    @RequestMapping("/queryByPid")
    @ResponseBody
    public Object queryByPid(@NotNull Integer pid) {

       Map<String,Object> data=new HashMap<>();
       data.put("regionList",regionService.queryRegionByPid(pid));
        return  ResponseUtil.ok(data);
    }
}
