import java.util.*;
public class HighestMarkInEachSemester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of semester:");
		int noOfSemester = sc.nextInt();
		if(noOfSemester<0)
			System.exit(0);
		
		
		int noOfSubjectsofSem[] = new int[noOfSemester];
		int highestmark[] = new int[noOfSemester];
		
		for(int i = 0; i<noOfSemester; i++){
			System.out.printf("\nEnter no of subjects in %d semester: ", i+1 );
			noOfSubjectsofSem[i] =sc.nextInt();
			if(noOfSubjectsofSem[i]<0)
				System.exit(0);
		}
		
		for(int i = 0; i<noOfSemester; i++){
			System.out.printf("\nMarks obtained in semester %d:\n",i+1);
			int max=0;
			int marks[] = new int[noOfSubjectsofSem[i]];
			for(int j=0;j<noOfSubjectsofSem[i];j++){
				
				marks[j]=sc.nextInt();
				if(noOfSubjectsofSem[i]<0)
					System.exit(0);

				if(max<marks[j])
					max=marks[j];

			}
			
			highestmark[i] = max;
		}		
		for(int i = 0; i<noOfSemester; i++){
			System.out.printf("Maximum mark in %d semester: %d",i+1, highestmark[i]);
		}
    
    sc.close();
	}

}
