/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms.Algorithms.Searching;

/**
 *
 * @author AmrDeveloper
 */
public class BinarySearch {

    private int height;
    private int low;
    private int mid;
    private int[] array;
    private boolean isFind;

    public BinarySearch(int[] array) {
        this.array = array;

        this.low = 0;
        this.mid = 0;
        this.height = array.length - 1;

        this.isFind = false;
    }

    public int searchValue(int value) {
        while (!isFind) {
            if (low > height) {
                return -1;
            }

            this.mid = (low + height) / 2;

            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                height = mid - 1;
            } else if (array[mid] < value) {
                low = mid + 1;
            }
        }
        return 0;
    }
    

}
