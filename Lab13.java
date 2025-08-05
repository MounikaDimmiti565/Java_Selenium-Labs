package pack2;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab13 {
	private long years;

	public void ProductDetails() {
		LocalDate purchase=purchaseDate();
		WarrantyPeriod(purchase);
		}
	private LocalDate purchaseDate() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter purchase date (yyyy-mm-dd):");
		String input = sc.nextLine();
		LocalDate date = LocalDate.parse(input);
		return date;
}


	private void WarrantyPeriod(LocalDate purchaseDate) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter warranty period (years):");
		int years = sc.nextInt();
		System.out.println("Enter warranty period (months):");
		int months = sc.nextInt();
		
	}

	

public static void main(String[] args) {
	Lab13 obj = new Lab13();
	obj.ProductDetails();
		
	}

}
