package Pack1;
import java.util.Scanner;



public class Person {
		String FirstName;
		String LastName;
		int Age;
		String PhoneNumber;
		
		
		

		public  Person() {
			
		}
		public Person(String FirstName,String LastName,int Age) {
			this.FirstName=FirstName;
			this.LastName=LastName;
			this.Age=Age;
			
		}
		public String getFirstName() {
			return FirstName;
			
	    }
		public void setFirstName(String FirstName) {
			this.FirstName=FirstName;
		}
		public String getLastName() {
			return LastName;
			
	    }
		public void setLastName(String LastName) {
			this.LastName=LastName;
		}
		public int getAge() {
			return Age;
			
	    }
		public void setAge(int Age) {
			this.Age=Age;
		}
		public String PhoneNumber() {
			return PhoneNumber;
			
	    }
		public void setPhoneNumber(String PhoneNumber) {
			this.PhoneNumber=PhoneNumber;
		}
		void PhoneNumber1()
	    {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("PhoneNumber:"+PhoneNumber);
		   PhoneNumber = sc.nextLine();
		   
}
		public void displayPhoneNumber2() {
			System.out.println("Phone Number:"+9999);
		}
	
			
	        
			
			
		}
		
		
		
		

	


