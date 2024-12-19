package exercise_28;

import java.util.Date;

public class Rent {
	private Date pickupDate;
	private Date returnDate;
	
	public Rent(Date pickupDate, Date returnDate) {
		this.pickupDate = pickupDate;
		this.returnDate = returnDate;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	
	public Integer timeHours() {

	    double diff = (double) (returnDate.getTime() - pickupDate.getTime());
		int hours = (int) Math.ceil(diff / (1000 * 60 * 60));

	    return hours;
	}
}
