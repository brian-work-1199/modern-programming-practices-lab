package Lab4.PartC;

public class Paycheck {
    private Double grossPay;
    private Double fica;
    private Double state;
    private Double local;
    private Double medicare;
    private Double socialSecurity;

    Paycheck(Double grossPay, Double fica, Double state, Double local, Double medicare, Double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public void print(){}
    public Double getNetPay(){
        return grossPay - (fica + state + local + medicare + socialSecurity);
    }
}
