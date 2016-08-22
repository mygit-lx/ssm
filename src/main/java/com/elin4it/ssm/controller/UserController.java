package com.elin4it.ssm.controller;

import com.elin4it.ssm.pojo.User;
import com.elin4it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 烽 on 2015/7/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //service类
    @Autowired
    private UserService userService;

    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/findUser")
    public ModelAndView findUser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        //调用service方法得到用户列表
        List<User> users = userService.findUser();
        Map<String, Object> map = new HashMap<String, Object>();
        for(User u:users){
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(u.getBirthday()));
            System.out.println(u.getBirthday());
            //new SimpleDateFormat("yyyy-MM-dd").format(u.getBirthday());
            map.put("id",u.getId());
            map.put("username",u.getUsername());
            map.put("birthday",new SimpleDateFormat("yyyy-MM-dd").format(u.getBirthday()));
            map.put("sex",u.getSex());
            map.put("address",u.getAddress());
        }
        //将得到的用户列表内容添加到ModelAndView中
        System.out.println(map);
        System.out.println(users);
        List<Map<String,Object>> usersList = userService.loanList(map);
        System.out.println(usersList);
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");

        return modelAndView;
    }
}
