package com.fengdi.wxapplet.master.controller;

import com.fengdi.wxapplet.db.entity.User;
import com.fengdi.wxapplet.db.service.UserService;
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
 * Created by Administrator on 2019/3/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
   @Autowired
    private UserService userService;
   //分页查询用户数据
   @RequestMapping("queryByPage")
   @ResponseBody
   public Object queryByPage(String username,String mobile,
           @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
       List<User> userList=new ArrayList<>();
       long total=0;//总用户记录数
       long totalPages=0;//总页数
      try{
           userList =userService.querySelective(username,mobile,page,size);
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
    //查询用户是否存在，可以根据id，name，password等属性查,前端封装到json中
   @RequestMapping("/query")
   @ResponseBody
   public Object query(User user){
       User dbUser=new User();
       try {
           dbUser = userService.queryUser(user);
       }catch (Exception e){
           e.printStackTrace();
       }
       if(dbUser!=null && dbUser.getUsername()!=null){
           return ResponseUtil.ok(dbUser);
       }
       return ResponseUtil.fail(501,"用户查询失败");
   }
   //更新用户数据
    @RequestMapping("/update")
    @ResponseBody
   public Object update(User user){
       User dbUser=new User();
       try {
           dbUser = userService.queryUserById(user.getId());
       }catch (Exception e){
           e.printStackTrace();
       }
       if(dbUser!=null && dbUser.getUsername()!=null){
           try {
               userService.updateById(dbUser);
               return ResponseUtil.ok();
           }catch (Exception e){
               e.printStackTrace();
           }
       }
       return ResponseUtil.fail(505,"更新用户失败！");
   }
    //删除用户数据
    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(Integer userId){
        try {
                userService.deleteById(userId);
                return ResponseUtil.ok();
            }catch (Exception e){
                e.printStackTrace();
            }

        return ResponseUtil.fail(505,"删除用户失败！");
    }
}
