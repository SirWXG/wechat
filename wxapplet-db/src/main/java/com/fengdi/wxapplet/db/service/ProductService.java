package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.entity.Product;
import com.fengdi.wxapplet.db.entity.ProductExample;
import com.fengdi.wxapplet.db.entity.User;
import com.fengdi.wxapplet.db.entity.UserExample;
import com.fengdi.wxapplet.db.mapper.ProductMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Administrator on 2019/3/20.
 * 商品接口
 */
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<Product> querySelective(String goodsId, String name, Integer page, Integer size) {
        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(goodsId)) {
            criteria.andGoodsSnEqualTo(goodsId);
        }
        if (!StringUtils.isEmpty(name)) {
            criteria.andNameEqualTo(name);
        }
        criteria.andDeletedEqualTo(false);

        example.setOrderByClause("add_time" + " " + "desc");

        PageHelper.startPage(page, size);
        return productMapper.selectByExample(example);

    }
}
