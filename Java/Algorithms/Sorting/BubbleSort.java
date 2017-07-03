package Learn;

//Simple Sorting Algorithms 
//Bubble Sorting
//Take O(n*n)Time

public class BubbleSort {
    
    public void Sorting(int array[]){
        
        for(int i = 0 ; i < array.length ; i++){
         for(int a = 0 ; a < i ; a++){
             //if Next Is Bigger Than Array[i]
             if(array[a] > array[i]){
                 //Swap Items
                 int num = array[a];
                 array[a] = array[i];
                 array[i] = num;
                }
            }      
        }     
    }
  
    
    
}
