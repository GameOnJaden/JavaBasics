public class StarPattern31{

	public static void main(String[] args) {
		
		int i,j,m=0;
		
		for(i=1;i<=5;i++){
			m = 1;
			if(i>=2 && i<4)
				m = i+1;
			if(i>=4)
				m = i+6;
			for(j=1;j<=9;j++){
				if(j<=2*i-1){
					if(j%2==0){
						System.out.print(" * ");
					}
					else{
						System.out.print("  " + m + "  ");
						if(i%2==0)
							m--;
						else 
							m++;
					}
				}
				else{
					System.out.print("  ");
				}
			}System.out.println(" ");
		}
	}
}