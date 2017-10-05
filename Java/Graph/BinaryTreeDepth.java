
package TODO;


public class BinaryTreeDepth {
    
    //node
    public static class node{
        int value;
        node right;
        node left;
        node(int value){
            this.value = value;
        }
    }
    
    //root node
    private node root;
    private int counter;
    
    BinaryTreeDepth(node root){
        this.root = root;
        this.counter = 0;
    }
    
    public int addNode(node newNode , node explor){
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
    
    
    
}
