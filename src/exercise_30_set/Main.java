package exercise_30_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Set<Integer> students = new HashSet<>();

		System.out.print("How many students for course A? ");
		
		Integer numberA = sc.nextInt();
		for(int i = 0; i < numberA; i++) {
			Integer studentNumber = sc.nextInt();
			students.add(studentNumber);
			sc.nextLine();
		}
		
		System.out.print("How many students for course B? ");
		Integer numberB = sc.nextInt();
		for(int i = 0; i < numberB; i++) {
			Integer studentNumber = sc.nextInt();
			students.add(studentNumber);
			sc.nextLine();
		}
		
		System.out.print("How many students for course C? ");
		Integer numberC = sc.nextInt();
		for(int i = 0; i < numberC; i++) {
			Integer studentNumber = sc.nextInt();
			students.add(studentNumber);
			sc.nextLine();
		}
		
		System.out.println("Total sudents: " + students.size());
		
	
		
		
		
		sc.close();
	}

}
