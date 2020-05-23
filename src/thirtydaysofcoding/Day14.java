package thirtydaysofcoding;

import java.util.Scanner;

class Difference {

    public int maximumDifference;
    private int[] elements;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        for (int number : elements) {
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        maximumDifference = Math.abs(maxNumber - minNumber);
    }
}

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}