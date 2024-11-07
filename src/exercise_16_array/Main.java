package exercise_16_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] height = new double[n];
		char[] gender = new char[n];

		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			height[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			gender[i] = sc.next().charAt(0);
		}
		
		double minHeight = height[0];
		double maxHeight = 0;
		double sum = 0;
		int quantityF = 0;
		int quantityM = 0;
		
		for(int i = 0; i < n; i++) {
			if(height[i] < minHeight) {
				minHeight = height[i];
			}
			if(maxHeight < height[i]) {
				maxHeight = height[i];
			}
			if(gender[i] == 'F') {
				sum += height[i];
				quantityF++;
			}
			if(gender[i] == 'M') {
				quantityM++;
			}
		}
		
		System.out.println("Menor altura = " + minHeight);
		System.out.println("Maior altura = " + maxHeight);
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", sum/quantityF));
		System.out.println("Numero de homens = " + quantityM);
		
		sc.close();

	}

}
