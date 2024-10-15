import java.util.ArrayList;
import java.util.List;

// Базовый класс Vehicle (Транспортное средство)
abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Методы запуска и остановки двигателя
    public void startEngine() {
        System.out.println(brand + " " + model + ": Engine started.");
    }

    public void stopEngine() {
        System.out.println(brand + " " + model + ": Engine stopped.");
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}