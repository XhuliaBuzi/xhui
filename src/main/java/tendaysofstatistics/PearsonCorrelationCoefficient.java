package tendaysofstatistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PearsonCorrelationCoefficient {
    private static final Scanner scanner=new Scanner(System.in);
    private static final int numberofArray=scanner.nextInt();
    private static final List<Double> first=new ArrayList<>();
    private static final List<Double> second=new ArrayList<>();

    public static void main(String[] args) {
        reade(first);
        reade(second);
        System.out.println(forSDeviaton());
    }
    private static void reade(List<Double>a){
        for (int i = 0; i < numberofArray; i++) {
            a.add(scanner.nextDouble());
        }
    }
    private static double formean(List<Double>a){
        return a.stream().reduce((double) 0, Double::sum)/numberofArray;
    }
    private static double forSDeviaton(){
        double d=personCorrelation()>0?personCorrelation():1;
        double f=Math.pow(10,3);
        return Math.round(d * f) / d;

    }
    private static double personCorrelation(){
        double meanX=formean(first);
        double meanY=formean(second);
        double dfirst=0;
        double dsecond=0;
        double sum=0;
        for (int i = 0; i < numberofArray; i++) {
        sum+=(first.get(i)-meanX)*(second.get(i)-meanY);
        dfirst+=Math.pow((first.get(i)-meanX),2);
        dsecond+=Math.pow((second.get(i)-meanX),2);
        }

        return sum/Math.sqrt(dfirst*dsecond);
    }
}
