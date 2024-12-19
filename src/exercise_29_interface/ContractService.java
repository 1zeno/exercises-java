package exercise_29_interface;

import java.time.LocalDate;

public class ContractService {

	public void processContract(ContractEntity contract, Integer months) {

		PaypalService paypalService = new PaypalService();
		for (int i = 1; i <= months; i++) {
			Double price = contract.getTotalValue() / months;
			price += paypalService.interest(price, i);
			price += paypalService.paymentFee(price);
			LocalDate date = contract.getDate().plusMonths(i);
			InstallmentEntity installment = new InstallmentEntity(date, price);
			contract.getInstallments().add(installment);
		}
	}
}
