package com.ding;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by senlinmu on 16/7/14.
 */
public class DubboTest {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                "applicationProvider.xml"
        });
        System.out.println("dubbo-server服务正在监听，按任意键退出");
        System.in.read();
    }
}
