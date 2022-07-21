import java.util.*;
public class HostellerMain {
	
	public static Hosteller getHostellerDetails(){
			Scanner sc = new Scanner(System.in);
			Hosteller h1 = new Hosteller();  
			System.out.println("Enter the Details:");
			System.out.println("Student Id");
			int id = sc.nextInt();
			h1.setStudentId(id);

			System.out.println("Student Name");
			String name = sc.next();
			h1.setName(name);

			System.out.println("Department Id");
			int department = sc.nextInt();
			h1.setDepartmentId(department);

			System.out.println("Gender");
			String gender = sc.next();
			h1.setGender(gender);

			System.out.println("Phone Number");
			String phNo = sc.next();
			h1.setPhone(phNo);

			System.out.println("Hostel Name");
			String hostel = sc.next();
			h1.setHostelName(hostel);

			System.out.println("Room Number");
			int room = sc.nextInt();
			h1.setRoomNo(room);
			sc.close();

			return h1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Hosteller hstlr = new Hosteller();
			hstlr =	getHostellerDetails();
			
	        System.out.println("Modify Room Number");
	        String modifyroom = sc.next();

	        if (modifyroom.equals("y") || modifyroom.equals("Y")) {
	            System.out.println("New Room Number(Y/N)");
	            int roomnum = sc.nextInt();
	            hstlr.setRoomNo(roomnum);
	        }else{
	        	System.out.println(hstlr.getRoomNo());
	        	hstlr.setRoomNo(hstlr.getRoomNo());
	        }

	        System.out.println("Modify Phone Number(Y/N)");
	        String updatePhone = sc.next();

	        if (updatePhone.equals("y") || updatePhone.equals("Y")) {
	            System.out.println("New Phone Number");
	            String phNo = sc.next();
	            hstlr.setPhone(phNo);
	        }else{
	        	System.out.println(hstlr.getPhone());
	        	hstlr.setPhone(hstlr.getPhone());
	        }
	        
	        System.out.println("The Student Details");
	        System.out.println(hstlr.getStudentId()+" "+hstlr.getName()+" "+hstlr.getDepartmentId()+" "+hstlr.getGender()+" "+hstlr.getPhone()+" "+hstlr.getHostelName()+" "+hstlr.getRoomNo());
	        sc.close();
	}  

}
