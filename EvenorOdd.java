import java.util.*;

public class EvenorOdd{

	public static void main(String[] args) {
		
		int x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Which number you want to check is either even or odd");
		x = sc.nextInt();

		if(x % 2 == 0){

			System.out.println(x + " is even");

		}
		else{

			System.out.println(x + " is odd");
		}


	}
}

