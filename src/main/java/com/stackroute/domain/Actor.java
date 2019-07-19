package com.stackroute.domain;

public class Actor {
    //define propeties of the actor.
    private String name;
    private String gender;
    private int age;


    //initialise the actor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //print the actor properties.
    public void printActor()
    {
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}
