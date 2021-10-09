package thertydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DayNfourteenScope {
    private static final Scanner scaner=new Scanner(System.in);
    private static final int n=scaner.nextInt();
    private static final List<Integer> listOfNumber=new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            listOfNumber.add(scaner.nextInt());
        }
        Collections.sort(listOfNumber);
        System.out.println(listOfNumber.get(n-1)-listOfNumber.get(0));
    }
}
