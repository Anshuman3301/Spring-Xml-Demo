package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycleDemoBean beanLifecycleDemoBean = context.getBean("beanlifecycle", BeanLifeCycleDemoBean.class);
        context.registerShutdownHook();
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = context.getBean("beanpost", BeanPostProcessorDemoBean.class);
    }
}