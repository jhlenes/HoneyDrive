package metrics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarActionTest
{

    @Test
    public void testConstructors()
    {
        CarAction carAction = new CarAction(CarActionsFilter.vehicle_speed, "vehicle_speed", 25.0, 1406361724.776);
        assertEquals(CarActionsFilter.vehicle_speed, carAction.getType());
        assertEquals("vehicle_speed", carAction.getName());
        assertEquals(25.0, (double) carAction.getValue(), 0.1);
        assertEquals(1406361724.776, carAction.getTimestamp(), 0.1);

        CarAction carAction2 = new CarAction("vehicle_speed", 25.0, 1406361724.776);
        assertEquals(CarActionsFilter.vehicle_speed, carAction2.getType());
        assertEquals("vehicle_speed", carAction2.getName());
        assertEquals(25.0, (double) carAction2.getValue(), 0.1);
        assertEquals(1406361724.776, carAction2.getTimestamp(), 0.1);
    }

}