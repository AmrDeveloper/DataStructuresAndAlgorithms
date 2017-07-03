//This Class For Binary Search
//This Type Of Search Need To Input Sorted Arrays

package Learn;

import java.util.Arrays;

public class BinarySearch {
    private int low , high , mid;
    private int Arr[];
    private boolean nFind ;
    
    //BinarySearch Must Take Sorted Array
    BinarySearch(int arr[]){
        Arrays.sort(arr);
        this.Arr = arr;
        low = 0;        //low = index 0
        high = arr.length-1;  //The Last Index in array
        mid = 0 ;
        nFind = false; 
    }
    public void Search(int x){
        //While not Find x
        while(!nFind){  
            //It Search in all array items but not find
            if(low > high){
                System.out.println("Num Not Found");
                break;
            }
            mid = (low + high) / 2;
            //Arr[mid] == x  
            //it FInd X
            if(Arr[mid] == x){
               System.out.println("Num Is Found");
               nFind = true;
           }
           //Search on Right Part of Array 
           if(Arr[mid] < x){
               low = mid + 1;             
           } 
           //Search On Left Part Of Array
           if(Arr[mid] > x){
               high = mid - 1;                    
           }
           
           
        }
    }
    
    
}
