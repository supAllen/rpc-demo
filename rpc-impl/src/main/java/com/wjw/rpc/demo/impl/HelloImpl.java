package com.wjw.rpc.demo.impl;

import com.google.common.collect.ImmutableMap;
import com.wjw.rpc.core.command.Command;
import com.wjw.rpc.core.remote.RpcClientSimple;
import com.wjw.rpc.demo.Hello;

/**
 * @description:
 * @author: wang.jianwen
 * @create: 2020-09-29 16:03
 **/
public class HelloImpl implements Hello {

    private RpcClientSimple instance = RpcClientSimple.getInstance("/service/rpc-demo");

    @Override
    public String hello2(String args) {
        Object res = instance.execute(new Command("/service/rpc-demo", "hello", ImmutableMap.of("args", "hello")));
        System.out.println("rpc demo1 res: "+res);
        return "hello world2\t" + res;
    }
}
