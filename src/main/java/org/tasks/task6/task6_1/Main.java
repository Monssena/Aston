package org.tasks.task6.task6_1;

public class Main {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        //Все верно
        System.out.println(Logic.verification("Login", "Pass1", "Pass1"));

        //Не правильный пароль
        System.out.println(Logic.verification("Login", "Pass", "Pass2"));

    }
}
