public class Ticket {
	
	private int ticketid;
	private int price;
	static private int availableTickets;
	private int ticketsNo;
	
	int setTicketID(){
		return ticketid;
	}
	int setAvlTickets(){
		return ticketid;
	}
	static void getAvlTickets(int availableTickets){
		Ticket.availableTickets=availableTickets;
	}
	void getdata(int ticketid, int price, int ticketsNo){
		this.ticketid=ticketid;
		this.price=price;
		
		this.ticketsNo = ticketsNo;
	}
	
	void setdata(){
		if(availableTickets<0 || ticketsNo<0 )
			System.out.println("Invalid Input");
		else{
			System.out.println("Available tickets: "+ setTicketID());
			System.out.println("Total amount: "+ calculateTicketCost(ticketsNo));
			System.out.println("Available ticket after booking: "+ setTicketID());
		}
	}
	
	public int calculateTicketCost(int noOfTickets){
		if(noOfTickets>=availableTickets)
			return -1;
		else{
			availableTickets-=noOfTickets;
			int totalamt = noOfTickets*price;
			return totalamt;
		}
	}

}
