package problemsolving;

import java.util.Scanner;

public class DayoftheProgrammer {
    static Scanner scanner = new Scanner(System.in);
    static int year = scanner.nextInt();

    public static void main(String[] args) {

        if (year >= 1700 && year <= 2700) {
            int feb = ((year > 1918 && year % 400 == 0) || ((year <= 1917 && year % 4 == 0) || (year % 4 == 0 && year % 100 != 0))) ? 29 : 28;
            int days = 256-((5 * 31) + (2 * 30) + feb);
            if (year==1918){
                days=26;
            }
            System.out.printf("%02d.%02d.%04d", days, 9, year);
        }
    }
}