package exercise_23_inheritance_and_polymorphinsm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
}
