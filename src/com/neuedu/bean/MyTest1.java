package com.neuedu.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if(player>18||player<12){
            System.out.println("不符合游戏人数");
        }else{
            /*
             *符合人数开始发牌
             */
            List<String> all = new ArrayList<>();

        }

    }

}
