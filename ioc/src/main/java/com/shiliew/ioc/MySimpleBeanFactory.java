package com.shiliew.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by huangwenhao on 2017/8/9.
 */
public class MySimpleBeanFactory {

    public static void main(String [] args){
        ClassPathResource resource = new ClassPathResource("/ioc/user.xml");
        BeanFactory beanfactory = new XmlBeanFactory(resource);
        User user = beanfactory.getBean("user", User.class);
        System.out.println(user.getName() + " " + user.getAge());
    }
}
