package com.ly;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.core.convert.Property;

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

        System.out.println(person01.getProperties());
    }

}

