package exercise_19_matriz;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Rows: ");
		int m = sc.nextInt();
		System.out.print("Columns: ");
		int n = sc.nextInt();
	
		int[][] numbers = new int[m][n];
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Search: ");
		int searchNumber = sc.nextInt();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				if(numbers[i][j] == searchNumber) {
					System.out.println("Position: " + i + "," + j);
					if(i-1 >= 0) {
						System.out.println("Up: " + numbers[i-1][j]);
					}
					if(i + 1 < m) {
						System.out.println("Down: " + numbers[i+1][j]);
					}
					if(j-1 >= 0) {
						System.out.println("Left: " + numbers[i][j-1]);
					}
					if(j+1 < n) {
						System.out.println("Right: " + numbers[i][j+1]);
					}
				}	
			}
		}
		
		sc.close();

	}

}
