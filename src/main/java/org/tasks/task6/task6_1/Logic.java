package org.tasks.task6.task6_1;

public class Logic {

    public static boolean verification(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() > 19 || login.contains(" ")) {
            throw new WrongLoginException();
        }

        if (password.length() > 19 || password.contains(" ")|| !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

        return true;
    }
}
