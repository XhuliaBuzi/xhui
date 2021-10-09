package javapazzel;

import java.util.*;

public class JavaDequeue {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int numberofArray = scanner.nextInt();
    private static final int combination = scanner.nextInt();

    public static void main(String[] args) {
        int print = 0;
        List<Integer> arr = new ArrayList<>();
        Set<Integer> forcalculatethinks = new HashSet<>(arr);
        for (int i = 0; i < numberofArray; i++) {
            int somthing = scanner.nextInt();
            arr.add(somthing);
            forcalculatethinks.add(somthing);
            if (arr.size() == combination) {
                if (forcalculatethinks.size() > print) print = Math.max(print, forcalculatethinks.size());
                int delete = arr.remove(0);
                if (!arr.contains(delete)) {
                    forcalculatethinks.remove(delete);
                }
            }
        }
        System.out.println(print);
    }
}
