package exercise_22_inheritance_and_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char choice = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(choice == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("PAYMENTS:");
		for(Employee item : employees) {
			System.out.println(item);
		}
		
		sc.close();

	}

}
