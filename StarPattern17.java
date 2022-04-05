public class StarPattern17{

	public static void main(String[] args) {
		
		int i,j,n,k=7;

		for(i=1;i<=7;i++){
			if(i<=7){        // Alerternative k=7-i; no need of 4th variable.
				k--;
			}
			n = k;
			for(j=1;j<=7;j++){
				if(j<=8-i){
					System.out.print(" " + n);
					n--;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			
		}
	}
}