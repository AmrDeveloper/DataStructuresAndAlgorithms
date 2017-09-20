//Counter Sort is simple sort algorithm with complex time O(n)
//remember to using this  sorting algorithm k must be less than array.length
//sum of b array must equal array.length

package Algorithms.Sorting;


public class CounterSort {
    
    //Index will useing in sorting
    private int index;
    //k is the biggest index on array
    private int k;
    //new array with k + 1 size and k less than array.length
    private int b[];
    //native array i will sort it
    private int array[];
    
    public CounterSort(int array[] , int k){
        this.k = k;
        this.array = array;
        this.b = new int[k + 1];
    }
    
    public void Sorting(){
        //Counting every index
        for(int i = 0 ; i < array.length ; i++){
            b[array[i]]++;
        }
        this.index = 0;
        
        //using counting in array b to sorting
        for(int i = 0 ; i < b.length ; i++){
            //while b[i] not equal zero
            while(b[i] > 0){
                array[index++] = i;
                b[i]--;
            }
        }
        
    }

}
