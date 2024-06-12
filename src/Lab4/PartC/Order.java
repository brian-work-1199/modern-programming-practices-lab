package Lab4.PartC;

import java.time.LocalDate;

public class Order {
    private Integer orderNo;
    private LocalDate orderDate;
    private Integer orderAmount;

    Order(Integer orderNo, LocalDate orderDate, Integer orderAmount){
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }
}
