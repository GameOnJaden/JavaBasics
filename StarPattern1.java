public class StarPattern1{

	public static void main(String[] args) {
		
		int i, j;

		for(i = 1; i <= 5; i++){
			for(j = 1; j <=5; j++){

				if(j <= i){

					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" "); // here due to ln and /n we are getting 2 line gaps, hence for /t,/b it's working. 
									 //ln has done the work. 
									 //System.out.println(" "); or System.out.print("\n");(Both are same).
		}
	}
}