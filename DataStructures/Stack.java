package DataStructuresAndAlgorithms.DataStructures;

/**
 * @author AmrDeveloper Implements Stack data structures using normal static
 * array
 */
public class Stack {

    private int size;
    private int[] array;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            return;
        }

        this.top = top + 1;
        this.array[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            return top;
        }

        return this.array[top--];
    }

    public boolean isFull() {
        return (top == (size - 1));
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
