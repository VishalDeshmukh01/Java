public class Student {
	private int studentId;
	private String studentName, studentAddress, collegeName; 
	
	Student(int studentId, String studentName, String studentAddress){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}
	Student(int studentId, String studentName, String studentAddress, String collegeName){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	
	void setData(){
		
		System.out.println("Student id: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Address: " + studentAddress);
		System.out.println("College Name: " + collegeName);
	  
	}
}
