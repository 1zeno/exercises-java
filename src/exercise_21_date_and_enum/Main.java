package exercise_21_date_and_enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, birthDate);
		System.out.println("Enter cliente data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		Integer numberOfItems = sc.nextInt();
		
		Order order = new Order(OrderStatus.valueOf(status), client);
		
		for(int i = 0; i < numberOfItems; i++) {
			sc.nextLine();
			System.out.println("Enter #"+ (i+1) +" item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			Product product = new Product(productName, price);
			OrderItem item = new OrderItem(quantity, price, product);
			order.addItem(item);
		}
		
		System.out.println(order);
		
		sc.close();
		
	}

}
