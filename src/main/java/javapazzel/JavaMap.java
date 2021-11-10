package javapazzel;

import java.util.HashMap;
import java.util.Scanner;

class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(in.nextLine(), in.nextInt());
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(hashMap.containsKey(s) ? (s + "=" + hashMap.get(s)) : "Not found");
        }
    }
}