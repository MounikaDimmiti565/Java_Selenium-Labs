package Pack1;

public class lab7 {

    enum Day {
		        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		    }

		    public static void main(String[] args) {
		        Day today = Day.FRIDAY;

		       
		        System.out.println("Today is:");
		       
		        switch (today) {
		            case MONDAY:
		                System.out.println("Monday");
		                break;
		            case FRIDAY:
		                System.out.println("Friday");
		                break;
		            case SUNDAY:
		                System.out.println("Sunday");
		                break;
		            case SATURDAY:
		            	System.out.println("Saturday");
		            	
		                
		            default:
		                System.out.println("Not mentioned");
		        }

		       
		        		


	}
}


