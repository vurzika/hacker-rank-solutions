package interviewkit.warmup;

public class RepeatedString {

    public static void main(String[] args) {
        String l = "a";
        long m = 1000000000000L;
        System.out.println(repeatedString(l, m));
    }

    // Complete the repeatedString function below.
    // Final Solution
    static long repeatedString(String s, long n) {

        long sLength = s.length();
        long aCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }

        long multiplier = n / sLength;
        long remainder = n % sLength;

        long aCountRemainder = 0;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                aCountRemainder++;
            }
        }

        long result = aCount * multiplier + aCountRemainder;
        System.out.println(result);

        return result;
    }

    // Complete the repeatedString function below.
    // Solution that is not optimal from memory perspective
    static long repeatedStringBadMemory(String s, long n) {
        StringBuilder sb = new StringBuilder();
        int letterPosition = 0;
        for (long i = 0; i < n; i++) {
            sb.append(s.charAt(letterPosition));
            if (letterPosition != s.length() - 1) {
                letterPosition++;
            } else {
                letterPosition = 0;
            }
        }

        long result = 0;
        for (int aPosition = 0; aPosition < sb.length(); aPosition++) {
            if (sb.charAt(aPosition) == 'a') {
                result++;
            }
        }

        System.out.println(sb.toString());

        return result;
    }
}

