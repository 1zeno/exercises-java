package exercise_25_absctract;

public class NaturalPerson extends Person {
	
	private Double healthExpenditures;

	public NaturalPerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	public NaturalPerson(String name, Double annualIncome) {
		super(name, annualIncome);
		this.healthExpenditures = 0.0;
	}

	@Override
	public Double tax() {

		if(super.getAnnualIncome() < 20000) {
			return (super.getAnnualIncome() * 0.15) - (healthExpenditures * 0.5);
		} else {
			return (super.getAnnualIncome() * 0.25) - (healthExpenditures * 0.5);
		}
	}

}
