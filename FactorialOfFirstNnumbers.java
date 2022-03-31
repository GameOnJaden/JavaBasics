import java.util.*;

public class FactorialOfFirstNnumbers{

	public static void main(String[] args) {
		
		long fact = 1, n, i,j;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to find it's factorial");
		n = sc.nextInt();

		System.out.println("Factorial of first " + n + " numbers are :");

		for(i = n; i >= 1; i--){

			fact = 1;
			for(j = i; j >= 1; j--){

				fact = fact * j;
			}

			System.out.println("Factorial of " + i + " is " + fact);
		}
	}
}