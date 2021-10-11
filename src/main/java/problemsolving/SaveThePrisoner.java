package problemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Section {

    private Section() {
        throw new IllegalStateException("Utility class");
    }

    public static int saveThePrisoner(int n, int m, int s) {
        int t = (m + s) % n - 1;
        int k = (m % n + s) - 1;
        if(t > 0) return t;
        else if(k == 0) return (s == 1 ? n : s);
        else return k;
    }

}

public class SaveThePrisoner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int s = Integer.parseInt(firstMultipleInput[2]);

                System.out.println(Section.saveThePrisoner(n, m, s));


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

    }
}