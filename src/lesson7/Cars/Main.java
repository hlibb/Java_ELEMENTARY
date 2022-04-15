package lesson7.Cars;

import lesson7.Cars.Constants.*;
import lesson7.Cars.Models.Car;
import lesson7.Cars.Models.Jeep;
import lesson7.Cars.Models.Sportcar;

public class Main {
    public static void main(String[] args) {
        Jeep jeep = new Jeep(Model.JEEP.model, FuelCapacity.MEDIUM.capacity, 60, FuelPer100Km.HUNGRY.consumption,
                MaxSpeed.LOW.speed, MaxAcceleration.FISH.acceleration, true, 9);
        Sportcar sportcar = new Sportcar(Model.SPORTCAR.model, FuelCapacity.SMALL.capacity, 45, FuelPer100Km.KRAKEN.consumption,
                MaxSpeed.SUPERHIGH.speed, MaxAcceleration.ISTIOPHORUSPLATYPTERUS.acceleration, true);
        Car teleport = new Car(Model.TELEPORT.model, 0, 0, 0, 1097000000, 0) {
            @Override
            public void drive(int howFarKm) {
                System.out.println("You are already there");
            }

            @Override
            public void refuel(int liters) {
                System.out.println("No need");
            }

            @Override
            public void getGas() {
                System.out.println("Khm, WHAT?!");
            }
        };
        jeep.climbAMountain();
        sportcar.pickTheGirl();
        teleport.drive(1000000000);

    }
}
