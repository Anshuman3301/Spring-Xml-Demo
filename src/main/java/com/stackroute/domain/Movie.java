package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void printActor()
    {
        System.out.println(actor.toString());
    }
}
