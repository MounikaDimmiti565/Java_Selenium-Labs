package pack2;
import java.time.LocalDate;
import java.time.Period;


public class Lab15 {
	String firstName="Mounika";
	String lastName="Dimmiti";
	LocalDate dob=LocalDate.of(2003,01, 20);
	
	public void printDetails() {
		String fullName=firstName+" "+lastName;
		int age=Period.between(dob, LocalDate.now()).getYears();
		
		System.out.println("Full Name: "+fullName);
		System.out.println("Age: "+age);
	}
		public static void main(String[]args) {
			Lab15 a=new Lab15();
			  a.printDetails();
			  
		}
		
		
		
		
	}


