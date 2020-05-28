package thirtydaysofcoding.day15.practice;

import java.util.LinkedList;

public class Day15_LinkedList {

    // Properties
    Node head;
    int count;

    // Constructors
//    public Day15_LinkedList() {
//        this.head = null;
//        this.count = 0;
//    }

    public Day15_LinkedList(Node newHead) {
        this.head = newHead;
        this.count = 1;
    }

    // Methods

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alice");
        linkedList.add("Alicey");
        System.out.println(linkedList);
    }

    // add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        // Iterating through the current list till we get to the last element
        // Error if the head is null
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();

    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove from the back of the list
    public void remove() {
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
}


