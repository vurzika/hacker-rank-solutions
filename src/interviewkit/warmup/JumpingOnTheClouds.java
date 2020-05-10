package interviewkit.warmup;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        int[] c = new int[]{0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c));
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;

        while (i < c.length - 1) {
            if ((i + 2 < c.length) && (c[i + 2] == 0)) {
                i = i + 2;
            } else if (c[i + 1] == 0) {
                i = i + 1;
            }
            jumps++;
        }

        System.out.println(jumps);

        return jumps;
    }
}

