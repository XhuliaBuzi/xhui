package thertydaysofcode;

import java.util.Scanner;

class Calculator extends Exception {
    public int power(int n, int p){
        if (n >= 0 && p >= 0) return (int) Math.pow(n, p);
        else try {
            throw new Exception("n and p should be non-negative");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
}

public class MoreExceptions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}


