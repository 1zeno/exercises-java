package exercise_21_date_and_enum;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product product;

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subtotal() {
		return quantity * product.getPrice();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", ");
		sb.append("$" + String.format("%.2f", product.getPrice()) + ", ");
		sb.append("Quantity: " + quantity + ", ");
		sb.append("Subtotal: $" + String.format("%.2f", subtotal()));
		
		return sb.toString();
	}
	
}
