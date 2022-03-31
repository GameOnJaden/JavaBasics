import java.util.*;

public class FactorialOfN{

	public static void main(String[] args) {
		
		long fact = 1, n, i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to find it's factorial");
		n = sc.nextInt();

		for(i = n; i >= 1; i--){

			fact = fact * i;
		}

		System.out.println("Factorial of " + n + " is " + fact);
	}
}