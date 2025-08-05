package pack2;


	import java.time.ZonedDateTime;
import java.time.ZoneId;


	public class Lab14 {
	    public static void main(String[] args) {
	        ZonedDateTime z= ZonedDateTime.now(ZoneId.of( "Asia/Kolkata"));
	        System.out.println("Current time in India:"+z);
	        
	    }
	}

