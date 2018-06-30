package DataStructuresAndAlgorithms.DataStructures;

/**
 * @author AmrDeveloper
 */
public class DoubleLinedList {

    //Node Class
    class Node {

        public int value;
        public Node next;
        public Node previous;

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    private Node rear;
    private Node front;
    private static int linkedListSize = 0;

    public DoubleLinedList(Node head) {
        this.rear = head;
        this.front = head;
    }

    /**
     * @param newNode : Node Object to put it on DoubleLinedList - update
     * DoubleLinedList size - make new node next equal null - make new node
     * previous node is the rear - rear node next equal new Node - update rear
     * to make it new node to make easy to put next node it the list first item
     */
    public void addNode(Node newNode) {
        linkedListSize++;
        newNode.next = null;
        newNode.previous = rear;
        rear.next = newNode;
        rear = newNode;
    }

    /**
     * return all values to default values
     */
    public void emptyDoubleLinedList() {
        this.rear.previous = null;
        this.rear.next = null;
        this.front.previous = null;
        this.front.next = null;
        linkedListSize = 0;
    }

    /**
     * @return : delete first node in DoubleLinedList
     */
    public int Delete() {
        if (linkedListSize == 0) {
            System.out.println("Sorry DoubleLinedList Is Empty");
            return linkedListSize;
        } else {
            linkedListSize--;//Size = Size - 1 ;
            int value = front.value;
            front = front.next;//Item TO The Next Item
            front.previous = null;//The Last Item Delete Now
            return value;
        }
    }

    /**
     * @return : Number of nodes in DoubleLinedList
     */
    public int getSize() {
        return linkedListSize;
    }
}
