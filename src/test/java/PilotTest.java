import airline.people.Pilot;
import airline.people.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;

    @Before
    public void before(){
        pilot1 = new Pilot("Louise", Rank.CAPTAIN, "PURCE655148TL9LU");
        pilot2 = new Pilot("Jeremy", Rank.FIRSTOFFICER, "ROWLA655142JR9LU");
    }

    @Test
    public void hasName() {
        assertEquals("Louise", pilot1.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FIRSTOFFICER, pilot2.getRank());
    }

    @Test
    public void hasPilotLicenceNumber() {
        assertEquals("PURCE655148TL9LU", pilot1.getPilotLicenceNumber());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("I am flying the plane!", pilot1.flyPlane());
    }
}
