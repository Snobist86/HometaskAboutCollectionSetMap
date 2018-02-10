package HometaskAboutCollectionSetMap.TaskTwo;

import java.util.HashMap;

public class CarDemo {

    public static void main(String[] args) {

        Garage garage = new Garage(new HashMap<Car, Integer>(), 6);

        Car bloodhound = new Bolid("Bloodhound","SSC",1997,
                1609,17500);
        Car ikarus = new Bus("Ikarus","256",1977,
                120,10400);
        Car belAZ = new Truck("BelAZ","75710", 2015,
                70, 710000);
        Car pell = new PassengerCar("Pell", "P90", 1962,
                61,59);

        garage.parkCar(bloodhound);
        garage.parkCar(ikarus);
        garage.parkCar(belAZ);
        garage.parkCar(pell);
        garage.parkCar(ikarus);
        garage.parkCar(pell);
        garage.parkCar(pell);
        garage.driveOutCar(ikarus);
        garage.parkCar(pell);

        System.out.println("\nВсего в гараже:");
        System.out.println("гоночных машин - " + garage.getCarsNum(bloodhound));
        System.out.println("автобусов - " + garage.getCarsNum(ikarus));
        System.out.println("грузовиков - " + garage.getCarsNum(belAZ));
        System.out.println("других автомобилей - " + garage.getCarsNum(pell));

        System.out.println(bloodhound.toString());
        System.out.println(ikarus.toString());
        System.out.println(belAZ.toString());
        System.out.println(pell.toString());

    }
}
