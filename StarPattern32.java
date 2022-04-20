public class StarPattern32{

	public static void main(String[] args) {
		
		int i, j,m=0,k;

		for(i = 1; i <= 5; i++){
			if(i>=2)
				k = i+1;
			else 
				k = 1;
			for(j = 1; j <=5; j++){

				if(j >= 6 - i){
					System.out.print(k);
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