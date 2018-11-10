package DataStructuresAndAlgorithms.DataStructures;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AmrDeveloper
 * @param <T>
 * My Personal Implementation for CircularLinkedList
 */
public class CircularLinkedList<T> {

    private class Node {

        private Node next;
        private final T value;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node nativeNode;

    public CircularLinkedList() {
    }

    public void addNode(T value) {
        if (head == null) {
            head = new Node(value, null);
            nativeNode = head;
        } else {
            Node node = new Node(value, null);
            head.next = node;
            head = node;
        }
    }

    public void showNodes() {
        Node header = nativeNode;
        while (header != null) {
            System.out.println(header.value);
            header = header.next;
            if (header == null) {
                header = nativeNode;
            }
        }
    }

    public void showSetNodes() {
        Node header = nativeNode;
        while (header != null) {
            System.out.println(header.value);
            header = header.next;
        }
    }

    public void deleteNode(T value) {
        Node header = nativeNode;
        Node previous = header;
        while (header != null) {
            Node next = header.next;
            if (header.value.equals(value)) {
                previous.next = next;
            }
            previous = header;
            header = header.next;
        }
    }

    public void deleteOneNode(int value) {
        Node header = nativeNode;
        Node previous = header;
        while (header != null) {
            Node next = header.next;
            if (header.value.equals(value)) {
                previous.next = next;
                break;
            }
            previous = header;
            header = header.next;
        }
    }

    public boolean searchNode(T value) {
        Node header = nativeNode;
        while (header != null) {
            if (header.value.equals(value)) {
                return true;
            }
            header = header.next;
        }
        return false;
    }

    public List<T> toList() {
        List<T> valuesList = new ArrayList<>();
        Node header = nativeNode;
        while (header != null) {
            valuesList.add(header.value);
            header = header.next;
        }
        return valuesList;
    }

    public int getSize() {
        return toList().size();
    }
}
