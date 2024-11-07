package exercise_22_inheritance_and_polymorphism;

public class Employee {

	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public Employee() {
	}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return valuePerHour * hours;
	}
	
	public String toString() {
		return name + " - $ " + String.format("%.2f", payment());
	}
}
