package com.neuedu.test;

public abstract class ColaEmployee {
    public ColaEmployee(String name,int month){
        this.month = month;
        this.name = name;
    }
    private String name;
    private int month;
    public abstract double  getSalary(int month);
}
