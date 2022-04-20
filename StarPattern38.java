public class StarPattern38{

	public static void main(String[] args) {
		
		int i,j;
		char value = 'A';

		for(i=1;i<=4;i++){
			value = 'A';
			for(j=1;j<=7;j++){

				if(j<=5-i || j>=3+i){
					System.out.print(value);
					
				}
				else{

					System.out.print(" ");

				}
				value++;
			}System.out.println(" ");
		}
	}
}