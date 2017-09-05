
package Graph;

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
        node(int value , node left , node right){
            this.value = value;
            this.left = left;
            this.right = right;
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
        //newNode Smaller than explor value
        if(root.value > newNode.value){
            //no left son
            if(root.left == null)
            {
                //add to left son
                root.left = newNode;
            }
            else

            {
                add(newNode , explor.left);
            }
        }
        //newNode Bigger than explor value
        if(root.value < newNode.value){
            if(root.left == null)
            {
                //add to right son
                root.right = newNode;
            }
            else
            {
                add(newNode , explor.right);
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
