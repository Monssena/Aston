package org.example.second.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Sedan());
        cars.add(new Truck(6, 20000, 24000));

        for (Car car : cars) {
            car.start();
            System.out.println("Number of doors: " + car.getNumberOfDoors());
            System.out.println("Type of gasoline: " + car.getFuelType());
            System.out.println("Capacity: " + car.getTrunkCapacity() + " liters");
            if (car instanceof Truck truck) {
                System.out.println("Maximum capacity of the truck: " + truck.getMaxLoadCapacity() + " liters");
            } else {
                Sedan sedan = (Sedan) car;
                int luxuryLevel = sedan.getLuxuryLevel();
                switch (luxuryLevel) {
                    case 1:
                        System.out.println("Economy version of the sedan");
                        break;
                    case 2:
                        System.out.println("The middle version of the sedan");
                        break;
                    case 3:
                        System.out.println("The business version of the sedan");
                }
            }
            car.stop();
        }

    }
}
