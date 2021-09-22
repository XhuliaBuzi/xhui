package problem_solving;

import java.util.Scanner;

public class BirthdayCakeCandles {
   static Scanner scanner=new Scanner(System.in);
   static int numberofCandels=scanner.nextInt();
    public static void main(String[] args) {
        int[] arrInt=new int[numberofCandels];
        int test=0,sum=0;
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i]=scanner.nextInt();
            if (arrInt[i] == test) {
                sum++;
            }else if (arrInt[i] > test) {
                test=arrInt[i];
                sum=1;
            }
        }
        System.out.println(sum);
    }
}

