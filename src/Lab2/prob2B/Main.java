package Lab2.prob2B;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order("Ngoc Thinh Le");
		
		order.addOrder("Order line 1");
		order.addOrder("Order line 2");
		
		System.out.println(order.getOrderLines().toString());
	}

}
