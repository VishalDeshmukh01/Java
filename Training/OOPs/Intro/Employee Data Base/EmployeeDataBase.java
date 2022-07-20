
public class EmployeeDataBase {
   private String empNo;
   private String empName;
   private float basicSal;
   private float da;
   private float hra;
   private float pf;
   private float netSal;
   
   void setData(String eno, String ename, float bsal){
	    empNo = eno;
	    empName = ename;
	    basicSal = bsal;
   }
   
   void calData(){
	    da = basicSal*0.05f;
	    hra =basicSal*0.06f;
	    pf = basicSal*0.04f;
	    netSal = basicSal + da + hra - pf;
   }
   
   void showData(){
	   
	   System.out.printf("\nDear %s Employee no %s \nPlease follow below details for allowance and deductions",empName,empNo);
	   System.out.printf("\nda = %.2f",da);
	   System.out.printf("\nhra = %.2f",hra);
	   System.out.printf("\npf = %.2f",pf);
	   System.out.printf("\nnetSal = %.2f",netSal);
	   
   }
   
}
