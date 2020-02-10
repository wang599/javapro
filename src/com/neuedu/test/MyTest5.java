package com.neuedu.test;



public class MyTest5 {
    public static void main(String[] args) {
        /*
         int[] array={1,2,3,4};
        for(int a : array){
            for(int b : array){
                for(int c : array){
                    if(a==b&&a==c&&b==c){
                        break;
                    }else {
                        System.out.println(100*a+10*b+c);
                    }
                }
            }
        }

         */

    /*
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    */





     /*
         int x,y,z;
        int k=0;
        for(x = 1;x < 10;x++){
            for(y = 0;y < 10;y++){
                for(z = 0;z < 10;z++){
                    if(x*x*x + y*y*y + z*z*z==100*x + 10*y + z){
                         k=100*x+10*y+z;
                        System.out.println(k);
                    }
                }
            }
        }
      */

     /*冒泡排序法
     int[] array = {1,4,65,58,79,45,35,70,57,40};
     for(int i=0;i<array.length-1;i++){
         for(int j=0;j<array.length-1-i;j++){
             int flag=1;
             if(array[j]>array[j+1]) {
                 int temp = array[j];
                 array[j] = array[j + 1];
                 array[j + 1] = temp;
             }
             flag++;
             if(flag==0)
                 break;
         }
     }
     for(int a : array){
         System.out.println(a);
     }

      */
     /*选择排序法
        int[] array = {1,4,65,58,79,45,35,70,57,40};
     for(int i=0;i<array.length-1;i++){
         for(int j=i+1;j<array.length;j++){
             if(array[j]>array[i]){
                 int temp=array[j];
                 array[j]=array[i];
                 array[i]=temp;
             }

             }
         for(int a : array){
             System.out.println(a);

      */

     /*二分查找
      int[] array=new int[10000];
         for(int i=0;i<array.length;i++){
             array[i]=i+1;
         }
         int a=200;
         int index=search(array,a);
        System.out.println(index);
    }
    public static int search(int[] array,int value){
        int min=0;
        int max=array.length-1;
        int mid;
        int count=0;
        while(min<=max){
            count++;
            mid=(min+max)/2;
            if(value==array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(value<array[mid]){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return -1;

      */
        Teacher t1 = new Teacher();
        t1.setName("王挖斗");
        System.out.println(t1.getName());
        Student s1 = new Student();
        s1.setSex('女');
        System.out.println(s1.getSex());
        System.out.println(s1.getHobby());
    }
}
