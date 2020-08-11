/*
 * Persion.java
 * Copyright (C) 2020 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */
package com.ly;


@Deprecated 
public class Person
{
    private String lastName;
    private Integer age;
    private String gender;
    private String email;

	public Person() {
		
    }

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

    @Override
    public String toString() {
        return "Person{" +
            "lastName = " + getLastName() +
            ", age = " + getAge() +
            ", gender = " + getGender() +
            ", email = " + getEmail() +
            "}";
    }

}

