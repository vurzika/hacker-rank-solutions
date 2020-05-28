package thirtydaysofcoding.day18.practice;

import java.util.LinkedList;
import java.util.Stack;

public class Day18_Queue_Stack {

    public static void main(String[] args) {
        Queuey numberQueue = new Queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(6);
//        System.out.println("First out " + numberQueue.dequeue());
//        System.out.println("Peek at second item " + numberQueue.peek());
//        System.out.println("Second out " + numberQueue.dequeue());
//        System.out.println("Third out " + numberQueue.dequeue());

        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.print(stacky.pop() + " ");
        System.out.print(stacky.pop() + "! ");
        System.out.print("Size:" + stacky.size());

    }

    static class Queuey {

        LinkedList queue;

        // making a queue instance
        public Queuey() {
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
        public void enqueue(int n) {
            queue.addLast(n);
        }

        // Dequeueing an item
        public int dequeue() {
            return (int) queue.remove(0);
        }

        // Peek at the first item
        public int peek() {
            return (int) queue.get(0);
        }

    }
}
