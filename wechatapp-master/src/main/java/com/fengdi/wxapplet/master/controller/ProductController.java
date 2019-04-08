package com.fengdi.wxapplet.master.controller;

import com.fengdi.wxapplet.db.entity.Product;
import com.fengdi.wxapplet.db.entity.User;
import com.fengdi.wxapplet.db.service.ProductService;
import com.fengdi.wxapplet.master.util.ResponseUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lks on 2019/3/25.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    //分页查询商品数据
    @RequestMapping("queryByPage")
    @ResponseBody
    public Object queryByPage(String goodsId, String name,
                              @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        List<Product> userList=new ArrayList<>();
        long total=0;//总用户记录数
        long totalPages=0;//总页数
        try{
            userList =productService.querySelective(goodsId,name,page,size);
            total= PageInfo.of(userList).getTotal();
        }catch (Exception e){
            e.printStackTrace();
        }
        Map<String,Object> data=new HashMap<>();
        if(total!=0) {
            totalPages = (int) Math.ceil((double) total / size);
        }
        data.put("total",total);
        data.put("totalPages",totalPages);
        data.put("userList",userList);
        return ResponseUtil.ok(data);
    }
}
