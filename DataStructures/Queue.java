package DataStructuresAndAlgorithms.DataStructures;

/**
 * @author AmrDeveloper Implements Queue Data Structures using normal static
 * array
 */
public class Queue {

    private int size;
    private int[] array;
    private int rear;
    private int front;

    public Queue(int size) {
        this.size = size;
        this.array = new int[size];
        this.rear = -1;
        this.front = -1;
    }

    public void Push(int item) {
        if (isFull()) 
            return;
        
        rear = rear + 1;
        array[rear] = item;
    }

    public int Pop() {
        if (isEmpty() || front == rear) 
            return -1;
        
        front = front + 1;
        return array[front];
    }

    private Boolean isFull() {
        return (rear == size);
    }

    private Boolean isEmpty() {
        return (rear == -1);
    }
}
