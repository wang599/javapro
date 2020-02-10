package com.neuedu.test;
import java.util.ArrayList;
import java.util.Scanner;

public class MyBookTest {

        private  static ArrayList<MyBook>  book =  new ArrayList<>();
        static {
            book = new ArrayList<>();
            book.add(new MyBook("1",1.6,"press","张伟","BN_1"));
            book.add(new MyBook("2",1.7,"pres1","张2","BN_2"));
            book.add(new MyBook("3",1.8,"pres2","张3","BN_3"));
            book.add(new MyBook("4",1.9,"press4","张4","BN_4"));
        }
        public static void main(String[] args) {

        MyBookTest myBookTest = new MyBookTest();
        myBookTest.start();

    }
    public void inputData(ArrayList<MyBook> books){
        MyBook mybook = new MyBook();
        System.out.println("请添加姓名：");

        Scanner s1 = new Scanner(System.in);

        String name = s1.nextLine();

        System.out.println("清输入press：");

        Scanner s2 = new Scanner(System.in);
        String  press= s2.nextLine();

        System.out.println("请输入价格：");
        Scanner s3 = new Scanner(System.in);
        double price = s3.nextDouble();
        System.out.println("请输入作者：");
        Scanner s4 = new Scanner(System.in);
        String author = s4.nextLine();
        System.out.println("请输入ISBN：");
        Scanner s5 = new Scanner(System.in);

        String bookISBN = s5.nextLine();

        mybook.setAuthor(author);
        mybook.setName(name);
        mybook.setBookISBN(bookISBN);
        mybook.setPress(press);
        mybook.setPrice(price);
        books.add(mybook);
        book = books;
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("请输入你所进行的操作：\t"+"\n"+"1、添加课本信息"+"\n"+"2、查询所有课本信息");

            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    inputData(book);
                    break;
                case 2:
                   // print(book);
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }

    }


