package airline;

import airline.people.Passenger;

import java.util.ArrayList;

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

    public double calculateTotalWeightBooked(){
        double totalWeightBooked;
        int totalNumberBags = 0;
        int bags = 0;
        ArrayList<Passenger> passengers;
        passengers = flight.getPassengers();
        for (Passenger passenger: passengers){
            bags = passenger.getNumberBags();
            totalNumberBags = totalNumberBags + bags;}
        totalWeightBooked = totalNumberBags * this.calculateWeightToBeReservedPerPassenger();
        return totalWeightBooked;
        }
    }

