package Lab4.PartC;

public class Salaried extends Employee{
    private Double salary;

    Salaried(String empId, Double salary){
        super(empId);
        this.salary = salary;
    }


    @Override
    public Double calcGrossPay(int month, int year) {
        return salary;
    }
}
