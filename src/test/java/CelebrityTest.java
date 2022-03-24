import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CelebrityTest {
    private Celebrity celebrity;

    @Before
    public void before() {celebrity = new Celebrity("General Bank", 1000, 10000, "100", "Twitter Dude");}

    @Test
    public void testGetName() {
            assertEquals("Twitter Dude", celebrity.getName());
    }

    @Test
    public void testGetTwitterFollowers() {
        assertEquals(10000, celebrity.getTwitterFollowers());
    }
    @Test
    public void testGetPayment() {
        assertEquals("100", celebrity.getPayment());
    }
}
