package com.DataStructure.example;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public class BTPreOrderEx {

//used to create the tree node
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode( int data){
        this.data = data;
    }
    }
    public static TreeNode createBinaryTree() {
        TreeNode rootNode = new TreeNode(40);

        TreeNode Node20 = new TreeNode(20);
        TreeNode Node10 = new TreeNode(10);
        TreeNode Node30 = new TreeNode(30);
        TreeNode Node60 = new TreeNode(60);
        TreeNode Node50=new TreeNode(50);
        TreeNode Node70=new TreeNode(70);
        rootNode.left=Node20;
        rootNode.right=Node60;
        Node20.left=Node10;
        Node20.right=Node30;
        Node60.left=Node50;
        Node60.right=Node70;
        return rootNode;
    }

//    public  void inOrderTraversal(TreeNode root){
//        if(root!=null){
//            inOrderTraversal(root.left);
//            System.out.println(root.data);
//            inOrderTraversal(root.right);
//
//        }
//    }

    public void postOrderTraversal(TreeNode root){
        if (root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data+ " ");
        }
    }

    public void preOrderTraverse(TreeNode root){
        if(root!=null){
            System.out.print(root.data + " ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

    public static void main(String[] args) {
        BTPreOrderEx bt=new BTPreOrderEx();
        TreeNode rootNode=createBinaryTree();
        bt.preOrderTraverse(rootNode);
//        bt.inOrderTraversal(rootNode);
        bt.postOrderTraversal(rootNode);
    }
}