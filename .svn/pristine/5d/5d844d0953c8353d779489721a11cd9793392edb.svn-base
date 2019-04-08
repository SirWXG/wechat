package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.Category;
import com.fengdi.wxapplet.db.entity.CategoryExample;
import com.fengdi.wxapplet.db.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/3/19.
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    public List<Category> queryByApplevel(String level){
        CategoryExample example=new CategoryExample();
        example.or().andLevelEqualTo(level);
        return categoryMapper.selectByExample(example);
    }
    public List<Category> queryAll(){
        CategoryExample example=new CategoryExample();

        return categoryMapper.selectByExample(example);
    }
    public  List<Category> queryById(Integer id){
        CategoryExample example =new CategoryExample();
        example.or().andIdEqualTo(id);
        return categoryMapper.selectByExample(example);
    }
    public  List<Category> queryByPid(Integer pid){
        CategoryExample example =new CategoryExample();
        example.or().andPidEqualTo(pid);
        return categoryMapper.selectByExample(example);
    }
}
