package com.elin4it.ssm.service;

import com.elin4it.ssm.mapper.UserMapper;
import com.elin4it.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 烽 on 2015/7/11.
 */
@Service
public class UserServiceImpl implements UserService {

    //User接口
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<User> users = userMapper.selectByExample(null);

        return users;
    }

    public List<Map<String, Object>> loanList(Map<String, Object> map) throws Exception {
        List<Map<String, Object>> usersLst = userMapper.loanList(map);
        return usersLst;
    }
}

