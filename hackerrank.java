import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */
    double meal_cost;
    int tip_percent;
    int tax_percent;

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip = (tip_percent/100d)*meal_cost;
        double tax = (tax_percent/100d)*meal_cost;
        double total_cost = meal_cost+tip+tax;
        int round = (int) Math.round(total_cost);
        System.out.println(round);



    }

}

public class hackerrank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = 100d;

        int tip_percent = 15;

        int tax_percent = 8;



        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
