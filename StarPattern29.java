public class StarPattern29{

	public static void main(String[] args) {
		
		int i,j;
		char k,value = '@';

		for(i=1;i<=5;i++){
			value++;
			k = value;
			for(j=1;j<=5;j++){
				if(j<=i){
					System.out.print(k);
					k--;
				}
				else{
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}