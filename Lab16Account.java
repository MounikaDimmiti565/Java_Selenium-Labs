package pack2;

public class Lab16Account {
	private static long Amount=500;
	private long accNum;
	private int balance;
	private String Personaccholder;
	
     public void  deposit(double amount) {
    	 if(amount>0) {
    		 balance+=amount;
    	 }
     }
    	 public void withdraw(double amount ) {
    		 if (balance -amount>=500) {
    			 balance-=amount;
    			 
    		 } else {
    			 System.out.println("Withdrawal failed less amount: "+accNum+".minimum balance should be 500");
    		 
    		 }
    	 
     }
    	 public void setBalance(double Balance) {
    	      this.balance=balance;
    	 }
    	 public void setAccHolder(Lab16person AccHolder) {
    		 this.Personaccholder=Personaccholder;
    	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab16person smith=new Lab16person();
		smith.setname("Smith");
		smith.setage(30);
        
		Lab16person kathy=new Lab16person();
		kathy.setname("kathy");
		kathy.setage(35);
		
		Lab16Account smithAccount =new Lab16Account();
		smithAccount.setBalance(2000);
		smithAccount.setAccHolder(smith);
		
		Lab16Account kathyAccount =new Lab16Account();
		kathyAccount.setBalance(3000);
		kathyAccount.setAccHolder(kathy);
		
		  smithAccount.deposit(2000);         
	      kathyAccount.withdraw(2000);  

	        // Display results
	        System.out.println("Updated account details:");
	        System.out.println(smithAccount);
	        System.out.println(kathyAccount);
	    }
		
		}

	