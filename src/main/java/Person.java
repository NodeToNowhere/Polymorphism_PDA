public class Person extends Debt {

    private int accountBalance;
    private String name;
    private String poundOfFlesh;

    public Person(String debtOwner, int costOfDebtInDollars, int accountBalance, String poundOfFlesh, String name) {
        super(debtOwner, costOfDebtInDollars);
        this.accountBalance = accountBalance;
        this.name = name;
        this.poundOfFlesh = poundOfFlesh;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public String getName() {
        return name;
    }
    public String getPayment() {
        if(accountBalance <= getCostOfDebtInDollars() ){
            return this.poundOfFlesh;
        }
        else{
            return "Take the shirt of " + this.name;
        }
    }
}
