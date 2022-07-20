import java.util.*;
public class HighestPlacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the no of students placed in CSE: ");
		int cse = sc.nextInt();
		System.out.println("Enter the no of students placed in ECE: ");
		int ece = sc.nextInt();
		System.out.println("Enter the no of students placed in MECH: ");
		int mech = sc.nextInt();
		
		if(cse<0 || ece<0 || mech<0){
			System.out.println("Input is Invalid");
		}else if(cse==0 || ece==0 || mech==0){
			System.out.println("None of the department has got the highest placement");
		}else{
		
		int placementData[] = {cse,ece,mech};
		String placementBranch = new String();
		
		placementBranch+="\nHighest Placement";
		
		int max=Arrays.stream(placementData).max().getAsInt(); //returns max value from placementData
		
//	    empty else so that it don't skip the other if conditions
		
		if(max==cse)
			placementBranch+="\nCSE";
		else{/*empty else*/}
		
		
		if(max==ece)
			placementBranch+="\nECE";
		else{/*empty else*/}
		
		
		if(max==mech)
			placementBranch+="\nMECH";
		else{/*empty else*/} 


		
		System.out.println(placementBranch);
		}
		sc.close();
	}

}
