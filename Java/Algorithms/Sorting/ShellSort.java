
package Sorting;

//Shell Sorting Algorithms

public class ShellSort {
  
    
    //The Public Function to take array from user in main method
    public void ShellSort(int arr[]){
        //n = in first time is like mid in binary serah
        /*     
              (n)
           * * * * *
               ^
        */  
        int n = arr.length /  2 ;
        
        //While n != 0
        //Margin never must be zero it at last should be 1
        while(n != 0){
            //Sort The x + k ..2k..3k
            InsertionSort(arr,n);
            //Then back And check if n not equal zero and make new k
            n /=2;
        }
 
    }
      
    //Private function that use Insertion Sort Method to sort part of 
    //the main array (arr)
    private void InsertionSort(int arr[] , int n){
        //j is simple in to copy i value 
        //and make i just change +1 every time not more
        int j;
        //Loop from 0 to array size
        for(int i = 0 ; i < arr.length ; i++){
            //Save i value on j
            j = i;
            //while run if i value on i bigger of equal than n
            //in is margin between item and other on array from Shell Sort Method
            //And Assert if index j lower than index (j - n )
            
            while((j >= n) && (arr[j] < arr[j - n])){
                 System.out.println(j);
                 //Swaping two number
                 swaping(arr,j,(j - n));
                 //j = j - margin
                 j -= n;
            }
            
        }
        
    }
    
    //Simple Swaping Method Used to Swaping two int number in same array
    private void swaping(int arr[] , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    
    
    
}
