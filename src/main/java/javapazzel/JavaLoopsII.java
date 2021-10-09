package javapazzel;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double sum=a;
            for(int j=0;j<n;j++){
                double s=Math.pow(2,j)*b;
                sum+=s;
                System.out.print((int) sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}