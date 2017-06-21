package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KingKongTest {

    KingKong kong;
    Skyscraper skyscraper;


    @Before
    public void before(){
        kong = new KingKong("Graham", 120, 30);
        skyscraper =  new Skyscraper("building", 40);
    }

    @Test
    public void hasName(){
        assertEquals("Graham", kong.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("Come at me!!!", kong.roar());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(120, kong.getHealthValue());
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(30, kong.getDestructiveForce());
    }

    @Test
    public void canAttack(){
        kong.attack(skyscraper);
        assertEquals(10, skyscraper.getHealthValue());
    }
}
