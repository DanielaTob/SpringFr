package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //Triangle triangle = new Triangle();
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();

        SpringApplication.run(DemoApplication.class, args);
    }

}
