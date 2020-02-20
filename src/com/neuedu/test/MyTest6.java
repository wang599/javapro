package com.neuedu.test;

import com.neuedu.pojo.Dept;
import com.neuedu.pojo.Student;
import com.neuedu.util.JdbcUtil;
import com.neuedu.web.StudentWeb;

import java.util.List;

public class MyTest6 {
    public static void main(String[] args) {
       /* StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();*/

        /**
         *  类在第一次主动使用的时候   会把class加载到 我们内存的方法区中
         *  并且在堆区中会创建一个 Class类型的对象  指向到该方法区
         *  反射 就是 我们要获取 那个Class类型的对象
         *  获取该对象的方法
         *      1 类名.class   Class clz = Student.class;
         *      2 对象名.getClass()
         *          Student student = new Student();
         Class clz2 = student.getClass();
         *      3 Class.forName("类的完全限定名")
         *          Class clz3 = Class.forName("com.neuedu.pojo.Student");
         * */
        Class clz = Dept.class;
        // 调用 该类的无参构造创建一个对象
        // 类下 每一个方法都会封装成 Method类型的对象
        // 类下 每一个属性都会封装成 Field类型的对象
        // 有多少个属性 就有多少个 Field  有多少个方法 就有多少个 Method
        // 实际上  Field是个数组  Method也是数组
       /* Field[] fields = clz.getDeclaredFields();
        for (Field  f : fields){
            System.out.println(f.getName());
        }*/
        /**
         *  注解 ：
         *   在反射过程中
         *   为了让 类 属性 方法 等实现某些特定功能 而诞生的
         *   写法 @注解名(注解值) 注解值 可以有一个或者多个
         *   如何定义一个注解  其实 注解就是 @接口
         *
         * */
        List<Dept> list = JdbcUtil.executeQuery("select deptno,dname,loc from dept",Dept.class);
        System.out.println(list);

    }
}
