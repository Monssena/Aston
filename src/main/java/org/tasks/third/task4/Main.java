package org.tasks.third.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String line;

        try (Scanner in = new Scanner(System.in)) {
            line = in.nextLine();
        }

        System.out.println(RepeatChar.repeatChar(line));
    }
}
