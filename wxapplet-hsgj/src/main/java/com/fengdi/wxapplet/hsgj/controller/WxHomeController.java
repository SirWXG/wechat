package com.fengdi.wxapplet.hsgj.controller;

import com.fengdi.wxapplet.db.common.WxappletType;
import com.fengdi.wxapplet.db.entity.Category;
import com.fengdi.wxapplet.db.service.CategoryService;
import com.fengdi.wxapplet.hsgj.service.WxCacheManager;
import com.fengdi.wxapplet.hsgj.service.WxCategory;
import com.fengdi.wxapplet.hsgj.util.ResponseUtil;
import com.mysql.fabric.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2019/3/19.
 */
@Controller
@RequestMapping("wx/")
public class WxHomeController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private WxCategory wxCategory;
    @ResponseBody
    @RequestMapping("/home")
    public Object home(Integer userId){
        if(WxCacheManager.hasData(WxCacheManager.INDEX)){
            return ResponseUtil.ok(WxCacheManager.getCacheData(WxCacheManager.INDEX));
        }
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        Map<String, Object> data = new HashMap<>();
        Callable<List> categoryListCallable= ()->categoryService.queryByApplevel("0");
        FutureTask<List> categoryListTask=new FutureTask<List>(categoryListCallable);
        executorService.submit(categoryListTask);
        try{
            data.put("categoryList",categoryListTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }

        return ResponseUtil.ok(data);
    }
    @RequestMapping("/first")
    @ResponseBody
    public Object first() {

        if (WxCacheManager.hasData("分类一级"))
        {return ResponseUtil.ok(WxCacheManager.getCacheData("分类一级"));}
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        Map<String, Object> data = new HashMap<>();
        Callable<List> listfirst = ()->wxCategory.first(categoryService.queryByApplevel(WxappletType.HSGJ));
        FutureTask<List> firstTask=new FutureTask<List>(listfirst);
        executorService1.submit(firstTask);
        try {
            data.put("一级",firstTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        WxCacheManager.loadData("分类一级",data);
        return ResponseUtil.ok(data);
    }
    @RequestMapping("/second")
    @ResponseBody
    public Object second() {
        if (WxCacheManager.hasData("分类二级"))
        {return ResponseUtil.ok(WxCacheManager.getCacheData("分类二级"));}
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        Map<String, Object> data = new HashMap<>();
        Callable<List> listsecond = ()->wxCategory.second(categoryService.queryByApplevel(WxappletType.HSGJ));
        FutureTask<List> secondTask=new FutureTask<List>(listsecond);
        executorService1.submit(secondTask);
        try {
            data.put("二级",secondTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        WxCacheManager.loadData("分类二级",data);
        return ResponseUtil.ok(data);
    }
    @RequestMapping("/thr")
    @ResponseBody
    public Object thr() {
        if(WxCacheManager.hasData("分类三级"))
        {return ResponseUtil.ok(WxCacheManager.getCacheData("分类三级"));}
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        Map<String, Object> data = new HashMap<>();
        Callable<List> listthr =()->wxCategory.thr(categoryService.queryByApplevel(WxappletType.HSGJ));
        FutureTask<List> thrTask=new FutureTask<List>(listthr);
        executorService1.submit(thrTask);
        try {
            data.put("三级",thrTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        WxCacheManager.loadData("分类三级",data);
        return ResponseUtil.ok(data);
    }
}
