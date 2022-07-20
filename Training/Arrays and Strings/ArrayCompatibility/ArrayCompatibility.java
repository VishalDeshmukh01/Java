import java.util.*;
public class ArrayCompatibility {
	
	
    static int compatible(int x1[], int x2[])
    {  int flag = 0;
       for(int i=0; i<x1.length; i++){
    	   if(x1[i]<x2[i]){
    		   flag=-1;
    		   break;
    	   }
       }
       return flag;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		defining size for array1
		System.out.println("Enter the size for First array:");
		int a1 = sc.nextInt();
		int array1[] = new int[a1];
		
//		reading array1 values
		if(a1>0){
			System.out.println("Enter the elements for First array:");
			for(int i=0;i<a1;i++){
				array1[i] = sc.nextInt();
			 }
		}
		else{
			System.out.println("Invalid array size");
		}
		
//		defining size for array2
		System.out.println("Enter the size for Second array:");
		int a2 = sc.nextInt();
		int array2[] = new int[a2];
		
//		reading array2 values
		if(a2>0){
			System.out.println("Enter the elements for Second array:");
			for(int i=0;i<a2;i++){
				array2[i] = sc.nextInt();
			}
		}else {
			System.out.println("Invalid array size");
		}
		
		
		
		if(a1!=a2){
			System.out.println("Arrays are Not Compatible");
		}else{
			int compatibilitycheck = compatible(array1,array2);
			if(compatibilitycheck == -1){
				System.out.println("Arrays are Not Compatible");
			}
			else
				System.out.println("Arrays are Compatible");
		}
			sc.close();
	}

}
