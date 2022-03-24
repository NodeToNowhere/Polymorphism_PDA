import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PoliticianTest {
    private Politician politician;

    @Before
    public void before() {politician = new Politician("General Bank", 1000, 4, "Shady Favours", "Politician Dude");}
    @Test
    public void testGetName() {
        assertEquals("Politician Dude", politician.getName());
    }
    @Test
    public void testGetPoliticalRank() {
        assertEquals(4, politician.getPoliticalRank());
    }
    @Test
    public void testGetPayment() {
        assertEquals("Shady Favours", politician.getPayment());
    }
}
