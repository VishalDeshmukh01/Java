import java.util.*;
public class EmployeeDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeDataBase eb = new EmployeeDataBase();
		
			System.out.println("Enter Employee Details \nEmployee No: ");
		    String emplNo = sc.nextLine();
		    System.out.println("Employee Name: ");
		    String emplName = sc.nextLine();
		    System.out.println("Basic Salary: ");
		    float BasicSal = sc.nextFloat();
		    
		    eb.setData(emplNo,emplName,BasicSal);
		    eb.calData();
		    eb.showData();
		    sc.close();

	}

}
