package com.example.test;

public class StringReverse {

    public static void main(String[] args) {
        String s1="This is my book";//Bangalore
        int leng=s1.length();
        String rev="";
        for(int i=leng-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        System.out.println("Reverse String is :" +rev);
    }

}
