package thertydaysofcode;

import java.util.Scanner;

class Person {
    private int age;
    private String s = "";

    public Person(int initialAge) {
        if (initialAge <= 0) {
            this.age = 0;
            s = "Age is not valid, setting age to 0.\n";
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        s += age < 13 ? "You are young." : age < 18 ? "You are a teenager." : "You are old.";

        System.out.println(s);
    }

    public void yearPasses() {
        age++;
        s = "";
    }

  static class DayFourClassVsInstance {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                Person p = new Person(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }
    }
}
