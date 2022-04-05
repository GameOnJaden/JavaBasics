public class StarPattern16{

	public static void main(String[] args) {
		
		int i,j,k;

		for(i=1;i<=7;i++){
			for(j=1;j<=7;j++){
				if(j>=1 && j<=8-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}