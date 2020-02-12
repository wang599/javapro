package com.neuedu.bean;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程输出------"+i);
        }
    }
}
