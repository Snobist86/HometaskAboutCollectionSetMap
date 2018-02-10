package HometaskAboutCollectionSetMap.TaskTwo;

import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private int yearOfManufacture;
    private int speed;
    private int mass;

    public Car(String brand, String model, int yearOfManufacture, int speed, int mass) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
        this.mass = mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (yearOfManufacture != car.yearOfManufacture) return false;
        if (speed != car.speed) return false;
        if (mass != car.mass) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearOfManufacture;
        result = 31 * result + speed;
        result = 31 * result + mass;
        return result;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
