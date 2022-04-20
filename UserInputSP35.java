import java.util.*;
public class UserInputSP35{

	public static void main(String[] args) {
		
		int i,j,m=0,k=0;
		int row,column,mid1,mid2,mid3;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of row : ");
		row = scan.nextInt();

		System.out.println("Enter number of column : ");
		column = scan.nextInt();

		mid1 = (row+1)/2; // mid1 is middle of total row.
		mid2 = (mid1+1)/2; // mid2 is middle of top pattern.
		mid3 = mid1+mid2-1; // mid3 is middle of bottom pattern.

		for(i=1;i<=row;i++){
			if(i<=mid2)
				k++;
			else 
				k--;

			if(i>mid3)
				m--;
			else 
				m++;

			//System.out.println("m :" + m);
			for(j=1;j<=column;j++){
				if(j<=m-(mid1-1) || j>=(column+1)-k){
					System.out.print("* ");
				}
				else if(j==mid2 && (i>=mid2 && i<=mid3)){
					System.out.print("| ");
				}
				else 
					System.out.print("  ");				
			}
			System.out.println(" ");
		}
	}
}