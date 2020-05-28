package thirtydaysofcoding.day21.practice.generics;

class LinkedList<D> {

    // Properties
    private Node<D> head;
    private int count;

    // Constructors
    public LinkedList(Node<D> newHead) {
        this.head = newHead;
        this.count = 1;
    }

    // Methods

    public static void main(String[] args) {
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();
        linkedList.add("Alice");
        linkedList.add("Alicey");
        System.out.println(linkedList);
    }

    // add
    public void add(D newData) {
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        // Iterating through the current list till we get to the last element
        // Error if the head is null
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public D get(int index) {
//        if (index <= 0) {
//            return -1;
//        }

        Node<D> current = head;
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
        Node<D> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
}
