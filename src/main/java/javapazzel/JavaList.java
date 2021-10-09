package javapazzel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class JavaList {
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> listOfArray = new ArrayList<>();

    public static void main(String[] args) {
        int sizeOfArrayList = scanner.nextInt();

        for (int i = 0; i < sizeOfArrayList; i++) {
            listOfArray.add(scanner.nextInt());
        }
        int calculateNumber = scanner.nextInt();
        calculate(calculateNumber);
        for (Integer i : listOfArray) {
            System.out.print(i + " ");
        }
    }

    public static void calculate(int a) {
        for (int i = 0; i < a; i++) {
            String s = scanner.next().toUpperCase(Locale.ROOT);
            if (s.equals("INSERT")) {
                int pozition = scanner.nextInt();
                int number = scanner.nextInt();
                listOfArray.add(pozition, number);
            } else if (s.equals("DELETE")) {
                int pozition = scanner.nextInt();
                listOfArray.remove(pozition);
            }
        }
    }
}
