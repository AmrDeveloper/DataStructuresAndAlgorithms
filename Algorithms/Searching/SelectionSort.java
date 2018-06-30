//Selection Sort will search in all array after item
//if it less than item will switch
//Take O(n*n)

package DataStructuresAndAlgorithms.Algorithms.Searching;

/**
 * @author AmrDeveloper
 */
public class SelectionSort {
        
    private void swap(int array[] , int x , int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    
    public void sorting(int array[]){
        //i is every item in array 
        for(int i = 0 ; i < array.length ; i++){
            //Start after i to all right items
            for(int a = i+1 ; a < array.length ; a++){
                //if Next Item less than i will swap ^_^
                if(array[i] > array[a]){
                    swap(array,i,a);
                }
            }
        }
}
}
