package com.example.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.api.HelloService;

/**
 * Created by Franky on 2018/09/11.
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String msg) {
        System.out.println(msg);
        return msg+":"+System.currentTimeMillis();
    }
}
