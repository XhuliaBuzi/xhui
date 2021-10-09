package problemsolving;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class TimeConversion {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        char[] string = scanner.nextLine().toUpperCase(Locale.ROOT).toCharArray();
        int dd = Integer.parseInt(Character.toString(string[0])) * 10 + Integer.parseInt(Character.toString(string[1]));
        int mm = Integer.parseInt(Character.toString(string[3])) * 10 + Integer.parseInt(Character.toString(string[4]));
        int ss = Integer.parseInt(Character.toString(string[6])) * 10 + Integer.parseInt(Character.toString(string[7]));
        if (string[8] == 'P') dd = (dd == 12) ? dd : (dd + 12);
        else dd = (dd == 12 && ((mm >= 0) || ss >= 0)) ? 0 : dd;
        System.out.printf("%02d:%02d:%02d", dd, mm, ss);
    }
}
