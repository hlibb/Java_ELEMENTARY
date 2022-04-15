package lesson7.Cars.Constants;

public enum MaxSpeed {
    LOW(220),
    NORMAL(260),
    HIGH(340),
    SUPERHIGH(440),
    SUPERSONIC(1770),
    ;

    public final int speed;

    MaxSpeed(int speed) {
        this.speed = speed;
    }
}
