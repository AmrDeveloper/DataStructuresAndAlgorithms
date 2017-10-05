
package Algorithms.Graph;

//Binary Tree is tree of node with some rules
//root node must bigger than right son 
//and smaller than left son
    

public class BinaryTree {
    
    //Node Class
    public static class node{
        //node value
        private int value;
        //left son node
        private node left;
        //right son node
        private node right;
        //Node Constructor
        node(int value ){
            this.value = value;

        }
    }
    
    //root is the father 
    //and in binary three always have 2 son
    node root;
    BinaryTree(node root){
        this.root = root;
    }
    
    //Add Node To Binary Tree
    public void add(node newNode , node explor){
        //no father
        if(root == null){
            return ;
        }
        //newnode bigger than explor
        if(newNode.value > explor.value){
            if(explor.right == null){
                explor.right = newNode;
            }
            else{
                add(newNode,explor.right);
            }
        }
        //newnode smaller than explor
        if(newNode.value < explor.value){
            if(explor.left == null){
                explor.left = newNode;
            }
            else{
                add(newNode,explor.left);
            }
        }
    }
    //Search node on Binary Tree
    public boolean search(int val , node explor){
        //if end of node and not find it return false
        if(explor == null){
            return false;
        }
        //if value == val return true
        if(explor.value == val){
            return true;
        }
        //if value bigger than val go to left side
        if(explor.value > val){
            search(val , explor.left);
        }
        //if value smaller than val go to right side
        if(explor.value < val){
            search(val , explor.right);
        }
        return false;
    }
    
    
}
