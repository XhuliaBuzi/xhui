package tendaysofstatistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BDayOneInterquartileRange {    private static final Scanner scanner = new Scanner(System.in);
    private static final int numberOfArray = scanner.nextInt();

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < numberOfArray; i++) {
            a.add(scanner.nextInt());
        }
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < numberOfArray; i++) {
            b.add(scanner.nextInt());
        }
        List<Integer> intagerArray = new ArrayList<>();
        for (int i = 0; i < numberOfArray; i++) {
            int sizeB= b.get(i);
            for (int j = 0; j <sizeB; j++) {
                intagerArray.add(a.get(i));
            }
        }
        Collections.sort(intagerArray);
       int first=calculate(intagerArray, intagerArray.size()/ 2, intagerArray.size() / 4);
       int second=calculate(intagerArray, intagerArray.size() / 2, intagerArray.size() / 2 + intagerArray.size() / 4 );
        System.out.println((double) second-first);

    }

    public static int calculate(List<Integer> intagerArray, int question, int number) {
        if(numberOfArray%2!=0&&number==intagerArray.size() / 2 + intagerArray.size() / 4){number++;}
        return (question % 2 == 0) ? (intagerArray.get(number) + intagerArray.get(number - 1)) / 2 : intagerArray.get(number);
    }
}
