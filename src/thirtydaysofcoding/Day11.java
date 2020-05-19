package thirtydaysofcoding;

import java.util.Scanner;

public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);


    private static int hourglassSum(int[][] n) {
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < n.length - 2; row++) {
            for (int col = 0; col < n.length - 2; col++) {
                int sum = (n[row][col] + n[row][col + 1] + n[row][col + 2] + n[row + 1][col + 1] +
                        n[row + 2][col] + n[row + 2][col + 1] + n[row + 2][col + 2]);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        System.out.println(hourglassSum(arr));
    }


}


