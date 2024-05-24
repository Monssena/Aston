package org.tasks.task4.task4_3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Person> personHashSet = new HashSet<>();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        personHashSet.add(person1);
        personHashSet.add(person2);
        personHashSet.add(person3);

        personHashSet.forEach(System.out::println);

        personHashSet.remove(person1);
        personHashSet.remove(person2);

        System.out.println("\n" + personHashSet.contains(person3));
    }
}
