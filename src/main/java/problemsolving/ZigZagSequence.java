package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence {
   private static final Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
    int testCases = scanner.nextInt();
    for(int cs = 0; cs < testCases; cs++){
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for(int i = 0; i < n; i++){
            ints[i] = scanner.nextInt();
        }
        findZigZagSequence(ints, n);
    }
}

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n +1)/2-1;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}



