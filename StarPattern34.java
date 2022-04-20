public class StarPattern34{

	public static void main(String[] args) {
		
		int i, j,m=65,k;
		char value = 'A';

		for(i = 1; i <= 5; i++){
			if(i>=2){
				m = m + i;
				value = (char)m;
			}
			else 
				value = 'A';
			for(j = 1; j <=5; j++){

				if(j >= 6 - i){
					System.out.print(" " + value);
					value--;
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}