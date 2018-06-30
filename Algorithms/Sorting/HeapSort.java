//Head = k    It Tree
//The Left Son = 2k  
//The Right Son = 2k + 1
//Left Son Sould Only Be Small Than Parent
//Right Son Sould Only Be Bigger Than Parent
package DataStructuresAndAlgorithms.Algorithms.Sorting;

/**
 * @author AmrDeveloper
 */
public class HeapSort {

    private int total;
    
    //This Method Just For Exchange 2 Item In arrays
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private void heapify(int[] arr, int i) {
        int left = i * 2;
        int right = i * 2 + 1;
        int father = i;
        //First Check if  Left index lower than Total (Array.length)
        //Then if Left bigger than i swap
        if (left <= total && arr[left] > (arr[father])) {
            father = left;
        }

        //First Check if  Right index lower than Total (Array.length)
        //Then if Right bigger than i swap
        if (right <= total && arr[right] > (arr[father])) {
            father = right;
        }
        if (father != i) {
            swap(arr, i, father);
            heapify(arr, father);
        }
    }

    public void sort(int[] arr) {
        total = arr.length - 1;
        //Sorting
        //Because We Start From len/2 first right will be the last item
        for (int i = total / 2; i >= 0; i--) {
            heapify(arr, i);
        }
        //Pop Father
        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }
    }

}
