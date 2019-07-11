package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Actor {
    private String name;
    private String gender;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    /*public void print() {
        System.out.println("Actor name=" + name + '\n' +
                "gender=" + gender + '\n' +
                "age=" + age + '\n');
    }*/
}
