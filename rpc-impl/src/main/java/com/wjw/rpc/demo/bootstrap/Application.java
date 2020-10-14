package com.wjw.rpc.demo.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: wang.jianwen
 * @create: 2020-09-29 16:05
 **/
public class Application {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("rpc-demo.xml");
    }
}
