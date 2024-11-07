package exercise_5;

public class Account {

	private int number;
	private String name;
	private double balance;
	
	public Account(int number, String name, double money) {
		this.number = number;
		this.name = name;
		this.balance = money;
	}

	public Account(int number, String name) {
		this.number = number;
		this.name = name;
		this.balance = 0;
	}

	public double getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;	
	}
	
	public void withdraw(double amount) {
		balance -= (amount + 5.00);
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}
	
	
}
