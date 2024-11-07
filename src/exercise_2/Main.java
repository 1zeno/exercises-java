package exercise_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employer = new Employee();
		
		System.out.print("Name: ");
		employer.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employer.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employer.tax = sc.nextDouble();
		System.out.println("Employee: " + employer);
		System.out.print("Witch percentage to increase salary: ");
		employer.increaseSalary(sc.nextDouble());
		System.out.println("Updated data: " + employer);
		
		sc.close();
	}

}
