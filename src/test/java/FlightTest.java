import airline.Flight;
import airline.Plane;
import airline.PlaneType;
import airline.people.CabinCrewMember;
import airline.people.Passenger;
import airline.people.Pilot;
import airline.people.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Pilot pilot1;
    Plane plane1;
    Plane plane2;
    CabinCrewMember purser;
    CabinCrewMember flightAttendant;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        pilot1 = new Pilot("Albert", Rank.CAPTAIN, "ADAMS655147AL9LU");
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.SMALLPLANE);
        flight1 = new Flight(pilot1, plane1, "FR756", "PMI", "EDI", "09:30");
        flight2 = new Flight(pilot1, plane2, "FR123", "PMI", "GLA", "10:00");
        purser = new CabinCrewMember("Sarah", Rank.PURSER);
        flightAttendant = new CabinCrewMember("Fred", Rank.FLIGHTATTENDANT);
        passenger1 = new Passenger("Tanya", 2);
        passenger2 = new Passenger("Cedric", 1);
        passenger3 = new Passenger("Henry", 2);
    }

    @Test
    public void hasPilot() {
        assertEquals(pilot1, flight1.getPilot());
    }
    @Test
    public void hasPlane() {
        assertEquals(plane1, flight1.getPlane());
    }
    @Test
    public void hasFlightNumber() {
        assertEquals("FR756", flight1.getFlightNumber());
    }
    @Test
    public void hasDestination() {
        assertEquals("PMI", flight1.getDestination());
    }
    @Test
    public void hasDepartureAirport() {
        assertEquals("EDI", flight1.getDepartureAirport());
    }
    @Test
    public void hasDepartureTime() {
        assertEquals("09:30", flight1.getDepartureTime());
    }
    @Test
    public void cabinCrewMembersBeginsEmpty() {
        assertEquals(0, flight1.getNumberOfCabinCrew());
    }
    @Test
    public void canAddCabinCrewToFlight() {
        flight1.addCabinCrew(purser);
        flight1.addCabinCrew(flightAttendant);
        assertEquals(2, flight1.getNumberOfCabinCrew());
    }

    @Test
    public void passengersBeginsEmpty() {
        assertEquals(0, flight1.getNumberOfPassengers());
    }

    @Test
    public void canGetNumberSeats() {
        assertEquals(900, flight1.getNumberOfSeats());
    }

    @Test
    public void canBookPassenger() {
        flight1.bookPassenger(passenger1);
        assertEquals(1, flight1.getNumberOfPassengers());
        assertEquals(899, flight1.getNumberOfSeats());
    }

    @Test
    public void cannotBookPassengerWhenFull() {
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger3);
        assertEquals(2, flight2.getNumberOfPassengers());
        assertEquals(0, flight2.getNumberOfSeats());
    }
}
