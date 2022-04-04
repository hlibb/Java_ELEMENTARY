package lesson5.Cars;

public class Jeep extends Car{
    protected final boolean fourWD;
    protected final int climbPossibilityIndex;

    public Jeep(String model, int fuelCapacity, int currentFuel, int fuelPer100Km, int maxSpeed, int maxAcceleration, boolean fourWD, int climbPossibilityIndex) {
        super(model, fuelCapacity, currentFuel, fuelPer100Km, maxSpeed, maxAcceleration);
        this.fourWD = fourWD;
        this.climbPossibilityIndex = climbPossibilityIndex;
    }

    @Override
    public void getGas() {
        System.out.printf("\nWhat a roar! 0 to 100 in %d seconds!\n", maxAcceleration);
    }

    public void climbAMountain() {
        if (this.fourWD) {
            int chance = (int) (Math.random() * 10);
            if (chance < this.climbPossibilityIndex) System.out.println("You've climbed the mountain");
            else if (chance == this.climbPossibilityIndex) System.out.println("You've barely climbed the mountain");
            else {
                System.out.println("You've fell");
                isWorking = false;
            }
        }
    }
}
