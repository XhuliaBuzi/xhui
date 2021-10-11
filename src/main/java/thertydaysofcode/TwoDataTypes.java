package thertydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Result {
     private Result() {
         throw new IllegalStateException("Utility class");
     }
    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        double sum = ((double) tipPercent / 100) * mealCost + ((double) taxPercent / 100) * mealCost + mealCost;
        System.out.println(Math.round(sum));

    }

}

public class TwoDataTypes {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double mealCost = Double.parseDouble(bufferedReader.readLine().trim());

        int parseInt = Integer.parseInt(bufferedReader.readLine().trim());

        int taxPercent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(mealCost, parseInt, taxPercent);

        bufferedReader.close();
    }

}