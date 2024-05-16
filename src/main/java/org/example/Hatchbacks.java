package org.example;

public class Hatchbacks extends Car{
    public Hatchbacks(String model, int releaseDate) {
        super(model, releaseDate);
        setColor("blue");
    }

    @Override
    public TypeCars setTypeCar() {
        return TypeCars.Hatchbacks;
    }

    @Override
    public String sound() {
        return "Befor: " + super.sound() + ", now: " + "Hatchbacks sound";
    }
}
