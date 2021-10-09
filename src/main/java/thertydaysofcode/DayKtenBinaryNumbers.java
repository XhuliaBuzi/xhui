package thertydaysofcode;

import java.util.Scanner;

public class DayKtenBinaryNumbers {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       char [] stringNumber=Integer.toBinaryString(scanner.nextInt()).toCharArray();
       int sum=0,printSum=0;
        for (char c : stringNumber) {
            int i=Integer.parseInt(Character.toString(c));
            if(i==0){ if(printSum<sum){ printSum=sum;}sum=0;continue;}
            sum += i;
        }
        System.out.println(Math.max(printSum, sum));
    }
}
