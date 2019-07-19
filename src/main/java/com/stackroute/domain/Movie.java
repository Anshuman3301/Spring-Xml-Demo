package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    //create an instant variable of actor class
    Actor actor;

    //initialise the actor.
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //print the actor along with its properties
    public void printActor()
    {
        System.out.println(actor.toString());
    }
}
