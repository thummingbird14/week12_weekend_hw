import airline.PlaneType;
import airline.people.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Tanya", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Tanya", passenger.getName());
    }

    @Test
    public void canGetNumberBags() {
        assertEquals(2, passenger.getNumberBags());
    }
}
