package com.jt.demo.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.jt.demo.convert.UserConver;
import com.jt.demo.mapper.UserMapper;
import com.jt.demo.pojo.User;
import com.jt.demo.pojo.common.UserVo;
import com.jt.demo.pojo.common.UserVo1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserConver UserConver;

    public String selectOne() {
        User user = userMapper.selectOne(Wrappers.<User>query().lambda()
                .eq(User::getId,7));
        UserVo userVo = UserConver.item2Dto(user);

        UserVo1 convert = UserConver.convert(user);

        return JSON.toJSONString(userVo);
    }
}
