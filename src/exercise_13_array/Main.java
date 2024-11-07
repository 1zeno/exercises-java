package exercise_13_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}

		double sum = 0;
		int even = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
				even++;
			}
		}
		
		if(even == 0) {
			System.out.print("NENHUM NUMERO PAR");
		} else {
			System.out.print("MEDIA DOS PARES = " + String.format("%.1f", sum/even));
		}
		
		sc.close();

	}

}
