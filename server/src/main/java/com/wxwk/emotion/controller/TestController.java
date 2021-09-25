package com.wxwk.emotion.controller;

import com.wxwk.emotion.entity.User;
import com.wxwk.emotion.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("www")
public class TestController {
    private UserMapper userMapper;

    @RequestMapping(value = "/test")
    public void test() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
