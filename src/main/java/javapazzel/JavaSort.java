package javapazzel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

record Student(int id, String name, double cgpa) {
    public int getId() {
        return id;
    }

    public String GetName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, name, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::GetName).thenComparing(Student::getId));
        for (Student st : studentList) {
            System.out.println(st.GetName());
        }
    }
}



