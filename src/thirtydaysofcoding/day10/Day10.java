package thirtydaysofcoding.day10;

import java.util.Scanner;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static int binaryNumber(int n) {
        int maxConsecutiveOnes = 0;
        int curConsecutiveOnes = 0;

        while (n > 0) {
            int currentDigit = n % 2;
            n = n / 2;

            if (currentDigit == 1) {
                curConsecutiveOnes++;
            } else {
                if (curConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = curConsecutiveOnes;
                }
                curConsecutiveOnes = 0;
            }
        }

        if (curConsecutiveOnes > maxConsecutiveOnes) {
            maxConsecutiveOnes = curConsecutiveOnes;
        }

        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println(binaryNumber(n));
    }


}
