package com.serializationandserialization.example;


import java.io.*;

class  Test implements Serializable{
    int i=10, j=20;
}
public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Test t1=new Test();

        //serialization
        FileOutputStream fos=new FileOutputStream("test.text");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(t1);

        //Deserialization

        FileInputStream fis=new FileInputStream("test.text");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Test t2=(Test) ois.readObject();
        System.out.println(t2.i+" "+t2.j);

    }
}
