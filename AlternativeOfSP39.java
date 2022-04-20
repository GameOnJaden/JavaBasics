import java.util.*;
public class AlternativeOfSP39{

	public static void main(String[] args) {
		
		int i,j,row,k,m=1;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Number of Row : ");
		row = scan.nextInt();

		for(i=1;i<=row;i++){
			k=m;
			for(j=1;j<=i;j++){
				System.out.print(k);
				k = k-row+(i-j);
			}
			m = m+(row+1)-i;
			System.out.println(" ");
		}
	}
}