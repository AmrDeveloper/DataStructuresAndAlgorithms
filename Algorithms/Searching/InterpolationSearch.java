package DataStructuresAndAlgorithms.Algorithms.Searching;

/**
 * @author AmrDeveloper
 */
import java.util.Arrays;

public class InterpolationSearch {

    private int[] array;
    private int low, high, mid;
    private boolean isFind;
    private int index;

    public InterpolationSearch(int[] array) {
        //Arr = Array will Search in
        this.array = array;
        Arrays.sort(array);
        //Low Is First Index in array
        low = 0;
        //hight is Last Index in array
        high = array.length - 1;
        mid = 0;
        isFind = false;
        this.index = 0;
    }

    //Return index if find number and -1 if not find
    public int search(int x) {
        while (!isFind) {
            //Just Like Binary Search 
            //it Search on all items and not find it
            if (low > high) {
                System.out.println("Num Not Found");
                break;
            }

            mid = low + ((high - low) / (array[high] - array[low])) * (x - array[low]);
            index++;

            if (array[mid] == x) {
                System.out.println("Num Is Found");
                System.out.println(index);
                isFind = true;
                return mid;
            }
            //Search On Right Part Of Array
            if (array[mid] < x) {
                low = mid + 1;
            }
            //Search On Left Part Of Array
            if (array[mid] > x) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
