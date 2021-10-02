package TenDaysOfStatistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BDayOneStandardDeviation {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int sizeOfList = scanner.nextInt();

    public static void main(String[] args) {
        List<Integer> listofIntager = new ArrayList<>();
        double sumof = 0;

        for (int i = 0; i < sizeOfList; i++) {
            listofIntager.add(scanner.nextInt());
        }
        Collections.sort(listofIntager);
        double mode = calculateMode(listofIntager);
        for (int i = 0; i < sizeOfList; i++) {
            sumof += Math.pow(listofIntager.get(i) - mode, 2)/sizeOfList;
        }
        System.out.printf("%.1f", Math.sqrt(sumof));
    }

    public static double calculateMode(List<Integer> listofIntager) {
        Integer sum=listofIntager.stream()
                     .reduce(0,Integer::sum);
       return (double)sum/listofIntager.size();
    }
}
