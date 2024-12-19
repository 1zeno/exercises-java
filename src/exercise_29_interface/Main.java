package exercise_29_interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		Integer installmentsNumber = sc.nextInt();
		
		ContractEntity contract = new ContractEntity(number, date, totalValue);
		ContractService contractService = new ContractService();
		contractService.processContract(contract, installmentsNumber);
		
		System.out.println("Parcelas:");
		for(InstallmentEntity item : contract.getInstallments()) {
			System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(item.getDueDate()) + " - " + String.format("%.2f", item.getAmount()));
		}
		
		sc.close();
	}
}
