package org.tasks.task4.task4_4;

import java.util.List;

public class StudentManager {

    public void transferNextCourse(List<Student> students) {

        for (int i = 0; i < students.size(); i++) {

            Student student = students.get(i);

            if (student.getAverageScore() < 3 || student.getCourse() == 4) {
                students.remove(student);
                --i;
            } else student.setCourse(student.getCourse() + 1);
        }
    }

    public void printStudent(List<Student> studentsList, int course) {

        for (Student student : studentsList) {

            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
