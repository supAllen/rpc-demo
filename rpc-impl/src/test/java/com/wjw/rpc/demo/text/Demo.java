package com.wjw.rpc.demo.text;

import com.google.common.collect.ImmutableMap;
import com.wjw.rpc.core.command.Command;
import com.wjw.rpc.core.remote.RpcClientSimple;

/**
 * @description:
 * @author: wang.jianwen
 * @create: 2020-09-30 18:17
 **/
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        RpcClientSimple instance = RpcClientSimple.getInstance("/service/rpc-demo2");
//        Thread.sleep(2000L);
        instance.execute(new Command("/service/rpc-demo2", "hello2", ImmutableMap.of("args", "hello2")));
    }
}
