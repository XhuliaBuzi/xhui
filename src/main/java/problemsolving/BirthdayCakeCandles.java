package problemsolving;

import java.util.Scanner;

public class BirthdayCakeCandles {
    private final static Scanner scanner=new Scanner(System.in);
   private final static int NEXT_INT =scanner.nextInt();
    public static void main(String[] args) {
        int[] arrInt=new int[NEXT_INT];
        int test=0;
        int sum=0;
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

