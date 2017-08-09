package com.shiliew.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by huangwenhao on 2017/8/9.
 */
public class MySimpleBeanFactory {

    public static void main(String [] args){
        //1.创建bean的抽象资源
        ClassPathResource resource = new ClassPathResource("/ioc/user.xml");

        //2.场景bean工厂
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //3.创建bean定义读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        //4.回调返回给bean工厂并解析
        reader.loadBeanDefinitions(resource);
          //1步完成第2、3、4步
//        BeanFactory factory = new XmlBeanFactory(resource);

        //5.注册bean
        User user = factory.getBean("user", User.class);
        System.out.println(user.getName() + " " + user.getAge());
    }
}
