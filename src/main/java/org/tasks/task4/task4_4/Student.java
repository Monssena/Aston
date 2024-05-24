package org.tasks.task4.task4_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {

    private final String name;
    private final int group;
    private int course;
    private List<Integer> mathematics = new ArrayList<>();
    private List<Integer> literature = new ArrayList<>();
    private List<Integer> physics = new ArrayList<>();

    public Student(String name, int group) {

        this.name = name;
        this.group = group;
        this.course = 1;

        addEvaluations();
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageScore() {

        int sum = 0;
        int count = 0;

        for (Integer mathematics : mathematics) {
            sum += mathematics;
            count++;
        }

        for (Integer literature : literature) {
            sum += literature;
            count++;
        }

        for (Integer physics : physics) {
            sum += physics;
            count++;
        }

        return (double) sum /count;
    }

    private void addEvaluations() {

        Random random = new Random();
        List<List<Integer>> subjects = new ArrayList<>();

        subjects.add(mathematics);
        subjects.add(literature);
        subjects.add(physics);

        for (List<Integer> subject : subjects) {

            for (int j = 0; j < 5; j++) {
                subject.add(random.nextInt(5) + 1);
            }
        }
    }

    @Override
    public String toString() {
        return "Student " + name + ", group " + group + ", course " + course + ", average score " + getAverageScore();
    }
}
