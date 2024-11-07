package exercise_25_absctract;

public class LegalPerson extends Person {

	private Integer employees;
	
	public LegalPerson(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	@Override
	public Double tax() {
		if(employees > 10) {
			return super.getAnnualIncome() * 0.14;
		} else {
			return super.getAnnualIncome() * 0.16;
		}
	}

}
