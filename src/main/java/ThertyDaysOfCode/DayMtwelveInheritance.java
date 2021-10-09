package ThertyDaysOfCode;

import java.util.Scanner;

public class DayMtwelveInheritance {
    private static final Scanner scanner=new Scanner(System.in);
    private static final String name=scanner.next();
    private static final String surname=scanner.next();
    private static final int id=scanner.nextInt();
    private static final int scoreAvarage=scanner.nextInt();

    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < scoreAvarage; i++) {
            sum+=scanner.nextInt();
        }
        System.out.println("Name: "+surname+" , "+name);
        System.out.println("ID: "+id);
        calculate(sum);
    }
    public static void calculate(int sum){
        int a=sum/scoreAvarage;
        System.out.println((a<40)?"T":(a<55)?"D":(a<70)?"P":(a<80)?"A":(a<90)?"E":"O");
    }
}
