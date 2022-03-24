public abstract class Debt implements Payment{

    private String debtOwner;
    private int costOfDebtInDollars;


    protected Debt(String debtOwner, int costOfDebtInDollars) {
        this.debtOwner = debtOwner;
        this.costOfDebtInDollars = costOfDebtInDollars;
    }

    public String getDebtOwner() {
        return debtOwner;
    }

    public int getCostOfDebtInDollars() {
        return costOfDebtInDollars;
    }
}
