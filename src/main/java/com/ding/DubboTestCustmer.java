package com.ding;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by senlinmu on 16/7/14.
 */
public class DubboTestCustmer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                "spring-consumer.xml"
        });
        DemoService demoService=(DemoService)context.getBean("demoService");
        System.out.println(demoService.sayHello("dinghong"));
    }
}
