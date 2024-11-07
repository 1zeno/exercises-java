package exercise_3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student person = new Student();
		System.out.print("Insira a nota do primeiro trimestre:");
		person.addScore(sc.nextDouble());
		System.out.print("Insira a nota do segundo trimestre:");
		person.addScore(sc.nextDouble());
		System.out.print("Insira a nota do terceiro trimestre:");
		person.addScore(sc.nextDouble());
		System.out.print(person);
		
		sc.close();

	}

}
