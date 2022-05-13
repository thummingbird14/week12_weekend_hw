import airline.Plane;
import airline.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }
    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }
    @Test
    public void boeing747HasCapacity900(){
        assertEquals(900,plane.getCapacityFromEnum());
    }
    @Test
    public void boeing747HasTotalWeight183500(){
        assertEquals(183500, plane.getWeightFromEnum());
    }

}
