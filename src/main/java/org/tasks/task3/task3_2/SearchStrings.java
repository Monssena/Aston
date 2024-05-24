package org.tasks.task3.task3_2;

import java.util.List;

public class SearchStrings {

    private double sum = 0;

    private double getAverage(List<String> lines) {

        for (String s : lines) {
            sum += s.length();
        }

        return  sum /= lines.size();
    }

    public void getLines(List<String> lines) {

        double average = getAverage(lines);

        System.out.println("Average: " + average);

        for (String s : lines) {
            if (s.length() < average) {
                System.out.println(s + " (length: " + s.length() + ")");
            }
        }
    }
}
