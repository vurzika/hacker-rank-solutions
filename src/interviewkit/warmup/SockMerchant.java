package interviewkit.warmup;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

    public static void main(String[] args) {

        int n = 9;
        int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);
        System.out.println(result);

        assert result == 3 : "Incorrect Result";
    }

    // Return the total number of matching pairs of socks that John can sell.
    public static int sockMerchant(int n, int[] ar) {
        Set<Integer> socks = new HashSet<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (socks.contains(ar[i])) {
                socks.remove(ar[i]);
                result += 1;
            } else {
                socks.add(ar[i]);
            }
        }

        return result;
    }

}

