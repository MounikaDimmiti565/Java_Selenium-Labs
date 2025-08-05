package pack2;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data(yyyy-mm-dd);");
		String input1=sc.nextLine();
		LocalDate Date1= LocalDate.parse(input1);
		
		System.out.println("Enter data(yyyy-mm-dd);");
		String input2=sc.nextLine();
		LocalDate Date2= LocalDate.parse(input2);
	Period duration;
		if (Date1.isAfter(Date2)) {
			 duration = Period.between(Date2, Date1);
			
		} else {
			 duration = Period.between(Date1, Date2);
			
		}
		
	System.out.println("Duration from given date to today:");
	System.out.println("Days:"+duration.getDays());
    System.out.println("Months:"+duration.getMonths());
    System.out.println("Years:"+duration.getYears());
		
		
		sc.close();
	
	}

}
