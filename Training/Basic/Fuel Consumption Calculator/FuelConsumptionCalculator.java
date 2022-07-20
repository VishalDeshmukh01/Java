import java.util.*;
public class FuelConsumptionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
         System.out.println("Enter the no of liters to fill the tank");
         float petrolQty = sc.nextFloat();
         
         System.out.println("Enter the distance covered");
         float distance = sc.nextFloat();
         
         float petrolPer100Litre, milesPerGallon;
         petrolPer100Litre= (petrolQty/distance)*100;
         milesPerGallon = (distance*0.6214f)/(petrolQty*0.2642f);
         
         if(petrolQty<0){
        	 System.out.println(petrolQty + " is an Invalid Input");
         }
         else if(distance<0){
        	 System.out.println(distance + " is an Invalid Input");
         }
         else{
        	 System.out.println("Liters/100KM");
        	 System.out.printf("%.2f", petrolPer100Litre);
        	 System.out.println("\nMiles/gallons");
        	 System.out.printf("%.2f", milesPerGallon);
        	 
         }
    
    sc.close();
	}

}
