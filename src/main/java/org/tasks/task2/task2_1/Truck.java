package org.tasks.task2.task2_1;

public class Truck extends Car {

    private final int trunkCapacity;
    private final int numberOfDoors;
    private final int maxTrunkCapacity;

    public Truck(int numberOfDoors, int trunkCapacity, int maxTrunkCapacity) {
        super();
        this.trunkCapacity = trunkCapacity;
        this.numberOfDoors = numberOfDoors;
        this.maxTrunkCapacity = maxTrunkCapacity;
    }

    @Override
    int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    int getTrunkCapacity() {
        return trunkCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxTrunkCapacity;
    }
}
