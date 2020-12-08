package com.ly;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ly.Person;

public class IOCTest {

    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

    //实验2：根据bean的类型从IOC容器中获取bean的实例
    //org.springframework.beans.factory.NoUniqueBeanDefinitionException
    //No qualifying bean of type 'com.ly.Person' available: expected single matching bean but found 2: person01,person02
    @Test 
    public void test02() {
        Person bean2 = ioc.getBean("person02", Person.class);
        System.out.println(bean2);
        
        Object bean = ioc.getBean("person04");
        System.out.println(bean);
    }

}

