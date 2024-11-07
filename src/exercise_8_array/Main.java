package exercise_8_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Person[] people = new Person[n];
		
		for(int i = 0; i < people.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			people[i] = new Person(name, age, height);
		}
		
		int subNumber = 0;
		double sumHeight = 0;
		
		for(int i = 0; i < people.length; i++) {
			sumHeight += people[i].getHeight();
			if(people[i].getAge() < 16) {
				subNumber += 1;
			}
		}

		System.out.println("Altura média: " + String.format("%.2f", sumHeight / people.length));
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", (double)(subNumber * 100) / people.length) + "%");

		for(int i = 0; i < people.length; i++) {
			if(people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}
		
		sc.close();

	}

}
