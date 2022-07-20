import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Id: ");
        int stdid = sc.nextInt();
        System.out.println("Enter Student's Name: ");
        String stdName = sc.next();
        System.out.println("Enter Student's address: ");
        String stdAddr = sc.next();
        String stdCollege;
        int flag = 0;
        
        while(flag==0){
        
		        System.out.println("Whether the student is from NIT(Yes/No): ");
		        String nitYN = sc.next(); 
		        
		        if(nitYN.equals("Yes") || nitYN.equals("YES") || nitYN.equals("yes")){
		        	Student st = new Student(stdid,stdName,stdAddr);
		        	flag=-1;
		        	st.setData();
		        }else if(nitYN.equals("No") || nitYN.equals("NO") || nitYN.equals("no")){
		        	
		        	System.out.println("Enter the college name: ");
		        	flag=-1;
		        	stdCollege = sc.next();
		        	Student st = new Student(stdid,stdName,stdAddr,stdCollege);
		        	st.setData();
		        }else{
		        	flag=0;
		        	System.out.println("Wrong Input");
		        }
        
        }
        sc.close();
        
	}

}
