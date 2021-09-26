package ThertyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
      double sum=((double) tip_percent/100)*meal_cost+((double) tax_percent/100)*meal_cost+meal_cost;
        System.out.println(Math.round(sum));

    }

}
public class Day2DataTypes {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

            int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

            int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

            Result.solve(meal_cost, tip_percent, tax_percent);

            bufferedReader.close();
        }

}