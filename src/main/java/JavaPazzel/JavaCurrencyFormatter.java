package JavaPazzel;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        String India="#,##0.00";
        DecimalFormat india=new DecimalFormat(India);
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: Rs." + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}