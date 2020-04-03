package com.selenium.example.task;

public class ArrayConcepts {

    public static void main(String[] args) {

        int i = 20;
        i = 10;
        //array store similar data type values in a array variable
        //size in fixed///static array

        int a[] = new int[4];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        System.out.println(a[2]);
        System.out.println(a[3]);
        //System.out.println(a[4]);  //ArrayIndexOutOfBoundsException
        System.out.println(a.length);//size of array

        //print all the values of array

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

        //2. double array

        double d[] = new double[3];

        d[0] = 12.33;
        d[1] = 14.55;
        d[2] = 45.55;
        System.out.println(d[1]);


        //3. char array

        char c1[] = new char[3];
        c1[0] = 'a';
        c1[1]=2;
        c1[2]='3';
        //4. boolean array
        boolean x1[]=new boolean[2];
        x1[0]=true;
        x1[1]=false;

        //5. string array

        String s1[]=new String[3];
        s1[0]="hello";
        s1[1]="1";
        s1[2]="Hi";
        System.out.println(s1.length);
        System.out.println(s1[1]);

        //6. object array different data type

        Object ob[]=new Object[6];
        ob[0]="Tom";
        ob[1]=12.22;
        ob[2]=01/11/2000;
        System.out.println(ob.length);
        System.out.println(ob[1]);

    }
}
