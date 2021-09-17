package InterviewPreparationKit;
import java.util.Scanner;

public class Java2DArrayDS {
    static Scanner scanner = new Scanner(System.in);
    static int[][] arr = new int[6][6];
    static int largsum = -81;
    static int sum;

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int n = scanner.nextInt();
                arr[i][j] = n;
                if(j>1&&i>1){
                    sum=arr[i][j]+arr[i][j-1]+arr[i][j - 2]+ arr[i - 1][j - 1]+arr[i - 2][j]+arr[i - 2][j - 1] + arr[i - 2][j - 2];
                    largsum=sum>largsum?sum:largsum;
                }
            }
        }
        System.out.println(largsum);

    }
}
