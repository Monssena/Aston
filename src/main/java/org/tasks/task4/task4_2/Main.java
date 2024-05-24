package org.tasks.task4.task4_2;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> countriesList = new LinkedList<>();

        countriesList.addFirst("United States");
        countriesList.addFirst("India");
        countriesList.addLast("Russia");
        countriesList.addLast("Germany");

        countriesList.forEach(System.out::println);

        countriesList.removeFirst();
        countriesList.removeLast();

        System.out.println("\nThe list after deleting the first and last: ");
        countriesList.forEach(System.out::println);

        System.out.println("\nThe first item in the list: " + countriesList.getFirst());
        System.out.println("The last item in the list: " + countriesList.getLast());

    }
}
