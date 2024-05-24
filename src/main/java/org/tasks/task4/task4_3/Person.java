package org.tasks.task4.task4_3;

public class Person {

    private final int serviceNumber;
    private static int count;

    public Person() {
        this.serviceNumber = count;
        count++;
    }

    @Override
    public String toString() {
        return "Service number of the person: " + serviceNumber;
    }
}
