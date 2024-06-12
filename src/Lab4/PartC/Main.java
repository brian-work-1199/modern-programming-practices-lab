package Lab4.PartC;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Commissioned e = new Commissioned("100",.1,1000d);
        e.addNewOrder(1, LocalDate.of(2021, 9, 1), 100);
        Paycheck p = e.calcCompensation(10, 2021);
        System.out.println(p.getNetPay());
    }

}
