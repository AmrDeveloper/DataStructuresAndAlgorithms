//InterpolationSearch is Good Search and fast
//It Need Sorted Array
//Arr[i] - arr[i-1] == 1
//Solve Cose = O(1)
package Learn;

import java.util.Arrays;


public class InterpolationSearch {
    private int Arr[];
    private int low , high , mid;
    private boolean nFind ; 
    int index;
    
    InterpolationSearch(int Arr[]){
       //Arr = Array will Search in
        this.Arr = Arr;
        Arrays.sort(Arr);
        //Low Is First Index in array
        low = 0;
        //hight is Last Index in array
        high = Arr.length - 1 ;
        mid = 0;
        nFind = false; 
        this.index = 0;
    }
    //Return index if find number and -1 if not find
    public int Search(int x){
        while(!nFind){
            //Just Like Binary Search 
            //it Search on all items and not find it
            if(low > high){
                System.out.println("Num Not Found");
                break;
            }
         
            mid = low + ((high - low) / (Arr[high] - Arr[low])) * (x - Arr[low]); 
            index++;
            
            if(Arr[mid] == x){
               System.out.println("Num Is Found");
               System.out.println(index);
               nFind = true;
               return mid;
           }
           //Search On Right Part Of Array
           if(Arr[mid] < x){
               low = mid + 1;             
           } 
            //Search On Left Part Of Array
           if(Arr[mid] > x){
               high = mid - 1;                    
           }
          
        }
        return -1;     
    }
    
}
