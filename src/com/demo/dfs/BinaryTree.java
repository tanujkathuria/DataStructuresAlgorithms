package com.demo.dfs;

/**
 * @author Tanuj Kathuria
 * @version 1.0
 */
public class BinaryTree {
    Node root;

    BinaryTree()
    {
        root =null;
    }

    public void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    public void printPostOrder(Node node){
        if(node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    public void printPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }

    public void printInOrder(){
        printInOrder(root);
    }

    public void printPostOrder(){
        printPostOrder(root);
    }
    public void printPreOrder(){
        printPreOrder(root);
    }

    public static void main(String [] args){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        System.out.println("printing in order start");
        binaryTree.printInOrder();
        System.out.println("printing in order end");
        System.out.println("printing pre order start");
        binaryTree.printPreOrder();
        System.out.println("printing pre order end");
        System.out.println("printing post order start");
        binaryTree.printPostOrder();
        System.out.println("printing post order end");

    }

}
