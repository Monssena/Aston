package org.tasks.task6.task6_1;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(){
        super();
    }

    public WrongPasswordException(String message){
        super(message);
    }
}
