package exercise_29_interface;

public class PaypalService implements OnlinePaymentService {

	private Double fees = 0.02;
	private Double interest = 0.01;
	
	public Double paymentFee(Double amount) {
		return amount * fees;
	}
	
	public Double interest(Double amount, Integer months) {
		return (amount * interest) * months;
	}
	
}
