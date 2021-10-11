package javapazzel;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pairLeft = new String[t];
        String [] pairRight = new String[t];

        for (int i = 0; i < t; i++) {
            pairLeft[i] = s.next();
            pairRight[i] = s.next();
        }
        Set<String> setString=new HashSet<>();
        for (int i = 0; i < t; i++) {
            setString.add(pairLeft[i]+" "+pairRight[i]);
            System.out.println(setString.size());
        }

    }
}
