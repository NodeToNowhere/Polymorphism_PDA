import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BankVaultTest {
    private BankVault bankVault;
    private Celebrity celebrity;
    private Person person;
    private Politician politician;

    @Before()
    public void before() {
        bankVault = new BankVault("General Banks Vault of Souls");
        celebrity = new Celebrity("General Bank", 1000, 10000, "Social Clout", "Twitter Dude");
        politician = new Politician("General Bank", 1000, 4, "Shady Favours", "Politician Dude");
        person = new Person("GeneralBank", 1000, 500, "Some Dude", "Pound Of Flesh");

    }

    @Test
    public void canGetBankVaultName() {
        assertEquals("General Banks Vault of Souls", bankVault.getName());
    }

    @Test
    public void canAddPayments() {
        bankVault.addItem(person);
        bankVault.addItem(celebrity);
        bankVault.addItem(politician);
        assertEquals(3, bankVault.getNumberOfItems());
    }

}