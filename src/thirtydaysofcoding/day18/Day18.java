package thirtydaysofcoding.day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18 {

    Stack<Character> characterStack = new Stack<>();
    Queue<Character> characterQueue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    public void pushCharacter(char ch) {
        characterStack.push(ch);
    }

    public void enqueueCharacter(char ch) {
        characterQueue.add(ch);
    }

    public char popCharacter() {
        return characterStack.pop();
    }

    public char dequeueCharacter() {
        return characterQueue.remove();
    }
}
