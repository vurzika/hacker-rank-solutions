package thirtydaysofcoding.day21.practice.generics;

class Node<D> {
    // properties
    private Node<D> next;
    private D data;

    // Methods

    // Constructors
    public Node(D newData) {
        this.data = newData;
        this.next = null;
    }

    public Node(D newData, Node newNext) {
        this.data = newData;
        this.next = newNext;
    }

    // Getters & Setters
    public Node<D> getNext() {
        return next;
    }

    public void setNext(Node<D> next) {
        this.next = next;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }
}
