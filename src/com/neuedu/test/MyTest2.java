package com.neuedu.test;

public class MyTest2 {
    public static void main(String[] args) {
        /**
         *   数组排序
         *  1  冒泡排序
         *      相邻两个数互相比较大小 然后交换位置
         *  2  选择排序
         *      用第一个数后面每一个数来比较 交换位置
         * */
        /*int[] array = {5,10,90,40,48,25,20,14,56,6,59};*/
        /*for(int i=0;i<array.length-1;i++){
            int flag=0;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int a : array){
            System.out.println(a);
        }*/
        /**
         *  选择排序
         * */
        /*for(int i =0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        for(int a : array){
            System.out.println(a);
        }*/
        /**
         *  二分搜索
         *      在数组中快速查找元素的一种方式
         *      前提是 必须是有序的数组
         * */
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int a = 80000;
        int index = search(array, a);
        System.out.println(index);
    }

    /*从array中找到value的索引 */
    public static int find(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == value) {
                System.out.println("查找了" + count + "次");
                return i;
            }
        }

        return -1;
    }


    /* 二分搜索查询 */
    public static int search(int[] array, int value) {
        int min = 0;
        int max = array.length - 1;
        int mid;
        int count = 0;
        while (min <= max) {
            count++;
            mid = (min + max) / 2;
            if (value == array[mid]) {
                System.out.println("查找了" + count + "次");
                return mid;
            } else if (value < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    }


