package exercise_21_date_and_enum;

public enum OrderStatus {
	PENDING_PAYMENT(0),
	PROCESSING(1),
	SHIPPED(2),
	DELIVERED(3);
	
	private final int value;
	
	OrderStatus(final int newValue) {
        value = newValue;
    }
	
	public int getValue() {
		return value;
	}
}
