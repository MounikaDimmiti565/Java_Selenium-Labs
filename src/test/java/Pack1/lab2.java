package Pack1;
import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("Enter Number:");
		Scanner sc =new Scanner(System.in);
		number=sc.nextInt();
		if(number % 2==0)
		{
			System.out.println("The Number is even");
			
		}
		else {
			System.out.println("the Number is odd");
		}
		
		

	}

}
