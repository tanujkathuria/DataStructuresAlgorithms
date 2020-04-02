package com.demo.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Tanuj Kathuria
 * @version 1.0
 */
public class BinaryTree {

    Node root;

    void printLevelOrder(){
        Queue<Node>queue  = new LinkedList<Node>();
        ((LinkedList) queue).add(root);
         while(!queue.isEmpty()){
             Node tempNode = queue.poll();
             System.out.print(tempNode.key);

             if(tempNode.left != null){
                 ((LinkedList<Node>) queue).add(tempNode.left);
             }
             if(tempNode.right != null){
                 ((LinkedList<Node>) queue).add(tempNode.right);
             }
         }
    }

    public static void main(String [] args ){

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.printLevelOrder();

    }



}
