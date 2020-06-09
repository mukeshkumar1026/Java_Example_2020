package com.example.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringCharRepeted2Times {


        public static void main(String[] args) throws Exception{

            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter String :");
            String data=reader.readLine();
            System.out.println("Enter character :");
            char ch=(char)System.in.read();
            int no=0;
            for(int i=0;i<data.length();i++)
            {
                char c=data.charAt(i);
                if(c==ch){
                    no++;
                }
            }
            System.out.println(no);
        }
}
