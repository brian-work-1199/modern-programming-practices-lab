package Lab4.PartE;

public class SavingsAccount extends Account{
    private String accId;
    private Double balance;
    private Double interestRate;

    SavingsAccount(String accId, Double interestRate, Double balance ){
        super(accId);
        this.interestRate = interestRate;
        this.balance = balance;
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
        return balance + (interestRate*balance);
    }
}
