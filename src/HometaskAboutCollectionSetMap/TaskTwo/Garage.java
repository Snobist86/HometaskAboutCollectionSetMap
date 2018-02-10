package HometaskAboutCollectionSetMap.TaskTwo;

import java.util.Map;

public class Garage {

    private Integer maxCapacity;

    private Map<Car, Integer> placedCars;

    public Garage(Map<Car, Integer> placedCars, Integer maxCapacity) {
        this.placedCars = placedCars;
        this.maxCapacity = maxCapacity;
    }

    public void driveOutCar(Car car) {
        if (!hasCar(car) || placedCars.get(car) == 0) {
            System.out.println("Данной модели нет в гараже");
            return;
        }
        Integer numCars = placedCars.get(car);
        placedCars.replace(car, numCars, numCars - 1);
        System.out.printf("%s %s выехала\n",car.getBrand(), car.getModel());
    }

    public void parkCar(Car car) {
        if (!hasCar(car)) {
            placedCars.put(car, 1);
            System.out.printf("%s %s припаркована\n",car.getBrand(), car.getModel());
            return;
        }
        if (checkCapacity()) {
            Integer numCars = placedCars.get(car);
            placedCars.replace(car, numCars, numCars + 1);
            System.out.printf("%s %s припаркована\n",car.getBrand(), car.getModel());
        } else {
            System.out.println("Гараж заполнен!");
        }
    }

    private boolean checkCapacity() {
        Integer numCar = 0;
        for (Map.Entry<Car, Integer> note : placedCars.entrySet()) {
            numCar = numCar + note.getValue();
        }
        return numCar < maxCapacity;
    }

    public Integer getCarsNum(Car car) {
        return hasCar(car) ? placedCars.get(car) : 0;
    }

    private boolean hasCar(Car car) {
        return placedCars.containsKey(car);
    }

    public Map<Car, Integer> getPlacedCars() {
        return placedCars;
    }

    public void setPlacedCars(Map<Car, Integer> placedCars) {
        this.placedCars = placedCars;
    }

}
