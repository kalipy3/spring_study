/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ly;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ly.Person;

public class AppTest {
    //从容器中拿到这个组件
    @Test 
    public void test() {
        //ApplicationContext:代表ioc容器
        //ClassPathXmlApplicationContext:当前应用的xml配置文件在ClassPath下
            ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
        Person bean = (Person) ioc.getBean("person01");
        System.out.println(bean);
    }


}
