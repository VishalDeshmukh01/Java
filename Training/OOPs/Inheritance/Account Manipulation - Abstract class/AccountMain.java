import java.util.*;
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Check(1) using Constructor
//		public Customer(int customerId, String customerName, String emailId);
//      public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance)
//		  ----------------------
//		Customer customer = new Customer(101, "vishal", "vishal@gmail.com");
//		SavingsAccount savingsAccount = new SavingsAccount(1001, customer, 8000, 300);
//
//        if (savingsAccount.withdraw(7000)) 
//            System.out.println(savingsAccount.getBalance());
//        else
//        	System.out.println("Insufficient Funds");
//        -----------------------	
//    	Check(1) using Constructor	--Hard coded
        
//        Check(2) Dynamic Entries 
//        	using constructor
//		-------------------------------------
        	Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Account Details");
    		System.out.println("Enter Customer Details -");
    		System.out.println("Customer Id");
    		int custId = sc.nextInt();
    		System.out.println("Customer Name");
    		String custName = sc.next();
    		System.out.println("Email Id");
    		String custEmail = sc.next();
    		System.out.println("Account Number");
    		int acno = sc.nextInt();
    		System.out.println("Balance");
    		int bal = sc.nextInt();
    		System.out.println("Minimum Balance");
    		int minbal = sc.nextInt();
    		Customer customer = new Customer(custId, custName , custEmail);
    		SavingsAccount savingsAccount = new SavingsAccount(acno, customer, bal, minbal);
    		
    		System.out.println("Enter Withdrawl Amount");
    		int withdrawamt = sc.nextInt();
    		
    		if (savingsAccount.withdraw(withdrawamt)) 
              System.out.println("/nAvailable Balance - "+ savingsAccount.getBalance());
            else
          	  System.out.println("Insufficient Funds");
    		
//    		------------------------


	}

}
