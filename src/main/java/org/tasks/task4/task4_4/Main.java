package org.tasks.task4.task4_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        StudentManager studentManager = new StudentManager();

        students.add(new Student("Dmitrii", 1));
        students.add(new Student("Mary", 1));
        students.add(new Student("Alexandra", 1));
        students.add(new Student("Vasya", 2));
        students.add(new Student("Anton", 2));
        students.add(new Student("Galya", 3));
        students.add(new Student("Vanya", 3));


        System.out.println("\nStudents from the first course: ");
        studentManager.printStudent(students,1);

        studentManager.transferNextCourse(students);

        System.out.println("\nFirst year students after completing the second year: ");
        studentManager.printStudent(students,1);

        System.out.println("\nStudents from the second course: ");
        studentManager.printStudent(students,2);
    }
}
