/*Applying the java.util.Comparator to sort a students of Student by the average grade in
        ascending and descending order. The attributes of Student:
        • Student’s name: name (String);
        • Student’s grade: mathematics, programming, DSA1 (double).
        • Student’s average grade: avg = 1
        3
        (mathematics + programming + DSA1)
*/
import java.util.Comparator;

import static java.util.Arrays.sort;

public class Ex2 {
    public static void main(String[] arsg) {
        Student[] students = new Student[10]; // init students array
        students[0] = new Student("A", 5, 6, 7);
        students[3] = new Student("B", 7, 8, 9);
        students[4] = new Student("C", 9, 10, 10);
        students[1] = new Student("D", 10, 10, 10);
        students[2] = new Student("E", 10, 10, 10);
        students[5] = new Student("F", 6, 7, 8);
        students[6] = new Student("G", 7, 10, 5);
        students[7] = new Student("H", 10, 10, 10);
        students[8] = new Student("J", 3, 2, 5);
        students[9] = new Student("L", 1, 10, 9);
        System.out.println("Before sort:");
        for (Student student : students) {
            System.out.print(student.getName() + " " + student.getAvg() + " | ");
        }
        System.out.println();
        System.out.println("After sort:");
        Comparator<Student> comparator = new Comparator<Student>() { // anonymous class (Nested Class)
            @Override
            public int compare(Student o1, Student o2) { // compare two students by their avg
                if (o1.getAvg() > o2.getAvg()) return 1;
                else if (o1.getAvg() < o2.getAvg()) return -1;
                else return 0;
            }
        };
        sort(students, comparator); // sort the students by the comparator in ascending order
        for (Student student : students) {
            System.out.print(student.getName() + " " + student.getAvg() + " | ");
        }

    }
}
