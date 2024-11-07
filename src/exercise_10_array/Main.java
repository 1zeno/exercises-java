package exercise_10_array;

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
		
		double bigger = 0;
		int position = 0;

		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > bigger) {
				bigger = numbers[i];
				position = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + String.format("%.1f", bigger));
		System.out.println("POSICAO DO MAIOR VALOR = " + position);

		sc.close();

	}

}
