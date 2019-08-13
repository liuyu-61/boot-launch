package com.ys.bootlaunch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘昱
 * 第一个controller : hello world
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello,world!";
    }
}
