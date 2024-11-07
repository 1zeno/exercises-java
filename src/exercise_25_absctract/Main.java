package exercise_25_absctract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Person> payers = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company(i/c)? ");
			char option = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
			if(option == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				payers.add(new NaturalPerson(name, annualIncome, healthExpenditures));
			}
			if(option == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				payers.add(new LegalPerson(name, annualIncome, employees));
			}
		}
		
		System.out.println("TAXES PAID:");
		Double sum = 0.0;
		for(Person item : payers) {
			System.out.println(item);
			sum += item.tax();
		}
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();

	}

}
