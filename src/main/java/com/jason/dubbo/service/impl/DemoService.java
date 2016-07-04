package com.jason.dubbo.service.impl;

import com.jason.dubbo.service.IDemoService;

/**
 * Created by jason on 15/8/31.
 */
public class DemoService implements IDemoService {

    static int sayHelloCnt = 0;
    public String sayHello(String name) {

        String hello = "hello "  + name;
        System.out.println(++sayHelloCnt);
        System.out.println(hello);
        return hello;
    }
}
