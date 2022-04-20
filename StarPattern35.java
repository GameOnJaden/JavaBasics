public class StarPattern35{

	public static void main(String[] args) {
		
		int i,j,m=0,k=0;

		for(i=1;i<=9;i++){
			if(i<=3)
				k++;
			else 
				k--;

			if(i>7)
				m--;
			else 
				m++;

			//System.out.println("m :" + m);
			for(j=1;j<=5;j++){
				if(j<=m-4 || j>=6-k){
					System.out.print("* ");
				}
				else if(j==3 && (i>=4 && i<=6)){
					System.out.print("| ");
				}
				else 
					System.out.print("  ");				
			}
			System.out.println(" ");
		}
	}
}