//Kandane is Algorithm use for return Maximum Sum of Sub of integer array
//can i get from one dimension arr
//Complex time equal O(n)
package Algorithms;


public class KadaneAlgorithm {
    //size of array
    private int size;
    //The Max sub array value i will return it
    private int big_sum;
    //Current Sum array
    private int current_sum;
    
   //Constructor 
   public KadaneAlgorithm(){
       this.size = 0;
       this.big_sum = Integer.MIN_VALUE;
       this.current_sum = 0;
   }
   
   //The Function will find the max
   public int get_max(int arr[]){
       //size = array length
       size = arr.length;
       //loop from zero to end array
       for(int i = 0 ; i < size ; i++){
           //find the current sum 
           current_sum = current_sum + arr[i];
           //save the big sum here
           //first big_sum will be current
           //next if current sum bigger than last sum
           if(big_sum < current_sum){
               //big_sum = current_sum
               big_sum = current_sum;
           }
           //if the current sum not positive 
           //delete sum of array from 0 to current i
           if(current_sum < 0){
               current_sum = 0;
           }
       }
       //after loop return the big_sum
       return big_sum;
   }
   
   
}
