package exercise_17_array;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms wil be rented? ");
		int n = sc.nextInt();
		
		Student[] rooms = new Student[10];

		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nRent #"+ (i+1) +":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rooms[room] = new Student(name, email, room);
		}

		System.out.println("Busy rooms:");
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}

		sc.close();
	}

}
