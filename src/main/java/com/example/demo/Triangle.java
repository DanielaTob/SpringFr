package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle  implements ApplicationContextAware, BeanNameAware {

    private List<Point> points;
    private ApplicationContext applicationContext = null;


    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){
        //System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
        //System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
        //System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is: " + beanName);
    }

}
