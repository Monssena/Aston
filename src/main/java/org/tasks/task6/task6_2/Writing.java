package org.tasks.task6.task6_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writing {

    public static void writingToAFile() {

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/tms.txt"))) {

            bufferedWriter.write(scanner.nextLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
