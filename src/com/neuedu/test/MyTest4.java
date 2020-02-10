package com.neuedu.test;
public class MyTest4 {

    public static void main(String[] args) {
        int i;
        int sum=0;
        for(i=1;i<=100;i++){
            if(isP(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isP(int a) {
        if (a < 2) {
            return false;
        }

        int i = 2, j = (int) Math.sqrt(a);
        while (i < j) {
            if (a % i == 0)
                return false;
            i++;
        }
        return true;
    }
}
