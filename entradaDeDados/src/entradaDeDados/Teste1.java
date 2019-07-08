package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your full name: ");
		String name = sc.next();
		sc.nextLine();
		String last = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int n1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product price: ");
		double n2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your last name, age and height (same line): ");
		last = sc.nextLine();
		int idade = sc.nextInt();
		sc.nextLine();
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.println(name);
		System.out.println(last);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(last);
		System.out.println(idade);
		System.out.println(height);
		sc.close();

	}

}
