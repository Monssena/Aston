package org.example.first;

public abstract class Car {
    private static int countCar;
    private String color;
    private final String model;
    private final int releaseDate;
    private TypeCars typeCar = TypeCars.Scrap;

    public Car(String model, int releaseDate) {
        this.model = model;
        this.releaseDate = releaseDate;
        this.typeCar = this.setTypeCar();
        countCar++;
    }

    public String sound() {
        return "Vrrrrrrrrrrrrrrrrrrrrrrr";
    }

    public String getModel() {
        return model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public abstract TypeCars setTypeCar();

    public TypeCars getTypeCar() {
        return typeCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCountCar() {
        return countCar;
    }
}
