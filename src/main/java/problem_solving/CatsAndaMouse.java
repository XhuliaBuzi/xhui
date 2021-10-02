package problem_solving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class CatsAndaMouse {


    private static final Scanner scanner = new Scanner(System.in);
    static String catAndMouse(int x, int y, int z) {
        int fist=Math.abs(x-z);
        int second=Math.abs(y-z);
        return (fist<second)?"Cat A":fist>second?"Cat B":"Mouse C";
    }
    public static void main(String[] args) throws IOException {


            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {

                int x = scanner.nextInt();

                int y = scanner.nextInt();

                int z = scanner.nextInt();

                String result = catAndMouse(x, y, z);

                System.out.println(result);
        }

        scanner.close();
    }
}
