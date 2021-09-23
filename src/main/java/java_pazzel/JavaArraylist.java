package java_pazzel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String t = scanner.nextLine().trim();
        int sizeOfArray = Integer.valueOf(t);
        List<ArrayListCalculator> arrayCalculator = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            String s = scanner.nextLine();
            arrayCalculator.add(new ArrayListCalculator(s));
        }
        int surchSomting = scanner.nextInt();
        for (int i = 0; i < surchSomting; i++) {
            try {
                int n = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(arrayCalculator.get(n - 1).getList().get(b));
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Error!");
            }
        }

    }


}

class ArrayListCalculator {
    List<Integer> list = new ArrayList<>();

    public ArrayListCalculator(String s) {
        String[] chars = s.split(" ");
        for (String c : chars) {
            list.add(Integer.valueOf(c));
        }
    }

    public List<Integer> getList() {
        return list;
    }
}