package exercise_18_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employer> employees = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #"+ (i+1) +": ");
			sc.nextLine();
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employer(id, name, salary));
		}
		

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employer filteredItem = employees.stream().filter((value) -> value.getId() == id).findFirst().orElse(null);
		if(filteredItem == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			filteredItem.increaseSalary(percentage);
		}

		System.out.println("List of employees:");
		for (Employer item : employees) {
			System.out.println(item);
		}
		sc.close();

	}

}
