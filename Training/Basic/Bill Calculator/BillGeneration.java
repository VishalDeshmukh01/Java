import java.util.*;
public class BillGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Scanner myObj = new Scanner(System.in);

	    
      System.out.println("Enter the no of pizzas bought:");
      int pizzaNo = myObj.nextInt();
      
      System.out.println("Enter the no of puffs bought:");
      int puffsNo = myObj.nextInt();
      
      System.out.println("Enter the no of cool drinks bought:");
      int drinksNo = myObj.nextInt();
      
      System.out.println("Bill Details\n" + "No of pizzas: " + pizzaNo + "\nNo of puffs: " + puffsNo + "\nNo of cooldrinks: " + drinksNo );
      
      int totalprice = (pizzaNo*100) + (puffsNo*20) + (drinksNo*10);
      
      System.out.println("\nTotal price= " + totalprice + "\nENJOY THE SHOW!!!");
 	
	}

}
