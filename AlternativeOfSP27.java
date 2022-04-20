import java.util.*;
public class AlternativeOfSP27{

	public static void main(String[] args) {
		
		int i,j,row,mid,m=0,k=1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number rows : ");
		row = sc.nextInt();

		mid = (row+1)/2;

		for(i=1;i<=row;i++){

			//i<=n?m++:m--;
			if(i<=mid)
				m++;
			else 
				m--;
			k=m-1;

			for(j=1;j<=row;j++){

				if(j>=(mid+1)-m && j<=(mid-1)+m){
						System.out.print(" " + k%10);
						if(j>mid-1)
							k--;
						else
							k++;
					}
					else 
						System.out.print(" " + " ");
				
			}System.out.println(" ");
		}
	}
}

/*if(i<=3 && i!=1)
				k++;
			else 
				k--;

			n = k;
		////////////////////
			else{
					if(j>=i-2 && j<=8-i){
						System.out.print(n);
						if(j>2)
							n++;
						else
							n--;
					}
					else 
						System.out.print(" ");
				}*/