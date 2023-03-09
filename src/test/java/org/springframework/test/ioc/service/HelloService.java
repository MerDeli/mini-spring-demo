package org.springframework.test.ioc.service;

/**
 * @Author:
 * @createTime: 2023/02/28 15:10:33
 * @version:
 * @Description:
 */
public class HelloService {

    public String sayHello(){
        System.out.println("hello");
        return "hello";
    }
}
