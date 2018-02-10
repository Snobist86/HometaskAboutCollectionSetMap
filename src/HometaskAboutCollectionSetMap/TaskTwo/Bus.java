package HometaskAboutCollectionSetMap.TaskTwo;

public class Bus extends Car {

    public Bus(String brand, String model, int yearOfManufacture, int speed, int mass) {
        super(brand, model, yearOfManufacture, speed, mass);
    }

    @Override
    public String toString() {
        return String.format("Bus{Марка: %s, модель: %s, год выпуска: %d, скорость: %d, масса: %d}",
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
