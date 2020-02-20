package com.neuedu.web;

import com.neuedu.pojo.Student;
import com.neuedu.server.IstudentService;
import com.neuedu.server.StudentService;


import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IstudentService studentService = new StudentService();
    public void showmain() {
        System.out.println("----------------");
        System.out.println("1-----------查询");
        System.out.println("2-----------添加");
        System.out.println("3-----------修改");
        System.out.println("4-----------删除");
        System.out.println("5-----------退出");
        System.out.println("----------------");
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1) {
            query();
        } else if (i == 2) {
            System.out.println("添加");
        } else if (i == 3) {
            System.out.println("修改");
        } else if (i == 4) {
            System.out.println("删除");
        } else if (i == 5) {
            System.exit(0);
        }
    }

    public void query() {
        //在此调用 服务层提供提供的方法来去访问数据库
        List<Student> list = studentService.query();
        for (Student student : list) {
            System.out.println(student);
       }
    }
    public void add(Scanner scanner){
        System.out.println("请输入要添加的名字");
        String name = scanner.next();
        System.out.println("请输入要添加的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student student = new Student(name,age,gender);
        studentService.add(student);
        query();
    }
    private void update(Scanner scanner){
        System.out.println("请输入要修改的id");
        int id  = scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String name = scanner.next();
        System.out.println("请输入要修改的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入要修改的性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student student = new Student(id,name,age,gender);
        studentService.update(student);
        query();
    }
    private void del(Scanner scanner){
        System.out.println("请输入要删除的id");
        int id = scanner.nextInt();
        studentService.del(id);
        query();
    }
}
