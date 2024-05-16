package org.example;

public class Sedan extends Car{

    public Sedan(String model, int releaseDate) {
        super(model, releaseDate);
        setColor("red");
    }

    @Override
    public TypeCars setTypeCar() {
        return TypeCars.Sedan;
    }

    @Override
    public String sound() {
        return "Befor: " + super.sound() + ", now: " + "Sedan sound";
    }
}
