package ThertyDaysOfCode;

import java.util.Scanner;

public class Day1DataTypes {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int number=scanner.nextInt();
        double doublenumber=scanner.nextDouble();
        String string=scanner.nextLine()+scanner.nextLine();

        System.out.println(number+4);
        System.out.println(doublenumber+4);
        System.out.println("HackerRank "+string);
    }
}
