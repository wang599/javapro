package com.neuedu.test;

public class Dog {
    private int age;
    private char name;
    private char sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex=='公'||sex=='母'){
            this.sex = sex;
        }else {
            System.out.println("输入错误");
        }

    }
}


