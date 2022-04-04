public class StarPattern13{

	public static void main(String[] args) {
		
		int i,j,k=0;

		for (i=1; i<=7; i++ ) {
			if(i<=4)
				k=i;
			else 
				k--;

			for(j=1; j<=7; j++){

				if(j>=5-k && j<=3+k){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
			
		}
	}
}


/* if(i<=4){

					if(j>=5-i && j<=3+i){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}

				}
				else if(j>=i-3 && j<= 5*+i){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						} */