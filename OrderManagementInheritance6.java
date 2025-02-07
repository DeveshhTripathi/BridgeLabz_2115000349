class Order{
	protected String orderId;
	protected String orderDate;

	public Order(String orderId , String orderDate){
		this.orderId = orderId;
		this.orderDate  = orderDate;
	}
	public void getOrderStatus(){
		System.out.println("Order ID: " +orderId+ ", Order date: "+orderDate);
	}
}
class ShippedOrder extends Order{
	protected String trackingNumber;

	public ShippedOrder(String orderId , String orderDate , String trackingNumber){
		super(orderId,orderDate);
		this.trackingNumber = trackingNumber;
	}
	public void getOrderStatus(){
	super.getOrderStatus();
	System.out.println("Tracking Number: "+trackingNumber);
	}
}
class DeliveredOrder extends ShippedOrder{
	protected String deliveryDate;

	public DeliveredOrder(String orderId , String orderDate , String trackingNumber , String deliveryDate){
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	public void getOrderStatus(){
		super.getOrderStatus();
		System.out.println("Delivery Date: "+deliveryDate);
	}
}
public class OrderManagementInheritance6{
	public static void main(String args[]){
	Order O1 = new Order("123" , "25-02-2025");
	O1.getOrderStatus();
	DeliveredOrder D1 = new DeliveredOrder("159","25-02-2025","123456","27-02-2025");
	D1.getOrderStatus();
	}
}
