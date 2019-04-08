package com.fengdi.wxapplet.db;

import com.fengdi.wxapplet.db.entity.Category;
import com.fengdi.wxapplet.db.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2019/3/19.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DbCategoryQueryTest {
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
