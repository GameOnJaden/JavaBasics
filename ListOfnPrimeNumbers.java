import java.util.*;

public class ListOfnPrimeNumbers{

	public static void main(String[] args) {
		
		int n, i, j;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many prime numbers you want ?");
		n = sc.nextInt();

		System.out.println("List of first " + n + " prime numbers are :");

		for(i = 2; i <= n; i++){

			for(j = 2; j <= i; j++){

				if(i % j == 0){
					break;
				}
			}

			if(i == j){

				System.out.print(i + " ");
			}
		}
	}
}