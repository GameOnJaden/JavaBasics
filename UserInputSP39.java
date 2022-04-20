import java.util.*;
public class UserInputSP39{

	public static void main(String[] args) {
		
		int i,j,m=1,n=0,l,k=0;
		int row;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of rows : ");
		row = scan.nextInt();
		l = row-1;

		for(i=1;i<=row;i++){
			if(i>=3)
				l--;
			else 
				l = row-1;

			k = l;
			if(i>=2){
				m = m+((row+2)-i);
				n = m;
			}
			else 
				n = 1;
			for(j=1;j<=row;j++){

				if(j<=i){
					System.out.print(n);
					n = n-k;
					k++;
				}
				else{

					System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}