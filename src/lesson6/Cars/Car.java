package lesson6.Cars;

public class Car implements Drivable {
    protected boolean isWorking;
    protected final int fuelCapacity;
    protected int currentFuel;
    protected final int fuelPer100Km;
    protected final int maxSpeed;
    protected final int maxAcceleration;
    protected final String model;

    public Car(String model, int fuelCapacity, int currentFuel, int fuelPer100Km, int maxSpeed, int maxAcceleration) {
        this.model = model;
        this.isWorking = true;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
        this.fuelPer100Km = fuelPer100Km;
        this.maxSpeed = maxSpeed;
        this.maxAcceleration = maxAcceleration;
    }

    public void drive(int howFarKm) {
        if (howFarKm < 0) System.err.println("?!");
        int fuelNeed = howFarKm * fuelPer100Km;
        if (fuelNeed > fuelCapacity) {
            System.out.println("You will need extra refuels, drive to gas station before you'll get empty");
        }
        else if (fuelNeed > currentFuel) System.out.println("Not enough fuel");
        else currentFuel -= fuelNeed;
    }

    public void refuel(int liters) {
        if (liters > 0)  {
            int extraLiters = liters - (fuelCapacity - currentFuel);
            if (liters > fuelCapacity - currentFuel) System.out.printf("You got your money for %d liters back", extraLiters);
            currentFuel += liters;
        } else System.err.println("?!");
    }

    public void getGas() {
        System.out.printf("0 to 100 in %d seconds!", maxAcceleration);
    }


}
