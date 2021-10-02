package TenDaysOfStatistics;

import java.util.*;

public class BDayOneQuartiles {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int numberOfArray = scanner.nextInt();

    public static void main(String[] args) {
        List<Integer> intagerArray = new ArrayList<>();
        for (int i = 0; i < numberOfArray; i++) {
            intagerArray.add(scanner.nextInt());
        }
        Collections.sort(intagerArray);
        System.out.println(calculate(intagerArray, intagerArray.size()/ 2, intagerArray.size() / 4));
        System.out.println(calculate(intagerArray, intagerArray.size(), intagerArray.size() / 2));
        System.out.println(calculate(intagerArray, intagerArray.size() / 2, intagerArray.size() / 2 + intagerArray.size() / 4 ));

    }

    public static int calculate(List<Integer> intagerArray, int question, int number) {
  if(numberOfArray%2!=0&&number==intagerArray.size() / 2 + intagerArray.size() / 4){number++;}
        return (question % 2 == 0) ? (intagerArray.get(number) + intagerArray.get(number - 1)) / 2 : intagerArray.get(number);
    }
}
