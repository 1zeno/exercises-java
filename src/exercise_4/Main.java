package exercise_4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static double dollar;
	public static double bought;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price?");
		dollar = sc.nextDouble();
		System.out.print("How many dollars wil be bought?");
		bought = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.totalPrice(dollar, bought)));
		
		
		sc.close();
	}

}
