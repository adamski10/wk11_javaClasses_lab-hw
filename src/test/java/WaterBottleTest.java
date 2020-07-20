import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle bottle;

    @Before
    public void before() {
        this.bottle = new WaterBottle();
    }

    @Test
    public void canDrink() {

        assertEquals(90, bottle.drink());
    }

    @Test
    public void canEmptyTheBottle() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canFillTheBottle() {
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
