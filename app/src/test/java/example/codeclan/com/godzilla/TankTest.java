package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by natashaford on 21/06/2017.
 */

public class TankTest {
    Tank tank;

    @Before
    public void before(){
        tank = new Tank("vehicle", 60);
    }

    @Test
    public void hasType(){
        assertEquals("vehicle", tank.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(60, tank.getHealthValue());
    }

    @Test
    public void canBeDestroyed(){
        assertEquals("Boom!", tank.destroy());
    }
}
