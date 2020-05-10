package thirtydaysofcoding;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        day1Challenge();
    }

    private static void day1Challenge() {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int intNumber;
        double doubleNumber;
        String word;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        intNumber = scan.nextInt();
        doubleNumber = scan.nextDouble();
        word = scan.next() + scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + intNumber);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + doubleNumber);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + word);
    }
}

