package com.ly;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ly.Person;

public class IOCTest {

    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");

    //实验4：正确的为各种属性赋值
    //  测试使用null值，默认引用类型就是null,基本类型是默认值
    @Test 
    public void test03() {
        Person bean = (Person) ioc.getBean("person01");
        System.out.println(bean);
        System.out.println(bean.getLastName() == null);
    }

}

