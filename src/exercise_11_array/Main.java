package exercise_11_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
		}

		System.out.println("VETOR RESULTANTE:");

		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}


		sc.close();

	}

}
