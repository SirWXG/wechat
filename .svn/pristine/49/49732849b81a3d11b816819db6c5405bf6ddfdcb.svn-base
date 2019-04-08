package com.fengdi.wxapplet.db.service;

import com.fengdi.wxapplet.db.common.WxappletType;
import com.fengdi.wxapplet.db.entity.Category;
import com.fengdi.wxapplet.db.entity.User;
import com.fengdi.wxapplet.db.entity.UserExample;
import com.fengdi.wxapplet.db.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by lks on 2019/3/20.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    //查询数据库是否存在该用户
    public User queryUser(User user){
        return userMapper.queryUser(user);
    }
    public User queryUserById(Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }
    //通过id、level查询普通用户,装修师傅，管理者
    public List<User> findUserByIdAndLevel(User user){
        UserExample example =new UserExample();
        example.or().andIdEqualTo(user.getId()).andUserLevelEqualTo(user.getUserLevel());
        return userMapper.selectByExample(example);
    }
    public List<User> queryAll(){
        UserExample example =new UserExample();
        return userMapper.selectByExample(example);
    }
     //通过用户id更新用户数据
    public void updateById(User user) {
        user.setAddTime(LocalDateTime.now());
        userMapper.updateByPrimaryKey(user);
    }
    public void add(User user) {
        user.setAddTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        userMapper.insertSelective(user);
    }
    //指定条件查询用户集合（可以通过用户名，手机号，分页号，分页条数大小)
    public List<User> querySelective(String username, String mobile, Integer page, Integer size) {
        UserExample example = new UserExample();
       UserExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        if (!StringUtils.isEmpty(mobile)) {
            criteria.andMobileEqualTo(mobile);
        }
        criteria.andDeletedEqualTo(false);

        example.setOrderByClause("add_time" + " " + "desc");

        PageHelper.startPage(page, size);
        return userMapper.selectByExample(example);
    }

    public int count() {
       UserExample example = new UserExample();
        example.or().andDeletedEqualTo(false);

        return (int) userMapper.countByExample(example);
    }

    public List<User> queryByUsername(String username) {
        UserExample example = new UserExample();
        example.or().andUsernameEqualTo(username).andDeletedEqualTo(false);
        return userMapper.selectByExample(example);
    }

    public boolean checkByUsername(String username) {
        UserExample example = new UserExample();
        example.or().andUsernameEqualTo(username).andDeletedEqualTo(false);
        return userMapper.countByExample(example) != 0;
    }

    public List<User> queryByMobile(String mobile) {
        UserExample example = new UserExample();
        example.or().andMobileEqualTo(mobile).andDeletedEqualTo(false);
        return userMapper.selectByExample(example);
    }

    public List<User> queryByOpenid(String openid) {
        UserExample example = new UserExample();
        example.or().andWeixinOpenidEqualTo(openid).andDeletedEqualTo(false);
        return userMapper.selectByExample(example);
    }

    public void deleteById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    //
}
