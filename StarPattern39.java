public class StarPattern39{

	public static void main(String[] args) {
		
		int i,j,m=1,n=0,l=4,k=0;

		for(i=1;i<=5;i++){
			if(i>=3)
				l--;
			else 
				l = 4;

			k = l;
			if(i>=2){
				m = m+(7-i);
				n = m;
			}
			else 
				n = 1;
			for(j=1;j<=5;j++){

				if(j<=i){
					System.out.print(n);
					n = n-k;
					k++;
				}
				else{

					System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}