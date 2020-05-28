package thirtydaysofcoding.day21.practice.generics;

public class Day21_Generics_Practice {

    // T - some type of data that extends Comperable => has a compareTo function,
    // that can tell what is greater a or b
    public static <T extends Comparable<T>> T findMax(T a, T b) {
        // n will be -1 if a is less than b, 1 if a is greater than b, 0 if a and b are equal
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));


        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("hello", "there"));
    }
}

