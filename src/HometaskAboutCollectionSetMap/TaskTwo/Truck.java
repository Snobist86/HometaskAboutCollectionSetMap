package HometaskAboutCollectionSetMap.TaskTwo;

public class Truck extends Car {

    public Truck(String brand, String model, int yearOfManufacture, int speed, int mass) {
        super(brand, model, yearOfManufacture, speed, mass);
    }

    @Override
    public String toString() {
        return String.format("Truck{Марка: %s, модель: %s, год выпуска: %d, скорость: %d, масса: %d}",
                getBrand(), getModel(), getYearOfManufacture(), getSpeed(), getMass());
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
