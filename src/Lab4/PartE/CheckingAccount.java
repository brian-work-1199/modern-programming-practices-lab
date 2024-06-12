package Lab4.PartE;

public class CheckingAccount extends Account{
    private String accId;
    private Double balance;
    private Double monthlyFee;

    CheckingAccount(String accId, Double monthlyFee, Double balance){
        super(accId);
        this.balance = balance;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public String getAccountId() {
        return null;
    }

    @Override
    public Double getBalance() {
        return null;
    }

    @Override
    public Double computeUpdateBalance() {
        return balance - monthlyFee;
    }
}
