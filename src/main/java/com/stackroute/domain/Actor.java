package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Actor {
    //specify properties of actor class
    private String name;
    private String gender;
    private String age;

    //get name for the actor class
    public String getName() {
        return name;
    }

    //set name of the actor
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //get age of the actor
    public String getAge() {
        return age;
    }

    //set age of the actor.
    public void setAge(String age) {
        this.age = age;
    }

    //convert the propeties of the actor into string.
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
