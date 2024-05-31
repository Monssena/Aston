package org.tasks.task6.task6_1;

public class WrongLoginException extends Exception{

    public WrongLoginException(){
        super();
    }

    public WrongLoginException(String message){
        super(message);
    }
}
