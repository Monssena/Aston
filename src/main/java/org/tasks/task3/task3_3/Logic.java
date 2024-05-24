package org.tasks.task3.task3_3;

import java.util.ArrayList;
import java.util.List;

public class Logic {


    public static List<String> checkingChar(String input) {

        input = input.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        String[] words = input.split(" ");
        List<String> resWord = new ArrayList<>();

        for (String word : words) {

            char[] wordChars = word.toCharArray();

            if (!checkChar(wordChars)) {
                resWord.add(word);
            }
        }
        return resWord;
    }

    private static boolean checkChar(char[] wordChars) {
        int[] alphabet = new int[256];

        for (char c : wordChars) {
            if (alphabet[(byte) c] == 0) {
                alphabet[(byte) c]++;
            } else {
                return true;
            }
        }
        return false;
    }
}
