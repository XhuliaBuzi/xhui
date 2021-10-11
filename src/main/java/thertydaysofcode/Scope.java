package thertydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Scope {
    private static final Scanner scanner=new Scanner(System.in);
    private static final int N =scanner.nextInt();
    private static final List<Integer> ARRAY_LIST =new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            ARRAY_LIST.add(scanner.nextInt());
        }
        Collections.sort(ARRAY_LIST);
        System.out.println(ARRAY_LIST.get(N -1)- ARRAY_LIST.get(0));
    }
}
