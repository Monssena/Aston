package org.tasks.task5.task5_1;

import java.util.List;
import java.util.Random;

public class ListPopulator {

    private static final Random rand = new Random();

    public static void populateList(List<Integer> list) {

        for (int i = 0; i < 100; i++) {
            list.add(rand.nextInt(100));
        }
    }
}
