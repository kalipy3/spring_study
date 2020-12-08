/*
 * Persion.java
 * Copyright (C) 2020 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */
package com.ly;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import com.ly.bean.Book;
import com.ly.bean.Car;

@Deprecated 
public class Person
{
    //基本类型直接使用
    //<property name="lastName" value="xx"></property>自动的进行类型转换
    private String lastName = "小明";
    private Integer age;
    private String gender;
    private String email;

    private Car car;
    private List<Book> books;
    private Map<String, Object> maps;
    private Properties properties;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String,Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String,Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Person(String lastName, Integer age, String gender, String email, Car car, List<Book> books, Map<String,Object> maps, Properties properties) {
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.car = car;
        this.books = books;
        this.maps = maps;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
            "lastName = " + getLastName() +
            ", age = " + getAge() +
            ", gender = " + getGender() +
            ", email = " + getEmail() +
            ", car = " + getCar() +
            ", books = " + getBooks() +
            ", maps = " + getMaps() +
            ", properties = " + getProperties() +
            "}";
    }

    public Person() {
    }

}

