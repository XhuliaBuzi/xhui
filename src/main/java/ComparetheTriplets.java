import java.util.Scanner;

public class ComparetheTriplets {
    static Scanner scanner = new Scanner(System.in);
    private static int aPoint = 0;
    private static int bPoint = 0;
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b= new int[3];
        for (int j = 0; j < 3; j++) {
            a[j]=scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i]=scanner.nextInt();
            if (a[i]!=b[i]) if ((a[i] > b[i])) aPoint++; else bPoint++;
        }
        System.out.println(aPoint+" "+bPoint);
    }
}
