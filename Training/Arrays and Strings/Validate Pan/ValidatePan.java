import java.util.*;
public class ValidatePan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PAN no:");
		
		String panNo = sc.next();
		
		if(panNo.length()==10){
		
		int validationCheck = 0;
		int alphabetCheck=0;
		int numCheck=0;
		
		for(int i=0;i<5;i++){
			if(panNo.charAt(i)>='A' && panNo.charAt(i)<='Z')
				alphabetCheck+=1;
		}
		
		validationCheck+= (alphabetCheck == 5) ? 1 : 0;
		
		for(int i=5;i<9;i++){
			if(panNo.charAt(i)>=47 && panNo.charAt(i)<=58)
				numCheck+=1;
		}
		validationCheck+= (numCheck == 4) ? 1 : 0;
		
		if(panNo.charAt(9)>='A' && panNo.charAt(9)<='Z')
			validationCheck+=1;
		
		
		if(validationCheck == 3){
			System.out.println("Valid PAN no");
		}else{
			System.out.println("Invalid PAN no");
		}
		
		}
		
		else{
			System.out.println("Invalid PAN no:");
		}
		sc.close();
		
	}

}
