package airline;

public enum PlaneType {
    BOEING747(900, 183500),
    AIRBUSA340(950, 200000),
    BOEING777(800, 150000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}