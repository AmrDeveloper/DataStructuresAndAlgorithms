package DataStructuresAndAlgorithms.DataStructures;

/**
 *
 * @author AmrDeveloper
 */
public class LinkedList {

    class Node {

        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void insert(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void delete() {
        head = head.next;
    }

    public void display() {
        Node currentNode = head;
        System.out.println(currentNode.value);
        currentNode = currentNode.next;
    }

    public void displayAll() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public int[] toArray() {
        int len = size();
        int array[] = new int[len];
        Node current = head;
        while (current != null) {
            array[--len] = current.value;
            current = current.next;
        }
        return array;
    }
}
