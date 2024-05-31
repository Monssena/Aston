package org.tasks.task6.task6_1;

public class Logic {

    private static final int NUMBER_OF_CHARACHERS = 19;

    public static boolean verification(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() > NUMBER_OF_CHARACHERS || login.contains(" ")) {
            throw new WrongLoginException();
        }

        if (password.length() > NUMBER_OF_CHARACHERS || password.contains(" ")|| !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

        return true;
    }
}
