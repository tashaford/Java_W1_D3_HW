package example.codeclan.com.godzilla;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GodzillaTest {

    Godzilla godzilla;
    Tank tank;

    @Before
    public void before(){
        godzilla = new Godzilla("Gary", 100, 50);
        tank = new Tank("vehicle", 60);
    }

    @Test
    public void hasName(){
        assertEquals("Gary", godzilla.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("Roooooaooooaaaaaaaaar!!", godzilla.roar());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(50, godzilla.getDestructiveForce());
    }

    @Test
    public void canAttack(){
        godzilla.attack(tank);
        assertEquals(10, tank.getHealthValue());
    }
}
