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
        String print;
        if(a<40) print="T";
        else if(a<55) print="D";
        else if(a<70) print="P";
        else if(a<80) print="A";
        else print=(a<90)?"E":"O";
        System.out.println(print);
    }
}
