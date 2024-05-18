package org.tasks.second.task3;

public class Main {

    public static void main(String[] args) {
        Computer.Processor processor = new Computer.Processor("Intel Core i7");
        System.out.println(processor.getDetails());

        Computer computer = new Computer();
        Computer.RAM ram = computer.new RAM(32);
        System.out.println(ram.getDetails());
    }
}
