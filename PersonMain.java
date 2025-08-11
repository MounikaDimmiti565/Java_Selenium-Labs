package Pack1;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Person p = new Person("Mounika","Dimmiti",22);
		
		System.out.println("Person Details");
		System.out.println("-----------------");
		System.out.println("FirstName: " + p.getFirstName());
		System.out.println("LastName: " + p.getLastName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Enter mobile number:");
		p.displayPhoneNumber2();
		

		

	}
}


