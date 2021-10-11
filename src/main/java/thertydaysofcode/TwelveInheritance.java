package thertydaysofcode;

import java.util.Scanner;

public class TwelveInheritance {
    private static final Scanner scanner=new Scanner(System.in);
    private static final String NAME =scanner.next();
    private static final String SURNAME =scanner.next();
    private static final int ID =scanner.nextInt();
    private static final int SUM =scanner.nextInt();

    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < TwelveInheritance.SUM; i++) {
            sum+=scanner.nextInt();
        }
        System.out.println("Name: "+ SURNAME +" , "+ NAME);
        System.out.println("ID: "+ ID);
        calculate(sum);
    }
    public static void calculate(int sum){
        int a=sum/ TwelveInheritance.SUM;
        System.out.println((a<40)?"T":(a<55)?"D":(a<70)?"P":(a<80)?"A":(a<90)?"E":"O");
    }
}
