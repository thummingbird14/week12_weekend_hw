package airline;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double calculateWeightToBeReservedPerPassenger() {
        int planeWeight, planeCapacity;
        double value;
        Plane plane1;
        plane1 = flight.getPlane();
        planeWeight = plane1.getWeightFromEnum();
        planeCapacity = plane1.getCapacityFromEnum();
        value = 0.5 * planeWeight / planeCapacity;
        return value;
    }
}
