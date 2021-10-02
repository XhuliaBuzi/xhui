package TenDaysOfStatistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ADayZeroMeanMedianAndMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrayIntager = new ArrayList<>();
        int numberofArray = scanner.nextInt();
        for (int i = 0; i < numberofArray; i++) {
            arrayIntager.add(scanner.nextInt());
        }
        Collections.sort(arrayIntager);
        calculateMean(arrayIntager);
        calculateMedian(arrayIntager);
        calculateMode(arrayIntager);
    }

    public static void calculateMean(List<Integer> arrayIntager) {
        Integer sum = arrayIntager.stream()
                .reduce(0, Integer::sum);
        System.out.println((double) sum / arrayIntager.size());

    }

    public static void calculateMedian(List<Integer> arrayIntager) {
        int i = arrayIntager.size() / 2;
        System.out.println(arrayIntager.size() % 2 == 0 ? (double) (arrayIntager.get(i) + arrayIntager.get(i - 1)) / 2 : arrayIntager.get(i));
    }

    public static void calculateMode(List<Integer> arrayIntager) {
        int number = arrayIntager.get(0);
        int print = 0;
        int test = 0;
        int iplusOnePozition = 1;
        for (int i = 0; i < arrayIntager.size() - 1; i++) {
            int numberofCopys = 1;
            for (int j = iplusOnePozition; j < arrayIntager.size(); j++) {
                if (arrayIntager.get(i).equals(arrayIntager.get(j))) {
                    if (!arrayIntager.get(i).equals(number)) {
                        number = arrayIntager.get(i);
                    }
                    numberofCopys++;
                }
                if (test < numberofCopys) {
                    print = arrayIntager.get(i);
                    test = numberofCopys;
                }
            }
            iplusOnePozition++;
        }
        System.out.println(print);
    }
}
