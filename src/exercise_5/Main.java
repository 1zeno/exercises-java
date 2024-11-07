package exercise_5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account personAccount;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		String hasDeposit = sc.nextLine();
		
		if(hasDeposit.equals("y")) {
			double amount;
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
			sc.nextLine();
			personAccount = new Account(number, name, amount);
		} else {
			personAccount = new Account(number, name);
		}

		System.out.println("Account data:");
		System.out.println(personAccount);

		System.out.print("Enter a deposit value: ");
		personAccount.deposit(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Updated account data:");
		System.out.println(personAccount);
		
		System.out.print("Enter a withdraw value: ");
		personAccount.withdraw(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Updated account data:");
		System.out.println(personAccount);
		
		sc.close();

	}

}
