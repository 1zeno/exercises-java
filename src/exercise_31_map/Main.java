package exercise_31_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> map = new HashMap<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String candidate = fields[0];
				int votes = Integer.parseInt(fields[1]);

				if(map.containsKey(candidate)) {
					map.put(candidate, map.get(candidate) + votes);
				} else {
					 map.put(candidate, votes);
				}

				line = br.readLine();
			}

			for(String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
