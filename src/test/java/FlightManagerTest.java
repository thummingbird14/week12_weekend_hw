import airline.Flight;
import airline.FlightManager;
import airline.Plane;
import airline.PlaneType;
import airline.people.CabinCrewMember;
import airline.people.Passenger;
import airline.people.Pilot;
import airline.people.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Flight flight1;
    Pilot pilot1;
    Plane plane1;
    CabinCrewMember purser;
    CabinCrewMember flightAttendant;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    FlightManager flightmanager1;

    @Before
    public void before(){
        pilot1 = new Pilot("Albert", Rank.CAPTAIN, "ADAMS655147AL9LU");
        plane1 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight(pilot1, plane1, "FR756", "PMI", "EDI", "09:30");
        purser = new CabinCrewMember("Sarah", Rank.PURSER);
        flightAttendant = new CabinCrewMember("Fred", Rank.FLIGHTATTENDANT);
        passenger1 = new Passenger("Tanya", 2);
        passenger2 = new Passenger("Cedric", 1);
        passenger3 = new Passenger("Henry", 2);
        flightmanager1 = new FlightManager(flight1);
    }
    @Test
    public void canCalculateWeightToBeReservedPerPassenger() {
        assertEquals(101.94, flightmanager1.calculateWeightToBeReservedPerPassenger(), 0.05);
    }

    @Test
    public void canCalculateTotalWeightBooked() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(509.72, flightmanager1.calculateTotalWeightBooked(), 0.05);
    }

    @Test
    public void canCalculateTotalWeightRemaining() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(91240.28, flightmanager1.calculateTotalWeightRemaining(), 0.05);
    }
}
