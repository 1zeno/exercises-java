package exercise_7_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}
		
		double sum = 0;

		System.out.print("VALORES:");

		for(int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
			sum += numbers[i];
		}
		
		System.out.println("\nSOMA: " + sum);
		System.out.print("MEDIA: " + (sum / numbers.length));
		
		sc.close();

	}

}
