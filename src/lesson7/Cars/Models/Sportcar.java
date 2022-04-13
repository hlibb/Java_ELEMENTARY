package lesson7.Cars.Models;

public class Sportcar extends Car {
    protected final boolean chic;

    public Sportcar(String model, int fuelCapacity, int currentFuel, int fuelPer100Km, int maxSpeed, int maxAcceleration, boolean chic) {
        super(model, fuelCapacity, currentFuel, fuelPer100Km, maxSpeed, maxAcceleration);
        this.chic = chic;
    }

    public void pickTheGirl() {
        if (chic) System.out.println("You've picked the girl and left into the sunset...");
        else System.out.println("Sorry, next time");
    }

    @Override
    public void getGas() {
        System.out.printf("\nWow! Too fast! 0 to 100 in %d seconds!\n", maxAcceleration);
    }
}
