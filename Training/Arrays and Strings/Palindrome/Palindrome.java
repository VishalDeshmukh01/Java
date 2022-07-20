import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word :");
		String input = sc.next();
		int stringlength = input.length();
		int len=0;
		
		for(int j=0;j<stringlength;j++){
			if((input.charAt(j)>='A' && input.charAt(j)<='Z') || (input.charAt(j)>='a' && input.charAt(j)<='z' || input.charAt(j)>=47 && input.charAt(j)<=58) ){
				len++;
			}else
				break;	
		}
		
		if(len==stringlength){
		int flag = 0;
		for(int i=0;i<stringlength/2;i++){
			if(input.charAt(i)!=input.charAt((stringlength-1)-i)){
				flag=-1;
			}
		}
		
		if(flag==-1)
			System.out.printf("\n%s is not a Palindrome",input);
		else
			System.out.printf("\n%s is a Palindrome",input);
		}
		else 
			System.out.printf("Invalid Input");
		
		
		sc.close();

	}

}
