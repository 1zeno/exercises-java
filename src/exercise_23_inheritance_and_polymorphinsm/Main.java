package exercise_23_inheritance_and_polymorphinsm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if(type == 'c') {
				products.add(new Product(name, price));
			}
			if(type == 'u') {
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateString = sc.nextLine();
				Date manufactureDate = sdf.parse(dateString);
				products.add(new UsedProduct(name, price, manufactureDate));
			}
			if(type == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println("PRICE TAGS:");
		for(Product item : products) {
			System.out.println(item.priceTag());
		}
		
		
		sc.close();

	}

}
