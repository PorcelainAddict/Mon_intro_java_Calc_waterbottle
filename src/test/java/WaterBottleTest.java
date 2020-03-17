import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle(100, 10);
    }

    @Test
    public void getVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drink() {
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void maxThirst() {
        assertEquals(0, waterbottle.maxThirst());
    }

    @Test
    public void replenish() {
        waterbottle.maxThirst();
        assertEquals(100, waterbottle.replenish());
    }
}
