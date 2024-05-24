package org.tasks.task2.task2_1;

public class Sedan extends Car {

    private final int trunkCapacity;
    private final int numberOfDoors;
    private final int luxuryLevel;

    public Sedan() {
        super();
        trunkCapacity = rn.nextInt(500 - 300 + 1) + 300;
        luxuryLevel = 1 + rn.nextInt(3);
        numberOfDoors = 5;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public int getLuxuryLevel() {
        return luxuryLevel;
    }
}
