import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {
    private Person person;

    @Before
    public void before() {person = new Person("GeneralBank", 1000, 500, "Pound Of Flesh", "Some Dude");}

    @Test
    public void testGetAccountBalance() {
        assertEquals(500, person.getAccountBalance());
    }
    @Test
    public void testGetName() {
        assertEquals("Some Dude", person.getName());
    }
    @Test
    public void testGetPayment() {
        assertEquals("Pound Of Flesh", person.getPayment());
    }
}
