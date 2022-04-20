import java.util.*;
public class StarPattern40{

	public static void main(String[] args) {
		
		int i,j,row,k=0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of rows : ");
	 	row = scan.nextInt();

	 	for(i=1;i<=row;i++){
	 		k = 0;
	 		for(j=1;j<=i;j++){
	 			System.out.print(k + " ");
	 			k = k+i-1;
	 		}
	 		System.out.println(" ");
	 	}
	}
}