package DataStructuresAndAlgorithms.DataStructures;

import java.util.Arrays;

/**
 * @author AmrDeveloper
 */
public class DynamicArray {

    private int size;
    private int[] data;

    public DynamicArray() {
        this.size = 0;
        this.data = new int[size + 1];
    }

    private void checkCapacity(int minCapacity) {
        int oldCapacity = data.length;
        if (oldCapacity < minCapacity) {
            int newCapacity = oldCapacity * 2;

            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }

            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public void insert(int number) {
        checkCapacity(number);
        data[size++] = number;
    }

    public void DeleteAll() {
        this.size = 0;
        data = new int[size + 1];
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }
}
