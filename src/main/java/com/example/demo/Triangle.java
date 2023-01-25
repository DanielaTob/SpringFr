package com.example.demo;

public class Triangle {

    private String type;
    private int height;

    //Constructor que se sobre pone sobre el otro
    public Triangle(String type, int height){
        this.type = type;
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    //Constructor
    public Triangle(int height){
        this.height = height;
    }

    //Constructor
    public Triangle(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /*public void setType(String type) {
        this.type = type;
    }*/

    public void draw(){
        System.out.println(getType() + " Triangle draw of height " + getHeight());
    }
}
