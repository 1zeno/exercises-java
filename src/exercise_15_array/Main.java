package exercise_15_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] score1 = new double[n];
		double[] score2 = new double[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite nome. primeira e segunda nota do " + (i+1) + "o aluno:");
			name[i] = sc.nextLine();
			score1[i] = sc.nextDouble();
			score2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		for(int i = 0; i < n; i++) {
			if((score1[i] + score2[i]) / 2 >= 6) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();

	}

}
