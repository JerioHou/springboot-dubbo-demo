package com.example.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.api.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Franky on 2018/09/11.
 */
@Controller
public class HelloController {

    @Reference(version = "1.0.0")
    private HelloService helloService;

    @GetMapping("/index")
    @ResponseBody
    public String hello(){

        return helloService.sayHello("hello ");
    }
}
