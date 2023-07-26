package Homework3;

public class LinkedList {
    private Node head;
    private Node tail;

    public void add(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public void revert() {
        if (head != null && head.next != null) {
            tail = head;
            Node current = head.next;
            head.next = null;

            while (current != null) {
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }

    public void print() {
        Node current = head;
        System.out.print("[ ");

        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }

        System.out.println("]");
    }

    private static class Node {
        int value;
        Node next;
    }
}
