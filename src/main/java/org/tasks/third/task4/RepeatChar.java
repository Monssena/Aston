package org.tasks.third.task4;

public class RepeatChar {

    public static String repeatChar(String str) {

        char[] chars = str.toCharArray();
        StringBuilder resString = new StringBuilder();

        for (char c : chars) {
            resString.append(c).append(c);
        }

        return resString.toString();
    }
}
