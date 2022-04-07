public class StarPattern23{

	public static void main(String[] args) {
		
		int i,j,k;
		char l = 'A';

		for(i=1;i<=4;i++){
			k=1;
			l='A';
			for(j=1;j<=8;j++){
				if(j>=5){
					if(j<=4+i){
						System.out.print(k); // if(j>=5-i && j<=4+1){ if(j==5){ k='1' }  print(k); k++ }
						k++;
					}
					else
						System.out.print(" ");
				}
				else{
					if(j>=5-i){
						System.out.print(l);
						l++;
					}
					else
						System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}