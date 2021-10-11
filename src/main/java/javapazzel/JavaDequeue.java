package javapazzel;

import java.util.*;

public class JavaDequeue {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int NUMBER = scanner.nextInt();
    private static final int COMBINATION = scanner.nextInt();

    public static void main(String[] args) {
        int print = 0;
        List<Integer> arr = new ArrayList<>();
        Set<Integer> for_calculate_thinks = new HashSet<>(arr);
        for (int i = 0; i < NUMBER; i++) {
            int s = scanner.nextInt();
            arr.add(s);
            for_calculate_thinks.add(s);
            if (arr.size() == COMBINATION) {
                if (for_calculate_thinks.size() > print) print = for_calculate_thinks.size();
                int delete = arr.remove(0);
                if (!arr.contains(delete)) {
                    for_calculate_thinks.remove(delete);
                }
            }
        }
        System.out.println(print);
    }
}
