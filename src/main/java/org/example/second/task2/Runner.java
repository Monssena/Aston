package org.example.second.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> hobbiesOne  = new ArrayList<>(Arrays.asList("guitar", "motorsport", "programming"));
        List<String> hobbiesTwo  = new ArrayList<>(Arrays.asList("swimming", "dancing", "programming"));

        ImmutablePerson immutablePerson = new ImmutablePerson("Dmitrii", 22, hobbiesOne);
        MutablePerson mutablePerson = new MutablePerson("Dmitrii", 22, hobbiesTwo);

        System.out.println("immutablePerson: " + immutablePerson.getName() + " " + immutablePerson.getAge() + " " + immutablePerson.getHobbies());
        System.out.println("mutablePerson: " + mutablePerson.getName() + " " + mutablePerson.getAge() + " " + mutablePerson.getHobbies());

        mutablePerson.setAge(12);
        //immutablePerson.setAge(12);
        mutablePerson.setName("Vasya");
        //immutablePerson.setName("Vasya");
        mutablePerson.getHobbies().add("Books");
        try {
            immutablePerson.getHobbies().add("Books");
        } catch (UnsupportedOperationException e) {
            System.out.println("You can't change a hobby in immutablePerson");
        }

        System.out.println("Updated immutablePerson: " + immutablePerson.getName() + " " + immutablePerson.getAge() + " " + immutablePerson.getHobbies());
        System.out.println("Updated mutablePerson: " + mutablePerson.getName() + " " + mutablePerson.getAge() + " " + mutablePerson.getHobbies());
    }
}
