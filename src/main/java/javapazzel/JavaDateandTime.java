package javapazzel;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateandTime {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int month=scanner.nextInt();
        int day=scanner.nextInt();
        int year=scanner.nextInt();
        System.out.println(dayOfYear(month,day,year));
    }
    public static String dayOfYear (int month,int day,int year){
        LocalDate localDate=LocalDate.of(year,month,day);
        return localDate.getDayOfWeek().name();
    }
}
