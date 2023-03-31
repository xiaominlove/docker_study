package com.min.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author min
 * @Date 2023/3/30 16:22
 * @version 1.0
 * @description:
 */
@RestController
@RequestMapping("docker")
public class DemoController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("getCount")
    public String getCount(){
        Long count_people = redisTemplate.opsForValue().increment("count_people");
        return "有访问["+count_people+"]了这个页面";
    }
}
