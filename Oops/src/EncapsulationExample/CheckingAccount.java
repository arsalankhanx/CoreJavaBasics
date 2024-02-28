package EncapsulationExample;

public class CheckingAccount 
{
     private double balance=0;

     public double getBalance()
   {
	   return balance;
   }

     public void setBalance(double balance) 
   { 
	 this.balance = balance;
   }
     
     public static void main(String[]args)
 {
	System.out.println("Start my encapsulation...");
	
	CheckingAccount myAccount = new CheckingAccount();
	
	myAccount.setBalance(58.21);
	
	System.out.println("Balance="+myAccount.getBalance());
 }
}
