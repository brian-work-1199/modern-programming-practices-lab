package Lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderNname;
	private List<OrderLine> orderLines = new ArrayList<>();
	
	public void addOrder(String orderLineName) {
		OrderLine orderLine = new OrderLine(orderLineName, this);
		orderLines.add(orderLine);
	}
	//package level
	Order(String orderNname) {
		this.orderNname = orderNname;
	}
	
	public String getOrderNname() {
		return orderNname;
	}
	public void setOrderNname(String orderNname) {
		this.orderNname = orderNname;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
}
