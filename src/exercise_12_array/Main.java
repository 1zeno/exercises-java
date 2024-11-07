package exercise_12_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
			sum += numbers[i];
		}
		
		System.out.println("MEDIA DO VETOR = " + String.format("%.3f", sum/n));
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < (sum / 4)) {
				System.out.println(String.format("%.1f", numbers[i]));
			}
		}
		
		
		sc.close();
	}

}
