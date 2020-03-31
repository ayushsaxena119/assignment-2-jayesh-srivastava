/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void preOrder(TreeNode root){
        if(root == null)    return;
        else{
            System.out.print(root.getData()+"\t");
            preOrder(root.getLeft());
            preOrder(root.getRight());

        }
    }
    public static void postOrder(TreeNode root){
        if(root == null)    return;
        else{
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData()+"\t");
        }
    }
    public static void prepost(){
        MyBinarySearchTree obj = new MyBinarySearchTree();
        postOrder(obj.getRoot());
        System.out.println();
        preOrder(obj.getRoot());
    }
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(62);
        obj.insert(55);
        obj.insert(59);
        obj.insert(2);
        obj.insert(25);
        obj.insert(99);
        obj.insert(36);
        prepost();
    }
}
