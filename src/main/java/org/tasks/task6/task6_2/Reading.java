package org.tasks.task6.task6_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading {

    public static void ReadingAFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/tms.txt"))) {

            System.out.println(br.readLine().replaceAll(" ", "_"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
