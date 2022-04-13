package lesson7.Cars.Constants;

public enum FuelPer100Km {
    NOTALOT(12),
    HUNGRY(22),
    KRAKEN(32),
    ;

    public final int consumption;

    FuelPer100Km(int consumption) {
        this.consumption = consumption;
    }
}
