import java.util.*;
public class UserInputSP36{

	public static void main(String[] args) {
		
		int i,j,m,row,column,mid;
		boolean k;
		char val = 'A';

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Number of Rows : ");
		row = scan.nextInt();

		column = 2*row-1;
		System.out.print("Number of Columns as per Rows are : " + column + "\n");

		//mid = (column+1)/2;

		System.out.println("Your Desired Pattern is : ");

		for(i = 1; i <= row; i++){
			k=true;
			m = 1;
			val = 'A';
			for(j = 1; j <=column; j++){
				if((j>=(row+1)-i && j<=(row-1)+i) && k){
					if(i%2==1){
						System.out.print(m%10);
						m++;
						k = false;
					}
					else {
						System.out.print(val);
						val++;
						k = false;
					}
				}
				else{
					System.out.print(" ");
					k = true;
				}
			}
			System.out.println(" ");
		}
	}
}