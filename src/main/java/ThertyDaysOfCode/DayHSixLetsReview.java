package ThertyDaysOfCode;

import java.util.Scanner;

public class DayHSixLetsReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            char[] charString = scanner.next().toCharArray();
            StringBuilder first = new StringBuilder(String.valueOf(charString[0]));
            StringBuilder second = new StringBuilder();
            for (int j = 1; j < charString.length; j++) {
                if (j % 2 == 0) {
                    first.append(charString[j]);
                } else {
                    second.append(charString[j]);
                }
            }
            System.out.println(first + " " + second);
        }

    }
}
