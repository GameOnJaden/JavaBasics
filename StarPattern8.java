public class StarPattern8{

	public static void main(String[] args) {
		
		int i,j,k;

		for(i=1;i<=4;i++){
			k=1;
			for(j=1;j<=7;j++){
				if(j>=5-i && j<= 3+i){
					System.out.print(k);
					//k = (j<4) ? k++ : k--;
					if(j<4)
						k++;
					else
						k--;

				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}