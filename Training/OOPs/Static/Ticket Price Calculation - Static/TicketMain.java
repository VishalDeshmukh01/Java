import java.util.*;
public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket tc = new Ticket();
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of bookings: ");
        int noOfbookings = sc.nextInt();
       
        System.out.println("Enter the available tickets: ");
        int noOfAvailableTickets = sc.nextInt();
        
        Ticket.getAvlTickets(noOfAvailableTickets);
        
         if(noOfbookings>0 &&  noOfAvailableTickets>0){
        
                while(noOfbookings-->0){
                	
                	
                	System.out.println("\nEnter the ticketid: ");
                	int ticketid = sc.nextInt();
                	System.out.println("Enter the price: ");
                	int price = sc.nextInt();
                	System.out.println("Enter the no of tickets: ");
                	int noOfTickets = sc.nextInt();
                	tc.getdata( ticketid,  price,  noOfTickets);
                	tc.setdata();
                    
                	
                }
        }  else
        	System.out.println("Invalid input entries\nNo of Bookings/Available Tickets\nEnter positive and valid entries");
	
	sc.close();
	}

}
