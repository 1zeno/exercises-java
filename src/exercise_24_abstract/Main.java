package exercise_24_abstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		List<Shape> shapes = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Shape#" + (i+1) + " data:");
			System.out.print("Rectangle or Circle(r/c)? ");
			char option = sc.nextLine().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED)? ");
			Color color = Color.valueOf(sc.nextLine());
			if(option == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				shapes.add(new Rectangle(width, height, color));
			}
			if(option == 'c') {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println("SHAPE AREAS:");
		for(Shape item : shapes) {
			System.out.println(String.format("%.2f", item.area()));
		}

		sc.close();

	}

}
