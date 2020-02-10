package com.neuedu.test;

public abstract class Shape {
    private double area;
    private double per;
    private  String color;
    public Shape(){}
    public Shape(String color){
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract double getColor();
    public abstract void showAll();
}
