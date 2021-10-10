package javapazzel;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    private static final Scanner scanner =new Scanner(System.in);
    private static final int NEXT_INT =scanner.nextInt();
    public static void main(String[] args) {
        String[] bigDecimalList=new String[NEXT_INT];
        for (int i = 0; i < NEXT_INT; i++) {
            bigDecimalList[i]=scanner.next();
        }
        Arrays.sort(bigDecimalList, (a, b) -> {
            if( a == null || b == null ) return 0;
            BigDecimal x = new BigDecimal(a);
            BigDecimal y = new BigDecimal(b);
            return  (x.compareTo(y) > 0 )?-1:1;

        });
        for (String arr:bigDecimalList) {
            System.out.println(arr);
        }
    }
}
