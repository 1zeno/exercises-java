package exercise_28;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		Vehicle vehicle = new Vehicle(sc.nextLine());
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		Date pickupDate = sdf.parse(sc.nextLine());
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		Date returnDate = sdf.parse(sc.nextLine());
		
		Rent rent = new Rent(pickupDate, returnDate);
		Invoice invoice = new Invoice(vehicle, rent);
		
		System.out.println(invoice);
		sc.close();
	}

}
