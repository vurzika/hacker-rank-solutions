package interviewkit.warmup;

public class CountingValleys {

    public static void main(String[] args) {
        String s = "DDUUDDUDUUUD";
        int n = 12;

        System.out.println(countingValleys(n, s));
    }

    // (Original) Print a single integer that denotes the number of valleys Gary walked through during his hike.
    public static int countingValleys(int n, String s) {
        int result = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                sum++;
            } else if (s.charAt(i) == 'D') {
                sum--;
                if (sum == -1) {
                    result++;
                }
            }
        }

        System.out.println(result);

        return result;
    }

    // (Advanced, State Machine) Print a single integer that denotes the number of valleys Gary walked through during his hike.
    // Valley = 2 or more D in a row
    public static int countingValleysAdvanced(int n, String s) {
        if (s == null || s.length() <= 2) {
            System.out.println(0);
            return 0;
        }

        boolean walks = true;
        boolean walksDown = false;
        boolean downAlley = false;

        int result = 0;

        for (int i = 0; i < n; i++) {
            char letter = s.charAt(i);
            if (walks) {
                if (letter == 'D') {
                    walksDown = true;
                    walks = false;
                }
            } else if (walksDown) {
                if (letter == 'D') {
                    downAlley = true;
                    walksDown = false;
                    result += 1;
                } else if (letter == 'U') {
                    walks = true;
                    walksDown = false;
                }
            } else if (downAlley) {
                if (letter == 'U') {
                    downAlley = false;
                    walks = true;
                }
            }
        }
        System.out.println(result);

        return result;
    }
}

