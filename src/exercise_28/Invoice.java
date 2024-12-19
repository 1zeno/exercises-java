package exercise_28;

public class Invoice {
	private Vehicle vehicle;
	private Rent rent;
	private Double hourPrice = 10.00;
	private Double dayPrice = 130.00;
	
	public Invoice(Vehicle vehicle, Rent rent) {
		this.vehicle = vehicle;
		this.rent = rent;
	}
	
	public Double basicPayment() {
		int hours = rent.timeHours();

		if(hours <= 12) {
			return hourPrice * hours;
		}
		
		if(hours > 12 && hours <= 24) {
			return dayPrice;
		}
		
		if(hours > 24 && hours % 24 != 0){
			return (dayPrice * (hours / 24)) + dayPrice;
		}
		
		return dayPrice * (hours / 24);
		
	}
	
	public Double tax() {
		double price = basicPayment();

		if(price <= 100) {
			price *= 0.20;
		} else {
			price *= 0.15;
		}
		
		return price;
	}
	
	public Double total() {
	    return basicPayment() + tax();
	    
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FATURA:\n");
		sb.append("Modelo: " + vehicle.getName() + "\n");
		sb.append("Pagamento basico: " + String.format("%.2f", basicPayment()) + "\n");
		sb.append("Imposto: "+ String.format("%.2f", tax()) + "\n");
		sb.append("Pagamento total: " + String.format("%.2f", total()));

		return sb.toString();
	}
}
