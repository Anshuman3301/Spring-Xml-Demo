package com.stackroute.domain;

public class Actor {
    //give the attributes of acor.
    private String name;
    private String gender;
    private int age;


    //initialise an actor using constructor.
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //print the actor along with its attributes.
    public void printActor()
    {
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}


