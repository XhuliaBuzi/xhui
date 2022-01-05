package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FindHackerRank {

    public static void main(String[] args) {
        RegrexH h = new RegrexH();
        h.testin();
    }
}

class RegrexH {
    public void testin() {
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        String wirdSpace = scanner.nextLine();
        int print;
        for (int i = 0; i < numberOfInput; i++) {
            String word = scanner.nextLine();
            if (Pattern.compile("hackerrank$").matcher(word).find()) print = 2;
            else if (Pattern.compile("^hackerrank").matcher(word).find()) print = 1;
            else if (Pattern.compile("^hackerrank$").matcher(word).find()) print = 0;
            else print = -1;
            System.out.println(print);
        }
    }
}