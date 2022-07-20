import java.util.*;
public class LeastOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of products");
		int noOfProducts = sc.nextInt();
		sc.nextLine();
		
		String[] list = new String[noOfProducts]; //data of products
		String[][] listItems = new String[noOfProducts][3]; // [0] [mobile,20000,10]
		
		for(int i=0;i<noOfProducts;i++){
			list[i]=sc.nextLine();
			listItems[i]=list[i].split(",");
		}
		
		for(int i=0;i<noOfProducts;i++){
			System.out.print(list[i]);
		}
		
		double discount[] = new double [noOfProducts] ;
		
		for(int i=0;i<noOfProducts;i++){
			discount[i]=(Integer.parseInt(listItems[i][1])*Integer.parseInt(listItems[i][2]))*0.01;
		}
		
		double min = discount[0];
		String output = new String();
		
		for(int i=0;i<noOfProducts;i++){
			if(min>discount[i]){
				min=discount[i];
			}
		}
		
		for(int i=0;i<list.length;i++)
        {
            if(discount[i]==min)
            {
                output=output+listItems[i][0]+",";
            }
        }
        
        System.out.println(output);
        sc.close();
	}

}
