package pack2;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class lab11 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter data(yyyy-mm-dd);");
			String input=sc.nextLine();//reads the full string which was given by us 
			LocalDate inputDate  =LocalDate.parse(input);
			LocalDate currentDate=LocalDate.now();
			//to convert input string into DATE we use parse 
			Period duration=Period.between(inputDate,currentDate);
			
			System.out.println("Duration from given date to today:");
			System.out.println("years:"+duration.getYears());
		
			System.out.println("months:"+duration.getMonths());
			System.out.println("days:"+duration.getDays());
			
			sc.close();
			
			
		
			
		
			
		
	}
}

		