package exercise_4;

public class CurrencyConverter {
	
	public static double totalPrice(double dollar, double bought) {
		return dollar * bought + ((dollar * bought) * 0.06);
	}
	
}
