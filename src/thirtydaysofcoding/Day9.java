package thirtydaysofcoding;

public class Day9 {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
