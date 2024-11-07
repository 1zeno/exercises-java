package exercise_21_date_and_enum;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orderItems = new ArrayList<>();
	private Client client;

	public Order(OrderStatus status, Client client) {
		this.moment = new Date();
		this.status = status;
		this.client = client;
	}
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public int getStatus() {
		return status.getValue();
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		orderItems.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItems.remove(item);
	}
	
	public Double total() {
		Double sum = 0.00;
		for(OrderItem item: orderItems) {
			sum += item.subtotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdf.format(moment));
		sb.append("\nOrder status: " + status);
		sb.append("\nClient: " + client);
		sb.append("\nOrder items:\n");
		for(OrderItem item: orderItems) {
			sb.append(item + "\n");
		}
		sb.append("\nTotal price: $" + String.format("%.2f", total()));
		return sb.toString();
	}

}
