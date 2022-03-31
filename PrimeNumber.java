import java.util.*;

public class PrimeNumber{

	public static void main(String[] args) {
		
		int x,i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Which number you want to check is primr or not ?");
		x = sc.nextInt();

		for(i = 2; i <= x - 1; i++){

			if(x % i == 0){
				break;
			}

		}

		if(x == i){

			System.out.println(x + " is a prime number");
		}
		else{

			System.out.println(x + " is not a prime number. As it's divisible by " + i);

		}

	}

}

