import java.util.*;
public class StarPattern27{

	public static void main(String[] args) {
		
		int i,j,n=1,k=1,m=1;
		int row,mid;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		row = sc.nextInt();

		mid = (row+1)/2;
		System.out.println("Rows are " + row + " Mid is : " + mid);

		for(i=1;i<=row;i++){
			 if(i<=mid && i!=1){
					//System.out.println("m : " + m);
					k++;
				}
				else 
					k--;

			if(i==mid && m>=9){
				k=0;
			}
			if(i==mid+1)
				k=mid-2;
			//System.out.println("m : " + m);
			n = k;

			for(j=1;j<=row;j++){

				if(i<=mid){

					if(j>=(mid+1)-i && j<=(mid-1)+i){
						System.out.print(" " + n);

						if(((j==mid && n==0) && i!=1) || (n==0 && j>mid)){
							n=9;
						}
						else if(n==0 && j<mid){
							n++;

						}
						else if(n==9){
							if(j>=mid+1)
								n--;
							else 
								n=0;
						}
						else if(j>(mid-1))
								n--;

							else
								n++;
			
					}
					else 
						System.out.print(" " + " ");
				}
				else{
					if(j>=i-(mid-1) && j<=(mid+row)-i){
						System.out.print(" " + n);
						
						if(((j==mid && n==0) && i!=1) || (n==0 && j>mid)){
							n=9;
						}
						else if(n==0 && j<mid){
							n++;

						}
						else if(n==9){
							if(j>=mid+1)
								n--;
							else 
								n=0;
						}
						else if(j>(mid-1))
								n--;
							else
								n++;
						
					}
					else 
						System.out.print(" " + " ");
				}
			}
			System.out.println(" ");
			m=n+1;

		}
	}
}



/*if(n==9)
							n=0;
						else if(n==0)
							n=9;*/