import java.util.ArrayList;

public class BankVault {
    private String name;
    private ArrayList<Payment> payments;

    public BankVault(String name) {
        this.name = name;
        this.payments = new ArrayList<>();
    }

    public ArrayList<Payment> getItems() {
        return payments;
    }
    public String getName() {
        return name;
    }

    public void addItem(Payment payment) {
        this.payments.add(payment);
    }

    public int getNumberOfItems() {
        return this.payments.size();
    }
}
