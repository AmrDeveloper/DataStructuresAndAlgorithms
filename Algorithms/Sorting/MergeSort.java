package DataStructuresAndAlgorithms.Algorithms.Sorting;

/**
 * @author AmrDeveloper
 */
public class MergeSort {

    public int array[];
    public int tempArray[];

    public void mergeSorting(int arr[]) {
        this.array = arr;
        this.tempArray = new int[arr.length];
        divSmall(0, arr.length - 1);
    }

    private void divSmall(int LowIndex, int HighIndex) {
        if (LowIndex < HighIndex) {
            int mid = LowIndex + (HighIndex - LowIndex) / 2;
            divSmall(LowIndex, mid);
            divSmall(mid + 1, HighIndex);
            mergePart(LowIndex, mid, HighIndex);
        }
    }

    private void mergePart(int lowIndex, int mid, int highIndex) {
        for (int i = lowIndex; i <= highIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowIndex;
        int j = mid + 1;
        int k = lowIndex;
        while (i <= mid && j <= highIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = tempArray[i];
            i++;
            k++;
        }
    }

}
