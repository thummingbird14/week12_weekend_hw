package airline;

import airline.people.CabinCrewMember;
import airline.people.Passenger;
import airline.people.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfCabinCrew(){
        return cabinCrewMembers.size();
    }
    public void addCabinCrew(CabinCrewMember member){
        cabinCrewMembers.add(member);
    }

    public int getNumberOfPassengers(){
        return passengers.size();
    }

    public int getNumberOfSeats(){
        int capacity = plane.getCapacityFromEnum();
        int booked = passengers.size();
        return capacity - booked;
    }

    public void bookPassenger(Passenger passenger){
        if (this.getNumberOfSeats() > 0){
            passengers.add(passenger);
        }
    }

}
