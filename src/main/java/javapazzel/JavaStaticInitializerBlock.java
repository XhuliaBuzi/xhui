package javapazzel;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static final Scanner scanner=new Scanner(System.in);
    public static final byte NEXT_BYTE =scanner.nextByte();
    public static final byte H=scanner.nextByte();
    public static final boolean FLAG = NEXT_BYTE >0&&H>0;
    static {if(!FLAG){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }}
    public static void main(String[] args){
        if(FLAG){
            System.out.print(NEXT_BYTE *H);
        }}
}
