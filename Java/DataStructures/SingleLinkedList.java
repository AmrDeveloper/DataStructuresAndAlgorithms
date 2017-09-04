
package DataStructure;

//Single Linked List 

import java.util.Arrays;

//Linked List Is Just Array Of Node
//in every node val and next


public class SingleLinkedList {
    
    //node : data type to make array of it for creating linked list
    public static class node{
        //node integer value
        private  int val;
        //next node pointer
        private node next;
        //Node Constructor
        node(int val){
            this.val = val;
            this.next = next;
        }
    }
    
    //The First node in SingleLinkedList
    private node head;
    //Node Constructor
    SingleLinkedList(node head){
        this.head = head;       
    }
   
    //Every Item will add in the first
    //O(1) because we add in the first not sorting then add
    public void add(node newNode){
        newNode.next = head;
        head = newNode;
    }
    
    //Delete The First Item
    //First item now is the lastes item will added
    //O(1) because we just add the first now index(x)
    public void delete(){
        //change pointer to next 
        head = head.next;
    }
    
     //display first item
    public void display(){
        node current = head;
        System.out.println(current.val);
        current = current.next;
    }
    
    //Print All SingleLinkedList Value 
    public void displayAll(){
        //point on the first
        node current = head;
        //check every next node and print value
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
    
    //search in SingleLinkedList 
    public boolean search(int value){
        node current = head;
        //from 0 to linked length
        while(current != null){
            //if node.val = value return true;
            if(current.val == value){
                return true;
            }
            current = current.next;   
        }
        //if current = null and not find value return false;
        return false;
    }
    
    //SingleLinkedList Size
    public int size(){
        int size = 0;
        node current = head;
        //from 0 
        while(current != null){
            size++;
            current = current.next;   
        }
        //if current is null return size;
        return size;
    }
    
    //Simple Sorting Algorithm to sorting SingleLinkedList
    public void sorting(){
        //n =  LinkedList Length
        int n = size();
        //current node in first time is head
        node current = head;
        //array with same linkedlist size
        int arr[] = new int[n];
        //for every node in singlelinkedlist
        while(current != null){
            //add current node value on the array
            arr[n - 1] = current.val;
            current = current.next;
            n--;
        }
        //BubbleSorting Array
        for(int i = 0 ; i < arr.length; i++){
            for(int a = 0 ; a < i ; a++){
                if(arr[i] < arr[a]){
                    //Swaping
                    int temp = arr[a];
                    arr[a] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        //biggest item is the head
        head.val = arr[arr.length - 1];
        head.next = null;
        //add all item except the biggest on the linkedlist
        for(int i = arr.length  - 2 ; i >= 0 ; i--){
            add(new node(arr[i]));
        }
    }
    
    //Convert SingleLinkedList To normal Array
    public int [] toArray(){
        int len = size();
        //Create Array With Same LinkedList Size
        int array[] = new int[len];
        //current node help to find the next node
        node current = head;
        //for every node
        while(current != null){
            array[--len] = current.val;
            current = current.next;
        }
        //return array 
        return array;
    }    
    
    
    
    
    
}
