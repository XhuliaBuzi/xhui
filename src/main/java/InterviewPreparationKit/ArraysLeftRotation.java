package InterviewPreparationKit;

import java.util.Scanner;

public class ArraysLeftRotation {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int array=scanner.nextInt();
        int d=scanner.nextInt();
        int[] arrayInt=new int[array];
        for (int i = 0; i < arrayInt.length; i++) { arrayInt[i]=scanner.nextInt(); }
        for (int i = 0; i < d; d--) {
            int vler=arrayInt[i];
            for (int j = 0; j < arrayInt.length-1; j++) {
                arrayInt[j]=arrayInt[j+1];
            }
            arrayInt[arrayInt.length-1]=vler;
        }

        for (int a:arrayInt) {
            System.out.print(a+" ");
        }
    }
}
