package com.stackroute.domain;

public class Movie {
    
    //create an actor object
    private Actor actor;

    //initialise the actor in movie class
    public Movie(Actor actor) {
        this.actor = actor;
    }


    //print about the actor.
    public void printAboutMovieActor()
    {
        actor.printActor();
    }
}
