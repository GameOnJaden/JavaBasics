public class StarPattern30{

	public static void main(String[] args) {
		
		int i,j,m=0;
		
		for(i=1;i<=4;i++){
			m = i;
			for(j=1;j<=7;j++){
				if(j>=5-i && j<=3+i){
					System.out.print(m);
					if(j>=4)
						m++;
					else 
						m--;
				}
				else{
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}