package interviewpreparationkit;
import java.io.*;

class digitSum {

    public static int superDigit(String n, int k) {
        for (int i = 0; i < k; i++) {
            int sum = 0;
            if(n.length()==1) {
                int number=Integer.parseInt(String.valueOf(n.charAt(0)));
                if(number>k){sum = number-k;}
                else break;}
            else{
                for (int j = 0; j < n.length(); j++) {
                    sum += Integer.parseInt(String.valueOf(n.charAt(j)));
                }
            }
            n = String.valueOf(sum);
        }
        int print =Integer.parseInt(n)*k;
        if(print>9) return Integer.parseInt(n);
        return print;
    }

}
public class RecursiveDigitSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = digitSum.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

