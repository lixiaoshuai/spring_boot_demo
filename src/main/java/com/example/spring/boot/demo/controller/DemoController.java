package com.example.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lxs
 * @Description
 * @Date 2020/6/4 23:33
 **/
@RestController
@RequestMapping
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "hello word";
    }
}
