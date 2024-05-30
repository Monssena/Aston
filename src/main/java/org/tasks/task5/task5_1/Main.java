package org.tasks.task5.task5_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        ListPopulator.populateList(list);

        list.forEach(System.out::println);

        int sum = list.stream().distinct().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("\nThe sum of even numbers without duplicates: " + sum);
    }
}
