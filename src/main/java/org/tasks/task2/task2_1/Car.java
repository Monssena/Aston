package org.tasks.task2.task2_1;

import java.util.Random;

public abstract class Car implements Vehicle {

    protected static final Random rn = new Random();
    private static final int fuelType = rn.nextInt(98 - 92 + 1) + 92;

    abstract int getNumberOfDoors();

    abstract int getTrunkCapacity();

    @Override
    public void start() {
        System.out.println("Car starting");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping \n");
    }

    @Override
    public int getFuelType() {
        return fuelType;
    }
}
