package org.tasks.second.task2;

import java.util.Collections;
import java.util.List;

public class ImmutablePerson {

    private String name;
    private int age;
    private List<String> hobbies;


    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = Collections.unmodifiableList(hobbies);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
