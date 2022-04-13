package lesson7.Cars.Constants;

public enum MaxAcceleration {
    TURTLE(12),
    FISH(9),
    SHARK(7),
    MARLINE(4),
    ISTIOPHORUSPLATYPTERUS(2),
    ;

    public final int acceleration;

    MaxAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }
}
