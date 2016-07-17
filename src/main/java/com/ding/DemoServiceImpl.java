package com.ding;

/**
 * Created by senlinmu on 16/7/14.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
