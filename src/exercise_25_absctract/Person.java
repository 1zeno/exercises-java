package exercise_25_absctract;

public abstract class Person {

	private String name;
	private Double annualIncome;

	public Person(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public abstract Double tax();
	
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", tax());
	}
	
}
