package lesson6.Cars;

public class Main {
    public static void main(String[] args) {
        Jeep jeep = new Jeep("Jeep", 80, 60, 20, 220, 5, 9);
        Sportcar sportcar = new Sportcar("Sportcar", 60, 60, 25, 440, 2);
        System.out.println("Trying jeep:\n");
        jeep.drive(200);
        jeep.refuel(90);
        jeep.getGas();
        jeep.climbAMountain();

        System.out.println("\n\nTrying sportcar:\n");
        sportcar.drive(500);
        sportcar.refuel(20);
        sportcar.getGas();
        sportcar.pickTheGirl();
    }
}
