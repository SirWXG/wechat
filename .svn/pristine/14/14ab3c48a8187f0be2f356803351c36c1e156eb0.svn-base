package com.fengdi.wxapplet.master;

import com.fengdi.wxapplet.db.entity.Category;
import com.fengdi.wxapplet.db.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2019/3/23.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DbTest {
    @Autowired
    private CategoryService categoryService;
    @Test
    public void testCategory(){
        List<Category> categoryList=categoryService.queryByApplevel("0");
        for(Category category:categoryList){
            System.out.println(category.getName());
        }
    }
}
