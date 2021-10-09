package javapazzel;

import java.util.Locale;
import java.util.Scanner;

public class JavaAnagrams {
    private static final Scanner scanner = new Scanner(System.in);
    private static final char[] first = scanner.next().toUpperCase(Locale.ROOT).toCharArray();
    private static final char[] second = scanner.next().toUpperCase(Locale.ROOT).toCharArray();
    private static final char[] forCalculate = Math.max(first.length, second.length) == first.length ? first.clone() : second.clone();

    public static void main(String[] args) {
        boolean tf=true;
        for (char c : forCalculate) {
            tf = calculateString(first, c) == calculateString(second, c);
            if (!tf) break;

        }
        System.out.println(tf?"Anagrams":"Not Anagrams");
    }

    public static int calculateString(char[] chars, char string) {
        int sum = 0;
        for (char find : chars) {
            sum += (find == string) ? 1 : 0;
        }
        return sum;
    }
}
