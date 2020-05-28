package thirtydaysofcoding.day2;

public class Day2 {

    public static void main(String[] args) {
        day2Challenge(15.50, 15, 10);
    }

    // Complete the solve function below.
    private static void day2Challenge(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double total = meal_cost + tip + tax;
        System.out.println(Math.round(total));
    }
}
