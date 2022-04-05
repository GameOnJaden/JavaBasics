public class StarPattern18{

	public static void main(String[] args) {
		
		int i,j;

		for(i=1;i<=9;i++){
			for(j=1;j<=5;j++){
				if(i>=6){
					if(j>=i-4){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				else{
					if(j>=6-i){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
			}System.out.println(" ");
		}
	}
}