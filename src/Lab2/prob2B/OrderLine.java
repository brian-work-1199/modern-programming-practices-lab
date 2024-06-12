package Lab2.prob2B;

public class OrderLine {

	private String orderLineName;
	private Order order;
	
	OrderLine(String orderLineName, Order order){
		this.orderLineName = orderLineName;
		this.order = order;
	}

	public String getOrderLineName() {
		return orderLineName;
	}

	public void setOrderLineName(String orderLineName) {
		this.orderLineName = orderLineName;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderLine [orderLineName=" + orderLineName + ", order=" + order + "]";
	}
}
