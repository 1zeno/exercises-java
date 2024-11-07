package exercise_14_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome:");
			name[i] = sc.next();
			System.out.print("Idade:");
			age[i] = sc.nextInt();
		}
		
		String olderName = null;
		int olderAge = 0;
		
		for(int i = 0; i < age.length; i++) {
			
			if(age[i] > olderAge) {
				olderAge = age[i];
				olderName = name[i];
			}
			
		}
		
		System.out.print("PESSOA MAIS VELHA: " + olderName);
		
		sc.close();

	}

}
