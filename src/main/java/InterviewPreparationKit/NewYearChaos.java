package InterviewPreparationKit;

import java.util.Scanner;

public class NewYearChaos {
    static Scanner scanner = new Scanner(System.in);
    static byte t = scanner.nextByte();
    static int p1 = 0;
    static int p2 = 0;
static String string = "";
    public static void main(String[] args) {

        for (int i = 0; i < t; i++) {
            int numberArray = scanner.nextInt();
            int sum = 0;
            int w = 0;
            boolean booleanTrue = true;
            int[] array = new int[numberArray];
            for (int a = 0; a < array.length; a++) {
                array[a] = (byte) (a + 1);
            }
            int[] array2 = new int[numberArray];
            for (int j = 0; j < array2.length; j++) {
                array2[j] = scanner.nextInt();
            }
            while (true) {
                w = 0;
                for (int j = 0; j < array2.length; j++) {
                    for (int k = w; k < array2.length; k++) {
                        int movment = 0;
                        if (array2[j] == array[k] && booleanTrue == true) {
                            int pozition = (k - j);
                            int test = k;
                            for (int l = 0; l < pozition; l++) {
                                w = array2[j];
                                int vl = array[test];
                                array[test] = array[test - 1];
                                array[test - 1] = vl;
                                sum++;
                                movment++;
                                test--;
                            }
                        }
                        if (movment > 2) {
                            string = "Too chaotic";
                            booleanTrue = false;
                            break;
                        }

                    }

                }
                p1 = array[array.length - 1];
                p2 = array2[array.length - 1];
                if (p1 == p2 || booleanTrue == false) {
                    break;
                }
            }

            System.out.println(booleanTrue == true ? sum : string);


        }


    }

}
