package ThertyDaysOfCode;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class DayJEightDictionariesAndMaps {
    static Scanner scanner=new Scanner(System.in);
   private static final int numberofPhons=scanner.nextInt();
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < numberofPhons; i++) {
            map.put(scanner.next().toLowerCase(Locale.ROOT),scanner.nextInt());
        }
        while(scanner.hasNext()){
            String s=scanner.next();
            System.out.println(map.get(s.toLowerCase(Locale.ROOT))!=null?(s+"="+map.get(s.toLowerCase())):"Not found");

        }
    }
}


