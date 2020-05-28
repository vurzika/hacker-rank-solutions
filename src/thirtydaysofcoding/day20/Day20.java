package thirtydaysofcoding.day20;

import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        // Write Your Code Here
        boolean isSorted = false;
        int numSwaps = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    numSwaps++;
                    isSorted = false;
                }
            }
        }

        int firstElement = a[0];
        int lastElement = a[a.length - 1];

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

    }
}
