package lesson7.Cars.Constants;

public enum FuelCapacity {
    SMALL(60),
    MEDIUM(90),
    BIG(120);

    public final int capacity;

    FuelCapacity(int capacity) {
        this.capacity = capacity;
    }
}
