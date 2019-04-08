package com.fengdi.wxapplet.hsgj.service;

import com.fengdi.wxapplet.db.common.WxappletType;
import com.fengdi.wxapplet.db.entity.Category;
import com.fengdi.wxapplet.db.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @author 林泽鹏 @data2019/3/20 0020.
 */
@Service
public class WxCategory {
    private  List<Category> hsgjfirst = new ArrayList<>();
    private  List<Category> hsgjsecond = new ArrayList<>();
    private  List<Category> hsgjthr = new ArrayList<>();
    private  List<Integer> hsgjfirstid=new ArrayList<>();
    private  List<Integer> hsgjsecondid=new ArrayList<>();
    private  List<Integer> hsgjthrid=new ArrayList<>();
    //获取华世工匠全部分类
    @Autowired
    private   CategoryService categoryService;



    //华世一级分类
    public  List<Category> first(List<Category> listcategories){

        //获取华世工匠的一级分类
        for (Category category1 : listcategories) {
            if (category1.getPid() == 0) {
                hsgjfirst.add(category1);
                hsgjfirstid.add(category1.getId());
            }
        }

        return hsgjfirst;
    }
   public  List<Category> second(List<Category> listcategories){
        // 获取二级分类
        for (Integer sid:hsgjfirstid) {
            for (Category category1 : listcategories) {
                if ( sid == category1.getPid()) {
                    hsgjsecond.add(category1);
                    hsgjsecondid.add(category1.getId());
                }
            }
        }
        return hsgjsecond;
    }
    //获取三级分类
    public  List<Category> thr(List<Category> listcategories){
       second(listcategories);
       for (Integer tid: hsgjsecondid) {
            for (Category category1 : listcategories) {
                if (tid == category1.getPid()) {
                    hsgjthr.add(category1);
                }
            }
        }
        return hsgjthr;
    }
}
