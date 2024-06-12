package Lab4.PartC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{

    private Double commission;
    private Double baseSalary;
    private List<Order> orderList = new ArrayList<>();

    Commissioned(String empId, Double commission, Double baseSalary){
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    @Override
    public Double calcGrossPay(int month, int year) {
        double totalSales = 0;
        for(Order order: orderList){
            totalSales += order.getOrderAmount();
        }
        return baseSalary + (totalSales*commission);
    }

    public void addNewOrder(Integer orderNo, LocalDate orderDate, Integer orderAmount){
        Order newOrder = new Order(orderNo,orderDate,orderAmount);
        orderList.add(newOrder);
    }
}
