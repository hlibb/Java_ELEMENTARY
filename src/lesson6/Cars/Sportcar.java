package lesson6.Cars;

public class Sportcar extends Car implements Chic {

    public Sportcar(String model, int fuelCapacity, int currentFuel, int fuelPer100Km, int maxSpeed, int maxAcceleration) {
        super(model, fuelCapacity, currentFuel, fuelPer100Km, maxSpeed, maxAcceleration);
    }

    public void pickTheGirl() {
        if (chic) System.out.println("You've picked a girl and left into the sunset...");
        else System.out.println("Sorry, next time");
    }

    @Override
    public void getGas() {
        System.out.printf("\nWow! Too fast! 0 to 100 in %d seconds!\n", maxAcceleration);
    }
}
