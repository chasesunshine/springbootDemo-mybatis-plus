package com.jt.demo.service;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.jt.demo.mapper.UserMapper;
import com.jt.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public String selectOne() {
        User user = userMapper.selectOne(Wrappers.<User>query().lambda()
                .eq(User::getId,7));

        return JSON.toJSONString(user);
    }
}
