package DataStructuresAndAlgorithms.Graph;

/**
 * @author AmrDeveloper
 */
public class BinaryTreeDepth {
    
    //node
    class Node{
        //node value
        int value;
        //node -> right
        Node right;
        //node -> right
        Node left;
        //Constructor
        Node(int value){
            this.value = value;
        }
    }
    
    //root node
    private Node root;
    //node depth counter
    private int counter;
    
    //Constructor
    BinaryTreeDepth(Node root){
        this.root = root;
        this.counter = 0;
    }
    
    //add new node and return node depth as integer
    public int addNode(Node newNode , Node explor){
        //for first time count root so counter start from 1
        if(explor == root){
            counter = 1;
        }
        //return -1 if no node
        if(root == null){
            return -1;
        }
        //add newNode on right
        if(newNode.value > explor.value){
            //check if explor.right equal null or not
            if(explor.right == null){
                //count this and end program
                counter++;
                //if no explor right add newNode
                explor.right = newNode;
            }
            //explor.right be new root
            else{
                //count this and find newNode place
                counter++;
                addNode(newNode , explor.right);
            }
        }
        //add newNode on left
        if(newNode.value < explor.value){
             //check if explor.left equal null or not
            if(explor.left == null){
                //count this and end program
                counter++;
                //if no explor right add newNode
                explor.left = newNode;
            }
            //explor.left be new root
            else{
                //count this and find newNode place
                counter++;
                addNode(newNode , explor.left);
            }
        }
        //return final number
        return counter; 
    }
    
    //search for integer in tree
    public boolean search(int val , Node explor){
        //no explor mean no root
        if(explor ==  null){
            return false;
        }
        //return true if find it
        if(val == explor.value){
            return true;
        }
        //if val bigger than explor search right
        if(val > explor.value){
            search(val,explor.right);
        }
        //if val smaller than explor search left
        if(val < explor.value){
            search(val,explor.left);
        }
        //else return false;
        return false;
    }
}