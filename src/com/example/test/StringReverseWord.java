package com.example.test;

public class StringReverseWord {

    public static void main(String[] args) {

        String s1="This is my book bangalore";
        String str1="";
        String a[]=s1.split(" ");
/*        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("");*/
            for(int j=a.length-1;j>=0;j--){
        // System.out.print(a[j]+" ");

                str1=str1+a[j]+" ";
}
            System.out.println(str1);
    }
}
