package thirtydaysofcoding.day15.practice;

class Node {
    // properties
    Node next;
    int data;

    // Methods

    // Constructors
    public Node(int newData) {
        this.data = newData;
        this.next = null;
    }

    public Node(int newData, Node newNext) {
        this.data = newData;
        this.next = newNext;
    }

    // Getters & Setters
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
