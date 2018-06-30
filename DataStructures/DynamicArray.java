package DataStructuresAndAlgorithms.DataStructures;

import java.util.Arrays;

/**
 *
 * @author AmrDeveloper
 */
public class DynamicArray {

    private int size;
    private int[] array;

    public DynamicArray() {
        this.size = 1;
        this.array = new int[size + 1];
    }

    private void checkCapacity(int minCapacity) {
        int oldCapacity = array.length;
        if (oldCapacity < minCapacity) {
            int newCapacity = oldCapacity * 2;

            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }

            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public void insert(int number) {
        checkCapacity(number);
        array[size + 1] = number;
    }

    public void DeleteAll() {
        this.size = 1;
        this.array = new int[size + 1];
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }
}
