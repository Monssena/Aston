package org.tasks.task4.task4_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> countriesList = new ArrayList<>();

        countriesList.add("United States");
        countriesList.add("Canada");
        countriesList.add("France");

        countriesList.forEach(System.out::println);
        System.out.println();

        //System.out.println(countriesList.set(1, "Russia"));
        countriesList.set(1, "Russia");

        //System.out.println(countriesList.remove(2));
        countriesList.remove(2);

        //System.out.println(countriesList.remove("United States"));
        countriesList.remove("United States");

        //System.out.println(countriesList.indexOf("Russia"));
        countriesList.indexOf("Russia");

        System.out.println(countriesList.contains("Canada"));
    }
}
