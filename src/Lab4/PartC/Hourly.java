package Lab4.PartC;

public class Hourly extends Employee{
    private Double hourlyWage;
    private Integer hoursPerWeek;

    Hourly(String empId, Double hourlyWage, Integer hoursPerWeek){
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public Double calcGrossPay(int month, int year) {
        return hourlyWage*hoursPerWeek*4;
    }
}
