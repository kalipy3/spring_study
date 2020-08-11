package com.ly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ly.Person;

/*
 * IOCTest.java
 * Copyright (C) 2020 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */
public class IOCTest
{
	public IOCTest() {
		
	}
    //从容器中拿到这个组件
    public void test() {
        //ApplicationContext:代表ioc容器
        //ClassPathXmlApplicationContext:当前应用的xml配置文件在ClassPath下
        ApplicationContext ioc = new ClassPathXmlApplicationContext("../../ioc.xml");
        Person bean = (Person) ioc.getBean("person01");
        System.out.println(bean);
    }
}

