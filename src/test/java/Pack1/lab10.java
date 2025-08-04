package Pack1;

import java.util.Scanner;

public class lab10 {
	

		    public static boolean isPositiveString(String input) {
		       
		        input = input.toUpperCase();

		        for (int i = 0; i < input.length() - 1; i++) {
		            if (input.charAt(i) >= input.charAt(i + 1)) {
		                return false; 
		            }
		        }
		        return true;
		    }

		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter a string:");
		        String test1 = sc.next();
		       

		        System.out.println(test1 + " is positive: " + isPositiveString(test1)); 	       
	}
}


