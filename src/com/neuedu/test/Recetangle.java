package com.neuedu.test;

public class Recetangle extends Shape {
    private double width;
    private double height;
    public Recetangle(){}
    public Recetangle(double width,double height,String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPer() {
        return 2*(width + height);
    }
    @Override
    public double getColor() {
        return 0;
    }


    @Override
    public void showAll() {
        System.out.println("矩形面积="+getArea());
        System.out.println("矩形周长="+getPer());
        System.out.println("矩形颜色="+getColor());
    }

}
