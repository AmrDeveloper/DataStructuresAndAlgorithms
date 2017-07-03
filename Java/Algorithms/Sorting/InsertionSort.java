//Insertion Sort it search in all items less than i
//Take O(n*n)

package Learn;


public class InsertionSort {
    
    private void Swap(int array[] , int x , int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }


    public void Sorting(int array[]){
        for(int i = 1 ; i < array.length ; i++){
            for(int a = i ; a > 0 ; a--){
                if(array[a] < array[a - 1]){
                    Swap(array,a,a-1);
                } 
            }
        }  
    }
    
}
