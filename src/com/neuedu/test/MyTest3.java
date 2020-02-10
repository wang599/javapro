package com.neuedu.test;

import static java.lang.StrictMath.max;

public class MyTest3{
    public static void main(String[] args) {
       /* int[] array = {1,4,6,8,10,33};
        for(int i = 0;i<=array.length;i++){
            int a = array[i];
            System.out.println(a);
        }
        for(int a : array){
            System.out.println(a);
        }*/

        /**
         *
         * 1 - 4 之间 拿出任意3个数  最多能组成多少个数字  并打印
         * */
        int[] array = {1,2,3,4};
        for(int i : array){
            // 先拿出百位的数赋值给i
            for(int j: array){
                // 再拿十位的数给j
                if(i!=j) {
                    for(int k:array) {
                        // 最后拿各位数赋值给k
                        if(k!=j&&k!=i) {
                            System.out.println(i * 100 + j * 10 + k);
                        }
                    }
                }
            }
        }
        /**
         *  1-100之间的偶数和
         *
         * */
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);

        /**
         * 定义两个int变量 m和n  计算m的n次方
         *
         * */
        int m = 2;
        int n = 3;
        int s = 1;
        for(int i = 0;i<n;i++){
            s*=m;
        }
        System.out.println(s);




        for(int i=100;i<=999;i++){
            //取百位
            int a=i/100;
            // 取十位
            int b=i/10%10;
            // 取个位
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
        /**
         *两个正整数 计算最大公约数和最小公倍数
         * */

        int x=10;
        int y=15;
        int max=1;
        int min=max(x,y);
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                max=i;
            }
        }
        for(int i=min;i<=x*y;i++){
            if(i%x==0&&i%y==0){
                min=i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
