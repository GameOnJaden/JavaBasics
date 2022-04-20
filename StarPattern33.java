public class StarPattern33{

	public static void main(String[] args) {
		
		int i, j,m=1,k;
		//char = 'A';

		for(i = 1; i <= 5; i++){
			if(i>=2){
				m = m + i;  // m = m+2(i-1)+i
				k = m;
			}
			else 
				k = 1;
			for(j = 1; j <=5; j++){

				if(j >= 6 - i){
					System.out.print(" " + k);
					k--;
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}