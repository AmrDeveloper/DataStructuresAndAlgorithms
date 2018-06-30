//Simple Sorting Algorithms 
//Bubble Sorting
//Take O(n*n)Time
package DataStructuresAndAlgorithms.Algorithms.Sorting;

/**
 * @author AmrDeveloper
 */
public class BubbleSort {

    public void sorting(int[] array) {
        for (int i = 0; i < array.length; i++) 
            for (int j = 0; j < i; j++) 
            //if Next Is Bigger Than Array[i]
                if (array[j] > array[i]) {
                    //Swap Items
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
    }
    
}
