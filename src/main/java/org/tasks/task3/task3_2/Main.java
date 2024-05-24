package org.tasks.task3.task3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < 3; i++) {
                list.add(scanner.nextLine());
            }
        }

        SearchStrings searchStrings = new SearchStrings();
        searchStrings.getLines(list);
    }
}
