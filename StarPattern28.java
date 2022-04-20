public class StarPattern28{

	public static void main(String[] args) {
		
		int i,j,n,k=1;

		for(i=1;i<=11;i++){
			if(i<=6 && i!=1)
				k++;
			else 
				k--;

			n = k;

			for(j=1;j<=11;j++){

				if(i<=6){

					if(j>=7-i && j<=i+5){
						System.out.print(n%10);
						if(j>5)
							n++;
						else
							n--;
					}
					else 
						System.out.print(" ");
				}
				else{
					if(j>=i-5 && j<=17-i){
						System.out.print(n%10);
						if(j>5)
							n++;
						else
							n--;
					}
					else 
						System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}