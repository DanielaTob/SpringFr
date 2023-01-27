package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //Triangle triangle = new Triangle();
        //- EJEMPLO CON BEAN FACTORY -
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        //Triangle triangle = (Triangle) factory.getBean("triangle");
        //triangle.draw();

        //- EJEMPLO CON APLICATION CONTEXT -
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle1");
        triangle.draw();

        SpringApplication.run(DemoApplication.class, args);
    }

}
