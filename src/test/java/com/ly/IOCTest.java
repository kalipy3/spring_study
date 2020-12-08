package com.ly;

import java.util.List;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ly.Person;
import com.ly.bean.Book;
import com.ly.bean.Car;

public class IOCTest {

    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");

    @Test 
    public void test04() {
        Person person01 = (Person) ioc.getBean("person02");

        Car car = person01.getCar();
        System.out.println(car);
        List<Book> books = person01.getBooks();
        System.out.println(books);

        Object bean = ioc.getBean("carInner");
        System.out.println(bean);//org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'carInner' available
    }

}

