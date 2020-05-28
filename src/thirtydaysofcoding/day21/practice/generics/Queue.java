package thirtydaysofcoding.day21.practice.generics;

import java.util.LinkedList;

class Queue<D> {

    // anything can be inside our linked list
    LinkedList<D> queue;

    // making a queue instance
    public Queue() {
        queue = new LinkedList();
    }

    // is our queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // what is the size of our queue?
    public int size() {
        return queue.size();
    }

    // Enqueueing an item
    public void enqueue(D n) {
        queue.addLast(n);
    }

    // Dequeueing an item
    public D dequeue() {
        return queue.remove(0);
    }

    // Peek at the first item
    public D peek() {
        return queue.get(0);
    }

}
