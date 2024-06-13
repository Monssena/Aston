package org.tasks.task9;

public class Main {

    public static void main(String[] args) {

        Singleton singleton_1 = Singleton.getInstance();

        singleton_1.setLine("Hello World!");

        System.out.println(singleton_1.getLine());


        Singleton singleton_2 = Singleton.getInstance();

        System.out.println(singleton_2.getLine());
    }
}
