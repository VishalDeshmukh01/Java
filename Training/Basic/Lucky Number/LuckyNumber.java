import java.util.*;
public class LuckyNumber {
	
    static int countDigit(int n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
    
    static int luckyenough(int x)
    {
        int islucky = 0;
        
        int sum = 0;
        
        while (x != 0) {
            sum+= x % 10;
            x = x / 10;
        }
        
        if(sum%3==0 || sum%5==0 || sum%7==0){
        	islucky=1;
        }
        return islucky;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the car no:");
		
	    int luckyno = sc.nextInt();
	    int noOfDigit = countDigit(luckyno);
	    int isluckyno = luckyenough(luckyno);
	    
	    
	    
	    if(luckyno<0 || noOfDigit !=4){
	    	System.out.printf("\n%d is not a valid car number",luckyno);
	    }
	    
	    else if(isluckyno==0 ){
	    	System.out.println("Sorry its not my lucky number");
	    }
	    
	    else{
	    	System.out.println("Lucky Number");
	    }
	    sc.close();

	}

}
