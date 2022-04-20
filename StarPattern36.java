public class StarPattern36{

	public static void main(String[] args) {
		
		int i,j,m;
		boolean k;
		char val = 'A';

		for(i = 1; i <= 4; i++){
			k=true;
			m = 1;
			val = 'A';
			for(j = 1; j <=7; j++){
				if((j>=5-i && j<=3+i) && k){
					if(i%2==1){
						System.out.print(m);
						m++;
						k = false;
					}
					else {
						System.out.print(val);
						val++;
						k = false;
					}
				}
				else{
					System.out.print(" ");
					k = true;
				}
			}
			System.out.println(" ");
		}
	}
}