public class Politician extends Debt {

    private int politicalRank;
    private String name;
    private String favours;

    public Politician(String debtOwner, int costOfDebtInDollars, int politicalRank, String favours, String name) {
        super(debtOwner, costOfDebtInDollars);
        this.politicalRank = politicalRank;
        this.name = name;
        this.favours = favours;
    }

    public String getName() {
        return name;
    }

    public int getPoliticalRank() {
        return politicalRank;
    }

    public String getPayment() {
        if (politicalRank < 5) {
            return this.favours;
        } else {
            return "More debt to " + this.name;
        }
    }
}
