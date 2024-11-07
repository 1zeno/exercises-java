package exercise_22_inheritance_and_polymorphism;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.10;
	}
	
	public String toString() {
		return name + " - $ " + String.format("%.2f", payment());
	}
}
