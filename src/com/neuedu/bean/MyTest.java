package com.neuedu.bean;

public class MyTest {
    public static void main(String[] args) {

         MyThread2 t2 = new MyThread2();
         Thread t = new Thread(t2);
         t.start();

    }
    public static void eat(){}
    public static void drink(){}
    public static void loudtalk(){}

}
