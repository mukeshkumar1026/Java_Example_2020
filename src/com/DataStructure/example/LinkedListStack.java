package com.DataStructure.example;

public class LinkedListStack {

    Node head;
    class Node{
        int value;
        Node next;
    }
    LinkedListStack(){
        head=null;
    }
    //push : add value to the beginning of the list
    public  void  push(int value) {
        Node extraHead = head;
        head = new Node();
        head.value = value;
        head.next = extraHead;
    }

    public int pop(){
        if(head==null) {
            System.out.println("stack is empty");
        }
        int value=head.value;
        head=head.next;
        return value;
        }
public static void printList(Node head){
        Node temp=head;
       while(temp!=null){
           System.out.println(temp.value +" ");
           temp=temp.next;
       }
}
    public static void main(String[] args) {
        LinkedListStack lis=new LinkedListStack();
//        System.out.println(lis.pop());
        lis.push(10);
        lis.push(20);
        lis.push(30);
        lis.push(60);
        lis.push(90);
        System.out.println("element removed or poped from stack "+lis.pop());
        System.out.println("element removed or poped from stack "+lis.pop());
        lis.push(45);
        System.out.println("element removed or poped from stack "+lis.pop());
    printList(lis.head);
    }
}
