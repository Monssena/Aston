package org.example.first;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Sedan("Lada Vesta", 2012));
        carList.add(new Hatchbacks("Ford Focus ST", 2018));
        for (Car car : carList) {
            System.out.println("Model: " + car.getModel() + ", Color: " + car.getColor() + ", production date: " + car.getReleaseDate() + ", type car: " + car.getTypeCar());
            if (car instanceof Hatchbacks hatchbacks) {
                hatchbacks.setColor("Black");
                System.out.println("New hatchback color: " + car.getColor());

                System.out.println(hatchbacks.sound());
            }
        }
        System.out.println("Number of cars: " + Car.getCountCar());
    }
}