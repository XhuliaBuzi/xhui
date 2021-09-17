package ProblemSolving;

import java.util.Scanner;

public class PlusMinus {
    static Scanner scanner=new Scanner(System.in);
    private static int pozitiv=0;
    private static int zero=0;
    private static int negtive=0;
    public static void main(String[] args) {
        int numberOfArray=scanner.nextInt();
        int[] arr=new int[numberOfArray];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
            if (arr[i]>0) pozitiv++;
            else if(arr[i]==0) zero++;
            else negtive++;

        }

        System.out.printf("%07f"+"\n",(float) pozitiv/numberOfArray);
        System.out.printf("%07f"+"\n",(float) negtive/numberOfArray);
        System.out.printf("%07f"+"\n",(float) zero/numberOfArray);
    }
}
