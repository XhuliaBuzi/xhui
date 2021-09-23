import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LonelyInteger {
    static Scanner scanner = new Scanner(System.in);
    static int numberArray = scanner.nextInt();

    public static void main(String[] args) {
        List<Integer> numberSum = new ArrayList<>();
        for (int i = 0; i < numberArray; i++) {
            numberSum.add(scanner.nextInt());
        }
        lonelyinteger(numberSum);
    }

    public static void lonelyinteger(List<Integer> a) {
            for (int j = 1; j < a.size(); j++) {
                if (a.get(0).equals(a.get(j))) {
                    a.remove(j);
                    a.remove(0);
                  j=0;
                }
        }
        System.out.println(a.get(0));
    }
}
