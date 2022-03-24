public class Celebrity extends Debt {

    private int twitterFollowers;
    private String name;
    private String socialClout;

    public Celebrity(String debtOwner, int costOfDebtInDollars, int twitterFollowers, String socialClout, String name) {
        super(debtOwner, costOfDebtInDollars);
        this.twitterFollowers = twitterFollowers;
        this.name = name;
        this.socialClout = socialClout;
    }
    public String getName() {
        return name;
    }
    public int getTwitterFollowers() {
        return twitterFollowers;
    }
    public String getPayment() {
        if (twitterFollowers >= 1000000) {
            return "More debt to " + this.name;
        } else {
            return this.socialClout;
        }
    }


}