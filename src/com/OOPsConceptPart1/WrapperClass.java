package com.OOPsConceptPart1;

public class WrapperClass {
    public static void main(String[] args) {
        String s="100";

        System.out.println(s+20);
//data conversion String to int
        int i=Integer.parseInt(s);
        System.out.println(i+20);

        //integer double character boolean float
        //String to double
        String y="12.33";
        double d=Double.parseDouble(y);
        System.out.println(d+10);
        //String to boolean

        String k="true";
        boolean b=Boolean.parseBoolean(k);
    System.out.println(b);
    //int to string
        int j=10;
        System.out.println(j+20);
        String s1=String.valueOf(j);
        System.out.println(s1+30);

        String u="100A";
        Integer.parseInt(u);//NumberFormatException: For input string: "100A"



    }
}
