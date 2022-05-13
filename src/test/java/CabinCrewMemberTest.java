import airline.PlaneType;
import airline.people.CabinCrewMember;
import airline.people.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember purser;
    CabinCrewMember flightAttendant;

    @Before
    public void before(){
        purser = new CabinCrewMember("Sarah", Rank.PURSER);
        flightAttendant = new CabinCrewMember("Fred", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void canGetName() {
        assertEquals("Sarah", purser.getName());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.FLIGHTATTENDANT, flightAttendant.getRank());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("Please fasten your seatbelts", flightAttendant.relayMessage());
    }
}
