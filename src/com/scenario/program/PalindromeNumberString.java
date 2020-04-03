package com.scenario.program;

import java.util.Scanner;

public class PalindromeNumberString {
    public static void main(String[] args) {
//String rev="",str;
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the String :");
//str=sc.nextLine();
        String str="madam";
        String rev="";
int leng=str.length();
for(int i=leng-1;i>=0;i--){
    rev=rev+str.charAt(i);
}
if(str.equals(rev)){
    System.out.println("String is Palindrome :" +str);
}else{
    System.out.println("String is Not Palindrome :" +str);
//}
//        int rev = 0, rem;
//        System.out.println("Enter the number :");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int temp = n;
//        while (temp != 0) {
//            rem = temp % 10;
//            rev = rev * 10 + rem;
//            temp = temp / 10;
//        }
//        if (n == rev) {
//            System.out.println("Number is Palindrome :" + n);
//        } else {
//            System.out.println("Number is not Palindrome :" + n);
        }
    }
}

