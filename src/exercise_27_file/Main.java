package exercise_27_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String readPath = "c:\\temp\\itens.csv";
		String writePath = "c:\\temp\\out\\summary.csv";
		List<Product> products = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(readPath))) {
			String line = br.readLine();
			while (line != null) { 
				String[] item = line.split(",");
				String name = item[0];
				Double price = Double.parseDouble(item[1]);
				Integer amount = Integer.parseInt(item[2]);
				Product product = new Product(name, price, amount);
				products.add(product);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		boolean success = new File("c:\\temp\\out").mkdir();
		if(success) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(writePath, true))) {
				for (Product item : products) {
					bw.write(item.getName() + "," + item.getPrice() * item.getAmount());
					bw.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
