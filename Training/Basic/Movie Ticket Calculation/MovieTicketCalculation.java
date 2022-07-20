import java.util.*;
public class MovieTicketCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of ticket:");
		int noOfTickets = sc.nextInt();
		float totalTicketPrice=0f;
		float discountpercent = 0f;
		float coupondiscountpercent = 0f;
		float refreshmentprice = 0f;
		
		if(noOfTickets<5 || noOfTickets>40){
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
		
		if(noOfTickets>20){
			discountpercent = 0.1f; 
		}
		
		System.out.println("Do you want refreshment:");
		char refreshment = sc.next().charAt(0);
		if(refreshment == 'y'){
			refreshmentprice = noOfTickets*50;
		}
		
		System.out.println("Do you have coupon code:");
		char couponcode = sc.next().charAt(0);
		if(couponcode == 'y'){
			coupondiscountpercent = 0.02f;
		}
		
		System.out.println("Enter the circle:");
		char circle = sc.next().charAt(0);
		
		if(circle=='k'){
			totalTicketPrice= (noOfTickets*75*(1 - discountpercent)*(1 - coupondiscountpercent))+(refreshmentprice);
			System.out.printf("\nTicket Cost: %.2f",totalTicketPrice);
		}
		else if(circle=='q'){
			totalTicketPrice= (noOfTickets*150*(1 - discountpercent)*(1 - coupondiscountpercent))+(refreshmentprice);
			System.out.printf("\nTicket Cost: %.2f",totalTicketPrice);
		}
		sc.close();	
	}

}
