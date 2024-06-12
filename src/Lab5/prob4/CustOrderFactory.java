package Lab5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {

    public static Customer createCustomer(String name){
        return new Customer(name);
    }

    public static Order createOrder(Customer name, LocalDate orderDate) {
        return Order.newOrder(name, orderDate);
    }
}
