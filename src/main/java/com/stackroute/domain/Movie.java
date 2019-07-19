package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    //inistantiate an actor object.
    private Actor actor;

    //set the actor
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //print the movie actor.
    public void printAboutMovieActor()
    {
        actor.printActor();
    }

    //print the bean factory after setting its values.
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    //set the name of the bean and print it.
    public void setBeanName(String s) {
        System.out.println(s);

    }

    //set the application context and print it.
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}

