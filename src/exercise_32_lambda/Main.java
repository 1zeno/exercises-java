package exercise_32_lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		Double minSalary = sc.nextDouble();

		List<Employee> employees = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);

				employees.add(new Employee(name, email, salary));

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		Comparator<String> comparator = (value, item) -> value.toUpperCase().compareTo(item.toUpperCase());
		
		List<String> emails = employees.stream()
				.filter((p) -> p.getSalary() > minSalary)
				.map((value) -> value.getEmail())
				.sorted(comparator)
				.collect(Collectors.toList());
	
		double sum = employees.stream()
				.filter((p) -> p.getName().charAt(0) == 'M')
				.map((value) -> value.getSalary())
				.reduce(0.0, (accumulator, value) -> accumulator + value);
	
		System.out.println("Email of people whose salary is more than 2000.00:");
		emails.forEach(System.out::println);
		System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));	
		
		sc.close();

	}

}
