package com.example.test;

import java.util.Stack;

public class StringAdjacent {

    public static String removeAdjacentDuplicates(String str){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if(!st.isEmpty() && st.peek()==str.charAt(i)) {
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }

        for (Character ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="aabbccaaaa";//ddffggghhh  aabb kiijjj
        String result=removeAdjacentDuplicates(str);
        System.out.println(result);
    }
}
