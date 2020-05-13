package thirtydaysofcoding;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        splitCharacters();
    }

    private static void splitCharacters() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] words = new String[number];

        for (int i = 0; i < number; i++) {
            scanner.nextLine();
            words[i] = scanner.next();
        }


        for (int i = 0; i < number; i++) {
            String evenIndexedChars = "";
            String oddIndexedChars = "";
            for (int j = 0; j < words[i].length(); j++) {
                if (j % 2 == 0) {
                    evenIndexedChars += words[i].charAt(j);
                } else {
                    oddIndexedChars += words[i].charAt(j);
                }
            }
            System.out.println(evenIndexedChars + " " + oddIndexedChars);
        }
    }
}
