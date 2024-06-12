package Lab4.PartE;

public abstract class Account {
    private String accId;

    Account(String accId){
        this.accId = accId;
    }

    public abstract String getAccountId();
    public abstract Double getBalance();
    public abstract Double computeUpdateBalance();
}
