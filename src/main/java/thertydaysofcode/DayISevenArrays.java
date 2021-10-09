package thertydaysofcode;

import java.util.Scanner;

public class DayISevenArrays {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String s="";
        int array=Integer.parseInt(scanner.nextLine());
        int[]arrayInt=new int[array];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i]=scanner.nextInt();
        }
        for (int i = arrayInt.length-1; i >=0; i--) {
            s+=" "+arrayInt[i];
        }
        System.out.println(s.trim());
    }
}
